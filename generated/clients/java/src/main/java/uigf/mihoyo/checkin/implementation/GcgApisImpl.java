package uigf.mihoyo.checkin.implementation;

import io.clientcore.core.annotations.ReturnType;
import io.clientcore.core.annotations.ServiceInterface;
import io.clientcore.core.annotations.ServiceMethod;
import io.clientcore.core.http.annotations.HeaderParam;
import io.clientcore.core.http.annotations.HostParam;
import io.clientcore.core.http.annotations.HttpRequestInformation;
import io.clientcore.core.http.annotations.QueryParam;
import io.clientcore.core.http.annotations.UnexpectedResponseExceptionDetail;
import io.clientcore.core.http.models.HttpMethod;
import io.clientcore.core.http.models.HttpResponseException;
import io.clientcore.core.http.models.RequestContext;
import io.clientcore.core.http.models.Response;
import io.clientcore.core.http.pipeline.HttpPipeline;
import io.clientcore.core.instrumentation.Instrumentation;
import java.lang.reflect.InvocationTargetException;
import uigf.mihoyo.ApiResponseGcgBasicInfoData;
import uigf.mihoyo.ApiResponseGcgCardBackListData;
import uigf.mihoyo.ApiResponseGcgCardListData;
import uigf.mihoyo.ApiResponseGcgChallengeRecordData;
import uigf.mihoyo.ApiResponseGcgChallengeScheduleData;
import uigf.mihoyo.ApiResponseGcgCoversData;
import uigf.mihoyo.ApiResponseGcgDeckListData;
import uigf.mihoyo.ApiResponseGcgMatchListData;

/**
 * An instance of this class provides access to all the operations defined in GcgApis.
 */
public final class GcgApisImpl {
    /**
     * The proxy service used to perform REST calls.
     */
    private final GcgApisService service;

    /**
     * The service client containing this operation class.
     */
    private final RecordClientImpl client;

    /**
     * The instance of instrumentation to report telemetry.
     */
    private final Instrumentation instrumentation;

    /**
     * Initializes an instance of GcgApisImpl.
     * 
     * @param client the instance of the service client containing this operation class.
     */
    GcgApisImpl(RecordClientImpl client) {
        this.service = GcgApisService.getNewInstance(client.getHttpPipeline());
        this.client = client;
        this.instrumentation = client.getInstrumentation();
    }

    /**
     * The interface defining all the services for RecordClientGcgApis to be used by the proxy service to perform REST
     * calls.
     */
    @ServiceInterface(name = "RecordClientGcgApis", host = "{endpoint}")
    public interface GcgApisService {
        static GcgApisService getNewInstance(HttpPipeline pipeline) {
            try {
                Class<?> clazz = Class.forName("uigf.mihoyo.checkin.implementation.GcgApisServiceImpl");
                return (GcgApisService) clazz.getMethod("getNewInstance", HttpPipeline.class).invoke(null, pipeline);
            } catch (ClassNotFoundException | NoSuchMethodException | IllegalAccessException
                | InvocationTargetException e) {
                throw new RuntimeException(e);
            }

        }

        @HttpRequestInformation(
            method = HttpMethod.GET,
            path = "/game_record/app/genshin/api/gcg/basicInfo",
            expectedStatusCodes = { 200 })
        @UnexpectedResponseExceptionDetail
        Response<ApiResponseGcgBasicInfoData> getBasicInfo(@HostParam("endpoint") String endpoint,
            @HeaderParam("Cookie") String cookie, @HeaderParam("DS") String ds, @QueryParam("role_id") String roleId,
            @QueryParam("server") String server, @HeaderParam("Accept") String accept, RequestContext requestContext);

