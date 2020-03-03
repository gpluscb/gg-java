package com.github.gpluscb.ggjava.entity.object.response.objects;

import com.github.gpluscb.ggjava.entity.EntityType;
import com.github.gpluscb.ggjava.entity.object.response.AbstractGGResponseObject;
import com.github.gpluscb.ggjava.entity.object.response.scalars.IDResponse;
import com.github.gpluscb.ggjava.entity.object.response.scalars.IntResponse;
import com.github.gpluscb.ggjava.entity.object.response.scalars.StringResponse;

/**
 * A team, usually within the context of an event
 */
public class TeamResponse extends AbstractGGResponseObject {
	private final IDResponse id;
	private final StringResponse name;
	private final IntResponse entrantId;
	private final IntResponse eventId;

	public TeamResponse() {
		super(EntityType.TEAM);

		id = null;
		name = null;
		entrantId = null;
		eventId = null;
	}

	public TeamResponse(IDResponse id, StringResponse name, IntResponse entrantId, IntResponse eventId) {
		super(EntityType.TEAM, true);
		this.id = id;
		this.name = name;
		this.entrantId = entrantId;
		this.eventId = eventId;
	}

	public IDResponse getId() {
		checkProvided();
		return id;
	}

	public StringResponse getName() {
		checkProvided();
		return name;
	}

	public IntResponse getEntrantId() {
		checkProvided();
		return entrantId;
	}

	public IntResponse getEventId() {
		checkProvided();
		return eventId;
	}
}
