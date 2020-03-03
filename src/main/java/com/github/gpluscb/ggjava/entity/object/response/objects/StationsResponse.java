package com.github.gpluscb.ggjava.entity.object.response.objects;

import com.github.gpluscb.ggjava.entity.EntityType;
import com.github.gpluscb.ggjava.entity.object.response.AbstractGGResponseObject;
import com.github.gpluscb.ggjava.entity.object.response.scalars.*;

/**
 * Stations, such as a stream setup, at an event
 */
public class StationsResponse extends AbstractGGResponseObject {
	private final IDResponse id;
	private final IntResponse eventId;
	private final IntResponse tournamentId;
	private final IntResponse numSetups;
	private final IntResponse streamSource;
	private final IntResponse streamType;
	private final IntResponse streamTypeId;
	private final StringResponse streamName;
	private final BooleanResponse isOnline;
	private final BooleanResponse enabled;
	private final IntResponse followerCount;
	private final IntResponse identifier;
	private final IntResponse streamId;
	private final JSONResponse queue;
	private final StringResponse streamStatus;
	private final StringResponse streamGame;
	private final StringResponse streamLogo;
	private final IntResponse state;
	private final IntResponse queueDepth;
	private final BooleanResponse canAutoAssign;
	private final StringResponse prefix;
	private final IntResponse number;
	private final StringResponse clusterNumber;
	private final IntResponse clusterPrefix;
	private final IntResponse clusterId;
	private final TimestampResponse createdAt;
	private final TimestampResponse updatedAt;

	public StationsResponse() {
		super(EntityType.STATIONS);

		id = null;
		eventId = null;
		tournamentId = null;
		numSetups = null;
		streamSource = null;
		streamType = null;
		streamTypeId = null;
		streamName = null;
		isOnline = null;
		enabled = null;
		followerCount = null;
		identifier = null;
		streamId = null;
		queue = null;
		streamStatus = null;
		streamGame = null;
		streamLogo = null;
		state = null;
		queueDepth = null;
		canAutoAssign = null;
		prefix = null;
		number = null;
		clusterNumber = null;
		clusterPrefix = null;
		clusterId = null;
		createdAt = null;
		updatedAt = null;
	}

	public StationsResponse(IDResponse id, IntResponse eventId, IntResponse tournamentId, IntResponse numSetups, IntResponse streamSource, IntResponse streamType, IntResponse streamTypeId, StringResponse streamName, BooleanResponse isOnline, BooleanResponse enabled, IntResponse followerCount, IntResponse identifier, IntResponse streamId, JSONResponse queue, StringResponse streamStatus, StringResponse streamGame, StringResponse streamLogo, IntResponse state, IntResponse queueDepth, BooleanResponse canAutoAssign, StringResponse prefix, IntResponse number, StringResponse clusterNumber, IntResponse clusterPrefix, IntResponse clusterId, TimestampResponse createdAt, TimestampResponse updatedAt) {
		super(EntityType.STATIONS, true);
		this.id = id;
		this.eventId = eventId;
		this.tournamentId = tournamentId;
		this.numSetups = numSetups;
		this.streamSource = streamSource;
		this.streamType = streamType;
		this.streamTypeId = streamTypeId;
		this.streamName = streamName;
		this.isOnline = isOnline;
		this.enabled = enabled;
		this.followerCount = followerCount;
		this.identifier = identifier;
		this.streamId = streamId;
		this.queue = queue;
		this.streamStatus = streamStatus;
		this.streamGame = streamGame;
		this.streamLogo = streamLogo;
		this.state = state;
		this.queueDepth = queueDepth;
		this.canAutoAssign = canAutoAssign;
		this.prefix = prefix;
		this.number = number;
		this.clusterNumber = clusterNumber;
		this.clusterPrefix = clusterPrefix;
		this.clusterId = clusterId;
		this.createdAt = createdAt;
		this.updatedAt = updatedAt;
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

	public IntResponse getStreamSource() {
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

	public IntResponse getIdentifier() {
		checkProvided();
		return identifier;
	}

	public IntResponse getStreamId() {
		checkProvided();
		return streamId;
	}

	public JSONResponse getQueue() {
		checkProvided();
		return queue;
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

	public IntResponse getState() {
		checkProvided();
		return state;
	}

	public IntResponse getQueueDepth() {
		checkProvided();
		return queueDepth;
	}

	public BooleanResponse getCanAutoAssign() {
		checkProvided();
		return canAutoAssign;
	}

	public StringResponse getPrefix() {
		checkProvided();
		return prefix;
	}

	public IntResponse getNumber() {
		checkProvided();
		return number;
	}

	public StringResponse getClusterNumber() {
		checkProvided();
		return clusterNumber;
	}

	public IntResponse getClusterPrefix() {
		checkProvided();
		return clusterPrefix;
	}

	public IntResponse getClusterId() {
		checkProvided();
		return clusterId;
	}

	public TimestampResponse getCreatedAt() {
		checkProvided();
		return createdAt;
	}

	public TimestampResponse getUpdatedAt() {
		checkProvided();
		return updatedAt;
	}
}
