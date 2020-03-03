package com.github.gpluscb.ggjava.entity.object.response.objects;

import com.github.gpluscb.ggjava.entity.EntityType;
import com.github.gpluscb.ggjava.entity.object.response.AbstractGGResponseObject;
import com.github.gpluscb.ggjava.entity.object.response.enums.GameSelectionTypeResponse;
import com.github.gpluscb.ggjava.entity.object.response.scalars.IDResponse;
import com.github.gpluscb.ggjava.entity.object.response.scalars.IntResponse;

/**
 * A selection for this game. i.e. character/stage selection, etc
 */
public class GameSelectionResponse extends AbstractGGResponseObject {
	private final IDResponse id;
	private final GameSelectionTypeResponse selectionType;
	private final IntResponse selectionValue;
	private final IntResponse orderNum;
	private final IntResponse entrantId;
	private final IntResponse participantId;

	public GameSelectionResponse() {
		super(EntityType.GAME_SELECTION);

		id = null;
		selectionType = null;
		selectionValue = null;
		orderNum = null;
		entrantId = null;
		participantId = null;
	}

	public GameSelectionResponse(IDResponse id, GameSelectionTypeResponse selectionType, IntResponse selectionValue, IntResponse orderNum, IntResponse entrantId, IntResponse participantId) {
		super(EntityType.GAME_SELECTION, true);
		this.id = id;
		this.selectionType = selectionType;
		this.selectionValue = selectionValue;
		this.orderNum = orderNum;
		this.entrantId = entrantId;
		this.participantId = participantId;
	}

	public IDResponse getId() {
		checkProvided();
		return id;
	}

	public GameSelectionTypeResponse getSelectionType() {
		checkProvided();
		return selectionType;
	}

	public IntResponse getSelectionValue() {
		checkProvided();
		return selectionValue;
	}

	public IntResponse getOrderNum() {
		checkProvided();
		return orderNum;
	}

	public IntResponse getEntrantId() {
		checkProvided();
		return entrantId;
	}

	public IntResponse getParticipantId() {
		checkProvided();
		return participantId;
	}
}
