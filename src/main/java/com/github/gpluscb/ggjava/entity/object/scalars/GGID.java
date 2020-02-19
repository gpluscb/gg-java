package com.github.gpluscb.ggjava.entity.object.scalars;

public interface GGID extends Scalar<String> {
	default long getValueLong() {
		return Long.parseLong(getValue());
	}
}
