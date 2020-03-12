package com.github.gpluscb.ggjava.internal;

import com.github.gpluscb.ggjava.api.RateLimiter;

import javax.annotation.Nonnegative;
import javax.annotation.Nonnull;
import javax.annotation.Nullable;
import java.util.*;
import java.util.concurrent.CompletableFuture;
import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;
import java.util.function.IntFunction;

public class BucketRateLimiter implements RateLimiter {
	@Nonnegative
	public static final int DEFAULT_TASKS_PER_PERIOD = 80;
	@Nonnegative
	public static final long DEFAULT_PERIOD = 61 * 1000; // For some dumb reason it appears to be actually 80/61s not 80/60s

	private boolean isShutDown;

	@Nonnull
	private final ScheduledExecutorService scheduler;

	@Nonnull
	private final Queue<IntFunction<CompletableFuture<Boolean>>> tasks;

	@Nonnull
	private final Deque<Long> taskCompletionTimes;

	@Nonnull
	private final List<Backoff> backoffList;

	@Nonnegative
	private final int tasksPerPeriod;
	@Nonnegative
	private final long period;

	@Nonnegative
	private final long initialExponentialBackoff;

	@Nonnegative
	private int numRetries;

	public BucketRateLimiter(@Nonnegative @Nullable Integer tasksPerPeriod, @Nonnegative @Nullable Long period) {
		this.tasksPerPeriod = tasksPerPeriod == null ? DEFAULT_TASKS_PER_PERIOD : tasksPerPeriod;
		this.period = period == null ? DEFAULT_PERIOD : period;

		isShutDown = false;
		scheduler = Executors.newSingleThreadScheduledExecutor(r -> new Thread(r, "RequestScheduler"));

		tasks = new LinkedList<>();
		taskCompletionTimes = new LinkedList<>();
		backoffList = new ArrayList<>();

		initialExponentialBackoff = this.period / this.tasksPerPeriod;

		numRetries = 0;
	}

	public BucketRateLimiter() {
		this(null, null);
	}

	@Override
	public void enqueue(@Nonnull IntFunction<CompletableFuture<Boolean>> task) {
		if (isShutDown)
			throw new IllegalStateException("Trying to request while requester shut down");

		// Don't want the processing status to change
		boolean notProcessing;
		synchronized (tasks) {
			// Already processing tasks if tasks is not empty
			notProcessing = tasks.isEmpty();

			tasks.offer(task);
			// From here our task is guaranteed to be handled if it is processing, so we can leave lock here
		}

		// If already processing, the task will be scheduled automatically (see #nextTask)
		if (notProcessing)
			scheduleTask(requestWaitTime(requestCumulativeBackoff()));
	}

	private void scheduleTask(@Nonnegative long waitTime) {
		IntFunction<CompletableFuture<Boolean>> task = tasks.peek();
		assert task != null; // To stop null analysis from whining

		try {
			scheduler.schedule(() -> completeTask(task), waitTime, TimeUnit.MILLISECONDS);
		} catch (Throwable t) {
			System.err.print("Error scheduling request, shutting down: ");
			t.printStackTrace();

			shutdown();
		}
	}

	private void completeTask(@Nonnull IntFunction<CompletableFuture<Boolean>> task) {
		task.apply(numRetries).whenComplete((reschedule, t) -> {
			if (t != null) {
				System.err.print("Exception occurred during task execution, not rescheduling: ");
				t.printStackTrace();
				reschedule = false;
			} else if (reschedule == null) {
				System.err.println("Task returned null, not rescheduling");
				reschedule = false;
			}

			// Store time after task completion for safety (time response -> request should be within the limits because else fluctuations in ping could put us into rate limit territory from the servers perspective)
			taskCompletionTimes.offer(System.currentTimeMillis());

			// Keep the earliest element at numTasks before the next one
			if (taskCompletionTimes.size() > tasksPerPeriod)
				taskCompletionTimes.remove();

			long cumulativeBackoff = requestCumulativeBackoff();

			if (reschedule)
				handleRateLimit(cumulativeBackoff);
			else
				handleTaskSuccess(cumulativeBackoff);
		});
	}

	// The cycle goes #enqueue -(only if the rest of the chain is not going on already)> #scheduleTask -> #nextTask -> #scheduleTask -> etc.
	// In no situation should two handleResponse be running at the same time, so we don't have to worry about concurrency in that regard
	private void handleTaskSuccess(@Nonnegative long cumulativeBackoff) {
		// No rate limits hit, so we can reset the numRetries
		numRetries = 0;

		// Don't want #enqueue to check isEmpty after remove and before we do here, else: remove -> request checks is empty (true, thinks processing stopped) -> adds own request -> calls #scheduleTask -> we check if is empty (false, meaning processing won't stop) -> we call #scheduleTask
		synchronized (tasks) {
			// Remove corresponding task from queue
			tasks.remove();

			// Stop if no more tasks are present
			if (tasks.isEmpty())
				return;
		}

		scheduleTask(requestWaitTime(cumulativeBackoff));
	}

