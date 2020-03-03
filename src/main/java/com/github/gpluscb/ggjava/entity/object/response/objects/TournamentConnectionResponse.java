package com.github.gpluscb.ggjava.entity.object.response.objects;

import com.github.gpluscb.ggjava.entity.EntityType;
import com.github.gpluscb.ggjava.entity.object.response.AbstractGGResponseObject;
import com.github.gpluscb.ggjava.entity.object.response.ListResponse;

public class TournamentConnectionResponse extends AbstractGGResponseObject {
	private final PageInfoResponse pageInfo;
	private final ListResponse<TournamentResponse> nodes;

	public TournamentConnectionResponse() {
		super(EntityType.TOURNAMENT_CONNECTION);

		pageInfo = null;
		nodes = null;
	}

	public TournamentConnectionResponse(PageInfoResponse pageInfo, ListResponse<TournamentResponse> nodes) {
		super(EntityType.TOURNAMENT_CONNECTION, true);
		this.pageInfo = pageInfo;
		this.nodes = nodes;
	}

	public PageInfoResponse getPageInfo() {
		checkProvided();
		return pageInfo;
	}

	public ListResponse<TournamentResponse> getNodes() {
		checkProvided();
		return nodes;
	}
}
