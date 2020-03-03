package com.github.gpluscb.ggjava.entity.object.input.enums;

import com.github.gpluscb.ggjava.entity.EntityType;
import com.github.gpluscb.ggjava.entity.enums.GGEnum;
import com.github.gpluscb.ggjava.entity.object.input.BasicInput;

import javax.annotation.Nonnull;

public abstract class EnumInput<T extends GGEnum> extends BasicInput<T> {
	/**
	 * @throws IllegalArgumentException if value is null
	 */
	public EnumInput(@Nonnull EntityType type, @Nonnull T value) throws IllegalArgumentException {
		super(type, value);
	}
}