        @HttpRequestInformation(
            method = HttpMethod.GET,
            path = "/game_record/app/genshin/api/gcg/cardBackList",
            expectedStatusCodes = { 200 })
        @UnexpectedResponseExceptionDetail
        Response<ApiResponseGcgCardBackListData> getCardBackList(@HostParam("endpoint") String endpoint,
            @HeaderParam("Cookie") String cookie, @HeaderParam("DS") String ds, @QueryParam("role_id") String roleId,
            @QueryParam("server") String server, @HeaderParam("Accept") String accept, RequestContext requestContext);

        @HttpRequestInformation(
            method = HttpMethod.GET,
            path = "/game_record/app/genshin/api/gcg/cardList",
            expectedStatusCodes = { 200 })
        @UnexpectedResponseExceptionDetail
        Response<ApiResponseGcgCardListData> getCardList(@HostParam("endpoint") String endpoint,
            @HeaderParam("Cookie") String cookie, @HeaderParam("DS") String ds, @QueryParam("limit") int limit,
            @QueryParam("need_action") boolean needAction, @QueryParam("need_avatar") boolean needAvatar,
            @QueryParam("need_stats") boolean needStats, @QueryParam("offset") int offset,
            @QueryParam("role_id") String roleId, @QueryParam("server") String server,
            @HeaderParam("Accept") String accept, RequestContext requestContext);

        @HttpRequestInformation(
            method = HttpMethod.GET,
            path = "/game_record/app/genshin/api/gcg/challenge/record",
            expectedStatusCodes = { 200 })
        @UnexpectedResponseExceptionDetail
        Response<ApiResponseGcgChallengeRecordData> getChallengeRecord(@HostParam("endpoint") String endpoint,
            @HeaderParam("Cookie") String cookie, @HeaderParam("DS") String ds,
            @QueryParam("schedule_id") long scheduleId, @QueryParam("role_id") String roleId,
            @QueryParam("server") String server, @HeaderParam("Accept") String accept, RequestContext requestContext);

        @HttpRequestInformation(
            method = HttpMethod.GET,
            path = "/game_record/app/genshin/api/gcg/challenge/schedule",
            expectedStatusCodes = { 200 })
        @UnexpectedResponseExceptionDetail
        Response<ApiResponseGcgChallengeScheduleData> getChallengeSchedule(@HostParam("endpoint") String endpoint,
            @HeaderParam("Cookie") String cookie, @HeaderParam("DS") String ds, @QueryParam("role_id") String roleId,
            @QueryParam("server") String server, @HeaderParam("Accept") String accept, RequestContext requestContext);

        @HttpRequestInformation(
            method = HttpMethod.GET,
            path = "/game_record/app/genshin/api/gcg/deckList",
            expectedStatusCodes = { 200 })
        @UnexpectedResponseExceptionDetail
        Response<ApiResponseGcgDeckListData> getDeckList(@HostParam("endpoint") String endpoint,
            @HeaderParam("Cookie") String cookie, @HeaderParam("DS") String ds, @QueryParam("role_id") String roleId,
            @QueryParam("server") String server, @HeaderParam("Accept") String accept, RequestContext requestContext);

        @HttpRequestInformation(
            method = HttpMethod.GET,
            path = "/game_record/app/genshin/api/gcg/getGCGCovers",
            expectedStatusCodes = { 200 })
        @UnexpectedResponseExceptionDetail
        Response<ApiResponseGcgCoversData> getCovers(@HostParam("endpoint") String endpoint,
            @HeaderParam("Cookie") String cookie, @HeaderParam("DS") String ds, @QueryParam("role_id") String roleId,
            @QueryParam("server") String server, @HeaderParam("Accept") String accept, RequestContext requestContext);

        @HttpRequestInformation(
            method = HttpMethod.GET,
            path = "/game_record/app/genshin/api/gcg/matchList",
            expectedStatusCodes = { 200 })
        @UnexpectedResponseExceptionDetail
        Response<ApiResponseGcgMatchListData> getMatchList(@HostParam("endpoint") String endpoint,
            @HeaderParam("Cookie") String cookie, @HeaderParam("DS") String ds, @QueryParam("role_id") String roleId,
            @QueryParam("server") String server, @HeaderParam("Accept") String accept, RequestContext requestContext);
    }

