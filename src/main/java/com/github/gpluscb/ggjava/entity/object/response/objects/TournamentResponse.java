package com.github.gpluscb.ggjava.entity.object.response.objects;

import com.github.gpluscb.ggjava.entity.EntityType;
import com.github.gpluscb.ggjava.entity.object.response.AbstractGGResponseObject;
import com.github.gpluscb.ggjava.entity.object.response.ListResponse;
import com.github.gpluscb.ggjava.entity.object.response.scalars.*;

/**
 * A tournament
 */
public class TournamentResponse extends AbstractGGResponseObject {
	private final StringResponse addrState;
	private final IDResponse id;
	private final ListResponse<UserResponse> admins;
	private final StringResponse city;
	private final StringResponse countryCode;
	private final TimestampResponse createdAt;
	private final StringResponse currency;
	private final TimestampResponse endAt;
	private final TimestampResponse eventRegistrationClosesAt;
	private final ListResponse<EventResponse> events;
	private final BooleanResponse hasOfflineEvents;
	private final BooleanResponse hasOnlineEvents;
	private final StringResponse hashtag;
	private final ListResponse<ImageResponse> images;
	private final BooleanResponse isOnline;
	private final BooleanResponse isRegistrationOpen;
	private final FloatResponse lat;
	private final TournamentLinksResponse links;
	private final FloatResponse lng;
	private final StringResponse mapsPlaceId;
	private final StringResponse name;
	private final IntResponse numAttendees;
	private final UserResponse owner;
	private final ParticipantConnectionResponse participants;
	private final StringResponse postalCode;
	private final StringResponse primaryContact;
	private final StringResponse primaryContactType;
	private final JSONResponse publishing;
	private final TimestampResponse registrationClosesAt;
	private final StringResponse rules;
	private final StringResponse shortSlug;
	private final StringResponse slug;
	private final TimestampResponse startAt;
	private final IntResponse state;
	private final StationsConnectionResponse stations;
	private final ListResponse<StreamQueueInfoResponse> streamQueue;
	private final ListResponse<StreamsResponse> streams;
	private final TimestampResponse teamCreationClosesAt;
	private final TeamConnectionResponse teams;
	private final StringResponse timezone;
	private final IntResponse tournamentType;
	private final TimestampResponse updatedAt;
	private final StringResponse url;
	private final StringResponse venueAddress;
	private final StringResponse venueName;
	private final ListResponse<WaveResponse> waves;

	public TournamentResponse() {
		super(EntityType.TOURNAMENT);

		addrState = null;
		id = null;
		admins = null;
		city = null;
		countryCode = null;
		createdAt = null;
		currency = null;
		endAt = null;
		eventRegistrationClosesAt = null;
		events = null;
		hasOfflineEvents = null;
		hasOnlineEvents = null;
		hashtag = null;
		images = null;
		isOnline = null;
		isRegistrationOpen = null;
		lat = null;
		links = null;
		lng = null;
		mapsPlaceId = null;
		name = null;
		numAttendees = null;
		owner = null;
		participants = null;
		postalCode = null;
		primaryContact = null;
		primaryContactType = null;
		publishing = null;
		registrationClosesAt = null;
		rules = null;
		shortSlug = null;
		slug = null;
		startAt = null;
		state = null;
		stations = null;
		streamQueue = null;
		streams = null;
		teamCreationClosesAt = null;
		teams = null;
		timezone = null;
		tournamentType = null;
		updatedAt = null;
		url = null;
		venueAddress = null;
		venueName = null;
		waves = null;
	}

