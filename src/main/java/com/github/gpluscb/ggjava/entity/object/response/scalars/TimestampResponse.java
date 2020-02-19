package com.github.gpluscb.ggjava.entity.object.response.scalars;

import com.github.gpluscb.ggjava.entity.EntityType;
import com.github.gpluscb.ggjava.entity.object.response.AbstractGGResponseObject;
import com.github.gpluscb.ggjava.entity.object.scalars.GGTimestamp;
import com.github.gpluscb.ggjava.internal.utils.Checks;

import java.time.Instant;
import javax.annotation.Nonnull;

public class TimestampResponse extends ScalarResponse<Long> implements GGTimestamp {
	public TimestampResponse() {
		super(EntityType.TIMESTAMP);
	}
	
	public TimestampResponse(long value) {
		super(EntityType.TIMESTAMP, value);
	}
}
