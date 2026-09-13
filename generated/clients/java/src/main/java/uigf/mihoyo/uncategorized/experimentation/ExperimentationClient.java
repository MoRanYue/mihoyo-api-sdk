package uigf.mihoyo.uncategorized.experimentation;

import io.clientcore.core.annotations.Metadata;
import io.clientcore.core.annotations.MetadataProperties;
import io.clientcore.core.annotations.ReturnType;
import io.clientcore.core.annotations.ServiceClient;
import io.clientcore.core.annotations.ServiceMethod;
import io.clientcore.core.http.models.HttpResponseException;
import io.clientcore.core.http.models.RequestContext;
import io.clientcore.core.http.models.Response;
import io.clientcore.core.instrumentation.Instrumentation;
import uigf.mihoyo.checkin.implementation.ExperimentApisImpl;
import uigf.mihoyo.uncategorized.ExperimentListRequest;
import uigf.mihoyo.uncategorized.ExperimentListResponse;

/**
 * Initializes a new instance of the synchronous ExperimentationClient type.
 */
@ServiceClient(builder = ExperimentationClientBuilder.class)
public final class ExperimentationClient {
    @Metadata(properties = { MetadataProperties.GENERATED })
    private final ExperimentApisImpl serviceClient;

    private final Instrumentation instrumentation;

    /**
     * Initializes an instance of ExperimentationClient class.
     * 
     * @param serviceClient the service client implementation.
     * @param instrumentation the instrumentation instance.
     */
    @Metadata(properties = { MetadataProperties.GENERATED })
    ExperimentationClient(ExperimentApisImpl serviceClient, Instrumentation instrumentation) {
        this.serviceClient = serviceClient;
        this.instrumentation = instrumentation;
    }

    /**
     * The list operation.
     * 
     * @param body The body parameter.
     * @param requestContext The context to configure the HTTP request before HTTP client sends it.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws HttpResponseException thrown if the service returns an error.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the response body along with {@link Response}.
     */
    @Metadata(properties = { MetadataProperties.GENERATED })
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Response<ExperimentListResponse> listWithResponse(ExperimentListRequest body,
        RequestContext requestContext) {
        return this.instrumentation.instrumentWithResponse(
            "UIGF.Mihoyo.Uncategorized.Experimentation.ExperimentApi.list", requestContext,
            updatedContext -> this.serviceClient.listWithResponse(body, updatedContext));
    }

    /**
     * The list operation.
     * 
     * @param body The body parameter.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws HttpResponseException thrown if the service returns an error.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the response.
     */
    @Metadata(properties = { MetadataProperties.GENERATED })
    @ServiceMethod(returns = ReturnType.SINGLE)
    public ExperimentListResponse list(ExperimentListRequest body) {
        return listWithResponse(body, RequestContext.none()).getValue();
    }
}
