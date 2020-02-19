package com.github.gpluscb.ggjava.entity.object.input.enums;

import com.github.gpluscb.ggjava.entity.EntityType;
import javax.annotation.Nonnull;

import com.github.gpluscb.ggjava.entity.enums.ActivityState;

public class ActivityStateInput extends EnumInput<ActivityState> {
	/**
	 * @throws IllegalArgumentException if value is null
	 */
	public ActivityStateInput(@Nonnull ActivityState value) throws IllegalArgumentException {
		super(EntityType.ACTIVITY_STATE, value);
	}
}
