package com.github.gpluscb.ggjava.entity.object.response.objects;

import com.github.gpluscb.ggjava.entity.EntityType;
import com.github.gpluscb.ggjava.entity.object.response.AbstractGGResponseObject;
import com.github.gpluscb.ggjava.entity.object.response.ListResponse;
import com.github.gpluscb.ggjava.entity.object.response.enums.ActivityStateResponse;
import com.github.gpluscb.ggjava.entity.object.response.scalars.*;

/**
 * An event in a tournament
 */
public class EventResponse extends AbstractGGResponseObject {
	private final IDResponse id;
	private final ListResponse<ImageResponse> images;
	private final EntrantConnectionResponse entrants;
	private final ListResponse<PhaseResponse> phases;
	private final ListResponse<PhaseGroupResponse> phaseGroups;
	private final SetConnectionResponse sets;
	private final StandingConnectionResponse standings;
	private final TimestampResponse startAt;
	private final StationsConnectionResponse stations;
	private final IntResponse numEntrants;
	private final TournamentResponse tournament;
	private final VideogameResponse videogame;
	private final ListResponse<WaveResponse> waves;
	private final IntResponse checkInBuffer;
	private final IntResponse checkInDuration;
	private final BooleanResponse checkInEnabled;
	private final TimestampResponse createdAt;
	private final TimestampResponse deckSubmissionDeadline;
	private final IntResponse entrantSizeMax;
	private final IntResponse entrantSizeMin;
	private final BooleanResponse hasDecks;
	private final BooleanResponse hasTasks;
	private final BooleanResponse isOnline;
	private final StringResponse matchRulesMarkdown;
	private final StringResponse name;
	private final JSONResponse prizingInfo;
	private final StringResponse rulesMarkdown;
	private final IntResponse rulesetId;
	private final JSONResponse rulesetSettings;
	private final ActivityStateResponse state;
	private final StringResponse slug;
	private final TimestampResponse teamManagementDeadline;
	private final BooleanResponse teamNameAllowed;
	private final IntResponse type;
	private final TimestampResponse updatedAt;
	private final BooleanResponse useEventSeeds;
	private final IntResponse videogameId;
	private final JSONResponse publishing;

	public EventResponse() {
		super(EntityType.EVENT);

		id = null;
		images = null;
		entrants = null;
		phases = null;
		phaseGroups = null;
		sets = null;
		standings = null;
		startAt = null;
		stations = null;
		numEntrants = null;
		tournament = null;
		videogame = null;
		waves = null;
		checkInBuffer = null;
		checkInDuration = null;
		checkInEnabled = null;
		createdAt = null;
		deckSubmissionDeadline = null;
		entrantSizeMax = null;
		entrantSizeMin = null;
		hasDecks = null;
		hasTasks = null;
		isOnline = null;
		matchRulesMarkdown = null;
		name = null;
		prizingInfo = null;
		rulesMarkdown = null;
		rulesetId = null;
		rulesetSettings = null;
		state = null;
		slug = null;
		teamManagementDeadline = null;
		teamNameAllowed = null;
		type = null;
		updatedAt = null;
		useEventSeeds = null;
		videogameId = null;
		publishing = null;
	}

