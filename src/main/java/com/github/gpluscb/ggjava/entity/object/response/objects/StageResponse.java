package com.github.gpluscb.ggjava.entity.object.response.objects;

import com.github.gpluscb.ggjava.entity.EntityType;
import com.github.gpluscb.ggjava.entity.object.response.AbstractGGResponseObject;
import com.github.gpluscb.ggjava.entity.object.response.scalars.IDResponse;
import com.github.gpluscb.ggjava.entity.object.response.scalars.StringResponse;

/**
 * Video Stage
 */
public class StageResponse extends AbstractGGResponseObject {
	private final IDResponse id;
	private final StringResponse name;

	public StageResponse() {
		super(EntityType.STAGE);

		id = null;
		name = null;
	}

	public StageResponse(IDResponse id, StringResponse name) {
		super(EntityType.STAGE, true);
		this.id = id;
		this.name = name;
	}

	public IDResponse getId() {
		checkProvided();
		return id;
	}

	/**
	 * Stage name
	 */
	public StringResponse getName() {
		checkProvided();
		return name;
	}
}
