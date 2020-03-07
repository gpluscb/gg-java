package com.github.gpluscb.ggjava.entity.object.response.enums;

import com.github.gpluscb.ggjava.entity.EntityType;
import com.github.gpluscb.ggjava.entity.enums.GameSelectionType;

import javax.annotation.Nonnull;

public class GameSelectionTypeResponse extends EnumResponse<GameSelectionType> {
	public GameSelectionTypeResponse() {
		super(EntityType.GAME_SELECTION_TYPE);
	}

	public GameSelectionTypeResponse(@Nonnull GameSelectionType value) {
		super(EntityType.GAME_SELECTION_TYPE, value);
	}
}
