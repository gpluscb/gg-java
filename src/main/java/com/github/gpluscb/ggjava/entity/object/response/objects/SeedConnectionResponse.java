package com.github.gpluscb.ggjava.entity.object.response.objects;

import com.github.gpluscb.ggjava.entity.EntityType;
import com.github.gpluscb.ggjava.entity.object.response.AbstractGGResponseObject;
import com.github.gpluscb.ggjava.entity.object.response.ListResponse;

public class SeedConnectionResponse extends AbstractGGResponseObject {
	private final PageInfoResponse pageInfo;
	private final ListResponse<SeedResponse> nodes;

	public SeedConnectionResponse() {
		super(EntityType.SEED_CONNECTION);

		pageInfo = null;
		nodes = null;
	}

	public SeedConnectionResponse(PageInfoResponse pageInfo, ListResponse<SeedResponse> nodes) {
		super(EntityType.SEED_CONNECTION, true);
		this.pageInfo = pageInfo;
		this.nodes = nodes;
	}

	public PageInfoResponse getPageInfo() {
		checkProvided();
		return pageInfo;
	}

	public ListResponse<SeedResponse> getNodes() {
		checkProvided();
		return nodes;
	}
}
