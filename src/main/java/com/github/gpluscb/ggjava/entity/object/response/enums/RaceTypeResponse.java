package com.github.gpluscb.ggjava.entity.object.response.enums;

import com.github.gpluscb.ggjava.entity.EntityType;
import com.github.gpluscb.ggjava.entity.enums.RaceType;

import javax.annotation.Nonnull;

/**
 * Race type
 */
public class RaceTypeResponse extends EnumResponse<RaceType> {
	public RaceTypeResponse() {
		super(EntityType.RACE_TYPE);
	}

	public RaceTypeResponse(@Nonnull RaceType value) {
		super(EntityType.RACE_TYPE, value);
	}
}
