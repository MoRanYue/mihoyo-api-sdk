package uigf.mihoyo.api.request;

import io.clientcore.core.annotations.Metadata;
import io.clientcore.core.annotations.MetadataProperties;
import io.clientcore.core.models.binarydata.BinaryData;
import io.clientcore.core.serialization.json.JsonReader;
import io.clientcore.core.serialization.json.JsonSerializable;
import io.clientcore.core.serialization.json.JsonToken;
import io.clientcore.core.serialization.json.JsonWriter;
import java.io.IOException;
import java.util.LinkedHashMap;
import java.util.Map;

/**
 * The H5CollectorPageExtraInfo model.
 */
@Metadata(properties = { MetadataProperties.FLUENT })
public final class H5CollectorPageExtraInfo implements JsonSerializable<H5CollectorPageExtraInfo> {
    /*
     * The app_id property.
     */
    @Metadata(properties = { MetadataProperties.GENERATED })
    private String appId;

    /*
     * The app_version property.
     */
    @Metadata(properties = { MetadataProperties.GENERATED })
    private String appVersion;

    /*
     * The business_url property.
     */
    @Metadata(properties = { MetadataProperties.GENERATED })
    private String businessUrl;

    /*
     * The device_fp property.
     */
    @Metadata(properties = { MetadataProperties.GENERATED })
    private String deviceFp;

    /*
     * The device_id property.
     */
    @Metadata(properties = { MetadataProperties.GENERATED })
    private String deviceId;

    /*
     * The environment property.
     */
    @Metadata(properties = { MetadataProperties.GENERATED })
    private String environment;

    /*
     * The gameBiz property.
     */
    @Metadata(properties = { MetadataProperties.GENERATED })
    private String gameBiz;

    /*
     * The is_v2_platform property.
     */
    @Metadata(properties = { MetadataProperties.GENERATED })
    private String isV2Platform;

    /*
     * The isApp property.
     */
    @Metadata(properties = { MetadataProperties.GENERATED })
    private String isApp;

    /*
     * The language property.
     */
    @Metadata(properties = { MetadataProperties.GENERATED })
    private String language;

    /*
     * The lifecycle_id property.
     */
    @Metadata(properties = { MetadataProperties.GENERATED })
    private String lifecycleId;

    /*
     * The sdk_version property.
     */
    @Metadata(properties = { MetadataProperties.GENERATED })
    private String sdkVersion;

    /*
     * The syncLoginStatus property.
     */
    @Metadata(properties = { MetadataProperties.GENERATED })
    private Boolean syncLoginStatus;

    /*
     * The theme property.
     */
    @Metadata(properties = { MetadataProperties.GENERATED })
    private String theme;

    /*
     * The tokenType property.
     */
    @Metadata(properties = { MetadataProperties.GENERATED })
    private Integer tokenType;

    /*
     * The view_type property.
     */
    @Metadata(properties = { MetadataProperties.GENERATED })
    private Integer viewType;

    /*
     * Additional properties
     */
    @Metadata(properties = { MetadataProperties.GENERATED })
    private Map<String, BinaryData> additionalProperties;

    /**
     * Creates an instance of H5CollectorPageExtraInfo class.
     */
    @Metadata(properties = { MetadataProperties.GENERATED })
    public H5CollectorPageExtraInfo() {
    }

    /**
     * Get the appId property: The app_id property.
     * 
     * @return the appId value.
     */
    @Metadata(properties = { MetadataProperties.GENERATED })
    public String getAppId() {
        return this.appId;
    }

    /**
     * Set the appId property: The app_id property.
     * 
     * @param appId the appId value to set.
     * @return the H5CollectorPageExtraInfo object itself.
     */
    @Metadata(properties = { MetadataProperties.GENERATED })
    public H5CollectorPageExtraInfo setAppId(String appId) {
        this.appId = appId;
        return this;
    }

    /**
     * Get the appVersion property: The app_version property.
     * 
     * @return the appVersion value.
     */
    @Metadata(properties = { MetadataProperties.GENERATED })
    public String getAppVersion() {
        return this.appVersion;
    }

    /**
     * Set the appVersion property: The app_version property.
     * 
     * @param appVersion the appVersion value to set.
     * @return the H5CollectorPageExtraInfo object itself.
     */
    @Metadata(properties = { MetadataProperties.GENERATED })
    public H5CollectorPageExtraInfo setAppVersion(String appVersion) {
        this.appVersion = appVersion;
        return this;
    }

    /**
     * Get the businessUrl property: The business_url property.
     * 
     * @return the businessUrl value.
     */
    @Metadata(properties = { MetadataProperties.GENERATED })
    public String getBusinessUrl() {
        return this.businessUrl;
    }

