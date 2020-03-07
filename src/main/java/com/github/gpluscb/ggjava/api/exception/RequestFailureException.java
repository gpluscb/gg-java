package com.github.gpluscb.ggjava.api.exception;

public class RequestFailureException extends Exception {
	public RequestFailureException() {
	}

	public RequestFailureException(String message) {
		super(message);
	}

	public RequestFailureException(String message, Throwable cause) {
		super(message, cause);
	}

	public RequestFailureException(Throwable cause) {
		super(cause);
	}
}
