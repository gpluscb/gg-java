package com.github.gpluscb.ggjava.entity.object.response.objects;

import com.github.gpluscb.ggjava.entity.EntityType;
import com.github.gpluscb.ggjava.entity.object.response.AbstractGGResponseObject;
import com.github.gpluscb.ggjava.entity.object.response.scalars.IDResponse;
import com.github.gpluscb.ggjava.entity.object.response.scalars.StringResponse;

/**
 * A team, usually within the context of an event
 */
public class TeamResponse extends AbstractGGResponseObject {
	private final IDResponse id;
	private final EntrantResponse entrant;
	private final EventResponse event;
	private final StringResponse name;

	public TeamResponse() {
		super(EntityType.TEAM);

		id = null;
		entrant = null;
		event = null;
		name = null;
	}

	public TeamResponse(IDResponse id, EntrantResponse entrant, EventResponse event, StringResponse name) {
		super(EntityType.TEAM, true);
		this.id = id;
		this.entrant = entrant;
		this.event = event;
		this.name = name;
	}

	public IDResponse getId() {
		checkProvided();
		return id;
	}

	public EntrantResponse getEntrant() {
		checkProvided();
		return entrant;
	}

	public EventResponse getEvent() {
		checkProvided();
		return event;
	}

	public StringResponse getName() {
		checkProvided();
		return name;
	}
}
