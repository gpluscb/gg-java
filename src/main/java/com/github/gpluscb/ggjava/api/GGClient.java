package com.github.gpluscb.ggjava.api;

import com.github.gpluscb.ggjava.internal.BucketRateLimiter;
import com.github.gpluscb.ggjava.internal.GGClientImpl;
import com.github.gpluscb.ggjava.internal.utils.Checks;
import com.google.gson.JsonObject;
import java.util.concurrent.CompletableFuture;
import javax.annotation.Nonnegative;
import javax.annotation.Nonnull;
import javax.annotation.Nullable;
import okhttp3.OkHttpClient;

/**
 * Instances can be used for communicating with the smash.gg GraphQL API.
 * Rate limits can be configured and will be handled automatically.
 */
public interface GGClient {
	/**
	 * Performs a request with the given query to the GraphQL API.
	 * <p>
	 * The returned CompletableFuture will be completed with the response on the requester thread.
	 * If you don't use async methods and block, no requests will be sent during execution of your code.
	 * If you block until a request is complete in a not-async callback, you will deadlock.
	 *
	 * @param query
	 * 		the GraphQL query
	 * @param variables
	 * 		the variable assignments as a JsonObject of format {"variable1":"value1", "variable2":"value2" ...}
	 * @return a CompletableFuture that will be completed with the JsonObject of the response of the format {"data": {...}} or will be completed exceptionally if the request fails
	 * @throws IllegalArgumentException
	 * 		if query or variables is null
	 * @throws IllegalStateException
	 * 		if the client is already shut down
	 */
	@Nonnull
	CompletableFuture<JsonObject> request(@Nonnull String query, @Nullable JsonObject variables);
	
	/**
	 * Performs a request with the given query to the GraphQL API.
	 * <p>
	 * The returned CompletableFuture will be completed with the response on the requester thread.
	 * If you don't use async methods and block, no requests will be sent during execution of your code.
	 * If you block until a request is complete in a not-async callback, you will deadlock.
	 *
	 * @param query
	 * 		the GraphQL query
	 * @return a CompletableFuture that will be completed with the JsonObject of the response of the format {"data": {...}} or will be completed exceptionally if the request fails
	 * @throws IllegalArgumentException
	 * 		if query is null
	 * @throws IllegalStateException
	 * 		if the client is already shut down
	 */
	@Nonnull
	default CompletableFuture<JsonObject> request(@Nonnull String query) {
		return request(query, null);
	}
	
	/**
	 * Shuts down the client gracefully. Already enqueued requests will still be executed.
	 */
	void shutdown();
	
	/**
	 * Whether the client is already shut down
	 *
	 * @return true if the client is shut down
	 */
	boolean isShutDown();
	
	/**
	 * For creating instances of GGClient.
	 *
	 * @return a new Builder for building a GGClient
	 * @throws IllegalArgumentException
	 * 		if token is null or empty
	 */
	@Nonnull
	static Builder builder(@Nonnull String token) {
		Checks.nonNull(token, "token");
		Checks.notEmpty(token, "token");
		
		return new Builder(token);
	}
	
	/**
	 * Used for building instances of GGClient.
	 *
	 * @see #builder(java.lang.String)
	 */
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
		
		/**
		 * Sets the OkHttpClient used to make requests.
		 *
		 * @param client
		 * 		the OkHttpClient to use or null
		 * @return itself for chaining
		 */
		@Nonnull
		public Builder client(@Nullable OkHttpClient client) {
			this.client = client;
			return this;
		}
		
		/**
		 * Sets the RateLimiter used to schedule requests.
		 *
		 * @param limiter
		 * 		the RateLimiter to use or null
		 * @return itself for chaining
		 */
		@Nonnull
		public Builder limiter(@Nullable RateLimiter limiter) {
			this.limiter = limiter;
			return this;
		}
		
		/**
		 * Sets the maximum number of retries for one request.
		 *
		 * @param maxRetries
		 * 		the maximum amount of retriest for one request to use or null
		 * @return itself for chaining
		 */
		@Nonnull
		public Builder maxRetries(@Nonnegative @Nullable Integer maxRetries) {
			if(maxRetries != null)
				Checks.nonNegative(maxRetries, "maxRetries");
			this.maxRetries = maxRetries;
			return this;
		}
		
		/**
		 * Builds the GGClient instance.
		 *
		 * @return the GGClient instance
		 */
		@Nonnull
		public GGClient build() {
			if(client == null)
				client = new OkHttpClient.Builder().build();
			if(limiter == null)
				limiter = new BucketRateLimiter();
			
			return new GGClientImpl(token, client, limiter, maxRetries);
		}
	}
}
