package com.github.gpluscb.ggjava.entity.object.input.enums;

import com.github.gpluscb.ggjava.entity.EntityType;
import javax.annotation.Nonnull;
import javax.annotation.Nullable;

import com.github.gpluscb.ggjava.entity.object.input.InputVariable;

public class ActivityStateVariable extends InputVariable<ActivityStateInput> {
	/**
	 * @throws IllegalArgumentException if name is null
	 */
	public ActivityStateVariable(@Nonnull String name, boolean required, @Nullable ActivityStateInput defaultValue) {
		super(EntityType.ACTIVITY_STATE, name, required, defaultValue);
	}

	/**
	 * @throws IllegalArgumentException if name is null
	 */
	public ActivityStateVariable(@Nonnull String name, boolean required) {
		super(EntityType.ACTIVITY_STATE, name, required);
	}
	
	/**
	 * @throws IllegalArgumentException if name is null
	 */
	public ActivityStateVariable(@Nonnull String name) {
		super(EntityType.ACTIVITY_STATE, name);
	}
}
