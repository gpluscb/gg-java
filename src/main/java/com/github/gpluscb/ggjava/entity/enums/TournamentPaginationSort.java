package com.github.gpluscb.ggjava.entity.enums;

import com.github.gpluscb.ggjava.entity.EntityType;

import javax.annotation.Nonnull;

public enum TournamentPaginationSort implements GGEnum {
	startAt,
	endAt,
	eventRegistrationClosesAt;

	@Nonnull
	@Override
	public EntityType getGGEntityType() {
		return EntityType.TOURNAMENT_PAGINATION_SORT;
	}
}
