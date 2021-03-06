package com.github.gpluscb.ggjava.entity.enums;

import com.github.gpluscb.ggjava.entity.EntityType;

import javax.annotation.Nonnull;

/**
 * Represents the source of a stream
 */
public enum StreamSource implements GGEnum {
	/**
	 * Stream is on twitch.tv channel
	 */
	TWITCH,
	/**
	 * Stream is on smashcast.tv channel
	 */
	HITBOX,
	/**
	 * Stream is on a stream.me channel
	 */
	STREAMME,
	/**
	 * Stream is on a mixer.com channel
	 */
	MIXER;

	@Nonnull
	@Override
	public EntityType getGGEntityType() {
		return EntityType.STREAM_SOURCE;
	}
}
