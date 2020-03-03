package com.github.gpluscb.ggjava.entity.object.response.objects;

import com.github.gpluscb.ggjava.entity.EntityType;
import com.github.gpluscb.ggjava.entity.object.response.AbstractGGResponseObject;
import com.github.gpluscb.ggjava.entity.object.response.ListResponse;

public class EntrantConnectionResponse extends AbstractGGResponseObject {
	private final PageInfoResponse pageInfo;
	private final ListResponse<EntrantResponse> nodes;

	public EntrantConnectionResponse() {
		super(EntityType.ENTRANT_CONNECTION);

		pageInfo = null;
		nodes = null;
	}

	public EntrantConnectionResponse(PageInfoResponse pageInfo, ListResponse<EntrantResponse> nodes) {
		super(EntityType.ENTRANT_CONNECTION, true);
		this.pageInfo = pageInfo;
		this.nodes = nodes;
	}

	public PageInfoResponse getPageInfo() {
		checkProvided();
		return pageInfo;
	}

	public ListResponse<EntrantResponse> getNodes() {
		checkProvided();
		return nodes;
	}
}
