package uigf.mihoyo.passport;

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
import uigf.mihoyo.checkin.implementation.WebSessionApisImpl;

/**
 * Initializes a new instance of the synchronous PassportClient type.
 */
@ServiceClient(builder = PassportClientBuilder.class)
public final class WebSessionApiClient {
    @Metadata(properties = { MetadataProperties.GENERATED })
    private final WebSessionApisImpl serviceClient;

    private final Instrumentation instrumentation;

    /**
     * Initializes an instance of WebSessionApiClient class.
     * 
     * @param serviceClient the service client implementation.
     * @param instrumentation the instrumentation instance.
     */
    @Metadata(properties = { MetadataProperties.GENERATED })
    WebSessionApiClient(WebSessionApisImpl serviceClient, Instrumentation instrumentation) {
        this.serviceClient = serviceClient;
        this.instrumentation = instrumentation;
    }

    /**
     * Verifies a caller-provided browser session cookie.
     * 
     * @param cookie The cookie parameter.
     * @param requestContext The context to configure the HTTP request before HTTP client sends it.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws HttpResponseException thrown if the service returns an error.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return common response wrapper returned by MiHoYo and HoYoLAB services along with {@link Response}.
     */
    @Metadata(properties = { MetadataProperties.GENERATED })
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Response<ApiResponse> verifyCookieTokenWithResponse(String cookie, RequestContext requestContext) {
        return this.instrumentation.instrumentWithResponse("UIGF.Mihoyo.Passport.WebSessionApi.verifyCookieToken",
            requestContext, updatedContext -> this.serviceClient.verifyCookieTokenWithResponse(cookie, updatedContext));
    }

    /**
     * Verifies a caller-provided browser session cookie.
     * 
     * @param cookie The cookie parameter.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws HttpResponseException thrown if the service returns an error.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return common response wrapper returned by MiHoYo and HoYoLAB services.
     */
    @Metadata(properties = { MetadataProperties.GENERATED })
    @ServiceMethod(returns = ReturnType.SINGLE)
    public ApiResponse verifyCookieToken(String cookie) {
        return verifyCookieTokenWithResponse(cookie, RequestContext.none()).getValue();
    }
}
