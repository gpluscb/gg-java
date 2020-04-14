package com.github.gpluscb.ggjava.internal;

import com.github.gpluscb.ggjava.api.RateLimiter;

import javax.annotation.Nonnegative;
import javax.annotation.Nonnull;
import javax.annotation.Nullable;
import java.util.LinkedList;
import java.util.Queue;
import java.util.concurrent.CompletableFuture;
import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;
import java.util.function.IntFunction;

public class SimpleRateLimiter implements RateLimiter {
	public static final long DEFAULT_LIMIT = (long) (60d / 60d * 1000d); // Default hard limit is 80 requests per 60 (80 per 61 actually apparently) seconds, doing 60 per 60 seconds for safety

	@Nullable
	private CompletableFuture<Void> shutdownFuture;

	@Nonnull
	private final ScheduledExecutorService scheduler;

	@Nonnull
	private final Queue<IntFunction<CompletableFuture<Boolean>>> tasks;

	@Nonnegative
	private final long limit;

	@Nonnegative
	private long lastScheduled;

	@Nonnegative
	private int numRetries;

	public SimpleRateLimiter(@Nonnegative @Nullable Long limit) {
		this.limit = limit == null ? DEFAULT_LIMIT : limit;

		shutdownFuture = null;
		scheduler = Executors.newSingleThreadScheduledExecutor(r -> new Thread(r, "RateLimiter"));
		tasks = new LinkedList<>();
		lastScheduled = 0;
		numRetries = 0;
	}

	public SimpleRateLimiter() {
		this(null);
	}

	@Override
	public void enqueue(@Nonnull IntFunction<CompletableFuture<Boolean>> task) {
		if (isShutDown())
			throw new IllegalStateException("Trying to enqueue task while shut down");

		boolean notProcessing;
		// Don't want the processing status to change while checking it and offering tasks
		synchronized (tasks) {
			// Already processing tasks if tasks is not empty
			notProcessing = tasks.isEmpty();

			tasks.offer(task);
			// From here it is guaranteed to be handled if it is processing, so we can leave lock here
		}

		// If already processing, the tasks will be scheduled automatically (see #nextTask)
		if (notProcessing)
			scheduleTask();
	}

	private void scheduleTask() {
		scheduleTask(requestWaitTime());
	}

	private void scheduleTask(@Nonnegative long waitTime) {
		IntFunction<CompletableFuture<Boolean>> task = tasks.peek();
		assert task != null; // To stop null analysis from whining

		lastScheduled = System.currentTimeMillis() + waitTime;

		try {
			scheduler.schedule(() -> completeTask(task), waitTime, TimeUnit.MILLISECONDS);
		} catch (Throwable t) {
			System.err.print("Error scheduling task, shutting down: ");
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

			if (reschedule)
				handleRateLimit();
			else
				nextTask();
		});
	}

	private void handleRateLimit() {
		// We hit a rate limit, backing off
		long backoff = requestExponentialBackoff();

		// Don't remove task, redo it after the backoff
		scheduleTask(backoff);

		// Print after schedule to have as few instructions as possible between request of backoff time and scheduling
		System.err.printf("Backing off for %dms%n", backoff);
	}

	// The cycle goes #enqueue -(only if the rest of the chain is not going on already)> #scheduleTask -> #nextTask -> #scheduleTask -> etc.
	// In no situation should two handleResponse be running at the same time, so we don't have to worry about concurrency in that regard
	private void nextTask() {
		// No rate limits hit, so we can reset num retry
		numRetries = 0;

		// Don't want #enqueue to check isEmpty after remove and before we do here, else: remove -> #enqueue checks is empty (true, thinks processing stopped) -> adds own task -> calls #scheduleTask -> we check if is empty (false, meaning processing won't stop) -> we call #scheduleTask
		synchronized (tasks) {
			// Remove corresponding task from queue
			tasks.remove();

			// Stop if no more tasks are present, complete shutdownFuture if we are shut down
			if (tasks.isEmpty()) {
				// Not calling #isShutdown here because of null analysis
				if (shutdownFuture != null) shutdownFuture.complete(null);

				return;
			}
		}

		scheduleTask();
	}

	@Nonnegative
	private long requestWaitTime() {
		return requestWaitTime(limit);
	}

	@Nonnegative
	private long requestWaitTime(long limit) {
		long current = System.currentTimeMillis();

		return Math.max(lastScheduled + limit - current, 0);
	}

	private long requestExponentialBackoff() {
		return limit * (2 ^ numRetries++);
	}

	@Nonnull
	@Override
	public CompletableFuture<Void> shutdown() {
		synchronized (tasks) {
			// Is completed automatically when tasks are empty
			shutdownFuture = tasks.isEmpty() ? CompletableFuture.completedFuture(null) : new CompletableFuture<>();
		}

		return shutdownFuture.thenRun(scheduler::shutdown);
	}

	@Override
	public boolean isShutDown() {
		return shutdownFuture != null;
	}
}
