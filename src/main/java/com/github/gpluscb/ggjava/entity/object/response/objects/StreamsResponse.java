package com.github.gpluscb.ggjava.entity.object.response.objects;

import com.github.gpluscb.ggjava.entity.EntityType;
import com.github.gpluscb.ggjava.entity.object.response.AbstractGGResponseObject;
import com.github.gpluscb.ggjava.entity.object.response.enums.StreamSourceResponse;
import com.github.gpluscb.ggjava.entity.object.response.scalars.BooleanResponse;
import com.github.gpluscb.ggjava.entity.object.response.scalars.IDResponse;
import com.github.gpluscb.ggjava.entity.object.response.scalars.IntResponse;
import com.github.gpluscb.ggjava.entity.object.response.scalars.StringResponse;

/**
 * Tournament Stream
 */
public class StreamsResponse extends AbstractGGResponseObject {
	private final IDResponse id;
	private final BooleanResponse enabled;
	private final IntResponse followerCount;
	private final BooleanResponse isOnline;
	private final IntResponse numSetups;
	private final IntResponse parentStreamId;
	private final StringResponse streamGame;
	private final StringResponse streamId;
	private final StringResponse streamLogo;
	private final StringResponse streamName;
	private final StreamSourceResponse streamSource;
	private final StringResponse streamStatus;
	private final IntResponse streamType;
	private final IntResponse streamTypeId;

	public StreamsResponse() {
		super(EntityType.STREAMS);

		id = null;
		enabled = null;
		followerCount = null;
		isOnline = null;
		numSetups = null;
		parentStreamId = null;
		streamGame = null;
		streamId = null;
		streamLogo = null;
		streamName = null;
		streamSource = null;
		streamStatus = null;
		streamType = null;
		streamTypeId = null;
	}

	public StreamsResponse(IDResponse id, BooleanResponse enabled, IntResponse followerCount, BooleanResponse isOnline, IntResponse numSetups, IntResponse parentStreamId, StringResponse streamGame, StringResponse streamId, StringResponse streamLogo, StringResponse streamName, StreamSourceResponse streamSource, StringResponse streamStatus, IntResponse streamType, IntResponse streamTypeId) {
		super(EntityType.STREAMS, true);
		this.id = id;
		this.enabled = enabled;
		this.followerCount = followerCount;
		this.isOnline = isOnline;
		this.numSetups = numSetups;
		this.parentStreamId = parentStreamId;
		this.streamGame = streamGame;
		this.streamId = streamId;
		this.streamLogo = streamLogo;
		this.streamName = streamName;
		this.streamSource = streamSource;
		this.streamStatus = streamStatus;
		this.streamType = streamType;
		this.streamTypeId = streamTypeId;
	}

	public IDResponse getId() {
		checkProvided();
		return id;
	}

	public BooleanResponse getEnabled() {
		checkProvided();
		return enabled;
	}

	public IntResponse getFollowerCount() {
		checkProvided();
		return followerCount;
	}

	public BooleanResponse getIsOnline() {
		checkProvided();
		return isOnline;
	}

	public IntResponse getNumSetups() {
		checkProvided();
		return numSetups;
	}

	public IntResponse getParentStreamId() {
		checkProvided();
		return parentStreamId;
	}

	public StringResponse getStreamGame() {
		checkProvided();
		return streamGame;
	}

	public StringResponse getStreamId() {
		checkProvided();
		return streamId;
	}

	public StringResponse getStreamLogo() {
		checkProvided();
		return streamLogo;
	}

	public StringResponse getStreamName() {
		checkProvided();
		return streamName;
	}

	public StreamSourceResponse getStreamSource() {
		checkProvided();
		return streamSource;
	}

	public StringResponse getStreamStatus() {
		checkProvided();
		return streamStatus;
	}

	public IntResponse getStreamType() {
		checkProvided();
		return streamType;
	}

	public IntResponse getStreamTypeId() {
		checkProvided();
		return streamTypeId;
	}
}
