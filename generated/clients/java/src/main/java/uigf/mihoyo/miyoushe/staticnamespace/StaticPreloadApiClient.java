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
     * @param ds The ds parameter.
     * @param cookie The cookie parameter.
     * @param requestContext The context to configure the HTTP request before HTTP client sends it.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws HttpResponseException thrown if the service returns an error.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return common response wrapper returned by MiHoYo and HoYoLAB services along with {@link Response}.
     */
    @Metadata(properties = { MetadataProperties.GENERATED })
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Response<ApiResponseStaticLatestVersionData> getLatestVersionWithResponse(String ds, String cookie,
        RequestContext requestContext) {
        return this.instrumentation.instrumentWithResponse(
            "UIGF.Mihoyo.MiYouShe.Static.StaticPreloadApi.getLatestVersion", requestContext,
            updatedContext -> this.serviceClient.getLatestVersionWithResponse(ds, cookie, updatedContext));
    }

    /**
     * The getLatestVersion operation.
     * 
     * @param ds The ds parameter.
     * @param cookie The cookie parameter.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws HttpResponseException thrown if the service returns an error.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return common response wrapper returned by MiHoYo and HoYoLAB services.
     */
    @Metadata(properties = { MetadataProperties.GENERATED })
    @ServiceMethod(returns = ReturnType.SINGLE)
    public ApiResponseStaticLatestVersionData getLatestVersion(String ds, String cookie) {
        return getLatestVersionWithResponse(ds, cookie, RequestContext.none()).getValue();
    }

    /**
     * The getLatestVersion operation.
     * 
     * @param ds The ds parameter.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws HttpResponseException thrown if the service returns an error.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return common response wrapper returned by MiHoYo and HoYoLAB services.
     */
    @Metadata(properties = { MetadataProperties.GENERATED })
    @ServiceMethod(returns = ReturnType.SINGLE)
    public ApiResponseStaticLatestVersionData getLatestVersion(String ds) {
        final String cookie = null;
        return getLatestVersionWithResponse(ds, cookie, RequestContext.none()).getValue();
    }
}
