package uigf.mihoyo.checkin.implementation;

import io.clientcore.core.annotations.ReturnType;
import io.clientcore.core.annotations.ServiceInterface;
import io.clientcore.core.annotations.ServiceMethod;
import io.clientcore.core.http.annotations.HeaderParam;
import io.clientcore.core.http.annotations.HostParam;
import io.clientcore.core.http.annotations.HttpRequestInformation;
import io.clientcore.core.http.annotations.QueryParam;
import io.clientcore.core.http.annotations.UnexpectedResponseExceptionDetail;
import io.clientcore.core.http.models.HttpMethod;
import io.clientcore.core.http.models.HttpResponseException;
import io.clientcore.core.http.models.RequestContext;
import io.clientcore.core.http.models.Response;
import io.clientcore.core.http.pipeline.HttpPipeline;
import io.clientcore.core.instrumentation.Instrumentation;
import java.lang.reflect.InvocationTargetException;
import uigf.mihoyo.ApiResponseStrategyHomeInfoData;
import uigf.mihoyo.ApiResponseStrategyHomeNavbarData;
import uigf.mihoyo.ApiResponseStrategyLatestContentData;

/**
 * An instance of this class provides access to all the operations defined in StrategyApis.
 */
public final class StrategyApisImpl {
    /**
     * The proxy service used to perform REST calls.
     */
    private final StrategyApisService service;

    /**
     * The service client containing this operation class.
     */
    private final ActivityClientImpl client;

    /**
     * The instance of instrumentation to report telemetry.
     */
    private final Instrumentation instrumentation;

    /**
     * Initializes an instance of StrategyApisImpl.
     * 
     * @param client the instance of the service client containing this operation class.
     */
    StrategyApisImpl(ActivityClientImpl client) {
        this.service = StrategyApisService.getNewInstance(client.getHttpPipeline());
        this.client = client;
        this.instrumentation = client.getInstrumentation();
    }

    /**
     * The interface defining all the services for ActivityClientStrategyApis to be used by the proxy service to perform
     * REST calls.
     */
    @ServiceInterface(name = "ActivityClientStrategyApis", host = "{endpoint}")
    public interface StrategyApisService {
        static StrategyApisService getNewInstance(HttpPipeline pipeline) {
            try {
                Class<?> clazz = Class.forName("uigf.mihoyo.checkin.implementation.StrategyApisServiceImpl");
                return (StrategyApisService) clazz.getMethod("getNewInstance", HttpPipeline.class)
                    .invoke(null, pipeline);
            } catch (ClassNotFoundException | NoSuchMethodException | IllegalAccessException
                | InvocationTargetException e) {
                throw new RuntimeException(e);
            }

        }

        @HttpRequestInformation(
            method = HttpMethod.GET,
            path = "/common/blackboard/ys_strategy/v1/content/latest",
            expectedStatusCodes = { 200 })
        @UnexpectedResponseExceptionDetail
        Response<ApiResponseStrategyLatestContentData> getLatestContent(@HostParam("endpoint") String endpoint,
            @QueryParam("app_sn") String appSn, @HeaderParam("Accept") String accept, RequestContext requestContext);

        @HttpRequestInformation(
            method = HttpMethod.GET,
            path = "/common/blackboard/ys_strategy/v1/home/index/info",
            expectedStatusCodes = { 200 })
        @UnexpectedResponseExceptionDetail
        Response<ApiResponseStrategyHomeInfoData> getHomeInfo(@HostParam("endpoint") String endpoint,
            @QueryParam("app_sn") String appSn, @HeaderParam("Accept") String accept, RequestContext requestContext);

        @HttpRequestInformation(
            method = HttpMethod.GET,
            path = "/common/blackboard/ys_strategy/v1/home/index/navbar",
            expectedStatusCodes = { 200 })
        @UnexpectedResponseExceptionDetail
        Response<ApiResponseStrategyHomeNavbarData> getHomeNavbar(@HostParam("endpoint") String endpoint,
            @QueryParam("app_sn") String appSn, @HeaderParam("Accept") String accept, RequestContext requestContext);
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
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Response<ApiResponseStrategyLatestContentData> getLatestContentWithResponse(String appSn,
        RequestContext requestContext) {
        return this.instrumentation.instrumentWithResponse("UIGF.Mihoyo.Game.CN.Activity.StrategyApi.getLatestContent",
            requestContext, updatedContext -> {
                final String accept = "application/json";
                return service.getLatestContent(this.client.getEndpoint(), appSn, accept, updatedContext);
            });
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
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Response<ApiResponseStrategyHomeInfoData> getHomeInfoWithResponse(String appSn,
        RequestContext requestContext) {
        return this.instrumentation.instrumentWithResponse("UIGF.Mihoyo.Game.CN.Activity.StrategyApi.getHomeInfo",
            requestContext, updatedContext -> {
                final String accept = "application/json";
                return service.getHomeInfo(this.client.getEndpoint(), appSn, accept, updatedContext);
            });
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
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Response<ApiResponseStrategyHomeNavbarData> getHomeNavbarWithResponse(String appSn,
        RequestContext requestContext) {
        return this.instrumentation.instrumentWithResponse("UIGF.Mihoyo.Game.CN.Activity.StrategyApi.getHomeNavbar",
            requestContext, updatedContext -> {
                final String accept = "application/json";
                return service.getHomeNavbar(this.client.getEndpoint(), appSn, accept, updatedContext);
            });
    }
}
