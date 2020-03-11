package com.github.gpluscb.ggjava.entity.object.response.objects;

import com.github.gpluscb.ggjava.entity.EntityType;
import com.github.gpluscb.ggjava.entity.object.response.AbstractGGResponseObject;
import com.github.gpluscb.ggjava.entity.object.response.ListResponse;

public class StandingConnectionResponse extends AbstractGGResponseObject {
	private final PageInfoResponse pageInfo;
	private final ListResponse<StandingResponse> nodes;

	public StandingConnectionResponse() {
		super(EntityType.STANDING_CONNECTION);

		pageInfo = null;
		nodes = null;
	}

	public StandingConnectionResponse(PageInfoResponse pageInfo, ListResponse<StandingResponse> nodes) {
		super(EntityType.STANDING_CONNECTION, true);
		this.pageInfo = pageInfo;
		this.nodes = nodes;
	}

	public PageInfoResponse getPageInfo() {
		checkProvided();
		return pageInfo;
	}

	public ListResponse<StandingResponse> getNodes() {
		checkProvided();
		return nodes;
	}
}
