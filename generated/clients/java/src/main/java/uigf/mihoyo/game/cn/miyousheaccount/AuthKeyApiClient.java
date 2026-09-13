package uigf.mihoyo.game.cn.miyousheaccount;

import io.clientcore.core.annotations.Metadata;
import io.clientcore.core.annotations.MetadataProperties;
import io.clientcore.core.annotations.ReturnType;
import io.clientcore.core.annotations.ServiceClient;
import io.clientcore.core.annotations.ServiceMethod;
import io.clientcore.core.http.models.HttpResponseException;
import io.clientcore.core.http.models.RequestContext;
import io.clientcore.core.http.models.Response;
import io.clientcore.core.instrumentation.Instrumentation;
import uigf.mihoyo.ApiResponseAuthKeyData;
import uigf.mihoyo.checkin.implementation.AuthKeyApisImpl;
import uigf.mihoyo.game.AuthKeyRequest;

/**
 * Initializes a new instance of the synchronous MiYouSheAccountClient type.
 */
@ServiceClient(builder = MiYouSheAccountClientBuilder.class)
public final class AuthKeyApiClient {
    @Metadata(properties = { MetadataProperties.GENERATED })
    private final AuthKeyApisImpl serviceClient;

    private final Instrumentation instrumentation;

    /**
     * Initializes an instance of AuthKeyApiClient class.
     * 
     * @param serviceClient the service client implementation.
     * @param instrumentation the instrumentation instance.
     */
    @Metadata(properties = { MetadataProperties.GENERATED })
    AuthKeyApiClient(AuthKeyApisImpl serviceClient, Instrumentation instrumentation) {
        this.serviceClient = serviceClient;
        this.instrumentation = instrumentation;
    }

    /**
     * The generate operation.
     * 
     * @param cookie The cookie parameter.
     * @param ds The ds parameter.
     * @param body The body parameter.
     * @param requestContext The context to configure the HTTP request before HTTP client sends it.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws HttpResponseException thrown if the service returns an error.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return common response wrapper returned by MiHoYo and HoYoLAB services along with {@link Response}.
     */
    @Metadata(properties = { MetadataProperties.GENERATED })
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Response<ApiResponseAuthKeyData> generateWithResponse(String cookie, String ds, AuthKeyRequest body,
        RequestContext requestContext) {
        return this.instrumentation.instrumentWithResponse("UIGF.Mihoyo.Game.CN.MiYouSheAccount.AuthKeyApi.generate",
            requestContext,
            updatedContext -> this.serviceClient.generateWithResponse(cookie, ds, body, updatedContext));
    }

    /**
     * The generate operation.
     * 
     * @param cookie The cookie parameter.
     * @param ds The ds parameter.
     * @param body The body parameter.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws HttpResponseException thrown if the service returns an error.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return common response wrapper returned by MiHoYo and HoYoLAB services.
     */
    @Metadata(properties = { MetadataProperties.GENERATED })
    @ServiceMethod(returns = ReturnType.SINGLE)
    public ApiResponseAuthKeyData generate(String cookie, String ds, AuthKeyRequest body) {
        return generateWithResponse(cookie, ds, body, RequestContext.none()).getValue();
    }
}
