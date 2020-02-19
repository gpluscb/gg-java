package com.github.gpluscb.ggjava.entity.enums;

import com.github.gpluscb.ggjava.entity.EntityType;
import javax.annotation.Nonnull;

public enum BracketType implements GGEnum {
	SINGLE_ELIMINATION,
	DOUBLE_ELIMINATION,
	ROUND_ROBIN,
	SWISS,
	EXHIBITION,
	CUSTOM_SCHEDULE,
	MATCHMAKING,
	ELIMINATION_ROUNDS,
	RACE;
	
	@Nonnull
	@Override
	public EntityType getType() {
		return EntityType.BRACKET_TYPE;
	}
}
