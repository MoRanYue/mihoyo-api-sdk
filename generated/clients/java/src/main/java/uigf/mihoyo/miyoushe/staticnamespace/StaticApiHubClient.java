package uigf.mihoyo.miyoushe.staticnamespace;

import io.clientcore.core.annotations.Metadata;
import io.clientcore.core.annotations.MetadataProperties;
import io.clientcore.core.annotations.ReturnType;
import io.clientcore.core.annotations.ServiceClient;
import io.clientcore.core.annotations.ServiceMethod;
import io.clientcore.core.http.models.HttpResponseException;
import io.clientcore.core.http.models.RequestContext;
import io.clientcore.core.http.models.Response;
import io.clientcore.core.instrumentation.Instrumentation;
import uigf.mihoyo.ApiResponseStaticResourceData;
import uigf.mihoyo.checkin.implementation.StaticApiHubsImpl;

/**
 * Initializes a new instance of the synchronous StaticClient type.
 */
@ServiceClient(builder = StaticClientBuilder.class)
public final class StaticApiHubClient {
    @Metadata(properties = { MetadataProperties.GENERATED })
    private final StaticApiHubsImpl serviceClient;

    private final Instrumentation instrumentation;

    /**
     * Initializes an instance of StaticApiHubClient class.
     * 
     * @param serviceClient the service client implementation.
     * @param instrumentation the instrumentation instance.
     */
    @Metadata(properties = { MetadataProperties.GENERATED })
    StaticApiHubClient(StaticApiHubsImpl serviceClient, Instrumentation instrumentation) {
        this.serviceClient = serviceClient;
        this.instrumentation = instrumentation;
    }

    /**
     * The getStaticResource operation.
     * 
     * @param ds The ds parameter.
     * @param clientType The clientType parameter.
     * @param cookie The cookie parameter.
     * @param requestContext The context to configure the HTTP request before HTTP client sends it.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws HttpResponseException thrown if the service returns an error.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return common response wrapper returned by MiHoYo and HoYoLAB services along with {@link Response}.
     */
    @Metadata(properties = { MetadataProperties.GENERATED })
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Response<ApiResponseStaticResourceData> getStaticResourceWithResponse(String ds, int clientType,
        String cookie, RequestContext requestContext) {
        return this.instrumentation.instrumentWithResponse("UIGF.Mihoyo.MiYouShe.Static.StaticApiHub.getStaticResource",
            requestContext,
            updatedContext -> this.serviceClient.getStaticResourceWithResponse(ds, clientType, cookie, updatedContext));
    }

    /**
     * The getStaticResource operation.
     * 
     * @param ds The ds parameter.
     * @param clientType The clientType parameter.
     * @param cookie The cookie parameter.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws HttpResponseException thrown if the service returns an error.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return common response wrapper returned by MiHoYo and HoYoLAB services.
     */
    @Metadata(properties = { MetadataProperties.GENERATED })
    @ServiceMethod(returns = ReturnType.SINGLE)
    public ApiResponseStaticResourceData getStaticResource(String ds, int clientType, String cookie) {
        return getStaticResourceWithResponse(ds, clientType, cookie, RequestContext.none()).getValue();
    }

    /**
     * The getStaticResource operation.
     * 
     * @param ds The ds parameter.
     * @param clientType The clientType parameter.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws HttpResponseException thrown if the service returns an error.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return common response wrapper returned by MiHoYo and HoYoLAB services.
     */
    @Metadata(properties = { MetadataProperties.GENERATED })
    @ServiceMethod(returns = ReturnType.SINGLE)
    public ApiResponseStaticResourceData getStaticResource(String ds, int clientType) {
        final String cookie = null;
        return getStaticResourceWithResponse(ds, clientType, cookie, RequestContext.none()).getValue();
    }
}
