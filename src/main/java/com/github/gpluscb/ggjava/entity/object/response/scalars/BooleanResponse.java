package com.github.gpluscb.ggjava.entity.object.response.scalars;

import com.github.gpluscb.ggjava.entity.EntityType;
import com.github.gpluscb.ggjava.entity.object.scalars.GGBoolean;

/**
 * The <code>Boolean</code> scalar type represents <code>true</code> or <code>false</code>.
 */
public class BooleanResponse extends ScalarResponse<Boolean> implements GGBoolean {
	public BooleanResponse() {
		super(EntityType.BOOLEAN);
	}

	public BooleanResponse(boolean value) {
		super(EntityType.BOOLEAN, value);
	}
}
