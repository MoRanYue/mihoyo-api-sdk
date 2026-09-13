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
import uigf.mihoyo.ApiResponseZenlessAbyssSeasonTwoSummaryData;
import uigf.mihoyo.ApiResponseZenlessAbyssSummaryData;
import uigf.mihoyo.ApiResponseZenlessActivityCalendarData;
import uigf.mihoyo.ApiResponseZenlessClimbingTowerDetailData;
import uigf.mihoyo.ApiResponseZenlessDeadlyAssaultSummaryData;
import uigf.mihoyo.ApiResponseZenlessExplorationDetailData;
import uigf.mihoyo.ApiResponseZenlessGachaCalendarData;
import uigf.mihoyo.ApiResponseZenlessThresholdSimulationPeriodSummaryData;

/**
 * An instance of this class provides access to all the operations defined in ZenlessMobileApis.
 */
public final class ZenlessMobileApisImpl {
    /**
     * The proxy service used to perform REST calls.
     */
    private final ZenlessMobileApisService service;

    /**
     * The service client containing this operation class.
     */
    private final CnGameRecordsClientImpl client;

    /**
     * The instance of instrumentation to report telemetry.
     */
    private final Instrumentation instrumentation;

    /**
     * Initializes an instance of ZenlessMobileApisImpl.
     * 
     * @param client the instance of the service client containing this operation class.
     */
    ZenlessMobileApisImpl(CnGameRecordsClientImpl client) {
        this.service = ZenlessMobileApisService.getNewInstance(client.getHttpPipeline());
        this.client = client;
        this.instrumentation = client.getInstrumentation();
    }

    /**
     * The interface defining all the services for CnGameRecordsClientZenlessMobileApis to be used by the proxy service
     * to perform REST calls.
     */
    @ServiceInterface(name = "CnGameRecordsClientZenlessMobileApis", host = "{endpoint}")
    public interface ZenlessMobileApisService {
        static ZenlessMobileApisService getNewInstance(HttpPipeline pipeline) {
            try {
                Class<?> clazz = Class.forName("uigf.mihoyo.checkin.implementation.ZenlessMobileApisServiceImpl");
                return (ZenlessMobileApisService) clazz.getMethod("getNewInstance", HttpPipeline.class)
                    .invoke(null, pipeline);
            } catch (ClassNotFoundException | NoSuchMethodException | IllegalAccessException
                | InvocationTargetException e) {
                throw new RuntimeException(e);
            }

        }

        @HttpRequestInformation(
            method = HttpMethod.GET,
            path = "/event/game_record_zzz/api/zzz/abyss_abstract",
            expectedStatusCodes = { 200 })
        @UnexpectedResponseExceptionDetail
        Response<ApiResponseZenlessAbyssSummaryData> getAbyssSummary(@HostParam("endpoint") String endpoint,
            @HeaderParam("Cookie") String cookie, @QueryParam("role_id") String roleId,
            @QueryParam("server") String server, @HeaderParam("Accept") String accept, RequestContext requestContext);

        @HttpRequestInformation(
            method = HttpMethod.GET,
            path = "/event/game_record_zzz/api/zzz/abysss2_abstract",
            expectedStatusCodes = { 200 })
        @UnexpectedResponseExceptionDetail
        Response<ApiResponseZenlessAbyssSeasonTwoSummaryData> getAbyssSeasonTwoSummary(
            @HostParam("endpoint") String endpoint, @HeaderParam("Cookie") String cookie,
            @QueryParam("region") String region, @QueryParam("uid") long uid, @HeaderParam("Accept") String accept,
            RequestContext requestContext);

        @HttpRequestInformation(
            method = HttpMethod.GET,
            path = "/event/game_record_zzz/api/zzz/activity_calendar",
            expectedStatusCodes = { 200 })
        @UnexpectedResponseExceptionDetail
        Response<ApiResponseZenlessActivityCalendarData> getActivityCalendar(@HostParam("endpoint") String endpoint,
            @HeaderParam("Cookie") String cookie, @QueryParam("region") String region, @QueryParam("uid") long uid,
            @HeaderParam("Accept") String accept, RequestContext requestContext);

        @HttpRequestInformation(
            method = HttpMethod.GET,
            path = "/event/game_record_zzz/api/zzz/climbing_tower_detail",
            expectedStatusCodes = { 200 })
        @UnexpectedResponseExceptionDetail
        Response<ApiResponseZenlessClimbingTowerDetailData> getClimbingTowerDetail(
            @HostParam("endpoint") String endpoint, @HeaderParam("Cookie") String cookie,
            @QueryParam("region") String region, @QueryParam("uid") long uid, @HeaderParam("Accept") String accept,
            RequestContext requestContext);

