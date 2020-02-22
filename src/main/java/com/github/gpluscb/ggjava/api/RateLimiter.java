package com.github.gpluscb.ggjava.api;

import com.github.gpluscb.ggjava.internal.BucketRateLimiter;
import com.github.gpluscb.ggjava.internal.SimpleRateLimiter;
import com.github.gpluscb.ggjava.internal.utils.Checks;
import com.github.gpluscb.ggjava.internal.utils.IntToBooleanFunction;
import javax.annotation.Nonnegative;
import javax.annotation.Nonnull;
import javax.annotation.Nullable;

/**
 * Used for scheduling tasks according to rate limits.
 */
public interface RateLimiter {
	/**
	 * Enqueues a task to be executed according to the rate limit this instance represents.
	 * The int applied to the function is the number of retries this task is on in this iteration. If this is the first time this task is executed it will be 0, it will be 1 on the first retry and so on.
	 * Return true in the function if you want to retry this task.
	 *
	 * @param task
	 * 		the task to enqueue
	 * @throws IllegalArgumentException
	 * 		task is null
	 * @throws IllegalStateException
	 * 		if the instance is already shut down
	 */
	void enqueue(@Nonnull IntToBooleanFunction task);
	
	/**
	 * Shuts down the instance gracefully. Already enqueued tasks will still be executed.
	 */
	void shutdown();
	
	/**
	 * Whether the instance is already shut down
	 *
	 * @return true if the instance is shut down
	 */
	boolean isShutDown();
	
	/**
	 * For creating instances of RateLimiter that will respect a simple system where tasks are spaced by a certain limit.
	 *
	 * @return a new SimpleBuilder for building a RateLimiter
	 */
	@Nonnull
	static SimpleBuilder simpleBuilder() {
		return new SimpleBuilder();
	}
	
	/**
	 * For creating instances of RateLimiter that will respect a bucket system.
	 *
	 * @return a new BucketBuilder for building a RateLimter
	 */
	@Nonnull
	static BucketBuilder bucketBuilder() {
		return new BucketBuilder();
	}
	
	/**
	 * Used for building instances of RateLimiter that respect a minimal spacing between tasks.
	 *
	 * @see #simpleBuilder()
	 */
	class SimpleBuilder {
		@Nonnegative
		@Nullable
		private Long limit;
		
		private SimpleBuilder() {}
		
		/**
		 * Sets the minimal spacing between execution of tasks in ms.
		 *
		 * @param limit
		 * 		the minimal spacing between execution of tasks in ms or null
		 * @return itself for chaining
		 */
		@Nonnull
		public SimpleBuilder limit(@Nonnegative @Nullable Long limit) {
			if(limit != null)
				Checks.nonNegative(limit, "limit");
			this.limit = limit;
			return this;
		}
		
		/**
		 * Builds the RateLimiter instance.
		 *
		 * @return the RateLimiter instance
		 */
		@Nonnull
		public RateLimiter build() {
			return new SimpleRateLimiter(limit);
		}
	}
	
	/**
	 * Used for building instances of RateLimiter that respect a bucket system.
	 *
	 * @see #bucketBuilder()
	 */
	class BucketBuilder {
		@Nonnegative
		@Nullable
		private Integer tasksPerPeriod;
		
		@Nonnegative
		@Nullable
		private Long period;
		
		private BucketBuilder() {}
		
		/**
		 * Sets the maximum amount of tasks that will be executed in a given period.
		 *
		 * @param tasksPerPeriod
		 * 		the maximum amount of tasks per period or null
		 * @return itself for chaining
		 * @throws IllegalArgumentException
		 * 		if tasksPerPeriod is negative
		 */
		@Nonnull
		public BucketBuilder tasksPerPeriod(@Nonnegative @Nullable Integer tasksPerPeriod) {
			if(tasksPerPeriod != null)
				Checks.nonNegative(tasksPerPeriod, "period");
			this.tasksPerPeriod = tasksPerPeriod;
			return this;
		}
		
		/**
		 * Sets the period according to which tasks will be scheduled.
		 *
		 * @param period
		 * 		the period according to which tasks will be executed or null
		 * @return itself for chaining
		 * @throws IllegalArgumentException
		 * 		if period is negative
		 */
		@Nonnull
		public BucketBuilder period(@Nonnegative @Nullable Long period) {
			if(period != null)
				Checks.nonNegative(period, "period");
			this.period = period;
			return this;
		}
		
		/**
		 * Builds the RateLimiter instance.
		 *
		 * @return the RateLimiter instance
		 */
		@Nonnull
		public RateLimiter build() {
			return new BucketRateLimiter(tasksPerPeriod, period);
		}
	}
}
