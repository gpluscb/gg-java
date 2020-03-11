package com.github.gpluscb.ggjava.api.exception;

import com.github.gpluscb.ggjava.internal.utils.Checks;
import com.google.gson.JsonArray;
import com.google.gson.JsonElement;
import com.google.gson.JsonObject;

import javax.annotation.Nonnull;
import javax.annotation.Nullable;
import java.util.ArrayList;
import java.util.List;

public class GGError {
	@Nonnull
	private final JsonObject errorRoot;
	@Nullable
	private final String message;
	@Nullable
	private final List<Location> locations;
	@Nullable
	private final JsonArray path;

	/**
	 * @throws IllegalArgumentException if errorRoot is null
	 */
	public GGError(@Nonnull JsonObject errorRoot) {
		Checks.nonNull(errorRoot, "errorRoot");

		this.errorRoot = errorRoot;

		JsonElement messageElement = errorRoot.get("message");
		message = messageElement == null || !messageElement.isJsonPrimitive() || !messageElement.getAsJsonPrimitive().isString() ? null : messageElement.getAsString();

		JsonElement locationsElement = errorRoot.get("locations");
		if (locationsElement != null && locationsElement.isJsonArray()) {
			JsonArray locationsArray = locationsElement.getAsJsonArray();

			locations = new ArrayList<>(locationsArray.size());

			for (JsonElement element : locationsArray)
				locations.add(!element.isJsonObject() ? null : new Location(element.getAsJsonObject()));
		} else locations = null;

		JsonElement pathElement = errorRoot.get("path");
		path = pathElement == null || !pathElement.isJsonArray() ? null : pathElement.getAsJsonArray();
	}

	@Nonnull
	public JsonObject getErrorRoot() {
		return errorRoot;
	}

	@Nullable
	public String getMessage() {
		return message;
	}

	@Nullable
	public List<Location> getLocations() {
		return locations;
	}

	@Nullable
	public JsonArray getPath() {
		return path;
	}

	public static class Location {
		@Nonnull
		private final JsonObject locationRoot;
		@Nullable
		private final Integer line;
		@Nullable
		private final Integer column;

		public Location(@Nonnull JsonObject locationRoot) {
			this.locationRoot = locationRoot;

			JsonElement lineElement = locationRoot.get("line");
			line = lineElement == null || !lineElement.isJsonPrimitive() || !lineElement.getAsJsonPrimitive().isString() ? null : lineElement.getAsInt();

			JsonElement columnElement = locationRoot.get("column");
			column = columnElement == null || !columnElement.isJsonPrimitive() || !columnElement.getAsJsonPrimitive().isString() ? null : columnElement.getAsInt();
		}

		@Nonnull
		public JsonObject getLocationRoot() {
			return locationRoot;
		}

		@Nullable
		public Integer getLine() {
			return line;
		}

		@Nullable
		public Integer getColumn() {
			return column;
		}
	}
}
