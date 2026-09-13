package uigf.mihoyo.checkin.implementation;

import io.clientcore.core.annotations.ReturnType;
import io.clientcore.core.annotations.ServiceInterface;
import io.clientcore.core.annotations.ServiceMethod;
import io.clientcore.core.http.annotations.HeaderParam;
import io.clientcore.core.http.annotations.HostParam;
import io.clientcore.core.http.annotations.HttpRequestInformation;
import io.clientcore.core.http.annotations.UnexpectedResponseExceptionDetail;
import io.clientcore.core.http.models.HttpMethod;
import io.clientcore.core.http.models.HttpResponseException;
import io.clientcore.core.http.models.RequestContext;
import io.clientcore.core.http.models.Response;
import io.clientcore.core.http.pipeline.HttpPipeline;
import io.clientcore.core.instrumentation.Instrumentation;
import java.lang.reflect.InvocationTargetException;
import uigf.mihoyo.ApiResponseMobileVideoPermissionData;

/**
 * An instance of this class provides access to all the operations defined in MobilePostApis.
 */
public final class MobilePostApisImpl {
    /**
     * The proxy service used to perform REST calls.
     */
    private final MobilePostApisService service;

    /**
     * The service client containing this operation class.
     */
    private final MobileClientImpl client;

    /**
     * The instance of instrumentation to report telemetry.
     */
    private final Instrumentation instrumentation;

    /**
     * Initializes an instance of MobilePostApisImpl.
     * 
     * @param client the instance of the service client containing this operation class.
     */
    MobilePostApisImpl(MobileClientImpl client) {
        this.service = MobilePostApisService.getNewInstance(client.getHttpPipeline());
        this.client = client;
        this.instrumentation = client.getInstrumentation();
    }

    /**
     * The interface defining all the services for MobileClientMobilePostApis to be used by the proxy service to perform
     * REST calls.
     */
    @ServiceInterface(name = "MobileClientMobilePostApis", host = "{endpoint}")
    public interface MobilePostApisService {
        static MobilePostApisService getNewInstance(HttpPipeline pipeline) {
            try {
                Class<?> clazz = Class.forName("uigf.mihoyo.checkin.implementation.MobilePostApisServiceImpl");
                return (MobilePostApisService) clazz.getMethod("getNewInstance", HttpPipeline.class)
                    .invoke(null, pipeline);
            } catch (ClassNotFoundException | NoSuchMethodException | IllegalAccessException
                | InvocationTargetException e) {
                throw new RuntimeException(e);
            }

        }

        @HttpRequestInformation(
            method = HttpMethod.GET,
            path = "/post/api/check/publishVideoPerm",
            expectedStatusCodes = { 200 })
        @UnexpectedResponseExceptionDetail
        Response<ApiResponseMobileVideoPermissionData> getPublishVideoPermission(@HostParam("endpoint") String endpoint,
            @HeaderParam("Cookie") String cookie, @HeaderParam("DS") String ds, @HeaderParam("Accept") String accept,
            RequestContext requestContext);
    }

    /**
     * The getPublishVideoPermission operation.
     * 
     * @param ds The ds parameter.
     * @param cookie The cookie parameter.
     * @param requestContext The context to configure the HTTP request before HTTP client sends it.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws HttpResponseException thrown if the service returns an error.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return common response wrapper returned by MiHoYo and HoYoLAB services along with {@link Response}.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Response<ApiResponseMobileVideoPermissionData> getPublishVideoPermissionWithResponse(String ds,
        String cookie, RequestContext requestContext) {
        return this.instrumentation.instrumentWithResponse(
            "UIGF.Mihoyo.MiYouShe.Mobile.MobilePostApi.getPublishVideoPermission", requestContext, updatedContext -> {
                final String accept = "application/json";
                return service.getPublishVideoPermission(this.client.getEndpoint(), cookie, ds, accept, updatedContext);
            });
    }
}
