package com.github.gpluscb.ggjava.internal.json;

import com.github.gpluscb.ggjava.entity.EntityType;
import com.github.gpluscb.ggjava.entity.object.response.GGResponseObject;
import com.github.gpluscb.ggjava.entity.object.response.ListResponse;
import com.github.gpluscb.ggjava.entity.object.response.enums.EnumResponse;
import com.github.gpluscb.ggjava.entity.object.response.scalars.FloatResponse;
import com.github.gpluscb.ggjava.entity.object.response.scalars.IntResponse;
import com.github.gpluscb.ggjava.entity.object.response.scalars.TimestampResponse;
import com.github.gpluscb.ggjava.entity.object.response.unions.UnionResponse;
import com.github.gpluscb.ggjava.internal.exception.DeserializationException;
import com.google.gson.JsonArray;
import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import com.google.gson.JsonPrimitive;

import javax.annotation.Nonnull;
import javax.annotation.Nullable;
import java.lang.reflect.*;
import java.util.ArrayList;
import java.util.List;

public class Deserializer {
	@Nullable
	public static <T extends GGResponseObject> T deserialize(@Nonnull JsonElement json, @Nonnull Class<T> toClass) throws DeserializationException {
		if (json.isJsonNull()) {
			return null;
		} else if (json.isJsonObject()) {
			return deserialize(json.getAsJsonObject(), toClass);
		} else if (json.isJsonArray()) {
			throw new DeserializationException("For deserializing JsonArrays, use <T extends GGResponseObject> ListResponse<T> deserialize(JsonArray, Class<T> innerClass)");
		} else if (json.isJsonPrimitive()) {
			return deserialize(json.getAsJsonPrimitive(), toClass);
		}

		throw new DeserializationException("Illegal state reached: json is neither JsonNull, JsonObject, JsonArray nor JsonPrimitive");
	}

	@Nonnull
	public static <T extends GGResponseObject> T deserialize(@Nonnull JsonObject json, @Nonnull Class<T> toClass) throws DeserializationException {
		if(UnionResponse.class.isAssignableFrom(toClass)) {
			throw new DeserializationException("Unions are not yet supported for deserialization");
		}

		// Getting constructors
		Constructor<T> constructor = null;
		for (Constructor<?> c : toClass.getConstructors()) {
			if (c.getParameterCount() != 0) {
				// See documentation of getConstructors, this can only be Constructor<T>
				constructor = (Constructor<T>) c;
				break;
			}
		}

		if (constructor == null)
			throw new DeserializationException("No fitting constructor found for " + toClass.toString());

		Object[] constructorArgs = new Object[constructor.getParameterCount()];

		Parameter[] params = constructor.getParameters();
		for (int i = 0; i < params.length; i++) {
			Parameter param = params[i];

			String name = param.getName();
			Class<?> paramType = param.getType();

			if (json.has(name)) {
				JsonElement value = json.get(name);

				if (!GGResponseObject.class.isAssignableFrom(paramType))
					throw new DeserializationException("Type of parameter " + i + " of the constructor " + toClass.toString() + " ( type is " + paramType.toString() + ") does mot extend GGResponseObject");

				if (value.isJsonArray()) {
					Type paramParameterizedType = param.getParameterizedType();

					if (!(paramParameterizedType instanceof ParameterizedType))
						throw new DeserializationException("Cannot retrieve parameterized types for parameter " + param.toString());

					Type[] typeArguments = ((ParameterizedType) paramParameterizedType).getActualTypeArguments();

					if (typeArguments.length != 1)
						throw new DeserializationException("Unexpected number of generic type parameters for param " + param.toString());

					if (!(typeArguments[0] instanceof Class))
						throw new DeserializationException("Generic type parameter does not implement class");

					// No way to check if GGResponseObject is safe
					Class<? extends GGResponseObject> classArgument = (Class<? extends GGResponseObject>) typeArguments[0];

					constructorArgs[i] = deserialize(value.getAsJsonArray(), classArgument);
				} else {
					constructorArgs[i] = deserialize(value, (Class<? extends GGResponseObject>) paramType);
				}
			} else {
				// Not provided, invoke no args constructor for this case
				try {
					if (paramType.equals(ListResponse.class)) {
						// TODO: Code duplication
						Type paramParameterizedType = param.getParameterizedType();

						if (!(paramParameterizedType instanceof ParameterizedType))
							throw new DeserializationException("Cannot retrieve parameterized types for parameter " + param.toString());

						Type[] typeArguments = ((ParameterizedType) paramParameterizedType).getActualTypeArguments();

						if (typeArguments.length != 1)
							throw new DeserializationException("Unexpected number of generic type parameters for param " + param.toString());

						if (!(typeArguments[0] instanceof Class))
							throw new DeserializationException("Generic type parameter does not implement class");

						// No way to check if GGResponseObject is safe
						Class<? extends GGResponseObject> classArgument = (Class<? extends GGResponseObject>) typeArguments[0];

						// Get EntityType constructor
						Constructor<?> paramConstructor = paramType.getConstructor(EntityType.class);

						EntityType paramEntityType = EntityType.getByResponseClass(classArgument);

						constructorArgs[i] = paramConstructor.newInstance(paramEntityType);
					} else {
						// Get no args constructor
						Constructor<?> paramConstructorNoArgs = paramType.getConstructor();

						Object arg = paramConstructorNoArgs.newInstance();

						constructorArgs[i] = arg;
					}
				} catch (NoSuchMethodException e) {
					throw new DeserializationException("No fitting constructor found for " + paramType.toString(), e);
				} catch (IllegalAccessException | InvocationTargetException | InstantiationException e) {
					throw new DeserializationException("Exception caught while invoking no args constructor for " + paramType.toString(), e);
				}
			}
		}

		try {
			return constructor.newInstance(constructorArgs);
		} catch (InstantiationException | InvocationTargetException | IllegalAccessException e) {
			throw new DeserializationException("Exception caught while invoking constructor for " + toClass.toString(), e);
		}
	}

