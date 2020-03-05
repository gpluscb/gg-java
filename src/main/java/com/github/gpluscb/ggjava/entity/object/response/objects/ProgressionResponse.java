package com.github.gpluscb.ggjava.entity.object.response.objects;

import com.github.gpluscb.ggjava.entity.EntityType;
import com.github.gpluscb.ggjava.entity.object.response.AbstractGGResponseObject;
import com.github.gpluscb.ggjava.entity.object.response.scalars.IDResponse;
import com.github.gpluscb.ggjava.entity.object.response.scalars.IntResponse;

/**
 * A connection between a placement in an origin phase group to a destination seed.
 */
public class ProgressionResponse extends AbstractGGResponseObject {
	private final IDResponse id;
	private final IntResponse originOrder;
	private final PhaseResponse originPhase;
	private final PhaseGroupResponse originPhaseGroup;
	private final IntResponse originPlacement;

	public ProgressionResponse() {
		super(EntityType.PROGRESSION);

		id = null;
		originOrder = null;
		originPhase = null;
		originPhaseGroup = null;
		originPlacement = null;
	}

	public ProgressionResponse(IDResponse id, IntResponse originOrder, PhaseResponse originPhase, PhaseGroupResponse originPhaseGroup, IntResponse originPlacement) {
		super(EntityType.PROGRESSION, true);
		this.id = id;
		this.originOrder = originOrder;
		this.originPhase = originPhase;
		this.originPhaseGroup = originPhaseGroup;
		this.originPlacement = originPlacement;
	}

	public IDResponse getId() {
		checkProvided();
		return id;
	}

	public IntResponse getOriginOrder() {
		checkProvided();
		return originOrder;
	}

	public PhaseResponse getOriginPhase() {
		checkProvided();
		return originPhase;
	}

	public PhaseGroupResponse getOriginPhaseGroup() {
		checkProvided();
		return originPhaseGroup;
	}

	public IntResponse getOriginPlacement() {
		checkProvided();
		return originPlacement;
	}
}
