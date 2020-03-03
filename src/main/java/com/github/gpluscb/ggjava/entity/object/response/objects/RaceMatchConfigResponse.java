package com.github.gpluscb.ggjava.entity.object.response.objects;

import com.github.gpluscb.ggjava.entity.EntityType;
import com.github.gpluscb.ggjava.entity.object.response.ListResponse;
import com.github.gpluscb.ggjava.entity.object.response.enums.BracketTypeResponse;
import com.github.gpluscb.ggjava.entity.object.response.enums.MatchConfigVerificationMethodResponse;
import com.github.gpluscb.ggjava.entity.object.response.interfaces.MatchConfigResponse;
import com.github.gpluscb.ggjava.entity.object.response.scalars.BooleanResponse;
import com.github.gpluscb.ggjava.entity.object.response.scalars.IntResponse;

/**
 * Race specific match configuration
 */
public class RaceMatchConfigResponse extends MatchConfigResponse {
	private final BooleanResponse playerReportingEnabled;
	private final BooleanResponse verificationRequired;
	private final ListResponse<MatchConfigVerificationMethodResponse> verificationMethods;

	public RaceMatchConfigResponse() {
		super(EntityType.RACE_MATCH_CONFIG);

		playerReportingEnabled = null;
		verificationRequired = null;
		verificationMethods = null;
	}

	public RaceMatchConfigResponse(IntResponse id, BracketTypeResponse bracketType, BooleanResponse playerReportingEnabled, BooleanResponse verificationRequired, ListResponse<MatchConfigVerificationMethodResponse> verificationMethods) {
		super(EntityType.RACE_MATCH_CONFIG, id, bracketType);
		this.playerReportingEnabled = playerReportingEnabled;
		this.verificationRequired = verificationRequired;
		this.verificationMethods = verificationMethods;
	}

	/**
	 * Can players report results?
	 */
	public BooleanResponse getPlayerReportingEnabled() {
		checkProvided();
		return playerReportingEnabled;
	}

	/**
	 * Are players required to submit verification of their reported results?
	 */
	public BooleanResponse getVerificationRequired() {
		checkProvided();
		return verificationRequired;
	}

	/**
	 * Accepted methods of verification that players can use
	 */
	public ListResponse<MatchConfigVerificationMethodResponse> getVerificationMethods() {
		checkProvided();
		return verificationMethods;
	}
}
