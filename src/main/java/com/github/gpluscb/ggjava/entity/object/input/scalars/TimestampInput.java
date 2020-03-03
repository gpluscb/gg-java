package com.github.gpluscb.ggjava.entity.object.input.scalars;

import com.github.gpluscb.ggjava.entity.EntityType;
import com.github.gpluscb.ggjava.entity.object.input.BasicInput;
import com.github.gpluscb.ggjava.entity.object.scalars.GGTimestamp;

import javax.annotation.Nonnull;
import java.time.Instant;

public class TimestampInput extends BasicInput<Long> implements GGTimestamp {
	public TimestampInput(long value) throws IllegalArgumentException {
		super(EntityType.TIMESTAMP, value);
	}

	public TimestampInput(@Nonnull Instant value) {
		this(value.getEpochSecond());
	}
}
