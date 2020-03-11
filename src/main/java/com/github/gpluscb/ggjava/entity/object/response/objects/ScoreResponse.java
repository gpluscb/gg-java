package com.github.gpluscb.ggjava.entity.object.response.objects;

import com.github.gpluscb.ggjava.entity.EntityType;
import com.github.gpluscb.ggjava.entity.object.response.AbstractGGResponseObject;
import com.github.gpluscb.ggjava.entity.object.response.scalars.FloatResponse;
import com.github.gpluscb.ggjava.entity.object.response.scalars.StringResponse;

/**
 * The score that led to this standing being awarded. The meaning of this field can
 * vary by standing type and is not used for some standing types.
 */
public class ScoreResponse extends AbstractGGResponseObject {
	private final StringResponse label;
	private final FloatResponse value;
	private final StringResponse displayValue;

	public ScoreResponse() {
		super(EntityType.SCORE);

		label = null;
		value = null;
		displayValue = null;
	}

	public ScoreResponse(StringResponse label, FloatResponse value, StringResponse displayValue) {
		super(EntityType.SCORE, true);
		this.label = label;
		this.value = value;
		this.displayValue = displayValue;
	}

	/**
	 * The name of this score. e.g. "Kills" or "Stocks"
	 */
	public StringResponse getLabel() {
		checkProvided();
		return label;
	}

	/**
	 * The raw score value
	 */
	public FloatResponse getValue() {
		checkProvided();
		return value;
	}

	/**
	 * Like value, but formatted for race format events. Formatted according to the race config for the front end to use.
	 */
	public StringResponse getDisplayValue() {
		checkProvided();
		return displayValue;
	}
}
