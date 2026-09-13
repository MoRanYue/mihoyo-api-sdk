package uigf.mihoyo.game.genshin.record;

import io.clientcore.core.annotations.Metadata;
import io.clientcore.core.annotations.MetadataProperties;
import io.clientcore.core.annotations.ReturnType;
import io.clientcore.core.annotations.ServiceClient;
import io.clientcore.core.annotations.ServiceMethod;
import io.clientcore.core.http.models.HttpResponseException;
import io.clientcore.core.http.models.RequestContext;
import io.clientcore.core.http.models.Response;
import io.clientcore.core.instrumentation.Instrumentation;
import uigf.mihoyo.ApiResponseCharacterList;
import uigf.mihoyo.ApiResponseGenshinActivityCalendarData;
import uigf.mihoyo.ApiResponseGenshinCharacterMasterData;
import uigf.mihoyo.ApiResponseGenshinDailyNoteData;
import uigf.mihoyo.ApiResponseGenshinExternalContentData;
import uigf.mihoyo.ApiResponseGenshinRecordIndexData;
import uigf.mihoyo.ApiResponseGenshinRoleBasicInfoData;
import uigf.mihoyo.ApiResponseGenshinSpiralAbyssData;
import uigf.mihoyo.ApiResponseGenshinStygianData;
import uigf.mihoyo.ApiResponseGenshinStygianPopularityData;
import uigf.mihoyo.ApiResponseGenshinTheaterData;
import uigf.mihoyo.ApiResponseGenshinToolData;
import uigf.mihoyo.ApiResponseJsonObject;
import uigf.mihoyo.checkin.implementation.GenshinRecordApisImpl;
import uigf.mihoyo.game.CharacterDetailRequest;
import uigf.mihoyo.game.CharacterListRequest;

/**
 * Initializes a new instance of the synchronous RecordClient type.
 */
@ServiceClient(builder = RecordClientBuilder.class)
public final class GenshinRecordApiClient {
    @Metadata(properties = { MetadataProperties.GENERATED })
    private final GenshinRecordApisImpl serviceClient;

    private final Instrumentation instrumentation;

    /**
     * Initializes an instance of GenshinRecordApiClient class.
     * 
     * @param serviceClient the service client implementation.
     * @param instrumentation the instrumentation instance.
     */
    @Metadata(properties = { MetadataProperties.GENERATED })
    GenshinRecordApiClient(GenshinRecordApisImpl serviceClient, Instrumentation instrumentation) {
        this.serviceClient = serviceClient;
        this.instrumentation = instrumentation;
    }

    /**
     * The getIndex operation.
     * 
     * @param cookie The cookie parameter.
     * @param server The server parameter.
     * @param roleId The roleId parameter.
     * @param ds The ds parameter.
     * @param avatarListType The avatarListType parameter.
     * @param requestContext The context to configure the HTTP request before HTTP client sends it.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws HttpResponseException thrown if the service returns an error.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return common response wrapper returned by MiHoYo and HoYoLAB services along with {@link Response}.
     */
    @Metadata(properties = { MetadataProperties.GENERATED })
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Response<ApiResponseGenshinRecordIndexData> getIndexWithResponse(String cookie, String server, String roleId,
        String ds, Integer avatarListType, RequestContext requestContext) {
        return this.instrumentation.instrumentWithResponse("UIGF.Mihoyo.Game.Genshin.Record.GameRecordApi.getIndex",
            requestContext, updatedContext -> this.serviceClient.getIndexWithResponse(cookie, server, roleId, ds,
                avatarListType, updatedContext));
    }

    /**
     * The getIndex operation.
     * 
     * @param cookie The cookie parameter.
     * @param server The server parameter.
     * @param roleId The roleId parameter.
     * @param ds The ds parameter.
     * @param avatarListType The avatarListType parameter.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws HttpResponseException thrown if the service returns an error.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return common response wrapper returned by MiHoYo and HoYoLAB services.
     */
    @Metadata(properties = { MetadataProperties.GENERATED })
    @ServiceMethod(returns = ReturnType.SINGLE)
    public ApiResponseGenshinRecordIndexData getIndex(String cookie, String server, String roleId, String ds,
        Integer avatarListType) {
        return getIndexWithResponse(cookie, server, roleId, ds, avatarListType, RequestContext.none()).getValue();
    }

