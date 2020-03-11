package com.github.gpluscb.ggjava.internal.request;

import com.github.gpluscb.ggjava.api.exception.RateLimitException;
import com.github.gpluscb.ggjava.api.exception.RequestFailureException;
import com.github.gpluscb.ggjava.api.exception.UnauthorizedException;
import com.google.gson.JsonObject;
import com.google.gson.JsonParser;
import okhttp3.*;

import javax.annotation.Nonnull;
import javax.annotation.Nullable;
import java.io.IOException;
import java.util.concurrent.CompletableFuture;

public class BasicRequester {
	@Nonnull
	public static final String API_URL = "https://api.smash.gg/gql/alpha";

	@Nonnull
	private static final MediaType JSON = MediaType.get("application/json");

	@Nonnull
	private final String token;

	@Nonnull
	private final OkHttpClient client;

	public BasicRequester(@Nonnull String token, @Nonnull OkHttpClient client) {
		this.token = token;
		this.client = client;
	}

	@Nonnull
	public CompletableFuture<JsonObject> sendRequest(@Nonnull String query, @Nullable JsonObject variables) {
		CompletableFuture<JsonObject> ret = new CompletableFuture<>();

		try {
			Request request = makeRequest(query, variables);
			client.newCall(request).enqueue(new okhttp3.Callback() {
				@Override
				public void onFailure(@Nonnull Call call, @Nonnull IOException e) {
					ret.completeExceptionally(e);
				}

				@Override
				public void onResponse(@Nonnull Call call, @Nonnull Response response) {
					try {
						ResponseBody body = response.body();
						// See documentation, this cannot be null here
						assert body != null;

						JsonObject jsonResponse = JsonParser.parseString(body.string()).getAsJsonObject();

						// These have atypical layouts for the jsonResponse
						if (!response.isSuccessful()) {
							switch (response.code()) {
								case 401:
									ret.completeExceptionally(new UnauthorizedException(jsonResponse));
									break;
								case 429:
									ret.completeExceptionally(new RateLimitException(jsonResponse));
									break;
								default:
									ret.completeExceptionally(new RequestFailureException(jsonResponse, "Unsuccessful response received: " + jsonResponse.toString()));
									break;
							}

							return;
						}

						ret.complete(jsonResponse);
					} catch (Throwable t) {
						System.err.print("Failed to handle server response: " + response.toString());
						t.printStackTrace();
						ret.completeExceptionally(t);
					}
				}
			});
		} catch (Throwable t) {
			ret.completeExceptionally(t);
		}

		return ret;
	}

	@Nonnull
	private Request makeRequest(@Nonnull String query, @Nullable JsonObject variables) {
		JsonObject jsonBody = new JsonObject();
		jsonBody.addProperty("query", query);
		if (variables != null)
			jsonBody.add("variables", variables);

		RequestBody body = RequestBody.create(jsonBody.toString(), JSON);

		Request.Builder requestBuilder = new Request.Builder().url(API_URL);
		requestBuilder.post(body);
		requestBuilder.addHeader("Authorization", "Bearer " + token);
		requestBuilder.addHeader("X-Source", "gg-java");

		return requestBuilder.build();
	}

	public void shutdown() {
		client.dispatcher().executorService().shutdown();
		client.connectionPool().evictAll();
	}
}
