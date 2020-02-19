package com.github.gpluscb.ggjava.entity.object.input.enums;

import com.github.gpluscb.ggjava.entity.EntityType;
import javax.annotation.Nonnull;

import com.github.gpluscb.ggjava.entity.enums.GGEnum;
import com.github.gpluscb.ggjava.entity.object.input.BasicInput;

public abstract class EnumInput<T extends GGEnum> extends BasicInput<T> {
	/**
	 * @throws IllegalArgumentException if value is null
	 */
	public EnumInput(@Nonnull EntityType type, @Nonnull T value) throws IllegalArgumentException {
		super(type, value);
	}
}
