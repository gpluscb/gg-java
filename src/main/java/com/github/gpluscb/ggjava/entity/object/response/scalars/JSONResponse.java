package com.github.gpluscb.ggjava.entity.object.response.scalars;

import com.github.gpluscb.ggjava.entity.EntityType;
import com.github.gpluscb.ggjava.entity.object.scalars.GGJSON;

import javax.annotation.Nonnull;

public class JSONResponse extends ScalarResponse<String> implements GGJSON {
	public JSONResponse() {
		super(EntityType.JSON);
	}

	/**
	 * @throws IllegalArgumentException if value is null
	 */
	public JSONResponse(@Nonnull String value) throws IllegalArgumentException {
		super(EntityType.JSON, value);
	}
}
