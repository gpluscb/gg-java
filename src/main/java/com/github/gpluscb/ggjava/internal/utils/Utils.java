package com.github.gpluscb.ggjava.internal.utils;

import javax.annotation.Nonnull;

public class Utils {
	/**
	 * @throws IllegalArgumentException if string is null
	 */
	public static String firstCharLowercase(@Nonnull String string) {
		Checks.nonNull(string, "string");
		
		return string.substring(0, 1).toLowerCase() + string.substring(1);
	}
	
	/**
	 * @throws IllegalArgumentException if string is null
	 */
	public static String firstCharUppercase(@Nonnull String string) {
		Checks.nonNull(string, "string");
		
		return string.substring(0, 1).toUpperCase() + string.substring(1);
	}
}
