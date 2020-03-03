package com.github.gpluscb.ggjava.internal.request;

import com.github.gpluscb.ggjava.api.exception.ErrorResponseException;
import com.github.gpluscb.ggjava.api.exception.GGError;
import com.github.gpluscb.ggjava.api.exception.RequestFailureException;
import com.github.gpluscb.ggjava.api.exception.UnauthorizedException;
import com.github.gpluscb.ggjava.internal.exception.RateLimitException;
import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import com.google.gson.JsonParser;
import okhttp3.*;

import javax.annotation.Nonnull;
import javax.annotation.Nullable;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
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
					ret.completeExceptionally(new RequestFailureException(e));
				}

				@Override
				public void onResponse(@Nonnull Call call, @Nonnull Response response) {
					try {
						ResponseBody body = response.body();
						if (body == null) {
							ret.completeExceptionally(new RequestFailureException("No response body received"));
							return;
						}

						JsonObject jsonResponse = JsonParser.parseString(body.string()).getAsJsonObject();

						if (!response.isSuccessful()) {
							switch (response.code()) {
								case 401:
									ret.completeExceptionally(new UnauthorizedException(jsonResponse.getAsJsonPrimitive("message").getAsString()));
									break;
								case 429:
									ret.completeExceptionally(new RateLimitException(jsonResponse.getAsJsonPrimitive("message").getAsString()));
									break;
								default:
									ret.completeExceptionally(new RequestFailureException("Unsuccessful response received: " + response));
									break;
							}

							return;
						}

						if (jsonResponse.has("success") && !jsonResponse.getAsJsonPrimitive("success").getAsBoolean()) {
							ret.completeExceptionally(new RequestFailureException(jsonResponse.getAsJsonPrimitive("message").getAsString()));
							return;
						}

						ErrorResponseException errorResponse = getErrorResponse(jsonResponse);

						if (errorResponse == null) {
							try {
								ret.complete(jsonResponse);
							} catch (Throwable t) {
								ret.completeExceptionally(t);
							}
						} else
							ret.completeExceptionally(errorResponse);
					} catch (Throwable t) {
						System.err.print("Failed to handle server response: ");
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

	@Nullable
	private ErrorResponseException getErrorResponse(@Nonnull JsonObject jsonResponse) {
		if (!jsonResponse.has("errors"))
			return null;

		List<GGError> errors = new ArrayList<>();

		for (JsonElement jsonError : jsonResponse.getAsJsonArray("errors"))
			errors.add(new GGError(jsonError.getAsJsonObject().getAsJsonPrimitive("message").getAsString()));

		return new ErrorResponseException(errors);
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

	@Nonnull
	public OkHttpClient getClient() {
		return client;
	}
}
