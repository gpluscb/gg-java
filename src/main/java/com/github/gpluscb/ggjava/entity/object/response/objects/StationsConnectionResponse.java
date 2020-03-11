package com.github.gpluscb.ggjava.entity.object.response.objects;

import com.github.gpluscb.ggjava.entity.EntityType;
import com.github.gpluscb.ggjava.entity.object.response.AbstractGGResponseObject;
import com.github.gpluscb.ggjava.entity.object.response.ListResponse;

public class StationsConnectionResponse extends AbstractGGResponseObject {
	private final PageInfoResponse pageInfo;
	private final ListResponse<StationsResponse> nodes;

	public StationsConnectionResponse() {
		super(EntityType.STATIONS_CONNECTION);

		pageInfo = null;
		nodes = null;
	}

	public StationsConnectionResponse(PageInfoResponse pageInfo, ListResponse<StationsResponse> nodes) {
		super(EntityType.STATIONS_CONNECTION, true);
		this.pageInfo = pageInfo;
		this.nodes = nodes;
	}

	public PageInfoResponse getPageInfo() {
		checkProvided();
		return pageInfo;
	}

	public ListResponse<StationsResponse> getNodes() {
		checkProvided();
		return nodes;
	}
}
