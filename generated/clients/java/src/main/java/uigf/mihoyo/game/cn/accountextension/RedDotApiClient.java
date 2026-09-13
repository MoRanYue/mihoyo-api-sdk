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
import uigf.mihoyo.ApiResponseRedDotBatchData;
import uigf.mihoyo.checkin.implementation.RedDotApisImpl;

/**
 * Initializes a new instance of the synchronous AccountExtensionClient type.
 */
@ServiceClient(builder = AccountExtensionClientBuilder.class)
public final class RedDotApiClient {
    @Metadata(properties = { MetadataProperties.GENERATED })
    private final RedDotApisImpl serviceClient;

    private final Instrumentation instrumentation;

    /**
     * Initializes an instance of RedDotApiClient class.
     * 
     * @param serviceClient the service client implementation.
     * @param instrumentation the instrumentation instance.
     */
    @Metadata(properties = { MetadataProperties.GENERATED })
    RedDotApiClient(RedDotApisImpl serviceClient, Instrumentation instrumentation) {
        this.serviceClient = serviceClient;
        this.instrumentation = instrumentation;
    }

    /**
     * The getBatch operation.
     * 
     * @param ds The ds parameter.
     * @param authkey The authkey parameter.
     * @param authkeyVer The authkeyVer parameter.
     * @param gameBiz The gameBiz parameter.
     * @param signType The signType parameter.
     * @param users The users parameter.
     * @param cookie The cookie parameter.
     * @param requestContext The context to configure the HTTP request before HTTP client sends it.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws HttpResponseException thrown if the service returns an error.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return common response wrapper returned by MiHoYo and HoYoLAB services along with {@link Response}.
     */
    @Metadata(properties = { MetadataProperties.GENERATED })
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Response<ApiResponseRedDotBatchData> getBatchWithResponse(String ds, String authkey, int authkeyVer,
        String gameBiz, int signType, String users, String cookie, RequestContext requestContext) {
        return this.instrumentation.instrumentWithResponse("UIGF.Mihoyo.Game.CN.AccountExtension.RedDotApi.getBatch",
            requestContext, updatedContext -> this.serviceClient.getBatchWithResponse(ds, authkey, authkeyVer, gameBiz,
                signType, users, cookie, updatedContext));
    }

    /**
     * The getBatch operation.
     * 
     * @param ds The ds parameter.
     * @param authkey The authkey parameter.
     * @param authkeyVer The authkeyVer parameter.
     * @param gameBiz The gameBiz parameter.
     * @param signType The signType parameter.
     * @param users The users parameter.
     * @param cookie The cookie parameter.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws HttpResponseException thrown if the service returns an error.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return common response wrapper returned by MiHoYo and HoYoLAB services.
     */
    @Metadata(properties = { MetadataProperties.GENERATED })
    @ServiceMethod(returns = ReturnType.SINGLE)
    public ApiResponseRedDotBatchData getBatch(String ds, String authkey, int authkeyVer, String gameBiz, int signType,
        String users, String cookie) {
        return getBatchWithResponse(ds, authkey, authkeyVer, gameBiz, signType, users, cookie, RequestContext.none())
            .getValue();
    }

    /**
     * The getBatch operation.
     * 
     * @param ds The ds parameter.
     * @param authkey The authkey parameter.
     * @param authkeyVer The authkeyVer parameter.
     * @param gameBiz The gameBiz parameter.
     * @param signType The signType parameter.
     * @param users The users parameter.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws HttpResponseException thrown if the service returns an error.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return common response wrapper returned by MiHoYo and HoYoLAB services.
     */
    @Metadata(properties = { MetadataProperties.GENERATED })
    @ServiceMethod(returns = ReturnType.SINGLE)
    public ApiResponseRedDotBatchData getBatch(String ds, String authkey, int authkeyVer, String gameBiz, int signType,
        String users) {
        final String cookie = null;
        return getBatchWithResponse(ds, authkey, authkeyVer, gameBiz, signType, users, cookie, RequestContext.none())
            .getValue();
    }
}
