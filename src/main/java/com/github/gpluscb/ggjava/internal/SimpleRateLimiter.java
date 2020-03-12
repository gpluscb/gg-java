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

	private boolean isShutDown;

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

		isShutDown = false;
		scheduler = Executors.newSingleThreadScheduledExecutor(r -> new Thread(r, "RequestScheduler"));
		tasks = new LinkedList<>();
		lastScheduled = 0;
		numRetries = 0;
	}

	public SimpleRateLimiter() {
		this(null);
	}

	@Override
	public void enqueue(@Nonnull IntFunction<CompletableFuture<Boolean>> task) {
		if (isShutDown)
			throw new IllegalStateException("Trying to request while requester shut down");

		// Don't want the processing status to change
		boolean notProcessing;
		synchronized (tasks) {
			// Already processing requests if requests is not empty
			notProcessing = tasks.isEmpty();

			tasks.offer(task);
			// From here it is guaranteed to be handled if it is processing, so we can leave lock here
		}

		// If already processing, the request will be scheduled automatically (see #nextRequest)
		if (notProcessing)
			scheduleRequest();
	}

	private void scheduleRequest() {
		scheduleRequest(requestWaitTime());
	}

	private void scheduleRequest(@Nonnegative long waitTime) {
		IntFunction<CompletableFuture<Boolean>> task = tasks.peek();
		assert task != null; // To stop null analysis from whining

		scheduler.schedule(() -> completeTask(task), waitTime, TimeUnit.MILLISECONDS);
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
				nextRequest();
		});
	}

	private void handleRateLimit() {
		// We hit a rate limit, backing off
		long backoff = requestExponentialBackoff();

		// Don't remove request, redo it after the backoff
		scheduleRequest(backoff);

		// Print after schedule to have as few instructions as possible between request of backoff time and scheduling
		System.err.printf("Backing off for %dms%n", backoff);
	}

	// The cycle goes #request -(only if the rest of the chain is not going on already)> #scheduleRequest -> #nextRequest -> #scheduleRequest -> etc.
	// In no situation should two handleResponse be running at the same time, so we don't have to worry about concurrency in that regard
	private void nextRequest() {
		// No rate limits hit, so we can reset num retry
		numRetries = 0;

		// Don't want #request to check isEmpty after remove and before we do here, else: remove -> request checks is empty (true, thinks processing stopped) -> adds own request -> calls #scheduleRequest -> we check if is empty (false, meaning processing won't stop) -> we call #scheduleRequest
		synchronized (tasks) {
			// Remove corresponding request from queue
			tasks.remove();

			// Stop if no more requests are present
			if (tasks.isEmpty())
				return;
		}

		scheduleRequest();
	}

	@Nonnegative
	private long requestWaitTime() {
		return requestWaitTime(limit);
	}

	@Nonnegative
	private long requestWaitTime(long limit) {
		long current = System.currentTimeMillis();

		long ret = Math.max(lastScheduled + limit - current, 0);

		lastScheduled = current + ret;

		return ret;
	}

	private long requestExponentialBackoff() {
		return limit * (2 ^ numRetries++);
	}

	@Nonnull
	@Override
	public CompletableFuture<Void> shutdown() {
		isShutDown = true;

		// TODO: More beautiful
		return CompletableFuture.supplyAsync(() -> {
			try {
				while (!tasks.isEmpty())
					Thread.sleep(100);

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
}
