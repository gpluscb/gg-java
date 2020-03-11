package com.github.gpluscb.ggjava.entity.enums;

import com.github.gpluscb.ggjava.entity.EntityType;

import javax.annotation.Nonnull;

/**
 * Different sort type configurations used when displaying multiple sets
 */
public enum SetSortType implements GGEnum {
	/**
	 * No sort
	 */
	NONE,
	/**
	 * Default sort
	 */
	STANDARD,
	/**
	 * Sorts sets in order that admin would be interested in.
	 */
	ADMIN,
	/**
	 * Sorts so that the most relevant sets are shown first.
	 */
	MAGIC;

	@Nonnull
	@Override
	public EntityType getGGEntityType() {
		return EntityType.SET_SORT_TYPE;
	}
}
