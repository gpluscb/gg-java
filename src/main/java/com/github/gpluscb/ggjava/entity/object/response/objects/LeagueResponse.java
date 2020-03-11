package com.github.gpluscb.ggjava.entity.object.response.objects;

import com.github.gpluscb.ggjava.entity.EntityType;
import com.github.gpluscb.ggjava.entity.object.response.AbstractGGResponseObject;
import com.github.gpluscb.ggjava.entity.object.response.ListResponse;
import com.github.gpluscb.ggjava.entity.object.response.scalars.*;

/**
 * A league
 */
public class LeagueResponse extends AbstractGGResponseObject {
	private final StringResponse addrState;
	private final IDResponse id;
	private final StringResponse city;
	private final StringResponse countryCode;
	private final TimestampResponse createdAt;
	private final StringResponse currency;
	private final TimestampResponse endAt;
	private final IntResponse entrantCount;
	private final EventOwnerConnectionResponse eventOwners;
	private final TimestampResponse eventRegistrationClosesAt;
	private final EventConnectionResponse events;
	private final IntResponse finalEventId;
	private final BooleanResponse hasOfflineEvents;
	private final BooleanResponse hasOnlineEvents;
	private final StringResponse hashtag;
	private final ListResponse<ImageResponse> images;
	private final BooleanResponse isOnline;
	private final FloatResponse lat;
	private final TournamentLinksResponse links;
	private final FloatResponse lng;
	private final StringResponse mapsPlaceId;
	private final StringResponse name;
	private final IntResponse numProgressingToFinalEvent;
	private final IntResponse numUniquePlayers;
	private final StringResponse postalCode;
	private final StringResponse primaryContact;
	private final StringResponse primaryContactType;
	private final JSONResponse publishing;
	private final TimestampResponse registrationClosesAt;
	private final StringResponse rules;
	private final StringResponse shortSlug;
	private final BooleanResponse showStandings;
	private final StringResponse slug;
	private final StandingConnectionResponse standings;
	private final TimestampResponse startAt;
	private final IntResponse state;
	private final TimestampResponse teamCreationClosesAt;
	private final StringResponse timezone;
	private final IntResponse tournamentType;
	private final TimestampResponse updatedAt;
	private final StringResponse url;
	private final StringResponse venueAddress;
	private final StringResponse venueName;
	private final ListResponse<VideogameResponse> videogames;

	public LeagueResponse() {
		super(EntityType.LEAGUE);

		addrState = null;
		id = null;
		city = null;
		countryCode = null;
		createdAt = null;
		currency = null;
		endAt = null;
		entrantCount = null;
		eventOwners = null;
		eventRegistrationClosesAt = null;
		events = null;
		finalEventId = null;
		hasOfflineEvents = null;
		hasOnlineEvents = null;
		hashtag = null;
		images = null;
		isOnline = null;
		lat = null;
		links = null;
		lng = null;
		mapsPlaceId = null;
		name = null;
		numProgressingToFinalEvent = null;
		numUniquePlayers = null;
		postalCode = null;
		primaryContact = null;
		primaryContactType = null;
		publishing = null;
		registrationClosesAt = null;
		rules = null;
		shortSlug = null;
		showStandings = null;
		slug = null;
		standings = null;
		startAt = null;
		state = null;
		teamCreationClosesAt = null;
		timezone = null;
		tournamentType = null;
		updatedAt = null;
		url = null;
		venueAddress = null;
		venueName = null;
		videogames = null;
	}