        @HttpRequestInformation(
            method = HttpMethod.GET,
            path = "/event/game_record_zzz/api/zzz/exploration_detail",
            expectedStatusCodes = { 200 })
        @UnexpectedResponseExceptionDetail
        Response<ApiResponseZenlessExplorationDetailData> getExplorationDetail(@HostParam("endpoint") String endpoint,
            @HeaderParam("Cookie") String cookie, @QueryParam("region") String region, @QueryParam("uid") long uid,
            @HeaderParam("Accept") String accept, RequestContext requestContext);

        @HttpRequestInformation(
            method = HttpMethod.GET,
            path = "/event/game_record_zzz/api/zzz/gacha_calendar",
            expectedStatusCodes = { 200 })
        @UnexpectedResponseExceptionDetail
        Response<ApiResponseZenlessGachaCalendarData> getGachaCalendar(@HostParam("endpoint") String endpoint,
            @HeaderParam("Cookie") String cookie, @QueryParam("region") String region, @QueryParam("uid") long uid,
            @HeaderParam("Accept") String accept, RequestContext requestContext);

        @HttpRequestInformation(
            method = HttpMethod.GET,
            path = "/event/game_record_zzz/api/zzz/hadal_mem_abstract_info",
            expectedStatusCodes = { 200 })
        @UnexpectedResponseExceptionDetail
        Response<ApiResponseZenlessDeadlyAssaultSummaryData> getDeadlyAssaultSummary(
            @HostParam("endpoint") String endpoint, @HeaderParam("Cookie") String cookie,
            @QueryParam("region") String region, @QueryParam("schedule_type") int scheduleType,
            @QueryParam("uid") long uid, @HeaderParam("Accept") String accept, RequestContext requestContext);

        @HttpRequestInformation(
            method = HttpMethod.GET,
            path = "/event/game_record_zzz/api/zzz/void_front_battle_period_abstract_info",
            expectedStatusCodes = { 200 })
        @UnexpectedResponseExceptionDetail
        Response<ApiResponseZenlessThresholdSimulationPeriodSummaryData> getThresholdSimulationPeriodSummary(
            @HostParam("endpoint") String endpoint, @HeaderParam("Cookie") String cookie,
            @QueryParam("region") String region, @QueryParam("schedule_type") int scheduleType,
            @QueryParam("uid") long uid, @HeaderParam("Accept") String accept, RequestContext requestContext);
    }

