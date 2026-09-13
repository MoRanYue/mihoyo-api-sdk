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
import uigf.mihoyo.ApiResponseMobileEntityReviewData;
import uigf.mihoyo.checkin.implementation.MobileUserInstantApisImpl;

/**
 * Initializes a new instance of the synchronous MobileClient type.
 */
@ServiceClient(builder = MobileClientBuilder.class)
public final class MobileUserInstantApiClient {
    @Metadata(properties = { MetadataProperties.GENERATED })
    private final MobileUserInstantApisImpl serviceClient;

    private final Instrumentation instrumentation;

    /**
     * Initializes an instance of MobileUserInstantApiClient class.
     * 
     * @param serviceClient the service client implementation.
     * @param instrumentation the instrumentation instance.
     */
    @Metadata(properties = { MetadataProperties.GENERATED })
    MobileUserInstantApiClient(MobileUserInstantApisImpl serviceClient, Instrumentation instrumentation) {
        this.serviceClient = serviceClient;
        this.instrumentation = instrumentation;
    }

    /**
     * The getEntityReview operation.
     * 
     * @param ds The ds parameter.
     * @param offset The offset parameter.
     * @param size The size parameter.
     * @param cookie The cookie parameter.
     * @param requestContext The context to configure the HTTP request before HTTP client sends it.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws HttpResponseException thrown if the service returns an error.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return common response wrapper returned by MiHoYo and HoYoLAB services along with {@link Response}.
     */
    @Metadata(properties = { MetadataProperties.GENERATED })
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Response<ApiResponseMobileEntityReviewData> getEntityReviewWithResponse(String ds, int offset, int size,
        String cookie, RequestContext requestContext) {
        return this.instrumentation.instrumentWithResponse(
            "UIGF.Mihoyo.MiYouShe.Mobile.MobileUserInstantApi.getEntityReview", requestContext,
            updatedContext -> this.serviceClient.getEntityReviewWithResponse(ds, offset, size, cookie, updatedContext));
    }

    /**
     * The getEntityReview operation.
     * 
     * @param ds The ds parameter.
     * @param offset The offset parameter.
     * @param size The size parameter.
     * @param cookie The cookie parameter.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws HttpResponseException thrown if the service returns an error.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return common response wrapper returned by MiHoYo and HoYoLAB services.
     */
    @Metadata(properties = { MetadataProperties.GENERATED })
    @ServiceMethod(returns = ReturnType.SINGLE)
    public ApiResponseMobileEntityReviewData getEntityReview(String ds, int offset, int size, String cookie) {
        return getEntityReviewWithResponse(ds, offset, size, cookie, RequestContext.none()).getValue();
    }

    /**
     * The getEntityReview operation.
     * 
     * @param ds The ds parameter.
     * @param offset The offset parameter.
     * @param size The size parameter.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws HttpResponseException thrown if the service returns an error.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return common response wrapper returned by MiHoYo and HoYoLAB services.
     */
    @Metadata(properties = { MetadataProperties.GENERATED })
    @ServiceMethod(returns = ReturnType.SINGLE)
    public ApiResponseMobileEntityReviewData getEntityReview(String ds, int offset, int size) {
        final String cookie = null;
        return getEntityReviewWithResponse(ds, offset, size, cookie, RequestContext.none()).getValue();
    }
}
