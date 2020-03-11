package com.github.gpluscb.ggjava.entity.enums;

import com.github.gpluscb.ggjava.entity.EntityType;

import javax.annotation.Nonnull;

/**
 * Enforces limits on the amount of allowable Race submissions
 */
public enum RaceLimitMode implements GGEnum {
	BEST_ALL,
	FIRST_ALL,
	PLAYTIME;

	@Nonnull
	@Override
	public EntityType getGGEntityType() {
		return EntityType.RACE_LIMIT_MODE;
	}
}
