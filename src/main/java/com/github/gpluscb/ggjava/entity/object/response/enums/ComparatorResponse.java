package com.github.gpluscb.ggjava.entity.object.response.enums;

import com.github.gpluscb.ggjava.entity.EntityType;
import com.github.gpluscb.ggjava.entity.enums.Comparator;

import javax.annotation.Nonnull;

/**
 * Comparison operator
 */
public class ComparatorResponse extends EnumResponse<Comparator> {
	public ComparatorResponse() {
		super(EntityType.COMPARATOR);
	}

	public ComparatorResponse(@Nonnull Comparator value) {
		super(EntityType.COMPARATOR, value);
	}
}
