package com.github.gpluscb.ggjava.entity.object.response.objects;

import com.github.gpluscb.ggjava.entity.EntityType;
import com.github.gpluscb.ggjava.entity.object.response.AbstractGGResponseObject;
import com.github.gpluscb.ggjava.entity.object.response.ListResponse;
import com.github.gpluscb.ggjava.entity.object.response.scalars.*;

/**
 * A participant of a tournament; either a spectator or competitor
 */
public class ParticipantResponse extends AbstractGGResponseObject {
	private final IDResponse id;
	private final BooleanResponse checkedIn;
	private final TimestampResponse checkedInAt;
	private final JSONResponse connectedAccounts;
	private final ContactInfoResponse contactInfo;
	private final StringResponse email;
	private final ListResponse<EntrantResponse> entrants;
	private final ListResponse<EventResponse> events;
	private final StringResponse gamerTag;
	private final ListResponse<ImageResponse> images;
	private final PlayerResponse player;
	private final StringResponse prefix;
	private final UserResponse user;
	private final BooleanResponse verified;

	public ParticipantResponse() {
		super(EntityType.PARTICIPANT);

		id = null;
		checkedIn = null;
		checkedInAt = null;
		connectedAccounts = null;
		contactInfo = null;
		email = null;
		entrants = null;
		events = null;
		gamerTag = null;
		images = null;
		player = null;
		prefix = null;
		user = null;
		verified = null;
	}

	public ParticipantResponse(IDResponse id, BooleanResponse checkedIn, TimestampResponse checkedInAt, JSONResponse connectedAccounts, ContactInfoResponse contactInfo, StringResponse email, ListResponse<EntrantResponse> entrants, ListResponse<EventResponse> events, StringResponse gamerTag, ListResponse<ImageResponse> images, PlayerResponse player, StringResponse prefix, UserResponse user, BooleanResponse verified) {
		super(EntityType.PARTICIPANT, true);
		this.id = id;
		this.checkedIn = checkedIn;
		this.checkedInAt = checkedInAt;
		this.connectedAccounts = connectedAccounts;
		this.contactInfo = contactInfo;
		this.email = email;
		this.entrants = entrants;
		this.events = events;
		this.gamerTag = gamerTag;
		this.images = images;
		this.player = player;
		this.prefix = prefix;
		this.user = user;
		this.verified = verified;
	}

	public IDResponse getId() {
		checkProvided();
		return id;
	}

	/**
	 * If this participant was checked-in by admin
	 */
	public BooleanResponse getCheckedIn() {
		checkProvided();
		return checkedIn;
	}

	/**
	 * The time this participant was checked-in by admin
	 */
	public TimestampResponse getCheckedInAt() {
		checkProvided();
		return checkedInAt;
	}

	/**
	 * Info for connected accounts to external services.
	 */
	public JSONResponse getConnectedAccounts() {
		checkProvided();
		return connectedAccounts;
	}

	/**
	 * Contact Info selected during registration. Falls back to User.location and/or
	 * User.name if necessary. These fields are for admin use only and do not respect
	 * user privacy settings. DO NOT display this information publicly.
	 */
	public ContactInfoResponse getContactInfo() {
		checkProvided();
		return contactInfo;
	}

	/**
	 * Email of the user, only available to admins within 18 months of tournament
	 */
	public StringResponse getEmail() {
		checkProvided();
		return email;
	}

	public ListResponse<EntrantResponse> getEntrants() {
		checkProvided();
		return entrants;
	}

	/**
	 * The events this participant registered for.
	 */
	public ListResponse<EventResponse> getEvents() {
		checkProvided();
		return events;
	}

	/**
	 * The tag that was used in registration e.g. Mang0
	 */
	public StringResponse getGamerTag() {
		checkProvided();
		return gamerTag;
	}

	public ListResponse<ImageResponse> getImages() {
		checkProvided();
		return images;
	}

	public PlayerResponse getPlayer() {
		checkProvided();
		return player;
	}

	/**
	 * The prefix that was used in registration e.g. C9
	 */
	public StringResponse getPrefix() {
		checkProvided();
		return prefix;
	}

	/**
	 * The user this participant is associated to.
	 */
	public UserResponse getUser() {
		checkProvided();
		return user;
	}

	/**
	 * If this participant is verified as actually being in the tournament
	 */
	public BooleanResponse getVerified() {
		checkProvided();
		return verified;
	}
}
