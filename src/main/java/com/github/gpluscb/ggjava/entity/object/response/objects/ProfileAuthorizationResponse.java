package com.github.gpluscb.ggjava.entity.object.response.objects;

import com.github.gpluscb.ggjava.entity.EntityType;
import com.github.gpluscb.ggjava.entity.object.response.AbstractGGResponseObject;
import com.github.gpluscb.ggjava.entity.object.response.enums.AuthorizationTypeResponse;
import com.github.gpluscb.ggjava.entity.object.response.scalars.IDResponse;
import com.github.gpluscb.ggjava.entity.object.response.scalars.JSONResponse;
import com.github.gpluscb.ggjava.entity.object.response.scalars.StringResponse;
import com.github.gpluscb.ggjava.entity.object.response.scalars.TimestampResponse;

/**
 * An OAuth ProfileAuthorization object
 */
public class ProfileAuthorizationResponse extends AbstractGGResponseObject {
	private final IDResponse id;
	private final StreamResponse stream;
	private final StringResponse url;
	private final StringResponse externalUsername;
	private final AuthorizationTypeResponse type;
	private final TimestampResponse expiresAt;
	private final StringResponse externalId;
	private final StringResponse accessToken;
	private final JSONResponse metadata;

	public ProfileAuthorizationResponse() {
		super(EntityType.PROFILE_AUTHORIZATION);

		id = null;
		stream = null;
		url = null;
		externalUsername = null;
		type = null;
		expiresAt = null;
		externalId = null;
		accessToken = null;
		metadata = null;
	}

	public ProfileAuthorizationResponse(IDResponse id, StreamResponse stream, StringResponse url, StringResponse externalUsername, AuthorizationTypeResponse type, TimestampResponse expiresAt, StringResponse externalId, StringResponse accessToken, JSONResponse metadata) {
		super(EntityType.PROFILE_AUTHORIZATION, true);
		this.id = id;
		this.stream = stream;
		this.url = url;
		this.externalUsername = externalUsername;
		this.type = type;
		this.expiresAt = expiresAt;
		this.externalId = externalId;
		this.accessToken = accessToken;
		this.metadata = metadata;
	}

	public IDResponse getId() {
		checkProvided();
		return id;
	}

	public StreamResponse getStream() {
		checkProvided();
		return stream;
	}

	public StringResponse getUrl() {
		checkProvided();
		return url;
	}

	/**
	 * The username given by the external service (including discriminator if discord)
	 */
	public StringResponse getExternalUsername() {
		checkProvided();
		return externalUsername;
	}

	/**
	 * The name of the external service providing this auth i.e. "twitch"
	 */
	public AuthorizationTypeResponse getType() {
		checkProvided();
		return type;
	}

	/**
	 * Unix timestamp for when the token expires
	 */
	public TimestampResponse getExpiresAt() {
		checkProvided();
		return expiresAt;
	}

	/**
	 * The id given by the external service
	 */
	public StringResponse getExternalId() {
		checkProvided();
		return externalId;
	}

	/**
	 * The access token for this auth
	 */
	public StringResponse getAccessToken() {
		checkProvided();
		return accessToken;
	}

	/**
	 * Service-specific metadata
	 */
	public JSONResponse getMetadata() {
		checkProvided();
		return metadata;
	}
}