    /**
     * The getIndex operation.
     * 
     * @param cookie The cookie parameter.
     * @param server The server parameter.
     * @param roleId The roleId parameter.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws HttpResponseException thrown if the service returns an error.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return common response wrapper returned by MiHoYo and HoYoLAB services.
     */
    @Metadata(properties = { MetadataProperties.GENERATED })
    @ServiceMethod(returns = ReturnType.SINGLE)
    public ApiResponseGenshinRecordIndexData getIndex(String cookie, String server, String roleId) {
        final String ds = null;
        final Integer avatarListType = null;
        return getIndexWithResponse(cookie, server, roleId, ds, avatarListType, RequestContext.none()).getValue();
    }

    /**
     * The listCharacters operation.
     * 
     * @param cookie The cookie parameter.
     * @param body The body parameter.
     * @param ds The ds parameter.
     * @param requestContext The context to configure the HTTP request before HTTP client sends it.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws HttpResponseException thrown if the service returns an error.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return common response wrapper returned by MiHoYo and HoYoLAB services along with {@link Response}.
     */
    @Metadata(properties = { MetadataProperties.GENERATED })
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Response<ApiResponseCharacterList> listCharactersWithResponse(String cookie, CharacterListRequest body,
        String ds, RequestContext requestContext) {
        return this.instrumentation.instrumentWithResponse(
            "UIGF.Mihoyo.Game.Genshin.Record.GameRecordApi.listCharacters", requestContext,
            updatedContext -> this.serviceClient.listCharactersWithResponse(cookie, body, ds, updatedContext));
    }

    /**
     * The listCharacters operation.
     * 
     * @param cookie The cookie parameter.
     * @param body The body parameter.
     * @param ds The ds parameter.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws HttpResponseException thrown if the service returns an error.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return common response wrapper returned by MiHoYo and HoYoLAB services.
     */
    @Metadata(properties = { MetadataProperties.GENERATED })
    @ServiceMethod(returns = ReturnType.SINGLE)
    public ApiResponseCharacterList listCharacters(String cookie, CharacterListRequest body, String ds) {
        return listCharactersWithResponse(cookie, body, ds, RequestContext.none()).getValue();
    }

    /**
     * The listCharacters operation.
     * 
     * @param cookie The cookie parameter.
     * @param body The body parameter.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws HttpResponseException thrown if the service returns an error.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return common response wrapper returned by MiHoYo and HoYoLAB services.
     */
    @Metadata(properties = { MetadataProperties.GENERATED })
    @ServiceMethod(returns = ReturnType.SINGLE)
    public ApiResponseCharacterList listCharacters(String cookie, CharacterListRequest body) {
        final String ds = null;
        return listCharactersWithResponse(cookie, body, ds, RequestContext.none()).getValue();
    }

    /**
     * Character IDs should be sent in batches of at most 40, as used by TeyvatGuide.
     * 
     * @param cookie The cookie parameter.
     * @param body The body parameter.
     * @param ds The ds parameter.
     * @param requestContext The context to configure the HTTP request before HTTP client sends it.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws HttpResponseException thrown if the service returns an error.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return common response wrapper returned by MiHoYo and HoYoLAB services along with {@link Response}.
     */
    @Metadata(properties = { MetadataProperties.GENERATED })
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Response<ApiResponseCharacterList> getCharacterDetailsWithResponse(String cookie,
        CharacterDetailRequest body, String ds, RequestContext requestContext) {
        return this.instrumentation.instrumentWithResponse(
            "UIGF.Mihoyo.Game.Genshin.Record.GameRecordApi.getCharacterDetails", requestContext,
            updatedContext -> this.serviceClient.getCharacterDetailsWithResponse(cookie, body, ds, updatedContext));
    }

    /**
     * Character IDs should be sent in batches of at most 40, as used by TeyvatGuide.
     * 
     * @param cookie The cookie parameter.
     * @param body The body parameter.
     * @param ds The ds parameter.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws HttpResponseException thrown if the service returns an error.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return common response wrapper returned by MiHoYo and HoYoLAB services.
     */
    @Metadata(properties = { MetadataProperties.GENERATED })
    @ServiceMethod(returns = ReturnType.SINGLE)
    public ApiResponseCharacterList getCharacterDetails(String cookie, CharacterDetailRequest body, String ds) {
        return getCharacterDetailsWithResponse(cookie, body, ds, RequestContext.none()).getValue();
    }

