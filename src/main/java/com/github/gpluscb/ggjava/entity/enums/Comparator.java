package com.github.gpluscb.ggjava.entity.enums;

import com.github.gpluscb.ggjava.entity.EntityType;

import javax.annotation.Nonnull;

public enum Comparator implements GGEnum {
	GREATER_THAN,
	GREATER_THAN_OR_EQUAL,
	EQUAL,
	LESS_THAN_OR_EQUAL,
	LESS_THAN;

	@Nonnull
	@Override
	public EntityType getGGEntityType() {
		return EntityType.COMPARATOR;
	}
}
