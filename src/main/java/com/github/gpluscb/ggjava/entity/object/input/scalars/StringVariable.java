package com.github.gpluscb.ggjava.entity.object.input.scalars;

import com.github.gpluscb.ggjava.entity.EntityType;
import com.github.gpluscb.ggjava.entity.object.input.InputVariable;

import javax.annotation.Nonnull;
import javax.annotation.Nullable;

public class StringVariable extends InputVariable<StringInput> {
	/**
	 * @throws IllegalArgumentException if name is null
	 */
	public StringVariable(@Nonnull String name, boolean required, @Nullable StringInput defaultValue) {
		super(EntityType.STRING, name, required, defaultValue);
	}

	/**
	 * @throws IllegalArgumentException if name is null
	 */
	public StringVariable(@Nonnull String name, boolean required) {
		super(EntityType.STRING, name, required);
	}

	/**
	 * @throws IllegalArgumentException if name is null
	 */
	public StringVariable(@Nonnull String name) {
		super(EntityType.STRING, name);
	}
}
