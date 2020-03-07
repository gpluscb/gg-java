package com.github.gpluscb.ggjava.entity.object.response.enums;

import com.github.gpluscb.ggjava.entity.EntityType;
import com.github.gpluscb.ggjava.entity.enums.RaceLimitMode;

import javax.annotation.Nonnull;

public class RaceLimitModeResponse extends EnumResponse<RaceLimitMode> {
	public RaceLimitModeResponse() {
		super(EntityType.RACE_LIMIT_MODE);
	}

	public RaceLimitModeResponse(@Nonnull RaceLimitMode value) {
		super(EntityType.RACE_LIMIT_MODE, value);
	}
}
