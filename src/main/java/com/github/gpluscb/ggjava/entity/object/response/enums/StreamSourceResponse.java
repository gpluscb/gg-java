package com.github.gpluscb.ggjava.entity.object.response.enums;

import com.github.gpluscb.ggjava.entity.EntityType;
import com.github.gpluscb.ggjava.entity.enums.StreamSource;

import javax.annotation.Nonnull;

public class StreamSourceResponse extends EnumResponse<StreamSource> {
	public StreamSourceResponse() {
		super(EntityType.STREAM_SOURCE);
	}

	public StreamSourceResponse(@Nonnull StreamSource value) {
		super(EntityType.STREAM_SOURCE, value);
	}
}
