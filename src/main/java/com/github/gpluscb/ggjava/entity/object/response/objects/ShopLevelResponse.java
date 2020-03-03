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
	private final ListResponse<ImageResponse> images;
	private final StringResponse name;
	private final FloatResponse goalAmount;
	private final FloatResponse currAmount;
	private final StringResponse description;

	public ShopLevelResponse() {
		super(EntityType.SHOP_LEVEL);

		id = null;
		images = null;
		name = null;
		goalAmount = null;
		currAmount = null;
		description = null;
	}

	public ShopLevelResponse(IDResponse id, ListResponse<ImageResponse> images, StringResponse name, FloatResponse goalAmount, FloatResponse currAmount, StringResponse description) {
		super(EntityType.SHOP_LEVEL, true);
		this.id = id;
		this.images = images;
		this.name = name;
		this.goalAmount = goalAmount;
		this.currAmount = currAmount;
		this.description = description;
	}

	public IDResponse getId() {
		checkProvided();
		return id;
	}

	public ListResponse<ImageResponse> getImages() {
		checkProvided();
		return images;
	}

	public StringResponse getName() {
		checkProvided();
		return name;
	}

	public FloatResponse getGoalAmount() {
		checkProvided();
		return goalAmount;
	}

	public FloatResponse getCurrAmount() {
		checkProvided();
		return currAmount;
	}

	public StringResponse getDescription() {
		checkProvided();
		return description;
	}
}
