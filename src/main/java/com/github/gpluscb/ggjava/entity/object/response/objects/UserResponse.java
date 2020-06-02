package com.github.gpluscb.ggjava.entity.object.response.objects;

import com.github.gpluscb.ggjava.entity.EntityType;
import com.github.gpluscb.ggjava.entity.object.response.AbstractGGResponseObject;
import com.github.gpluscb.ggjava.entity.object.response.ListResponse;
import com.github.gpluscb.ggjava.entity.object.response.scalars.IDResponse;
import com.github.gpluscb.ggjava.entity.object.response.scalars.StringResponse;

/**
 * A user
 */
public class UserResponse extends AbstractGGResponseObject {
	private final IDResponse id;
	private final ListResponse<ProfileAuthorizationResponse> authorizations;
	private final StringResponse bio;
	private final StringResponse birthday;
	private final EventConnectionResponse events;
	private final StringResponse genderPronoun;
	private final ListResponse<ImageResponse> images;
	private final LeagueConnectionResponse leagues;
	private final AddressResponse location;
	private final StringResponse name;
	private final PlayerResponse player;
	private final StringResponse slug;
	private final TournamentConnectionResponse tournaments;

	public UserResponse() {
		super(EntityType.USER);

		id = null;
		authorizations = null;
		bio = null;
		birthday = null;
		events = null;
		genderPronoun = null;
		images = null;
		leagues = null;
		location = null;
		name = null;
		player = null;
		slug = null;
		tournaments = null;
	}

	public UserResponse(IDResponse id, ListResponse<ProfileAuthorizationResponse> authorizations, StringResponse bio, StringResponse birthday, EventConnectionResponse events, StringResponse genderPronoun, ListResponse<ImageResponse> images, LeagueConnectionResponse leagues, AddressResponse location, StringResponse name, PlayerResponse player, StringResponse slug, TournamentConnectionResponse tournaments) {
		super(EntityType.USER, true);
		this.id = id;
		this.authorizations = authorizations;
		this.bio = bio;
		this.birthday = birthday;
		this.events = events;
		this.genderPronoun = genderPronoun;
		this.images = images;
		this.leagues = leagues;
		this.location = location;
		this.name = name;
		this.player = player;
		this.slug = slug;
		this.tournaments = tournaments;
	}

	public IDResponse getId() {
		checkProvided();
		return id;
	}

	/**
	 * Authorizations to external services (i.e. Twitch, Twitter)
	 */
	public ListResponse<ProfileAuthorizationResponse> getAuthorizations() {
		checkProvided();
		return authorizations;
	}

	public StringResponse getBio() {
		checkProvided();
		return bio;
	}

	/**
	 * Public facing user birthday that respects user publishing settings
	 */
	public StringResponse getBirthday() {
		checkProvided();
		return birthday;
	}

	/**
	 * Events this user has competed in
	 */
	public EventConnectionResponse getEvents() {
		checkProvided();
		return events;
	}

	public StringResponse getGenderPronoun() {
		checkProvided();
		return genderPronoun;
	}

	public ListResponse<ImageResponse> getImages() {
		checkProvided();
		return images;
	}

	/**
	 * Leagues this user has competed in
	 */
	public LeagueConnectionResponse getLeagues() {
		checkProvided();
		return leagues;
	}

	/**
	 * Public location info for this user
	 */
	public AddressResponse getLocation() {
		checkProvided();
		return location;
	}

	/**
	 * Public facing user name that respects user publishing settings
	 */
	public StringResponse getName() {
		checkProvided();
		return name;
	}

	/**
	 * player for user
	 */
	public PlayerResponse getPlayer() {
		checkProvided();
		return player;
	}

	public StringResponse getSlug() {
		checkProvided();
		return slug;
	}

	/**
	 * Tournaments this user is organizing or competing in
	 */
	public TournamentConnectionResponse getTournaments() {
		checkProvided();
		return tournaments;
	}
}
