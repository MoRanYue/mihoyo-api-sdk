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
import uigf.mihoyo.ApiResponsePatchData;

/**
 * An instance of this class provides access to all the operations defined in PatchApis.
 */
public final class PatchApisImpl {
    /**
     * The proxy service used to perform REST calls.
     */
    private final PatchApisService service;

    /**
     * The service client containing this operation class.
     */
    private final AccountExtensionClientImpl client;

    /**
     * The instance of instrumentation to report telemetry.
     */
    private final Instrumentation instrumentation;

    /**
     * Initializes an instance of PatchApisImpl.
     * 
     * @param client the instance of the service client containing this operation class.
     */
    PatchApisImpl(AccountExtensionClientImpl client) {
        this.service = PatchApisService.getNewInstance(client.getHttpPipeline());
        this.client = client;
        this.instrumentation = client.getInstrumentation();
    }

    /**
     * The interface defining all the services for AccountExtensionClientPatchApis to be used by the proxy service to
     * perform REST calls.
     */
    @ServiceInterface(name = "AccountExtensionClientPatchApis", host = "{endpoint}")
    public interface PatchApisService {
        static PatchApisService getNewInstance(HttpPipeline pipeline) {
            try {
                Class<?> clazz = Class.forName("uigf.mihoyo.checkin.implementation.PatchApisServiceImpl");
                return (PatchApisService) clazz.getMethod("getNewInstance", HttpPipeline.class).invoke(null, pipeline);
            } catch (ClassNotFoundException | NoSuchMethodException | IllegalAccessException
                | InvocationTargetException e) {
                throw new RuntimeException(e);
            }

        }

        @HttpRequestInformation(
            method = HttpMethod.GET,
            path = "/ptolemaios_api/api/getPatch",
            expectedStatusCodes = { 200 })
        @UnexpectedResponseExceptionDetail
        Response<ApiResponsePatchData> getPatch(@HostParam("endpoint") String endpoint, @QueryParam("app_id") int appId,
            @QueryParam("app_version") String appVersion, @QueryParam("channel") String channel,
            @QueryParam("game_version") String gameVersion, @HeaderParam("Accept") String accept,
            RequestContext requestContext);
    }

    /**
     * The getPatch operation.
     * 
     * @param appId The appId parameter.
     * @param appVersion The appVersion parameter.
     * @param channel The channel parameter.
     * @param gameVersion The gameVersion parameter.
     * @param requestContext The context to configure the HTTP request before HTTP client sends it.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws HttpResponseException thrown if the service returns an error.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return common response wrapper returned by MiHoYo and HoYoLAB services along with {@link Response}.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Response<ApiResponsePatchData> getPatchWithResponse(int appId, String appVersion, String channel,
        String gameVersion, RequestContext requestContext) {
        return this.instrumentation.instrumentWithResponse("UIGF.Mihoyo.Game.CN.AccountExtension.PatchApi.getPatch",
            requestContext, updatedContext -> {
                final String accept = "application/json";
                return service.getPatch(this.client.getEndpoint(), appId, appVersion, channel, gameVersion, accept,
                    updatedContext);
            });
    }
}
