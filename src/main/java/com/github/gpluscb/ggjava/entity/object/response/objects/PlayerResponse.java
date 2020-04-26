package com.github.gpluscb.ggjava.entity.object.response.objects;

import com.github.gpluscb.ggjava.entity.EntityType;
import com.github.gpluscb.ggjava.entity.object.response.AbstractGGResponseObject;
import com.github.gpluscb.ggjava.entity.object.response.ListResponse;
import com.github.gpluscb.ggjava.entity.object.response.scalars.IDResponse;
import com.github.gpluscb.ggjava.entity.object.response.scalars.StringResponse;

/**
 * A player
 */
public class PlayerResponse extends AbstractGGResponseObject {
	private final IDResponse id;
	private final StringResponse gamerTag;
	private final StringResponse prefix;
	private final ListResponse<PlayerRankResponse> rankings;
	private final ListResponse<SetResponse> recentSets;
	private final SetConnectionResponse sets;
	private final UserResponse user;

	public PlayerResponse() {
		super(EntityType.PLAYER);

		id = null;
		gamerTag = null;
		prefix = null;
		rankings = null;
		recentSets = null;
		sets = null;
		user = null;
	}

	public PlayerResponse(IDResponse id, StringResponse gamerTag, StringResponse prefix, ListResponse<PlayerRankResponse> rankings, ListResponse<SetResponse> recentSets, SetConnectionResponse sets, UserResponse user) {
		super(EntityType.PLAYER, true);
		this.id = id;
		this.gamerTag = gamerTag;
		this.prefix = prefix;
		this.rankings = rankings;
		this.recentSets = recentSets;
		this.sets = sets;
		this.user = user;
	}

	public IDResponse getId() {
		checkProvided();
		return id;
	}

	public StringResponse getGamerTag() {
		checkProvided();
		return gamerTag;
	}

	public StringResponse getPrefix() {
		checkProvided();
		return prefix;
	}

	/**
	 * Most recent active {@literal &} published rankings
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

	public UserResponse getUser() {
		checkProvided();
		return user;
	}
}
