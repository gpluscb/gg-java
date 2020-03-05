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
	private final ListResponse<ImageResponse> images;
	private final JSONResponse connectedAccounts;
	private final ContactInfoResponse contactInfo;
	private final StringResponse email;
	private final ListResponse<EntrantResponse> entrants;
	private final ListResponse<EventResponse> events;
	private final PlayerResponse player;
	private final BooleanResponse checkedIn;
	private final TimestampResponse checkedInAt;
	private final BooleanResponse claimed;
	private final TimestampResponse createdAt;
	private final StringResponse gamerTag;
	private final IntResponse playerId;
	private final StringResponse phoneNumber;
	private final StringResponse prefix;
	private final BooleanResponse verified;
	private final IntResponse userId;

	public ParticipantResponse() {
		super(EntityType.PARTICIPANT);

		id = null;
		images = null;
		connectedAccounts = null;
		contactInfo = null;
		email = null;
		entrants = null;
		events = null;
		player = null;
		checkedIn = null;
		checkedInAt = null;
		claimed = null;
		createdAt = null;
		gamerTag = null;
		playerId = null;
		phoneNumber = null;
		prefix = null;
		verified = null;
		userId = null;
	}

	public ParticipantResponse(IDResponse id, ListResponse<ImageResponse> images, JSONResponse connectedAccounts, ContactInfoResponse contactInfo, StringResponse email, ListResponse<EntrantResponse> entrants, ListResponse<EventResponse> events, PlayerResponse player, BooleanResponse checkedIn, TimestampResponse checkedInAt, BooleanResponse claimed, TimestampResponse createdAt, StringResponse gamerTag, IntResponse playerId, StringResponse phoneNumber, StringResponse prefix, BooleanResponse verified, IntResponse userId) {
		super(EntityType.PARTICIPANT, true);
		this.id = id;
		this.images = images;
		this.connectedAccounts = connectedAccounts;
		this.contactInfo = contactInfo;
		this.email = email;
		this.entrants = entrants;
		this.events = events;
		this.player = player;
		this.checkedIn = checkedIn;
		this.checkedInAt = checkedInAt;
		this.claimed = claimed;
		this.createdAt = createdAt;
		this.gamerTag = gamerTag;
		this.playerId = playerId;
		this.phoneNumber = phoneNumber;
		this.prefix = prefix;
		this.verified = verified;
		this.userId = userId;
	}

	public IDResponse getId() {
		checkProvided();
		return id;
	}

	public ListResponse<ImageResponse> getImages() {
		checkProvided();
		return images;
	}

	/**
	 * Info for connected accounts to external services.
	 */
	public JSONResponse getConnectedAccounts() {
		checkProvided();
		return connectedAccounts;
	}

	/**
	 * Contact Info selected during registration. Falls back to contact info on Player if necessary.
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

	public PlayerResponse getPlayer() {
		checkProvided();
		return player;
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
	 * If this participant is claimed or not
	 */
	public BooleanResponse getClaimed() {
		checkProvided();
		return claimed;
	}

	/**
	 * Unix time when participant was made
	 */
	public TimestampResponse getCreatedAt() {
		checkProvided();
		return createdAt;
	}

	/**
	 * The tag that was used in registration e.g. Mang0
	 */
	public StringResponse getGamerTag() {
		checkProvided();
		return gamerTag;
	}

	/**
	 * Id of the player
	 */
	public IntResponse getPlayerId() {
		checkProvided();
		return playerId;
	}

	/**
	 * Phone number of participant
	 */
	public StringResponse getPhoneNumber() {
		checkProvided();
		return phoneNumber;
	}

	/**
	 * The prefix that was used in registration e.g. C9
	 */
	public StringResponse getPrefix() {
		checkProvided();
		return prefix;
	}

	/**
	 * If this participant is verified as actually being in the tournament
	 */
	public BooleanResponse getVerified() {
		checkProvided();
		return verified;
	}

	/**
	 * Id of user associated with this participant
	 */
	public IntResponse getUserId() {
		checkProvided();
		return userId;
	}
}
