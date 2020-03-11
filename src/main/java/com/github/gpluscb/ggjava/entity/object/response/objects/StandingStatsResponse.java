package com.github.gpluscb.ggjava.entity.object.response.objects;

import com.github.gpluscb.ggjava.entity.EntityType;
import com.github.gpluscb.ggjava.entity.object.response.AbstractGGResponseObject;

/**
 * Any stats related to this standing. This type is experimental and very likely to change in the future.
 */
public class StandingStatsResponse extends AbstractGGResponseObject {
	private final ScoreResponse score;

	public StandingStatsResponse() {
		super(EntityType.STANDING_STATS);

		score = null;
	}

	public StandingStatsResponse(ScoreResponse score) {
		super(EntityType.STANDING_STATS, true);
		this.score = score;
	}

	public ScoreResponse getScore() {
		checkProvided();
		return score;
	}
}
