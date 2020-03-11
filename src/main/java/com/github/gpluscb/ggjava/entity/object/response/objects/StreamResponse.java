package com.github.gpluscb.ggjava.entity.object.response.objects;

import com.github.gpluscb.ggjava.entity.EntityType;
import com.github.gpluscb.ggjava.entity.object.response.AbstractGGResponseObject;
import com.github.gpluscb.ggjava.entity.object.response.enums.StreamTypeResponse;
import com.github.gpluscb.ggjava.entity.object.response.scalars.BooleanResponse;
import com.github.gpluscb.ggjava.entity.object.response.scalars.IDResponse;
import com.github.gpluscb.ggjava.entity.object.response.scalars.StringResponse;

/**
 * A Stream object
 */
public class StreamResponse extends AbstractGGResponseObject {
	private final IDResponse id;
	private final BooleanResponse isOnline;
	private final StringResponse name;
	private final StreamTypeResponse type;

	public StreamResponse() {
		super(EntityType.STREAM);

		id = null;
		isOnline = null;
		name = null;
		type = null;
	}

	public StreamResponse(IDResponse id, BooleanResponse isOnline, StringResponse name, StreamTypeResponse type) {
		super(EntityType.STREAM, true);
		this.id = id;
		this.isOnline = isOnline;
		this.name = name;
		this.type = type;
	}

	public IDResponse getId() {
		checkProvided();
		return id;
	}

	/**
	 * Whether the stream is currently live. May be slightly delayed.
	 */
	public BooleanResponse getIsOnline() {
		checkProvided();
		return isOnline;
	}

	/**
	 * The name of the stream
	 */
	public StringResponse getName() {
		checkProvided();
		return name;
	}

	/**
	 * The name of the external service providing this auth i.e. "twitch"
	 */
	public StreamTypeResponse getType() {
		checkProvided();
		return type;
	}
}
