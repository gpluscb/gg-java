package com.github.gpluscb.ggjava.entity;

import com.github.gpluscb.ggjava.entity.object.input.AbstractInputObject;
import com.github.gpluscb.ggjava.internal.utils.Checks;
import javax.annotation.Nonnull;
import javax.annotation.Nullable;

public class InputValue<T extends AbstractInputObject> {
	@Nonnull
	private final EntityType type;
	@Nonnull
	private final String name;
	@Nullable
	private final T value;
	
	/**
	 * @throws IllegalArgumentException if type or name is null or if type doesn't match the type of value
	 */
	public InputValue(@Nonnull EntityType type, @Nonnull String name, @Nullable T value) throws IllegalArgumentException {
		Checks.nonNull(name, "name");
		Checks.nonNull(type, "type");
		if(value != null && value.getType() != type) throw new IllegalStateException("Parameter \"type\" does not match the type of parameter \"value\"");
		this.type = type;
		this.name = name;
		this.value = value;
	}
	
	@Nonnull
	public EntityType getType() {
		return type;
	}
	
	@Nonnull
	public String getName() {
		return name;
	}
	
	@Nullable
	public T getValue() {
		return value;
	}
}
