package com.github.gpluscb.ggjava.entity.object.response.objects;

import com.github.gpluscb.ggjava.entity.EntityType;
import com.github.gpluscb.ggjava.entity.object.response.AbstractGGResponseObject;
import com.github.gpluscb.ggjava.entity.object.response.scalars.FloatResponse;
import com.github.gpluscb.ggjava.entity.object.response.scalars.IDResponse;
import com.github.gpluscb.ggjava.entity.object.response.scalars.StringResponse;

/**
 * An image
 */
public class ImageResponse extends AbstractGGResponseObject {
	private final IDResponse id;
	private final FloatResponse height;
	private final FloatResponse ratio;
	private final StringResponse type;
	private final StringResponse url;
	private final FloatResponse width;

	public ImageResponse() {
		super(EntityType.IMAGE);

		id = null;
		height = null;
		ratio = null;
		type = null;
		url = null;
		width = null;
	}

	public ImageResponse(IDResponse id, FloatResponse height, FloatResponse ratio, StringResponse type, StringResponse url, FloatResponse width) {
		super(EntityType.IMAGE, true);
		this.id = id;
		this.height = height;
		this.ratio = ratio;
		this.type = type;
		this.url = url;
		this.width = width;
	}

	public IDResponse getId() {
		checkProvided();
		return id;
	}

	public FloatResponse getHeight() {
		checkProvided();
		return height;
	}

	public FloatResponse getRatio() {
		checkProvided();
		return ratio;
	}

	public StringResponse getType() {
		checkProvided();
		return type;
	}

	public StringResponse getUrl() {
		checkProvided();
		return url;
	}

	public FloatResponse getWidth() {
		checkProvided();
		return width;
	}
}
