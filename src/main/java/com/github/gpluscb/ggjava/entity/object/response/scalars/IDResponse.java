package com.github.gpluscb.ggjava.entity.object.response.scalars;

import com.github.gpluscb.ggjava.entity.EntityType;
import com.github.gpluscb.ggjava.entity.object.response.AbstractGGResponseObject;
import com.github.gpluscb.ggjava.entity.object.scalars.GGID;
import com.github.gpluscb.ggjava.internal.utils.Checks;

import javax.annotation.Nonnull;

public class IDResponse extends ScalarResponse<String> implements GGID {
	public IDResponse() {
		super(EntityType.ID);
	}
	
	/**
	 * @throws IllegalArgumentException if value is null
	 */
	public IDResponse(@Nonnull String value) {
		super(EntityType.ID, value);
	}
}