	@Nonnull
	public static <T extends GGResponseObject> ListResponse<T> deserialize(@Nonnull JsonArray json, @Nonnull Class<T> toClass) throws DeserializationException {
		EntityType type = EntityType.getByResponseClass(toClass);
		if (type == null) throw new DeserializationException("No EntityType found for class " + toClass.toString());

		List<T> ret = new ArrayList<>();

		for (JsonElement element : json)
			ret.add(deserialize(element, toClass));

		return new ListResponse<>(type, ret);
	}

	@Nonnull
	public static <T extends GGResponseObject> T deserialize(@Nonnull JsonPrimitive json, @Nonnull Class<T> toClass) throws DeserializationException {
		// Getting constructors
		Constructor<T> constructor = null;
		for (Constructor<?> c : toClass.getConstructors()) {
			if (c.getParameterCount() == 1) {
				// See documentation of getConstructors, this can only be Constructor<T>
				constructor = (Constructor<T>) c;
				break;
			}
		}

		if (constructor == null)
			throw new DeserializationException("No fitting constructor found for " + toClass.toString());

		try {
			if (EnumResponse.class.isAssignableFrom(toClass)) {
				if (!json.isString())
					throw new DeserializationException("toClass is an EnumResponse, but json is not a String");

				// Enum
				try {
					// Get emum class
					Class<?> enumClass = constructor.getParameters()[0].getType();

					Method valueOf = enumClass.getMethod("valueOf", String.class);

					// valueOf should be static
					Object enumValue = valueOf.invoke(null, json.getAsString());

					return constructor.newInstance(enumValue);
				} catch (NoSuchMethodException e) {
					throw new DeserializationException("No valueOf method found in class " + toClass.toString(), e);
				}
			} else {
				// Scalar
				if (json.isBoolean()) {
					return constructor.newInstance(json.getAsBoolean());
				} else if (json.isString()) {
					return constructor.newInstance(json.getAsString());
				} else if (json.isNumber()) {
					if (toClass.equals(IntResponse.class)) {
						return constructor.newInstance(json.getAsInt());
					} else if (toClass.equals(TimestampResponse.class)) {
						return constructor.newInstance(json.getAsLong());
					} else if (toClass.equals(FloatResponse.class)) {
						return constructor.newInstance(json.getAsFloat());
					} else {
						throw new DeserializationException("Unknown scalar for JSON number type: " + toClass.toString());
					}
				} else {
					throw new DeserializationException("JsonPrimitive is neither Boolean nor String nor Number, which is weird and probably illegal");
				}
			}
		} catch (InstantiationException | IllegalAccessException | InvocationTargetException e) {
			throw new DeserializationException("Constructor or valueOf invocation failed", e);
		}
	}
}
