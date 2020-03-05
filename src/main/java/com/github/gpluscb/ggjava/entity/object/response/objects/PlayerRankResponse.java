package com.github.gpluscb.ggjava.entity.object.response.objects;

import com.github.gpluscb.ggjava.entity.EntityType;
import com.github.gpluscb.ggjava.entity.object.response.AbstractGGResponseObject;
import com.github.gpluscb.ggjava.entity.object.response.scalars.IDResponse;
import com.github.gpluscb.ggjava.entity.object.response.scalars.IntResponse;
import com.github.gpluscb.ggjava.entity.object.response.scalars.StringResponse;

/**
 * A player's ranks
 */
public class PlayerRankResponse extends AbstractGGResponseObject {
	private final IDResponse id;
	private final IntResponse rank;
	private final StringResponse title;

	public PlayerRankResponse() {
		super(EntityType.PLAYER_RANK);

		id = null;
		rank = null;
		title = null;
	}

	public PlayerRankResponse(IDResponse id, IntResponse rank, StringResponse title) {
		super(EntityType.PLAYER_RANK, true);
		this.id = id;
		this.rank = rank;
		this.title = title;
	}

	public IDResponse getId() {
		checkProvided();
		return id;
	}

	/**
	 * The player's placement on the ranking
	 */
	public IntResponse getRank() {
		checkProvided();
		return rank;
	}

	public StringResponse getTitle() {
		checkProvided();
		return title;
	}
}
