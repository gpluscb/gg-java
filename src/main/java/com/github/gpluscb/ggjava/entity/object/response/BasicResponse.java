package com.github.gpluscb.ggjava.entity.object.response;

import com.github.gpluscb.ggjava.entity.EntityType;
import com.github.gpluscb.ggjava.internal.utils.Checks;

import javax.annotation.Nonnull;

public class BasicResponse<T> extends AbstractGGResponseObject {
	@Nonnull
	private final T value;

	/**
	 * @throws IllegalArgumentException if value is null
	 */
	public BasicResponse(@Nonnull EntityType type, @Nonnull T value) throws IllegalArgumentException {
		super(type);

		Checks.nonNull(value, "value");
		this.value = value;
	}

	public BasicResponse(@Nonnull EntityType type) {
		super(type, false);
		value = null;
	}

	@Nonnull
	public T getValue() {
		checkProvided();
		return value;
	}
}