	private void handleRateLimit(@Nonnegative long cumulativeBackoff) {
		long exponentialBackoff = requestExponentialBackoff();

		boolean didNumTasksAlready = completionTimesFilled();

		// We hit a rate limit, backing off, either through a new cumulative backoff or if that is not possible to a simple exponential backoff
		long backoff = didNumTasksAlready ? requestNewCumulativeBackoff(cumulativeBackoff, exponentialBackoff) : exponentialBackoff;

		// Our taskCompletionTimes are off, we will assume they are wrong by the backoff amount. Adding backoff to all of these times (see #peekCompletionTimesRespectingCumulative) so everything will shift by backoff
		Backoff newCumulativeBackoff = new Backoff(backoff);
		backoffList.add(newCumulativeBackoff);

		// Adding the newly requested cumulative backoff
		cumulativeBackoff += newCumulativeBackoff.requestBackoffTime();

		// Don't remove task, redo it after the backoff
		// The backoff is respected in cumulative backoff list, so in requestWaitTime as well but only if this condition is met
		if (didNumTasksAlready)
			scheduleTask(requestWaitTime(cumulativeBackoff));
			// Else requestWaitTime has no way to respect the backoffList, so we back off manually by our exponential backoff
		else
			scheduleTask(backoff);

		// Print after schedule to have as few instructions as possible between request of backoff time and scheduling
		// Printing exponentialBackoff because the task will always be scheduled after that much time
		System.err.printf("Backing off for %dms%n", exponentialBackoff);
	}

	@Nonnegative
	private long requestWaitTime(@Nonnegative long cumulativeBackoff) {
		// If we did not do numTasks tasks yet, there is nothing to worry about
		if (!completionTimesFilled())
			return 0;

		long current = System.currentTimeMillis();

		long tasksPerPeriodBefore = peekCompletionTimesRespectingCumulative(cumulativeBackoff);

		long nextOpportunity = tasksPerPeriodBefore + period;

		return Math.max(nextOpportunity - current, 0);
	}

	@Nonnegative
	private long requestNewCumulativeBackoff(@Nonnegative long alreadyCumulativeBackoff, @Nonnegative long exponentialBackoff) {
		// Our goal is: taskPerPeriodBefore + backoff + period = current + exponentialBackoff
		long current = System.currentTimeMillis();

		long nextOpportunity = current + exponentialBackoff;

		long tasksPerPeriodBefore = peekCompletionTimesRespectingCumulative(alreadyCumulativeBackoff);

		// Follows from formula described above
		return nextOpportunity - period - tasksPerPeriodBefore;
	}

	private long requestExponentialBackoff() {
		return initialExponentialBackoff * (2 ^ numRetries++);
	}

	private long requestCumulativeBackoff() {
		long cumulativeBackoff = 0;
		for (int i = 0; i < backoffList.size(); i++) {
			Backoff backoff = backoffList.get(i);

			cumulativeBackoff += backoff.requestBackoffTime();

			// Remove if no longer valid
			if (!backoff.isValid())
				backoffList.remove(i--);
		}

		return cumulativeBackoff;
	}

	private long peekCompletionTimesRespectingCumulative(@Nonnegative long cumulativeBackoff) {
		Long tasksPerPeriodBefore = taskCompletionTimes.peek();
		assert tasksPerPeriodBefore != null; // To stop null analysis from whining

		return tasksPerPeriodBefore + cumulativeBackoff;
	}

	private boolean completionTimesFilled() {
		return taskCompletionTimes.size() >= tasksPerPeriod;
	}

	@Nonnull
	@Override
	public CompletableFuture<Void> shutdown() {
		isShutDown = true;

		// TODO: More beautiful
		return CompletableFuture.supplyAsync(() -> {
			try {
				while (!tasks.isEmpty())
					Thread.sleep(50);

				scheduler.shutdown();
			} catch (InterruptedException e) {
				e.printStackTrace();
			}

			return null;
		});
	}

	@Override
	public boolean isShutDown() {
		return isShutDown;
	}

	private class Backoff {
		@Nonnegative
		private final long backoffTime;
		@Nonnegative
		private int counter;

		public Backoff(@Nonnegative long backoffTime) {
			this.backoffTime = backoffTime;
			counter = tasksPerPeriod;
		}

		@Nonnegative
		public long requestBackoffTime() {
			counter--;
			return backoffTime;
		}

		public boolean isValid() {
			return counter > 0;
		}
	}
}
