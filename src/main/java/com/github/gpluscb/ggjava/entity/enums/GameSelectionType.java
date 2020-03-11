package com.github.gpluscb.ggjava.entity.enums;

import com.github.gpluscb.ggjava.entity.EntityType;

import javax.annotation.Nonnull;

/**
 * The type of selection i.e. is it for a character or something else
 */
public enum GameSelectionType implements GGEnum {
	/**
	 * Character selection
	 */
	CHARACTER;

	@Nonnull
	@Override
	public EntityType getGGEntityType() {
		return EntityType.GAME_SELECTION_TYPE;
	}
}
