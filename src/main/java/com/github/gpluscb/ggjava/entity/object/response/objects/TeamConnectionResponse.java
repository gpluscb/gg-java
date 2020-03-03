package com.github.gpluscb.ggjava.entity.object.response.objects;

import com.github.gpluscb.ggjava.entity.EntityType;
import com.github.gpluscb.ggjava.entity.object.response.AbstractGGResponseObject;
import com.github.gpluscb.ggjava.entity.object.response.ListResponse;

public class TeamConnectionResponse extends AbstractGGResponseObject {
	private final PageInfoResponse pageInfo;
	private final ListResponse<TeamResponse> nodes;

	public TeamConnectionResponse() {
		super(EntityType.TEAM_CONNECTION);

		pageInfo = null;
		nodes = null;
	}

	public TeamConnectionResponse(PageInfoResponse pageInfo, ListResponse<TeamResponse> nodes) {
		super(EntityType.TEAM_CONNECTION, true);
		this.pageInfo = pageInfo;
		this.nodes = nodes;
	}

	public PageInfoResponse getPageInfo() {
		checkProvided();
		return pageInfo;
	}

	public ListResponse<TeamResponse> getNodes() {
		checkProvided();
		return nodes;
	}
}
