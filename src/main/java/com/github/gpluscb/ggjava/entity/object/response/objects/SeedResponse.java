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
	private final JSONResponse checkedInParticipants;
	private final EntrantResponse entrant;
	private final IntResponse groupSeedNum;
	private final BooleanResponse isBye;
	private final PhaseResponse phase;
	private final PhaseGroupResponse phaseGroup;
	private final StringResponse placeholderName;
	private final IntResponse placement;
	private final ListResponse<PlayerResponse> players;
	private final IntResponse progressionSeedId;
	private final ProgressionResponse progressionSource;
	private final IntResponse seedNum;
	private final ListResponse<StandingResponse> standings;

	public SeedResponse() {
		super(EntityType.SEED);

		id = null;
		checkedInParticipants = null;
		entrant = null;
		groupSeedNum = null;
		isBye = null;
		phase = null;
		phaseGroup = null;
		placeholderName = null;
		placement = null;
		players = null;
		progressionSeedId = null;
		progressionSource = null;
		seedNum = null;
		standings = null;
	}

	public SeedResponse(IDResponse id, JSONResponse checkedInParticipants, EntrantResponse entrant, IntResponse groupSeedNum, BooleanResponse isBye, PhaseResponse phase, PhaseGroupResponse phaseGroup, StringResponse placeholderName, IntResponse placement, ListResponse<PlayerResponse> players, IntResponse progressionSeedId, ProgressionResponse progressionSource, IntResponse seedNum, ListResponse<StandingResponse> standings) {
		super(EntityType.SEED, true);
		this.id = id;
		this.checkedInParticipants = checkedInParticipants;
		this.entrant = entrant;
		this.groupSeedNum = groupSeedNum;
		this.isBye = isBye;
		this.phase = phase;
		this.phaseGroup = phaseGroup;
		this.placeholderName = placeholderName;
		this.placement = placement;
		this.players = players;
		this.progressionSeedId = progressionSeedId;
		this.progressionSource = progressionSource;
		this.seedNum = seedNum;
		this.standings = standings;
	}

	public IDResponse getId() {
		checkProvided();
		return id;
	}

	/**
	 * Map of Participant ID to checked in boolean
	 */
	public JSONResponse getCheckedInParticipants() {
		checkProvided();
		return checkedInParticipants;
	}

	public EntrantResponse getEntrant() {
		checkProvided();
		return entrant;
	}

	public IntResponse getGroupSeedNum() {
		checkProvided();
		return groupSeedNum;
	}

	public BooleanResponse getIsBye() {
		checkProvided();
		return isBye;
	}

	public PhaseResponse getPhase() {
		checkProvided();
		return phase;
	}

	public PhaseGroupResponse getPhaseGroup() {
		checkProvided();
		return phaseGroup;
	}

	public StringResponse getPlaceholderName() {
		checkProvided();
		return placeholderName;
	}

	public IntResponse getPlacement() {
		checkProvided();
		return placement;
	}

	/**
	 * The player(s) associated with this seed's entrant
	 */
	public ListResponse<PlayerResponse> getPlayers() {
		checkProvided();
		return players;
	}

	public IntResponse getProgressionSeedId() {
		checkProvided();
		return progressionSeedId;
	}

	/**
	 * Source progression information
	 */
	public ProgressionResponse getProgressionSource() {
		checkProvided();
		return progressionSource;
	}

	public IntResponse getSeedNum() {
		checkProvided();
		return seedNum;
	}

	public ListResponse<StandingResponse> getStandings() {
		checkProvided();
		return standings;
	}
}
