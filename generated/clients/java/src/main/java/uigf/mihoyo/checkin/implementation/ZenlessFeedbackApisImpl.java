package uigf.mihoyo.checkin.implementation;

import io.clientcore.core.annotations.ReturnType;
import io.clientcore.core.annotations.ServiceInterface;
import io.clientcore.core.annotations.ServiceMethod;
import io.clientcore.core.http.annotations.BodyParam;
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
import uigf.mihoyo.ApiResponseEmptyData;
import uigf.mihoyo.ApiResponseZenlessFeedbackScheduleData;
import uigf.mihoyo.api.request.ZenlessFeedbackCollectionRequest;

/**
 * An instance of this class provides access to all the operations defined in ZenlessFeedbackApis.
 */
public final class ZenlessFeedbackApisImpl {
    /**
     * The proxy service used to perform REST calls.
     */
    private final ZenlessFeedbackApisService service;

    /**
     * The service client containing this operation class.
     */
    private final ActivityClientImpl client;

    /**
     * The instance of instrumentation to report telemetry.
     */
    private final Instrumentation instrumentation;

    /**
     * Initializes an instance of ZenlessFeedbackApisImpl.
     * 
     * @param client the instance of the service client containing this operation class.
     */
    ZenlessFeedbackApisImpl(ActivityClientImpl client) {
        this.service = ZenlessFeedbackApisService.getNewInstance(client.getHttpPipeline());
        this.client = client;
        this.instrumentation = client.getInstrumentation();
    }

    /**
     * The interface defining all the services for ActivityClientZenlessFeedbackApis to be used by the proxy service to
     * perform REST calls.
     */
    @ServiceInterface(name = "ActivityClientZenlessFeedbackApis", host = "{endpoint}")
    public interface ZenlessFeedbackApisService {
        static ZenlessFeedbackApisService getNewInstance(HttpPipeline pipeline) {
            try {
                Class<?> clazz = Class.forName("uigf.mihoyo.checkin.implementation.ZenlessFeedbackApisServiceImpl");
                return (ZenlessFeedbackApisService) clazz.getMethod("getNewInstance", HttpPipeline.class)
                    .invoke(null, pipeline);
            } catch (ClassNotFoundException | NoSuchMethodException | IllegalAccessException
                | InvocationTargetException e) {
                throw new RuntimeException(e);
            }

        }

        @HttpRequestInformation(
            method = HttpMethod.GET,
            path = "/event/nap_feedback/user/get_cur_schedule",
            expectedStatusCodes = { 200 })
        @UnexpectedResponseExceptionDetail
        Response<ApiResponseZenlessFeedbackScheduleData> getCurrentSchedule(@HostParam("endpoint") String endpoint,
            @HeaderParam("Cookie") String cookie, @QueryParam("region") String region, @QueryParam("source") int source,
            @QueryParam("tool_type") int toolType, @QueryParam("uid") long uid, @HeaderParam("Accept") String accept,
            RequestContext requestContext);

        @HttpRequestInformation(
            method = HttpMethod.POST,
            path = "/event/nap_feedback/user/collect_feedback",
            expectedStatusCodes = { 200 })
        @UnexpectedResponseExceptionDetail
        Response<ApiResponseEmptyData> collect(@HostParam("endpoint") String endpoint,
            @HeaderParam("Cookie") String cookie, @HeaderParam("Content-Type") String contentType,
            @HeaderParam("Accept") String accept, @BodyParam("application/json") ZenlessFeedbackCollectionRequest body,
            RequestContext requestContext);
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
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Response<ApiResponseZenlessFeedbackScheduleData> getCurrentScheduleWithResponse(String region, int source,
        int toolType, long uid, String cookie, RequestContext requestContext) {
        return this.instrumentation.instrumentWithResponse(
            "UIGF.Mihoyo.Game.CN.Activity.ZenlessFeedbackApi.getCurrentSchedule", requestContext, updatedContext -> {
                final String accept = "application/json";
                return service.getCurrentSchedule(this.client.getEndpoint(), cookie, region, source, toolType, uid,
                    accept, updatedContext);
            });
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
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Response<ApiResponseEmptyData> collectWithResponse(ZenlessFeedbackCollectionRequest body, String cookie,
        RequestContext requestContext) {
        return this.instrumentation.instrumentWithResponse("UIGF.Mihoyo.Game.CN.Activity.ZenlessFeedbackApi.collect",
            requestContext, updatedContext -> {
                final String contentType = "application/json";
                final String accept = "application/json";
                return service.collect(this.client.getEndpoint(), cookie, contentType, accept, body, updatedContext);
            });
    }
}
