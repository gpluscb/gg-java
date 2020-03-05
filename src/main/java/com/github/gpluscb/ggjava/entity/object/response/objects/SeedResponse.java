package com.github.gpluscb.ggjava.entity.object.response.objects;

import com.github.gpluscb.ggjava.entity.EntityType;
import com.github.gpluscb.ggjava.entity.object.response.AbstractGGResponseObject;
import com.github.gpluscb.ggjava.entity.object.response.ListResponse;
import com.github.gpluscb.ggjava.entity.object.response.scalars.*;

/**
 * A seed for an entrant
 */
public class SeedResponse extends AbstractGGResponseObject {
	private final IDResponse id;
	private final PhaseResponse phase;
	private final PhaseGroupResponse phaseGroup;
	private final EntrantResponse entrant;
	private final StringResponse placeholderName;
	private final ListResponse<PlayerResponse> players;
	private final ListResponse<StandingResponse> standings;
	private final ProgressionResponse progressionSource;
	private final IntResponse entrantId;
	private final JSONResponse checkedInParticipants;
	private final IntResponse seedNum;
	private final IntResponse placement;
	private final IntResponse progressionSeedId;
	private final BooleanResponse isBye;
	private final IntResponse groupSeedNum;

	public SeedResponse() {
		super(EntityType.SEED);

		id = null;
		phase = null;
		phaseGroup = null;
		entrant = null;
		placeholderName = null;
		players = null;
		standings = null;
		progressionSource = null;
		entrantId = null;
		checkedInParticipants = null;
		seedNum = null;
		placement = null;
		progressionSeedId = null;
		isBye = null;
		groupSeedNum = null;
	}

	public SeedResponse(IDResponse id, PhaseResponse phase, PhaseGroupResponse phaseGroup, EntrantResponse entrant, StringResponse placeholderName, ListResponse<PlayerResponse> players, ListResponse<StandingResponse> standings, ProgressionResponse progressionSource, IntResponse entrantId, JSONResponse checkedInParticipants, IntResponse seedNum, IntResponse placement, IntResponse progressionSeedId, BooleanResponse isBye, IntResponse groupSeedNum) {
		super(EntityType.SEED, true);
		this.id = id;
		this.phase = phase;
		this.phaseGroup = phaseGroup;
		this.entrant = entrant;
		this.placeholderName = placeholderName;
		this.players = players;
		this.standings = standings;
		this.progressionSource = progressionSource;
		this.entrantId = entrantId;
		this.checkedInParticipants = checkedInParticipants;
		this.seedNum = seedNum;
		this.placement = placement;
		this.progressionSeedId = progressionSeedId;
		this.isBye = isBye;
		this.groupSeedNum = groupSeedNum;
	}

	public IDResponse getId() {
		checkProvided();
		return id;
	}

	public PhaseResponse getPhase() {
		checkProvided();
		return phase;
	}

	public PhaseGroupResponse getPhaseGroup() {
		checkProvided();
		return phaseGroup;
	}

	public EntrantResponse getEntrant() {
		checkProvided();
		return entrant;
	}

	public StringResponse getPlaceholderName() {
		checkProvided();
		return placeholderName;
	}

	/**
	 * The player(s) associated with this seed's entrant
	 */
	public ListResponse<PlayerResponse> getPlayers() {
		checkProvided();
		return players;
	}

	public ListResponse<StandingResponse> getStandings() {
		checkProvided();
		return standings;
	}

	/**
	 * Source progression information
	 */
	public ProgressionResponse getProgressionSource() {
		checkProvided();
		return progressionSource;
	}

	public IntResponse getEntrantId() {
		checkProvided();
		return entrantId;
	}

	/**
	 * Map of Participant ID to checked in boolean
	 */
	public JSONResponse getCheckedInParticipants() {
		checkProvided();
		return checkedInParticipants;
	}

	public IntResponse getSeedNum() {
		checkProvided();
		return seedNum;
	}

	public IntResponse getPlacement() {
		checkProvided();
		return placement;
	}

	public IntResponse getProgressionSeedId() {
		checkProvided();
		return progressionSeedId;
	}

	public BooleanResponse getIsBye() {
		checkProvided();
		return isBye;
	}

	public IntResponse getGroupSeedNum() {
		checkProvided();
		return groupSeedNum;
	}
}
