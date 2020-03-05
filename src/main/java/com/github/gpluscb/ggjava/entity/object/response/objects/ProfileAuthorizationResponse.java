package com.github.gpluscb.ggjava.entity.object.response.objects;

import com.github.gpluscb.ggjava.entity.EntityType;
import com.github.gpluscb.ggjava.entity.object.response.AbstractGGResponseObject;
import com.github.gpluscb.ggjava.entity.object.response.enums.AuthorizationTypeResponse;
import com.github.gpluscb.ggjava.entity.object.response.scalars.IDResponse;
import com.github.gpluscb.ggjava.entity.object.response.scalars.StringResponse;

/**
 * An OAuth ProfileAuthorization object
 */
public class ProfileAuthorizationResponse extends AbstractGGResponseObject {
	private final IDResponse id;
	private final StringResponse externalUsername;
	private final StreamResponse stream;
	private final AuthorizationTypeResponse type;
	private final StringResponse url;

	public ProfileAuthorizationResponse() {
		super(EntityType.PROFILE_AUTHORIZATION);

		id = null;
		externalUsername = null;
		stream = null;
		type = null;
		url = null;
	}

	public ProfileAuthorizationResponse(IDResponse id, StringResponse externalUsername, StreamResponse stream, AuthorizationTypeResponse type, StringResponse url) {
		super(EntityType.PROFILE_AUTHORIZATION, true);
		this.id = id;
		this.externalUsername = externalUsername;
		this.stream = stream;
		this.type = type;
		this.url = url;
	}

	public IDResponse getId() {
		checkProvided();
		return id;
	}

	/**
	 * The username given by the external service (including discriminator if discord)
	 */
	public StringResponse getExternalUsername() {
		checkProvided();
		return externalUsername;
	}

	public StreamResponse getStream() {
		checkProvided();
		return stream;
	}

	/**
	 * The name of the external service providing this auth i.e. "twitch"
	 */
	public AuthorizationTypeResponse getType() {
		checkProvided();
		return type;
	}

	public StringResponse getUrl() {
		checkProvided();
		return url;
	}
}
