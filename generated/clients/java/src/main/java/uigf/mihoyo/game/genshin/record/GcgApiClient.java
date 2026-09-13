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
import uigf.mihoyo.ApiResponseGcgBasicInfoData;
import uigf.mihoyo.ApiResponseGcgCardBackListData;
import uigf.mihoyo.ApiResponseGcgCardListData;
import uigf.mihoyo.ApiResponseGcgChallengeRecordData;
import uigf.mihoyo.ApiResponseGcgChallengeScheduleData;
import uigf.mihoyo.ApiResponseGcgCoversData;
import uigf.mihoyo.ApiResponseGcgDeckListData;
import uigf.mihoyo.ApiResponseGcgMatchListData;
import uigf.mihoyo.checkin.implementation.GcgApisImpl;

/**
 * Initializes a new instance of the synchronous RecordClient type.
 */
@ServiceClient(builder = RecordClientBuilder.class)
public final class GcgApiClient {
    @Metadata(properties = { MetadataProperties.GENERATED })
    private final GcgApisImpl serviceClient;

    private final Instrumentation instrumentation;

    /**
     * Initializes an instance of GcgApiClient class.
     * 
     * @param serviceClient the service client implementation.
     * @param instrumentation the instrumentation instance.
     */
    @Metadata(properties = { MetadataProperties.GENERATED })
    GcgApiClient(GcgApisImpl serviceClient, Instrumentation instrumentation) {
        this.serviceClient = serviceClient;
        this.instrumentation = instrumentation;
    }

    /**
     * The getBasicInfo operation.
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
    public Response<ApiResponseGcgBasicInfoData> getBasicInfoWithResponse(String cookie, String roleId, String server,
        String ds, RequestContext requestContext) {
        return this.instrumentation.instrumentWithResponse("UIGF.Mihoyo.Game.Genshin.Record.GcgApi.getBasicInfo",
            requestContext,
            updatedContext -> this.serviceClient.getBasicInfoWithResponse(cookie, roleId, server, ds, updatedContext));
    }

    /**
     * The getBasicInfo operation.
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
    public ApiResponseGcgBasicInfoData getBasicInfo(String cookie, String roleId, String server, String ds) {
        return getBasicInfoWithResponse(cookie, roleId, server, ds, RequestContext.none()).getValue();
    }

    /**
     * The getBasicInfo operation.
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
    public ApiResponseGcgBasicInfoData getBasicInfo(String cookie, String roleId, String server) {
        final String ds = null;
        return getBasicInfoWithResponse(cookie, roleId, server, ds, RequestContext.none()).getValue();
    }

    /**
     * The getCardBackList operation.
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
    public Response<ApiResponseGcgCardBackListData> getCardBackListWithResponse(String cookie, String roleId,
        String server, String ds, RequestContext requestContext) {
        return this.instrumentation.instrumentWithResponse("UIGF.Mihoyo.Game.Genshin.Record.GcgApi.getCardBackList",
            requestContext, updatedContext -> this.serviceClient.getCardBackListWithResponse(cookie, roleId, server, ds,
                updatedContext));
    }

    /**
     * The getCardBackList operation.
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
    public ApiResponseGcgCardBackListData getCardBackList(String cookie, String roleId, String server, String ds) {
        return getCardBackListWithResponse(cookie, roleId, server, ds, RequestContext.none()).getValue();
    }

    /**
     * The getCardBackList operation.
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
    public ApiResponseGcgCardBackListData getCardBackList(String cookie, String roleId, String server) {
        final String ds = null;
        return getCardBackListWithResponse(cookie, roleId, server, ds, RequestContext.none()).getValue();
    }

    /**
     * The getCardList operation.
     * 
     * @param cookie The cookie parameter.
     * @param limit The limit parameter.
     * @param needAction The needAction parameter.
     * @param needAvatar The needAvatar parameter.
     * @param needStats The needStats parameter.
     * @param offset The offset parameter.
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
    public Response<ApiResponseGcgCardListData> getCardListWithResponse(String cookie, int limit, boolean needAction,
        boolean needAvatar, boolean needStats, int offset, String roleId, String server, String ds,
        RequestContext requestContext) {
        return this.instrumentation.instrumentWithResponse("UIGF.Mihoyo.Game.Genshin.Record.GcgApi.getCardList",
            requestContext, updatedContext -> this.serviceClient.getCardListWithResponse(cookie, limit, needAction,
                needAvatar, needStats, offset, roleId, server, ds, updatedContext));
    }

    /**
     * The getCardList operation.
     * 
     * @param cookie The cookie parameter.
     * @param limit The limit parameter.
     * @param needAction The needAction parameter.
     * @param needAvatar The needAvatar parameter.
     * @param needStats The needStats parameter.
     * @param offset The offset parameter.
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
    public ApiResponseGcgCardListData getCardList(String cookie, int limit, boolean needAction, boolean needAvatar,
        boolean needStats, int offset, String roleId, String server, String ds) {
        return getCardListWithResponse(cookie, limit, needAction, needAvatar, needStats, offset, roleId, server, ds,
            RequestContext.none()).getValue();
    }

    /**
     * The getCardList operation.
     * 
     * @param cookie The cookie parameter.
     * @param limit The limit parameter.
     * @param needAction The needAction parameter.
     * @param needAvatar The needAvatar parameter.
     * @param needStats The needStats parameter.
     * @param offset The offset parameter.
     * @param roleId The roleId parameter.
     * @param server The server parameter.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws HttpResponseException thrown if the service returns an error.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return common response wrapper returned by MiHoYo and HoYoLAB services.
     */
    @Metadata(properties = { MetadataProperties.GENERATED })
    @ServiceMethod(returns = ReturnType.SINGLE)
    public ApiResponseGcgCardListData getCardList(String cookie, int limit, boolean needAction, boolean needAvatar,
        boolean needStats, int offset, String roleId, String server) {
        final String ds = null;
        return getCardListWithResponse(cookie, limit, needAction, needAvatar, needStats, offset, roleId, server, ds,
            RequestContext.none()).getValue();
    }

