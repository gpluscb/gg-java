package com.github.gpluscb.ggjava.api;

import com.github.gpluscb.ggjava.internal.GGClientImpl;
import com.github.gpluscb.ggjava.internal.SimpleRateLimiter;
import com.github.gpluscb.ggjava.internal.utils.Checks;
import com.google.gson.JsonObject;
import java.util.concurrent.CompletableFuture;
import javax.annotation.Nonnegative;
import javax.annotation.Nonnull;
import javax.annotation.Nullable;
import okhttp3.OkHttpClient;

public interface GGClient {
	/**
	 * The returned CompletableFuture will be completed with the response on the requester thread. If you don't use async methods and block, no requests will be sent during execution of your code.
	 */
	@Nonnull
	CompletableFuture<JsonObject> request(@Nonnull String query, @Nullable JsonObject variables);
	
	/**
	 * The returned CompletableFuture will be completed with the response on the requester thread. If you don't use async methods and block, no requests will be sent during execution of your code.
	 */
	@Nonnull
	default CompletableFuture<JsonObject> request(@Nonnull String query) {
		return request(query, null);
	}
	
	void shutdown();
	
	/**
	 * @throws IllegalArgumentException if token is null or empty
	 */
	@Nonnull
	static Builder builder(@Nonnull String token) {
		Checks.nonNull(token, "token");
		Checks.notEmpty(token, "token");
		
		return new Builder(token);
	}
	
	class Builder {
		@Nonnull
		private String token;
		
		@Nullable
		private OkHttpClient client;
		
		@Nonnegative
		private RateLimiter limiter;
		
		@Nonnegative
		@Nullable
		private Integer maxRetries;
		
		private Builder(@Nonnull String token) {
			this.token = token;
		}
		
		@Nonnull
		public Builder client(@Nullable OkHttpClient client) {
			this.client = client;
			return this;
		}
		
		/**
		 * @throws IllegalArgumentException if limit is negative
		 */
		@Nonnull
		public Builder limiter(@Nullable RateLimiter limiter) {
			this.limiter = limiter;
			return this;
		}
		
		@Nonnull
		public Builder maxRetries(@Nonnegative @Nullable Integer maxRetries) {
			if(maxRetries != null) Checks.nonNegative(maxRetries, "maxRetries");
			this.maxRetries = maxRetries;
			return this;
		}
		
		@Nonnull
		public GGClient build() {
			if(client == null) client = new OkHttpClient.Builder().build();
			if(limiter == null) limiter = new SimpleRateLimiter();
			
			return new GGClientImpl(token, client, limiter, maxRetries);
		}
	}
}
