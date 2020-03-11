package com.github.gpluscb.ggjava.entity.object.response.objects;

import com.github.gpluscb.ggjava.entity.EntityType;
import com.github.gpluscb.ggjava.entity.object.response.AbstractGGResponseObject;
import com.github.gpluscb.ggjava.entity.object.response.ListResponse;

public class ParticipantConnectionResponse extends AbstractGGResponseObject {
	private final PageInfoResponse pageInfo;
	private final ListResponse<ParticipantResponse> nodes;

	public ParticipantConnectionResponse() {
		super(EntityType.PARTICIPANT_CONNECTION);

		pageInfo = null;
		nodes = null;
	}

	public ParticipantConnectionResponse(PageInfoResponse pageInfo, ListResponse<ParticipantResponse> nodes) {
		super(EntityType.PARTICIPANT_CONNECTION, true);
		this.pageInfo = pageInfo;
		this.nodes = nodes;
	}

	public PageInfoResponse getPageInfo() {
		checkProvided();
		return pageInfo;
	}

	public ListResponse<ParticipantResponse> getNodes() {
		checkProvided();
		return nodes;
	}
}
