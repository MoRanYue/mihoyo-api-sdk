package uigf.mihoyo.miyoushe.mobile;

import io.clientcore.core.annotations.Metadata;
import io.clientcore.core.annotations.MetadataProperties;
import io.clientcore.core.annotations.ReturnType;
import io.clientcore.core.annotations.ServiceClient;
import io.clientcore.core.annotations.ServiceMethod;
import io.clientcore.core.http.models.HttpResponseException;
import io.clientcore.core.http.models.RequestContext;
import io.clientcore.core.http.models.Response;
import io.clientcore.core.instrumentation.Instrumentation;
import uigf.mihoyo.ApiResponseMobilePreloadConfigData;
import uigf.mihoyo.api.request.MobilePreloadConfigRequest;
import uigf.mihoyo.checkin.implementation.MobilePreloadApisImpl;

/**
 * Initializes a new instance of the synchronous MobileClient type.
 */
@ServiceClient(builder = MobileClientBuilder.class)
public final class MobilePreloadApiClient {
    @Metadata(properties = { MetadataProperties.GENERATED })
    private final MobilePreloadApisImpl serviceClient;

    private final Instrumentation instrumentation;

    /**
     * Initializes an instance of MobilePreloadApiClient class.
     * 
     * @param serviceClient the service client implementation.
     * @param instrumentation the instrumentation instance.
     */
    @Metadata(properties = { MetadataProperties.GENERATED })
    MobilePreloadApiClient(MobilePreloadApisImpl serviceClient, Instrumentation instrumentation) {
        this.serviceClient = serviceClient;
        this.instrumentation = instrumentation;
    }

    /**
     * The getLatestConfig operation.
     * 
     * @param body The body parameter.
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
    public Response<ApiResponseMobilePreloadConfigData> getLatestConfigWithResponse(MobilePreloadConfigRequest body,
        String cookie, String ds, RequestContext requestContext) {
        return this.instrumentation.instrumentWithResponse(
            "UIGF.Mihoyo.MiYouShe.Mobile.MobilePreloadApi.getLatestConfig", requestContext,
            updatedContext -> this.serviceClient.getLatestConfigWithResponse(body, cookie, ds, updatedContext));
    }

    /**
     * The getLatestConfig operation.
     * 
     * @param body The body parameter.
     * @param cookie The cookie parameter.
     * @param ds The ds parameter.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws HttpResponseException thrown if the service returns an error.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return common response wrapper returned by MiHoYo and HoYoLAB services.
     */
    @Metadata(properties = { MetadataProperties.GENERATED })
    @ServiceMethod(returns = ReturnType.SINGLE)
    public ApiResponseMobilePreloadConfigData getLatestConfig(MobilePreloadConfigRequest body, String cookie,
        String ds) {
        return getLatestConfigWithResponse(body, cookie, ds, RequestContext.none()).getValue();
    }

    /**
     * The getLatestConfig operation.
     * 
     * @param body The body parameter.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws HttpResponseException thrown if the service returns an error.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return common response wrapper returned by MiHoYo and HoYoLAB services.
     */
    @Metadata(properties = { MetadataProperties.GENERATED })
    @ServiceMethod(returns = ReturnType.SINGLE)
    public ApiResponseMobilePreloadConfigData getLatestConfig(MobilePreloadConfigRequest body) {
        final String cookie = null;
        final String ds = null;
        return getLatestConfigWithResponse(body, cookie, ds, RequestContext.none()).getValue();
    }
}
