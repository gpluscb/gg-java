package com.github.gpluscb.ggjava.entity.enums;

import com.github.gpluscb.ggjava.entity.EntityType;

import javax.annotation.Nonnull;

public enum SocialConnectionType implements GGEnum {
	TWITTER,
	TWITCH,
	DISCORD,
	MIXER;

	@Nonnull
	@Override
	public EntityType getGGEntityType() {
		return EntityType.SOCIAL_CONNECTION;
	}
}
