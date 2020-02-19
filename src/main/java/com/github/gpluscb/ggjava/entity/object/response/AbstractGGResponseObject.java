package com.github.gpluscb.ggjava.entity.object.response;

import com.github.gpluscb.ggjava.entity.EntityType;
import com.github.gpluscb.ggjava.entity.object.AbstractGGObject;
import javax.annotation.Nonnull;

public abstract class AbstractGGResponseObject extends AbstractGGObject implements GGResponseObject {
	private final boolean provided;
	
	/**
	 * Sets provided to false
	 */
	public AbstractGGResponseObject(@Nonnull EntityType type) {
		super(type);
		
		provided = false;
	}
	
	public AbstractGGResponseObject(@Nonnull EntityType type, boolean provided) {
		super(type);
		
		this.provided = provided;
	}
	
	public boolean isProvided() {
		return provided;
	}
	
	/**
	 * @throws IllegalStateException if provided is false
	 */
	public void checkProvided() throws IllegalStateException {
		if(!provided) throw new IllegalStateException("This is not provided");
	}
}
