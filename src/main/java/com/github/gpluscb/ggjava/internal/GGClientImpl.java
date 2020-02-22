package com.github.gpluscb.ggjava.internal;

import com.github.gpluscb.ggjava.api.GGClient;
import com.github.gpluscb.ggjava.api.RateLimiter;
import com.github.gpluscb.ggjava.internal.exception.RateLimitException;
import com.github.gpluscb.ggjava.internal.request.GGRequest;
import com.github.gpluscb.ggjava.internal.request.BasicRequester;
import com.github.gpluscb.ggjava.internal.utils.Checks;
import com.google.gson.JsonObject;
import java.util.concurrent.*;
import javax.annotation.Nonnegative;
import javax.annotation.Nonnull;
import javax.annotation.Nullable;
import okhttp3.OkHttpClient;

public class GGClientImpl implements GGClient {
	@Nonnegative
	public static final int DEFAULT_MAX_RETRIES = 5;
	
	@Nonnull
	private final BasicRequester requester;
	
	@Nonnull
	private final RateLimiter limiter;
	
	@Nonnegative
	private final int maxRetries;
	
	public GGClientImpl(@Nonnull String token, @Nonnull OkHttpClient client, @Nonnull RateLimiter limiter, @Nullable @Nonnegative Integer maxRetries) {
		this.limiter = limiter;
		this.maxRetries = maxRetries == null ? DEFAULT_MAX_RETRIES : maxRetries;
		
		requester = new BasicRequester(token, client);
	}
	
	@Nonnull
	@Override
	public CompletableFuture<JsonObject> request(@Nonnull String query, @Nullable JsonObject variables) {
		Checks.nonNull(query, "query");
		
		CompletableFuture<JsonObject> ret = new CompletableFuture<>();
		
		GGRequest request = new GGRequest(query, variables, ret);
		
		limiter.enqueue(retries -> makeRequest(request) && retries < maxRetries);
		
		return ret;
	}
	
	private boolean makeRequest(@Nonnull GGRequest request) {
		try {
			System.out.println("Request sent at " + System.currentTimeMillis());
			request.getFuture().complete(requester.sendRequest(request.getQuery(), request.getVariables()));
			return false;
		} catch(Throwable t) {
			return handleFailure(t, request);
		}
	}
	
	private boolean handleFailure(@Nonnull Throwable failure, @Nonnull GGRequest request) {
		if(failure instanceof RateLimitException) {
			// Rate limit, rescheduling
			System.err.printf("Ran into rate limit: %s%n", failure.getMessage());
			
			return true;
		} else {
			request.getFuture().completeExceptionally(failure);
			
			return false;
		}
	}
	
	@Override
	public void shutdown() {
		limiter.shutdown();
	}
	
	@Override
	public boolean isShutDown() {
		return limiter.isShutDown();
	}
}
