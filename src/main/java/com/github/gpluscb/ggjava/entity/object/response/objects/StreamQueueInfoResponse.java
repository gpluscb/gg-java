package com.github.gpluscb.ggjava.entity.object.response.objects;

import com.github.gpluscb.ggjava.entity.EntityType;
import com.github.gpluscb.ggjava.entity.object.response.AbstractGGResponseObject;
import com.github.gpluscb.ggjava.entity.object.response.ListResponse;

public class StreamQueueInfoResponse extends AbstractGGResponseObject {
	private final StreamsResponse stream;
	private final ListResponse<SetResponse> sets;

	public StreamQueueInfoResponse() {
		super(EntityType.STREAM_QUEUE_INFO);

		stream = null;
		sets = null;
	}

	public StreamQueueInfoResponse(StreamsResponse stream, ListResponse<SetResponse> sets) {
		super(EntityType.STREAM_QUEUE_INFO, true);
		this.stream = stream;
		this.sets = sets;
	}

	public StreamsResponse getStream() {
		checkProvided();
		return stream;
	}

	public ListResponse<SetResponse> getSets() {
		checkProvided();
		return sets;
	}
}
