package com.github.gpluscb.ggjava.entity.object.scalars;

import com.google.gson.JsonElement;
import com.google.gson.JsonParser;

/**
 * The <code>JSON</code> scalar type represents JSON values as specified by
 *         <a href="http://www.ecma-international.org/publications/files/ECMA-ST/ECMA-404.pdf">ECMA-404</a>.
 */
public interface GGJSON extends Scalar<String> {
	default JsonElement getValueJson() {
		return JsonParser.parseString(getValue());
	}
}
