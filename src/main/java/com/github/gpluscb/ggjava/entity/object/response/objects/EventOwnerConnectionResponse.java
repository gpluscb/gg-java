package com.github.gpluscb.ggjava.entity.object.response.objects;

import com.github.gpluscb.ggjava.entity.EntityType;
import com.github.gpluscb.ggjava.entity.object.response.AbstractGGResponseObject;
import com.github.gpluscb.ggjava.entity.object.response.ListResponse;

public class EventOwnerConnectionResponse extends AbstractGGResponseObject {
	private final PageInfoResponse pageInfo;
	private final ListResponse<EventOwnerResponse> nodes;

	public EventOwnerConnectionResponse() {
		super(EntityType.EVENT_OWNER_CONNECTION);

		pageInfo = null;
		nodes = null;
	}

	public EventOwnerConnectionResponse(PageInfoResponse pageInfo, ListResponse<EventOwnerResponse> nodes) {
		super(EntityType.EVENT_OWNER_CONNECTION, true);
		this.pageInfo = pageInfo;
		this.nodes = nodes;
	}

	public PageInfoResponse getPageInfo() {
		checkProvided();
		return pageInfo;
	}

	public ListResponse<EventOwnerResponse> getNodes() {
		checkProvided();
		return nodes;
	}
}
