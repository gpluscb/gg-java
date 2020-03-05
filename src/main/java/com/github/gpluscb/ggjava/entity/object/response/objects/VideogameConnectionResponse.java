package com.github.gpluscb.ggjava.entity.object.response.objects;

import com.github.gpluscb.ggjava.entity.EntityType;
import com.github.gpluscb.ggjava.entity.object.response.AbstractGGResponseObject;
import com.github.gpluscb.ggjava.entity.object.response.ListResponse;

public class VideogameConnectionResponse extends AbstractGGResponseObject {
	private final PageInfoResponse pageInfo;
	private final ListResponse<VideogameResponse> nodes;

	public VideogameConnectionResponse() {
		super(EntityType.VIDEOGAME_CONNECTION);

		pageInfo = null;
		nodes = null;
	}

	public VideogameConnectionResponse(PageInfoResponse pageInfo, ListResponse<VideogameResponse> nodes) {
		super(EntityType.VIDEOGAME_CONNECTION, true);
		this.pageInfo = pageInfo;
		this.nodes = nodes;
	}

	public PageInfoResponse getPageInfo() {
		checkProvided();
		return pageInfo;
	}

	public ListResponse<VideogameResponse> getNodes() {
		checkProvided();
		return nodes;
	}
}
