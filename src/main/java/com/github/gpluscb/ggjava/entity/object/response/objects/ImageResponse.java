package com.github.gpluscb.ggjava.entity.object.response.objects;

import com.github.gpluscb.ggjava.entity.EntityType;
import com.github.gpluscb.ggjava.entity.object.response.AbstractGGResponseObject;
import com.github.gpluscb.ggjava.entity.object.response.scalars.*;

/**
 * An image
 */
public class ImageResponse extends AbstractGGResponseObject {
	private final IDResponse id;
	private final FloatResponse width;
	private final FloatResponse height;
	private final FloatResponse ratio;
	private final StringResponse type;
	private final StringResponse url;
	private final BooleanResponse isOriginal;
	private final StringResponse entity;
	private final IntResponse entityId;
	private final IntResponse uploadedBy;

	public ImageResponse() {
		super(EntityType.IMAGE);

		id = null;
		width = null;
		height = null;
		ratio = null;
		type = null;
		url = null;
		isOriginal = null;
		entity = null;
		entityId = null;
		uploadedBy = null;
	}

	public ImageResponse(IDResponse id, FloatResponse width, FloatResponse height, FloatResponse ratio, StringResponse type, StringResponse url, BooleanResponse isOriginal, StringResponse entity, IntResponse entityId, IntResponse uploadedBy) {
		super(EntityType.IMAGE, true);
		this.id = id;
		this.width = width;
		this.height = height;
		this.ratio = ratio;
		this.type = type;
		this.url = url;
		this.isOriginal = isOriginal;
		this.entity = entity;
		this.entityId = entityId;
		this.uploadedBy = uploadedBy;
	}

	public IDResponse getId() {
		checkProvided();
		return id;
	}

	public FloatResponse getWidth() {
		checkProvided();
		return width;
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

	public BooleanResponse getIsOriginal() {
		checkProvided();
		return isOriginal;
	}

	public StringResponse getEntity() {
		checkProvided();
		return entity;
	}

	public IntResponse getEntityId() {
		checkProvided();
		return entityId;
	}

	public IntResponse getUploadedBy() {
		checkProvided();
		return uploadedBy;
	}
}