    /**
     * Character IDs should be sent in batches of at most 40, as used by TeyvatGuide.
     * 
     * @param cookie The cookie parameter.
     * @param body The body parameter.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws HttpResponseException thrown if the service returns an error.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return common response wrapper returned by MiHoYo and HoYoLAB services.
     */
    @Metadata(properties = { MetadataProperties.GENERATED })
    @ServiceMethod(returns = ReturnType.SINGLE)
    public ApiResponseCharacterList getCharacterDetails(String cookie, CharacterDetailRequest body) {
        final String ds = null;
        return getCharacterDetailsWithResponse(cookie, body, ds, RequestContext.none()).getValue();
    }

    /**
     * The getDailyNote operation.
     * 
     * @param cookie The cookie parameter.
     * @param server The server parameter.
     * @param roleId The roleId parameter.
     * @param ds The ds parameter.
     * @param requestContext The context to configure the HTTP request before HTTP client sends it.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws HttpResponseException thrown if the service returns an error.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return common response wrapper returned by MiHoYo and HoYoLAB services along with {@link Response}.
     */
    @Metadata(properties = { MetadataProperties.GENERATED })
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Response<ApiResponseGenshinDailyNoteData> getDailyNoteWithResponse(String cookie, String server,
        String roleId, String ds, RequestContext requestContext) {
        return this.instrumentation.instrumentWithResponse("UIGF.Mihoyo.Game.Genshin.Record.GameRecordApi.getDailyNote",
            requestContext,
            updatedContext -> this.serviceClient.getDailyNoteWithResponse(cookie, server, roleId, ds, updatedContext));
    }

    /**
     * The getDailyNote operation.
     * 
     * @param cookie The cookie parameter.
     * @param server The server parameter.
     * @param roleId The roleId parameter.
     * @param ds The ds parameter.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws HttpResponseException thrown if the service returns an error.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return common response wrapper returned by MiHoYo and HoYoLAB services.
     */
    @Metadata(properties = { MetadataProperties.GENERATED })
    @ServiceMethod(returns = ReturnType.SINGLE)
    public ApiResponseGenshinDailyNoteData getDailyNote(String cookie, String server, String roleId, String ds) {
        return getDailyNoteWithResponse(cookie, server, roleId, ds, RequestContext.none()).getValue();
    }

    /**
     * The getDailyNote operation.
     * 
     * @param cookie The cookie parameter.
     * @param server The server parameter.
     * @param roleId The roleId parameter.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws HttpResponseException thrown if the service returns an error.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return common response wrapper returned by MiHoYo and HoYoLAB services.
     */
    @Metadata(properties = { MetadataProperties.GENERATED })
    @ServiceMethod(returns = ReturnType.SINGLE)
    public ApiResponseGenshinDailyNoteData getDailyNote(String cookie, String server, String roleId) {
        final String ds = null;
        return getDailyNoteWithResponse(cookie, server, roleId, ds, RequestContext.none()).getValue();
    }

    /**
     * The getSpiralAbyss operation.
     * 
     * @param cookie The cookie parameter.
     * @param server The server parameter.
     * @param roleId The roleId parameter.
     * @param ds The ds parameter.
     * @param scheduleType The scheduleType parameter.
     * @param needDetail The needDetail parameter.
     * @param needAll The needAll parameter.
     * @param requestContext The context to configure the HTTP request before HTTP client sends it.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws HttpResponseException thrown if the service returns an error.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return common response wrapper returned by MiHoYo and HoYoLAB services along with {@link Response}.
     */
    @Metadata(properties = { MetadataProperties.GENERATED })
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Response<ApiResponseGenshinSpiralAbyssData> getSpiralAbyssWithResponse(String cookie, String server,
        String roleId, String ds, Integer scheduleType, Boolean needDetail, Boolean needAll,
        RequestContext requestContext) {
        return this.instrumentation.instrumentWithResponse(
            "UIGF.Mihoyo.Game.Genshin.Record.GameRecordApi.getSpiralAbyss", requestContext,
            updatedContext -> this.serviceClient.getSpiralAbyssWithResponse(cookie, server, roleId, ds, scheduleType,
                needDetail, needAll, updatedContext));
    }

    /**
     * The getSpiralAbyss operation.
     * 
     * @param cookie The cookie parameter.
     * @param server The server parameter.
     * @param roleId The roleId parameter.
     * @param ds The ds parameter.
     * @param scheduleType The scheduleType parameter.
     * @param needDetail The needDetail parameter.
     * @param needAll The needAll parameter.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws HttpResponseException thrown if the service returns an error.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return common response wrapper returned by MiHoYo and HoYoLAB services.
     */
    @Metadata(properties = { MetadataProperties.GENERATED })
    @ServiceMethod(returns = ReturnType.SINGLE)
    public ApiResponseGenshinSpiralAbyssData getSpiralAbyss(String cookie, String server, String roleId, String ds,
        Integer scheduleType, Boolean needDetail, Boolean needAll) {
        return getSpiralAbyssWithResponse(cookie, server, roleId, ds, scheduleType, needDetail, needAll,
            RequestContext.none()).getValue();
    }

