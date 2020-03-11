package com.github.gpluscb.ggjava.entity.enums;

import com.github.gpluscb.ggjava.entity.EntityType;

import javax.annotation.Nonnull;

/**
 * Represents the type of stream service
 */
public enum StreamType implements GGEnum {
	TWITCH,
	MIXER;

	@Nonnull
	@Override
	public EntityType getGGEntityType() {
		return EntityType.STREAM_TYPE;
	}
}
