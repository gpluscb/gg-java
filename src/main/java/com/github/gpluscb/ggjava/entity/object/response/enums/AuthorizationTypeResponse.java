package com.github.gpluscb.ggjava.entity.object.response.enums;

import com.github.gpluscb.ggjava.entity.EntityType;
import com.github.gpluscb.ggjava.entity.enums.AuthorizationType;

import javax.annotation.Nonnull;

/**
 * Represents the name of the third-party service (e.g Twitter) for OAuth
 */
public class AuthorizationTypeResponse extends EnumResponse<AuthorizationType> {
	public AuthorizationTypeResponse() {
		super(EntityType.AUTHORIZATION_TYPE);
	}

	public AuthorizationTypeResponse(@Nonnull AuthorizationType value) {
		super(EntityType.AUTHORIZATION_TYPE, value);
	}
}
