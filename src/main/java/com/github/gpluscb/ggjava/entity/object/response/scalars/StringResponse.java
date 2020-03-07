package com.github.gpluscb.ggjava.entity.object.response.scalars;

import com.github.gpluscb.ggjava.entity.EntityType;
import com.github.gpluscb.ggjava.entity.object.scalars.GGString;

import javax.annotation.Nonnull;

/**
 * The <code>String</code> scalar type represents textual data, represented as UTF-8
 * character sequences. The String type is most often used by GraphQL to
 * represent free-form human-readable text.
 */
public class StringResponse extends ScalarResponse<String> implements GGString {
	public StringResponse() {
		super(EntityType.STRING);
	}

	/**
	 * @throws IllegalArgumentException if value is null
	 */
	public StringResponse(@Nonnull String value) throws IllegalArgumentException {
		super(EntityType.STRING, value);
	}
}
