package com.github.gpluscb.ggjava.entity.object.input.scalars;

import com.github.gpluscb.ggjava.entity.EntityType;
import com.github.gpluscb.ggjava.entity.object.input.BasicInput;
import com.github.gpluscb.ggjava.entity.object.scalars.GGInt;

public class IntInput extends BasicInput<Integer> implements GGInt {
	/**
	 * @throws IllegalArgumentException if value is null
	 */
	public IntInput(int value) throws IllegalArgumentException {
		super(EntityType.INT, value);
	}
}
