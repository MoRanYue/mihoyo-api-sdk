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
import uigf.mihoyo.ApiResponseMobileTeenagerInfoData;
import uigf.mihoyo.checkin.implementation.MobileTeenagerApisImpl;

/**
 * Initializes a new instance of the synchronous MobileClient type.
 */
@ServiceClient(builder = MobileClientBuilder.class)
public final class MobileTeenagerApiClient {
    @Metadata(properties = { MetadataProperties.GENERATED })
    private final MobileTeenagerApisImpl serviceClient;

    private final Instrumentation instrumentation;

    /**
     * Initializes an instance of MobileTeenagerApiClient class.
     * 
     * @param serviceClient the service client implementation.
     * @param instrumentation the instrumentation instance.
     */
    @Metadata(properties = { MetadataProperties.GENERATED })
    MobileTeenagerApiClient(MobileTeenagerApisImpl serviceClient, Instrumentation instrumentation) {
        this.serviceClient = serviceClient;
        this.instrumentation = instrumentation;
    }

    /**
     * The getInfo operation.
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
    public Response<ApiResponseMobileTeenagerInfoData> getInfoWithResponse(String ds, String cookie,
        RequestContext requestContext) {
        return this.instrumentation.instrumentWithResponse("UIGF.Mihoyo.MiYouShe.Mobile.MobileTeenagerApi.getInfo",
            requestContext, updatedContext -> this.serviceClient.getInfoWithResponse(ds, cookie, updatedContext));
    }

    /**
     * The getInfo operation.
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
    public ApiResponseMobileTeenagerInfoData getInfo(String ds, String cookie) {
        return getInfoWithResponse(ds, cookie, RequestContext.none()).getValue();
    }

    /**
     * The getInfo operation.
     * 
     * @param ds The ds parameter.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws HttpResponseException thrown if the service returns an error.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return common response wrapper returned by MiHoYo and HoYoLAB services.
     */
    @Metadata(properties = { MetadataProperties.GENERATED })
    @ServiceMethod(returns = ReturnType.SINGLE)
    public ApiResponseMobileTeenagerInfoData getInfo(String ds) {
        final String cookie = null;
        return getInfoWithResponse(ds, cookie, RequestContext.none()).getValue();
    }
}
