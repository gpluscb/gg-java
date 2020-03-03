package com.github.gpluscb.ggjava.entity.object.response.objects;

import com.github.gpluscb.ggjava.entity.EntityType;
import com.github.gpluscb.ggjava.entity.object.response.AbstractGGResponseObject;
import com.github.gpluscb.ggjava.entity.object.response.ListResponse;
import com.github.gpluscb.ggjava.entity.object.response.scalars.*;

/**
 * A league
 */
public class LeagueResponse extends AbstractGGResponseObject {
	private final IDResponse id;
	private final ListResponse<ImageResponse> images;
	private final StringResponse slug;
	private final IntResponse entrantCount;
	private final IntResponse numUniquePlayers;
	private final EventConnectionResponse events;
	private final ListResponse<VideogameResponse> videogames;
	private final StandingConnectionResponse standings;
	private final EventOwnerConnectionResponse eventOwners;
	private final StringResponse adminUrl;
	private final StringResponse addrState;
	private final StringResponse city;
	private final JSONResponse attendeeFieldConfig;
	private final StringResponse contactEmail;
	private final StringResponse contactPhone;
	private final StringResponse contactTwitter;
	private final StringResponse countryCode;
	private final TimestampResponse createdAt;
	private final StringResponse currency;
	private final JSONResponse customMarkdown;
	private final StringResponse details;
	private final StringResponse emailDirections;
	private final StringResponse emailInstructions;
	private final StringResponse emailNote;
	private final TimestampResponse endAt;
	private final JSONResponse generatedTabs;
	private final StringResponse gettingThere;
	private final StringResponse hashtag;
	private final BooleanResponse hasOnlineEvents;
	private final BooleanResponse hideAdmins;
	private final BooleanResponse includeQRCheckIn;
	private final BooleanResponse includeQRCode;
	private final BooleanResponse isOnline;
	private final BooleanResponse hasOfflineEvents;
	private final FloatResponse lat;
	private final TournamentLinksResponse links;
	private final FloatResponse lng;
	private final StringResponse mapsPlaceId;
	private final StringResponse name;
	private final BooleanResponse notifyAdmins;
	private final IntResponse ownerId;
	private final StringResponse postalCode;
	private final StringResponse primaryContact;
	private final StringResponse primaryContactType;
	private final StringResponse prizes;
	private final JSONResponse publishing;
	private final StringResponse qrCodeRedirect;
	private final StringResponse qrCodeRedirectType;
	private final StringResponse region;
	private final TimestampResponse registrationClosesAt;
	private final StringResponse defaultTab;
	private final StringResponse rules;
	private final StringResponse shortSlug;
	private final IntResponse reminderInterval;
	private final TimestampResponse startAt;
	private final IntResponse state;
	private final StringResponse timezone;
	private final IntResponse tournamentType;
	private final TimestampResponse updatedAt;
	private final StringResponse url;
	private final StringResponse venueAddress;
	private final StringResponse venueName;
	private final TimestampResponse eventRegistrationClosesAt;
	private final TimestampResponse teamCreationClosesAt;
	private final StringResponse onsitePaymentMode;
	private final StringResponse paypalMode;
	private final StringResponse stripeMode;
	private final StringResponse paypalUser;
	private final StringResponse stripeUserId;
	private final BooleanResponse approved;
	private final BooleanResponse showStandings;
	private final IntResponse finalEventId;
	private final IntResponse numProgressingToFinalEvent;

	public LeagueResponse() {
		super(EntityType.LEAGUE);

		id = null;
		images = null;
		slug = null;
		entrantCount = null;
		numUniquePlayers = null;
		events = null;
		videogames = null;
		standings = null;
		eventOwners = null;
		adminUrl = null;
		addrState = null;
		city = null;
		attendeeFieldConfig = null;
		contactEmail = null;
		contactPhone = null;
		contactTwitter = null;
		countryCode = null;
		createdAt = null;
		currency = null;
		customMarkdown = null;
		details = null;
		emailDirections = null;
		emailInstructions = null;
		emailNote = null;
		endAt = null;
		generatedTabs = null;
		gettingThere = null;
		hashtag = null;
		hasOnlineEvents = null;
		hideAdmins = null;
		includeQRCheckIn = null;
		includeQRCode = null;
		isOnline = null;
		hasOfflineEvents = null;
		lat = null;
		links = null;
		lng = null;
		mapsPlaceId = null;
		name = null;
		notifyAdmins = null;
		ownerId = null;
		postalCode = null;
		primaryContact = null;
		primaryContactType = null;
		prizes = null;
		publishing = null;
		qrCodeRedirect = null;
		qrCodeRedirectType = null;
		region = null;
		registrationClosesAt = null;
		defaultTab = null;
		rules = null;
		shortSlug = null;
		reminderInterval = null;
		startAt = null;
		state = null;
		timezone = null;
		tournamentType = null;
		updatedAt = null;
		url = null;
		venueAddress = null;
		venueName = null;
		eventRegistrationClosesAt = null;
		teamCreationClosesAt = null;
		onsitePaymentMode = null;
		paypalMode = null;
		stripeMode = null;
		paypalUser = null;
		stripeUserId = null;
		approved = null;
		showStandings = null;
		finalEventId = null;
		numProgressingToFinalEvent = null;
	}

