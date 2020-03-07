package com.github.gpluscb.ggjava.entity.enums;

import com.github.gpluscb.ggjava.entity.EntityType;

import javax.annotation.Nonnull;

/**
 * The type of Bracket format that a Phase is configured with.
 */
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
	public EntityType getGGEntityType() {
		return EntityType.BRACKET_TYPE;
	}
}
