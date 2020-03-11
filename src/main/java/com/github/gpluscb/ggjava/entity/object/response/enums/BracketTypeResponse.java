package com.github.gpluscb.ggjava.entity.object.response.enums;

import com.github.gpluscb.ggjava.entity.EntityType;
import com.github.gpluscb.ggjava.entity.enums.BracketType;

import javax.annotation.Nonnull;

/**
 * The type of Bracket format that a Phase is configured with.
 */
public class BracketTypeResponse extends EnumResponse<BracketType> {
	public BracketTypeResponse() {
		super(EntityType.BRACKET_TYPE);
	}

	public BracketTypeResponse(@Nonnull BracketType value) {
		super(EntityType.BRACKET_TYPE, value);
	}
}
