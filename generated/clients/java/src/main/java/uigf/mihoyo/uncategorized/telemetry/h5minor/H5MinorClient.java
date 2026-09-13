package uigf.mihoyo.uncategorized.telemetry.h5minor;

import io.clientcore.core.annotations.Metadata;
import io.clientcore.core.annotations.MetadataProperties;
import io.clientcore.core.annotations.ReturnType;
import io.clientcore.core.annotations.ServiceClient;
import io.clientcore.core.annotations.ServiceMethod;
import io.clientcore.core.http.models.HttpResponseException;
import io.clientcore.core.http.models.RequestContext;
import io.clientcore.core.http.models.Response;
import io.clientcore.core.instrumentation.Instrumentation;
import uigf.mihoyo.ApiResponse;
import uigf.mihoyo.checkin.implementation.H5MinorBatchApisImpl;
import uigf.mihoyo.uncategorized.H5LogRequest;

/**
 * Initializes a new instance of the synchronous H5MinorClient type.
 */
@ServiceClient(builder = H5MinorClientBuilder.class)
public final class H5MinorClient {
    @Metadata(properties = { MetadataProperties.GENERATED })
    private final H5MinorBatchApisImpl serviceClient;

    private final Instrumentation instrumentation;

    /**
     * Initializes an instance of H5MinorClient class.
     * 
     * @param serviceClient the service client implementation.
     * @param instrumentation the instrumentation instance.
     */
    @Metadata(properties = { MetadataProperties.GENERATED })
    H5MinorClient(H5MinorBatchApisImpl serviceClient, Instrumentation instrumentation) {
        this.serviceClient = serviceClient;
        this.instrumentation = instrumentation;
    }

    /**
     * The upload operation.
     * 
     * @param topic The topic parameter.
     * @param body The body parameter.
     * @param requestContext The context to configure the HTTP request before HTTP client sends it.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws HttpResponseException thrown if the service returns an error.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return common response wrapper returned by MiHoYo and HoYoLAB services along with {@link Response}.
     */
    @Metadata(properties = { MetadataProperties.GENERATED })
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Response<ApiResponse> uploadWithResponse(String topic, H5LogRequest body, RequestContext requestContext) {
        return this.instrumentation.instrumentWithResponse(
            "UIGF.Mihoyo.Uncategorized.Telemetry.H5Minor.BatchApi.upload", requestContext,
            updatedContext -> this.serviceClient.uploadWithResponse(topic, body, updatedContext));
    }

    /**
     * The upload operation.
     * 
     * @param topic The topic parameter.
     * @param body The body parameter.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws HttpResponseException thrown if the service returns an error.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return common response wrapper returned by MiHoYo and HoYoLAB services.
     */
    @Metadata(properties = { MetadataProperties.GENERATED })
    @ServiceMethod(returns = ReturnType.SINGLE)
    public ApiResponse upload(String topic, H5LogRequest body) {
        return uploadWithResponse(topic, body, RequestContext.none()).getValue();
    }
}