    /**
     * Set the businessUrl property: The business_url property.
     * 
     * @param businessUrl the businessUrl value to set.
     * @return the H5CollectorPageExtraInfo object itself.
     */
    @Metadata(properties = { MetadataProperties.GENERATED })
    public H5CollectorPageExtraInfo setBusinessUrl(String businessUrl) {
        this.businessUrl = businessUrl;
        return this;
    }

    /**
     * Get the deviceFp property: The device_fp property.
     * 
     * @return the deviceFp value.
     */
    @Metadata(properties = { MetadataProperties.GENERATED })
    public String getDeviceFp() {
        return this.deviceFp;
    }

    /**
     * Set the deviceFp property: The device_fp property.
     * 
     * @param deviceFp the deviceFp value to set.
     * @return the H5CollectorPageExtraInfo object itself.
     */
    @Metadata(properties = { MetadataProperties.GENERATED })
    public H5CollectorPageExtraInfo setDeviceFp(String deviceFp) {
        this.deviceFp = deviceFp;
        return this;
    }

    /**
     * Get the deviceId property: The device_id property.
     * 
     * @return the deviceId value.
     */
    @Metadata(properties = { MetadataProperties.GENERATED })
    public String getDeviceId() {
        return this.deviceId;
    }

    /**
     * Set the deviceId property: The device_id property.
     * 
     * @param deviceId the deviceId value to set.
     * @return the H5CollectorPageExtraInfo object itself.
     */
    @Metadata(properties = { MetadataProperties.GENERATED })
    public H5CollectorPageExtraInfo setDeviceId(String deviceId) {
        this.deviceId = deviceId;
        return this;
    }

    /**
     * Get the environment property: The environment property.
     * 
     * @return the environment value.
     */
    @Metadata(properties = { MetadataProperties.GENERATED })
    public String getEnvironment() {
        return this.environment;
    }

    /**
     * Set the environment property: The environment property.
     * 
     * @param environment the environment value to set.
     * @return the H5CollectorPageExtraInfo object itself.
     */
    @Metadata(properties = { MetadataProperties.GENERATED })
    public H5CollectorPageExtraInfo setEnvironment(String environment) {
        this.environment = environment;
        return this;
    }

    /**
     * Get the gameBiz property: The gameBiz property.
     * 
     * @return the gameBiz value.
     */
    @Metadata(properties = { MetadataProperties.GENERATED })
    public String getGameBiz() {
        return this.gameBiz;
    }

    /**
     * Set the gameBiz property: The gameBiz property.
     * 
     * @param gameBiz the gameBiz value to set.
     * @return the H5CollectorPageExtraInfo object itself.
     */
    @Metadata(properties = { MetadataProperties.GENERATED })
    public H5CollectorPageExtraInfo setGameBiz(String gameBiz) {
        this.gameBiz = gameBiz;
        return this;
    }

    /**
     * Get the isV2Platform property: The is_v2_platform property.
     * 
     * @return the isV2Platform value.
     */
    @Metadata(properties = { MetadataProperties.GENERATED })
    public String getIsV2Platform() {
        return this.isV2Platform;
    }

    /**
     * Set the isV2Platform property: The is_v2_platform property.
     * 
     * @param isV2Platform the isV2Platform value to set.
     * @return the H5CollectorPageExtraInfo object itself.
     */
    @Metadata(properties = { MetadataProperties.GENERATED })
    public H5CollectorPageExtraInfo setIsV2Platform(String isV2Platform) {
        this.isV2Platform = isV2Platform;
        return this;
    }

    /**
     * Get the isApp property: The isApp property.
     * 
     * @return the isApp value.
     */
    @Metadata(properties = { MetadataProperties.GENERATED })
    public String getIsApp() {
        return this.isApp;
    }

    /**
     * Set the isApp property: The isApp property.
     * 
     * @param isApp the isApp value to set.
     * @return the H5CollectorPageExtraInfo object itself.
     */
    @Metadata(properties = { MetadataProperties.GENERATED })
    public H5CollectorPageExtraInfo setIsApp(String isApp) {
        this.isApp = isApp;
        return this;
    }

    /**
     * Get the language property: The language property.
     * 
     * @return the language value.
     */
    @Metadata(properties = { MetadataProperties.GENERATED })
    public String getLanguage() {
        return this.language;
    }

    /**
     * Set the language property: The language property.
     * 
     * @param language the language value to set.
     * @return the H5CollectorPageExtraInfo object itself.
     */
    @Metadata(properties = { MetadataProperties.GENERATED })
    public H5CollectorPageExtraInfo setLanguage(String language) {
        this.language = language;
        return this;
    }

    /**
     * Get the lifecycleId property: The lifecycle_id property.
     * 
     * @return the lifecycleId value.
     */
    @Metadata(properties = { MetadataProperties.GENERATED })
    public String getLifecycleId() {
        return this.lifecycleId;
    }

