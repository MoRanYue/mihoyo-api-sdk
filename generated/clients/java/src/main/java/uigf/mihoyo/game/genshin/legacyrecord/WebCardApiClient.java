package uigf.mihoyo.game.genshin.legacyrecord;

import io.clientcore.core.annotations.Metadata;
import io.clientcore.core.annotations.MetadataProperties;
import io.clientcore.core.annotations.ReturnType;
import io.clientcore.core.annotations.ServiceClient;
import io.clientcore.core.annotations.ServiceMethod;
import io.clientcore.core.http.models.HttpResponseException;
import io.clientcore.core.http.models.RequestContext;
import io.clientcore.core.http.models.Response;
import io.clientcore.core.instrumentation.Instrumentation;
import uigf.mihoyo.ApiResponseGenshinGameRecordCardData;
import uigf.mihoyo.checkin.implementation.WebCardApisImpl;

/**
 * Initializes a new instance of the synchronous LegacyRecordClient type.
 */
@ServiceClient(builder = LegacyRecordClientBuilder.class)
public final class WebCardApiClient {
    @Metadata(properties = { MetadataProperties.GENERATED })
    private final WebCardApisImpl serviceClient;

    private final Instrumentation instrumentation;

    /**
     * Initializes an instance of WebCardApiClient class.
     * 
     * @param serviceClient the service client implementation.
     * @param instrumentation the instrumentation instance.
     */
    @Metadata(properties = { MetadataProperties.GENERATED })
    WebCardApiClient(WebCardApisImpl serviceClient, Instrumentation instrumentation) {
        this.serviceClient = serviceClient;
        this.instrumentation = instrumentation;
    }

    /**
     * The getGameRecordCard operation.
     * 
     * @param uid The uid parameter.
     * @param cookie The cookie parameter.
     * @param requestContext The context to configure the HTTP request before HTTP client sends it.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws HttpResponseException thrown if the service returns an error.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return common response wrapper returned by MiHoYo and HoYoLAB services along with {@link Response}.
     */
    @Metadata(properties = { MetadataProperties.GENERATED })
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Response<ApiResponseGenshinGameRecordCardData> getGameRecordCardWithResponse(String uid, String cookie,
        RequestContext requestContext) {
        return this.instrumentation.instrumentWithResponse(
            "UIGF.Mihoyo.Game.Genshin.LegacyRecord.WebCardApi.getGameRecordCard", requestContext,
            updatedContext -> this.serviceClient.getGameRecordCardWithResponse(uid, cookie, updatedContext));
    }

    /**
     * The getGameRecordCard operation.
     * 
     * @param uid The uid parameter.
     * @param cookie The cookie parameter.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws HttpResponseException thrown if the service returns an error.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return common response wrapper returned by MiHoYo and HoYoLAB services.
     */
    @Metadata(properties = { MetadataProperties.GENERATED })
    @ServiceMethod(returns = ReturnType.SINGLE)
    public ApiResponseGenshinGameRecordCardData getGameRecordCard(String uid, String cookie) {
        return getGameRecordCardWithResponse(uid, cookie, RequestContext.none()).getValue();
    }

    /**
     * The getGameRecordCard operation.
     * 
     * @param uid The uid parameter.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws HttpResponseException thrown if the service returns an error.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return common response wrapper returned by MiHoYo and HoYoLAB services.
     */
    @Metadata(properties = { MetadataProperties.GENERATED })
    @ServiceMethod(returns = ReturnType.SINGLE)
    public ApiResponseGenshinGameRecordCardData getGameRecordCard(String uid) {
        final String cookie = null;
        return getGameRecordCardWithResponse(uid, cookie, RequestContext.none()).getValue();
    }
}
