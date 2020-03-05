package com.github.gpluscb.ggjava.entity.object.response.objects;

import com.github.gpluscb.ggjava.entity.EntityType;
import com.github.gpluscb.ggjava.entity.object.response.AbstractGGResponseObject;
import com.github.gpluscb.ggjava.entity.object.response.scalars.IDResponse;
import com.github.gpluscb.ggjava.entity.object.response.scalars.StringResponse;

/**
 * A team, usually within the context of an event
 */
public class TeamResponse extends AbstractGGResponseObject {
	private final IDResponse id;
	private final StringResponse name;

	public TeamResponse() {
		super(EntityType.TEAM);

		id = null;
		name = null;
	}

	public TeamResponse(IDResponse id, StringResponse name) {
		super(EntityType.TEAM, true);
		this.id = id;
		this.name = name;
	}

	public IDResponse getId() {
		checkProvided();
		return id;
	}

	public StringResponse getName() {
		checkProvided();
		return name;
	}
}
