package com.github.gpluscb.ggjava.entity.object.response.enums;

import com.github.gpluscb.ggjava.entity.EntityType;
import com.github.gpluscb.ggjava.entity.enums.GGEnum;
import com.github.gpluscb.ggjava.entity.object.response.AbstractGGResponseObject;
import com.github.gpluscb.ggjava.internal.utils.Checks;

import javax.annotation.Nonnull;

public abstract class EnumResponse<T extends GGEnum> extends AbstractGGResponseObject {
	private final T response;

	public EnumResponse(@Nonnull EntityType type) {
		super(type);

		response = null;
	}

	/**
	 * @throws IllegalArgumentException if response is null
	 */
	public EnumResponse(@Nonnull EntityType type, @Nonnull T response) throws IllegalArgumentException {
		super(type, true);

		Checks.nonNull(response, "response");
		this.response = response;
	}

	/**
	 * @throws IllegalStateException if this is not provided
	 */
	@Nonnull
	public T getResponse() throws IllegalStateException {
		checkProvided();
		return response;
	}
}
