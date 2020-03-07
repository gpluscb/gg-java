package com.github.gpluscb.ggjava.entity.object.response.scalars;

import com.github.gpluscb.ggjava.entity.EntityType;
import com.github.gpluscb.ggjava.entity.object.scalars.GGJSON;

import javax.annotation.Nonnull;

/**
 * The <code>JSON</code> scalar type represents JSON values as specified by
 *         <a href="http://www.ecma-international.org/publications/files/ECMA-ST/ECMA-404.pdf">ECMA-404</a>.
 */
public class JSONResponse extends ScalarResponse<String> implements GGJSON {
	public JSONResponse() {
		super(EntityType.JSON);
	}

	/**
	 * @throws IllegalArgumentException if value is null
	 */
	public JSONResponse(@Nonnull String value) throws IllegalArgumentException {
		super(EntityType.JSON, value);
	}
}
