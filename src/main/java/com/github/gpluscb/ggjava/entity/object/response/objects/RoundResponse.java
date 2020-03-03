package com.github.gpluscb.ggjava.entity.object.response.objects;

import com.github.gpluscb.ggjava.entity.EntityType;
import com.github.gpluscb.ggjava.entity.object.response.AbstractGGResponseObject;
import com.github.gpluscb.ggjava.entity.object.response.scalars.IDResponse;
import com.github.gpluscb.ggjava.entity.object.response.scalars.IntResponse;
import com.github.gpluscb.ggjava.entity.object.response.scalars.TimestampResponse;

/**
 * A round within a phase group
 */
public class RoundResponse extends AbstractGGResponseObject {
	private final IDResponse id;
	private final IntResponse bestOf;
	private final IntResponse number;
	private final TimestampResponse startAt;

	public RoundResponse() {
		super(EntityType.ROUND);

		id = null;
		bestOf = null;
		number = null;
		startAt = null;
	}

	public RoundResponse(IDResponse id, IntResponse bestOf, IntResponse number, TimestampResponse startAt) {
		super(EntityType.ROUND, true);
		this.id = id;
		this.bestOf = bestOf;
		this.number = number;
		this.startAt = startAt;
	}

	public IDResponse getId() {
		checkProvided();
		return id;
	}

	/**
	 * If applicable, bestOf is the number of games
	 * one must win a majority out of to win a set in this round
	 */
	public IntResponse getBestOf() {
		checkProvided();
		return bestOf;
	}

	/**
	 * Indicates this round's order in the phase group
	 */
	public IntResponse getNumber() {
		checkProvided();
		return number;
	}

	/**
	 * The time that this round is scheduled to start at
	 */
	public TimestampResponse getStartAt() {
		checkProvided();
		return startAt;
	}
}
