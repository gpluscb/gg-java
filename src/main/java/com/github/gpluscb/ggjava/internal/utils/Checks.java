package com.github.gpluscb.ggjava.internal.utils;

import javax.annotation.Nonnull;
import java.util.Collection;

public class Checks {
	/**
	 * @throws IllegalArgumentException if object is null
	 */
	public static void nonNull(Object object, String name) throws IllegalArgumentException {
		if (object == null)
			throw new IllegalArgumentException("Parameter " + name + " is null");
	}

	/**
	 * @throws IllegalArgumentException if string is empty (or null)
	 */
	public static void notEmpty(@Nonnull String string, String name) {
		nonNull(string, "string");
		if (string.isEmpty())
			throw new IllegalArgumentException("Parameter " + name + " is empty");
	}

	/**
	 * @throws IllegalArgumentException if collection contains null values (or is null)
	 */
	public static void noneNull(@Nonnull Collection<?> collection, String name) throws IllegalArgumentException {
		nonNull(collection, "collection");
		if (collection.contains(null))
			throw new IllegalArgumentException("Parameter " + name + " contains null values");
	}

	/**
	 * @throws IllegalArgumentException if number is negative (or null)
	 */
	public static void nonNegative(@Nonnull Number number, String name) throws IllegalArgumentException {
		nonNull(number, "number");
		if (number.doubleValue() < 0)
			throw new IllegalArgumentException("Parameter " + name + " is negative");
	}
}
