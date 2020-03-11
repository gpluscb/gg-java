package com.github.gpluscb.ggjava.entity.object.response.objects;

import com.github.gpluscb.ggjava.entity.EntityType;
import com.github.gpluscb.ggjava.entity.object.response.AbstractGGResponseObject;
import com.github.gpluscb.ggjava.entity.object.response.ListResponse;

public class SetConnectionResponse extends AbstractGGResponseObject {
	private final PageInfoResponse pageInfo;
	private final ListResponse<SetResponse> nodes;

	public SetConnectionResponse() {
		super(EntityType.SET_CONNECTION);

		pageInfo = null;
		nodes = null;
	}

	public SetConnectionResponse(PageInfoResponse pageInfo, ListResponse<SetResponse> nodes) {
		super(EntityType.SET_CONNECTION, true);
		this.pageInfo = pageInfo;
		this.nodes = nodes;
	}

	public PageInfoResponse getPageInfo() {
		checkProvided();
		return pageInfo;
	}

	public ListResponse<SetResponse> getNodes() {
		checkProvided();
		return nodes;
	}
}
