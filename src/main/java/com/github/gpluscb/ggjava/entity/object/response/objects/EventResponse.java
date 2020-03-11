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
	private final IntResponse checkInBuffer;
	private final IntResponse checkInDuration;
	private final BooleanResponse checkInEnabled;
	private final TimestampResponse createdAt;
	private final TimestampResponse deckSubmissionDeadline;
	private final IntResponse entrantSizeMax;
	private final IntResponse entrantSizeMin;
	private final EntrantConnectionResponse entrants;
	private final BooleanResponse hasDecks;
	private final BooleanResponse hasTasks;
	private final ListResponse<ImageResponse> images;
	private final BooleanResponse isOnline;
	private final StringResponse matchRulesMarkdown;
	private final StringResponse name;
	private final IntResponse numEntrants;
	private final ListResponse<PhaseGroupResponse> phaseGroups;
	private final ListResponse<PhaseResponse> phases;
	private final JSONResponse prizingInfo;
	private final JSONResponse publishing;
	private final StringResponse rulesMarkdown;
	private final IntResponse rulesetId;
	private final JSONResponse rulesetSettings;
	private final SetConnectionResponse sets;
	private final StringResponse slug;
	private final StandingConnectionResponse standings;
	private final TimestampResponse startAt;
	private final ActivityStateResponse state;
	private final StationsConnectionResponse stations;
	private final TimestampResponse teamManagementDeadline;
	private final BooleanResponse teamNameAllowed;
	private final TournamentResponse tournament;
	private final IntResponse type;
	private final TimestampResponse updatedAt;
	private final BooleanResponse useEventSeeds;
	private final VideogameResponse videogame;
	private final ListResponse<WaveResponse> waves;

	public EventResponse() {
		super(EntityType.EVENT);

		id = null;
		checkInBuffer = null;
		checkInDuration = null;
		checkInEnabled = null;
		createdAt = null;
		deckSubmissionDeadline = null;
		entrantSizeMax = null;
		entrantSizeMin = null;
		entrants = null;
		hasDecks = null;
		hasTasks = null;
		images = null;
		isOnline = null;
		matchRulesMarkdown = null;
		name = null;
		numEntrants = null;
		phaseGroups = null;
		phases = null;
		prizingInfo = null;
		publishing = null;
		rulesMarkdown = null;
		rulesetId = null;
		rulesetSettings = null;
		sets = null;
		slug = null;
		standings = null;
		startAt = null;
		state = null;
		stations = null;
		teamManagementDeadline = null;
		teamNameAllowed = null;
		tournament = null;
		type = null;
		updatedAt = null;
		useEventSeeds = null;
		videogame = null;
		waves = null;
	}

	public EventResponse(IDResponse id, IntResponse checkInBuffer, IntResponse checkInDuration, BooleanResponse checkInEnabled, TimestampResponse createdAt, TimestampResponse deckSubmissionDeadline, IntResponse entrantSizeMax, IntResponse entrantSizeMin, EntrantConnectionResponse entrants, BooleanResponse hasDecks, BooleanResponse hasTasks, ListResponse<ImageResponse> images, BooleanResponse isOnline, StringResponse matchRulesMarkdown, StringResponse name, IntResponse numEntrants, ListResponse<PhaseGroupResponse> phaseGroups, ListResponse<PhaseResponse> phases, JSONResponse prizingInfo, JSONResponse publishing, StringResponse rulesMarkdown, IntResponse rulesetId, JSONResponse rulesetSettings, SetConnectionResponse sets, StringResponse slug, StandingConnectionResponse standings, TimestampResponse startAt, ActivityStateResponse state, StationsConnectionResponse stations, TimestampResponse teamManagementDeadline, BooleanResponse teamNameAllowed, TournamentResponse tournament, IntResponse type, TimestampResponse updatedAt, BooleanResponse useEventSeeds, VideogameResponse videogame, ListResponse<WaveResponse> waves) {
		super(EntityType.EVENT, true);
		this.id = id;
		this.checkInBuffer = checkInBuffer;
		this.checkInDuration = checkInDuration;
		this.checkInEnabled = checkInEnabled;
		this.createdAt = createdAt;
		this.deckSubmissionDeadline = deckSubmissionDeadline;
		this.entrantSizeMax = entrantSizeMax;
		this.entrantSizeMin = entrantSizeMin;
		this.entrants = entrants;
		this.hasDecks = hasDecks;
		this.hasTasks = hasTasks;
		this.images = images;
		this.isOnline = isOnline;
		this.matchRulesMarkdown = matchRulesMarkdown;
		this.name = name;
		this.numEntrants = numEntrants;
		this.phaseGroups = phaseGroups;
		this.phases = phases;
		this.prizingInfo = prizingInfo;
		this.publishing = publishing;
		this.rulesMarkdown = rulesMarkdown;
		this.rulesetId = rulesetId;
		this.rulesetSettings = rulesetSettings;
		this.sets = sets;
		this.slug = slug;
		this.standings = standings;
		this.startAt = startAt;
		this.state = state;
		this.stations = stations;
		this.teamManagementDeadline = teamManagementDeadline;
		this.teamNameAllowed = teamNameAllowed;
		this.tournament = tournament;
		this.type = type;
		this.updatedAt = updatedAt;
		this.useEventSeeds = useEventSeeds;
		this.videogame = videogame;
		this.waves = waves;
	}

	public IDResponse getId() {
		checkProvided();
		return id;
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
	 * The entrants that belong to an event, paginated by filter criteria
	 */
	public EntrantConnectionResponse getEntrants() {
		checkProvided();
		return entrants;
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

	public ListResponse<ImageResponse> getImages() {
		checkProvided();
		return images;
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
	 * Gets the number of entrants in this event
	 */
	public IntResponse getNumEntrants() {
		checkProvided();
		return numEntrants;
	}

	/**
	 * The phase groups that belong to an event.
	 */
	public ListResponse<PhaseGroupResponse> getPhaseGroups() {
		checkProvided();
		return phaseGroups;
	}

	/**
	 * The phases that belong to an event.
	 */
	public ListResponse<PhaseResponse> getPhases() {
		checkProvided();
		return phases;
	}

	/**
	 * TO settings for prizing
	 */
	public JSONResponse getPrizingInfo() {
		checkProvided();
		return prizingInfo;
	}

	public JSONResponse getPublishing() {
		checkProvided();
		return publishing;
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
	 *
	 * @deprecated Use ruleset
	 */
	@Deprecated
	public JSONResponse getRulesetSettings() {
		checkProvided();
		return rulesetSettings;
	}

	/**
	 * Paginated sets for this Event
	 */
	public SetConnectionResponse getSets() {
		checkProvided();
		return sets;
	}

	public StringResponse getSlug() {
		checkProvided();
		return slug;
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
	 * The state of the Event.
	 */
	public ActivityStateResponse getState() {
		checkProvided();
		return state;
	}

	/**
	 * Paginated stations on this event
	 */
	public StationsConnectionResponse getStations() {
		checkProvided();
		return stations;
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

	public TournamentResponse getTournament() {
		checkProvided();
		return tournament;
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
}
