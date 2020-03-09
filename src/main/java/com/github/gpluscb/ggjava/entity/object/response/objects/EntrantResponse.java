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
	private final StringResponse name;
	private final ListResponse<ParticipantResponse> participants;
	private final ListResponse<SeedResponse> seeds;
	private final IntResponse skill;
	private final StandingResponse standing;
	private final StreamsResponse stream;
	private final ListResponse<StreamsResponse> streams;

	public EntrantResponse() {
		super(EntityType.ENTRANT);

		id = null;
		event = null;
		name = null;
		participants = null;
		seeds = null;
		skill = null;
		standing = null;
		stream = null;
		streams = null;
	}

	public EntrantResponse(IDResponse id, EventResponse event, StringResponse name, ListResponse<ParticipantResponse> participants, ListResponse<SeedResponse> seeds, IntResponse skill, StandingResponse standing, StreamsResponse stream, ListResponse<StreamsResponse> streams) {
		super(EntityType.ENTRANT, true);
		this.id = id;
		this.event = event;
		this.name = name;
		this.participants = participants;
		this.seeds = seeds;
		this.skill = skill;
		this.standing = standing;
		this.stream = stream;
		this.streams = streams;
	}

	public IDResponse getId() {
		checkProvided();
		return id;
	}

	public EventResponse getEvent() {
		checkProvided();
		return event;
	}

	/**
	 * The entrant name as it appears in bracket: gamerTag of the participant or team name
	 */
	public StringResponse getName() {
		checkProvided();
		return name;
	}

	public ListResponse<ParticipantResponse> getParticipants() {
		checkProvided();
		return participants;
	}

	public ListResponse<SeedResponse> getSeeds() {
		checkProvided();
		return seeds;
	}

	public IntResponse getSkill() {
		checkProvided();
		return skill;
	}

	/**
	 * Standing for this entrant given an event. All entrants queried must be in the same event (for now).
	 */
	public StandingResponse getStanding() {
		checkProvided();
		return standing;
	}

	/**
	 * @deprecated DEPRECATED. Use streams instead, which supports multiple stream types and teams.
	 */
	@Deprecated
	public StreamsResponse getStream() {
		checkProvided();
		return stream;
	}

	public ListResponse<StreamsResponse> getStreams() {
		checkProvided();
		return streams;
	}
}
