package com.github.gpluscb.ggjava.entity.object.input.scalars;

import com.github.gpluscb.ggjava.entity.EntityType;
import com.github.gpluscb.ggjava.entity.object.input.InputVariable;

import javax.annotation.Nonnull;
import javax.annotation.Nullable;

public class JSONVariable extends InputVariable<JSONInput> {
	/**
	 * @throws IllegalArgumentException if name is null
	 */
	public JSONVariable(@Nonnull String name, boolean required, @Nullable JSONInput defaultValue) {
		super(EntityType.JSON, name, required, defaultValue);
	}

	/**
	 * @throws IllegalArgumentException if name is null
	 */
	public JSONVariable(@Nonnull String name, boolean required) {
		super(EntityType.JSON, name, required);
	}

	/**
	 * @throws IllegalArgumentException if name is null
	 */
	public JSONVariable(@Nonnull String name) {
		super(EntityType.JSON, name);
	}
}
