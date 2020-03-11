package com.github.gpluscb.ggjava.entity.object.response.objects;

import com.github.gpluscb.ggjava.entity.EntityType;
import com.github.gpluscb.ggjava.entity.object.response.AbstractGGResponseObject;
import com.github.gpluscb.ggjava.entity.object.response.scalars.StringResponse;

public class TournamentLinksResponse extends AbstractGGResponseObject {
	private final StringResponse facebook;
	private final StringResponse discord;

	public TournamentLinksResponse() {
		super(EntityType.TOURNAMENT_LINKS);

		facebook = null;
		discord = null;
	}

	public TournamentLinksResponse(StringResponse facebook, StringResponse discord) {
		super(EntityType.TOURNAMENT_LINKS, true);
		this.facebook = facebook;
		this.discord = discord;
	}

	public StringResponse getFacebook() {
		checkProvided();
		return facebook;
	}

	public StringResponse getDiscord() {
		checkProvided();
		return discord;
	}
}
