package com.github.gpluscb.ggjava.internal;

import com.github.gpluscb.ggjava.api.GGClient;
import com.github.gpluscb.ggjava.api.RateLimiter;
import com.github.gpluscb.ggjava.api.exception.RateLimitException;
import com.github.gpluscb.ggjava.entity.object.response.GGResponse;
import com.github.gpluscb.ggjava.entity.object.response.objects.MutationResponse;
import com.github.gpluscb.ggjava.entity.object.response.objects.QueryResponse;
import com.github.gpluscb.ggjava.internal.request.BasicRequester;
import com.github.gpluscb.ggjava.internal.request.GGRequest;
import com.github.gpluscb.ggjava.internal.utils.Checks;
import com.google.gson.JsonObject;
import okhttp3.OkHttpClient;

import javax.annotation.Nonnegative;
import javax.annotation.Nonnull;
import javax.annotation.Nullable;
import java.util.concurrent.CompletableFuture;

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

	@Nonnull
	@Override
	public CompletableFuture<GGResponse<QueryResponse>> query(@Nonnull String query, @Nullable JsonObject variables) {
		Checks.nonNull(query, "query");

		return request(query, variables).thenApply(json -> new GGResponse<>(json, QueryResponse.class));
	}

	@Nonnull
	@Override
	public CompletableFuture<GGResponse<MutationResponse>> mutation(@Nonnull String query, @Nullable JsonObject variables) {
		Checks.nonNull(query, "query");

		return request(query, variables).thenApply(json -> new GGResponse<>(json, MutationResponse.class));
	}

	private CompletableFuture<Boolean> makeRequest(@Nonnull GGRequest request, @Nonnegative int retries) {
		return requester.sendRequest(request.getQuery(), request.getVariables()).handle((response, t) -> {
			if (t != null) {
				return handleFailure(t, request, retries);
			} else {
				request.getFuture().complete(response);
				return false;
			}
		});
	}

	private boolean handleFailure(@Nonnull Throwable failure, @Nonnull GGRequest request, @Nonnegative int retries) {
		// TODO: The retries system kind of does not make sense here
		if (failure instanceof RateLimitException && retries < maxRetries) {
			// Rate limit, rescheduling
			System.err.printf("Ran into rate limit: %s%n", failure.getMessage());
			return true;
		} else {
			request.getFuture().completeExceptionally(failure);
			return false;
		}
	}

	@Nonnull
	@Override
	public CompletableFuture<Void> shutdown() {
		return limiter.shutdown().thenRun(requester::shutdown);
	}

	@Override
	public boolean isShutDown() {
		return limiter.isShutDown();
	}
}
