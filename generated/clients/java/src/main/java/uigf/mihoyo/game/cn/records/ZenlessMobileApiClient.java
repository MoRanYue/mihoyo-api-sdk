package uigf.mihoyo.game.cn.records;

import io.clientcore.core.annotations.Metadata;
import io.clientcore.core.annotations.MetadataProperties;
import io.clientcore.core.annotations.ReturnType;
import io.clientcore.core.annotations.ServiceClient;
import io.clientcore.core.annotations.ServiceMethod;
import io.clientcore.core.http.models.HttpResponseException;
import io.clientcore.core.http.models.RequestContext;
import io.clientcore.core.http.models.Response;
import io.clientcore.core.instrumentation.Instrumentation;
import uigf.mihoyo.ApiResponseZenlessAbyssSeasonTwoSummaryData;
import uigf.mihoyo.ApiResponseZenlessAbyssSummaryData;
import uigf.mihoyo.ApiResponseZenlessActivityCalendarData;
import uigf.mihoyo.ApiResponseZenlessClimbingTowerDetailData;
import uigf.mihoyo.ApiResponseZenlessDeadlyAssaultSummaryData;
import uigf.mihoyo.ApiResponseZenlessExplorationDetailData;
import uigf.mihoyo.ApiResponseZenlessGachaCalendarData;
import uigf.mihoyo.ApiResponseZenlessThresholdSimulationPeriodSummaryData;
import uigf.mihoyo.checkin.implementation.ZenlessMobileApisImpl;

/**
 * Initializes a new instance of the synchronous CnGameRecordsClient type.
 */
@ServiceClient(builder = CnGameRecordsClientBuilder.class)
public final class ZenlessMobileApiClient {
    @Metadata(properties = { MetadataProperties.GENERATED })
    private final ZenlessMobileApisImpl serviceClient;

    private final Instrumentation instrumentation;

