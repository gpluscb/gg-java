package com.github.gpluscb.ggjava.entity.object.response.objects;

import com.github.gpluscb.ggjava.entity.EntityType;
import com.github.gpluscb.ggjava.entity.object.response.AbstractGGResponseObject;
import com.github.gpluscb.ggjava.entity.object.response.ListResponse;
import com.github.gpluscb.ggjava.entity.object.response.scalars.FloatResponse;
import com.github.gpluscb.ggjava.entity.object.response.scalars.IDResponse;
import com.github.gpluscb.ggjava.entity.object.response.scalars.StringResponse;

/**
 * A shop level
 */
public class ShopLevelResponse extends AbstractGGResponseObject {
	private final IDResponse id;
	private final FloatResponse currAmount;
	private final StringResponse description;
	private final FloatResponse goalAmount;
	private final ListResponse<ImageResponse> images;
	private final StringResponse name;

	public ShopLevelResponse() {
		super(EntityType.SHOP_LEVEL);

		id = null;
		currAmount = null;
		description = null;
		goalAmount = null;
		images = null;
		name = null;
	}

	public ShopLevelResponse(IDResponse id, FloatResponse currAmount, StringResponse description, FloatResponse goalAmount, ListResponse<ImageResponse> images, StringResponse name) {
		super(EntityType.SHOP_LEVEL, true);
		this.id = id;
		this.currAmount = currAmount;
		this.description = description;
		this.goalAmount = goalAmount;
		this.images = images;
		this.name = name;
	}

	public IDResponse getId() {
		checkProvided();
		return id;
	}

	public FloatResponse getCurrAmount() {
		checkProvided();
		return currAmount;
	}

	public StringResponse getDescription() {
		checkProvided();
		return description;
	}

	public FloatResponse getGoalAmount() {
		checkProvided();
		return goalAmount;
	}

	public ListResponse<ImageResponse> getImages() {
		checkProvided();
		return images;
	}

	public StringResponse getName() {
		checkProvided();
		return name;
	}
}
