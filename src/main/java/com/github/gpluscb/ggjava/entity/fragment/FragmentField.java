package com.github.gpluscb.ggjava.entity.fragment;

import com.github.gpluscb.ggjava.entity.InputValue;
import com.github.gpluscb.ggjava.entity.object.input.InputObject;
import com.github.gpluscb.ggjava.internal.utils.Checks;

import javax.annotation.Nonnull;
import java.util.Collections;
import java.util.List;

public class FragmentField<T extends GGFragment> {
	@Nonnull
	private List<InputValue<? extends InputObject>> inputs;
	@Nonnull
	private T value;

	/**
	 * @throws IllegalArgumentException if inputs or value is null or inputs contains null values
	 */
	public FragmentField(@Nonnull final List<InputValue<? extends InputObject>> inputs, @Nonnull final T value) throws IllegalArgumentException {
		Checks.nonNull(inputs, "inputs");
		Checks.noneNull(inputs, "inputs");
		Checks.nonNull(value, "value");

		this.inputs = inputs;
		this.value = value;
	}

	@Nonnull
	public List<InputValue<? extends InputObject>> getInputs() {
		return Collections.unmodifiableList(inputs);
	}

	@Nonnull
	public T getValue() {
		return value;
	}
}
