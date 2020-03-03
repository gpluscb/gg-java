package com.github.gpluscb.ggjava.entity.object.response.objects;

import com.github.gpluscb.ggjava.entity.EntityType;
import com.github.gpluscb.ggjava.entity.object.response.AbstractGGResponseObject;
import com.github.gpluscb.ggjava.entity.object.response.ListResponse;
import com.github.gpluscb.ggjava.entity.object.response.scalars.IDResponse;
import com.github.gpluscb.ggjava.entity.object.response.scalars.IntResponse;
import com.github.gpluscb.ggjava.entity.object.response.scalars.StringResponse;
import com.github.gpluscb.ggjava.entity.object.response.scalars.TimestampResponse;

/**
 * A player
 */
public class PlayerResponse extends AbstractGGResponseObject {
	private final IDResponse id;
	private final ListResponse<ImageResponse> images;
	private final ListResponse<PlayerRankResponse> rankings;
	private final ListResponse<SetResponse> recentSets;
	private final StringResponse prefix;
	private final StringResponse gamerTag;
	private final StringResponse color;
	private final StringResponse twitchStream;
	private final StringResponse twitterHandle;
	private final StringResponse youtube;
	private final StringResponse region;
	private final StringResponse state;
	private final StringResponse country;
	private final IntResponse nameDisplay;
	private final TimestampResponse gamerTagChangedAt;

	public PlayerResponse() {
		super(EntityType.PLAYER);

		id = null;
		images = null;
		rankings = null;
		recentSets = null;
		prefix = null;
		gamerTag = null;
		color = null;
		twitchStream = null;
		twitterHandle = null;
		youtube = null;
		region = null;
		state = null;
		country = null;
		nameDisplay = null;
		gamerTagChangedAt = null;
	}

	public PlayerResponse(IDResponse id, ListResponse<ImageResponse> images, ListResponse<PlayerRankResponse> rankings, ListResponse<SetResponse> recentSets, StringResponse prefix, StringResponse gamerTag, StringResponse color, StringResponse twitchStream, StringResponse twitterHandle, StringResponse youtube, StringResponse region, StringResponse state, StringResponse country, IntResponse nameDisplay, TimestampResponse gamerTagChangedAt) {
		super(EntityType.PLAYER, true);
		this.id = id;
		this.images = images;
		this.rankings = rankings;
		this.recentSets = recentSets;
		this.prefix = prefix;
		this.gamerTag = gamerTag;
		this.color = color;
		this.twitchStream = twitchStream;
		this.twitterHandle = twitterHandle;
		this.youtube = youtube;
		this.region = region;
		this.state = state;
		this.country = country;
		this.nameDisplay = nameDisplay;
		this.gamerTagChangedAt = gamerTagChangedAt;
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
	 * Active, published rankings
	 */
	public ListResponse<PlayerRankResponse> getRankings() {
		checkProvided();
		return rankings;
	}

	/**
	 * Recent sets for this player.
	 */
	public ListResponse<SetResponse> getRecentSets() {
		checkProvided();
		return recentSets;
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

	public StringResponse getTwitchStream() {
		checkProvided();
		return twitchStream;
	}

	public StringResponse getTwitterHandle() {
		checkProvided();
		return twitterHandle;
	}

	public StringResponse getYoutube() {
		checkProvided();
		return youtube;
	}

	public StringResponse getRegion() {
		checkProvided();
		return region;
	}

	public StringResponse getState() {
		checkProvided();
		return state;
	}

	public StringResponse getCountry() {
		checkProvided();
		return country;
	}

	/**
	 * Player's public name display preference
	 */
	public IntResponse getNameDisplay() {
		checkProvided();
		return nameDisplay;
	}

	/**
	 * Time of player's last gamertag change
	 */
	public TimestampResponse getGamerTagChangedAt() {
		checkProvided();
		return gamerTagChangedAt;
	}
}
