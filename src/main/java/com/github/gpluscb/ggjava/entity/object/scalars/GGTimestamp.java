package com.github.gpluscb.ggjava.entity.object.scalars;

import java.time.Instant;

public interface GGTimestamp extends Scalar<Long> {
	default Instant getValueInstant() {
		return Instant.ofEpochSecond(getValue());
	}
}
