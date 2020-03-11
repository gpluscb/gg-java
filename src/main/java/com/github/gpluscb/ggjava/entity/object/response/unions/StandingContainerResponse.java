package com.github.gpluscb.ggjava.entity.object.response.unions;

import com.github.gpluscb.ggjava.entity.EntityType;
import com.github.gpluscb.ggjava.entity.object.response.GGResponseObject;
import com.github.gpluscb.ggjava.entity.object.response.objects.EventResponse;
import com.github.gpluscb.ggjava.entity.object.response.objects.PhaseGroupResponse;
import com.github.gpluscb.ggjava.entity.object.response.objects.SetResponse;
import com.github.gpluscb.ggjava.entity.object.response.objects.TournamentResponse;
import com.github.gpluscb.ggjava.internal.utils.Checks;

import javax.annotation.Nonnull;
import javax.annotation.Nullable;
import java.util.function.Consumer;

/**
 * The containing entity that this standing is for
 */
public class StandingContainerResponse extends UnionResponse {
	@Nullable
	private final TournamentResponse onTournament;
	@Nullable
	private final EventResponse onEvent;
	@Nullable
	private final PhaseGroupResponse onPhaseGroup;
	@Nullable
	private final SetResponse onSet;

	public StandingContainerResponse() {
		super(EntityType.STANDING_CONTAINER);

		onTournament = null;
		onEvent = null;
		onPhaseGroup = null;
		onSet = null;
	}

	public StandingContainerResponse(@Nonnull TournamentResponse onTournament) {
		super(EntityType.STANDING_CONTAINER, true);

		this.onTournament = onTournament;
		onEvent = null;
		onPhaseGroup = null;
		onSet = null;
	}

	public StandingContainerResponse(@Nonnull EventResponse onEvent) {
		super(EntityType.STANDING_CONTAINER, true);

		onTournament = null;
		this.onEvent = onEvent;
		onPhaseGroup = null;
		onSet = null;
	}

	public StandingContainerResponse(@Nonnull PhaseGroupResponse onPhaseGroup) {
		super(EntityType.STANDING_CONTAINER, true);

		onTournament = null;
		onEvent = null;
		this.onPhaseGroup = onPhaseGroup;
		onSet = null;
	}

	public StandingContainerResponse(@Nonnull SetResponse onSet) {
		super(EntityType.STANDING_CONTAINER, true);

		onTournament = null;
		onEvent = null;
		onPhaseGroup = null;
		this.onSet = onSet;
	}

	public static Class<? extends GGResponseObject> typeForTypename(@Nonnull String __typename) throws IllegalArgumentException {
		switch (__typename) {
			case "Tournament":
				return TournamentResponse.class;
			case "Event":
				return EventResponse.class;
			case "PhaseGroup":
				return PhaseGroupResponse.class;
			case "Set":
				return SetResponse.class;
			default:
				throw new IllegalArgumentException("Given __typename \"" + __typename + "\" is not supported for union StandingContainer");
		}
	}

	/**
	 * The consumer is executed only if this is a tournament
	 *
	 * @return itself for chaining
	 */
	@Nonnull
	public StandingContainerResponse onTournament(@Nonnull Consumer<TournamentResponse> consumer) {
		Checks.nonNull(consumer, "consumer");
		if (onTournament != null) consumer.accept(onTournament);
		return this;
	}

	/**
	 * The consumer is executed only if this is an event
	 *
	 * @return itself for chaining
	 */
	@Nonnull
	public StandingContainerResponse onEvent(@Nonnull Consumer<EventResponse> consumer) {
		Checks.nonNull(consumer, "consumer");
		if (onEvent != null) consumer.accept(onEvent);
		return this;
	}

	/**
	 * The consumer is executed if this is a phase group
	 *
	 * @return itself for chaining
	 */
	@Nonnull
	public StandingContainerResponse onPhaseGroup(@Nonnull Consumer<PhaseGroupResponse> consumer) {
		Checks.nonNull(consumer, "consumer");
		if (onPhaseGroup != null) consumer.accept(onPhaseGroup);
		return this;
	}

	/**
	 * The consumer is executed if this is a set
	 *
	 * @return itself for chaining
	 */
	@Nonnull
	public StandingContainerResponse onSet(@Nonnull Consumer<SetResponse> consumer) {
		Checks.nonNull(consumer, "consumer");
		if (onSet != null) consumer.accept(onSet);
		return this;
	}

	/**
	 * The tournament or null if this is not a tournament
	 */
	@Nullable
	public TournamentResponse getTournament() {
		return onTournament;
	}

	/**
	 * The event or null if this is not an event
	 */
	@Nullable
	public EventResponse getEvent() {
		return onEvent;
	}

	/**
	 * The phase group or null if this is not a phase group
	 */
	@Nullable
	public PhaseGroupResponse getPhaseGroup() {
		return onPhaseGroup;
	}

	/**
	 * The set or null if this is not a set
	 */
	@Nullable
	public SetResponse getSet() {
		return onSet;
	}
}
