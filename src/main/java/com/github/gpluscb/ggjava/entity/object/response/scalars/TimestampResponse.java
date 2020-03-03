package com.github.gpluscb.ggjava.entity.object.response.scalars;

import com.github.gpluscb.ggjava.entity.EntityType;
import com.github.gpluscb.ggjava.entity.object.scalars.GGTimestamp;

public class TimestampResponse extends ScalarResponse<Long> implements GGTimestamp {
	public TimestampResponse() {
		super(EntityType.TIMESTAMP);
	}

	public TimestampResponse(long value) {
		super(EntityType.TIMESTAMP, value);
	}
}
