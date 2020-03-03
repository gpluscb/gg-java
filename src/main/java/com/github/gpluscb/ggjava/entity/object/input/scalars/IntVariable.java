package com.github.gpluscb.ggjava.entity.object.input.scalars;

import com.github.gpluscb.ggjava.entity.EntityType;
import com.github.gpluscb.ggjava.entity.object.input.InputVariable;

import javax.annotation.Nonnull;
import javax.annotation.Nullable;

public class IntVariable extends InputVariable<IntInput> {
	/**
	 * @throws IllegalArgumentException if name is null
	 */
	public IntVariable(@Nonnull String name, boolean required, @Nullable IntInput defaultValue) {
		super(EntityType.INT, name, required, defaultValue);
	}

	/**
	 * @throws IllegalArgumentException if name is null
	 */
	public IntVariable(@Nonnull String name, boolean required) {
		super(EntityType.INT, name, required);
	}

	/**
	 * @throws IllegalArgumentException if name is null
	 */
	public IntVariable(@Nonnull String name) {
		super(EntityType.INT, name);
	}
}
