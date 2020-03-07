package com.github.gpluscb.ggjava.entity.object.response.enums;

import com.github.gpluscb.ggjava.entity.EntityType;
import com.github.gpluscb.ggjava.entity.enums.MatchConfigVerificationMethod;

import javax.annotation.Nonnull;

/**
 * Different options available for verifying player-reported match results
 */
public class MatchConfigVerificationMethodResponse extends EnumResponse<MatchConfigVerificationMethod> {
	public MatchConfigVerificationMethodResponse() {
		super(EntityType.MATCH_CONFIG_VERIFICATION_METHOD);
	}

	public MatchConfigVerificationMethodResponse(@Nonnull MatchConfigVerificationMethod value) {
		super(EntityType.MATCH_CONFIG_VERIFICATION_METHOD, value);
	}
}
