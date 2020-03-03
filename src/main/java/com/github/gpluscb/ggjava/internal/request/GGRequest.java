package com.github.gpluscb.ggjava.internal.request;

import com.google.gson.JsonObject;

import javax.annotation.Nonnull;
import javax.annotation.Nullable;
import java.util.concurrent.CompletableFuture;

public class GGRequest {
	@Nonnull
	private final String query;

	@Nullable
	private final JsonObject variables;

	@Nonnull
	private final CompletableFuture<JsonObject> future;

	public GGRequest(@Nonnull String query, @Nullable JsonObject variables, @Nonnull CompletableFuture<JsonObject> future) {
		this.query = query;
		this.variables = variables;
		this.future = future;
	}

	@Nonnull
	public String getQuery() {
		return query;
	}

	@Nullable
	public JsonObject getVariables() {
		return variables;
	}

	@Nonnull
	public CompletableFuture<JsonObject> getFuture() {
		return future;
	}
}
