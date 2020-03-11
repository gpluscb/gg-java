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
	private final EntrantResponse entrant;
	private final IntResponse orderNum;
	private final ParticipantResponse participant;
	private final GameSelectionTypeResponse selectionType;
	private final IntResponse selectionValue;

	public GameSelectionResponse() {
		super(EntityType.GAME_SELECTION);

		id = null;
		entrant = null;
		orderNum = null;
		participant = null;
		selectionType = null;
		selectionValue = null;
	}

	public GameSelectionResponse(IDResponse id, EntrantResponse entrant, IntResponse orderNum, ParticipantResponse participant, GameSelectionTypeResponse selectionType, IntResponse selectionValue) {
		super(EntityType.GAME_SELECTION, true);
		this.id = id;
		this.entrant = entrant;
		this.orderNum = orderNum;
		this.participant = participant;
		this.selectionType = selectionType;
		this.selectionValue = selectionValue;
	}

	public IDResponse getId() {
		checkProvided();
		return id;
	}

	/**
	 * The entrant who this selection is for
	 */
	public EntrantResponse getEntrant() {
		checkProvided();
		return entrant;
	}

	public IntResponse getOrderNum() {
		checkProvided();
		return orderNum;
	}

	/**
	 * The participant who this selection is for. This is only populated if there are
	 * selections for multiple participants of a single entrant
	 */
	public ParticipantResponse getParticipant() {
		checkProvided();
		return participant;
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
