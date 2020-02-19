package com.github.gpluscb.ggjava.entity.enums;

import com.github.gpluscb.ggjava.entity.EntityType;
import javax.annotation.Nonnull;

public enum RaceLimitMode implements GGEnum {
	BEST_ALL,
	FIRST_ALL,
	PLAYTIME;
	
	@Nonnull
	@Override
	public EntityType getType() {
		return EntityType.RACE_LIMIT_MODE;
	}
}
