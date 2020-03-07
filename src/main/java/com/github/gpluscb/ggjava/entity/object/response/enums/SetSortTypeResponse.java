package com.github.gpluscb.ggjava.entity.object.response.enums;

import com.github.gpluscb.ggjava.entity.EntityType;
import com.github.gpluscb.ggjava.entity.enums.SetSortType;

import javax.annotation.Nonnull;

public class SetSortTypeResponse extends EnumResponse<SetSortType> {
	public SetSortTypeResponse() {
		super(EntityType.SET_SORT_TYPE);
	}

	public SetSortTypeResponse(@Nonnull SetSortType value) {
		super(EntityType.SET_SORT_TYPE, value);
	}
}
