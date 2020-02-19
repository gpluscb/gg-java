package com.github.gpluscb.ggjava.entity.fragment;

import com.github.gpluscb.ggjava.entity.AbstractGGEntity;
import com.github.gpluscb.ggjava.entity.EntityType;
import javax.annotation.Nonnull;

public abstract class AbstractGGFragment extends AbstractGGEntity implements GGFragment {
	public AbstractGGFragment(@Nonnull EntityType type) {
		super(type);
	}
}