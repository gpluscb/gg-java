package com.github.gpluscb.ggjava.entity.object.response.objects;

import com.github.gpluscb.ggjava.entity.EntityType;
import com.github.gpluscb.ggjava.entity.object.response.AbstractGGResponseObject;
import com.github.gpluscb.ggjava.entity.object.response.ListResponse;
import com.github.gpluscb.ggjava.entity.object.response.scalars.IDResponse;
import com.github.gpluscb.ggjava.entity.object.response.scalars.IntResponse;

/**
 * A game represents a single game within a set.
 */
public class GameResponse extends AbstractGGResponseObject {
	private final IDResponse id;
	private final ListResponse<ImageResponse> images;
	private final ListResponse<GameSelectionResponse> selections;
	private final IDResponse setId;
	private final IntResponse orderNum;
	private final IntResponse state;
	private final IntResponse winnerId;

	public GameResponse() {
		super(EntityType.GAME);

		id = null;
		images = null;
		selections = null;
		setId = null;
		orderNum = null;
		state = null;
		winnerId = null;
	}

	public GameResponse(IDResponse id, ListResponse<ImageResponse> images, ListResponse<GameSelectionResponse> selections, IDResponse setId, IntResponse orderNum, IntResponse state, IntResponse winnerId) {
		super(EntityType.GAME, true);
		this.id = id;
		this.images = images;
		this.selections = selections;
		this.setId = setId;
		this.orderNum = orderNum;
		this.state = state;
		this.winnerId = winnerId;
	}

	public IDResponse getId() {
		checkProvided();
		return id;
	}

	public ListResponse<ImageResponse> getImages() {
		checkProvided();
		return images;
	}

	/**
	 * Selections for this game such as character, stage, etc.
	 */
	public ListResponse<GameSelectionResponse> getSelections() {
		checkProvided();
		return selections;
	}

	public IDResponse getSetId() {
		checkProvided();
		return setId;
	}

	public IntResponse getOrderNum() {
		checkProvided();
		return orderNum;
	}

	public IntResponse getState() {
		checkProvided();
		return state;
	}

	public IntResponse getWinnerId() {
		checkProvided();
		return winnerId;
	}
}
