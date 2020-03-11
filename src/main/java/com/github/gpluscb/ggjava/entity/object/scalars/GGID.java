package com.github.gpluscb.ggjava.entity.object.scalars;

/**
 * The <code>ID</code> scalar type represents a unique identifier, often used to
 * refetch an object or as key for a cache. The ID type appears in a JSON
 * response as a String; however, it is not intended to be human-readable.
 * When expected as an input type, any string (such as <code>"4"</code>) or integer
 * (such as <code>4</code>) input value will be accepted as an ID.
 */
public interface GGID extends Scalar<String> {
	default long getValueLong() {
		return Long.parseLong(getValue());
	}
}
