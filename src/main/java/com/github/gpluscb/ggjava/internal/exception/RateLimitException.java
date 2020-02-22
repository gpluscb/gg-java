package com.github.gpluscb.ggjava.internal.exception;

import com.github.gpluscb.ggjava.api.exception.RequestFailureException;
import com.github.gpluscb.ggjava.internal.utils.Checks;
import javax.annotation.Nonnull;

public class RateLimitException extends RequestFailureException {
	/**
	 * @throws IllegalArgumentException
	 * 		if message is null or empty
	 */
	public RateLimitException(@Nonnull String message) {
		super(message);
		Checks.nonNull(message, "message");
		Checks.notEmpty(message, "message");
	}
}
