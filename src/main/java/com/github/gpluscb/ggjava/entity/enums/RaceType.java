package com.github.gpluscb.ggjava.entity.enums;

import com.github.gpluscb.ggjava.entity.EntityType;

import javax.annotation.Nonnull;

/**
 * Race type
 */
public enum RaceType implements GGEnum {
	GOALS,
	TIMED;

	@Nonnull
	@Override
	public EntityType getGGEntityType() {
		return EntityType.RACE_TYPE;
	}
}
