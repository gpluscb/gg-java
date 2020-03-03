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
	private final IntResponse numSeeds;
	private final SeedConnectionResponse paginatedSeeds;
	private final PhaseGroupConnectionResponse phaseGroups;
	private final SeedConnectionResponse seeds;
	private final SetConnectionResponse sets;
	private final ListResponse<WaveResponse> waves;
	private final IntResponse groupCount;
	private final StringResponse name;
	private final BooleanResponse isExhibition;
	private final BracketTypeResponse bracketType;

	public PhaseResponse() {
		super(EntityType.PHASE);

		id = null;
		numSeeds = null;
		paginatedSeeds = null;
		phaseGroups = null;
		seeds = null;
		sets = null;
		waves = null;
		groupCount = null;
		name = null;
		isExhibition = null;
		bracketType = null;
	}

	public PhaseResponse(IDResponse id, IntResponse numSeeds, SeedConnectionResponse paginatedSeeds, PhaseGroupConnectionResponse phaseGroups, SeedConnectionResponse seeds, SetConnectionResponse sets, ListResponse<WaveResponse> waves, IntResponse groupCount, StringResponse name, BooleanResponse isExhibition, BracketTypeResponse bracketType) {
		super(EntityType.PHASE, true);
		this.id = id;
		this.numSeeds = numSeeds;
		this.paginatedSeeds = paginatedSeeds;
		this.phaseGroups = phaseGroups;
		this.seeds = seeds;
		this.sets = sets;
		this.waves = waves;
		this.groupCount = groupCount;
		this.name = name;
		this.isExhibition = isExhibition;
		this.bracketType = bracketType;
	}

	public IDResponse getId() {
		checkProvided();
		return id;
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

	/**
	 * Number of phase groups in this phase
	 */
	public IntResponse getGroupCount() {
		checkProvided();
		return groupCount;
	}

	/**
	 * Name of phase e.g. Round 1 Pools
	 */
	public StringResponse getName() {
		checkProvided();
		return name;
	}

	/**
	 * Is the phase an exhibition or not.
	 */
	public BooleanResponse getIsExhibition() {
		checkProvided();
		return isExhibition;
	}

	/**
	 * The bracket type of this phase.
	 */
	public BracketTypeResponse getBracketType() {
		checkProvided();
		return bracketType;
	}
}
