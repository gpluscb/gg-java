package com.github.gpluscb.ggjava.entity.object.response.objects;

import com.github.gpluscb.ggjava.entity.EntityType;
import com.github.gpluscb.ggjava.entity.object.response.enums.BracketTypeResponse;
import com.github.gpluscb.ggjava.entity.object.response.enums.ComparatorResponse;
import com.github.gpluscb.ggjava.entity.object.response.enums.RaceLimitModeResponse;
import com.github.gpluscb.ggjava.entity.object.response.enums.RaceTypeResponse;
import com.github.gpluscb.ggjava.entity.object.response.interfaces.BracketConfigResponse;
import com.github.gpluscb.ggjava.entity.object.response.scalars.IntResponse;
import com.github.gpluscb.ggjava.entity.object.response.scalars.StringResponse;
import com.github.gpluscb.ggjava.entity.object.response.scalars.TimestampResponse;

/**
 * Race specific bracket configuration
 */
public class RaceBracketConfigResponse extends BracketConfigResponse {
	private final RaceTypeResponse raceType;
	private final StringResponse goalTargetValue;
	private final ComparatorResponse goalTargetComparator;
	private final RaceLimitModeResponse limitMode;
	private final IntResponse limitValue;
	private final TimestampResponse automaticStartTime;
	private final TimestampResponse automaticEndTime;

	public RaceBracketConfigResponse() {
		super(EntityType.RACE_BRACKET_CONFIG);

		raceType = null;
		goalTargetValue = null;
		goalTargetComparator = null;
		limitMode = null;
		limitValue = null;
		automaticStartTime = null;
		automaticEndTime = null;
	}

	public RaceBracketConfigResponse(IntResponse id, BracketTypeResponse bracketType, RaceTypeResponse raceType, StringResponse goalTargetValue, ComparatorResponse goalTargetComparator, RaceLimitModeResponse limitMode, IntResponse limitValue, TimestampResponse automaticStartTime, TimestampResponse automaticEndTime) {
		super(EntityType.RACE_BRACKET_CONFIG, id, bracketType);
		this.raceType = raceType;
		this.goalTargetValue = goalTargetValue;
		this.goalTargetComparator = goalTargetComparator;
		this.limitMode = limitMode;
		this.limitValue = limitValue;
		this.automaticStartTime = automaticStartTime;
		this.automaticEndTime = automaticEndTime;
	}

	public RaceTypeResponse getRaceType() {
		checkProvided();
		return raceType;
	}

	public StringResponse getGoalTargetValue() {
		checkProvided();
		return goalTargetValue;
	}

	public ComparatorResponse getGoalTargetComparator() {
		checkProvided();
		return goalTargetComparator;
	}

	public RaceLimitModeResponse getLimitMode() {
		checkProvided();
		return limitMode;
	}

	public IntResponse getLimitValue() {
		checkProvided();
		return limitValue;
	}

	public TimestampResponse getAutomaticStartTime() {
		checkProvided();
		return automaticStartTime;
	}

	public TimestampResponse getAutomaticEndTime() {
		checkProvided();
		return automaticEndTime;
	}
}
