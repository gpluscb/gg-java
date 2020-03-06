package com.github.gpluscb.ggjava.entity.object.response.scalars;

import com.github.gpluscb.ggjava.entity.EntityType;
import com.github.gpluscb.ggjava.entity.object.response.AbstractGGResponseObject;
import com.github.gpluscb.ggjava.internal.utils.Checks;

import javax.annotation.Nonnull;

public abstract class ScalarResponse<T> extends AbstractGGResponseObject {
	private final T value;

	public ScalarResponse(@Nonnull EntityType type, @Nonnull T value) {
		super(type, true);
		Checks.nonNull(value, "value");
		this.value = value;
	}

	public ScalarResponse(@Nonnull EntityType type) {
		super(type);
		value = null;
	}

	/**
	 * @throws IllegalStateException if this is not provided
	 */
	@Nonnull
	public T getValue() {
		checkProvided();
		return value;
	}
}
