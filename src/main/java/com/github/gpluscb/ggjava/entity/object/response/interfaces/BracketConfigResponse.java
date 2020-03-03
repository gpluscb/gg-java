package com.github.gpluscb.ggjava.entity.object.response.interfaces;

import com.github.gpluscb.ggjava.entity.EntityType;
import com.github.gpluscb.ggjava.entity.enums.BracketType;
import com.github.gpluscb.ggjava.entity.object.response.AbstractGGResponseObject;
import com.github.gpluscb.ggjava.entity.object.response.enums.BracketTypeResponse;
import com.github.gpluscb.ggjava.entity.object.response.scalars.IntResponse;
import com.github.gpluscb.ggjava.entity.object.scalars.GGInt;

import javax.annotation.Nonnull;

public abstract class BracketConfigResponse extends AbstractGGResponseObject {
	private final IntResponse id;
	private final BracketTypeResponse bracketType;

	public BracketConfigResponse(@Nonnull EntityType type) {
		super(type);
		id = null;
		bracketType = null;
	}

	public BracketConfigResponse(@Nonnull EntityType type, IntResponse id, BracketTypeResponse bracketType) {
		super(type, true);
		this.id = id;
		this.bracketType = bracketType;
	}

	/**
	 * @throws IllegalStateException if this is not provided
	 */
	public GGInt getId() {
		checkProvided();
		return id;
	}

	/**
	 * @throws IllegalStateException if this is not provided
	 */
	public BracketTypeResponse getBracketTypeResponse() {
		checkProvided();
		return bracketType;
	}

	/**
	 * @throws IllegalStateException if this is not provided
	 */
	public BracketType getBracketType() {
		return getBracketTypeResponse().getResponse();
	}
}
