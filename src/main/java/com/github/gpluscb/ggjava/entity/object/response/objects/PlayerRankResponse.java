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
	private final StringResponse title;
	private final IntResponse rank;

	public PlayerRankResponse() {
		super(EntityType.PLAYER_RANK);

		id = null;
		title = null;
		rank = null;
	}

	public PlayerRankResponse(IDResponse id, StringResponse title, IntResponse rank) {
		super(EntityType.PLAYER_RANK, true);
		this.id = id;
		this.title = title;
		this.rank = rank;
	}

	public IDResponse getId() {
		checkProvided();
		return id;
	}

	public StringResponse getTitle() {
		checkProvided();
		return title;
	}

	/**
	 * The player's placement on the ranking
	 */
	public IntResponse getRank() {
		checkProvided();
		return rank;
	}
}
