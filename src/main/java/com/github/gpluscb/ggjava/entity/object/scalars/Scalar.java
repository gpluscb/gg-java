package com.github.gpluscb.ggjava.entity.object.scalars;

import com.github.gpluscb.ggjava.entity.object.GGObject;
import javax.annotation.Nonnull;

public interface Scalar<T> extends GGObject {
	@Nonnull
	T getValue();
}
