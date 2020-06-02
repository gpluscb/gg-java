package com.github.gpluscb.ggjava.entity.object.response.objects;

import com.github.gpluscb.ggjava.entity.EntityType;
import com.github.gpluscb.ggjava.entity.object.response.AbstractGGResponseObject;
import com.github.gpluscb.ggjava.entity.object.response.ListResponse;
import com.github.gpluscb.ggjava.entity.object.response.enums.BracketTypeResponse;
import com.github.gpluscb.ggjava.entity.object.response.scalars.*;

/**
 * A group within a phase
 */
public class PhaseGroupResponse extends AbstractGGResponseObject {
	private final IDResponse id;
	private final BracketTypeResponse bracketType;
	private final StringResponse displayIdentifier;
	private final TimestampResponse firstRoundTime;
	private final IntResponse numRounds;
	private final SeedConnectionResponse paginatedSeeds;
	private final SetConnectionResponse paginatedSets;
	private final PhaseResponse phase;
	private final ListResponse<ProgressionResponse> progressionsOut;
	private final ListResponse<RoundResponse> rounds;
	private final JSONResponse seedMap;
	private final SeedConnectionResponse seeds;
	private final SetConnectionResponse sets;
	private final StandingConnectionResponse standings;
	private final TimestampResponse startAt;
	private final IntResponse state;
	private final JSONResponse tiebreakOrder;
	private final WaveResponse wave;

	public PhaseGroupResponse() {
		super(EntityType.PHASE_GROUP);

		id = null;
		bracketType = null;
		displayIdentifier = null;
		firstRoundTime = null;
		numRounds = null;
		paginatedSeeds = null;
		paginatedSets = null;
		phase = null;
		progressionsOut = null;
		rounds = null;
		seedMap = null;
		seeds = null;
		sets = null;
		standings = null;
		startAt = null;
		state = null;
		tiebreakOrder = null;
		wave = null;
	}

	public PhaseGroupResponse(IDResponse id, BracketTypeResponse bracketType, StringResponse displayIdentifier, TimestampResponse firstRoundTime, IntResponse numRounds, SeedConnectionResponse paginatedSeeds, SetConnectionResponse paginatedSets, PhaseResponse phase, ListResponse<ProgressionResponse> progressionsOut, ListResponse<RoundResponse> rounds, JSONResponse seedMap, SeedConnectionResponse seeds, SetConnectionResponse sets, StandingConnectionResponse standings, TimestampResponse startAt, IntResponse state, JSONResponse tiebreakOrder, WaveResponse wave) {
		super(EntityType.PHASE_GROUP, true);
		this.id = id;
		this.bracketType = bracketType;
		this.displayIdentifier = displayIdentifier;
		this.firstRoundTime = firstRoundTime;
		this.numRounds = numRounds;
		this.paginatedSeeds = paginatedSeeds;
		this.paginatedSets = paginatedSets;
		this.phase = phase;
		this.progressionsOut = progressionsOut;
		this.rounds = rounds;
		this.seedMap = seedMap;
		this.seeds = seeds;
		this.sets = sets;
		this.standings = standings;
		this.startAt = startAt;
		this.state = state;
		this.tiebreakOrder = tiebreakOrder;
		this.wave = wave;
	}

	public IDResponse getId() {
		checkProvided();
		return id;
	}

	/**
	 * The bracket type of this group's phase.
	 */
	public BracketTypeResponse getBracketType() {
		checkProvided();
		return bracketType;
	}

	/**
	 * Unique identifier for this group within the context of its phase
	 */
	public StringResponse getDisplayIdentifier() {
		checkProvided();
		return displayIdentifier;
	}

	/**
	 * For the given phase group, this is the start time of the first round that occurs in the group.
	 */
	public TimestampResponse getFirstRoundTime() {
		checkProvided();
		return firstRoundTime;
	}

	public IntResponse getNumRounds() {
		checkProvided();
		return numRounds;
	}

	/**
	 * @deprecated Please use 'seeds', which is now paginated
	 */
	@Deprecated
	public SeedConnectionResponse getPaginatedSeeds() {
		checkProvided();
		return paginatedSeeds;
	}

	/**
	 * Paginated sets on this phaseGroup
	 *
	 * @deprecated Please use 'sets', which is now paginated
	 */
	@Deprecated
	public SetConnectionResponse getPaginatedSets() {
		checkProvided();
		return paginatedSets;
	}

	/**
	 * The phase associated with this phase group
	 */
	public PhaseResponse getPhase() {
		checkProvided();
		return phase;
	}

	/**
	 * The progressions out of this phase group
	 */
	public ListResponse<ProgressionResponse> getProgressionsOut() {
		checkProvided();
		return progressionsOut;
	}

	public ListResponse<RoundResponse> getRounds() {
		checkProvided();
		return rounds;
	}

	public JSONResponse getSeedMap() {
		checkProvided();
		return seedMap;
	}

	/**
	 * Paginated seeds for this phase group
	 */
	public SeedConnectionResponse getSeeds() {
		checkProvided();
		return seeds;
	}

	/**
	 * Paginated sets on this phaseGroup
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
	 * Unix time the group is scheduled to start. This info could also be on the wave instead.
	 */
	public TimestampResponse getStartAt() {
		checkProvided();
		return startAt;
	}

	public IntResponse getState() {
		checkProvided();
		return state;
	}

	public JSONResponse getTiebreakOrder() {
		checkProvided();
		return tiebreakOrder;
	}

	public WaveResponse getWave() {
		checkProvided();
		return wave;
	}
}
