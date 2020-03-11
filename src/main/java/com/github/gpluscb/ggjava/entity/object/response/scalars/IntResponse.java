package com.github.gpluscb.ggjava.entity.object.response.scalars;

import com.github.gpluscb.ggjava.entity.EntityType;
import com.github.gpluscb.ggjava.entity.object.scalars.GGInt;

/**
 * The <code>Int</code> scalar type represents non-fractional signed whole numeric
 * values. Int can represent values between -(2^31) and 2^31 - 1.
 */
public class IntResponse extends ScalarResponse<Integer> implements GGInt {
	public IntResponse() {
		super(EntityType.INT);
	}

	public IntResponse(int value) throws IllegalArgumentException {
		super(EntityType.INT, value);
	}
}
