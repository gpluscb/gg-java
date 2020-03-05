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
	private final PhaseResponse originPhase;
	private final PhaseGroupResponse originPhaseGroup;
	private final IntResponse originPlacement;
	private final IntResponse originOrder;

	public ProgressionResponse() {
		super(EntityType.PROGRESSION);

		id = null;
		originPhase = null;
		originPhaseGroup = null;
		originPlacement = null;
		originOrder = null;
	}

	public ProgressionResponse(IDResponse id, PhaseResponse originPhase, PhaseGroupResponse originPhaseGroup, IntResponse originPlacement, IntResponse originOrder) {
		super(EntityType.PROGRESSION, true);
		this.id = id;
		this.originPhase = originPhase;
		this.originPhaseGroup = originPhaseGroup;
		this.originPlacement = originPlacement;
		this.originOrder = originOrder;
	}

	public IDResponse getId() {
		checkProvided();
		return id;
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

	public IntResponse getOriginOrder() {
		checkProvided();
		return originOrder;
	}
}
