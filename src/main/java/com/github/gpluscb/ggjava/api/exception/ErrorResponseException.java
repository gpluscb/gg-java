package com.github.gpluscb.ggjava.api.exception;

import com.github.gpluscb.ggjava.internal.utils.Checks;
import java.util.Collections;
import java.util.List;
import javax.annotation.Nonnull;

public class ErrorResponseException extends RequestFailureException {
	@Nonnull
	private final List<GGError> errors;
	
	/**
	 * @throws IllegalArgumentException
	 * 		if errors is null
	 */
	public ErrorResponseException(@Nonnull List<GGError> errors) {
		Checks.nonNull(errors, "errors");
		
		this.errors = errors;
	}
	
	/**
	 * @throws IllegalArgumentException
	 * 		if errors is null
	 */
	public ErrorResponseException(String message, @Nonnull List<GGError> errors) {
		super(message);
		
		Checks.nonNull(errors, "errors");
		
		this.errors = errors;
	}
	
	/**
	 * @throws IllegalArgumentException
	 * 		if errors is null
	 */
	public ErrorResponseException(String message, Throwable cause, @Nonnull List<GGError> errors) {
		super(message, cause);
		
		Checks.nonNull(errors, "errors");
		
		this.errors = errors;
	}
	
	/**
	 * @throws IllegalArgumentException
	 * 		if errors is null
	 */
	public ErrorResponseException(Throwable cause, @Nonnull List<GGError> errors) {
		super(cause);
		
		Checks.nonNull(errors, "errors");
		
		this.errors = errors;
	}
	
	@Nonnull
	public List<GGError> getErrors() {
		return Collections.unmodifiableList(errors);
	}
}