    /**
     * The getChallengeRecord operation.
     * 
     * @param cookie The cookie parameter.
     * @param scheduleId The scheduleId parameter.
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
    public Response<ApiResponseGcgChallengeRecordData> getChallengeRecordWithResponse(String cookie, long scheduleId,
        String roleId, String server, String ds, RequestContext requestContext) {
        return this.instrumentation.instrumentWithResponse("UIGF.Mihoyo.Game.Genshin.Record.GcgApi.getChallengeRecord",
            requestContext, updatedContext -> this.serviceClient.getChallengeRecordWithResponse(cookie, scheduleId,
                roleId, server, ds, updatedContext));
    }

    /**
     * The getChallengeRecord operation.
     * 
     * @param cookie The cookie parameter.
     * @param scheduleId The scheduleId parameter.
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
    public ApiResponseGcgChallengeRecordData getChallengeRecord(String cookie, long scheduleId, String roleId,
        String server, String ds) {
        return getChallengeRecordWithResponse(cookie, scheduleId, roleId, server, ds, RequestContext.none()).getValue();
    }

    /**
     * The getChallengeRecord operation.
     * 
     * @param cookie The cookie parameter.
     * @param scheduleId The scheduleId parameter.
     * @param roleId The roleId parameter.
     * @param server The server parameter.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws HttpResponseException thrown if the service returns an error.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return common response wrapper returned by MiHoYo and HoYoLAB services.
     */
    @Metadata(properties = { MetadataProperties.GENERATED })
    @ServiceMethod(returns = ReturnType.SINGLE)
    public ApiResponseGcgChallengeRecordData getChallengeRecord(String cookie, long scheduleId, String roleId,
        String server) {
        final String ds = null;
        return getChallengeRecordWithResponse(cookie, scheduleId, roleId, server, ds, RequestContext.none()).getValue();
    }

