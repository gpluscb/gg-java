package com.github.gpluscb.ggjava.entity.object.response.enums;

import com.github.gpluscb.ggjava.entity.EntityType;
import com.github.gpluscb.ggjava.entity.enums.StreamType;

import javax.annotation.Nonnull;

/**
 * Represents the type of stream service
 */
public class StreamTypeResponse extends EnumResponse<StreamType> {
	public StreamTypeResponse() {
		super(EntityType.STREAM_TYPE);
	}

	public StreamTypeResponse(@Nonnull StreamType value) {
		super(EntityType.STREAM_TYPE, value);
	}
}
