package com.github.gpluscb.ggjava.internal.request;

import com.github.gpluscb.ggjava.api.exception.ErrorResponseException;
import com.github.gpluscb.ggjava.api.exception.GGError;
import com.github.gpluscb.ggjava.api.exception.RequestFailureException;
import com.github.gpluscb.ggjava.api.exception.UnauthorizedException;
import com.github.gpluscb.ggjava.internal.exception.RateLimitException;
import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import com.google.gson.JsonParser;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.function.Consumer;
import javax.annotation.Nonnull;
import javax.annotation.Nullable;
import okhttp3.*;

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
	public JsonObject sendRequest(@Nonnull String query, @Nullable JsonObject variables) throws Throwable {
		Request request = makeRequest(query, variables);
		try(Response response = client.newCall(request).execute()) {
			ResponseBody body = response.body();
			if(body == null)
				throw new RequestFailureException("No response body received");
			
			JsonObject jsonResponse = JsonParser.parseString(body.string()).getAsJsonObject();
			
			if(!response.isSuccessful()) {
				switch(response.code()) {
					case 401:
						throw new UnauthorizedException(jsonResponse.getAsJsonPrimitive("message").getAsString());
					case 429:
						throw new RateLimitException(jsonResponse.getAsJsonPrimitive("message").getAsString());
					default:
						throw new RequestFailureException("Unsuccessful response received: " + response);
				}
			}
			
			if(jsonResponse.has("success") && !jsonResponse.getAsJsonPrimitive("success").getAsBoolean())
				throw new RequestFailureException(jsonResponse.getAsJsonPrimitive("message").getAsString());
			
			ErrorResponseException errorResponse = getErrorResponse(jsonResponse);
			
			if(errorResponse == null)
				return jsonResponse;
			else
				throw errorResponse;
		} catch(IOException e) {
			throw new RequestFailureException(e);
		}
	}
	
	public void sendRequestAsync(@Nonnull String query, @Nullable JsonObject variables, @Nonnull Consumer<? super JsonObject> onSuccess, @Nonnull Consumer<? super Throwable> onFailure) {
		try {
			Request request = makeRequest(query, variables);
			client.newCall(request).enqueue(new okhttp3.Callback() {
				@Override
				public void onFailure(@Nonnull Call call, @Nonnull IOException e) {
					onFailure.accept(new RequestFailureException(e));
				}
				
				@Override
				public void onResponse(@Nonnull Call call, @Nonnull Response response) {
					try {
						ResponseBody body = response.body();
						if(body == null) {
							onFailure.accept(new RequestFailureException("No response body received"));
							return;
						}
						
						JsonObject jsonResponse = JsonParser.parseString(body.string()).getAsJsonObject();
						
						if(!response.isSuccessful()) {
							switch(response.code()) {
								case 401:
									onFailure.accept(new UnauthorizedException(jsonResponse.getAsJsonPrimitive("message").getAsString()));
									break;
								case 429:
									onFailure.accept(new RateLimitException(jsonResponse.getAsJsonPrimitive("message").getAsString()));
									break;
								default:
									onFailure.accept(new RequestFailureException("Unsuccessful response received: " + response));
									break;
							}
							
							return;
						}
						
						if(jsonResponse.has("success") && !jsonResponse.getAsJsonPrimitive("success").getAsBoolean()) {
							onFailure.accept(new RequestFailureException(jsonResponse.getAsJsonPrimitive("message").getAsString()));
							return;
						}
						
						ErrorResponseException errorResponse = getErrorResponse(jsonResponse);
						
						if(errorResponse == null) {
							try {
								onSuccess.accept(jsonResponse);
							} catch(Throwable t) {
								onFailure.accept(t);
							}
						} else
							onFailure.accept(errorResponse);
					} catch(Throwable t) {
						System.err.print("Failed to handle server response: ");
						t.printStackTrace();
						onFailure.accept(t);
					}
				}
			});
		} catch(Throwable t) {
			onFailure.accept(t);
		}
	}
	
	@Nullable
	private ErrorResponseException getErrorResponse(@Nonnull JsonObject jsonResponse) {
		if(!jsonResponse.has("errors"))
			return null;
		
		List<GGError> errors = new ArrayList<>();
		
		for(JsonElement jsonError : jsonResponse.getAsJsonArray("errors"))
			errors.add(new GGError(jsonError.getAsJsonObject().getAsJsonPrimitive("message").getAsString()));
		
		return new ErrorResponseException(errors);
	}
	
	@Nonnull
	private Request makeRequest(@Nonnull String query, @Nullable JsonObject variables) {
		JsonObject jsonBody = new JsonObject();
		jsonBody.addProperty("query", query);
		if(variables != null)
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
