package com.github.gpluscb.ggjava.entity.object.scalars;

import java.time.Instant;

/**
 * Represents a Unix Timestamp. Supports up to 53 bit int values,
 *         as that is JavaScript's internal memory allocation for integer values.
 */
public interface GGTimestamp extends Scalar<Long> {
	default Instant getValueInstant() {
		return Instant.ofEpochSecond(getValue());
	}
}
