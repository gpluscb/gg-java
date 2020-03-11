package com.github.gpluscb.ggjava.entity.object.response.objects;

import com.github.gpluscb.ggjava.entity.EntityType;
import com.github.gpluscb.ggjava.entity.object.response.AbstractGGResponseObject;
import com.github.gpluscb.ggjava.entity.object.response.ListResponse;

public class EventConnectionResponse extends AbstractGGResponseObject {
	private final PageInfoResponse pageInfo;
	private final ListResponse<EventResponse> nodes;

	public EventConnectionResponse() {
		super(EntityType.EVENT_CONNECTION);

		pageInfo = null;
		nodes = null;
	}

	public EventConnectionResponse(PageInfoResponse pageInfo, ListResponse<EventResponse> nodes) {
		super(EntityType.EVENT_CONNECTION, true);
		this.pageInfo = pageInfo;
		this.nodes = nodes;
	}

	public PageInfoResponse getPageInfo() {
		checkProvided();
		return pageInfo;
	}

	public ListResponse<EventResponse> getNodes() {
		checkProvided();
		return nodes;
	}
}
