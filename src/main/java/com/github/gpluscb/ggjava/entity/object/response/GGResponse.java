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
import java.util.function.Consumer;
import java.util.function.Function;

/**
 * Represents a response from the smash.gg api.
 *
 * @param <T> The type of the data. Typically either {@link com.github.gpluscb.ggjava.entity.object.response.objects.QueryResponse} or {@link com.github.gpluscb.ggjava.entity.object.response.objects.MutationResponse}
 */
// TODO: Lazy?
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

	/**
	 * Applies itself either to onError if either the errors field is present or deserialization failed, and to onElse if that is not the case and returns the result.
	 *
	 * @param onError the function to apply if the errors field is present or deserialization failed
	 * @param onElse the function to apply if the errors field is not present and deserialization succeeded
	 * @param <U> the return type
	 * @return the result of the applied function
	 * @throws IllegalStateException if onError or onElse are null
	 */
	public <U> U map(@Nonnull Function<GGResponse<T>, U> onError, @Nonnull Function<GGResponse<T>, U> onElse) {
		Checks.nonNull(onError, "onError");
		Checks.nonNull(onElse, "onElse");

		return errors != null || exception != null ? onError.apply(this) : onElse.apply(this);
	}

	/**
	 * The unprocessed JsonObject of the response.
	 *
	 * @return the response root
	 */
	@Nonnull
	public JsonObject getResponseRoot() {
		return responseRoot;
	}

	/**
	 * The deserialized data.
	 *
	 * @return the deserialized data or null if deserialization failed
	 */
	@Nullable
	public T getData() {
		return data;
	}

	/**
	 * The Exception that occurred during deserialization.
	 *
	 * @return The DeserializationException or null if it deserialization was successful
	 */
	@Nullable
	public DeserializationException getException() {
		return exception;
	}

	/**
	 * The errors field.
	 *
	 * @return The errors field as a {@link List}{@literal <}{@link GGError}{@literal >}
	 */
	@Nullable
	public List<GGError> getErrors() {
		return errors;
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
	 * The unprocessed actionRecords field of the response.
	 *
	 * @return the actionRecords field
	 */
	@Nullable
	public JsonArray getActionRecords() {
		return actionRecords;
	}
}
