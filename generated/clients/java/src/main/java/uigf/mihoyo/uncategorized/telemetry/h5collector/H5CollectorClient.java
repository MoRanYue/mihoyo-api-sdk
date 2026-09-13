package uigf.mihoyo.uncategorized.telemetry.h5collector;

import io.clientcore.core.annotations.Metadata;
import io.clientcore.core.annotations.MetadataProperties;
import io.clientcore.core.annotations.ReturnType;
import io.clientcore.core.annotations.ServiceClient;
import io.clientcore.core.annotations.ServiceMethod;
import io.clientcore.core.http.models.HttpResponseException;
import io.clientcore.core.http.models.RequestContext;
import io.clientcore.core.http.models.Response;
import io.clientcore.core.instrumentation.Instrumentation;
import uigf.mihoyo.api.request.H5CollectorUploadRequest;
import uigf.mihoyo.checkin.implementation.H5CollectorUploadApisImpl;
import uigf.mihoyo.uncategorized.UploadResponse;

/**
 * Initializes a new instance of the synchronous H5CollectorClient type.
 */
@ServiceClient(builder = H5CollectorClientBuilder.class)
public final class H5CollectorClient {
    @Metadata(properties = { MetadataProperties.GENERATED })
    private final H5CollectorUploadApisImpl serviceClient;

    private final Instrumentation instrumentation;

    /**
     * Initializes an instance of H5CollectorClient class.
     * 
     * @param serviceClient the service client implementation.
     * @param instrumentation the instrumentation instance.
     */
    @Metadata(properties = { MetadataProperties.GENERATED })
    H5CollectorClient(H5CollectorUploadApisImpl serviceClient, Instrumentation instrumentation) {
        this.serviceClient = serviceClient;
        this.instrumentation = instrumentation;
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
    @Metadata(properties = { MetadataProperties.GENERATED })
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Response<UploadResponse> uploadWithResponse(long timestamp, String verification,
        H5CollectorUploadRequest body, String cookie, RequestContext requestContext) {
        return this.instrumentation.instrumentWithResponse(
            "UIGF.Mihoyo.Uncategorized.Telemetry.H5Collector.UploadApi.upload", requestContext,
            updatedContext -> this.serviceClient.uploadWithResponse(timestamp, verification, body, cookie,
                updatedContext));
    }

    /**
     * The upload operation.
     * 
     * @param timestamp The timestamp parameter.
     * @param verification The verification parameter.
     * @param body The body parameter.
     * @param cookie The cookie parameter.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws HttpResponseException thrown if the service returns an error.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the response.
     */
    @Metadata(properties = { MetadataProperties.GENERATED })
    @ServiceMethod(returns = ReturnType.SINGLE)
    public UploadResponse upload(long timestamp, String verification, H5CollectorUploadRequest body, String cookie) {
        return uploadWithResponse(timestamp, verification, body, cookie, RequestContext.none()).getValue();
    }

    /**
     * The upload operation.
     * 
     * @param timestamp The timestamp parameter.
     * @param verification The verification parameter.
     * @param body The body parameter.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws HttpResponseException thrown if the service returns an error.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the response.
     */
    @Metadata(properties = { MetadataProperties.GENERATED })
    @ServiceMethod(returns = ReturnType.SINGLE)
    public UploadResponse upload(long timestamp, String verification, H5CollectorUploadRequest body) {
        final String cookie = null;
        return uploadWithResponse(timestamp, verification, body, cookie, RequestContext.none()).getValue();
    }
}
