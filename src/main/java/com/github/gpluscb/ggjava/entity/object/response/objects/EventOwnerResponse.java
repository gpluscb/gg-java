package com.github.gpluscb.ggjava.entity.object.response.objects;

import com.github.gpluscb.ggjava.entity.EntityType;
import com.github.gpluscb.ggjava.entity.object.response.AbstractGGResponseObject;
import com.github.gpluscb.ggjava.entity.object.response.scalars.IDResponse;
import com.github.gpluscb.ggjava.entity.object.response.scalars.StringResponse;

/**
 * Name and Gamertag of the owner of an event in a league
 */
public class EventOwnerResponse extends AbstractGGResponseObject {
	private final IDResponse eventId;
	private final StringResponse email;
	private final StringResponse gamerTag;
	private final StringResponse fullName;

	public EventOwnerResponse() {
		super(EntityType.EVENT_OWNER);

		eventId = null;
		email = null;
		gamerTag = null;
		fullName = null;
	}

	public EventOwnerResponse(IDResponse eventId, StringResponse email, StringResponse gamerTag, StringResponse fullName) {
		super(EntityType.EVENT_OWNER, true);
		this.eventId = eventId;
		this.email = email;
		this.gamerTag = gamerTag;
		this.fullName = fullName;
	}

	public IDResponse getEventId() {
		checkProvided();
		return eventId;
	}

	public StringResponse getEmail() {
		checkProvided();
		return email;
	}

	public StringResponse getGamerTag() {
		checkProvided();
		return gamerTag;
	}

	public StringResponse getFullName() {
		checkProvided();
		return fullName;
	}
}
