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
	private final ListResponse<ProfileAuthorizationResponse> authorizations;
	private final IDResponse id;
	private final StringResponse bio;
	private final ListResponse<ImageResponse> images;
	private final AddressResponse location;
	private final StringResponse name;
	private final PlayerResponse player;
	private final StringResponse slug;

	public UserResponse() {
		super(EntityType.USER);

		authorizations = null;
		id = null;
		bio = null;
		images = null;
		location = null;
		name = null;
		player = null;
		slug = null;
	}

	public UserResponse(ListResponse<ProfileAuthorizationResponse> authorizations, IDResponse id, StringResponse bio, ListResponse<ImageResponse> images, AddressResponse location, StringResponse name, PlayerResponse player, StringResponse slug) {
		super(EntityType.USER, true);
		this.authorizations = authorizations;
		this.id = id;
		this.bio = bio;
		this.images = images;
		this.location = location;
		this.name = name;
		this.player = player;
		this.slug = slug;
	}

	/**
	 * Authorizations to external services (i.e. Twitch, Twitter)
	 */
	public ListResponse<ProfileAuthorizationResponse> getAuthorizations() {
		checkProvided();
		return authorizations;
	}

	public IDResponse getId() {
		checkProvided();
		return id;
	}

	public StringResponse getBio() {
		checkProvided();
		return bio;
	}

	public ListResponse<ImageResponse> getImages() {
		checkProvided();
		return images;
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
}
