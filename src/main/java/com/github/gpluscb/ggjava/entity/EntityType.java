package com.github.gpluscb.ggjava.entity;

import com.github.gpluscb.ggjava.entity.object.response.GGResponseObject;
import com.github.gpluscb.ggjava.entity.object.response.enums.*;
import com.github.gpluscb.ggjava.entity.object.response.interfaces.BracketConfigResponse;
import com.github.gpluscb.ggjava.entity.object.response.interfaces.MatchConfigResponse;
import com.github.gpluscb.ggjava.entity.object.response.objects.*;
import com.github.gpluscb.ggjava.entity.object.response.scalars.*;
import com.github.gpluscb.ggjava.internal.utils.Checks;

import javax.annotation.Nonnull;
import javax.annotation.Nullable;

public enum EntityType {
	// Scalars
	BOOLEAN(BooleanResponse.class),
	FLOAT(FloatResponse.class),
	ID(IDResponse.class),
	INT(IntResponse.class),
	JSON(JSONResponse.class),
	STRING(StringResponse.class),
	TIMESTAMP(TimestampResponse.class),

	// Enums
	ACTIVITY_STATE(ActivityStateResponse.class),
	ADDRESS(AddressResponse.class),
	AUTHORIZATION_TYPE(AuthorizationTypeResponse.class),
	BRACKET_TYPE(BracketTypeResponse.class),
	COMPARATOR(ComparatorResponse.class),
	GAME_SELECTION_TYPE(GameSelectionTypeResponse.class),
	MATCH_CONFIG_VERIFICATION_METHOD(MatchConfigVerificationMethodResponse.class),
	RACE_LIMIT_MODE(RaceLimitModeResponse.class),
	RACE_TYPE(RaceTypeResponse.class),
	SET_SORT_TYPE(SetSortTypeResponse.class),
	STREAM_SOURCE(StreamSourceResponse.class),
	STREAM_TYPE(StreamTypeResponse.class),
	TOURNAMENT_PAGINATION_SORT(TournamentPaginationSortResponse.class),

	// Interfaces
	BRACKET_CONFIG(BracketConfigResponse.class),
	MATCH_CONFIG(MatchConfigResponse.class),

	// Objects
	CONTACT_INFO(ContactInfoResponse.class),
	ENTRANT(EntrantResponse.class),
	ENTRANT_CONNECTION(EntrantConnectionResponse.class),
	EVENT(EventResponse.class),
	EVENT_CONNECTION(EventConnectionResponse.class),
	EVENT_OWNER(EventOwnerResponse.class),
	EVENT_OWNER_CONNECTION(EventOwnerConnectionResponse.class),
	GAME(GameResponse.class),
	GAME_SELECTION(GameSelectionResponse.class),
	IMAGE(ImageResponse.class),
	LEAGUE(LeagueResponse.class),
	PAGE_INFO(PageInfoResponse.class),
	PARTICIPANT(ParticipantResponse.class),
	PARTICIPANT_CONNECTION(ParticipantConnectionResponse.class),
	PHASE(PhaseResponse.class),
	PHASE_GROUP(PhaseGroupResponse.class),
	PHASE_GROUP_CONNECTION(PhaseGroupConnectionResponse.class),
	PLAYER(PlayerResponse.class),
	PLAYER_RANK(PlayerRankResponse.class),
	PROFILE_AUTHORIZATION(ProfileAuthorizationResponse.class),
	PROGRESSION(ProgressionResponse.class),
	RACE_BRACKET_CONFIG(RaceBracketConfigResponse.class),
	RACE_MATCH_CONFIG(RaceMatchConfigResponse.class),
	ROUND(RoundResponse.class),
	SCORE(ScoreResponse.class),
	SEED(SeedResponse.class),
	SEED_CONNECTION(SeedConnectionResponse.class),
	SET(SetResponse.class),
	SET_CONNECTION(SetConnectionResponse.class),
	SET_SLOT(SetSlotResponse.class),
	SHOP(ShopResponse.class),
	SHOP_LEVEL(ShopLevelResponse.class),
	SHOP_LEVEL_CONNECTION(ShopLevelConnectionResponse.class),
	SHOP_ORDER_MESSAGE(ShopOrderMessageResponse.class),
	SHOP_ORDER_MESSAGE_CONNECTION(ShopOrderMessageConnectionResponse.class),
	STANDING(StandingResponse.class),
	STANDING_CONNECTION(StandingConnectionResponse.class),
	STANDING_STATS(StandingStatsResponse.class),
	STATIONS(StationsResponse.class),
	STATIONS_CONNECTION(StationsConnectionResponse.class),
	STREAM_QUEUE_INFO(StreamQueueInfoResponse.class),
	STREAM(StreamResponse.class),
	STREAMS(StreamsResponse.class),
	TEAM(TeamResponse.class),
	TEAM_CONNECTION(TeamConnectionResponse.class),
	TOURNAMENT(TournamentResponse.class),
	TOURNAMENT_CONNECTION(TournamentConnectionResponse.class),
	TOURNAMENT_LINKS(TournamentLinksResponse.class),
	USER(UserResponse.class),
	VIDEOGAME(VideogameResponse.class),
	VIDEOGAME_CONNECTION(VideogameConnectionResponse.class),
	WAVE(WaveResponse.class),

