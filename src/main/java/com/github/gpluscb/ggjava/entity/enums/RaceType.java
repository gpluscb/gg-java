package com.github.gpluscb.ggjava.entity.enums;

import com.github.gpluscb.ggjava.entity.EntityType;
import javax.annotation.Nonnull;

public enum RaceType implements GGEnum {
	GOALS,
	TIMED;
	
	@Nonnull
	@Override
	public EntityType getType() {
		return EntityType.RACE_TYPE;
	}
}
