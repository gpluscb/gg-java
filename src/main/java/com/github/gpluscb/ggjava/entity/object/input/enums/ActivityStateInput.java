package com.github.gpluscb.ggjava.entity.object.input.enums;

import com.github.gpluscb.ggjava.entity.EntityType;
import com.github.gpluscb.ggjava.entity.enums.ActivityState;

import javax.annotation.Nonnull;

public class ActivityStateInput extends EnumInput<ActivityState> {
	/**
	 * @throws IllegalArgumentException if value is null
	 */
	public ActivityStateInput(@Nonnull ActivityState value) throws IllegalArgumentException {
		super(EntityType.ACTIVITY_STATE, value);
	}
}
