package uigf.mihoyo.checkin.implementation;

import io.clientcore.core.annotations.ReturnType;
import io.clientcore.core.annotations.ServiceInterface;
import io.clientcore.core.annotations.ServiceMethod;
import io.clientcore.core.http.annotations.BodyParam;
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
import uigf.mihoyo.api.request.CommunityTelemetryUploadRequest;
import uigf.mihoyo.uncategorized.UploadResponse;

/**
 * An instance of this class provides access to all the operations defined in CommunityTelemetryUploadApis.
 */
public final class CommunityTelemetryUploadApisImpl {
    /**
     * The proxy service used to perform REST calls.
     */
    private final CommunityTelemetryUploadApisService service;

    /**
     * The service client containing this operation class.
     */
    private final CommunityTelemetryClientImpl client;

    /**
     * The instance of instrumentation to report telemetry.
     */
    private final Instrumentation instrumentation;

    /**
     * Initializes an instance of CommunityTelemetryUploadApisImpl.
     * 
     * @param client the instance of the service client containing this operation class.
     */
    CommunityTelemetryUploadApisImpl(CommunityTelemetryClientImpl client) {
        this.service = CommunityTelemetryUploadApisService.getNewInstance(client.getHttpPipeline());
        this.client = client;
        this.instrumentation = client.getInstrumentation();
    }

    /**
     * The interface defining all the services for CommunityTelemetryClientCommunityTelemetryUploadApis to be used by
     * the proxy service to perform REST calls.
     */
    @ServiceInterface(name = "CommunityTelemetryClientCommunityTelemetryUploadApis", host = "{endpoint}")
    public interface CommunityTelemetryUploadApisService {
        static CommunityTelemetryUploadApisService getNewInstance(HttpPipeline pipeline) {
            try {
                Class<?> clazz
                    = Class.forName("uigf.mihoyo.checkin.implementation.CommunityTelemetryUploadApisServiceImpl");
                return (CommunityTelemetryUploadApisService) clazz.getMethod("getNewInstance", HttpPipeline.class)
                    .invoke(null, pipeline);
            } catch (ClassNotFoundException | NoSuchMethodException | IllegalAccessException
                | InvocationTargetException e) {
                throw new RuntimeException(e);
            }

        }

        @HttpRequestInformation(
            method = HttpMethod.POST,
            path = "/log/bbs_app/upload/v2",
            expectedStatusCodes = { 200 })
        @UnexpectedResponseExceptionDetail
        Response<UploadResponse> upload(@HostParam("endpoint") String endpoint,
            @HeaderParam("Content-Type") String contentType, @HeaderParam("Accept") String accept,
            @BodyParam("application/json") CommunityTelemetryUploadRequest body, RequestContext requestContext);
    }

    /**
     * The upload operation.
     * 
     * @param body The body parameter.
     * @param requestContext The context to configure the HTTP request before HTTP client sends it.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws HttpResponseException thrown if the service returns an error.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the response body along with {@link Response}.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Response<UploadResponse> uploadWithResponse(CommunityTelemetryUploadRequest body,
        RequestContext requestContext) {
        return this.instrumentation.instrumentWithResponse(
            "UIGF.Mihoyo.Uncategorized.Telemetry.Community.UploadApi.upload", requestContext, updatedContext -> {
                final String contentType = "application/json";
                final String accept = "application/json";
                return service.upload(this.client.getEndpoint(), contentType, accept, body, updatedContext);
            });
    }
}
