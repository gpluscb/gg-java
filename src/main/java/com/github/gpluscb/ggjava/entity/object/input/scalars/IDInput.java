package com.github.gpluscb.ggjava.entity.object.input.scalars;

import com.github.gpluscb.ggjava.entity.EntityType;
import com.github.gpluscb.ggjava.entity.object.input.BasicInput;
import com.github.gpluscb.ggjava.entity.object.scalars.GGID;
import javax.annotation.Nonnull;

public class IDInput extends BasicInput<String> implements GGID {
	/**
	 * @throws IllegalArgumentException if value is null
	 */
	public IDInput(@Nonnull String value) throws IllegalArgumentException {
		super(EntityType.STRING, value);
	}
	
	public IDInput(long value) {
		this(String.valueOf(value));
	}
}
