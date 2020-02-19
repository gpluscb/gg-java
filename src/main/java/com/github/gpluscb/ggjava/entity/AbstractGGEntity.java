package com.github.gpluscb.ggjava.entity;

import com.github.gpluscb.ggjava.internal.utils.Checks;
import javax.annotation.Nonnull;

public abstract class AbstractGGEntity implements GGEntity {
	@Nonnull
	private final EntityType type;
	
	public AbstractGGEntity(@Nonnull EntityType type) {
		Checks.nonNull(type, "type");
		this.type = type;
	}
	
	@Override
	@Nonnull
	public EntityType getType() {
		return type;
	}
}