	// Input objects
	EVENT_ENTRANT_PAGE_QUERY(null),
	EVENT_ENTRANT_PAGE_QUERY_FILTER(null),
	EVENT_OWNER_QUERY(null),
	LEAGUE_EVENTS_FILTER(null),
	LEAGUE_EVENTS_QUERY(null),
	PAGINATION_SEARCH_TYPE(null),
	PARTICIPANT_PAGE_FILTER(null),
	PARTICIPANT_PAGINATION_QUERY(null),
	PARTICIPANT_SEARCH(null),
	PHASE_GROUP_PAGE_QUERY(null),
	PHASE_GROUP_PAGE_QUERY_FILTER(null),
	PHASE_GROUP_UPDATE_INPUT(null),
	PHASE_UPSERT_INPUT(null),
	RESOLVE_CONFLICTS_LOCKED_SEED_CONFIG(null),
	RESOLVE_CONFLICTS_OPTIONS(null),
	SEED_PAGE_FILTER(null),
	SEED_PAGINATION_QUERY(null),
	SEED_SEARCH(null),
	SET_FILTER_LOCATION(null),
	SET_FILTER_LOCATION_DISTANCE_FROM(null),
	SET_FILTER_LOCATION_DISTANCE_FROM_POINT(null),
	SET_FILTERS(null),
	SHOP_LEVELS_QUERY(null),
	SHOP_ORDER_MESSAGES_QUERY(null),
	STANDING_GROUP_STANDING_PAGE_FILTER(null),
	STANDING_PAGE_FILTER(null),
	STANDING_PAGINATION_QUERY(null),
	STATION_FILTER(null),
	STATION_UPSERT_INPUT(null),
	TEAMS_PAGE_FILTER(null),
	TEAMS_PAGINATION_QUERY(null),
	TOP_GAME_FILTER(null),
	TOURNAMENT_LOCATION_FILTER(null),
	TOURNAMENT_PAGE_FILTER(null),
	TOURNAMENT_QUERY(null),
	UPDATE_PHASE_SEED_INFO(null),
	UPDATE_PHASE_SEEDING_OPTIONS(null),
	WAVE_UPSERT_INPUT(null);

	@Nullable
	private Class<? extends GGResponseObject> responseClass;

	EntityType(@Nullable Class<? extends GGResponseObject> responseClass) {
		this.responseClass = responseClass;
	}

	@Nullable
	public Class<? extends GGResponseObject> getResponseClass() {
		return responseClass;
	}

	@Nullable
	public static EntityType getByResponseClass(@Nonnull Class<? extends GGResponseObject> responseClass) {
		Checks.nonNull(responseClass, "responseClass");

		for (EntityType type : values())
			if (responseClass.equals(type.getResponseClass())) return type;

		return null;
	}
}
