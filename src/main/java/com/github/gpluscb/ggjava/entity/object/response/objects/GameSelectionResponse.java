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
	private final IntResponse orderNum;
	private final GameSelectionTypeResponse selectionType;
	private final IntResponse selectionValue;

	public GameSelectionResponse() {
		super(EntityType.GAME_SELECTION);

		id = null;
		orderNum = null;
		selectionType = null;
		selectionValue = null;
	}

	public GameSelectionResponse(IDResponse id, IntResponse orderNum, GameSelectionTypeResponse selectionType, IntResponse selectionValue) {
		super(EntityType.GAME_SELECTION, true);
		this.id = id;
		this.orderNum = orderNum;
		this.selectionType = selectionType;
		this.selectionValue = selectionValue;
	}

	public IDResponse getId() {
		checkProvided();
		return id;
	}

	public IntResponse getOrderNum() {
		checkProvided();
		return orderNum;
	}

	public GameSelectionTypeResponse getSelectionType() {
		checkProvided();
		return selectionType;
	}

	public IntResponse getSelectionValue() {
		checkProvided();
		return selectionValue;
	}
}
