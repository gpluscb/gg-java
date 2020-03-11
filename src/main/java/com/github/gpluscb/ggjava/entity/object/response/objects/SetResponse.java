package com.github.gpluscb.ggjava.entity.object.response.objects;

import com.github.gpluscb.ggjava.entity.EntityType;
import com.github.gpluscb.ggjava.entity.object.response.AbstractGGResponseObject;
import com.github.gpluscb.ggjava.entity.object.response.ListResponse;
import com.github.gpluscb.ggjava.entity.object.response.scalars.*;

/**
 * A set
 */
public class SetResponse extends AbstractGGResponseObject {
	private final IDResponse id;
	private final TimestampResponse completedAt;
	private final TimestampResponse createdAt;
	private final StringResponse displayScore;
	private final EventResponse event;
	private final StringResponse fullRoundText;
	private final GameResponse game;
	private final ListResponse<GameResponse> games;
	private final BooleanResponse hasPlaceholder;
	private final StringResponse identifier;
	private final ListResponse<ImageResponse> images;
	private final IntResponse lPlacement;
	private final PhaseGroupResponse phaseGroup;
	private final IntResponse round;
	private final IntResponse setGamesType;
	private final ListResponse<SetSlotResponse> slots;
	private final TimestampResponse startedAt;
	private final IntResponse state;
	private final StationsResponse station;
	private final StreamsResponse stream;
	private final IntResponse totalGames;
	private final StringResponse vodUrl;
	private final IntResponse wPlacement;
	private final IntResponse winnerId;

	public SetResponse() {
		super(EntityType.SET);

		id = null;
		completedAt = null;
		createdAt = null;
		displayScore = null;
		event = null;
		fullRoundText = null;
		game = null;
		games = null;
		hasPlaceholder = null;
		identifier = null;
		images = null;
		lPlacement = null;
		phaseGroup = null;
		round = null;
		setGamesType = null;
		slots = null;
		startedAt = null;
		state = null;
		station = null;
		stream = null;
		totalGames = null;
		vodUrl = null;
		wPlacement = null;
		winnerId = null;
	}

	public SetResponse(IDResponse id, TimestampResponse completedAt, TimestampResponse createdAt, StringResponse displayScore, EventResponse event, StringResponse fullRoundText, GameResponse game, ListResponse<GameResponse> games, BooleanResponse hasPlaceholder, StringResponse identifier, ListResponse<ImageResponse> images, IntResponse lPlacement, PhaseGroupResponse phaseGroup, IntResponse round, IntResponse setGamesType, ListResponse<SetSlotResponse> slots, TimestampResponse startedAt, IntResponse state, StationsResponse station, StreamsResponse stream, IntResponse totalGames, StringResponse vodUrl, IntResponse wPlacement, IntResponse winnerId) {
		super(EntityType.SET, true);
		this.id = id;
		this.completedAt = completedAt;
		this.createdAt = createdAt;
		this.displayScore = displayScore;
		this.event = event;
		this.fullRoundText = fullRoundText;
		this.game = game;
		this.games = games;
		this.hasPlaceholder = hasPlaceholder;
		this.identifier = identifier;
		this.images = images;
		this.lPlacement = lPlacement;
		this.phaseGroup = phaseGroup;
		this.round = round;
		this.setGamesType = setGamesType;
		this.slots = slots;
		this.startedAt = startedAt;
		this.state = state;
		this.station = station;
		this.stream = stream;
		this.totalGames = totalGames;
		this.vodUrl = vodUrl;
		this.wPlacement = wPlacement;
		this.winnerId = winnerId;
	}

	public IDResponse getId() {
		checkProvided();
		return id;
	}

	/**
	 * The time this set was marked as completed
	 */
	public TimestampResponse getCompletedAt() {
		checkProvided();
		return completedAt;
	}

	/**
	 * The time this set was created
	 */
	public TimestampResponse getCreatedAt() {
		checkProvided();
		return createdAt;
	}

	public StringResponse getDisplayScore() {
		checkProvided();
		return displayScore;
	}

	/**
	 * Event that this set belongs to.
	 */
	public EventResponse getEvent() {
		checkProvided();
		return event;
	}

	/**
	 * Full round text of this set.
	 */
	public StringResponse getFullRoundText() {
		checkProvided();
		return fullRoundText;
	}

	public GameResponse getGame() {
		checkProvided();
		return game;
	}

	public ListResponse<GameResponse> getGames() {
		checkProvided();
		return games;
	}

	/**
	 * Whether this set contains a placeholder entrant
	 */
	public BooleanResponse getHasPlaceholder() {
		checkProvided();
		return hasPlaceholder;
	}

	/**
	 * The letters that describe a unique identifier within the pool. Eg. F, AT
	 */
	public StringResponse getIdentifier() {
		checkProvided();
		return identifier;
	}

	public ListResponse<ImageResponse> getImages() {
		checkProvided();
		return images;
	}

	public IntResponse getLPlacement() {
		checkProvided();
		return lPlacement;
	}

	/**
	 * Phase group that this Set belongs to.
	 */
	public PhaseGroupResponse getPhaseGroup() {
		checkProvided();
		return phaseGroup;
	}

	/**
	 * The round number of the set. Negative numbers are losers bracket
	 */
	public IntResponse getRound() {
		checkProvided();
		return round;
	}

	/**
	 * Indicates whether the set is in best of or total games mode. This instructs
	 * which field is used to figure out how many games are in this set.
	 */
	public IntResponse getSetGamesType() {
		checkProvided();
		return setGamesType;
	}

	/**
	 * A possible spot in a set. Use this to get all entrants in a set. Use this for all bracket types (FFA, elimination, etc)
	 */
	public ListResponse<SetSlotResponse> getSlots() {
		checkProvided();
		return slots;
	}

	public TimestampResponse getStartedAt() {
		checkProvided();
		return startedAt;
	}

	public IntResponse getState() {
		checkProvided();
		return state;
	}

	/**
	 * Tournament event station for a set
	 */
	public StationsResponse getStation() {
		checkProvided();
		return station;
	}

	/**
	 * Tournament event stream for a set
	 */
	public StreamsResponse getStream() {
		checkProvided();
		return stream;
	}

	/**
	 * If setGamesType is in total games mode, this defined the number of games in the set.
	 */
	public IntResponse getTotalGames() {
		checkProvided();
		return totalGames;
	}

	/**
	 * Url of a VOD for this set
	 */
	public StringResponse getVodUrl() {
		checkProvided();
		return vodUrl;
	}

	public IntResponse getWPlacement() {
		checkProvided();
		return wPlacement;
	}

	public IntResponse getWinnerId() {
		checkProvided();
		return winnerId;
	}
}
