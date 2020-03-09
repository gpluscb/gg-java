package com.github.gpluscb.ggjava.entity.object.response;

import com.github.gpluscb.ggjava.api.exception.GGError;
import com.google.gson.JsonArray;
import com.google.gson.JsonObject;

import java.util.List;

public class GGResponse<T extends GGResponseObject> {
	private final T data;
	private final List<GGError> errors;
	private final JsonObject extensions;
	private final JsonArray actionRecords;

	public GGResponse(T data, List<GGError> errors, JsonObject extensions, JsonArray actionRecords) {
		this.data = data;
		this.errors = errors;
		this.extensions = extensions;
		this.actionRecords = actionRecords;
	}

	public T getData() {
		return data;
	}

	public List<GGError> getErrors() {
		return errors;
	}

	public JsonObject getExtensions() {
		return extensions;
	}

	public JsonArray getActionRecords() {
		return actionRecords;
	}
}
