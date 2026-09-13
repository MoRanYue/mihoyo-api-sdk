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
import uigf.mihoyo.api.request.H5CollectorUploadRequest;
import uigf.mihoyo.uncategorized.UploadResponse;

/**
 * An instance of this class provides access to all the operations defined in H5CollectorUploadApis.
 */
public final class H5CollectorUploadApisImpl {
    /**
     * The proxy service used to perform REST calls.
     */
    private final H5CollectorUploadApisService service;

    /**
     * The service client containing this operation class.
     */
    private final H5CollectorClientImpl client;

    /**
     * The instance of instrumentation to report telemetry.
     */
    private final Instrumentation instrumentation;

    /**
     * Initializes an instance of H5CollectorUploadApisImpl.
     * 
     * @param client the instance of the service client containing this operation class.
     */
    H5CollectorUploadApisImpl(H5CollectorClientImpl client) {
        this.service = H5CollectorUploadApisService.getNewInstance(client.getHttpPipeline());
        this.client = client;
        this.instrumentation = client.getInstrumentation();
    }

    /**
     * The interface defining all the services for H5CollectorClientH5CollectorUploadApis to be used by the proxy
     * service to perform REST calls.
     */
    @ServiceInterface(name = "H5CollectorClientH5CollectorUploadApis", host = "{endpoint}")
    public interface H5CollectorUploadApisService {
        static H5CollectorUploadApisService getNewInstance(HttpPipeline pipeline) {
            try {
                Class<?> clazz = Class.forName("uigf.mihoyo.checkin.implementation.H5CollectorUploadApisServiceImpl");
                return (H5CollectorUploadApisService) clazz.getMethod("getNewInstance", HttpPipeline.class)
                    .invoke(null, pipeline);
            } catch (ClassNotFoundException | NoSuchMethodException | IllegalAccessException
                | InvocationTargetException e) {
                throw new RuntimeException(e);
            }

        }

        @HttpRequestInformation(method = HttpMethod.POST, path = "/h5/upload", expectedStatusCodes = { 200 })
        @UnexpectedResponseExceptionDetail
        Response<UploadResponse> upload(@HostParam("endpoint") String endpoint, @HeaderParam("Cookie") String cookie,
            @QueryParam("timestamp") long timestamp, @QueryParam("verification") String verification,
            @HeaderParam("Content-Type") String contentType, @HeaderParam("Accept") String accept,
            @BodyParam("application/json") H5CollectorUploadRequest body, RequestContext requestContext);
    }

    /**
     * The upload operation.
     * 
     * @param timestamp The timestamp parameter.
     * @param verification The verification parameter.
     * @param body The body parameter.
     * @param cookie The cookie parameter.
     * @param requestContext The context to configure the HTTP request before HTTP client sends it.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws HttpResponseException thrown if the service returns an error.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the response body along with {@link Response}.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Response<UploadResponse> uploadWithResponse(long timestamp, String verification,
        H5CollectorUploadRequest body, String cookie, RequestContext requestContext) {
        return this.instrumentation.instrumentWithResponse(
            "UIGF.Mihoyo.Uncategorized.Telemetry.H5Collector.UploadApi.upload", requestContext, updatedContext -> {
                final String contentType = "application/json";
                final String accept = "application/json";
                return service.upload(this.client.getEndpoint(), cookie, timestamp, verification, contentType, accept,
                    body, updatedContext);
            });
    }
}