    /**
     * The getBasicInfo operation.
     * 
     * @param cookie The cookie parameter.
     * @param ds The ds parameter.
     * @param roleId The roleId parameter.
     * @param server The server parameter.
     * @param requestContext The context to configure the HTTP request before HTTP client sends it.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws HttpResponseException thrown if the service returns an error.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return common response wrapper returned by MiHoYo and HoYoLAB services along with {@link Response}.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Response<ApiResponseGcgBasicInfoData> getBasicInfoWithResponse(String cookie, String ds, String roleId,
        String server, RequestContext requestContext) {
        return this.instrumentation.instrumentWithResponse("UIGF.Mihoyo.Game.Genshin.Record.GcgApi.getBasicInfo",
            requestContext, updatedContext -> {
                final String accept = "application/json";
                return service.getBasicInfo(this.client.getEndpoint(), cookie, ds, roleId, server, accept,
                    updatedContext);
            });
    }

    /**
     * The getCardBackList operation.
     * 
     * @param cookie The cookie parameter.
     * @param ds The ds parameter.
     * @param roleId The roleId parameter.
     * @param server The server parameter.
     * @param requestContext The context to configure the HTTP request before HTTP client sends it.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws HttpResponseException thrown if the service returns an error.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return common response wrapper returned by MiHoYo and HoYoLAB services along with {@link Response}.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Response<ApiResponseGcgCardBackListData> getCardBackListWithResponse(String cookie, String ds, String roleId,
        String server, RequestContext requestContext) {
        return this.instrumentation.instrumentWithResponse("UIGF.Mihoyo.Game.Genshin.Record.GcgApi.getCardBackList",
            requestContext, updatedContext -> {
                final String accept = "application/json";
                return service.getCardBackList(this.client.getEndpoint(), cookie, ds, roleId, server, accept,
                    updatedContext);
            });
    }

    /**
     * The getCardList operation.
     * 
     * @param cookie The cookie parameter.
     * @param ds The ds parameter.
     * @param limit The limit parameter.
     * @param needAction The needAction parameter.
     * @param needAvatar The needAvatar parameter.
     * @param needStats The needStats parameter.
     * @param offset The offset parameter.
     * @param roleId The roleId parameter.
     * @param server The server parameter.
     * @param requestContext The context to configure the HTTP request before HTTP client sends it.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws HttpResponseException thrown if the service returns an error.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return common response wrapper returned by MiHoYo and HoYoLAB services along with {@link Response}.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Response<ApiResponseGcgCardListData> getCardListWithResponse(String cookie, String ds, int limit,
        boolean needAction, boolean needAvatar, boolean needStats, int offset, String roleId, String server,
        RequestContext requestContext) {
        return this.instrumentation.instrumentWithResponse("UIGF.Mihoyo.Game.Genshin.Record.GcgApi.getCardList",
            requestContext, updatedContext -> {
                final String accept = "application/json";
                return service.getCardList(this.client.getEndpoint(), cookie, ds, limit, needAction, needAvatar,
                    needStats, offset, roleId, server, accept, updatedContext);
            });
    }

    /**
     * The getChallengeRecord operation.
     * 
     * @param cookie The cookie parameter.
     * @param ds The ds parameter.
     * @param scheduleId The scheduleId parameter.
     * @param roleId The roleId parameter.
     * @param server The server parameter.
     * @param requestContext The context to configure the HTTP request before HTTP client sends it.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws HttpResponseException thrown if the service returns an error.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return common response wrapper returned by MiHoYo and HoYoLAB services along with {@link Response}.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Response<ApiResponseGcgChallengeRecordData> getChallengeRecordWithResponse(String cookie, String ds,
        long scheduleId, String roleId, String server, RequestContext requestContext) {
        return this.instrumentation.instrumentWithResponse("UIGF.Mihoyo.Game.Genshin.Record.GcgApi.getChallengeRecord",
            requestContext, updatedContext -> {
                final String accept = "application/json";
                return service.getChallengeRecord(this.client.getEndpoint(), cookie, ds, scheduleId, roleId, server,
                    accept, updatedContext);
            });
    }

    /**
     * The getChallengeSchedule operation.
     * 
     * @param cookie The cookie parameter.
     * @param ds The ds parameter.
     * @param roleId The roleId parameter.
     * @param server The server parameter.
     * @param requestContext The context to configure the HTTP request before HTTP client sends it.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws HttpResponseException thrown if the service returns an error.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return common response wrapper returned by MiHoYo and HoYoLAB services along with {@link Response}.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Response<ApiResponseGcgChallengeScheduleData> getChallengeScheduleWithResponse(String cookie, String ds,
        String roleId, String server, RequestContext requestContext) {
        return this.instrumentation.instrumentWithResponse(
            "UIGF.Mihoyo.Game.Genshin.Record.GcgApi.getChallengeSchedule", requestContext, updatedContext -> {
                final String accept = "application/json";
                return service.getChallengeSchedule(this.client.getEndpoint(), cookie, ds, roleId, server, accept,
                    updatedContext);
            });
    }

    /**
     * The getDeckList operation.
     * 
     * @param cookie The cookie parameter.
     * @param ds The ds parameter.
     * @param roleId The roleId parameter.
     * @param server The server parameter.
     * @param requestContext The context to configure the HTTP request before HTTP client sends it.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws HttpResponseException thrown if the service returns an error.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return common response wrapper returned by MiHoYo and HoYoLAB services along with {@link Response}.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Response<ApiResponseGcgDeckListData> getDeckListWithResponse(String cookie, String ds, String roleId,
        String server, RequestContext requestContext) {
        return this.instrumentation.instrumentWithResponse("UIGF.Mihoyo.Game.Genshin.Record.GcgApi.getDeckList",
            requestContext, updatedContext -> {
                final String accept = "application/json";
                return service.getDeckList(this.client.getEndpoint(), cookie, ds, roleId, server, accept,
                    updatedContext);
            });
    }

    /**
     * The getCovers operation.
     * 
     * @param cookie The cookie parameter.
     * @param ds The ds parameter.
     * @param roleId The roleId parameter.
     * @param server The server parameter.
     * @param requestContext The context to configure the HTTP request before HTTP client sends it.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws HttpResponseException thrown if the service returns an error.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return common response wrapper returned by MiHoYo and HoYoLAB services along with {@link Response}.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Response<ApiResponseGcgCoversData> getCoversWithResponse(String cookie, String ds, String roleId,
        String server, RequestContext requestContext) {
        return this.instrumentation.instrumentWithResponse("UIGF.Mihoyo.Game.Genshin.Record.GcgApi.getCovers",
            requestContext, updatedContext -> {
                final String accept = "application/json";
                return service.getCovers(this.client.getEndpoint(), cookie, ds, roleId, server, accept, updatedContext);
            });
    }

    /**
     * The getMatchList operation.
     * 
     * @param cookie The cookie parameter.
     * @param ds The ds parameter.
     * @param roleId The roleId parameter.
     * @param server The server parameter.
     * @param requestContext The context to configure the HTTP request before HTTP client sends it.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws HttpResponseException thrown if the service returns an error.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return common response wrapper returned by MiHoYo and HoYoLAB services along with {@link Response}.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Response<ApiResponseGcgMatchListData> getMatchListWithResponse(String cookie, String ds, String roleId,
        String server, RequestContext requestContext) {
        return this.instrumentation.instrumentWithResponse("UIGF.Mihoyo.Game.Genshin.Record.GcgApi.getMatchList",
            requestContext, updatedContext -> {
                final String accept = "application/json";
                return service.getMatchList(this.client.getEndpoint(), cookie, ds, roleId, server, accept,
                    updatedContext);
            });
    }
}
