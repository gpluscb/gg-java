package com.github.gpluscb.ggjava.entity.object.response.enums;

import com.github.gpluscb.ggjava.entity.EntityType;
import com.github.gpluscb.ggjava.entity.enums.ActivityState;

import javax.annotation.Nonnull;

public class ActivityStateResponse extends EnumResponse<ActivityState> {
	public ActivityStateResponse() {
		super(EntityType.ACTIVITY_STATE);
	}

	public ActivityStateResponse(@Nonnull ActivityState value) {
		super(EntityType.ACTIVITY_STATE, value);
	}
}
