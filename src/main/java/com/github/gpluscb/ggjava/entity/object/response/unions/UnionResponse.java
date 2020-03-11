package com.github.gpluscb.ggjava.entity.object.response.unions;

import com.github.gpluscb.ggjava.entity.EntityType;
import com.github.gpluscb.ggjava.entity.object.response.AbstractGGResponseObject;

import javax.annotation.Nonnull;

public abstract class UnionResponse extends AbstractGGResponseObject {
	public UnionResponse(@Nonnull EntityType type) {
		super(type);
	}

	public UnionResponse(@Nonnull EntityType type, boolean provided) {
		super(type, provided);
	}
}