	public TournamentResponse(StringResponse addrState, IDResponse id, ListResponse<UserResponse> admins, StringResponse city, StringResponse countryCode, TimestampResponse createdAt, StringResponse currency, TimestampResponse endAt, TimestampResponse eventRegistrationClosesAt, ListResponse<EventResponse> events, BooleanResponse hasOfflineEvents, BooleanResponse hasOnlineEvents, StringResponse hashtag, ListResponse<ImageResponse> images, BooleanResponse isOnline, BooleanResponse isRegistrationOpen, FloatResponse lat, TournamentLinksResponse links, FloatResponse lng, StringResponse mapsPlaceId, StringResponse name, IntResponse numAttendees, UserResponse owner, ParticipantConnectionResponse participants, StringResponse postalCode, StringResponse primaryContact, StringResponse primaryContactType, JSONResponse publishing, TimestampResponse registrationClosesAt, StringResponse rules, StringResponse shortSlug, StringResponse slug, TimestampResponse startAt, IntResponse state, StationsConnectionResponse stations, ListResponse<StreamQueueInfoResponse> streamQueue, ListResponse<StreamsResponse> streams, TimestampResponse teamCreationClosesAt, TeamConnectionResponse teams, StringResponse timezone, IntResponse tournamentType, TimestampResponse updatedAt, StringResponse url, StringResponse venueAddress, StringResponse venueName, ListResponse<WaveResponse> waves) {
		super(EntityType.TOURNAMENT, true);
		this.addrState = addrState;
		this.id = id;
		this.admins = admins;
		this.city = city;
		this.countryCode = countryCode;
		this.createdAt = createdAt;
		this.currency = currency;
		this.endAt = endAt;
		this.eventRegistrationClosesAt = eventRegistrationClosesAt;
		this.events = events;
		this.hasOfflineEvents = hasOfflineEvents;
		this.hasOnlineEvents = hasOnlineEvents;
		this.hashtag = hashtag;
		this.images = images;
		this.isOnline = isOnline;
		this.isRegistrationOpen = isRegistrationOpen;
		this.lat = lat;
		this.links = links;
		this.lng = lng;
		this.mapsPlaceId = mapsPlaceId;
		this.name = name;
		this.numAttendees = numAttendees;
		this.owner = owner;
		this.participants = participants;
		this.postalCode = postalCode;
		this.primaryContact = primaryContact;
		this.primaryContactType = primaryContactType;
		this.publishing = publishing;
		this.registrationClosesAt = registrationClosesAt;
		this.rules = rules;
		this.shortSlug = shortSlug;
		this.slug = slug;
		this.startAt = startAt;
		this.state = state;
		this.stations = stations;
		this.streamQueue = streamQueue;
		this.streams = streams;
		this.teamCreationClosesAt = teamCreationClosesAt;
		this.teams = teams;
		this.timezone = timezone;
		this.tournamentType = tournamentType;
		this.updatedAt = updatedAt;
		this.url = url;
		this.venueAddress = venueAddress;
		this.venueName = venueName;
		this.waves = waves;
	}

	public StringResponse getAddrState() {
		checkProvided();
		return addrState;
	}

	public IDResponse getId() {
		checkProvided();
		return id;
	}

	/**
	 * Admin-only view of admins for this tournament
	 */
	public ListResponse<UserResponse> getAdmins() {
		checkProvided();
		return admins;
	}

	public StringResponse getCity() {
		checkProvided();
		return city;
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

	/**
	 * When the tournament ends
	 */
	public TimestampResponse getEndAt() {
		checkProvided();
		return endAt;
	}

	/**
	 * When does event registration close
	 */
	public TimestampResponse getEventRegistrationClosesAt() {
		checkProvided();
		return eventRegistrationClosesAt;
	}

	public ListResponse<EventResponse> getEvents() {
		checkProvided();
		return events;
	}

	/**
	 * True if tournament has at least one offline event
	 */
	public BooleanResponse getHasOfflineEvents() {
		checkProvided();
		return hasOfflineEvents;
	}

	public BooleanResponse getHasOnlineEvents() {
		checkProvided();
		return hasOnlineEvents;
	}

	public StringResponse getHashtag() {
		checkProvided();
		return hashtag;
	}

	public ListResponse<ImageResponse> getImages() {
		checkProvided();
		return images;
	}

	/**
	 * True if tournament has at least one online event
	 */
	public BooleanResponse getIsOnline() {
		checkProvided();
		return isOnline;
	}

	/**
	 * Is tournament registration open
	 */
	public BooleanResponse getIsRegistrationOpen() {
		checkProvided();
		return isRegistrationOpen;
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
	 * Number of attendees including spectators, if public
	 */
	public IntResponse getNumAttendees() {
		checkProvided();
		return numAttendees;
	}

	/**
	 * The user who created the tournament
	 */
	public UserResponse getOwner() {
		checkProvided();
		return owner;
	}

	/**
	 * Paginated, queryable list of participants
	 */
	public ParticipantConnectionResponse getParticipants() {
		checkProvided();
		return participants;
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
	 * Publishing settings for this tournament
	 */
	public JSONResponse getPublishing() {
		checkProvided();
		return publishing;
	}

	/**
	 * When does registration for the tournament end
	 */
	public TimestampResponse getRegistrationClosesAt() {
		checkProvided();
		return registrationClosesAt;
	}

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
	 * The slug used to form the url
	 */
	public StringResponse getSlug() {
		checkProvided();
		return slug;
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

	public StationsConnectionResponse getStations() {
		checkProvided();
		return stations;
	}

	public ListResponse<StreamQueueInfoResponse> getStreamQueue() {
		checkProvided();
		return streamQueue;
	}

	public ListResponse<StreamsResponse> getStreams() {
		checkProvided();
		return streams;
	}

	/**
	 * When is the team creation deadline
	 */
	public TimestampResponse getTeamCreationClosesAt() {
		checkProvided();
		return teamCreationClosesAt;
	}

	/**
	 * Paginated, queryable list of teams
	 */
	public TeamConnectionResponse getTeams() {
		checkProvided();
		return teams;
	}

	/**
	 * The timezone of the tournament
	 */
	public StringResponse getTimezone() {
		checkProvided();
		return timezone;
	}

	/**
	 * The type of tournament from TournamentType
	 */
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
	 * List of all waves in this tournament
	 */
	public ListResponse<WaveResponse> getWaves() {
		checkProvided();
		return waves;
	}
}
