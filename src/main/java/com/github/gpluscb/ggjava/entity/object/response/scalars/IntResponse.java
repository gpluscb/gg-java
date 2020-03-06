package com.github.gpluscb.ggjava.entity.object.response.scalars;

import com.github.gpluscb.ggjava.entity.EntityType;
import com.github.gpluscb.ggjava.entity.object.scalars.GGInt;

public class IntResponse extends ScalarResponse<Integer> implements GGInt {
	public IntResponse() {
		super(EntityType.INT);
	}

	public IntResponse(int value) throws IllegalArgumentException {
		super(EntityType.INT, value);
	}
}
