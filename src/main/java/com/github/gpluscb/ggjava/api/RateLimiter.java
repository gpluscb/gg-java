package com.github.gpluscb.ggjava.api;

import com.github.gpluscb.ggjava.internal.BucketRateLimiter;
import com.github.gpluscb.ggjava.internal.SimpleRateLimiter;
import com.github.gpluscb.ggjava.internal.utils.Checks;
import com.github.gpluscb.ggjava.internal.utils.IntToBooleanFunction;
import javax.annotation.Nonnegative;
import javax.annotation.Nonnull;
import javax.annotation.Nullable;

public interface RateLimiter {
	/**
	 * The int applied to the function is the number of retries this task is on in this iteration. If this is the first time this task is executed it will be 0, it will be 1 on the first retry and so on.
	 * Return true in the function if you want to retry this task.
	 */
	void enqueue(@Nonnull IntToBooleanFunction task);
	
	void shutdown();
	
	static SimpleBuilder simpleBuilder() {
		return new SimpleBuilder();
	}
	
	static BucketBuilder bucketBuilder() {
		return new BucketBuilder();
	}
	
	class SimpleBuilder {
		@Nonnegative
		@Nullable
		private Long limit;
		
		private SimpleBuilder() {}
		
		@Nonnull
		public SimpleBuilder limit(@Nonnegative @Nullable Long limit) {
			if(limit != null) Checks.nonNegative(limit, "limit");
			this.limit = limit;
			return this;
		}
		
		@Nonnull
		public RateLimiter build() {
			return new SimpleRateLimiter(limit);
		}
	}
	
	class BucketBuilder {
		@Nonnegative
		@Nullable
		private Integer tasksPerPeriod;
		
		@Nonnegative
		@Nullable
		private Long period;
		
		private BucketBuilder() {}
		
		@Nonnull
		public BucketBuilder tasksPerPeriod(@Nonnegative @Nullable Integer tasksPerPeriod) {
			if(tasksPerPeriod != null) Checks.nonNegative(tasksPerPeriod, "period");
			this.tasksPerPeriod = tasksPerPeriod;
			return this;
		}
		
		@Nonnull
		public BucketBuilder period(@Nonnegative @Nullable Long period) {
			if(period != null) Checks.nonNegative(period, "period");
			this.period = period;
			return this;
		}
		
		@Nonnull
		public RateLimiter build() {
			return new BucketRateLimiter(tasksPerPeriod, period);
		}
	}
}