    /**
     * The getAbyssSummary operation.
     * 
     * @param roleId The roleId parameter.
     * @param server The server parameter.
     * @param cookie The cookie parameter.
     * @param requestContext The context to configure the HTTP request before HTTP client sends it.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws HttpResponseException thrown if the service returns an error.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return common response wrapper returned by MiHoYo and HoYoLAB services along with {@link Response}.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Response<ApiResponseZenlessAbyssSummaryData> getAbyssSummaryWithResponse(String roleId, String server,
        String cookie, RequestContext requestContext) {
        return this.instrumentation.instrumentWithResponse(
            "UIGF.Mihoyo.Game.CN.Records.ZenlessMobileApi.getAbyssSummary", requestContext, updatedContext -> {
                final String accept = "application/json";
                return service.getAbyssSummary(this.client.getEndpoint(), cookie, roleId, server, accept,
                    updatedContext);
            });
    }

    /**
     * The getAbyssSeasonTwoSummary operation.
     * 
     * @param region The region parameter.
     * @param uid The uid parameter.
     * @param cookie The cookie parameter.
     * @param requestContext The context to configure the HTTP request before HTTP client sends it.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws HttpResponseException thrown if the service returns an error.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return common response wrapper returned by MiHoYo and HoYoLAB services along with {@link Response}.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Response<ApiResponseZenlessAbyssSeasonTwoSummaryData> getAbyssSeasonTwoSummaryWithResponse(String region,
        long uid, String cookie, RequestContext requestContext) {
        return this.instrumentation.instrumentWithResponse(
            "UIGF.Mihoyo.Game.CN.Records.ZenlessMobileApi.getAbyssSeasonTwoSummary", requestContext, updatedContext -> {
                final String accept = "application/json";
                return service.getAbyssSeasonTwoSummary(this.client.getEndpoint(), cookie, region, uid, accept,
                    updatedContext);
            });
    }

    /**
     * The getActivityCalendar operation.
     * 
     * @param region The region parameter.
     * @param uid The uid parameter.
     * @param cookie The cookie parameter.
     * @param requestContext The context to configure the HTTP request before HTTP client sends it.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws HttpResponseException thrown if the service returns an error.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return common response wrapper returned by MiHoYo and HoYoLAB services along with {@link Response}.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Response<ApiResponseZenlessActivityCalendarData> getActivityCalendarWithResponse(String region, long uid,
        String cookie, RequestContext requestContext) {
        return this.instrumentation.instrumentWithResponse(
            "UIGF.Mihoyo.Game.CN.Records.ZenlessMobileApi.getActivityCalendar", requestContext, updatedContext -> {
                final String accept = "application/json";
                return service.getActivityCalendar(this.client.getEndpoint(), cookie, region, uid, accept,
                    updatedContext);
            });
    }

    /**
     * The getClimbingTowerDetail operation.
     * 
     * @param region The region parameter.
     * @param uid The uid parameter.
     * @param cookie The cookie parameter.
     * @param requestContext The context to configure the HTTP request before HTTP client sends it.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws HttpResponseException thrown if the service returns an error.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return common response wrapper returned by MiHoYo and HoYoLAB services along with {@link Response}.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Response<ApiResponseZenlessClimbingTowerDetailData> getClimbingTowerDetailWithResponse(String region,
        long uid, String cookie, RequestContext requestContext) {
        return this.instrumentation.instrumentWithResponse(
            "UIGF.Mihoyo.Game.CN.Records.ZenlessMobileApi.getClimbingTowerDetail", requestContext, updatedContext -> {
                final String accept = "application/json";
                return service.getClimbingTowerDetail(this.client.getEndpoint(), cookie, region, uid, accept,
                    updatedContext);
            });
    }

    /**
     * The getExplorationDetail operation.
     * 
     * @param region The region parameter.
     * @param uid The uid parameter.
     * @param cookie The cookie parameter.
     * @param requestContext The context to configure the HTTP request before HTTP client sends it.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws HttpResponseException thrown if the service returns an error.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return common response wrapper returned by MiHoYo and HoYoLAB services along with {@link Response}.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Response<ApiResponseZenlessExplorationDetailData> getExplorationDetailWithResponse(String region, long uid,
        String cookie, RequestContext requestContext) {
        return this.instrumentation.instrumentWithResponse(
            "UIGF.Mihoyo.Game.CN.Records.ZenlessMobileApi.getExplorationDetail", requestContext, updatedContext -> {
                final String accept = "application/json";
                return service.getExplorationDetail(this.client.getEndpoint(), cookie, region, uid, accept,
                    updatedContext);
            });
    }

    /**
     * The getGachaCalendar operation.
     * 
     * @param region The region parameter.
     * @param uid The uid parameter.
     * @param cookie The cookie parameter.
     * @param requestContext The context to configure the HTTP request before HTTP client sends it.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws HttpResponseException thrown if the service returns an error.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return common response wrapper returned by MiHoYo and HoYoLAB services along with {@link Response}.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Response<ApiResponseZenlessGachaCalendarData> getGachaCalendarWithResponse(String region, long uid,
        String cookie, RequestContext requestContext) {
        return this.instrumentation.instrumentWithResponse(
            "UIGF.Mihoyo.Game.CN.Records.ZenlessMobileApi.getGachaCalendar", requestContext, updatedContext -> {
                final String accept = "application/json";
                return service.getGachaCalendar(this.client.getEndpoint(), cookie, region, uid, accept, updatedContext);
            });
    }

    /**
     * The getDeadlyAssaultSummary operation.
     * 
     * @param region The region parameter.
     * @param scheduleType The scheduleType parameter.
     * @param uid The uid parameter.
     * @param cookie The cookie parameter.
     * @param requestContext The context to configure the HTTP request before HTTP client sends it.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws HttpResponseException thrown if the service returns an error.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return common response wrapper returned by MiHoYo and HoYoLAB services along with {@link Response}.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Response<ApiResponseZenlessDeadlyAssaultSummaryData> getDeadlyAssaultSummaryWithResponse(String region,
        int scheduleType, long uid, String cookie, RequestContext requestContext) {
        return this.instrumentation.instrumentWithResponse(
            "UIGF.Mihoyo.Game.CN.Records.ZenlessMobileApi.getDeadlyAssaultSummary", requestContext, updatedContext -> {
                final String accept = "application/json";
                return service.getDeadlyAssaultSummary(this.client.getEndpoint(), cookie, region, scheduleType, uid,
                    accept, updatedContext);
            });
    }

    /**
     * The getThresholdSimulationPeriodSummary operation.
     * 
     * @param region The region parameter.
     * @param scheduleType The scheduleType parameter.
     * @param uid The uid parameter.
     * @param cookie The cookie parameter.
     * @param requestContext The context to configure the HTTP request before HTTP client sends it.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws HttpResponseException thrown if the service returns an error.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return common response wrapper returned by MiHoYo and HoYoLAB services along with {@link Response}.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Response<ApiResponseZenlessThresholdSimulationPeriodSummaryData>
        getThresholdSimulationPeriodSummaryWithResponse(String region, int scheduleType, long uid, String cookie,
            RequestContext requestContext) {
        return this.instrumentation.instrumentWithResponse(
            "UIGF.Mihoyo.Game.CN.Records.ZenlessMobileApi.getThresholdSimulationPeriodSummary", requestContext,
            updatedContext -> {
                final String accept = "application/json";
                return service.getThresholdSimulationPeriodSummary(this.client.getEndpoint(), cookie, region,
                    scheduleType, uid, accept, updatedContext);
            });
    }
}
