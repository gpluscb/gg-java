package com.github.gpluscb.ggjava.entity.object.response.scalars;

import com.github.gpluscb.ggjava.entity.EntityType;
import com.github.gpluscb.ggjava.entity.object.scalars.GGFloat;

import javax.annotation.Nonnull;

public class FloatResponse extends ScalarResponse<Float> implements GGFloat {
	public FloatResponse() {
		super(EntityType.FLOAT);
	}

	/**
	 * @throws IllegalArgumentException if value is null
	 */
	public FloatResponse(@Nonnull Float value) {
		super(EntityType.FLOAT, value);
	}
}
