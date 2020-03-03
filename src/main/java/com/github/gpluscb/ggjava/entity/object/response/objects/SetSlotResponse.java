package com.github.gpluscb.ggjava.entity.object.response.objects;

import com.github.gpluscb.ggjava.entity.EntityType;
import com.github.gpluscb.ggjava.entity.object.response.AbstractGGResponseObject;
import com.github.gpluscb.ggjava.entity.object.response.scalars.IDResponse;
import com.github.gpluscb.ggjava.entity.object.response.scalars.IntResponse;
import com.github.gpluscb.ggjava.entity.object.response.scalars.StringResponse;

/**
 * A slot in a set where a seed currently or will eventually exist in order to participate in the set.
 */
public class SetSlotResponse extends AbstractGGResponseObject {
	private final IDResponse id;
	private final EntrantResponse entrant;
	private final StandingResponse standing;
	private final IDResponse setId;
	private final IntResponse slotIndex;
	private final IntResponse seedId;
	private final StringResponse prereqId;
	private final StringResponse prereqType;
	private final IntResponse prereqPlacement;

	public SetSlotResponse() {
		super(EntityType.SET_SLOT);

		id = null;
		entrant = null;
		standing = null;
		setId = null;
		slotIndex = null;
		seedId = null;
		prereqId = null;
		prereqType = null;
		prereqPlacement = null;
	}

	public SetSlotResponse(IDResponse id, EntrantResponse entrant, StandingResponse standing, IDResponse setId, IntResponse slotIndex, IntResponse seedId, StringResponse prereqId, StringResponse prereqType, IntResponse prereqPlacement) {
		super(EntityType.SET_SLOT, true);
		this.id = id;
		this.entrant = entrant;
		this.standing = standing;
		this.setId = setId;
		this.slotIndex = slotIndex;
		this.seedId = seedId;
		this.prereqId = prereqId;
		this.prereqType = prereqType;
		this.prereqPlacement = prereqPlacement;
	}

	public IDResponse getId() {
		checkProvided();
		return id;
	}

	public EntrantResponse getEntrant() {
		checkProvided();
		return entrant;
	}

	/**
	 * The standing within this set for the seed currently assigned to this slot.
	 */
	public StandingResponse getStanding() {
		checkProvided();
		return standing;
	}

	public IDResponse getSetId() {
		checkProvided();
		return setId;
	}

	/**
	 * The index of the slot. Unique per set.
	 */
	public IntResponse getSlotIndex() {
		checkProvided();
		return slotIndex;
	}

	/**
	 * Will be filled with a seedId once it is confirmed who will be participating in this slot.
	 */
	public IntResponse getSeedId() {
		checkProvided();
		return seedId;
	}

	/**
	 * Pairs with prereqType, is the ID of the prereq.
	 */
	public StringResponse getPrereqId() {
		checkProvided();
		return prereqId;
	}

	/**
	 * Describes where the entity in this slot comes from.
	 */
	public StringResponse getPrereqType() {
		checkProvided();
		return prereqType;
	}

	/**
	 * Given a set prereq type, defines the placement required in the origin set to end up in this slot.
	 */
	public IntResponse getPrereqPlacement() {
		checkProvided();
		return prereqPlacement;
	}
}
