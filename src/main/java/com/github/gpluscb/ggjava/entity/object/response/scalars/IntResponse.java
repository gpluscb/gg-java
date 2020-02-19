package com.github.gpluscb.ggjava.entity.object.response.scalars;

import com.github.gpluscb.ggjava.entity.EntityType;
import com.github.gpluscb.ggjava.entity.object.response.BasicResponse;
import com.github.gpluscb.ggjava.entity.object.scalars.GGInt;

public class IntResponse extends BasicResponse<Integer> implements GGInt {
	public IntResponse() {
		super(EntityType.INT);
	}
	
	public IntResponse(int value) throws IllegalArgumentException {
		super(EntityType.INT, value);
	}
}
