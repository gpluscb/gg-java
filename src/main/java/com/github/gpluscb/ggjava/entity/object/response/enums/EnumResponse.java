package com.github.gpluscb.ggjava.entity.object.response.enums;

import com.github.gpluscb.ggjava.entity.EntityType;
import com.github.gpluscb.ggjava.entity.enums.GGEnum;
import com.github.gpluscb.ggjava.entity.object.response.AbstractGGResponseObject;
import com.github.gpluscb.ggjava.internal.utils.Checks;

import javax.annotation.Nonnull;

public abstract class EnumResponse<T extends GGEnum> extends AbstractGGResponseObject {
	private final T value;

	public EnumResponse(@Nonnull EntityType type) {
		super(type);

		value = null;
	}

	/**
	 * @throws IllegalArgumentException if response is null
	 */
	public EnumResponse(@Nonnull EntityType type, @Nonnull T value) throws IllegalArgumentException {
		super(type, true);

		Checks.nonNull(value, "response");
		this.value = value;
	}

	/**
	 * @throws IllegalStateException if this is not provided
	 */
	@Nonnull
	public T getValue() throws IllegalStateException {
		checkProvided();
		return value;
	}
}
