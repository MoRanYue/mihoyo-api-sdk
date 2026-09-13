package uigf.mihoyo.game.cn.activity;

import io.clientcore.core.annotations.Metadata;
import io.clientcore.core.annotations.MetadataProperties;
import io.clientcore.core.annotations.ReturnType;
import io.clientcore.core.annotations.ServiceClient;
import io.clientcore.core.annotations.ServiceMethod;
import io.clientcore.core.http.models.HttpResponseException;
import io.clientcore.core.http.models.RequestContext;
import io.clientcore.core.http.models.Response;
import io.clientcore.core.instrumentation.Instrumentation;
import uigf.mihoyo.ApiResponseEmptyData;
import uigf.mihoyo.ApiResponseZenlessFeedbackScheduleData;
import uigf.mihoyo.api.request.ZenlessFeedbackCollectionRequest;
import uigf.mihoyo.checkin.implementation.ZenlessFeedbackApisImpl;

/**
 * Initializes a new instance of the synchronous ActivityClient type.
 */
@ServiceClient(builder = ActivityClientBuilder.class)
public final class ZenlessFeedbackApiClient {
    @Metadata(properties = { MetadataProperties.GENERATED })
    private final ZenlessFeedbackApisImpl serviceClient;

    private final Instrumentation instrumentation;

    /**
     * Initializes an instance of ZenlessFeedbackApiClient class.
     * 
     * @param serviceClient the service client implementation.
     * @param instrumentation the instrumentation instance.
     */
    @Metadata(properties = { MetadataProperties.GENERATED })
    ZenlessFeedbackApiClient(ZenlessFeedbackApisImpl serviceClient, Instrumentation instrumentation) {
        this.serviceClient = serviceClient;
        this.instrumentation = instrumentation;
    }

    /**
     * The getCurrentSchedule operation.
     * 
     * @param region The region parameter.
     * @param source The source parameter.
     * @param toolType The toolType parameter.
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
    public Response<ApiResponseZenlessFeedbackScheduleData> getCurrentScheduleWithResponse(String region, int source,
        int toolType, long uid, String cookie, RequestContext requestContext) {
        return this.instrumentation.instrumentWithResponse(
            "UIGF.Mihoyo.Game.CN.Activity.ZenlessFeedbackApi.getCurrentSchedule", requestContext,
            updatedContext -> this.serviceClient.getCurrentScheduleWithResponse(region, source, toolType, uid, cookie,
                updatedContext));
    }

    /**
     * The getCurrentSchedule operation.
     * 
     * @param region The region parameter.
     * @param source The source parameter.
     * @param toolType The toolType parameter.
     * @param uid The uid parameter.
     * @param cookie The cookie parameter.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws HttpResponseException thrown if the service returns an error.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return common response wrapper returned by MiHoYo and HoYoLAB services.
     */
    @Metadata(properties = { MetadataProperties.GENERATED })
    @ServiceMethod(returns = ReturnType.SINGLE)
    public ApiResponseZenlessFeedbackScheduleData getCurrentSchedule(String region, int source, int toolType, long uid,
        String cookie) {
        return getCurrentScheduleWithResponse(region, source, toolType, uid, cookie, RequestContext.none()).getValue();
    }

    /**
     * The getCurrentSchedule operation.
     * 
     * @param region The region parameter.
     * @param source The source parameter.
     * @param toolType The toolType parameter.
     * @param uid The uid parameter.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws HttpResponseException thrown if the service returns an error.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return common response wrapper returned by MiHoYo and HoYoLAB services.
     */
    @Metadata(properties = { MetadataProperties.GENERATED })
    @ServiceMethod(returns = ReturnType.SINGLE)
    public ApiResponseZenlessFeedbackScheduleData getCurrentSchedule(String region, int source, int toolType,
        long uid) {
        final String cookie = null;
        return getCurrentScheduleWithResponse(region, source, toolType, uid, cookie, RequestContext.none()).getValue();
    }

    /**
     * The collect operation.
     * 
     * @param body The body parameter.
     * @param cookie The cookie parameter.
     * @param requestContext The context to configure the HTTP request before HTTP client sends it.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws HttpResponseException thrown if the service returns an error.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return common response wrapper returned by MiHoYo and HoYoLAB services along with {@link Response}.
     */
    @Metadata(properties = { MetadataProperties.GENERATED })
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Response<ApiResponseEmptyData> collectWithResponse(ZenlessFeedbackCollectionRequest body, String cookie,
        RequestContext requestContext) {
        return this.instrumentation.instrumentWithResponse("UIGF.Mihoyo.Game.CN.Activity.ZenlessFeedbackApi.collect",
            requestContext, updatedContext -> this.serviceClient.collectWithResponse(body, cookie, updatedContext));
    }

    /**
     * The collect operation.
     * 
     * @param body The body parameter.
     * @param cookie The cookie parameter.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws HttpResponseException thrown if the service returns an error.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return common response wrapper returned by MiHoYo and HoYoLAB services.
     */
    @Metadata(properties = { MetadataProperties.GENERATED })
    @ServiceMethod(returns = ReturnType.SINGLE)
    public ApiResponseEmptyData collect(ZenlessFeedbackCollectionRequest body, String cookie) {
        return collectWithResponse(body, cookie, RequestContext.none()).getValue();
    }

    /**
     * The collect operation.
     * 
     * @param body The body parameter.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws HttpResponseException thrown if the service returns an error.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return common response wrapper returned by MiHoYo and HoYoLAB services.
     */
    @Metadata(properties = { MetadataProperties.GENERATED })
    @ServiceMethod(returns = ReturnType.SINGLE)
    public ApiResponseEmptyData collect(ZenlessFeedbackCollectionRequest body) {
        final String cookie = null;
        return collectWithResponse(body, cookie, RequestContext.none()).getValue();
    }
}
