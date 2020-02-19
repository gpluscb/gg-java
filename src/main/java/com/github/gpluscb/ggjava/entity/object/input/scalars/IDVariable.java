package com.github.gpluscb.ggjava.entity.object.input.scalars;

import com.github.gpluscb.ggjava.entity.EntityType;
import javax.annotation.Nonnull;
import javax.annotation.Nullable;

import com.github.gpluscb.ggjava.entity.object.input.InputVariable;
import com.github.gpluscb.ggjava.entity.object.scalars.GGID;

public class IDVariable extends InputVariable<IDInput> {
	/**
	 * @throws IllegalArgumentException if name is null
	 */
	public IDVariable(@Nonnull String name, boolean required, @Nullable IDInput defaultValue) {
		super(EntityType.ID, name, required, defaultValue);
	}

	/**
	 * @throws IllegalArgumentException if name is null
	 */
	public IDVariable(@Nonnull String name, boolean required) {
		super(EntityType.ID, name, required);
	}
	
	/**
	 * @throws IllegalArgumentException if name is null
	 */
	public IDVariable(@Nonnull String name) {
		super(EntityType.ID, name);
	}
}
