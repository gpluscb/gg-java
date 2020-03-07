package com.github.gpluscb.ggjava.entity.enums;

import com.github.gpluscb.ggjava.entity.EntityType;

import javax.annotation.Nonnull;

/**
 * Different options available for verifying player-reported match results
 */
public enum MatchConfigVerificationMethod implements GGEnum {
	TWITCH,
	STREAM_ME,
	ANY,
	MIXER,
	YOUTUBE;

	@Nonnull
	@Override
	public EntityType getGGEntityType() {
		return EntityType.MATCH_CONFIG_VERIFICATION_METHOD;
	}
}
