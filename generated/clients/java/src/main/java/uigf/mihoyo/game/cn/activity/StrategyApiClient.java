package uigf.mihoyo.game.cn.activity;

import io.clientcore.core.annotations.Metadata;
import io.clientcore.core.annotations.MetadataProperties;
import io.clientcore.core.annotations.ReturnType;
import io.clientcore.core.annotations.ServiceClient;
import io.clientcore.core.annotations.ServiceMethod;
import io.clientcore.core.http.models.HttpResponseException;
import io.clientcore.core.http.models.RequestContext;
import io.clientcore.core.http.models.Response;
import io.clientcore.core.instrumentation.Instrumentation;
import uigf.mihoyo.ApiResponseStrategyHomeInfoData;
import uigf.mihoyo.ApiResponseStrategyHomeNavbarData;
import uigf.mihoyo.ApiResponseStrategyLatestContentData;
import uigf.mihoyo.checkin.implementation.StrategyApisImpl;

/**
 * Initializes a new instance of the synchronous ActivityClient type.
 */
@ServiceClient(builder = ActivityClientBuilder.class)
public final class StrategyApiClient {
    @Metadata(properties = { MetadataProperties.GENERATED })
    private final StrategyApisImpl serviceClient;

    private final Instrumentation instrumentation;

    /**
     * Initializes an instance of StrategyApiClient class.
     * 
     * @param serviceClient the service client implementation.
     * @param instrumentation the instrumentation instance.
     */
    @Metadata(properties = { MetadataProperties.GENERATED })
    StrategyApiClient(StrategyApisImpl serviceClient, Instrumentation instrumentation) {
        this.serviceClient = serviceClient;
        this.instrumentation = instrumentation;
    }

    /**
     * The getLatestContent operation.
     * 
     * @param appSn The appSn parameter.
     * @param requestContext The context to configure the HTTP request before HTTP client sends it.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws HttpResponseException thrown if the service returns an error.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return common response wrapper returned by MiHoYo and HoYoLAB services along with {@link Response}.
     */
    @Metadata(properties = { MetadataProperties.GENERATED })
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Response<ApiResponseStrategyLatestContentData> getLatestContentWithResponse(String appSn,
        RequestContext requestContext) {
        return this.instrumentation.instrumentWithResponse("UIGF.Mihoyo.Game.CN.Activity.StrategyApi.getLatestContent",
            requestContext, updatedContext -> this.serviceClient.getLatestContentWithResponse(appSn, updatedContext));
    }

    /**
     * The getLatestContent operation.
     * 
     * @param appSn The appSn parameter.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws HttpResponseException thrown if the service returns an error.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return common response wrapper returned by MiHoYo and HoYoLAB services.
     */
    @Metadata(properties = { MetadataProperties.GENERATED })
    @ServiceMethod(returns = ReturnType.SINGLE)
    public ApiResponseStrategyLatestContentData getLatestContent(String appSn) {
        return getLatestContentWithResponse(appSn, RequestContext.none()).getValue();
    }

    /**
     * The getHomeInfo operation.
     * 
     * @param appSn The appSn parameter.
     * @param requestContext The context to configure the HTTP request before HTTP client sends it.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws HttpResponseException thrown if the service returns an error.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return common response wrapper returned by MiHoYo and HoYoLAB services along with {@link Response}.
     */
    @Metadata(properties = { MetadataProperties.GENERATED })
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Response<ApiResponseStrategyHomeInfoData> getHomeInfoWithResponse(String appSn,
        RequestContext requestContext) {
        return this.instrumentation.instrumentWithResponse("UIGF.Mihoyo.Game.CN.Activity.StrategyApi.getHomeInfo",
            requestContext, updatedContext -> this.serviceClient.getHomeInfoWithResponse(appSn, updatedContext));
    }

    /**
     * The getHomeInfo operation.
     * 
     * @param appSn The appSn parameter.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws HttpResponseException thrown if the service returns an error.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return common response wrapper returned by MiHoYo and HoYoLAB services.
     */
    @Metadata(properties = { MetadataProperties.GENERATED })
    @ServiceMethod(returns = ReturnType.SINGLE)
    public ApiResponseStrategyHomeInfoData getHomeInfo(String appSn) {
        return getHomeInfoWithResponse(appSn, RequestContext.none()).getValue();
    }

    /**
     * The getHomeNavbar operation.
     * 
     * @param appSn The appSn parameter.
     * @param requestContext The context to configure the HTTP request before HTTP client sends it.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws HttpResponseException thrown if the service returns an error.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return common response wrapper returned by MiHoYo and HoYoLAB services along with {@link Response}.
     */
    @Metadata(properties = { MetadataProperties.GENERATED })
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Response<ApiResponseStrategyHomeNavbarData> getHomeNavbarWithResponse(String appSn,
        RequestContext requestContext) {
        return this.instrumentation.instrumentWithResponse("UIGF.Mihoyo.Game.CN.Activity.StrategyApi.getHomeNavbar",
            requestContext, updatedContext -> this.serviceClient.getHomeNavbarWithResponse(appSn, updatedContext));
    }

    /**
     * The getHomeNavbar operation.
     * 
     * @param appSn The appSn parameter.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws HttpResponseException thrown if the service returns an error.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return common response wrapper returned by MiHoYo and HoYoLAB services.
     */
    @Metadata(properties = { MetadataProperties.GENERATED })
    @ServiceMethod(returns = ReturnType.SINGLE)
    public ApiResponseStrategyHomeNavbarData getHomeNavbar(String appSn) {
        return getHomeNavbarWithResponse(appSn, RequestContext.none()).getValue();
    }
}
