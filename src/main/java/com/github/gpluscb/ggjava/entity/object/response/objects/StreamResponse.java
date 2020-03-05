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
	private final StreamTypeResponse type;
	private final StringResponse name;
	private final BooleanResponse isOnline;
	private final StringResponse externalStreamId;

	public StreamResponse() {
		super(EntityType.STREAM);

		id = null;
		type = null;
		name = null;
		isOnline = null;
		externalStreamId = null;
	}

	public StreamResponse(IDResponse id, StreamTypeResponse type, StringResponse name, BooleanResponse isOnline, StringResponse externalStreamId) {
		super(EntityType.STREAM, true);
		this.id = id;
		this.type = type;
		this.name = name;
		this.isOnline = isOnline;
		this.externalStreamId = externalStreamId;
	}

	public IDResponse getId() {
		checkProvided();
		return id;
	}

	/**
	 * The name of the external service providing this auth i.e. "twitch"
	 */
	public StreamTypeResponse getType() {
		checkProvided();
		return type;
	}

	/**
	 * The name of the stream
	 */
	public StringResponse getName() {
		checkProvided();
		return name;
	}

	/**
	 * Unix timestamp for when the token expires
	 */
	public BooleanResponse getIsOnline() {
		checkProvided();
		return isOnline;
	}

	/**
	 * The id given by the external stream service i.e. twitch channelId
	 */
	public StringResponse getExternalStreamId() {
		checkProvided();
		return externalStreamId;
	}
}
