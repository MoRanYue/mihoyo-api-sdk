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
import uigf.mihoyo.ApiResponseStaticResourceVersionsData;
import uigf.mihoyo.checkin.implementation.StaticMiscApisImpl;

/**
 * Initializes a new instance of the synchronous StaticClient type.
 */
@ServiceClient(builder = StaticClientBuilder.class)
public final class StaticMiscApiClient {
    @Metadata(properties = { MetadataProperties.GENERATED })
    private final StaticMiscApisImpl serviceClient;

    private final Instrumentation instrumentation;

    /**
     * Initializes an instance of StaticMiscApiClient class.
     * 
     * @param serviceClient the service client implementation.
     * @param instrumentation the instrumentation instance.
     */
    @Metadata(properties = { MetadataProperties.GENERATED })
    StaticMiscApiClient(StaticMiscApisImpl serviceClient, Instrumentation instrumentation) {
        this.serviceClient = serviceClient;
        this.instrumentation = instrumentation;
    }

    /**
     * The getAllResourceVersions operation.
     * 
     * @param cookie The cookie parameter.
     * @param ds The ds parameter.
     * @param requestContext The context to configure the HTTP request before HTTP client sends it.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws HttpResponseException thrown if the service returns an error.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return common response wrapper returned by MiHoYo and HoYoLAB services along with {@link Response}.
     */
    @Metadata(properties = { MetadataProperties.GENERATED })
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Response<ApiResponseStaticResourceVersionsData> getAllResourceVersionsWithResponse(String cookie, String ds,
        RequestContext requestContext) {
        return this.instrumentation.instrumentWithResponse(
            "UIGF.Mihoyo.MiYouShe.Static.StaticMiscApi.getAllResourceVersions", requestContext,
            updatedContext -> this.serviceClient.getAllResourceVersionsWithResponse(cookie, ds, updatedContext));
    }

    /**
     * The getAllResourceVersions operation.
     * 
     * @param cookie The cookie parameter.
     * @param ds The ds parameter.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws HttpResponseException thrown if the service returns an error.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return common response wrapper returned by MiHoYo and HoYoLAB services.
     */
    @Metadata(properties = { MetadataProperties.GENERATED })
    @ServiceMethod(returns = ReturnType.SINGLE)
    public ApiResponseStaticResourceVersionsData getAllResourceVersions(String cookie, String ds) {
        return getAllResourceVersionsWithResponse(cookie, ds, RequestContext.none()).getValue();
    }

    /**
     * The getAllResourceVersions operation.
     * 
     * @throws HttpResponseException thrown if the service returns an error.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return common response wrapper returned by MiHoYo and HoYoLAB services.
     */
    @Metadata(properties = { MetadataProperties.GENERATED })
    @ServiceMethod(returns = ReturnType.SINGLE)
    public ApiResponseStaticResourceVersionsData getAllResourceVersions() {
        final String cookie = null;
        final String ds = null;
        return getAllResourceVersionsWithResponse(cookie, ds, RequestContext.none()).getValue();
    }
}
