package com.github.gpluscb.ggjava.api.exception;

import com.github.gpluscb.ggjava.internal.utils.Checks;
import javax.annotation.Nonnull;
import javax.annotation.Nullable;

public class GGError {
	@Nullable
	private final String message;
	
	public GGError(@Nonnull String message) {
		Checks.nonNull(message, "message");
		
		this.message = message;
	}
	
	public String getMessage() {
		return message;
	}
}
