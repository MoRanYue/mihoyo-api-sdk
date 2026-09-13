package uigf.mihoyo.uncategorized.telemetry.login;

import io.clientcore.core.annotations.Metadata;
import io.clientcore.core.annotations.MetadataProperties;
import io.clientcore.core.annotations.ReturnType;
import io.clientcore.core.annotations.ServiceClient;
import io.clientcore.core.annotations.ServiceMethod;
import io.clientcore.core.http.models.HttpResponseException;
import io.clientcore.core.http.models.RequestContext;
import io.clientcore.core.http.models.Response;
import io.clientcore.core.instrumentation.Instrumentation;
import java.util.List;
import uigf.mihoyo.api.request.LoginTelemetryEvent;
import uigf.mihoyo.checkin.implementation.LoginTelemetryUploadApisImpl;
import uigf.mihoyo.uncategorized.UploadResponse;

/**
 * Initializes a new instance of the synchronous LoginTelemetryClient type.
 */
@ServiceClient(builder = LoginTelemetryClientBuilder.class)
public final class LoginTelemetryClient {
    @Metadata(properties = { MetadataProperties.GENERATED })
    private final LoginTelemetryUploadApisImpl serviceClient;

    private final Instrumentation instrumentation;

    /**
     * Initializes an instance of LoginTelemetryClient class.
     * 
     * @param serviceClient the service client implementation.
     * @param instrumentation the instrumentation instance.
     */
    @Metadata(properties = { MetadataProperties.GENERATED })
    LoginTelemetryClient(LoginTelemetryUploadApisImpl serviceClient, Instrumentation instrumentation) {
        this.serviceClient = serviceClient;
        this.instrumentation = instrumentation;
    }

    /**
     * The upload operation.
     * 
     * @param authorization The authorization parameter.
     * @param body The body parameter.
     * @param requestContext The context to configure the HTTP request before HTTP client sends it.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws HttpResponseException thrown if the service returns an error.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the response body along with {@link Response}.
     */
    @Metadata(properties = { MetadataProperties.GENERATED })
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Response<UploadResponse> uploadWithResponse(String authorization, List<LoginTelemetryEvent> body,
        RequestContext requestContext) {
        return this.instrumentation.instrumentWithResponse("UIGF.Mihoyo.Uncategorized.Telemetry.Login.UploadApi.upload",
            requestContext,
            updatedContext -> this.serviceClient.uploadWithResponse(authorization, body, updatedContext));
    }

    /**
     * The upload operation.
     * 
     * @param authorization The authorization parameter.
     * @param body The body parameter.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws HttpResponseException thrown if the service returns an error.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the response.
     */
    @Metadata(properties = { MetadataProperties.GENERATED })
    @ServiceMethod(returns = ReturnType.SINGLE)
    public UploadResponse upload(String authorization, List<LoginTelemetryEvent> body) {
        return uploadWithResponse(authorization, body, RequestContext.none()).getValue();
    }
}