    /**
     * The getSpiralAbyss operation.
     * 
     * @param cookie The cookie parameter.
     * @param server The server parameter.
     * @param roleId The roleId parameter.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws HttpResponseException thrown if the service returns an error.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return common response wrapper returned by MiHoYo and HoYoLAB services.
     */
    @Metadata(properties = { MetadataProperties.GENERATED })
    @ServiceMethod(returns = ReturnType.SINGLE)
    public ApiResponseGenshinSpiralAbyssData getSpiralAbyss(String cookie, String server, String roleId) {
        final String ds = null;
        final Integer scheduleType = null;
        final Boolean needDetail = null;
        final Boolean needAll = null;
        return getSpiralAbyssWithResponse(cookie, server, roleId, ds, scheduleType, needDetail, needAll,
            RequestContext.none()).getValue();
    }

    /**
     * The getImaginariumTheater operation.
     * 
     * @param cookie The cookie parameter.
     * @param server The server parameter.
     * @param roleId The roleId parameter.
     * @param ds The ds parameter.
     * @param active The active parameter.
     * @param scheduleType The scheduleType parameter.
     * @param needDetail The needDetail parameter.
     * @param needAll The needAll parameter.
     * @param requestContext The context to configure the HTTP request before HTTP client sends it.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws HttpResponseException thrown if the service returns an error.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return common response wrapper returned by MiHoYo and HoYoLAB services along with {@link Response}.
     */
    @Metadata(properties = { MetadataProperties.GENERATED })
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Response<ApiResponseGenshinTheaterData> getImaginariumTheaterWithResponse(String cookie, String server,
        String roleId, String ds, Integer active, Integer scheduleType, Boolean needDetail, Boolean needAll,
        RequestContext requestContext) {
        return this.instrumentation.instrumentWithResponse(
            "UIGF.Mihoyo.Game.Genshin.Record.GameRecordApi.getImaginariumTheater", requestContext,
            updatedContext -> this.serviceClient.getImaginariumTheaterWithResponse(cookie, server, roleId, ds, active,
                scheduleType, needDetail, needAll, updatedContext));
    }

    /**
     * The getImaginariumTheater operation.
     * 
     * @param cookie The cookie parameter.
     * @param server The server parameter.
     * @param roleId The roleId parameter.
     * @param ds The ds parameter.
     * @param active The active parameter.
     * @param scheduleType The scheduleType parameter.
     * @param needDetail The needDetail parameter.
     * @param needAll The needAll parameter.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws HttpResponseException thrown if the service returns an error.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return common response wrapper returned by MiHoYo and HoYoLAB services.
     */
    @Metadata(properties = { MetadataProperties.GENERATED })
    @ServiceMethod(returns = ReturnType.SINGLE)
    public ApiResponseGenshinTheaterData getImaginariumTheater(String cookie, String server, String roleId, String ds,
        Integer active, Integer scheduleType, Boolean needDetail, Boolean needAll) {
        return getImaginariumTheaterWithResponse(cookie, server, roleId, ds, active, scheduleType, needDetail, needAll,
            RequestContext.none()).getValue();
    }

    /**
     * The getImaginariumTheater operation.
     * 
     * @param cookie The cookie parameter.
     * @param server The server parameter.
     * @param roleId The roleId parameter.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws HttpResponseException thrown if the service returns an error.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return common response wrapper returned by MiHoYo and HoYoLAB services.
     */
    @Metadata(properties = { MetadataProperties.GENERATED })
    @ServiceMethod(returns = ReturnType.SINGLE)
    public ApiResponseGenshinTheaterData getImaginariumTheater(String cookie, String server, String roleId) {
        final String ds = null;
        final Integer active = null;
        final Integer scheduleType = null;
        final Boolean needDetail = null;
        final Boolean needAll = null;
        return getImaginariumTheaterWithResponse(cookie, server, roleId, ds, active, scheduleType, needDetail, needAll,
            RequestContext.none()).getValue();
    }

