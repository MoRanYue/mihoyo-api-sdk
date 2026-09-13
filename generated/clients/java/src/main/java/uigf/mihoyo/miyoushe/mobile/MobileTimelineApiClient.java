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
import uigf.mihoyo.ApiResponseMobileUnreadInfoData;
import uigf.mihoyo.checkin.implementation.MobileTimelineApisImpl;

/**
 * Initializes a new instance of the synchronous MobileClient type.
 */
@ServiceClient(builder = MobileClientBuilder.class)
public final class MobileTimelineApiClient {
    @Metadata(properties = { MetadataProperties.GENERATED })
    private final MobileTimelineApisImpl serviceClient;

    private final Instrumentation instrumentation;

    /**
     * Initializes an instance of MobileTimelineApiClient class.
     * 
     * @param serviceClient the service client implementation.
     * @param instrumentation the instrumentation instance.
     */
    @Metadata(properties = { MetadataProperties.GENERATED })
    MobileTimelineApiClient(MobileTimelineApisImpl serviceClient, Instrumentation instrumentation) {
        this.serviceClient = serviceClient;
        this.instrumentation = instrumentation;
    }

    /**
     * The getUnreadInfo operation.
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
    public Response<ApiResponseMobileUnreadInfoData> getUnreadInfoWithResponse(String ds, String cookie,
        RequestContext requestContext) {
        return this.instrumentation.instrumentWithResponse(
            "UIGF.Mihoyo.MiYouShe.Mobile.MobileTimelineApi.getUnreadInfo", requestContext,
            updatedContext -> this.serviceClient.getUnreadInfoWithResponse(ds, cookie, updatedContext));
    }

    /**
     * The getUnreadInfo operation.
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
    public ApiResponseMobileUnreadInfoData getUnreadInfo(String ds, String cookie) {
        return getUnreadInfoWithResponse(ds, cookie, RequestContext.none()).getValue();
    }

    /**
     * The getUnreadInfo operation.
     * 
     * @param ds The ds parameter.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws HttpResponseException thrown if the service returns an error.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return common response wrapper returned by MiHoYo and HoYoLAB services.
     */
    @Metadata(properties = { MetadataProperties.GENERATED })
    @ServiceMethod(returns = ReturnType.SINGLE)
    public ApiResponseMobileUnreadInfoData getUnreadInfo(String ds) {
        final String cookie = null;
        return getUnreadInfoWithResponse(ds, cookie, RequestContext.none()).getValue();
    }
}
