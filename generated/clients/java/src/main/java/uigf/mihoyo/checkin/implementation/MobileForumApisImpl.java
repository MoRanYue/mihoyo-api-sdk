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
import uigf.mihoyo.ApiResponseMobileDiscussionData;

/**
 * An instance of this class provides access to all the operations defined in MobileForumApis.
 */
public final class MobileForumApisImpl {
    /**
     * The proxy service used to perform REST calls.
     */
    private final MobileForumApisService service;

    /**
     * The service client containing this operation class.
     */
    private final MobileClientImpl client;

    /**
     * The instance of instrumentation to report telemetry.
     */
    private final Instrumentation instrumentation;

    /**
     * Initializes an instance of MobileForumApisImpl.
     * 
     * @param client the instance of the service client containing this operation class.
     */
    MobileForumApisImpl(MobileClientImpl client) {
        this.service = MobileForumApisService.getNewInstance(client.getHttpPipeline());
        this.client = client;
        this.instrumentation = client.getInstrumentation();
    }

    /**
     * The interface defining all the services for MobileClientMobileForumApis to be used by the proxy service to
     * perform REST calls.
     */
    @ServiceInterface(name = "MobileClientMobileForumApis", host = "{endpoint}")
    public interface MobileForumApisService {
        static MobileForumApisService getNewInstance(HttpPipeline pipeline) {
            try {
                Class<?> clazz = Class.forName("uigf.mihoyo.checkin.implementation.MobileForumApisServiceImpl");
                return (MobileForumApisService) clazz.getMethod("getNewInstance", HttpPipeline.class)
                    .invoke(null, pipeline);
            } catch (ClassNotFoundException | NoSuchMethodException | IllegalAccessException
                | InvocationTargetException e) {
                throw new RuntimeException(e);
            }

        }

        @HttpRequestInformation(
            method = HttpMethod.GET,
            path = "/forum/api/getDiscussionByGame",
            expectedStatusCodes = { 200 })
        @UnexpectedResponseExceptionDetail
        Response<ApiResponseMobileDiscussionData> getDiscussionByGame(@HostParam("endpoint") String endpoint,
            @HeaderParam("Cookie") String cookie, @HeaderParam("DS") String ds, @QueryParam("gids") int gids,
            @QueryParam("version") int version, @HeaderParam("Accept") String accept, RequestContext requestContext);
    }

    /**
     * The getDiscussionByGame operation.
     * 
     * @param gids The gids parameter.
     * @param version The version parameter.
     * @param cookie The cookie parameter.
     * @param ds The ds parameter.
     * @param requestContext The context to configure the HTTP request before HTTP client sends it.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws HttpResponseException thrown if the service returns an error.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return common response wrapper returned by MiHoYo and HoYoLAB services along with {@link Response}.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Response<ApiResponseMobileDiscussionData> getDiscussionByGameWithResponse(int gids, int version,
        String cookie, String ds, RequestContext requestContext) {
        return this.instrumentation.instrumentWithResponse(
            "UIGF.Mihoyo.MiYouShe.Mobile.MobileForumApi.getDiscussionByGame", requestContext, updatedContext -> {
                final String accept = "application/json";
                return service.getDiscussionByGame(this.client.getEndpoint(), cookie, ds, gids, version, accept,
                    updatedContext);
            });
    }
}
