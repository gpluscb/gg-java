package com.github.gpluscb.ggjava.api.exception;

import com.github.gpluscb.ggjava.internal.utils.Checks;
import javax.annotation.Nonnull;

public class ComplexityLimitException extends RequestFailureException {
	/**
	 * @throws IllegalArgumentException
	 * 		if message is null or empty
	 */
	public ComplexityLimitException(@Nonnull String message) {
		super(message);
		Checks.nonNull(message, "message");
		Checks.notEmpty(message, "message");
	}
}
