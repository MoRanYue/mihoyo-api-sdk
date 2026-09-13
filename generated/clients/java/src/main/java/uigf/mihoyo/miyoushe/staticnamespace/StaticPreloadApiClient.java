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
import uigf.mihoyo.ApiResponseStaticLatestVersionData;
import uigf.mihoyo.checkin.implementation.StaticPreloadApisImpl;

/**
 * Initializes a new instance of the synchronous StaticClient type.
 */
@ServiceClient(builder = StaticClientBuilder.class)
public final class StaticPreloadApiClient {
    @Metadata(properties = { MetadataProperties.GENERATED })
    private final StaticPreloadApisImpl serviceClient;

    private final Instrumentation instrumentation;

    /**
     * Initializes an instance of StaticPreloadApiClient class.
     * 
     * @param serviceClient the service client implementation.
     * @param instrumentation the instrumentation instance.
     */
    @Metadata(properties = { MetadataProperties.GENERATED })
    StaticPreloadApiClient(StaticPreloadApisImpl serviceClient, Instrumentation instrumentation) {
        this.serviceClient = serviceClient;
        this.instrumentation = instrumentation;
    }

    /**
     * The getLatestVersion operation.
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
    public Response<ApiResponseStaticLatestVersionData> getLatestVersionWithResponse(String cookie, String ds,
        RequestContext requestContext) {
        return this.instrumentation.instrumentWithResponse(
            "UIGF.Mihoyo.MiYouShe.Static.StaticPreloadApi.getLatestVersion", requestContext,
            updatedContext -> this.serviceClient.getLatestVersionWithResponse(cookie, ds, updatedContext));
    }

    /**
     * The getLatestVersion operation.
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
    public ApiResponseStaticLatestVersionData getLatestVersion(String cookie, String ds) {
        return getLatestVersionWithResponse(cookie, ds, RequestContext.none()).getValue();
    }

    /**
     * The getLatestVersion operation.
     * 
     * @throws HttpResponseException thrown if the service returns an error.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return common response wrapper returned by MiHoYo and HoYoLAB services.
     */
    @Metadata(properties = { MetadataProperties.GENERATED })
    @ServiceMethod(returns = ReturnType.SINGLE)
    public ApiResponseStaticLatestVersionData getLatestVersion() {
        final String cookie = null;
        final String ds = null;
        return getLatestVersionWithResponse(cookie, ds, RequestContext.none()).getValue();
    }
}
