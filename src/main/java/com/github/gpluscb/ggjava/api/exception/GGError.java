package com.github.gpluscb.ggjava.api.exception;

import com.github.gpluscb.ggjava.internal.utils.Checks;

import javax.annotation.Nullable;

public class GGError {
	@Nullable
	private final String message;

	public GGError(@Nullable String message) {
		Checks.nonNull(message, "message");

		this.message = message;
	}

	@Nullable
	public String getMessage() {
		return message;
	}
}