    /**
     * The getCharacterMaster operation.
     * 
     * @param cookie The cookie parameter.
     * @param server The server parameter.
     * @param roleId The roleId parameter.
     * @param ds The ds parameter.
     * @param requestContext The context to configure the HTTP request before HTTP client sends it.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws HttpResponseException thrown if the service returns an error.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return common response wrapper returned by MiHoYo and HoYoLAB services along with {@link Response}.
     */
    @Metadata(properties = { MetadataProperties.GENERATED })
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Response<ApiResponseGenshinCharacterMasterData> getCharacterMasterWithResponse(String cookie, String server,
        String roleId, String ds, RequestContext requestContext) {
        return this.instrumentation.instrumentWithResponse(
            "UIGF.Mihoyo.Game.Genshin.Record.GameRecordApi.getCharacterMaster", requestContext,
            updatedContext -> this.serviceClient.getCharacterMasterWithResponse(cookie, server, roleId, ds,
                updatedContext));
    }

    /**
     * The getCharacterMaster operation.
     * 
     * @param cookie The cookie parameter.
     * @param server The server parameter.
     * @param roleId The roleId parameter.
     * @param ds The ds parameter.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws HttpResponseException thrown if the service returns an error.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return common response wrapper returned by MiHoYo and HoYoLAB services.
     */
    @Metadata(properties = { MetadataProperties.GENERATED })
    @ServiceMethod(returns = ReturnType.SINGLE)
    public ApiResponseGenshinCharacterMasterData getCharacterMaster(String cookie, String server, String roleId,
        String ds) {
        return getCharacterMasterWithResponse(cookie, server, roleId, ds, RequestContext.none()).getValue();
    }

    /**
     * The getCharacterMaster operation.
     * 
     * @param cookie The cookie parameter.
     * @param server The server parameter.
     * @param roleId The roleId parameter.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws HttpResponseException thrown if the service returns an error.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return common response wrapper returned by MiHoYo and HoYoLAB services.
     */
    @Metadata(properties = { MetadataProperties.GENERATED })
    @ServiceMethod(returns = ReturnType.SINGLE)
    public ApiResponseGenshinCharacterMasterData getCharacterMaster(String cookie, String server, String roleId) {
        final String ds = null;
        return getCharacterMasterWithResponse(cookie, server, roleId, ds, RequestContext.none()).getValue();
    }

    /**
     * The getStygianOnslaught operation.
     * 
     * @param cookie The cookie parameter.
     * @param server The server parameter.
     * @param roleId The roleId parameter.
     * @param ds The ds parameter.
     * @param scheduleType The scheduleType parameter.
     * @param needDetail The needDetail parameter.
     * @param needAll The needAll parameter.
     * @param requestContext The context to configure the HTTP request before HTTP client sends it.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws HttpResponseException thrown if the service returns an error.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return common response wrapper returned by MiHoYo and HoYoLAB services along with {@link Response}.
     */
    @Metadata(properties = { MetadataProperties.GENERATED })
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Response<ApiResponseGenshinStygianData> getStygianOnslaughtWithResponse(String cookie, String server,
        String roleId, String ds, Integer scheduleType, Boolean needDetail, Boolean needAll,
        RequestContext requestContext) {
        return this.instrumentation.instrumentWithResponse(
            "UIGF.Mihoyo.Game.Genshin.Record.GameRecordApi.getStygianOnslaught", requestContext,
            updatedContext -> this.serviceClient.getStygianOnslaughtWithResponse(cookie, server, roleId, ds,
                scheduleType, needDetail, needAll, updatedContext));
    }

    /**
     * The getStygianOnslaught operation.
     * 
     * @param cookie The cookie parameter.
     * @param server The server parameter.
     * @param roleId The roleId parameter.
     * @param ds The ds parameter.
     * @param scheduleType The scheduleType parameter.
     * @param needDetail The needDetail parameter.
     * @param needAll The needAll parameter.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws HttpResponseException thrown if the service returns an error.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return common response wrapper returned by MiHoYo and HoYoLAB services.
     */
    @Metadata(properties = { MetadataProperties.GENERATED })
    @ServiceMethod(returns = ReturnType.SINGLE)
    public ApiResponseGenshinStygianData getStygianOnslaught(String cookie, String server, String roleId, String ds,
        Integer scheduleType, Boolean needDetail, Boolean needAll) {
        return getStygianOnslaughtWithResponse(cookie, server, roleId, ds, scheduleType, needDetail, needAll,
            RequestContext.none()).getValue();
    }