    /**
     * Initializes an instance of ZenlessMobileApiClient class.
     * 
     * @param serviceClient the service client implementation.
     * @param instrumentation the instrumentation instance.
     */
    @Metadata(properties = { MetadataProperties.GENERATED })
    ZenlessMobileApiClient(ZenlessMobileApisImpl serviceClient, Instrumentation instrumentation) {
        this.serviceClient = serviceClient;
        this.instrumentation = instrumentation;
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
    @Metadata(properties = { MetadataProperties.GENERATED })
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Response<ApiResponseZenlessAbyssSummaryData> getAbyssSummaryWithResponse(String roleId, String server,
        String cookie, RequestContext requestContext) {
        return this.instrumentation.instrumentWithResponse(
            "UIGF.Mihoyo.Game.CN.Records.ZenlessMobileApi.getAbyssSummary", requestContext,
            updatedContext -> this.serviceClient.getAbyssSummaryWithResponse(roleId, server, cookie, updatedContext));
    }

    /**
     * The getAbyssSummary operation.
     * 
     * @param roleId The roleId parameter.
     * @param server The server parameter.
     * @param cookie The cookie parameter.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws HttpResponseException thrown if the service returns an error.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return common response wrapper returned by MiHoYo and HoYoLAB services.
     */
    @Metadata(properties = { MetadataProperties.GENERATED })
    @ServiceMethod(returns = ReturnType.SINGLE)
    public ApiResponseZenlessAbyssSummaryData getAbyssSummary(String roleId, String server, String cookie) {
        return getAbyssSummaryWithResponse(roleId, server, cookie, RequestContext.none()).getValue();
    }

    /**
     * The getAbyssSummary operation.
     * 
     * @param roleId The roleId parameter.
     * @param server The server parameter.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws HttpResponseException thrown if the service returns an error.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return common response wrapper returned by MiHoYo and HoYoLAB services.
     */
    @Metadata(properties = { MetadataProperties.GENERATED })
    @ServiceMethod(returns = ReturnType.SINGLE)
    public ApiResponseZenlessAbyssSummaryData getAbyssSummary(String roleId, String server) {
        final String cookie = null;
        return getAbyssSummaryWithResponse(roleId, server, cookie, RequestContext.none()).getValue();
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
    @Metadata(properties = { MetadataProperties.GENERATED })
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Response<ApiResponseZenlessAbyssSeasonTwoSummaryData> getAbyssSeasonTwoSummaryWithResponse(String region,
        long uid, String cookie, RequestContext requestContext) {
        return this.instrumentation.instrumentWithResponse(
            "UIGF.Mihoyo.Game.CN.Records.ZenlessMobileApi.getAbyssSeasonTwoSummary", requestContext,
            updatedContext -> this.serviceClient.getAbyssSeasonTwoSummaryWithResponse(region, uid, cookie,
                updatedContext));
    }

    /**
     * The getAbyssSeasonTwoSummary operation.
     * 
     * @param region The region parameter.
     * @param uid The uid parameter.
     * @param cookie The cookie parameter.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws HttpResponseException thrown if the service returns an error.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return common response wrapper returned by MiHoYo and HoYoLAB services.
     */
    @Metadata(properties = { MetadataProperties.GENERATED })
    @ServiceMethod(returns = ReturnType.SINGLE)
    public ApiResponseZenlessAbyssSeasonTwoSummaryData getAbyssSeasonTwoSummary(String region, long uid,
        String cookie) {
        return getAbyssSeasonTwoSummaryWithResponse(region, uid, cookie, RequestContext.none()).getValue();
    }

    /**
     * The getAbyssSeasonTwoSummary operation.
     * 
     * @param region The region parameter.
     * @param uid The uid parameter.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws HttpResponseException thrown if the service returns an error.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return common response wrapper returned by MiHoYo and HoYoLAB services.
     */
    @Metadata(properties = { MetadataProperties.GENERATED })
    @ServiceMethod(returns = ReturnType.SINGLE)
    public ApiResponseZenlessAbyssSeasonTwoSummaryData getAbyssSeasonTwoSummary(String region, long uid) {
        final String cookie = null;
        return getAbyssSeasonTwoSummaryWithResponse(region, uid, cookie, RequestContext.none()).getValue();
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
    @Metadata(properties = { MetadataProperties.GENERATED })
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Response<ApiResponseZenlessActivityCalendarData> getActivityCalendarWithResponse(String region, long uid,
        String cookie, RequestContext requestContext) {
        return this.instrumentation.instrumentWithResponse(
            "UIGF.Mihoyo.Game.CN.Records.ZenlessMobileApi.getActivityCalendar", requestContext,
            updatedContext -> this.serviceClient.getActivityCalendarWithResponse(region, uid, cookie, updatedContext));
    }

    /**
     * The getActivityCalendar operation.
     * 
     * @param region The region parameter.
     * @param uid The uid parameter.
     * @param cookie The cookie parameter.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws HttpResponseException thrown if the service returns an error.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return common response wrapper returned by MiHoYo and HoYoLAB services.
     */
    @Metadata(properties = { MetadataProperties.GENERATED })
    @ServiceMethod(returns = ReturnType.SINGLE)
    public ApiResponseZenlessActivityCalendarData getActivityCalendar(String region, long uid, String cookie) {
        return getActivityCalendarWithResponse(region, uid, cookie, RequestContext.none()).getValue();
    }

    /**
     * The getActivityCalendar operation.
     * 
     * @param region The region parameter.
     * @param uid The uid parameter.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws HttpResponseException thrown if the service returns an error.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return common response wrapper returned by MiHoYo and HoYoLAB services.
     */
    @Metadata(properties = { MetadataProperties.GENERATED })
    @ServiceMethod(returns = ReturnType.SINGLE)
    public ApiResponseZenlessActivityCalendarData getActivityCalendar(String region, long uid) {
        final String cookie = null;
        return getActivityCalendarWithResponse(region, uid, cookie, RequestContext.none()).getValue();
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
    @Metadata(properties = { MetadataProperties.GENERATED })
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Response<ApiResponseZenlessClimbingTowerDetailData> getClimbingTowerDetailWithResponse(String region,
        long uid, String cookie, RequestContext requestContext) {
        return this.instrumentation.instrumentWithResponse(
            "UIGF.Mihoyo.Game.CN.Records.ZenlessMobileApi.getClimbingTowerDetail", requestContext,
            updatedContext -> this.serviceClient.getClimbingTowerDetailWithResponse(region, uid, cookie,
                updatedContext));
    }

    /**
     * The getClimbingTowerDetail operation.
     * 
     * @param region The region parameter.
     * @param uid The uid parameter.
     * @param cookie The cookie parameter.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws HttpResponseException thrown if the service returns an error.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return common response wrapper returned by MiHoYo and HoYoLAB services.
     */
    @Metadata(properties = { MetadataProperties.GENERATED })
    @ServiceMethod(returns = ReturnType.SINGLE)
    public ApiResponseZenlessClimbingTowerDetailData getClimbingTowerDetail(String region, long uid, String cookie) {
        return getClimbingTowerDetailWithResponse(region, uid, cookie, RequestContext.none()).getValue();
    }

    /**
     * The getClimbingTowerDetail operation.
     * 
     * @param region The region parameter.
     * @param uid The uid parameter.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws HttpResponseException thrown if the service returns an error.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return common response wrapper returned by MiHoYo and HoYoLAB services.
     */
    @Metadata(properties = { MetadataProperties.GENERATED })
    @ServiceMethod(returns = ReturnType.SINGLE)
    public ApiResponseZenlessClimbingTowerDetailData getClimbingTowerDetail(String region, long uid) {
        final String cookie = null;
        return getClimbingTowerDetailWithResponse(region, uid, cookie, RequestContext.none()).getValue();
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
    @Metadata(properties = { MetadataProperties.GENERATED })
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Response<ApiResponseZenlessExplorationDetailData> getExplorationDetailWithResponse(String region, long uid,
        String cookie, RequestContext requestContext) {
        return this.instrumentation.instrumentWithResponse(
            "UIGF.Mihoyo.Game.CN.Records.ZenlessMobileApi.getExplorationDetail", requestContext,
            updatedContext -> this.serviceClient.getExplorationDetailWithResponse(region, uid, cookie, updatedContext));
    }

    /**
     * The getExplorationDetail operation.
     * 
     * @param region The region parameter.
     * @param uid The uid parameter.
     * @param cookie The cookie parameter.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws HttpResponseException thrown if the service returns an error.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return common response wrapper returned by MiHoYo and HoYoLAB services.
     */
    @Metadata(properties = { MetadataProperties.GENERATED })
    @ServiceMethod(returns = ReturnType.SINGLE)
    public ApiResponseZenlessExplorationDetailData getExplorationDetail(String region, long uid, String cookie) {
        return getExplorationDetailWithResponse(region, uid, cookie, RequestContext.none()).getValue();
    }

    /**
     * The getExplorationDetail operation.
     * 
     * @param region The region parameter.
     * @param uid The uid parameter.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws HttpResponseException thrown if the service returns an error.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return common response wrapper returned by MiHoYo and HoYoLAB services.
     */
    @Metadata(properties = { MetadataProperties.GENERATED })
    @ServiceMethod(returns = ReturnType.SINGLE)
    public ApiResponseZenlessExplorationDetailData getExplorationDetail(String region, long uid) {
        final String cookie = null;
        return getExplorationDetailWithResponse(region, uid, cookie, RequestContext.none()).getValue();
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
    @Metadata(properties = { MetadataProperties.GENERATED })
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Response<ApiResponseZenlessGachaCalendarData> getGachaCalendarWithResponse(String region, long uid,
        String cookie, RequestContext requestContext) {
        return this.instrumentation.instrumentWithResponse(
            "UIGF.Mihoyo.Game.CN.Records.ZenlessMobileApi.getGachaCalendar", requestContext,
            updatedContext -> this.serviceClient.getGachaCalendarWithResponse(region, uid, cookie, updatedContext));
    }

    /**
     * The getGachaCalendar operation.
     * 
     * @param region The region parameter.
     * @param uid The uid parameter.
     * @param cookie The cookie parameter.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws HttpResponseException thrown if the service returns an error.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return common response wrapper returned by MiHoYo and HoYoLAB services.
     */
    @Metadata(properties = { MetadataProperties.GENERATED })
    @ServiceMethod(returns = ReturnType.SINGLE)
    public ApiResponseZenlessGachaCalendarData getGachaCalendar(String region, long uid, String cookie) {
        return getGachaCalendarWithResponse(region, uid, cookie, RequestContext.none()).getValue();
    }

    /**
     * The getGachaCalendar operation.
     * 
     * @param region The region parameter.
     * @param uid The uid parameter.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws HttpResponseException thrown if the service returns an error.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return common response wrapper returned by MiHoYo and HoYoLAB services.
     */
    @Metadata(properties = { MetadataProperties.GENERATED })
    @ServiceMethod(returns = ReturnType.SINGLE)
    public ApiResponseZenlessGachaCalendarData getGachaCalendar(String region, long uid) {
        final String cookie = null;
        return getGachaCalendarWithResponse(region, uid, cookie, RequestContext.none()).getValue();
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
    @Metadata(properties = { MetadataProperties.GENERATED })
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Response<ApiResponseZenlessDeadlyAssaultSummaryData> getDeadlyAssaultSummaryWithResponse(String region,
        int scheduleType, long uid, String cookie, RequestContext requestContext) {
        return this.instrumentation.instrumentWithResponse(
            "UIGF.Mihoyo.Game.CN.Records.ZenlessMobileApi.getDeadlyAssaultSummary", requestContext,
            updatedContext -> this.serviceClient.getDeadlyAssaultSummaryWithResponse(region, scheduleType, uid, cookie,
                updatedContext));
    }

    /**
     * The getDeadlyAssaultSummary operation.
     * 
     * @param region The region parameter.
     * @param scheduleType The scheduleType parameter.
     * @param uid The uid parameter.
     * @param cookie The cookie parameter.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws HttpResponseException thrown if the service returns an error.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return common response wrapper returned by MiHoYo and HoYoLAB services.
     */
    @Metadata(properties = { MetadataProperties.GENERATED })
    @ServiceMethod(returns = ReturnType.SINGLE)
    public ApiResponseZenlessDeadlyAssaultSummaryData getDeadlyAssaultSummary(String region, int scheduleType, long uid,
        String cookie) {
        return getDeadlyAssaultSummaryWithResponse(region, scheduleType, uid, cookie, RequestContext.none()).getValue();
    }

    /**
     * The getDeadlyAssaultSummary operation.
     * 
     * @param region The region parameter.
     * @param scheduleType The scheduleType parameter.
     * @param uid The uid parameter.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws HttpResponseException thrown if the service returns an error.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return common response wrapper returned by MiHoYo and HoYoLAB services.
     */
    @Metadata(properties = { MetadataProperties.GENERATED })
    @ServiceMethod(returns = ReturnType.SINGLE)
    public ApiResponseZenlessDeadlyAssaultSummaryData getDeadlyAssaultSummary(String region, int scheduleType,
        long uid) {
        final String cookie = null;
        return getDeadlyAssaultSummaryWithResponse(region, scheduleType, uid, cookie, RequestContext.none()).getValue();
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
    @Metadata(properties = { MetadataProperties.GENERATED })
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Response<ApiResponseZenlessThresholdSimulationPeriodSummaryData>
        getThresholdSimulationPeriodSummaryWithResponse(String region, int scheduleType, long uid, String cookie,
            RequestContext requestContext) {
        return this.instrumentation.instrumentWithResponse(
            "UIGF.Mihoyo.Game.CN.Records.ZenlessMobileApi.getThresholdSimulationPeriodSummary", requestContext,
            updatedContext -> this.serviceClient.getThresholdSimulationPeriodSummaryWithResponse(region, scheduleType,
                uid, cookie, updatedContext));
    }

    /**
     * The getThresholdSimulationPeriodSummary operation.
     * 
     * @param region The region parameter.
     * @param scheduleType The scheduleType parameter.
     * @param uid The uid parameter.
     * @param cookie The cookie parameter.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws HttpResponseException thrown if the service returns an error.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return common response wrapper returned by MiHoYo and HoYoLAB services.
     */
    @Metadata(properties = { MetadataProperties.GENERATED })
    @ServiceMethod(returns = ReturnType.SINGLE)
    public ApiResponseZenlessThresholdSimulationPeriodSummaryData getThresholdSimulationPeriodSummary(String region,
        int scheduleType, long uid, String cookie) {
        return getThresholdSimulationPeriodSummaryWithResponse(region, scheduleType, uid, cookie, RequestContext.none())
            .getValue();
    }

    /**
     * The getThresholdSimulationPeriodSummary operation.
     * 
     * @param region The region parameter.
     * @param scheduleType The scheduleType parameter.
     * @param uid The uid parameter.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws HttpResponseException thrown if the service returns an error.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return common response wrapper returned by MiHoYo and HoYoLAB services.
     */
    @Metadata(properties = { MetadataProperties.GENERATED })
    @ServiceMethod(returns = ReturnType.SINGLE)
    public ApiResponseZenlessThresholdSimulationPeriodSummaryData getThresholdSimulationPeriodSummary(String region,
        int scheduleType, long uid) {
        final String cookie = null;
        return getThresholdSimulationPeriodSummaryWithResponse(region, scheduleType, uid, cookie, RequestContext.none())
            .getValue();
    }
}
