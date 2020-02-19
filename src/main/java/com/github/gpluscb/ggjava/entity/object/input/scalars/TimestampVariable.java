package com.github.gpluscb.ggjava.entity.object.input.scalars;

import com.github.gpluscb.ggjava.entity.EntityType;
import javax.annotation.Nonnull;
import javax.annotation.Nullable;

import com.github.gpluscb.ggjava.entity.object.input.InputVariable;
import com.github.gpluscb.ggjava.entity.object.scalars.GGTimestamp;

public class TimestampVariable extends InputVariable<TimestampInput> {
	/**
	 * @throws IllegalArgumentException if name is null
	 */
	public TimestampVariable(@Nonnull String name, boolean required, @Nullable TimestampInput defaultValue) {
		super(EntityType.TIMESTAMP, name, required, defaultValue);
	}

	/**
	 * @throws IllegalArgumentException if name is null
	 */
	public TimestampVariable(@Nonnull String name, boolean required) {
		super(EntityType.TIMESTAMP, name, required);
	}
	
	/**
	 * @throws IllegalArgumentException if name is null
	 */
	public TimestampVariable(@Nonnull String name) {
		super(EntityType.TIMESTAMP, name);
	}
}
