package com.github.gpluscb.ggjava.entity.object.response.objects;

import com.github.gpluscb.ggjava.entity.EntityType;
import com.github.gpluscb.ggjava.entity.object.response.AbstractGGResponseObject;
import com.github.gpluscb.ggjava.entity.object.response.ListResponse;

public class QueryResponse extends AbstractGGResponseObject {
	private final UserResponse currentUser;
	private final EventResponse event;
	private final LeagueResponse league;
	private final ParticipantResponse participant;
	private final PhaseResponse phase;
	private final PhaseGroupResponse phaseGroup;
	private final PlayerResponse player;
	private final SeedResponse seed;
	private final SetResponse set;
	private final ShopResponse shop;
	private final StreamsResponse stream;
	private final ListResponse<StreamQueueInfoResponse> streamQueue;
	private final TournamentResponse tournament;
	private final TournamentConnectionResponse tournaments;
	private final UserResponse user;
	private final VideogameResponse videogame;
	private final VideogameConnectionResponse videogames;

	public QueryResponse() {
		super(EntityType.QUERY);

		currentUser = null;
		event = null;
		league = null;
		participant = null;
		phase = null;
		phaseGroup = null;
		player = null;
		seed = null;
		set = null;
		shop = null;
		stream = null;
		streamQueue = null;
		tournament = null;
		tournaments = null;
		user = null;
		videogame = null;
		videogames = null;
	}

	public QueryResponse(UserResponse currentUser, EventResponse event, LeagueResponse league, ParticipantResponse participant, PhaseResponse phase, PhaseGroupResponse phaseGroup, PlayerResponse player, SeedResponse seed, SetResponse set, ShopResponse shop, StreamsResponse stream, ListResponse<StreamQueueInfoResponse> streamQueue, TournamentResponse tournament, TournamentConnectionResponse tournaments, UserResponse user, VideogameResponse videogame, VideogameConnectionResponse videogames) {
		super(EntityType.QUERY, true);
		this.currentUser = currentUser;
		this.event = event;
		this.league = league;
		this.participant = participant;
		this.phase = phase;
		this.phaseGroup = phaseGroup;
		this.player = player;
		this.seed = seed;
		this.set = set;
		this.shop = shop;
		this.stream = stream;
		this.streamQueue = streamQueue;
		this.tournament = tournament;
		this.tournaments = tournaments;
		this.user = user;
		this.videogame = videogame;
		this.videogames = videogames;
	}

	/**
	 * Returns the authenticated user
	 */
	public UserResponse getCurrentUser() {
		checkProvided();
		return currentUser;
	}

	/**
	 * Returns an event given its id or slug
	 */
	public EventResponse getEvent() {
		checkProvided();
		return event;
	}

	/**
	 * Returns a league given its id or slug
	 */
	public LeagueResponse getLeague() {
		checkProvided();
		return league;
	}

	/**
	 * Returns a participant given its id
	 */
	public ParticipantResponse getParticipant() {
		checkProvided();
		return participant;
	}

	/**
	 * Returns a phase given its id
	 */
	public PhaseResponse getPhase() {
		checkProvided();
		return phase;
	}

	/**
	 * Returns a phase group given its id
	 */
	public PhaseGroupResponse getPhaseGroup() {
		checkProvided();
		return phaseGroup;
	}

	/**
	 * Returns a player given an id
	 */
	public PlayerResponse getPlayer() {
		checkProvided();
		return player;
	}

	/**
	 * Returns a phase seed given its id
	 */
	public SeedResponse getSeed() {
		checkProvided();
		return seed;
	}

	/**
	 * Returns a set given its id
	 */
	public SetResponse getSet() {
		checkProvided();
		return set;
	}

	/**
	 * A shop entity
	 */
	public ShopResponse getShop() {
		checkProvided();
		return shop;
	}

	/**
	 * Returns an stream given its id
	 */
	public StreamsResponse getStream() {
		checkProvided();
		return stream;
	}

	/**
	 * Returns all the stream queues for a given tournament
	 */
	public ListResponse<StreamQueueInfoResponse> getStreamQueue() {
		checkProvided();
		return streamQueue;
	}

	/**
	 * Returns a tournament given its id or slug
	 */
	public TournamentResponse getTournament() {
		checkProvided();
		return tournament;
	}

	/**
	 * Paginated, filterable list of tournaments
	 */
	public TournamentConnectionResponse getTournaments() {
		checkProvided();
		return tournaments;
	}

	/**
	 * Returns a user given a userId or slug
	 */
	public UserResponse getUser() {
		checkProvided();
		return user;
	}

	/**
	 * Returns a videogame given its id
	 */
	public VideogameResponse getVideogame() {
		checkProvided();
		return videogame;
	}

	/**
	 * Returns paginated list of videogames matching the search criteria.
	 */
	public VideogameConnectionResponse getVideogames() {
		checkProvided();
		return videogames;
	}
}
