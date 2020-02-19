package com.github.gpluscb.ggjava.entity.object.scalars;

import com.google.gson.JsonElement;
import com.google.gson.JsonParser;

public interface GGJSON extends Scalar<String> {
	default JsonElement getValueJson() {
		return JsonParser.parseString(getValue());
	}
}
