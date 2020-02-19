package com.github.gpluscb.ggjava.api.exception;

import com.github.gpluscb.ggjava.internal.utils.Checks;
import javax.annotation.Nonnull;

public class UnauthorizedException extends RequestFailureException {
	/**
	 * @throws IllegalArgumentException if message is null or empty
	 */
	public UnauthorizedException(@Nonnull String message) {
		super(message);
		Checks.nonNull(message, "message");
		Checks.notEmpty(message, "message");
	}
}
