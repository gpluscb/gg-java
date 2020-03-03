package com.github.gpluscb.ggjava.entity.object.response.objects;

import com.github.gpluscb.ggjava.entity.EntityType;
import com.github.gpluscb.ggjava.entity.object.response.AbstractGGResponseObject;
import com.github.gpluscb.ggjava.entity.object.response.ListResponse;
import com.github.gpluscb.ggjava.entity.object.response.scalars.IDResponse;
import com.github.gpluscb.ggjava.entity.object.response.scalars.IntResponse;
import com.github.gpluscb.ggjava.entity.object.response.scalars.StringResponse;

/**
 * An entrant in an event
 */
public class EntrantResponse extends AbstractGGResponseObject {
	private final IDResponse id;
	private final EventResponse event;
	private final ListResponse<SeedResponse> seeds;
	private final ListResponse<ParticipantResponse> participants;
	private final StreamsResponse stream;
	private final ListResponse<StreamsResponse> streams;
	private final StringResponse name;
	private final IntResponse eventId;
	private final IntResponse skill;

	public EntrantResponse() {
		super(EntityType.ENTRANT);

		id = null;
		event = null;
		seeds = null;
		participants = null;
		stream = null;
		streams = null;
		name = null;
		eventId = null;
		skill = null;
	}

	public EntrantResponse(IDResponse id, EventResponse event, ListResponse<SeedResponse> seeds, ListResponse<ParticipantResponse> participants, StreamsResponse stream, ListResponse<StreamsResponse> streams, StringResponse name, IntResponse eventId, IntResponse skill) {
		super(EntityType.ENTRANT, true);
		this.id = id;
		this.event = event;
		this.seeds = seeds;
		this.participants = participants;
		this.stream = stream;
		this.streams = streams;
		this.name = name;
		this.eventId = eventId;
		this.skill = skill;
	}

	public IDResponse getId() {
		checkProvided();
		return id;
	}

	public EventResponse getEvent() {
		checkProvided();
		return event;
	}

	public ListResponse<SeedResponse> getSeeds() {
		checkProvided();
		return seeds;
	}

	public ListResponse<ParticipantResponse> getParticipants() {
		checkProvided();
		return participants;
	}

	@Deprecated
	public StreamsResponse getStream() {
		checkProvided();
		return stream;
	}

	public ListResponse<StreamsResponse> getStreams() {
		checkProvided();
		return streams;
	}

	/**
	 * The entrant name as it appears in bracket: gamerTag of the participant or team name
	 */
	public StringResponse getName() {
		checkProvided();
		return name;
	}

	public IntResponse getEventId() {
		checkProvided();
		return eventId;
	}

	public IntResponse getSkill() {
		checkProvided();
		return skill;
	}
}
