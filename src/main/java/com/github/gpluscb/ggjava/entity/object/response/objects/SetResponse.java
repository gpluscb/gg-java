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
	private final ListResponse<ImageResponse> images;
	private final StringResponse displayScore;
	private final EventResponse event;
	private final StringResponse fullRoundText;
	private final GameResponse game;
	private final ListResponse<GameResponse> games;
	private final ListResponse<SetSlotResponse> slots;
	private final StationsResponse station;
	private final TimestampResponse completedAt;
	private final TimestampResponse createdAt;
	private final IntResponse eventId;
	private final BooleanResponse hasPlaceholder;
	private final StringResponse identifier;
	private final IntResponse phaseGroupId;
	private final IntResponse round;
	private final IntResponse setGamesType;
	private final TimestampResponse startedAt;
	private final IntResponse state;
	private final IntResponse stationId;
	private final IntResponse streamId;
	private final IntResponse totalGames;
	private final FloatResponse updatedAtMicro;
	private final StringResponse vodUrl;
	private final IntResponse winnerId;
	private final IntResponse wPlacement;
	private final IntResponse lPlacement;
	private final IntResponse entrant1Id;
	private final BooleanResponse entrant1Present;
	private final IntResponse entrant1Score;
	private final IntResponse entrant2Id;
	private final BooleanResponse entrant2Present;
	private final IntResponse entrant2Score;

	public SetResponse() {
		super(EntityType.SET);

		id = null;
		images = null;
		displayScore = null;
		event = null;
		fullRoundText = null;
		game = null;
		games = null;
		slots = null;
		station = null;
		completedAt = null;
		createdAt = null;
		eventId = null;
		hasPlaceholder = null;
		identifier = null;
		phaseGroupId = null;
		round = null;
		setGamesType = null;
		startedAt = null;
		state = null;
		stationId = null;
		streamId = null;
		totalGames = null;
		updatedAtMicro = null;
		vodUrl = null;
		winnerId = null;
		wPlacement = null;
		lPlacement = null;
		entrant1Id = null;
		entrant1Present = null;
		entrant1Score = null;
		entrant2Id = null;
		entrant2Present = null;
		entrant2Score = null;
	}

	public SetResponse(IDResponse id, ListResponse<ImageResponse> images, StringResponse displayScore, EventResponse event, StringResponse fullRoundText, GameResponse game, ListResponse<GameResponse> games, ListResponse<SetSlotResponse> slots, StationsResponse station, TimestampResponse completedAt, TimestampResponse createdAt, IntResponse eventId, BooleanResponse hasPlaceholder, StringResponse identifier, IntResponse phaseGroupId, IntResponse round, IntResponse setGamesType, TimestampResponse startedAt, IntResponse state, IntResponse stationId, IntResponse streamId, IntResponse totalGames, FloatResponse updatedAtMicro, StringResponse vodUrl, IntResponse winnerId, IntResponse wPlacement, IntResponse lPlacement, IntResponse entrant1Id, BooleanResponse entrant1Present, IntResponse entrant1Score, IntResponse entrant2Id, BooleanResponse entrant2Present, IntResponse entrant2Score) {
		super(EntityType.SET, true);
		this.id = id;
		this.images = images;
		this.displayScore = displayScore;
		this.event = event;
		this.fullRoundText = fullRoundText;
		this.game = game;
		this.games = games;
		this.slots = slots;
		this.station = station;
		this.completedAt = completedAt;
		this.createdAt = createdAt;
		this.eventId = eventId;
		this.hasPlaceholder = hasPlaceholder;
		this.identifier = identifier;
		this.phaseGroupId = phaseGroupId;
		this.round = round;
		this.setGamesType = setGamesType;
		this.startedAt = startedAt;
		this.state = state;
		this.stationId = stationId;
		this.streamId = streamId;
		this.totalGames = totalGames;
		this.updatedAtMicro = updatedAtMicro;
		this.vodUrl = vodUrl;
		this.winnerId = winnerId;
		this.wPlacement = wPlacement;
		this.lPlacement = lPlacement;
		this.entrant1Id = entrant1Id;
		this.entrant1Present = entrant1Present;
		this.entrant1Score = entrant1Score;
		this.entrant2Id = entrant2Id;
		this.entrant2Present = entrant2Present;
		this.entrant2Score = entrant2Score;
	}

	public IDResponse getId() {
		checkProvided();
		return id;
	}

	public ListResponse<ImageResponse> getImages() {
		checkProvided();
		return images;
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
	 * A possible spot in a set. Use this to get all entrants in a set. Use this for all bracket types (FFA, elimination, etc)
	 */
	public ListResponse<SetSlotResponse> getSlots() {
		checkProvided();
		return slots;
	}

	/**
	 * Tournament event station for a set
	 */
	public StationsResponse getStation() {
		checkProvided();
		return station;
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

	/**
	 * ID of the event this set belongs to
	 */
	public IntResponse getEventId() {
		checkProvided();
		return eventId;
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

	public IntResponse getPhaseGroupId() {
		checkProvided();
		return phaseGroupId;
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

	public TimestampResponse getStartedAt() {
		checkProvided();
		return startedAt;
	}

	public IntResponse getState() {
		checkProvided();
		return state;
	}

	/**
	 * ID of station of set
	 */
	public IntResponse getStationId() {
		checkProvided();
		return stationId;
	}

	public IntResponse getStreamId() {
		checkProvided();
		return streamId;
	}

	/**
	 * If setGamesType is in total games mode, this defined the number of games in the set.
	 */
	public IntResponse getTotalGames() {
		checkProvided();
		return totalGames;
	}

	/**
	 * Generally used in conjunction with firebase to see if set data should be updated
	 */
	public FloatResponse getUpdatedAtMicro() {
		checkProvided();
		return updatedAtMicro;
	}

	/**
	 * Url of a VOD for this set
	 */
	public StringResponse getVodUrl() {
		checkProvided();
		return vodUrl;
	}

	public IntResponse getWinnerId() {
		checkProvided();
		return winnerId;
	}

	public IntResponse getWPlacement() {
		checkProvided();
		return wPlacement;
	}

	public IntResponse getLPlacement() {
		checkProvided();
		return lPlacement;
	}

	@Deprecated
	public IntResponse getEntrant1Id() {
		checkProvided();
		return entrant1Id;
	}

	@Deprecated
	public BooleanResponse getEntrant1Present() {
		checkProvided();
		return entrant1Present;
	}

	@Deprecated
	public IntResponse getEntrant1Score() {
		checkProvided();
		return entrant1Score;
	}

	@Deprecated
	public IntResponse getEntrant2Id() {
		checkProvided();
		return entrant2Id;
	}

	@Deprecated
	public BooleanResponse getEntrant2Present() {
		checkProvided();
		return entrant2Present;
	}

	@Deprecated
	public IntResponse getEntrant2Score() {
		checkProvided();
		return entrant2Score;
	}
}
