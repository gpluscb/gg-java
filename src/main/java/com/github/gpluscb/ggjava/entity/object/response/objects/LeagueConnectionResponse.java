package com.github.gpluscb.ggjava.entity.object.response.objects;

import com.github.gpluscb.ggjava.entity.EntityType;
import com.github.gpluscb.ggjava.entity.object.response.AbstractGGResponseObject;
import com.github.gpluscb.ggjava.entity.object.response.ListResponse;

public class LeagueConnectionResponse extends AbstractGGResponseObject {
	private final PageInfoResponse pageInfo;
	private final ListResponse<LeagueResponse> nodes;

	public LeagueConnectionResponse() {
		super(EntityType.LEAGUE_CONNECTION);

		pageInfo = null;
		nodes = null;
	}

	public LeagueConnectionResponse(PageInfoResponse pageInfo, ListResponse<LeagueResponse> nodes) {
		super(EntityType.LEAGUE_CONNECTION, true);
		this.pageInfo = pageInfo;
		this.nodes = nodes;
	}

	public PageInfoResponse getPageInfo() {
		checkProvided();
		return pageInfo;
	}

	public ListResponse<LeagueResponse> getNodes() {
		checkProvided();
		return nodes;
	}
}
