package com.github.gpluscb.ggjava.entity.enums;

import com.github.gpluscb.ggjava.entity.EntityType;
import javax.annotation.Nonnull;

public enum ActivityState implements GGEnum {
	/**
	 * Activity is created
	 */
	CREATED,
	/**
	 * Activity is active or in process
	 */
	ACTIVE,
	/**
	 * Activity is done
	 */
	COMPLETED,
	/**
	 * Activity is ready to be started
	 */
	READY,
	/**
	 * Activity is invalid
	 */
	INVALID,
	/**
	 * Activity, like a set, has been called to start
	 */
	CALLED,
	/**
	 * Activity is queued to run
	 */
	QUEUED;
	
	@Nonnull
	@Override
	public EntityType getType() {
		return EntityType.ACTIVITY_STATE;
	}
}