    /**
     * Set the lifecycleId property: The lifecycle_id property.
     * 
     * @param lifecycleId the lifecycleId value to set.
     * @return the H5CollectorPageExtraInfo object itself.
     */
    @Metadata(properties = { MetadataProperties.GENERATED })
    public H5CollectorPageExtraInfo setLifecycleId(String lifecycleId) {
        this.lifecycleId = lifecycleId;
        return this;
    }

    /**
     * Get the sdkVersion property: The sdk_version property.
     * 
     * @return the sdkVersion value.
     */
    @Metadata(properties = { MetadataProperties.GENERATED })
    public String getSdkVersion() {
        return this.sdkVersion;
    }

    /**
     * Set the sdkVersion property: The sdk_version property.
     * 
     * @param sdkVersion the sdkVersion value to set.
     * @return the H5CollectorPageExtraInfo object itself.
     */
    @Metadata(properties = { MetadataProperties.GENERATED })
    public H5CollectorPageExtraInfo setSdkVersion(String sdkVersion) {
        this.sdkVersion = sdkVersion;
        return this;
    }

    /**
     * Get the syncLoginStatus property: The syncLoginStatus property.
     * 
     * @return the syncLoginStatus value.
     */
    @Metadata(properties = { MetadataProperties.GENERATED })
    public Boolean isSyncLoginStatus() {
        return this.syncLoginStatus;
    }

    /**
     * Set the syncLoginStatus property: The syncLoginStatus property.
     * 
     * @param syncLoginStatus the syncLoginStatus value to set.
     * @return the H5CollectorPageExtraInfo object itself.
     */
    @Metadata(properties = { MetadataProperties.GENERATED })
    public H5CollectorPageExtraInfo setSyncLoginStatus(Boolean syncLoginStatus) {
        this.syncLoginStatus = syncLoginStatus;
        return this;
    }

    /**
     * Get the theme property: The theme property.
     * 
     * @return the theme value.
     */
    @Metadata(properties = { MetadataProperties.GENERATED })
    public String getTheme() {
        return this.theme;
    }

    /**
     * Set the theme property: The theme property.
     * 
     * @param theme the theme value to set.
     * @return the H5CollectorPageExtraInfo object itself.
     */
    @Metadata(properties = { MetadataProperties.GENERATED })
    public H5CollectorPageExtraInfo setTheme(String theme) {
        this.theme = theme;
        return this;
    }

    /**
     * Get the tokenType property: The tokenType property.
     * 
     * @return the tokenType value.
     */
    @Metadata(properties = { MetadataProperties.GENERATED })
    public Integer getTokenType() {
        return this.tokenType;
    }

    /**
     * Set the tokenType property: The tokenType property.
     * 
     * @param tokenType the tokenType value to set.
     * @return the H5CollectorPageExtraInfo object itself.
     */
    @Metadata(properties = { MetadataProperties.GENERATED })
    public H5CollectorPageExtraInfo setTokenType(Integer tokenType) {
        this.tokenType = tokenType;
        return this;
    }

    /**
     * Get the viewType property: The view_type property.
     * 
     * @return the viewType value.
     */
    @Metadata(properties = { MetadataProperties.GENERATED })
    public Integer getViewType() {
        return this.viewType;
    }

    /**
     * Set the viewType property: The view_type property.
     * 
     * @param viewType the viewType value to set.
     * @return the H5CollectorPageExtraInfo object itself.
     */
    @Metadata(properties = { MetadataProperties.GENERATED })
    public H5CollectorPageExtraInfo setViewType(Integer viewType) {
        this.viewType = viewType;
        return this;
    }

    /**
     * Get the additionalProperties property: Additional properties.
     * 
     * @return the additionalProperties value.
     */
    @Metadata(properties = { MetadataProperties.GENERATED })
    public Map<String, BinaryData> getAdditionalProperties() {
        return this.additionalProperties;
    }

