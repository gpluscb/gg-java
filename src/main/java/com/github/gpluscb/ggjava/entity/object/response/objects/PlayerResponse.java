package com.github.gpluscb.ggjava.entity.object.response.objects;

import com.github.gpluscb.ggjava.entity.EntityType;
import com.github.gpluscb.ggjava.entity.object.response.AbstractGGResponseObject;
import com.github.gpluscb.ggjava.entity.object.response.ListResponse;
import com.github.gpluscb.ggjava.entity.object.response.scalars.IDResponse;
import com.github.gpluscb.ggjava.entity.object.response.scalars.StringResponse;
import com.github.gpluscb.ggjava.entity.object.response.scalars.TimestampResponse;

/**
 * A player
 */
public class PlayerResponse extends AbstractGGResponseObject {
	private final IDResponse id;
	private final ListResponse<PlayerRankResponse> rankings;
	private final ListResponse<SetResponse> recentSets;
	private final SetConnectionResponse sets;
	private final StringResponse prefix;
	private final StringResponse gamerTag;
	private final StringResponse color;
	private final TimestampResponse gamerTagChangedAt;

	public PlayerResponse() {
		super(EntityType.PLAYER);

		id = null;
		rankings = null;
		recentSets = null;
		sets = null;
		prefix = null;
		gamerTag = null;
		color = null;
		gamerTagChangedAt = null;
	}

	public PlayerResponse(IDResponse id, ListResponse<PlayerRankResponse> rankings, ListResponse<SetResponse> recentSets, SetConnectionResponse sets, StringResponse prefix, StringResponse gamerTag, StringResponse color, TimestampResponse gamerTagChangedAt) {
		super(EntityType.PLAYER, true);
		this.id = id;
		this.rankings = rankings;
		this.recentSets = recentSets;
		this.sets = sets;
		this.prefix = prefix;
		this.gamerTag = gamerTag;
		this.color = color;
		this.gamerTagChangedAt = gamerTagChangedAt;
	}

	public IDResponse getId() {
		checkProvided();
		return id;
	}

	/**
	 * Most recent active & published rankings
	 */
	public ListResponse<PlayerRankResponse> getRankings() {
		checkProvided();
		return rankings;
	}

	/**
	 * Recent sets for this player.
	 *
	 * @deprecated Use the sets field instead.
	 */
	@Deprecated
	public ListResponse<SetResponse> getRecentSets() {
		checkProvided();
		return recentSets;
	}

	/**
	 * Set history for this player.
	 */
	public SetConnectionResponse getSets() {
		checkProvided();
		return sets;
	}

	public StringResponse getPrefix() {
		checkProvided();
		return prefix;
	}

	public StringResponse getGamerTag() {
		checkProvided();
		return gamerTag;
	}

	public StringResponse getColor() {
		checkProvided();
		return color;
	}

	/**
	 * Time of player's last gamertag change
	 */
	public TimestampResponse getGamerTagChangedAt() {
		checkProvided();
		return gamerTagChangedAt;
	}
}
