package com.github.gpluscb.ggjava.entity.object.input.scalars;

import com.github.gpluscb.ggjava.entity.EntityType;
import com.github.gpluscb.ggjava.entity.object.input.BasicInput;
import com.github.gpluscb.ggjava.entity.object.scalars.GGJSON;
import com.google.gson.JsonElement;
import com.google.gson.JsonParseException;
import com.google.gson.JsonParser;
import javax.annotation.Nonnull;

public class JSONInput extends BasicInput<String> implements GGJSON {
	/**
	 * @throws IllegalArgumentException if value is null
	 */
	public JSONInput(@Nonnull String value) throws IllegalArgumentException {
		super(EntityType.JSON, value);
	}
	
	/**
	 * @throws IllegalArgumentException if value is null
	 */
	public JSONInput(@Nonnull JsonElement value) throws IllegalArgumentException {
		this(value.toString());
	}
}
