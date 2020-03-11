package com.github.gpluscb.ggjava.api.exception;

import com.github.gpluscb.ggjava.internal.utils.Checks;
import com.google.gson.JsonObject;

import javax.annotation.Nonnull;

public class RequestFailureException extends Exception {
	@Nonnull
	private final JsonObject jsonResponse;

	/**
	 * @throws if jsonResponse is null
	 */
	public RequestFailureException(@Nonnull JsonObject jsonResponse) {
		Checks.nonNull(jsonResponse, "jsonResponse");

		this.jsonResponse = jsonResponse;
	}

	/**
	 * @throws if jsonResponse is null
	 */
	public RequestFailureException(@Nonnull JsonObject jsonResponse, String message) {
		super(message);

		Checks.nonNull(jsonResponse, "jsonResponse");

		this.jsonResponse = jsonResponse;
	}

	/**
	 * @throws if jsonResponse is null
	 */
	public RequestFailureException(@Nonnull JsonObject jsonResponse, String message, Throwable cause) {
		super(message, cause);

		Checks.nonNull(jsonResponse, "jsonResponse");

		this.jsonResponse = jsonResponse;
	}

	/**
	 * @throws if jsonResponse is null
	 */
	public RequestFailureException(@Nonnull JsonObject jsonResponse, Throwable cause) {
		super(cause);

		Checks.nonNull(jsonResponse, "jsonResponse");

		this.jsonResponse = jsonResponse;
	}

	@Nonnull
	public JsonObject getJsonResponse() {
		return jsonResponse;
	}
}
