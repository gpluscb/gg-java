package com.github.gpluscb.ggjava.entity.object.response.enums;

import com.github.gpluscb.ggjava.entity.EntityType;
import com.github.gpluscb.ggjava.entity.enums.StreamType;

import javax.annotation.Nonnull;

public class StreamTypeResponse extends EnumResponse<StreamType> {
	public StreamTypeResponse() {
		super(EntityType.STREAM_TYPE);
	}

	public StreamTypeResponse(@Nonnull StreamType value) {
		super(EntityType.STREAM_TYPE, value);
	}
}
