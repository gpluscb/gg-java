package com.github.gpluscb.ggjava.entity.object.response.objects;

import com.github.gpluscb.ggjava.entity.EntityType;
import com.github.gpluscb.ggjava.entity.object.response.AbstractGGResponseObject;
import com.github.gpluscb.ggjava.entity.object.response.ListResponse;

public class ShopLevelConnectionResponse extends AbstractGGResponseObject {
	private final PageInfoResponse pageInfo;
	private final ListResponse<ShopLevelResponse> nodes;

	public ShopLevelConnectionResponse() {
		super(EntityType.SHOP_LEVEL_CONNECTION);

		pageInfo = null;
		nodes = null;
	}

	public ShopLevelConnectionResponse(PageInfoResponse pageInfo, ListResponse<ShopLevelResponse> nodes) {
		super(EntityType.SHOP_LEVEL_CONNECTION, true);
		this.pageInfo = pageInfo;
		this.nodes = nodes;
	}

	public PageInfoResponse getPageInfo() {
		checkProvided();
		return pageInfo;
	}

	public ListResponse<ShopLevelResponse> getNodes() {
		checkProvided();
		return nodes;
	}
}