    /**
     * The getChallengeSchedule operation.
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
    public Response<ApiResponseGcgChallengeScheduleData> getChallengeScheduleWithResponse(String cookie, String roleId,
        String server, String ds, RequestContext requestContext) {
        return this.instrumentation.instrumentWithResponse(
            "UIGF.Mihoyo.Game.Genshin.Record.GcgApi.getChallengeSchedule", requestContext,
            updatedContext -> this.serviceClient.getChallengeScheduleWithResponse(cookie, roleId, server, ds,
                updatedContext));
    }

    /**
     * The getChallengeSchedule operation.
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
    public ApiResponseGcgChallengeScheduleData getChallengeSchedule(String cookie, String roleId, String server,
        String ds) {
        return getChallengeScheduleWithResponse(cookie, roleId, server, ds, RequestContext.none()).getValue();
    }

    /**
     * The getChallengeSchedule operation.
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
    public ApiResponseGcgChallengeScheduleData getChallengeSchedule(String cookie, String roleId, String server) {
        final String ds = null;
        return getChallengeScheduleWithResponse(cookie, roleId, server, ds, RequestContext.none()).getValue();
    }

    /**
     * The getDeckList operation.
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
    public Response<ApiResponseGcgDeckListData> getDeckListWithResponse(String cookie, String roleId, String server,
        String ds, RequestContext requestContext) {
        return this.instrumentation.instrumentWithResponse("UIGF.Mihoyo.Game.Genshin.Record.GcgApi.getDeckList",
            requestContext,
            updatedContext -> this.serviceClient.getDeckListWithResponse(cookie, roleId, server, ds, updatedContext));
    }

    /**
     * The getDeckList operation.
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
    public ApiResponseGcgDeckListData getDeckList(String cookie, String roleId, String server, String ds) {
        return getDeckListWithResponse(cookie, roleId, server, ds, RequestContext.none()).getValue();
    }

    /**
     * The getDeckList operation.
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
    public ApiResponseGcgDeckListData getDeckList(String cookie, String roleId, String server) {
        final String ds = null;
        return getDeckListWithResponse(cookie, roleId, server, ds, RequestContext.none()).getValue();
    }

    /**
     * The getCovers operation.
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
    public Response<ApiResponseGcgCoversData> getCoversWithResponse(String cookie, String roleId, String server,
        String ds, RequestContext requestContext) {
        return this.instrumentation.instrumentWithResponse("UIGF.Mihoyo.Game.Genshin.Record.GcgApi.getCovers",
            requestContext,
            updatedContext -> this.serviceClient.getCoversWithResponse(cookie, roleId, server, ds, updatedContext));
    }

    /**
     * The getCovers operation.
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
    public ApiResponseGcgCoversData getCovers(String cookie, String roleId, String server, String ds) {
        return getCoversWithResponse(cookie, roleId, server, ds, RequestContext.none()).getValue();
    }

    /**
     * The getCovers operation.
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
    public ApiResponseGcgCoversData getCovers(String cookie, String roleId, String server) {
        final String ds = null;
        return getCoversWithResponse(cookie, roleId, server, ds, RequestContext.none()).getValue();
    }

    /**
     * The getMatchList operation.
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
    public Response<ApiResponseGcgMatchListData> getMatchListWithResponse(String cookie, String roleId, String server,
        String ds, RequestContext requestContext) {
        return this.instrumentation.instrumentWithResponse("UIGF.Mihoyo.Game.Genshin.Record.GcgApi.getMatchList",
            requestContext,
            updatedContext -> this.serviceClient.getMatchListWithResponse(cookie, roleId, server, ds, updatedContext));
    }

    /**
     * The getMatchList operation.
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
    public ApiResponseGcgMatchListData getMatchList(String cookie, String roleId, String server, String ds) {
        return getMatchListWithResponse(cookie, roleId, server, ds, RequestContext.none()).getValue();
    }

    /**
     * The getMatchList operation.
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
    public ApiResponseGcgMatchListData getMatchList(String cookie, String roleId, String server) {
        final String ds = null;
        return getMatchListWithResponse(cookie, roleId, server, ds, RequestContext.none()).getValue();
    }
}
