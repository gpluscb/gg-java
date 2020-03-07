package com.github.gpluscb.ggjava.entity.object.response.objects;

import com.github.gpluscb.ggjava.entity.EntityType;
import com.github.gpluscb.ggjava.entity.object.response.AbstractGGResponseObject;
import com.github.gpluscb.ggjava.entity.object.response.scalars.IDResponse;
import com.github.gpluscb.ggjava.entity.object.response.scalars.IntResponse;
import com.github.gpluscb.ggjava.entity.object.response.scalars.JSONResponse;

/**
 * A standing indicates the placement of something within a container.
 */
public class StandingResponse extends AbstractGGResponseObject {
	private final IDResponse id;
	private final EntrantResponse entrant;
	private final JSONResponse metadata;
	private final IntResponse placement;
	private final PlayerResponse player;
	private final IntResponse standing;
	private final StandingStatsResponse stats;

	public StandingResponse() {
		super(EntityType.STANDING);

		id = null;
		entrant = null;
		metadata = null;
		placement = null;
		player = null;
		standing = null;
		stats = null;
	}

	public StandingResponse(IDResponse id, EntrantResponse entrant, JSONResponse metadata, IntResponse placement, PlayerResponse player, IntResponse standing, StandingStatsResponse stats) {
		super(EntityType.STANDING, true);
		this.id = id;
		this.entrant = entrant;
		this.metadata = metadata;
		this.placement = placement;
		this.player = player;
		this.standing = standing;
		this.stats = stats;
	}

	public IDResponse getId() {
		checkProvided();
		return id;
	}

	/**
	 * If the entity this standing is assigned to can be resolved into an entrant, this will provide the entrant.
	 */
	public EntrantResponse getEntrant() {
		checkProvided();
		return entrant;
	}

	/**
	 * Metadata that goes along with this standing. Can take on different forms based on standing group type and settings.
	 */
	public JSONResponse getMetadata() {
		checkProvided();
		return metadata;
	}

	public IntResponse getPlacement() {
		checkProvided();
		return placement;
	}

	/**
	 * The player(s) tied to this standing's entity
	 */
	public PlayerResponse getPlayer() {
		checkProvided();
		return player;
	}

	/**
	 * @deprecated The "placement" field is identical and will eventually replace "standing"
	 */
	@Deprecated
	public IntResponse getStanding() {
		checkProvided();
		return standing;
	}

	public StandingStatsResponse getStats() {
		checkProvided();
		return stats;
	}
}