    /**
     * The getStygianOnslaught operation.
     * 
     * @param cookie The cookie parameter.
     * @param server The server parameter.
     * @param roleId The roleId parameter.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws HttpResponseException thrown if the service returns an error.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return common response wrapper returned by MiHoYo and HoYoLAB services.
     */
    @Metadata(properties = { MetadataProperties.GENERATED })
    @ServiceMethod(returns = ReturnType.SINGLE)
    public ApiResponseGenshinStygianData getStygianOnslaught(String cookie, String server, String roleId) {
        final String ds = null;
        final Integer scheduleType = null;
        final Boolean needDetail = null;
        final Boolean needAll = null;
        return getStygianOnslaughtWithResponse(cookie, server, roleId, ds, scheduleType, needDetail, needAll,
            RequestContext.none()).getValue();
    }

    /**
     * The getStygianPopularity operation.
     * 
     * @param server The server parameter.
     * @param roleId The roleId parameter.
     * @param requestContext The context to configure the HTTP request before HTTP client sends it.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws HttpResponseException thrown if the service returns an error.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return common response wrapper returned by MiHoYo and HoYoLAB services along with {@link Response}.
     */
    @Metadata(properties = { MetadataProperties.GENERATED })
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Response<ApiResponseGenshinStygianPopularityData> getStygianPopularityWithResponse(String server,
        long roleId, RequestContext requestContext) {
        return this.instrumentation.instrumentWithResponse(
            "UIGF.Mihoyo.Game.Genshin.Record.GameRecordApi.getStygianPopularity", requestContext,
            updatedContext -> this.serviceClient.getStygianPopularityWithResponse(server, roleId, updatedContext));
    }

    /**
     * The getStygianPopularity operation.
     * 
     * @param server The server parameter.
     * @param roleId The roleId parameter.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws HttpResponseException thrown if the service returns an error.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return common response wrapper returned by MiHoYo and HoYoLAB services.
     */
    @Metadata(properties = { MetadataProperties.GENERATED })
    @ServiceMethod(returns = ReturnType.SINGLE)
    public ApiResponseGenshinStygianPopularityData getStygianPopularity(String server, long roleId) {
        return getStygianPopularityWithResponse(server, roleId, RequestContext.none()).getValue();
    }

    /**
     * The getActivityCalendar operation.
     * 
     * @param cookie The cookie parameter.
     * @param body The body parameter.
     * @param ds The ds parameter.
     * @param challenge The challenge parameter.
     * @param requestContext The context to configure the HTTP request before HTTP client sends it.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws HttpResponseException thrown if the service returns an error.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return common response wrapper returned by MiHoYo and HoYoLAB services along with {@link Response}.
     */
    @Metadata(properties = { MetadataProperties.GENERATED })
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Response<ApiResponseGenshinActivityCalendarData> getActivityCalendarWithResponse(String cookie,
        CharacterListRequest body, String ds, String challenge, RequestContext requestContext) {
        return this.instrumentation.instrumentWithResponse(
            "UIGF.Mihoyo.Game.Genshin.Record.GameRecordApi.getActivityCalendar", requestContext,
            updatedContext -> this.serviceClient.getActivityCalendarWithResponse(cookie, body, ds, challenge,
                updatedContext));
    }

    /**
     * The getActivityCalendar operation.
     * 
     * @param cookie The cookie parameter.
     * @param body The body parameter.
     * @param ds The ds parameter.
     * @param challenge The challenge parameter.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws HttpResponseException thrown if the service returns an error.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return common response wrapper returned by MiHoYo and HoYoLAB services.
     */
    @Metadata(properties = { MetadataProperties.GENERATED })
    @ServiceMethod(returns = ReturnType.SINGLE)
    public ApiResponseGenshinActivityCalendarData getActivityCalendar(String cookie, CharacterListRequest body,
        String ds, String challenge) {
        return getActivityCalendarWithResponse(cookie, body, ds, challenge, RequestContext.none()).getValue();
    }

    /**
     * The getActivityCalendar operation.
     * 
     * @param cookie The cookie parameter.
     * @param body The body parameter.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws HttpResponseException thrown if the service returns an error.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return common response wrapper returned by MiHoYo and HoYoLAB services.
     */
    @Metadata(properties = { MetadataProperties.GENERATED })
    @ServiceMethod(returns = ReturnType.SINGLE)
    public ApiResponseGenshinActivityCalendarData getActivityCalendar(String cookie, CharacterListRequest body) {
        final String ds = null;
        final String challenge = null;
        return getActivityCalendarWithResponse(cookie, body, ds, challenge, RequestContext.none()).getValue();
    }

