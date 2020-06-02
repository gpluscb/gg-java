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
	private final IntResponse orderNum;
	private final ListResponse<GameSelectionResponse> selections;
	private final StageResponse stage;
	private final IntResponse state;
	private final IntResponse winnerId;

	public GameResponse() {
		super(EntityType.GAME);

		id = null;
		images = null;
		orderNum = null;
		selections = null;
		stage = null;
		state = null;
		winnerId = null;
	}

	public GameResponse(IDResponse id, ListResponse<ImageResponse> images, IntResponse orderNum, ListResponse<GameSelectionResponse> selections, StageResponse stage, IntResponse state, IntResponse winnerId) {
		super(EntityType.GAME, true);
		this.id = id;
		this.images = images;
		this.orderNum = orderNum;
		this.selections = selections;
		this.stage = stage;
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

	public IntResponse getOrderNum() {
		checkProvided();
		return orderNum;
	}

	/**
	 * Selections for this game such as character, etc.
	 */
	public ListResponse<GameSelectionResponse> getSelections() {
		checkProvided();
		return selections;
	}

	/**
	 * The stage that this game was played on (if applicable)
	 */
	public StageResponse getStage() {
		checkProvided();
		return stage;
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
