package com.github.gpluscb.ggjava.entity.object.response.objects;

import com.github.gpluscb.ggjava.entity.EntityType;
import com.github.gpluscb.ggjava.entity.object.response.AbstractGGResponseObject;
import com.github.gpluscb.ggjava.entity.object.response.scalars.IDResponse;
import com.github.gpluscb.ggjava.entity.object.response.scalars.IntResponse;
import com.github.gpluscb.ggjava.entity.object.response.scalars.JSONResponse;
import com.github.gpluscb.ggjava.entity.object.response.scalars.StringResponse;

/**
 * A standing indicates the placement of something within a container.
 */
public class StandingResponse extends AbstractGGResponseObject {
	private final IDResponse id;
	private final IntResponse placement;
	private final EntrantResponse entrant;
	private final PlayerResponse player;
	private final JSONResponse metadata;
	private final StandingStatsResponse stats;
	private final IntResponse standing;
	private final IntResponse entityId;
	private final StringResponse entityType;

	public StandingResponse() {
		super(EntityType.STANDING);

		id = null;
		placement = null;
		entrant = null;
		player = null;
		metadata = null;
		stats = null;
		standing = null;
		entityId = null;
		entityType = null;
	}

	public StandingResponse(IDResponse id, IntResponse placement, EntrantResponse entrant, PlayerResponse player, JSONResponse metadata, StandingStatsResponse stats, IntResponse standing, IntResponse entityId, StringResponse entityType) {
		super(EntityType.STANDING, true);
		this.id = id;
		this.placement = placement;
		this.entrant = entrant;
		this.player = player;
		this.metadata = metadata;
		this.stats = stats;
		this.standing = standing;
		this.entityId = entityId;
		this.entityType = entityType;
	}

	public IDResponse getId() {
		checkProvided();
		return id;
	}

	public IntResponse getPlacement() {
		checkProvided();
		return placement;
	}

	/**
	 * If the entity this standing is assigned to can be resolved into an entrant, this will provide the entrant.
	 */
	public EntrantResponse getEntrant() {
		checkProvided();
		return entrant;
	}

	/**
	 * The player(s) tied to this standing's entity
	 */
	public PlayerResponse getPlayer() {
		checkProvided();
		return player;
	}

	/**
	 * Metadata that goes along with this standing. Can take on different forms based on standing group type and settings.
	 */
	public JSONResponse getMetadata() {
		checkProvided();
		return metadata;
	}

	public StandingStatsResponse getStats() {
		checkProvided();
		return stats;
	}

	@Deprecated
	public IntResponse getStanding() {
		checkProvided();
		return standing;
	}

	public IntResponse getEntityId() {
		checkProvided();
		return entityId;
	}

	public StringResponse getEntityType() {
		checkProvided();
		return entityType;
	}
}
