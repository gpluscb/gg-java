package com.github.gpluscb.ggjava.entity.object.input;

import com.github.gpluscb.ggjava.entity.EntityType;
import com.github.gpluscb.ggjava.entity.object.AbstractGGObject;
import javax.annotation.Nonnull;

public abstract class AbstractInputObject extends AbstractGGObject implements InputObject {
	public AbstractInputObject(@Nonnull EntityType type) {
		super(type);
	}
}