    /**
     * The getCharacterTps operation.
     * 
     * @param cookie The cookie parameter.
     * @param server The server parameter.
     * @param roleId The roleId parameter.
     * @param ds The ds parameter.
     * @param requestContext The context to configure the HTTP request before HTTP client sends it.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws HttpResponseException thrown if the service returns an error.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return common response wrapper returned by MiHoYo and HoYoLAB services along with {@link Response}.
     */
    @Metadata(properties = { MetadataProperties.GENERATED })
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Response<ApiResponseJsonObject> getCharacterTpsWithResponse(String cookie, String server, String roleId,
        String ds, RequestContext requestContext) {
        return this.instrumentation.instrumentWithResponse(
            "UIGF.Mihoyo.Game.Genshin.Record.GameRecordApi.getCharacterTps", requestContext,
            updatedContext -> this.serviceClient.getCharacterTpsWithResponse(cookie, server, roleId, ds,
                updatedContext));
    }

    /**
     * The getCharacterTps operation.
     * 
     * @param cookie The cookie parameter.
     * @param server The server parameter.
     * @param roleId The roleId parameter.
     * @param ds The ds parameter.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws HttpResponseException thrown if the service returns an error.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return common response wrapper returned by MiHoYo and HoYoLAB services.
     */
    @Metadata(properties = { MetadataProperties.GENERATED })
    @ServiceMethod(returns = ReturnType.SINGLE)
    public ApiResponseJsonObject getCharacterTps(String cookie, String server, String roleId, String ds) {
        return getCharacterTpsWithResponse(cookie, server, roleId, ds, RequestContext.none()).getValue();
    }

    /**
     * The getCharacterTps operation.
     * 
     * @param cookie The cookie parameter.
     * @param server The server parameter.
     * @param roleId The roleId parameter.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws HttpResponseException thrown if the service returns an error.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return common response wrapper returned by MiHoYo and HoYoLAB services.
     */
    @Metadata(properties = { MetadataProperties.GENERATED })
    @ServiceMethod(returns = ReturnType.SINGLE)
    public ApiResponseJsonObject getCharacterTps(String cookie, String server, String roleId) {
        final String ds = null;
        return getCharacterTpsWithResponse(cookie, server, roleId, ds, RequestContext.none()).getValue();
    }

    /**
     * The getExternalContent operation.
     * 
     * @param cookie The cookie parameter.
     * @param itemId The itemId parameter.
     * @param itemType The itemType parameter.
     * @param ds The ds parameter.
     * @param requestContext The context to configure the HTTP request before HTTP client sends it.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws HttpResponseException thrown if the service returns an error.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return common response wrapper returned by MiHoYo and HoYoLAB services along with {@link Response}.
     */
    @Metadata(properties = { MetadataProperties.GENERATED })
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Response<ApiResponseGenshinExternalContentData> getExternalContentWithResponse(String cookie, long itemId,
        int itemType, String ds, RequestContext requestContext) {
        return this.instrumentation.instrumentWithResponse(
            "UIGF.Mihoyo.Game.Genshin.Record.GameRecordApi.getExternalContent", requestContext,
            updatedContext -> this.serviceClient.getExternalContentWithResponse(cookie, itemId, itemType, ds,
                updatedContext));
    }

    /**
     * The getExternalContent operation.
     * 
     * @param cookie The cookie parameter.
     * @param itemId The itemId parameter.
     * @param itemType The itemType parameter.
     * @param ds The ds parameter.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws HttpResponseException thrown if the service returns an error.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return common response wrapper returned by MiHoYo and HoYoLAB services.
     */
    @Metadata(properties = { MetadataProperties.GENERATED })
    @ServiceMethod(returns = ReturnType.SINGLE)
    public ApiResponseGenshinExternalContentData getExternalContent(String cookie, long itemId, int itemType,
        String ds) {
        return getExternalContentWithResponse(cookie, itemId, itemType, ds, RequestContext.none()).getValue();
    }

    /**
     * The getExternalContent operation.
     * 
     * @param cookie The cookie parameter.
     * @param itemId The itemId parameter.
     * @param itemType The itemType parameter.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws HttpResponseException thrown if the service returns an error.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return common response wrapper returned by MiHoYo and HoYoLAB services.
     */
    @Metadata(properties = { MetadataProperties.GENERATED })
    @ServiceMethod(returns = ReturnType.SINGLE)
    public ApiResponseGenshinExternalContentData getExternalContent(String cookie, long itemId, int itemType) {
        final String ds = null;
        return getExternalContentWithResponse(cookie, itemId, itemType, ds, RequestContext.none()).getValue();
    }