	public LeagueResponse(IDResponse id, ListResponse<ImageResponse> images, StringResponse slug, IntResponse entrantCount, IntResponse numUniquePlayers, EventConnectionResponse events, ListResponse<VideogameResponse> videogames, StandingConnectionResponse standings, EventOwnerConnectionResponse eventOwners, StringResponse adminUrl, StringResponse addrState, StringResponse city, JSONResponse attendeeFieldConfig, StringResponse contactEmail, StringResponse contactPhone, StringResponse contactTwitter, StringResponse countryCode, TimestampResponse createdAt, StringResponse currency, JSONResponse customMarkdown, StringResponse details, StringResponse emailDirections, StringResponse emailInstructions, StringResponse emailNote, TimestampResponse endAt, JSONResponse generatedTabs, StringResponse gettingThere, StringResponse hashtag, BooleanResponse hasOnlineEvents, BooleanResponse hideAdmins, BooleanResponse includeQRCheckIn, BooleanResponse includeQRCode, BooleanResponse isOnline, BooleanResponse hasOfflineEvents, FloatResponse lat, TournamentLinksResponse links, FloatResponse lng, StringResponse mapsPlaceId, StringResponse name, BooleanResponse notifyAdmins, IntResponse ownerId, StringResponse postalCode, StringResponse primaryContact, StringResponse primaryContactType, StringResponse prizes, JSONResponse publishing, StringResponse qrCodeRedirect, StringResponse qrCodeRedirectType, StringResponse region, TimestampResponse registrationClosesAt, StringResponse defaultTab, StringResponse rules, StringResponse shortSlug, IntResponse reminderInterval, TimestampResponse startAt, IntResponse state, StringResponse timezone, IntResponse tournamentType, TimestampResponse updatedAt, StringResponse url, StringResponse venueAddress, StringResponse venueName, TimestampResponse eventRegistrationClosesAt, TimestampResponse teamCreationClosesAt, StringResponse onsitePaymentMode, StringResponse paypalMode, StringResponse stripeMode, StringResponse paypalUser, StringResponse stripeUserId, BooleanResponse approved, BooleanResponse showStandings, IntResponse finalEventId, IntResponse numProgressingToFinalEvent) {
		super(EntityType.LEAGUE, true);
		this.id = id;
		this.images = images;
		this.slug = slug;
		this.entrantCount = entrantCount;
		this.numUniquePlayers = numUniquePlayers;
		this.events = events;
		this.videogames = videogames;
		this.standings = standings;
		this.eventOwners = eventOwners;
		this.adminUrl = adminUrl;
		this.addrState = addrState;
		this.city = city;
		this.attendeeFieldConfig = attendeeFieldConfig;
		this.contactEmail = contactEmail;
		this.contactPhone = contactPhone;
		this.contactTwitter = contactTwitter;
		this.countryCode = countryCode;
		this.createdAt = createdAt;
		this.currency = currency;
		this.customMarkdown = customMarkdown;
		this.details = details;
		this.emailDirections = emailDirections;
		this.emailInstructions = emailInstructions;
		this.emailNote = emailNote;
		this.endAt = endAt;
		this.generatedTabs = generatedTabs;
		this.gettingThere = gettingThere;
		this.hashtag = hashtag;
		this.hasOnlineEvents = hasOnlineEvents;
		this.hideAdmins = hideAdmins;
		this.includeQRCheckIn = includeQRCheckIn;
		this.includeQRCode = includeQRCode;
		this.isOnline = isOnline;
		this.hasOfflineEvents = hasOfflineEvents;
		this.lat = lat;
		this.links = links;
		this.lng = lng;
		this.mapsPlaceId = mapsPlaceId;
		this.name = name;
		this.notifyAdmins = notifyAdmins;
		this.ownerId = ownerId;
		this.postalCode = postalCode;
		this.primaryContact = primaryContact;
		this.primaryContactType = primaryContactType;
		this.prizes = prizes;
		this.publishing = publishing;
		this.qrCodeRedirect = qrCodeRedirect;
		this.qrCodeRedirectType = qrCodeRedirectType;
		this.region = region;
		this.registrationClosesAt = registrationClosesAt;
		this.defaultTab = defaultTab;
		this.rules = rules;
		this.shortSlug = shortSlug;
		this.reminderInterval = reminderInterval;
		this.startAt = startAt;
		this.state = state;
		this.timezone = timezone;
		this.tournamentType = tournamentType;
		this.updatedAt = updatedAt;
		this.url = url;
		this.venueAddress = venueAddress;
		this.venueName = venueName;
		this.eventRegistrationClosesAt = eventRegistrationClosesAt;
		this.teamCreationClosesAt = teamCreationClosesAt;
		this.onsitePaymentMode = onsitePaymentMode;
		this.paypalMode = paypalMode;
		this.stripeMode = stripeMode;
		this.paypalUser = paypalUser;
		this.stripeUserId = stripeUserId;
		this.approved = approved;
		this.showStandings = showStandings;
		this.finalEventId = finalEventId;
		this.numProgressingToFinalEvent = numProgressingToFinalEvent;
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
	 * The slug used to form the url
	 */
	public StringResponse getSlug() {
		checkProvided();
		return slug;
	}

	public IntResponse getEntrantCount() {
		checkProvided();
		return entrantCount;
	}

	public IntResponse getNumUniquePlayers() {
		checkProvided();
		return numUniquePlayers;
	}

	/**
	 * Paginated list of events in a league
	 */
	public EventConnectionResponse getEvents() {
		checkProvided();
		return events;
	}

	public ListResponse<VideogameResponse> getVideogames() {
		checkProvided();
		return videogames;
	}

	/**
	 * Paginated list of standings
	 */
	public StandingConnectionResponse getStandings() {
		checkProvided();
		return standings;
	}

	public EventOwnerConnectionResponse getEventOwners() {
		checkProvided();
		return eventOwners;
	}

	/**
	 * Build Tournament admin URL
	 */
	public StringResponse getAdminUrl() {
		checkProvided();
		return adminUrl;
	}

	public StringResponse getAddrState() {
		checkProvided();
		return addrState;
	}

	public StringResponse getCity() {
		checkProvided();
		return city;
	}

	/**
	 * Attendee requirements for this tournament
	 */
	public JSONResponse getAttendeeFieldConfig() {
		checkProvided();
		return attendeeFieldConfig;
	}

	@Deprecated
	public StringResponse getContactEmail() {
		checkProvided();
		return contactEmail;
	}

	@Deprecated
	public StringResponse getContactPhone() {
		checkProvided();
		return contactPhone;
	}

	@Deprecated
	public StringResponse getContactTwitter() {
		checkProvided();
		return contactTwitter;
	}

	public StringResponse getCountryCode() {
		checkProvided();
		return countryCode;
	}

	/**
	 * When the tournament was created (unix timestamp)
	 */
	public TimestampResponse getCreatedAt() {
		checkProvided();
		return createdAt;
	}

	public StringResponse getCurrency() {
		checkProvided();
		return currency;
	}

	public JSONResponse getCustomMarkdown() {
		checkProvided();
		return customMarkdown;
	}

	/**
	 * Deprecated
	 */
	public StringResponse getDetails() {
		checkProvided();
		return details;
	}

	public StringResponse getEmailDirections() {
		checkProvided();
		return emailDirections;
	}

	public StringResponse getEmailInstructions() {
		checkProvided();
		return emailInstructions;
	}

	public StringResponse getEmailNote() {
		checkProvided();
		return emailNote;
	}

	/**
	 * When the tournament ends
	 */
	public TimestampResponse getEndAt() {
		checkProvided();
		return endAt;
	}

	public JSONResponse getGeneratedTabs() {
		checkProvided();
		return generatedTabs;
	}

	public StringResponse getGettingThere() {
		checkProvided();
		return gettingThere;
	}

	public StringResponse getHashtag() {
		checkProvided();
		return hashtag;
	}

	public BooleanResponse getHasOnlineEvents() {
		checkProvided();
		return hasOnlineEvents;
	}

	/**
	 * Whether or not to hide the admins
	 */
	public BooleanResponse getHideAdmins() {
		checkProvided();
		return hideAdmins;
	}

	public BooleanResponse getIncludeQRCheckIn() {
		checkProvided();
		return includeQRCheckIn;
	}

	public BooleanResponse getIncludeQRCode() {
		checkProvided();
		return includeQRCode;
	}

	/**
	 * True if tournament has at least one online event
	 */
	public BooleanResponse getIsOnline() {
		checkProvided();
		return isOnline;
	}

	/**
	 * True if tournament has at least one offline event
	 */
	public BooleanResponse getHasOfflineEvents() {
		checkProvided();
		return hasOfflineEvents;
	}

	public FloatResponse getLat() {
		checkProvided();
		return lat;
	}

	public TournamentLinksResponse getLinks() {
		checkProvided();
		return links;
	}

	public FloatResponse getLng() {
		checkProvided();
		return lng;
	}

	public StringResponse getMapsPlaceId() {
		checkProvided();
		return mapsPlaceId;
	}

	/**
	 * The tournament name
	 */
	public StringResponse getName() {
		checkProvided();
		return name;
	}

	/**
	 * Whether to send admin emails when a new person registers
	 */
	public BooleanResponse getNotifyAdmins() {
		checkProvided();
		return notifyAdmins;
	}

	public IntResponse getOwnerId() {
		checkProvided();
		return ownerId;
	}

	public StringResponse getPostalCode() {
		checkProvided();
		return postalCode;
	}

	public StringResponse getPrimaryContact() {
		checkProvided();
		return primaryContact;
	}

	public StringResponse getPrimaryContactType() {
		checkProvided();
		return primaryContactType;
	}

	/**
	 * Deprecated
	 */
	public StringResponse getPrizes() {
		checkProvided();
		return prizes;
	}

	/**
	 * Publishing settings for this tournament
	 */
	public JSONResponse getPublishing() {
		checkProvided();
		return publishing;
	}

	public StringResponse getQrCodeRedirect() {
		checkProvided();
		return qrCodeRedirect;
	}

	public StringResponse getQrCodeRedirectType() {
		checkProvided();
		return qrCodeRedirectType;
	}

	/**
	 * The region of the tournament
	 */
	public StringResponse getRegion() {
		checkProvided();
		return region;
	}

	/**
	 * When does registration for the tournament end
	 */
	public TimestampResponse getRegistrationClosesAt() {
		checkProvided();
		return registrationClosesAt;
	}

	public StringResponse getDefaultTab() {
		checkProvided();
		return defaultTab;
	}

	/**
	 * [Deprecated] General tournament rules
	 */
	public StringResponse getRules() {
		checkProvided();
		return rules;
	}

	/**
	 * The short slug used to form the url
	 */
	public StringResponse getShortSlug() {
		checkProvided();
		return shortSlug;
	}

	/**
	 * The period of time before the start date to send a reminder email to registrants
	 */
	public IntResponse getReminderInterval() {
		checkProvided();
		return reminderInterval;
	}

	/**
	 * When the tournament Starts
	 */
	public TimestampResponse getStartAt() {
		checkProvided();
		return startAt;
	}

	/**
	 * State of the tournament, can be ActivityState::CREATED, ActivityState::ACTIVE, or ActivityState::COMPLETED
	 */
	public IntResponse getState() {
		checkProvided();
		return state;
	}

	/**
	 * The timezone of the tournament
	 */
	public StringResponse getTimezone() {
		checkProvided();
		return timezone;
	}

	public IntResponse getTournamentType() {
		checkProvided();
		return tournamentType;
	}

	/**
	 * When the tournament was last modified (unix timestamp)
	 */
	public TimestampResponse getUpdatedAt() {
		checkProvided();
		return updatedAt;
	}

	/**
	 * Build Tournament URL
	 */
	public StringResponse getUrl() {
		checkProvided();
		return url;
	}

	public StringResponse getVenueAddress() {
		checkProvided();
		return venueAddress;
	}

	public StringResponse getVenueName() {
		checkProvided();
		return venueName;
	}

	/**
	 * When does event registration close
	 */
	public TimestampResponse getEventRegistrationClosesAt() {
		checkProvided();
		return eventRegistrationClosesAt;
	}

	/**
	 * When is the team creation deadline
	 */
	public TimestampResponse getTeamCreationClosesAt() {
		checkProvided();
		return teamCreationClosesAt;
	}

	public StringResponse getOnsitePaymentMode() {
		checkProvided();
		return onsitePaymentMode;
	}

	public StringResponse getPaypalMode() {
		checkProvided();
		return paypalMode;
	}

	public StringResponse getStripeMode() {
		checkProvided();
		return stripeMode;
	}

	public StringResponse getPaypalUser() {
		checkProvided();
		return paypalUser;
	}

	public StringResponse getStripeUserId() {
		checkProvided();
		return stripeUserId;
	}

	public BooleanResponse getApproved() {
		checkProvided();
		return approved;
	}

	/**
	 * Whether standings for this league should be visible
	 */
	public BooleanResponse getShowStandings() {
		checkProvided();
		return showStandings;
	}

	/**
	 * Hacked "progression" into this final event
	 */
	public IntResponse getFinalEventId() {
		checkProvided();
		return finalEventId;
	}

	/**
	 * Top X number of people in the standings who progress to final event
	 */
	public IntResponse getNumProgressingToFinalEvent() {
		checkProvided();
		return numProgressingToFinalEvent;
	}
}