	public EventResponse(IDResponse id, ListResponse<ImageResponse> images, EntrantConnectionResponse entrants, ListResponse<PhaseResponse> phases, ListResponse<PhaseGroupResponse> phaseGroups, SetConnectionResponse sets, StandingConnectionResponse standings, TimestampResponse startAt, StationsConnectionResponse stations, IntResponse numEntrants, TournamentResponse tournament, VideogameResponse videogame, ListResponse<WaveResponse> waves, IntResponse checkInBuffer, IntResponse checkInDuration, BooleanResponse checkInEnabled, TimestampResponse createdAt, TimestampResponse deckSubmissionDeadline, IntResponse entrantSizeMax, IntResponse entrantSizeMin, BooleanResponse hasDecks, BooleanResponse hasTasks, BooleanResponse isOnline, StringResponse matchRulesMarkdown, StringResponse name, JSONResponse prizingInfo, StringResponse rulesMarkdown, IntResponse rulesetId, JSONResponse rulesetSettings, ActivityStateResponse state, StringResponse slug, TimestampResponse teamManagementDeadline, BooleanResponse teamNameAllowed, IntResponse type, TimestampResponse updatedAt, BooleanResponse useEventSeeds, IntResponse videogameId, JSONResponse publishing) {
		super(EntityType.EVENT, true);
		this.id = id;
		this.images = images;
		this.entrants = entrants;
		this.phases = phases;
		this.phaseGroups = phaseGroups;
		this.sets = sets;
		this.standings = standings;
		this.startAt = startAt;
		this.stations = stations;
		this.numEntrants = numEntrants;
		this.tournament = tournament;
		this.videogame = videogame;
		this.waves = waves;
		this.checkInBuffer = checkInBuffer;
		this.checkInDuration = checkInDuration;
		this.checkInEnabled = checkInEnabled;
		this.createdAt = createdAt;
		this.deckSubmissionDeadline = deckSubmissionDeadline;
		this.entrantSizeMax = entrantSizeMax;
		this.entrantSizeMin = entrantSizeMin;
		this.hasDecks = hasDecks;
		this.hasTasks = hasTasks;
		this.isOnline = isOnline;
		this.matchRulesMarkdown = matchRulesMarkdown;
		this.name = name;
		this.prizingInfo = prizingInfo;
		this.rulesMarkdown = rulesMarkdown;
		this.rulesetId = rulesetId;
		this.rulesetSettings = rulesetSettings;
		this.state = state;
		this.slug = slug;
		this.teamManagementDeadline = teamManagementDeadline;
		this.teamNameAllowed = teamNameAllowed;
		this.type = type;
		this.updatedAt = updatedAt;
		this.useEventSeeds = useEventSeeds;
		this.videogameId = videogameId;
		this.publishing = publishing;
	}

	public IDResponse getId() {
		checkProvided();
		return id;
	}

	public ListResponse<ImageResponse> getImages() {
		checkProvided();
		return images;
	}

	/**
	 * The entrants that belong to an event, paginated by filter criteria
	 */
	public EntrantConnectionResponse getEntrants() {
		checkProvided();
		return entrants;
	}

	/**
	 * The phases that belong to an event.
	 */
	public ListResponse<PhaseResponse> getPhases() {
		checkProvided();
		return phases;
	}

	/**
	 * The phase groups that belong to an event.
	 */
	public ListResponse<PhaseGroupResponse> getPhaseGroups() {
		checkProvided();
		return phaseGroups;
	}

	/**
	 * Paginated sets for this Event
	 */
	public SetConnectionResponse getSets() {
		checkProvided();
		return sets;
	}

	/**
	 * Paginated list of standings
	 */
	public StandingConnectionResponse getStandings() {
		checkProvided();
		return standings;
	}

	/**
	 * When does this event start?
	 */
	public TimestampResponse getStartAt() {
		checkProvided();
		return startAt;
	}

	/**
	 * Paginated stations on this event
	 */
	public StationsConnectionResponse getStations() {
		checkProvided();
		return stations;
	}

	/**
	 * Gets the number of entrants in this event
	 */
	public IntResponse getNumEntrants() {
		checkProvided();
		return numEntrants;
	}

	public TournamentResponse getTournament() {
		checkProvided();
		return tournament;
	}

	public VideogameResponse getVideogame() {
		checkProvided();
		return videogame;
	}

	/**
	 * The waves being used by the event
	 */
	public ListResponse<WaveResponse> getWaves() {
		checkProvided();
		return waves;
	}