    /**
     * The getRoleBasicInfo operation.
     * 
     * @param cookie The cookie parameter.
     * @param roleId The roleId parameter.
     * @param server The server parameter.
     * @param ds The ds parameter.
     * @param requestContext The context to configure the HTTP request before HTTP client sends it.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws HttpResponseException thrown if the service returns an error.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return common response wrapper returned by MiHoYo and HoYoLAB services along with {@link Response}.
     */
    @Metadata(properties = { MetadataProperties.GENERATED })
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Response<ApiResponseGenshinRoleBasicInfoData> getRoleBasicInfoWithResponse(String cookie, String roleId,
        String server, String ds, RequestContext requestContext) {
        return this.instrumentation.instrumentWithResponse(
            "UIGF.Mihoyo.Game.Genshin.Record.GameRecordApi.getRoleBasicInfo", requestContext,
            updatedContext -> this.serviceClient.getRoleBasicInfoWithResponse(cookie, roleId, server, ds,
                updatedContext));
    }

    /**
     * The getRoleBasicInfo operation.
     * 
     * @param cookie The cookie parameter.
     * @param roleId The roleId parameter.
     * @param server The server parameter.
     * @param ds The ds parameter.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws HttpResponseException thrown if the service returns an error.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return common response wrapper returned by MiHoYo and HoYoLAB services.
     */
    @Metadata(properties = { MetadataProperties.GENERATED })
    @ServiceMethod(returns = ReturnType.SINGLE)
    public ApiResponseGenshinRoleBasicInfoData getRoleBasicInfo(String cookie, String roleId, String server,
        String ds) {
        return getRoleBasicInfoWithResponse(cookie, roleId, server, ds, RequestContext.none()).getValue();
    }

    /**
     * The getRoleBasicInfo operation.
     * 
     * @param cookie The cookie parameter.
     * @param roleId The roleId parameter.
     * @param server The server parameter.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws HttpResponseException thrown if the service returns an error.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return common response wrapper returned by MiHoYo and HoYoLAB services.
     */
    @Metadata(properties = { MetadataProperties.GENERATED })
    @ServiceMethod(returns = ReturnType.SINGLE)
    public ApiResponseGenshinRoleBasicInfoData getRoleBasicInfo(String cookie, String roleId, String server) {
        final String ds = null;
        return getRoleBasicInfoWithResponse(cookie, roleId, server, ds, RequestContext.none()).getValue();
    }

    /**
     * The getTool operation.
     * 
     * @param cookie The cookie parameter.
     * @param ds The ds parameter.
     * @param challenge The challenge parameter.
     * @param requestContext The context to configure the HTTP request before HTTP client sends it.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws HttpResponseException thrown if the service returns an error.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return common response wrapper returned by MiHoYo and HoYoLAB services along with {@link Response}.
     */
    @Metadata(properties = { MetadataProperties.GENERATED })
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Response<ApiResponseGenshinToolData> getToolWithResponse(String cookie, String ds, String challenge,
        RequestContext requestContext) {
        return this.instrumentation.instrumentWithResponse("UIGF.Mihoyo.Game.Genshin.Record.GameRecordApi.getTool",
            requestContext,
            updatedContext -> this.serviceClient.getToolWithResponse(cookie, ds, challenge, updatedContext));
    }

    /**
     * The getTool operation.
     * 
     * @param cookie The cookie parameter.
     * @param ds The ds parameter.
     * @param challenge The challenge parameter.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws HttpResponseException thrown if the service returns an error.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return common response wrapper returned by MiHoYo and HoYoLAB services.
     */
    @Metadata(properties = { MetadataProperties.GENERATED })
    @ServiceMethod(returns = ReturnType.SINGLE)
    public ApiResponseGenshinToolData getTool(String cookie, String ds, String challenge) {
        return getToolWithResponse(cookie, ds, challenge, RequestContext.none()).getValue();
    }

    /**
     * The getTool operation.
     * 
     * @param cookie The cookie parameter.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws HttpResponseException thrown if the service returns an error.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return common response wrapper returned by MiHoYo and HoYoLAB services.
     */
    @Metadata(properties = { MetadataProperties.GENERATED })
    @ServiceMethod(returns = ReturnType.SINGLE)
    public ApiResponseGenshinToolData getTool(String cookie) {
        final String ds = null;
        final String challenge = null;
        return getToolWithResponse(cookie, ds, challenge, RequestContext.none()).getValue();
    }
}
