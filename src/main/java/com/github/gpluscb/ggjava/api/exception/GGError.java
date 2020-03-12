package com.github.gpluscb.ggjava.api.exception;

import com.github.gpluscb.ggjava.internal.utils.Checks;
import com.google.gson.JsonArray;
import com.google.gson.JsonElement;
import com.google.gson.JsonObject;

import javax.annotation.Nonnull;
import javax.annotation.Nullable;
import java.util.ArrayList;
import java.util.List;

/**
 * Represents a single error element from the errors field of the smash.gg api response.
 */
public class GGError {
	@Nonnull
	private final JsonObject errorRoot;
	@Nullable
	private final String message;
	@Nullable
	private final List<Location> locations;
	@Nullable
	private final JsonArray path;
	@Nullable
	private final JsonObject extensions;
	@Nullable
	private final String errorId;

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

		JsonElement extensionsElement = errorRoot.get("extensions");
		extensions = extensionsElement == null || !extensionsElement.isJsonObject() ? null : extensionsElement.getAsJsonObject();

		JsonElement errorIdElement = errorRoot.get("errorId");
		errorId = errorIdElement == null || !errorIdElement.isJsonPrimitive() || !errorIdElement.getAsJsonPrimitive().isString() ? null : errorIdElement.getAsString();
	}

	/**
	 * The unprocessed JsonObject of the error.
	 *
	 * @return the error root
	 */
	@Nonnull
	public JsonObject getErrorRoot() {
		return errorRoot;
	}

	/**
	 * The message field of the error.
	 *
	 * @return the message field
	 */
	@Nullable
	public String getMessage() {
		return message;
	}

	/**
	 * The locations field.
	 *
	 * @return The locations field as a {@link List}{@literal <}{@link Location}{@literal >}
	 */
	@Nullable
	public List<Location> getLocations() {
		return locations;
	}

	/**
	 * The unprocessed path field of the response.
	 *
	 * @return the path field
	 */
	@Nullable
	public JsonArray getPath() {
		return path;
	}

	/**
	 * The unprocessed extensions field of the response.
	 *
	 * @return the extensions field
	 */
	@Nullable
	public JsonObject getExtensions() {
		return extensions;
	}

	/**
	 * The errorId field of the response.
	 *
	 * @return the errorId field
	 */
	@Nullable
	public String getErrorId() {
		return errorId;
	}

	/**
	 * Represents the location of an error.
	 */
	public static class Location {
		@Nonnull
		private final JsonObject locationRoot;
		@Nullable
		private final Integer line;
		@Nullable
		private final Integer column;

		/**
		 * @throws IllegalArgumentException if locationRoot is null
		 */
		public Location(@Nonnull JsonObject locationRoot) {
			Checks.nonNull(locationRoot, "locationRoot");

			this.locationRoot = locationRoot;

			JsonElement lineElement = locationRoot.get("line");
			line = lineElement == null || !lineElement.isJsonPrimitive() || !lineElement.getAsJsonPrimitive().isString() ? null : lineElement.getAsInt();

			JsonElement columnElement = locationRoot.get("column");
			column = columnElement == null || !columnElement.isJsonPrimitive() || !columnElement.getAsJsonPrimitive().isString() ? null : columnElement.getAsInt();
		}

		/**
		 * The unprocessed JsonObject of the location.
		 *
		 * @return the location root
		 */
		@Nonnull
		public JsonObject getLocationRoot() {
			return locationRoot;
		}

		/**
		 * The line field of the location.
		 *
		 * @return the line field
		 */
		@Nullable
		public Integer getLine() {
			return line;
		}

		/**
		 * The column field of the location.
		 *
		 * @return the column field
		 */
		@Nullable
		public Integer getColumn() {
			return column;
		}
	}
}
