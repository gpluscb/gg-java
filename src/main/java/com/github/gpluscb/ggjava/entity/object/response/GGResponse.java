package com.github.gpluscb.ggjava.entity.object.response;

import com.github.gpluscb.ggjava.api.exception.DeserializationException;
import com.github.gpluscb.ggjava.api.exception.GGError;
import com.github.gpluscb.ggjava.internal.json.Deserializer;
import com.github.gpluscb.ggjava.internal.utils.Checks;
import com.google.gson.JsonArray;
import com.google.gson.JsonElement;
import com.google.gson.JsonObject;

import javax.annotation.Nonnull;
import javax.annotation.Nullable;
import java.util.ArrayList;
import java.util.List;
import java.util.function.Function;

public class GGResponse<T extends GGResponseObject> {
	@Nonnull
	private final JsonObject responseRoot;
	@Nullable
	private final T data;
	@Nullable
	private final DeserializationException exception;
	@Nullable
	private final List<GGError> errors;
	@Nullable
	private final JsonObject extensions;
	@Nullable
	private final JsonArray actionRecords;

	/**
	 * @throws IllegalArgumentException if responseRoot or toClass are null
	 */
	public GGResponse(@Nonnull JsonObject responseRoot, @Nonnull Class<T> toClass) {
		Checks.nonNull(responseRoot, "responseRoot");
		Checks.nonNull(toClass, "toClass");

		this.responseRoot = responseRoot;

		JsonElement dataElement = responseRoot.get("data");

		T data;
		DeserializationException exception;
		try {
			data = dataElement == null ? null : Deserializer.deserialize(dataElement, toClass);
			exception = null;
		} catch (DeserializationException e) {
			exception = e;
			data = null;
		}
		this.data = data;
		this.exception = exception;

		JsonElement errorsElement = responseRoot.get("errors");
		if (errorsElement != null && errorsElement.isJsonArray()) {
			JsonArray errorsArray = errorsElement.getAsJsonArray();

			errors = new ArrayList<>(errorsArray.size());

			for (JsonElement element : errorsArray)
				errors.add(!element.isJsonObject() ? null : new GGError(element.getAsJsonObject()));
		} else errors = null;

		JsonElement extensionsElement = responseRoot.get("extensions");
		extensions = extensionsElement == null || !extensionsElement.isJsonObject() ? null : extensionsElement.getAsJsonObject();

		JsonElement actionRecordsElement = responseRoot.get("actionRecords");
		actionRecords = actionRecordsElement == null || !actionRecordsElement.isJsonArray() ? null : actionRecordsElement.getAsJsonArray();
	}

	public <U> U map(@Nonnull Function<GGResponse<T>, U> onError, @Nonnull Function<GGResponse<T>, U> onElse) {
		Checks.nonNull(onError, "onError");
		Checks.nonNull(onElse, "onElse");

		return errors != null || exception != null ? onError.apply(this) : onElse.apply(this);
	}

	@Nonnull
	public JsonObject getResponseRoot() {
		return responseRoot;
	}

	@Nullable
	public T getData() {
		return data;
	}

	@Nullable
	public DeserializationException getException() {
		return exception;
	}

	@Nullable
	public List<GGError> getErrors() {
		return errors;
	}

	@Nullable
	public JsonObject getExtensions() {
		return extensions;
	}

	@Nullable
	public JsonArray getActionRecords() {
		return actionRecords;
	}
}
