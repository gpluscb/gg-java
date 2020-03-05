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
	private final ListResponse<ImageResponse> images;
	private final PlayerResponse player;
	private final AddressResponse location;
	private final ListResponse<ProfileAuthorizationResponse> authorizations;
	private final StringResponse name;
	private final StringResponse slug;
	private final StringResponse bio;

	public UserResponse() {
		super(EntityType.USER);

		id = null;
		images = null;
		player = null;
		location = null;
		authorizations = null;
		name = null;
		slug = null;
		bio = null;
	}

	public UserResponse(IDResponse id, ListResponse<ImageResponse> images, PlayerResponse player, AddressResponse location, ListResponse<ProfileAuthorizationResponse> authorizations, StringResponse name, StringResponse slug, StringResponse bio) {
		super(EntityType.USER, true);
		this.id = id;
		this.images = images;
		this.player = player;
		this.location = location;
		this.authorizations = authorizations;
		this.name = name;
		this.slug = slug;
		this.bio = bio;
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
	 * player for user
	 */
	public PlayerResponse getPlayer() {
		checkProvided();
		return player;
	}

	/**
	 * Public location info for this user
	 */
	public AddressResponse getLocation() {
		checkProvided();
		return location;
	}

	/**
	 * Authorizations to external services (i.e. Twitch, Twitter)
	 */
	public ListResponse<ProfileAuthorizationResponse> getAuthorizations() {
		checkProvided();
		return authorizations;
	}

	/**
	 * Public facing user name that respects user publishing settings
	 */
	public StringResponse getName() {
		checkProvided();
		return name;
	}

	public StringResponse getSlug() {
		checkProvided();
		return slug;
	}

	public StringResponse getBio() {
		checkProvided();
		return bio;
	}
}
