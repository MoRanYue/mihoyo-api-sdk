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
import uigf.mihoyo.ApiResponsePassportSwitchStatusData;

/**
 * An instance of this class provides access to all the operations defined in SwitchApis.
 */
public final class SwitchApisImpl {
    /**
     * The proxy service used to perform REST calls.
     */
    private final SwitchApisService service;

    /**
     * The service client containing this operation class.
     */
    private final PassportStaticClientImpl client;

    /**
     * The instance of instrumentation to report telemetry.
     */
    private final Instrumentation instrumentation;

    /**
     * Initializes an instance of SwitchApisImpl.
     * 
     * @param client the instance of the service client containing this operation class.
     */
    SwitchApisImpl(PassportStaticClientImpl client) {
        this.service = SwitchApisService.getNewInstance(client.getHttpPipeline());
        this.client = client;
        this.instrumentation = client.getInstrumentation();
    }

    /**
     * The interface defining all the services for PassportStaticClientSwitchApis to be used by the proxy service to
     * perform REST calls.
     */
    @ServiceInterface(name = "PassportStaticClientSwitchApis", host = "{endpoint}")
    public interface SwitchApisService {
        static SwitchApisService getNewInstance(HttpPipeline pipeline) {
            try {
                Class<?> clazz = Class.forName("uigf.mihoyo.checkin.implementation.SwitchApisServiceImpl");
                return (SwitchApisService) clazz.getMethod("getNewInstance", HttpPipeline.class).invoke(null, pipeline);
            } catch (ClassNotFoundException | NoSuchMethodException | IllegalAccessException
                | InvocationTargetException e) {
                throw new RuntimeException(e);
            }

        }

        @HttpRequestInformation(
            method = HttpMethod.GET,
            path = "/account/ma-cn-passport/passport/getSwitchStatus",
            expectedStatusCodes = { 200 })
        @UnexpectedResponseExceptionDetail
        Response<ApiResponsePassportSwitchStatusData> getSwitchStatus(@HostParam("endpoint") String endpoint,
            @HeaderParam("DS") String ds, @QueryParam("app_id") String appId, @QueryParam("platform") int platform,
            @HeaderParam("Accept") String accept, RequestContext requestContext);
    }

    /**
     * The getSwitchStatus operation.
     * 
     * @param appId The appId parameter.
     * @param platform The platform parameter.
     * @param ds The ds parameter.
     * @param requestContext The context to configure the HTTP request before HTTP client sends it.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws HttpResponseException thrown if the service returns an error.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return common response wrapper returned by MiHoYo and HoYoLAB services along with {@link Response}.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Response<ApiResponsePassportSwitchStatusData> getSwitchStatusWithResponse(String appId, int platform,
        String ds, RequestContext requestContext) {
        return this.instrumentation.instrumentWithResponse("UIGF.Mihoyo.PassportStatic.SwitchApi.getSwitchStatus",
            requestContext, updatedContext -> {
                final String accept = "application/json";
                return service.getSwitchStatus(this.client.getEndpoint(), ds, appId, platform, accept, updatedContext);
            });
    }
}
