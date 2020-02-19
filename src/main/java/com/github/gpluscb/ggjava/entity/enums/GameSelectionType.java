package com.github.gpluscb.ggjava.entity.enums;

import com.github.gpluscb.ggjava.entity.EntityType;
import javax.annotation.Nonnull;

public enum GameSelectionType implements GGEnum {
	/**
	 * Character selection
	 */
	CHARACTER;
	
	@Nonnull
	@Override
	public EntityType getType() {
		return EntityType.GAME_SELECTION_TYPE;
	}
}
