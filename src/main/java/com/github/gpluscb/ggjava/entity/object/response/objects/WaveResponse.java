package com.github.gpluscb.ggjava.entity.object.response.objects;

import com.github.gpluscb.ggjava.entity.EntityType;
import com.github.gpluscb.ggjava.entity.object.response.AbstractGGResponseObject;
import com.github.gpluscb.ggjava.entity.object.response.scalars.IDResponse;
import com.github.gpluscb.ggjava.entity.object.response.scalars.StringResponse;
import com.github.gpluscb.ggjava.entity.object.response.scalars.TimestampResponse;

/**
 * A wave in a tournament
 */
public class WaveResponse extends AbstractGGResponseObject {
	private final IDResponse id;
	private final StringResponse identifier;
	private final TimestampResponse startAt;

	public WaveResponse() {
		super(EntityType.WAVE);

		id = null;
		identifier = null;
		startAt = null;
	}

	public WaveResponse(IDResponse id, StringResponse identifier, TimestampResponse startAt) {
		super(EntityType.WAVE, true);
		this.id = id;
		this.identifier = identifier;
		this.startAt = startAt;
	}

	public IDResponse getId() {
		checkProvided();
		return id;
	}

	/**
	 * The Wave Identifier
	 */
	public StringResponse getIdentifier() {
		checkProvided();
		return identifier;
	}

	/**
	 * Unix time the wave is scheduled to start.
	 */
	public TimestampResponse getStartAt() {
		checkProvided();
		return startAt;
	}
}
