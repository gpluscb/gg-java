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
	private final IntResponse eventId;
	private final IntResponse tournamentId;
	private final IntResponse numSetups;
	private final StreamSourceResponse streamSource;
	private final IntResponse streamType;
	private final IntResponse streamTypeId;
	private final StringResponse streamName;
	private final StringResponse streamId;
	private final IntResponse parentStreamId;
	private final BooleanResponse isOnline;
	private final BooleanResponse enabled;
	private final IntResponse followerCount;
	private final BooleanResponse removesTasks;
	private final StringResponse streamStatus;
	private final StringResponse streamGame;
	private final StringResponse streamLogo;

	public StreamsResponse() {
		super(EntityType.STREAMS);

		id = null;
		eventId = null;
		tournamentId = null;
		numSetups = null;
		streamSource = null;
		streamType = null;
		streamTypeId = null;
		streamName = null;
		streamId = null;
		parentStreamId = null;
		isOnline = null;
		enabled = null;
		followerCount = null;
		removesTasks = null;
		streamStatus = null;
		streamGame = null;
		streamLogo = null;
	}

	public StreamsResponse(IDResponse id, IntResponse eventId, IntResponse tournamentId, IntResponse numSetups, StreamSourceResponse streamSource, IntResponse streamType, IntResponse streamTypeId, StringResponse streamName, StringResponse streamId, IntResponse parentStreamId, BooleanResponse isOnline, BooleanResponse enabled, IntResponse followerCount, BooleanResponse removesTasks, StringResponse streamStatus, StringResponse streamGame, StringResponse streamLogo) {
		super(EntityType.STREAMS, true);
		this.id = id;
		this.eventId = eventId;
		this.tournamentId = tournamentId;
		this.numSetups = numSetups;
		this.streamSource = streamSource;
		this.streamType = streamType;
		this.streamTypeId = streamTypeId;
		this.streamName = streamName;
		this.streamId = streamId;
		this.parentStreamId = parentStreamId;
		this.isOnline = isOnline;
		this.enabled = enabled;
		this.followerCount = followerCount;
		this.removesTasks = removesTasks;
		this.streamStatus = streamStatus;
		this.streamGame = streamGame;
		this.streamLogo = streamLogo;
	}

	public IDResponse getId() {
		checkProvided();
		return id;
	}

	public IntResponse getEventId() {
		checkProvided();
		return eventId;
	}

	public IntResponse getTournamentId() {
		checkProvided();
		return tournamentId;
	}

	public IntResponse getNumSetups() {
		checkProvided();
		return numSetups;
	}

	public StreamSourceResponse getStreamSource() {
		checkProvided();
		return streamSource;
	}

	public IntResponse getStreamType() {
		checkProvided();
		return streamType;
	}

	public IntResponse getStreamTypeId() {
		checkProvided();
		return streamTypeId;
	}

	public StringResponse getStreamName() {
		checkProvided();
		return streamName;
	}

	public StringResponse getStreamId() {
		checkProvided();
		return streamId;
	}

	public IntResponse getParentStreamId() {
		checkProvided();
		return parentStreamId;
	}

	public BooleanResponse getIsOnline() {
		checkProvided();
		return isOnline;
	}

	public BooleanResponse getEnabled() {
		checkProvided();
		return enabled;
	}

	public IntResponse getFollowerCount() {
		checkProvided();
		return followerCount;
	}

	public BooleanResponse getRemovesTasks() {
		checkProvided();
		return removesTasks;
	}

	public StringResponse getStreamStatus() {
		checkProvided();
		return streamStatus;
	}

	public StringResponse getStreamGame() {
		checkProvided();
		return streamGame;
	}

	public StringResponse getStreamLogo() {
		checkProvided();
		return streamLogo;
	}
}
