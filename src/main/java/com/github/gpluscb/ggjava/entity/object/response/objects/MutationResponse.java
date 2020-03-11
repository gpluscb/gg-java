package com.github.gpluscb.ggjava.entity.object.response.objects;

import com.github.gpluscb.ggjava.entity.EntityType;
import com.github.gpluscb.ggjava.entity.object.response.AbstractGGResponseObject;
import com.github.gpluscb.ggjava.entity.object.response.ListResponse;
import com.github.gpluscb.ggjava.entity.object.response.scalars.BooleanResponse;

public class MutationResponse extends AbstractGGResponseObject {
	private final BooleanResponse deletePhase;
	private final BooleanResponse deleteStation;
	private final BooleanResponse deleteWave;
	private final ListResponse<SeedResponse> resolveScheduleConflicts;
	private final ListResponse<SeedResponse> swapSeeds;
	private final ListResponse<PhaseGroupResponse> updatePhaseGroups;
	private final PhaseResponse updatePhaseSeeding;
	private final PhaseResponse upsertPhase;
	private final StationsResponse upsertStation;
	private final WaveResponse upsertWave;

	public MutationResponse() {
		super(EntityType.MUTATION);

		deletePhase = null;
		deleteStation = null;
		deleteWave = null;
		resolveScheduleConflicts = null;
		swapSeeds = null;
		updatePhaseGroups = null;
		updatePhaseSeeding = null;
		upsertPhase = null;
		upsertStation = null;
		upsertWave = null;
	}

	public MutationResponse(BooleanResponse deletePhase, BooleanResponse deleteStation, BooleanResponse deleteWave, ListResponse<SeedResponse> resolveScheduleConflicts, ListResponse<SeedResponse> swapSeeds, ListResponse<PhaseGroupResponse> updatePhaseGroups, PhaseResponse updatePhaseSeeding, PhaseResponse upsertPhase, StationsResponse upsertStation, WaveResponse upsertWave) {
		super(EntityType.MUTATION, true);
		this.deletePhase = deletePhase;
		this.deleteStation = deleteStation;
		this.deleteWave = deleteWave;
		this.resolveScheduleConflicts = resolveScheduleConflicts;
		this.swapSeeds = swapSeeds;
		this.updatePhaseGroups = updatePhaseGroups;
		this.updatePhaseSeeding = updatePhaseSeeding;
		this.upsertPhase = upsertPhase;
		this.upsertStation = upsertStation;
		this.upsertWave = upsertWave;
	}

	/**
	 * Delete a phase by id
	 */
	public BooleanResponse getDeletePhase() {
		checkProvided();
		return deletePhase;
	}

	/**
	 * Delete a station by id
	 */
	public BooleanResponse getDeleteStation() {
		checkProvided();
		return deleteStation;
	}

	/**
	 * Delete a wave by id
	 */
	public BooleanResponse getDeleteWave() {
		checkProvided();
		return deleteWave;
	}

	/**
	 * Automatically attempt to resolve all schedule conflicts. Returns a list of changed seeds
	 */
	public ListResponse<SeedResponse> getResolveScheduleConflicts() {
		checkProvided();
		return resolveScheduleConflicts;
	}

	/**
	 * Swap two seed ids in a phase
	 */
	public ListResponse<SeedResponse> getSwapSeeds() {
		checkProvided();
		return swapSeeds;
	}

	/**
	 * Update set of phase groups in a phase
	 */
	public ListResponse<PhaseGroupResponse> getUpdatePhaseGroups() {
		checkProvided();
		return updatePhaseGroups;
	}

	/**
	 * Update the seeding for a phase
	 */
	public PhaseResponse getUpdatePhaseSeeding() {
		checkProvided();
		return updatePhaseSeeding;
	}

	/**
	 * Create or update a Phase
	 */
	public PhaseResponse getUpsertPhase() {
		checkProvided();
		return upsertPhase;
	}

	/**
	 * Add or update a station by id
	 */
	public StationsResponse getUpsertStation() {
		checkProvided();
		return upsertStation;
	}

	/**
	 * Add or update a wave by id
	 */
	public WaveResponse getUpsertWave() {
		checkProvided();
		return upsertWave;
	}
}
