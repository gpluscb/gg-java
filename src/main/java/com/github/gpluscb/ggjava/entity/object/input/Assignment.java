package com.github.gpluscb.ggjava.entity.object.input;

import javax.annotation.Nonnull;

import com.github.gpluscb.ggjava.internal.utils.Checks;

public class Assignment {
	@Nonnull
	private final String variable;
	@Nonnull
	private final InputObject value;
	
	public Assignment(@Nonnull String variable, @Nonnull InputObject value) {
		Checks.nonNull(variable, "variable");
		Checks.nonNull(value, "value");
		
		this.variable = variable;
		this.value = value;
	}
	
	@Nonnull
	public String getVariable() {
		return variable;
	}
	
	@Nonnull
	public InputObject getValue() {
		return value;
	}
}
