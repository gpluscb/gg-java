package com.github.gpluscb.ggjava.entity.object.input;

import com.github.gpluscb.ggjava.entity.EntityType;
import com.github.gpluscb.ggjava.internal.utils.Checks;

import javax.annotation.Nonnull;
import javax.annotation.Nullable;

public abstract class InputVariable<T extends InputObject> extends AbstractInputObject {
	@Nonnull
	private final String name;
	private final boolean required;
	@Nullable
	private final T defaultValue;

	/**
	 * @throws IllegalArgumentException if name is null
	 */
	public InputVariable(@Nonnull EntityType type, @Nonnull String name, boolean required, @Nullable T defaultValue) {
		super(type);

		Checks.nonNull(name, "name");

		if (defaultValue != null && defaultValue.getGGEntityType() != type)
			throw new IllegalArgumentException("Parameter \"type\" does not align with type of parameter \"defaultValue\"");

		this.name = name;
		this.required = required;
		this.defaultValue = defaultValue;
	}

	/**
	 * @throws IllegalArgumentException if name is null
	 */
	public InputVariable(@Nonnull EntityType type, @Nonnull String name, boolean required) {
		this(type, name, required, null);
	}

	/**
	 * @throws IllegalArgumentException if name is null
	 */
	public InputVariable(@Nonnull EntityType type, @Nonnull String name) {
		this(type, name, false, null);
	}

	@Nonnull
	public String getName() {
		return name;
	}

	public boolean isRequired() {
		return required;
	}

	@Nullable
	public T getDefaultValue() {
		return defaultValue;
	}
}
