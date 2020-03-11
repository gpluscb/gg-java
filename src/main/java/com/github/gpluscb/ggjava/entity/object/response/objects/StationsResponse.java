package com.github.gpluscb.ggjava.entity.object.response.objects;

import com.github.gpluscb.ggjava.entity.EntityType;
import com.github.gpluscb.ggjava.entity.object.response.AbstractGGResponseObject;
import com.github.gpluscb.ggjava.entity.object.response.scalars.*;

/**
 * Stations, such as a stream setup, at an event
 */
public class StationsResponse extends AbstractGGResponseObject {
	private final IDResponse id;
	private final BooleanResponse canAutoAssign;
	private final StringResponse clusterNumber;
	private final IntResponse clusterPrefix;
	private final BooleanResponse enabled;
	private final IntResponse identifier;
	private final IntResponse numSetups;
	private final IntResponse number;
	private final StringResponse prefix;
	private final JSONResponse queue;
	private final IntResponse queueDepth;
	private final IntResponse state;
	private final TimestampResponse updatedAt;

	public StationsResponse() {
		super(EntityType.STATIONS);

		id = null;
		canAutoAssign = null;
		clusterNumber = null;
		clusterPrefix = null;
		enabled = null;
		identifier = null;
		numSetups = null;
		number = null;
		prefix = null;
		queue = null;
		queueDepth = null;
		state = null;
		updatedAt = null;
	}

	public StationsResponse(IDResponse id, BooleanResponse canAutoAssign, StringResponse clusterNumber, IntResponse clusterPrefix, BooleanResponse enabled, IntResponse identifier, IntResponse numSetups, IntResponse number, StringResponse prefix, JSONResponse queue, IntResponse queueDepth, IntResponse state, TimestampResponse updatedAt) {
		super(EntityType.STATIONS, true);
		this.id = id;
		this.canAutoAssign = canAutoAssign;
		this.clusterNumber = clusterNumber;
		this.clusterPrefix = clusterPrefix;
		this.enabled = enabled;
		this.identifier = identifier;
		this.numSetups = numSetups;
		this.number = number;
		this.prefix = prefix;
		this.queue = queue;
		this.queueDepth = queueDepth;
		this.state = state;
		this.updatedAt = updatedAt;
	}

	public IDResponse getId() {
		checkProvided();
		return id;
	}

	public BooleanResponse getCanAutoAssign() {
		checkProvided();
		return canAutoAssign;
	}

	public StringResponse getClusterNumber() {
		checkProvided();
		return clusterNumber;
	}

	public IntResponse getClusterPrefix() {
		checkProvided();
		return clusterPrefix;
	}

	public BooleanResponse getEnabled() {
		checkProvided();
		return enabled;
	}

	public IntResponse getIdentifier() {
		checkProvided();
		return identifier;
	}

	public IntResponse getNumSetups() {
		checkProvided();
		return numSetups;
	}

	public IntResponse getNumber() {
		checkProvided();
		return number;
	}

	public StringResponse getPrefix() {
		checkProvided();
		return prefix;
	}

	public JSONResponse getQueue() {
		checkProvided();
		return queue;
	}

	public IntResponse getQueueDepth() {
		checkProvided();
		return queueDepth;
	}

	public IntResponse getState() {
		checkProvided();
		return state;
	}

	public TimestampResponse getUpdatedAt() {
		checkProvided();
		return updatedAt;
	}
}