	/**
	 * How long before the event start will the check-in end (in seconds)
	 */
	public IntResponse getCheckInBuffer() {
		checkProvided();
		return checkInBuffer;
	}

	/**
	 * How long the event check-in will last (in seconds)
	 */
	public IntResponse getCheckInDuration() {
		checkProvided();
		return checkInDuration;
	}

	/**
	 * Whether check-in is enabled for this event
	 */
	public BooleanResponse getCheckInEnabled() {
		checkProvided();
		return checkInEnabled;
	}

	/**
	 * When the event was created (unix timestamp)
	 */
	public TimestampResponse getCreatedAt() {
		checkProvided();
		return createdAt;
	}

	/**
	 * Last date attendees are able to create teams for team events
	 */
	public TimestampResponse getDeckSubmissionDeadline() {
		checkProvided();
		return deckSubmissionDeadline;
	}

	/**
	 * Maximum number of participants each Entrant can have
	 */
	public IntResponse getEntrantSizeMax() {
		checkProvided();
		return entrantSizeMax;
	}

	/**
	 * Minimum number of participants each Entrant can have
	 */
	public IntResponse getEntrantSizeMin() {
		checkProvided();
		return entrantSizeMin;
	}

	/**
	 * Whether the event has decks
	 */
	public BooleanResponse getHasDecks() {
		checkProvided();
		return hasDecks;
	}

	/**
	 * Are player tasks enabled for this event
	 */
	public BooleanResponse getHasTasks() {
		checkProvided();
		return hasTasks;
	}

	/**
	 * Whether the event is an online event or not
	 */
	public BooleanResponse getIsOnline() {
		checkProvided();
		return isOnline;
	}

	/**
	 * Markdown field for match rules/instructions
	 */
	public StringResponse getMatchRulesMarkdown() {
		checkProvided();
		return matchRulesMarkdown;
	}

	/**
	 * Title of event set by organizer
	 */
	public StringResponse getName() {
		checkProvided();
		return name;
	}

	/**
	 * TO settings for prizing
	 */
	public JSONResponse getPrizingInfo() {
		checkProvided();
		return prizingInfo;
	}

	/**
	 * Markdown field for event rules/instructions
	 */
	public StringResponse getRulesMarkdown() {
		checkProvided();
		return rulesMarkdown;
	}

	/**
	 * Id of the event ruleset
	 */
	public IntResponse getRulesetId() {
		checkProvided();
		return rulesetId;
	}

	/**
	 * Settings pulled from the event ruleset, if one exists
	 */
	public JSONResponse getRulesetSettings() {
		checkProvided();
		return rulesetSettings;
	}

	/**
	 * The state of the Event.
	 */
	public ActivityStateResponse getState() {
		checkProvided();
		return state;
	}

	public StringResponse getSlug() {
		checkProvided();
		return slug;
	}

	/**
	 * Last date attendees are able to create teams for team events
	 */
	public TimestampResponse getTeamManagementDeadline() {
		checkProvided();
		return teamManagementDeadline;
	}

	/**
	 * If this is a teams event, returns whether or not teams can set custom names
	 */
	public BooleanResponse getTeamNameAllowed() {
		checkProvided();
		return teamNameAllowed;
	}

	/**
	 * The type of the event, whether an entrant will have one participant or multiple
	 */
	public IntResponse getType() {
		checkProvided();
		return type;
	}

	/**
	 * When the event was last modified (unix timestamp)
	 */
	public TimestampResponse getUpdatedAt() {
		checkProvided();
		return updatedAt;
	}

	/**
	 * Whether the event uses the new EventSeeds for seeding
	 */
	public BooleanResponse getUseEventSeeds() {
		checkProvided();
		return useEventSeeds;
	}

	/**
	 * Id of the videogame associated with this event
	 */
	public IntResponse getVideogameId() {
		checkProvided();
		return videogameId;
	}

	public JSONResponse getPublishing() {
		checkProvided();
		return publishing;
	}
}
