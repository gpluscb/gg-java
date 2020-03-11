package com.github.gpluscb.ggjava.entity.object.response.objects;

import com.github.gpluscb.ggjava.entity.EntityType;
import com.github.gpluscb.ggjava.entity.object.response.AbstractGGResponseObject;
import com.github.gpluscb.ggjava.entity.object.response.ListResponse;

public class PhaseGroupConnectionResponse extends AbstractGGResponseObject {
	private final PageInfoResponse pageInfo;
	private final ListResponse<PhaseGroupResponse> nodes;

	public PhaseGroupConnectionResponse() {
		super(EntityType.PHASE_GROUP_CONNECTION);

		pageInfo = null;
		nodes = null;
	}

	public PhaseGroupConnectionResponse(PageInfoResponse pageInfo, ListResponse<PhaseGroupResponse> nodes) {
		super(EntityType.PHASE_GROUP_CONNECTION, true);
		this.pageInfo = pageInfo;
		this.nodes = nodes;
	}

	public PageInfoResponse getPageInfo() {
		checkProvided();
		return pageInfo;
	}

	public ListResponse<PhaseGroupResponse> getNodes() {
		checkProvided();
		return nodes;
	}
}
