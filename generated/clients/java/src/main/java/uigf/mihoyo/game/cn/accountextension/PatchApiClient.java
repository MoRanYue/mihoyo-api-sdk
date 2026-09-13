package uigf.mihoyo.game.cn.accountextension;

import io.clientcore.core.annotations.Metadata;
import io.clientcore.core.annotations.MetadataProperties;
import io.clientcore.core.annotations.ReturnType;
import io.clientcore.core.annotations.ServiceClient;
import io.clientcore.core.annotations.ServiceMethod;
import io.clientcore.core.http.models.HttpResponseException;
import io.clientcore.core.http.models.RequestContext;
import io.clientcore.core.http.models.Response;
import io.clientcore.core.instrumentation.Instrumentation;
import uigf.mihoyo.ApiResponsePatchData;
import uigf.mihoyo.checkin.implementation.PatchApisImpl;

/**
 * Initializes a new instance of the synchronous AccountExtensionClient type.
 */
@ServiceClient(builder = AccountExtensionClientBuilder.class)
public final class PatchApiClient {
    @Metadata(properties = { MetadataProperties.GENERATED })
    private final PatchApisImpl serviceClient;

    private final Instrumentation instrumentation;

    /**
     * Initializes an instance of PatchApiClient class.
     * 
     * @param serviceClient the service client implementation.
     * @param instrumentation the instrumentation instance.
     */
    @Metadata(properties = { MetadataProperties.GENERATED })
    PatchApiClient(PatchApisImpl serviceClient, Instrumentation instrumentation) {
        this.serviceClient = serviceClient;
        this.instrumentation = instrumentation;
    }

    /**
     * The getPatch operation.
     * 
     * @param appId The appId parameter.
     * @param appVersion The appVersion parameter.
     * @param channel The channel parameter.
     * @param gameVersion The gameVersion parameter.
     * @param requestContext The context to configure the HTTP request before HTTP client sends it.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws HttpResponseException thrown if the service returns an error.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return common response wrapper returned by MiHoYo and HoYoLAB services along with {@link Response}.
     */
    @Metadata(properties = { MetadataProperties.GENERATED })
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Response<ApiResponsePatchData> getPatchWithResponse(int appId, String appVersion, String channel,
        String gameVersion, RequestContext requestContext) {
        return this.instrumentation.instrumentWithResponse("UIGF.Mihoyo.Game.CN.AccountExtension.PatchApi.getPatch",
            requestContext, updatedContext -> this.serviceClient.getPatchWithResponse(appId, appVersion, channel,
                gameVersion, updatedContext));
    }

    /**
     * The getPatch operation.
     * 
     * @param appId The appId parameter.
     * @param appVersion The appVersion parameter.
     * @param channel The channel parameter.
     * @param gameVersion The gameVersion parameter.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws HttpResponseException thrown if the service returns an error.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return common response wrapper returned by MiHoYo and HoYoLAB services.
     */
    @Metadata(properties = { MetadataProperties.GENERATED })
    @ServiceMethod(returns = ReturnType.SINGLE)
    public ApiResponsePatchData getPatch(int appId, String appVersion, String channel, String gameVersion) {
        return getPatchWithResponse(appId, appVersion, channel, gameVersion, RequestContext.none()).getValue();
    }
}
