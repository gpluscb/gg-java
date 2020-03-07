package com.github.gpluscb.ggjava.entity.object.response.scalars;

import com.github.gpluscb.ggjava.entity.EntityType;
import com.github.gpluscb.ggjava.entity.object.scalars.GGFloat;

import javax.annotation.Nonnull;

/**
 * The <code>Float</code> scalar type represents signed double-precision fractional values as specified by <a href="http://en.wikipedia.org/wiki/IEEE_floating_point">IEEE 754</a>.
 */
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
