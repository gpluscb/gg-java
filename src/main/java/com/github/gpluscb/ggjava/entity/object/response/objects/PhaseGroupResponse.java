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
	private final SeedConnectionResponse paginatedSeeds;
	private final SetConnectionResponse paginatedSets;
	private final ListResponse<RoundResponse> rounds;
	private final SeedConnectionResponse seeds;
	private final SetConnectionResponse sets;
	private final StandingConnectionResponse standings;
	private final WaveResponse wave;
	private final StringResponse displayIdentifier;
	private final TimestampResponse firstRoundTime;
	private final IntResponse state;
	private final IntResponse phaseId;
	private final IntResponse waveId;
	private final JSONResponse tiebreakOrder;
	private final IntResponse numRounds;

	public PhaseGroupResponse() {
		super(EntityType.PHASE_GROUP);

		id = null;
		bracketType = null;
		paginatedSeeds = null;
		paginatedSets = null;
		rounds = null;
		seeds = null;
		sets = null;
		standings = null;
		wave = null;
		displayIdentifier = null;
		firstRoundTime = null;
		state = null;
		phaseId = null;
		waveId = null;
		tiebreakOrder = null;
		numRounds = null;
	}

	public PhaseGroupResponse(IDResponse id, BracketTypeResponse bracketType, SeedConnectionResponse paginatedSeeds, SetConnectionResponse paginatedSets, ListResponse<RoundResponse> rounds, SeedConnectionResponse seeds, SetConnectionResponse sets, StandingConnectionResponse standings, WaveResponse wave, StringResponse displayIdentifier, TimestampResponse firstRoundTime, IntResponse state, IntResponse phaseId, IntResponse waveId, JSONResponse tiebreakOrder, IntResponse numRounds) {
		super(EntityType.PHASE_GROUP, true);
		this.id = id;
		this.bracketType = bracketType;
		this.paginatedSeeds = paginatedSeeds;
		this.paginatedSets = paginatedSets;
		this.rounds = rounds;
		this.seeds = seeds;
		this.sets = sets;
		this.standings = standings;
		this.wave = wave;
		this.displayIdentifier = displayIdentifier;
		this.firstRoundTime = firstRoundTime;
		this.state = state;
		this.phaseId = phaseId;
		this.waveId = waveId;
		this.tiebreakOrder = tiebreakOrder;
		this.numRounds = numRounds;
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

	public ListResponse<RoundResponse> getRounds() {
		checkProvided();
		return rounds;
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

	public WaveResponse getWave() {
		checkProvided();
		return wave;
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

	public IntResponse getState() {
		checkProvided();
		return state;
	}

	public IntResponse getPhaseId() {
		checkProvided();
		return phaseId;
	}

	public IntResponse getWaveId() {
		checkProvided();
		return waveId;
	}

	public JSONResponse getTiebreakOrder() {
		checkProvided();
		return tiebreakOrder;
	}

	public IntResponse getNumRounds() {
		checkProvided();
		return numRounds;
	}
}
