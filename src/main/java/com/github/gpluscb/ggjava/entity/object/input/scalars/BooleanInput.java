package com.github.gpluscb.ggjava.entity.object.input.scalars;

import com.github.gpluscb.ggjava.entity.EntityType;
import com.github.gpluscb.ggjava.entity.object.input.BasicInput;
import com.github.gpluscb.ggjava.entity.object.scalars.GGBoolean;

public class BooleanInput extends BasicInput<Boolean> implements GGBoolean {
	public BooleanInput(boolean value) throws IllegalArgumentException {
		super(EntityType.BOOLEAN, value);
	}
}
