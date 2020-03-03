package com.github.gpluscb.ggjava.entity.object.input.scalars;

import com.github.gpluscb.ggjava.entity.EntityType;
import com.github.gpluscb.ggjava.entity.object.input.InputVariable;

import javax.annotation.Nonnull;
import javax.annotation.Nullable;

public class BooleanVariable extends InputVariable<BooleanInput> {
	/**
	 * @throws IllegalArgumentException if name is null
	 */
	public BooleanVariable(@Nonnull String name, boolean required, @Nullable BooleanInput defaultValue) {
		super(EntityType.BOOLEAN, name, required, defaultValue);
	}

	/**
	 * @throws IllegalArgumentException if name is null
	 */
	public BooleanVariable(@Nonnull String name, boolean required) {
		super(EntityType.BOOLEAN, name, required);
	}

	/**
	 * @throws IllegalArgumentException if name is null
	 */
	public BooleanVariable(@Nonnull String name) {
		super(EntityType.BOOLEAN, name);
	}
}
