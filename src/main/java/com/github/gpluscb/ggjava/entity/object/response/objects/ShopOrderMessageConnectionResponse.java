package com.github.gpluscb.ggjava.entity.object.response.objects;

import com.github.gpluscb.ggjava.entity.EntityType;
import com.github.gpluscb.ggjava.entity.object.response.AbstractGGResponseObject;
import com.github.gpluscb.ggjava.entity.object.response.ListResponse;

public class ShopOrderMessageConnectionResponse extends AbstractGGResponseObject {
	private final PageInfoResponse pageInfo;
	private final ListResponse<ShopOrderMessageResponse> nodes;

	public ShopOrderMessageConnectionResponse() {
		super(EntityType.SHOP_ORDER_MESSAGE_CONNECTION);

		pageInfo = null;
		nodes = null;
	}

	public ShopOrderMessageConnectionResponse(PageInfoResponse pageInfo, ListResponse<ShopOrderMessageResponse> nodes) {
		super(EntityType.SHOP_ORDER_MESSAGE_CONNECTION, true);
		this.pageInfo = pageInfo;
		this.nodes = nodes;
	}

	public PageInfoResponse getPageInfo() {
		checkProvided();
		return pageInfo;
	}

	public ListResponse<ShopOrderMessageResponse> getNodes() {
		checkProvided();
		return nodes;
	}
}