	public LeagueResponse(StringResponse addrState, IDResponse id, StringResponse city, StringResponse countryCode, TimestampResponse createdAt, StringResponse currency, TimestampResponse endAt, IntResponse entrantCount, EventOwnerConnectionResponse eventOwners, TimestampResponse eventRegistrationClosesAt, EventConnectionResponse events, IntResponse finalEventId, BooleanResponse hasOfflineEvents, BooleanResponse hasOnlineEvents, StringResponse hashtag, ListResponse<ImageResponse> images, BooleanResponse isOnline, FloatResponse lat, TournamentLinksResponse links, FloatResponse lng, StringResponse mapsPlaceId, StringResponse name, IntResponse numProgressingToFinalEvent, IntResponse numUniquePlayers, StringResponse postalCode, StringResponse primaryContact, StringResponse primaryContactType, JSONResponse publishing, TimestampResponse registrationClosesAt, StringResponse rules, StringResponse shortSlug, BooleanResponse showStandings, StringResponse slug, StandingConnectionResponse standings, TimestampResponse startAt, IntResponse state, TimestampResponse teamCreationClosesAt, StringResponse timezone, IntResponse tournamentType, TimestampResponse updatedAt, StringResponse url, StringResponse venueAddress, StringResponse venueName, ListResponse<VideogameResponse> videogames) {
		super(EntityType.LEAGUE, true);
		this.addrState = addrState;
		this.id = id;
		this.city = city;
		this.countryCode = countryCode;
		this.createdAt = createdAt;
		this.currency = currency;
		this.endAt = endAt;
		this.entrantCount = entrantCount;
		this.eventOwners = eventOwners;
		this.eventRegistrationClosesAt = eventRegistrationClosesAt;
		this.events = events;
		this.finalEventId = finalEventId;
		this.hasOfflineEvents = hasOfflineEvents;
		this.hasOnlineEvents = hasOnlineEvents;
		this.hashtag = hashtag;
		this.images = images;
		this.isOnline = isOnline;
		this.lat = lat;
		this.links = links;
		this.lng = lng;
		this.mapsPlaceId = mapsPlaceId;
		this.name = name;
		this.numProgressingToFinalEvent = numProgressingToFinalEvent;
		this.numUniquePlayers = numUniquePlayers;
		this.postalCode = postalCode;
		this.primaryContact = primaryContact;
		this.primaryContactType = primaryContactType;
		this.publishing = publishing;
		this.registrationClosesAt = registrationClosesAt;
		this.rules = rules;
		this.shortSlug = shortSlug;
		this.showStandings = showStandings;
		this.slug = slug;
		this.standings = standings;
		this.startAt = startAt;
		this.state = state;
		this.teamCreationClosesAt = teamCreationClosesAt;
		this.timezone = timezone;
		this.tournamentType = tournamentType;
		this.updatedAt = updatedAt;
		this.url = url;
		this.venueAddress = venueAddress;
		this.venueName = venueName;
		this.videogames = videogames;
	}

	public StringResponse getAddrState() {
		checkProvided();
		return addrState;
	}

	public IDResponse getId() {
		checkProvided();
		return id;
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

	public IntResponse getEntrantCount() {
		checkProvided();
		return entrantCount;
	}

	public EventOwnerConnectionResponse getEventOwners() {
		checkProvided();
		return eventOwners;
	}

	/**
	 * When does event registration close
	 */
	public TimestampResponse getEventRegistrationClosesAt() {
		checkProvided();
		return eventRegistrationClosesAt;
	}

	/**
	 * Paginated list of events in a league
	 */
	public EventConnectionResponse getEvents() {
		checkProvided();
		return events;
	}

	/**
	 * Hacked "progression" into this final event
	 */
	public IntResponse getFinalEventId() {
		checkProvided();
		return finalEventId;
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
	 * Top X number of people in the standings who progress to final event
	 */
	public IntResponse getNumProgressingToFinalEvent() {
		checkProvided();
		return numProgressingToFinalEvent;
	}

	public IntResponse getNumUniquePlayers() {
		checkProvided();
		return numUniquePlayers;
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
	 * Whether standings for this league should be visible
	 */
	public BooleanResponse getShowStandings() {
		checkProvided();
		return showStandings;
	}

	public StringResponse getSlug() {
		checkProvided();
		return slug;
	}

	/**
	 * Paginated list of standings
	 */
	public StandingConnectionResponse getStandings() {
		checkProvided();
		return standings;
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
	 * When is the team creation deadline
	 */
	public TimestampResponse getTeamCreationClosesAt() {
		checkProvided();
		return teamCreationClosesAt;
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

	public ListResponse<VideogameResponse> getVideogames() {
		checkProvided();
		return videogames;
	}
}
