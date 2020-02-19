package com.github.gpluscb.ggjava.entity.object;

import com.github.gpluscb.ggjava.entity.EntityType;
import com.github.gpluscb.ggjava.entity.AbstractGGEntity;
import javax.annotation.Nonnull;

public abstract class AbstractGGObject extends AbstractGGEntity implements GGObject {
	public AbstractGGObject(@Nonnull final EntityType type) {
		super(type);
	}
}
