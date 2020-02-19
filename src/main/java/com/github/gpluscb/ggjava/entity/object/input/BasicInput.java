package com.github.gpluscb.ggjava.entity.object.input;

import com.github.gpluscb.ggjava.entity.EntityType;
import com.github.gpluscb.ggjava.internal.utils.Checks;
import javax.annotation.Nonnull;

public abstract class BasicInput<T> extends AbstractInputObject {
	@Nonnull
	private final T value;
	
	/**
	 * @throws IllegalArgumentException if value is null
	 */
	public BasicInput(@Nonnull EntityType type, @Nonnull T value) throws IllegalArgumentException {
		super(type);
		
		Checks.nonNull(value, "value");
		this.value = value;
	}
	
	@Nonnull
	public T getValue() {
		return value;
	}
}