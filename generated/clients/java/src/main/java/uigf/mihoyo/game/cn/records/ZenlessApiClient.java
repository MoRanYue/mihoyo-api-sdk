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
import uigf.mihoyo.ApiResponseGachaLogPage;
import uigf.mihoyo.ApiResponseJsonObject;
import uigf.mihoyo.ApiResponseZenlessDailyNoteData;
import uigf.mihoyo.ApiResponseZenlessIndexData;
import uigf.mihoyo.ApiResponseZenlessShiyuDefenseData;
import uigf.mihoyo.checkin.implementation.ZenlessApisImpl;

/**
 * Initializes a new instance of the synchronous CnGameRecordsClient type.
 */
@ServiceClient(builder = CnGameRecordsClientBuilder.class)
public final class ZenlessApiClient {
    @Metadata(properties = { MetadataProperties.GENERATED })
    private final ZenlessApisImpl serviceClient;

    private final Instrumentation instrumentation;

    /**
     * Initializes an instance of ZenlessApiClient class.
     * 
     * @param serviceClient the service client implementation.
     * @param instrumentation the instrumentation instance.
     */
    @Metadata(properties = { MetadataProperties.GENERATED })
    ZenlessApiClient(ZenlessApisImpl serviceClient, Instrumentation instrumentation) {
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
     * @param requestContext The context to configure the HTTP request before HTTP client sends it.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws HttpResponseException thrown if the service returns an error.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return common response wrapper returned by MiHoYo and HoYoLAB services along with {@link Response}.
     */
    @Metadata(properties = { MetadataProperties.GENERATED })
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Response<ApiResponseZenlessIndexData> getIndexWithResponse(String cookie, String server, String roleId,
        String ds, RequestContext requestContext) {
        return this.instrumentation.instrumentWithResponse("UIGF.Mihoyo.Game.CN.Records.ZenlessApi.getIndex",
            requestContext,
            updatedContext -> this.serviceClient.getIndexWithResponse(cookie, server, roleId, ds, updatedContext));
    }

    /**
     * The getIndex operation.
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
    public ApiResponseZenlessIndexData getIndex(String cookie, String server, String roleId, String ds) {
        return getIndexWithResponse(cookie, server, roleId, ds, RequestContext.none()).getValue();
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
    public ApiResponseZenlessIndexData getIndex(String cookie, String server, String roleId) {
        final String ds = null;
        return getIndexWithResponse(cookie, server, roleId, ds, RequestContext.none()).getValue();
    }

    /**
     * The getDailyNote operation.
     * 
     * @param cookie The cookie parameter.
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
    public Response<ApiResponseZenlessDailyNoteData> getDailyNoteWithResponse(String cookie, String server,
        String roleId, RequestContext requestContext) {
        return this.instrumentation.instrumentWithResponse("UIGF.Mihoyo.Game.CN.Records.ZenlessApi.getDailyNote",
            requestContext,
            updatedContext -> this.serviceClient.getDailyNoteWithResponse(cookie, server, roleId, updatedContext));
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
    public ApiResponseZenlessDailyNoteData getDailyNote(String cookie, String server, String roleId) {
        return getDailyNoteWithResponse(cookie, server, roleId, RequestContext.none()).getValue();
    }

    /**
     * The getGachaRecord operation.
     * 
     * @param cookie The cookie parameter.
     * @param uid The uid parameter.
     * @param region The region parameter.
     * @param gachaType The gachaType parameter.
     * @param endId The endId parameter.
     * @param lang The lang parameter.
     * @param requestContext The context to configure the HTTP request before HTTP client sends it.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws HttpResponseException thrown if the service returns an error.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return common response wrapper returned by MiHoYo and HoYoLAB services along with {@link Response}.
     */
    @Metadata(properties = { MetadataProperties.GENERATED })
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Response<ApiResponseGachaLogPage> getGachaRecordWithResponse(String cookie, String uid, String region,
        int gachaType, Long endId, String lang, RequestContext requestContext) {
        return this.instrumentation.instrumentWithResponse("UIGF.Mihoyo.Game.CN.Records.ZenlessApi.getGachaRecord",
            requestContext, updatedContext -> this.serviceClient.getGachaRecordWithResponse(cookie, uid, region,
                gachaType, endId, lang, updatedContext));
    }

    /**
     * The getGachaRecord operation.
     * 
     * @param cookie The cookie parameter.
     * @param uid The uid parameter.
     * @param region The region parameter.
     * @param gachaType The gachaType parameter.
     * @param endId The endId parameter.
     * @param lang The lang parameter.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws HttpResponseException thrown if the service returns an error.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return common response wrapper returned by MiHoYo and HoYoLAB services.
     */
    @Metadata(properties = { MetadataProperties.GENERATED })
    @ServiceMethod(returns = ReturnType.SINGLE)
    public ApiResponseGachaLogPage getGachaRecord(String cookie, String uid, String region, int gachaType, Long endId,
        String lang) {
        return getGachaRecordWithResponse(cookie, uid, region, gachaType, endId, lang, RequestContext.none())
            .getValue();
    }

    /**
     * The getGachaRecord operation.
     * 
     * @param cookie The cookie parameter.
     * @param uid The uid parameter.
     * @param region The region parameter.
     * @param gachaType The gachaType parameter.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws HttpResponseException thrown if the service returns an error.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return common response wrapper returned by MiHoYo and HoYoLAB services.
     */
    @Metadata(properties = { MetadataProperties.GENERATED })
    @ServiceMethod(returns = ReturnType.SINGLE)
    public ApiResponseGachaLogPage getGachaRecord(String cookie, String uid, String region, int gachaType) {
        final Long endId = null;
        final String lang = null;
        return getGachaRecordWithResponse(cookie, uid, region, gachaType, endId, lang, RequestContext.none())
            .getValue();
    }

    /**
     * The getShiyuDefense operation.
     * 
     * @param cookie The cookie parameter.
     * @param server The server parameter.
     * @param roleId The roleId parameter.
     * @param ds The ds parameter.
     * @param withoutV2Detail The withoutV2Detail parameter.
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
    public Response<ApiResponseZenlessShiyuDefenseData> getShiyuDefenseWithResponse(String cookie, String server,
        String roleId, String ds, Boolean withoutV2Detail, Integer scheduleType, Boolean needDetail, Boolean needAll,
        RequestContext requestContext) {
        return this.instrumentation.instrumentWithResponse("UIGF.Mihoyo.Game.CN.Records.ZenlessApi.getShiyuDefense",
            requestContext, updatedContext -> this.serviceClient.getShiyuDefenseWithResponse(cookie, server, roleId, ds,
                withoutV2Detail, scheduleType, needDetail, needAll, updatedContext));
    }

    /**
     * The getShiyuDefense operation.
     * 
     * @param cookie The cookie parameter.
     * @param server The server parameter.
     * @param roleId The roleId parameter.
     * @param ds The ds parameter.
     * @param withoutV2Detail The withoutV2Detail parameter.
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
    public ApiResponseZenlessShiyuDefenseData getShiyuDefense(String cookie, String server, String roleId, String ds,
        Boolean withoutV2Detail, Integer scheduleType, Boolean needDetail, Boolean needAll) {
        return getShiyuDefenseWithResponse(cookie, server, roleId, ds, withoutV2Detail, scheduleType, needDetail,
            needAll, RequestContext.none()).getValue();
    }

    /**
     * The getShiyuDefense operation.
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
    public ApiResponseZenlessShiyuDefenseData getShiyuDefense(String cookie, String server, String roleId) {
        final String ds = null;
        final Boolean withoutV2Detail = null;
        final Integer scheduleType = null;
        final Boolean needDetail = null;
        final Boolean needAll = null;
        return getShiyuDefenseWithResponse(cookie, server, roleId, ds, withoutV2Detail, scheduleType, needDetail,
            needAll, RequestContext.none()).getValue();
    }

    /**
     * The getDeadlyAssault operation.
     * 
     * @param cookie The cookie parameter.
     * @param scheduleType The scheduleType parameter.
     * @param region The region parameter.
     * @param uid The uid parameter.
     * @param ds The ds parameter.
     * @param requestContext The context to configure the HTTP request before HTTP client sends it.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws HttpResponseException thrown if the service returns an error.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return common response wrapper returned by MiHoYo and HoYoLAB services along with {@link Response}.
     */
    @Metadata(properties = { MetadataProperties.GENERATED })
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Response<ApiResponseJsonObject> getDeadlyAssaultWithResponse(String cookie, int scheduleType, String region,
        String uid, String ds, RequestContext requestContext) {
        return this.instrumentation.instrumentWithResponse("UIGF.Mihoyo.Game.CN.Records.ZenlessApi.getDeadlyAssault",
            requestContext, updatedContext -> this.serviceClient.getDeadlyAssaultWithResponse(cookie, scheduleType,
                region, uid, ds, updatedContext));
    }

    /**
     * The getDeadlyAssault operation.
     * 
     * @param cookie The cookie parameter.
     * @param scheduleType The scheduleType parameter.
     * @param region The region parameter.
     * @param uid The uid parameter.
     * @param ds The ds parameter.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws HttpResponseException thrown if the service returns an error.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return common response wrapper returned by MiHoYo and HoYoLAB services.
     */
    @Metadata(properties = { MetadataProperties.GENERATED })
    @ServiceMethod(returns = ReturnType.SINGLE)
    public ApiResponseJsonObject getDeadlyAssault(String cookie, int scheduleType, String region, String uid,
        String ds) {
        return getDeadlyAssaultWithResponse(cookie, scheduleType, region, uid, ds, RequestContext.none()).getValue();
    }

    /**
     * The getDeadlyAssault operation.
     * 
     * @param cookie The cookie parameter.
     * @param scheduleType The scheduleType parameter.
     * @param region The region parameter.
     * @param uid The uid parameter.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws HttpResponseException thrown if the service returns an error.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return common response wrapper returned by MiHoYo and HoYoLAB services.
     */
    @Metadata(properties = { MetadataProperties.GENERATED })
    @ServiceMethod(returns = ReturnType.SINGLE)
    public ApiResponseJsonObject getDeadlyAssault(String cookie, int scheduleType, String region, String uid) {
        final String ds = null;
        return getDeadlyAssaultWithResponse(cookie, scheduleType, region, uid, ds, RequestContext.none()).getValue();
    }

    /**
     * The getThresholdSimulationSummary operation.
     * 
     * @param cookie The cookie parameter.
     * @param region The region parameter.
     * @param uid The uid parameter.
     * @param requestContext The context to configure the HTTP request before HTTP client sends it.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws HttpResponseException thrown if the service returns an error.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return common response wrapper returned by MiHoYo and HoYoLAB services along with {@link Response}.
     */
    @Metadata(properties = { MetadataProperties.GENERATED })
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Response<ApiResponseJsonObject> getThresholdSimulationSummaryWithResponse(String cookie, String region,
        String uid, RequestContext requestContext) {
        return this.instrumentation.instrumentWithResponse(
            "UIGF.Mihoyo.Game.CN.Records.ZenlessApi.getThresholdSimulationSummary", requestContext,
            updatedContext -> this.serviceClient.getThresholdSimulationSummaryWithResponse(cookie, region, uid,
                updatedContext));
    }

    /**
     * The getThresholdSimulationSummary operation.
     * 
     * @param cookie The cookie parameter.
     * @param region The region parameter.
     * @param uid The uid parameter.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws HttpResponseException thrown if the service returns an error.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return common response wrapper returned by MiHoYo and HoYoLAB services.
     */
    @Metadata(properties = { MetadataProperties.GENERATED })
    @ServiceMethod(returns = ReturnType.SINGLE)
    public ApiResponseJsonObject getThresholdSimulationSummary(String cookie, String region, String uid) {
        return getThresholdSimulationSummaryWithResponse(cookie, region, uid, RequestContext.none()).getValue();
    }

    /**
     * The getThresholdSimulationDetail operation.
     * 
     * @param cookie The cookie parameter.
     * @param region The region parameter.
     * @param uid The uid parameter.
     * @param voidFrontId The voidFrontId parameter.
     * @param requestContext The context to configure the HTTP request before HTTP client sends it.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws HttpResponseException thrown if the service returns an error.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return common response wrapper returned by MiHoYo and HoYoLAB services along with {@link Response}.
     */
    @Metadata(properties = { MetadataProperties.GENERATED })
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Response<ApiResponseJsonObject> getThresholdSimulationDetailWithResponse(String cookie, String region,
        String uid, int voidFrontId, RequestContext requestContext) {
        return this.instrumentation.instrumentWithResponse(
            "UIGF.Mihoyo.Game.CN.Records.ZenlessApi.getThresholdSimulationDetail", requestContext,
            updatedContext -> this.serviceClient.getThresholdSimulationDetailWithResponse(cookie, region, uid,
                voidFrontId, updatedContext));
    }

    /**
     * The getThresholdSimulationDetail operation.
     * 
     * @param cookie The cookie parameter.
     * @param region The region parameter.
     * @param uid The uid parameter.
     * @param voidFrontId The voidFrontId parameter.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws HttpResponseException thrown if the service returns an error.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return common response wrapper returned by MiHoYo and HoYoLAB services.
     */
    @Metadata(properties = { MetadataProperties.GENERATED })
    @ServiceMethod(returns = ReturnType.SINGLE)
    public ApiResponseJsonObject getThresholdSimulationDetail(String cookie, String region, String uid,
        int voidFrontId) {
        return getThresholdSimulationDetailWithResponse(cookie, region, uid, voidFrontId, RequestContext.none())
            .getValue();
    }
}
