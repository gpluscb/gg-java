package com.github.gpluscb.ggjava.entity.object.input.scalars;

import com.github.gpluscb.ggjava.entity.EntityType;
import javax.annotation.Nonnull;
import javax.annotation.Nullable;

import com.github.gpluscb.ggjava.entity.object.input.InputVariable;
import com.github.gpluscb.ggjava.entity.object.scalars.GGFloat;

public class FloatVariable extends InputVariable<FloatInput> {
	/**
	 * @throws IllegalArgumentException if name is null
	 */
	public FloatVariable(@Nonnull String name, boolean required, @Nullable FloatInput defaultValue) {
		super(EntityType.FLOAT, name, required, defaultValue);
	}

	/**
	 * @throws IllegalArgumentException if name is null
	 */
	public FloatVariable(@Nonnull String name, boolean required) {
		super(EntityType.FLOAT, name, required);
	}
	
	/**
	 * @throws IllegalArgumentException if name is null
	 */
	public FloatVariable(@Nonnull String name) {
		super(EntityType.FLOAT, name);
	}
}
