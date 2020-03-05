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
	private final StringResponse prereqId;
	private final IntResponse prereqPlacement;
	private final StringResponse prereqType;
	private final IntResponse slotIndex;
	private final StandingResponse standing;

	public SetSlotResponse() {
		super(EntityType.SET_SLOT);

		id = null;
		entrant = null;
		prereqId = null;
		prereqPlacement = null;
		prereqType = null;
		slotIndex = null;
		standing = null;
	}

	public SetSlotResponse(IDResponse id, EntrantResponse entrant, StringResponse prereqId, IntResponse prereqPlacement, StringResponse prereqType, IntResponse slotIndex, StandingResponse standing) {
		super(EntityType.SET_SLOT, true);
		this.id = id;
		this.entrant = entrant;
		this.prereqId = prereqId;
		this.prereqPlacement = prereqPlacement;
		this.prereqType = prereqType;
		this.slotIndex = slotIndex;
		this.standing = standing;
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
	 * Pairs with prereqType, is the ID of the prereq.
	 */
	public StringResponse getPrereqId() {
		checkProvided();
		return prereqId;
	}

	/**
	 * Given a set prereq type, defines the placement required in the origin set to end up in this slot.
	 */
	public IntResponse getPrereqPlacement() {
		checkProvided();
		return prereqPlacement;
	}

	/**
	 * Describes where the entity in this slot comes from.
	 */
	public StringResponse getPrereqType() {
		checkProvided();
		return prereqType;
	}

	/**
	 * The index of the slot. Unique per set.
	 */
	public IntResponse getSlotIndex() {
		checkProvided();
		return slotIndex;
	}

	/**
	 * The standing within this set for the seed currently assigned to this slot.
	 */
	public StandingResponse getStanding() {
		checkProvided();
		return standing;
	}
}
