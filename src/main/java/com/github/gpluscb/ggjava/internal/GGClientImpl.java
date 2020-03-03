package com.github.gpluscb.ggjava.internal;

import com.github.gpluscb.ggjava.api.GGClient;
import com.github.gpluscb.ggjava.api.RateLimiter;
import com.github.gpluscb.ggjava.internal.exception.RateLimitException;
import com.github.gpluscb.ggjava.internal.request.BasicRequester;
import com.github.gpluscb.ggjava.internal.request.GGRequest;
import com.github.gpluscb.ggjava.internal.utils.Checks;
import com.google.gson.JsonObject;
import okhttp3.OkHttpClient;

import javax.annotation.Nonnegative;
import javax.annotation.Nonnull;
import javax.annotation.Nullable;
import java.util.concurrent.CompletableFuture;
import java.util.concurrent.ExecutionException;

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

		limiter.enqueue(retries -> makeRequest(request, retries));

		return ret;
	}

	private boolean makeRequest(@Nonnull GGRequest request, @Nonnegative int retries) {
		try {
			requester.sendRequest(request.getQuery(), request.getVariables()).get();
			return false;
		} catch (ExecutionException e) {
			return handleFailure(e.getCause(), request, retries);
		} catch (InterruptedException e) {
			System.err.println("Thread was interrupted while waiting for server response, retrying");
			return true;
		}
	}

	private boolean handleFailure(@Nonnull Throwable failure, @Nonnull GGRequest request, @Nonnegative int retries) {
		if (failure instanceof RateLimitException && retries < maxRetries) {
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