    /**
     * Set the additionalProperties property: Additional properties.
     * 
     * @param additionalProperties the additionalProperties value to set.
     * @return the H5CollectorPageExtraInfo object itself.
     */
    @Metadata(properties = { MetadataProperties.GENERATED })
    public H5CollectorPageExtraInfo setAdditionalProperties(Map<String, BinaryData> additionalProperties) {
        this.additionalProperties = additionalProperties;
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Metadata(properties = { MetadataProperties.GENERATED })
    @Override
    public JsonWriter toJson(JsonWriter jsonWriter) throws IOException {
        jsonWriter.writeStartObject();
        jsonWriter.writeStringField("app_id", this.appId);
        jsonWriter.writeStringField("app_version", this.appVersion);
        jsonWriter.writeStringField("business_url", this.businessUrl);
        jsonWriter.writeStringField("device_fp", this.deviceFp);
        jsonWriter.writeStringField("device_id", this.deviceId);
        jsonWriter.writeStringField("environment", this.environment);
        jsonWriter.writeStringField("gameBiz", this.gameBiz);
        jsonWriter.writeStringField("is_v2_platform", this.isV2Platform);
        jsonWriter.writeStringField("isApp", this.isApp);
        jsonWriter.writeStringField("language", this.language);
        jsonWriter.writeStringField("lifecycle_id", this.lifecycleId);
        jsonWriter.writeStringField("sdk_version", this.sdkVersion);
        jsonWriter.writeBooleanField("syncLoginStatus", this.syncLoginStatus);
        jsonWriter.writeStringField("theme", this.theme);
        jsonWriter.writeNumberField("tokenType", this.tokenType);
        jsonWriter.writeNumberField("view_type", this.viewType);
        if (additionalProperties != null) {
            for (Map.Entry<String, BinaryData> additionalProperty : additionalProperties.entrySet()) {
                jsonWriter.writeFieldName(additionalProperty.getKey());
                if (additionalProperty.getValue() == null) {
                    jsonWriter.writeNull();
                } else {
                    additionalProperty.getValue().writeTo(jsonWriter);
                }
            }
        }
        return jsonWriter.writeEndObject();
    }

    /**
     * Reads an instance of H5CollectorPageExtraInfo from the JsonReader.
     * 
     * @param jsonReader The JsonReader being read.
     * @return An instance of H5CollectorPageExtraInfo if the JsonReader was pointing to an instance of it, or null if
     * it was pointing to JSON null.
     * @throws IOException If an error occurs while reading the H5CollectorPageExtraInfo.
     */
    @Metadata(properties = { MetadataProperties.GENERATED })
    public static H5CollectorPageExtraInfo fromJson(JsonReader jsonReader) throws IOException {
        return jsonReader.readObject(reader -> {
            H5CollectorPageExtraInfo deserializedH5CollectorPageExtraInfo = new H5CollectorPageExtraInfo();
            Map<String, BinaryData> additionalProperties = null;
            while (reader.nextToken() != JsonToken.END_OBJECT) {
                String fieldName = reader.getFieldName();
                reader.nextToken();

                if ("app_id".equals(fieldName)) {
                    deserializedH5CollectorPageExtraInfo.appId = reader.getString();
                } else if ("app_version".equals(fieldName)) {
                    deserializedH5CollectorPageExtraInfo.appVersion = reader.getString();
                } else if ("business_url".equals(fieldName)) {
                    deserializedH5CollectorPageExtraInfo.businessUrl = reader.getString();
                } else if ("device_fp".equals(fieldName)) {
                    deserializedH5CollectorPageExtraInfo.deviceFp = reader.getString();
                } else if ("device_id".equals(fieldName)) {
                    deserializedH5CollectorPageExtraInfo.deviceId = reader.getString();
                } else if ("environment".equals(fieldName)) {
                    deserializedH5CollectorPageExtraInfo.environment = reader.getString();
                } else if ("gameBiz".equals(fieldName)) {
                    deserializedH5CollectorPageExtraInfo.gameBiz = reader.getString();
                } else if ("is_v2_platform".equals(fieldName)) {
                    deserializedH5CollectorPageExtraInfo.isV2Platform = reader.getString();
                } else if ("isApp".equals(fieldName)) {
                    deserializedH5CollectorPageExtraInfo.isApp = reader.getString();
                } else if ("language".equals(fieldName)) {
                    deserializedH5CollectorPageExtraInfo.language = reader.getString();
                } else if ("lifecycle_id".equals(fieldName)) {
                    deserializedH5CollectorPageExtraInfo.lifecycleId = reader.getString();
                } else if ("sdk_version".equals(fieldName)) {
                    deserializedH5CollectorPageExtraInfo.sdkVersion = reader.getString();
                } else if ("syncLoginStatus".equals(fieldName)) {
                    deserializedH5CollectorPageExtraInfo.syncLoginStatus = reader.getNullable(JsonReader::getBoolean);
                } else if ("theme".equals(fieldName)) {
                    deserializedH5CollectorPageExtraInfo.theme = reader.getString();
                } else if ("tokenType".equals(fieldName)) {
                    deserializedH5CollectorPageExtraInfo.tokenType = reader.getNullable(JsonReader::getInt);
                } else if ("view_type".equals(fieldName)) {
                    deserializedH5CollectorPageExtraInfo.viewType = reader.getNullable(JsonReader::getInt);
                } else {
                    if (additionalProperties == null) {
                        additionalProperties = new LinkedHashMap<>();
                    }

                    additionalProperties.put(fieldName,
                        reader.getNullable(nonNullReader -> BinaryData.fromObject(nonNullReader.readUntyped())));
                }
            }
            deserializedH5CollectorPageExtraInfo.additionalProperties = additionalProperties;

            return deserializedH5CollectorPageExtraInfo;
        });
    }
}
