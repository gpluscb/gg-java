package com.github.gpluscb.ggjava.entity.object.response.objects;

import com.github.gpluscb.ggjava.entity.EntityType;
import com.github.gpluscb.ggjava.entity.object.response.AbstractGGResponseObject;
import com.github.gpluscb.ggjava.entity.object.response.ListResponse;
import com.github.gpluscb.ggjava.entity.object.response.enums.BracketTypeResponse;
import com.github.gpluscb.ggjava.entity.object.response.scalars.BooleanResponse;
import com.github.gpluscb.ggjava.entity.object.response.scalars.IDResponse;
import com.github.gpluscb.ggjava.entity.object.response.scalars.IntResponse;
import com.github.gpluscb.ggjava.entity.object.response.scalars.StringResponse;

/**
 * A phase in an event
 */
public class PhaseResponse extends AbstractGGResponseObject {
	private final IDResponse id;
	private final BracketTypeResponse bracketType;
	private final IntResponse groupCount;
	private final BooleanResponse isExhibition;
	private final StringResponse name;
	private final IntResponse numSeeds;
	private final SeedConnectionResponse paginatedSeeds;
	private final PhaseGroupConnectionResponse phaseGroups;
	private final SeedConnectionResponse seeds;
	private final SetConnectionResponse sets;
	private final ListResponse<WaveResponse> waves;

	public PhaseResponse() {
		super(EntityType.PHASE);

		id = null;
		bracketType = null;
		groupCount = null;
		isExhibition = null;
		name = null;
		numSeeds = null;
		paginatedSeeds = null;
		phaseGroups = null;
		seeds = null;
		sets = null;
		waves = null;
	}

	public PhaseResponse(IDResponse id, BracketTypeResponse bracketType, IntResponse groupCount, BooleanResponse isExhibition, StringResponse name, IntResponse numSeeds, SeedConnectionResponse paginatedSeeds, PhaseGroupConnectionResponse phaseGroups, SeedConnectionResponse seeds, SetConnectionResponse sets, ListResponse<WaveResponse> waves) {
		super(EntityType.PHASE, true);
		this.id = id;
		this.bracketType = bracketType;
		this.groupCount = groupCount;
		this.isExhibition = isExhibition;
		this.name = name;
		this.numSeeds = numSeeds;
		this.paginatedSeeds = paginatedSeeds;
		this.phaseGroups = phaseGroups;
		this.seeds = seeds;
		this.sets = sets;
		this.waves = waves;
	}

	public IDResponse getId() {
		checkProvided();
		return id;
	}

	/**
	 * The bracket type of this phase.
	 */
	public BracketTypeResponse getBracketType() {
		checkProvided();
		return bracketType;
	}

	/**
	 * Number of phase groups in this phase
	 */
	public IntResponse getGroupCount() {
		checkProvided();
		return groupCount;
	}

	/**
	 * Is the phase an exhibition or not.
	 */
	public BooleanResponse getIsExhibition() {
		checkProvided();
		return isExhibition;
	}

	/**
	 * Name of phase e.g. Round 1 Pools
	 */
	public StringResponse getName() {
		checkProvided();
		return name;
	}

	/**
	 * The number of seeds this phase contains.
	 */
	public IntResponse getNumSeeds() {
		checkProvided();
		return numSeeds;
	}

	@Deprecated
	public SeedConnectionResponse getPaginatedSeeds() {
		checkProvided();
		return paginatedSeeds;
	}

	/**
	 * Phase groups under this phase, paginated
	 */
	public PhaseGroupConnectionResponse getPhaseGroups() {
		checkProvided();
		return phaseGroups;
	}

	/**
	 * Paginated seeds for this phase
	 */
	public SeedConnectionResponse getSeeds() {
		checkProvided();
		return seeds;
	}

	/**
	 * Paginated sets for this Phase
	 */
	public SetConnectionResponse getSets() {
		checkProvided();
		return sets;
	}

	public ListResponse<WaveResponse> getWaves() {
		checkProvided();
		return waves;
	}
}
