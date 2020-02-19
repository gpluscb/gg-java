package com.github.gpluscb.ggjava.entity.object.input.scalars;

import com.github.gpluscb.ggjava.entity.EntityType;
import com.github.gpluscb.ggjava.entity.object.input.BasicInput;
import com.github.gpluscb.ggjava.entity.object.scalars.GGString;
import javax.annotation.Nonnull;

public class StringInput extends BasicInput<String> implements GGString {
	/**
	 * @throws IllegalArgumentException if value is null
	 */
	public StringInput(@Nonnull String value) throws IllegalArgumentException {
		super(EntityType.STRING, value);
	}
}
