package com.github.gpluscb.ggjava.entity.enums;

import com.github.gpluscb.ggjava.entity.EntityType;

import javax.annotation.Nonnull;

/**
 * Represents the name of the third-party service (e.g Twitter) for OAuth
 */
public enum AuthorizationType implements GGEnum {
	TWITTER,
	TWITCH,
	STEAM,
	DISCORD,
	MIXER;

	@Nonnull
	@Override
	public EntityType getGGEntityType() {
		return EntityType.AUTHORIZATION_TYPE;
	}
}
