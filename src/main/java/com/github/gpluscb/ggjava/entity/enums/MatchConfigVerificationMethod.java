package com.github.gpluscb.ggjava.entity.enums;

import com.github.gpluscb.ggjava.entity.EntityType;
import javax.annotation.Nonnull;

public enum MatchConfigVerificationMethod implements GGEnum {
	TWITCH,
	STREAM_ME,
	ANY,
	MIXER,
	YOUTUBE;
	
	@Nonnull
	@Override
	public EntityType getType() {
		return EntityType.MATCH_CONFIG_VERIFICATION_METHOD;
	}
}
