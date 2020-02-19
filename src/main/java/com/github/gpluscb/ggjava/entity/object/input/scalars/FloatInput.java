package com.github.gpluscb.ggjava.entity.object.input.scalars;

import com.github.gpluscb.ggjava.entity.EntityType;
import com.github.gpluscb.ggjava.entity.object.input.BasicInput;
import com.github.gpluscb.ggjava.entity.object.scalars.GGFloat;

public class FloatInput extends BasicInput<Float> implements GGFloat {
	public FloatInput(float value) throws IllegalArgumentException {
		super(EntityType.FLOAT, value);
	}
}
