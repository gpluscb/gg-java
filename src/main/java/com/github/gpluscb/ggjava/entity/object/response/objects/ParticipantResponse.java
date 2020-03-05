package com.github.gpluscb.ggjava.entity.object.response.objects;

import com.github.gpluscb.ggjava.entity.EntityType;
import com.github.gpluscb.ggjava.entity.object.response.AbstractGGResponseObject;
import com.github.gpluscb.ggjava.entity.object.response.ListResponse;
import com.github.gpluscb.ggjava.entity.object.response.scalars.BooleanResponse;
import com.github.gpluscb.ggjava.entity.object.response.scalars.IDResponse;
import com.github.gpluscb.ggjava.entity.object.response.scalars.JSONResponse;
import com.github.gpluscb.ggjava.entity.object.response.scalars.StringResponse;

/**
 * A participant of a tournament; either a spectator or competitor
 */
public class ParticipantResponse extends AbstractGGResponseObject {
	private final IDResponse id;
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

	public ParticipantResponse(IDResponse id, JSONResponse connectedAccounts, ContactInfoResponse contactInfo, StringResponse email, ListResponse<EntrantResponse> entrants, ListResponse<EventResponse> events, StringResponse gamerTag, ListResponse<ImageResponse> images, PlayerResponse player, StringResponse prefix, UserResponse user, BooleanResponse verified) {
		super(EntityType.PARTICIPANT, true);
		this.id = id;
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
	 * Info for connected accounts to external services.
	 */
	public JSONResponse getConnectedAccounts() {
		checkProvided();
		return connectedAccounts;
	}

	/**
	 * Contact Info selected during registration. Falls back to contact info on Player if necessary.
	 *
	 * @deprecated Use User.location
	 */
	@Deprecated
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
