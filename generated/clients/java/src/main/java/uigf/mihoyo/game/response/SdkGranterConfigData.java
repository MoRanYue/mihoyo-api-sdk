package uigf.mihoyo.game.response;

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
 * The SdkGranterConfigData model.
 */
@Metadata(properties = { MetadataProperties.IMMUTABLE })
public final class SdkGranterConfigData implements JsonSerializable<SdkGranterConfigData> {
    /*
     * The announce_url property.
     */
    @Metadata(properties = { MetadataProperties.GENERATED })
    private String announceUrl;

    /*
     * The app_name property.
     */
    @Metadata(properties = { MetadataProperties.GENERATED })
    private String appName;

    /*
     * The disable_ysdk_guard property.
     */
    @Metadata(properties = { MetadataProperties.GENERATED })
    private Boolean disableYsdkGuard;

    /*
     * The enable_announce_pic_popup property.
     */
    @Metadata(properties = { MetadataProperties.GENERATED })
    private Boolean enableAnnouncePicPopup;

    /*
     * The enable_user_center property.
     */
    @Metadata(properties = { MetadataProperties.GENERATED })
    private Boolean enableUserCenter;

    /*
     * The functional_switch_configs property.
     */
    @Metadata(properties = { MetadataProperties.GENERATED })
    private Map<String, BinaryData> functionalSwitchConfigs;

    /*
     * The log_level property.
     */
    @Metadata(properties = { MetadataProperties.GENERATED })
    private String logLevel;

    /*
     * The protocol property.
     */
    @Metadata(properties = { MetadataProperties.GENERATED })
    private Boolean protocol;

    /*
     * The push_alias_type property.
     */
    @Metadata(properties = { MetadataProperties.GENERATED })
    private Integer pushAliasType;

    /*
     * The qr_app_icons property.
     */
    @Metadata(properties = { MetadataProperties.GENERATED })
    private SdkGranterQrAppIcons qrAppIcons;

    /*
     * The qr_cloud_display_name property.
     */
    @Metadata(properties = { MetadataProperties.GENERATED })
    private String qrCloudDisplayName;

    /*
     * The qr_enabled property.
     */
    @Metadata(properties = { MetadataProperties.GENERATED })
    private Boolean qrEnabled;

    /*
     * The qr_enabled_apps property.
     */
    @Metadata(properties = { MetadataProperties.GENERATED })
    private SdkGranterQrEnabledApps qrEnabledApps;

    /*
     * The ugc_protocol property.
     */
    @Metadata(properties = { MetadataProperties.GENERATED })
    private Boolean ugcProtocol;

    /*
     * The widget_config property.
     */
    @Metadata(properties = { MetadataProperties.GENERATED })
    private BinaryData widgetConfig;

    /*
     * Additional properties
     */
    @Metadata(properties = { MetadataProperties.GENERATED })
    private Map<String, BinaryData> additionalProperties;

    /**
     * Creates an instance of SdkGranterConfigData class.
     */
    @Metadata(properties = { MetadataProperties.GENERATED })
    private SdkGranterConfigData() {
    }

    /**
     * Get the announceUrl property: The announce_url property.
     * 
     * @return the announceUrl value.
     */
    @Metadata(properties = { MetadataProperties.GENERATED })
    public String getAnnounceUrl() {
        return this.announceUrl;
    }

    /**
     * Get the appName property: The app_name property.
     * 
     * @return the appName value.
     */
    @Metadata(properties = { MetadataProperties.GENERATED })
    public String getAppName() {
        return this.appName;
    }

    /**
     * Get the disableYsdkGuard property: The disable_ysdk_guard property.
     * 
     * @return the disableYsdkGuard value.
     */
    @Metadata(properties = { MetadataProperties.GENERATED })
    public Boolean isDisableYsdkGuard() {
        return this.disableYsdkGuard;
    }

    /**
     * Get the enableAnnouncePicPopup property: The enable_announce_pic_popup property.
     * 
     * @return the enableAnnouncePicPopup value.
     */
    @Metadata(properties = { MetadataProperties.GENERATED })
    public Boolean isEnableAnnouncePicPopup() {
        return this.enableAnnouncePicPopup;
    }

    /**
     * Get the enableUserCenter property: The enable_user_center property.
     * 
     * @return the enableUserCenter value.
     */
    @Metadata(properties = { MetadataProperties.GENERATED })
    public Boolean isEnableUserCenter() {
        return this.enableUserCenter;
    }

    /**
     * Get the functionalSwitchConfigs property: The functional_switch_configs property.
     * 
     * @return the functionalSwitchConfigs value.
     */
    @Metadata(properties = { MetadataProperties.GENERATED })
    public Map<String, BinaryData> getFunctionalSwitchConfigs() {
        return this.functionalSwitchConfigs;
    }

    /**
     * Get the logLevel property: The log_level property.
     * 
     * @return the logLevel value.
     */
    @Metadata(properties = { MetadataProperties.GENERATED })
    public String getLogLevel() {
        return this.logLevel;
    }

    /**
     * Get the protocol property: The protocol property.
     * 
     * @return the protocol value.
     */
    @Metadata(properties = { MetadataProperties.GENERATED })
    public Boolean isProtocol() {
        return this.protocol;
    }

    /**
     * Get the pushAliasType property: The push_alias_type property.
     * 
     * @return the pushAliasType value.
     */
    @Metadata(properties = { MetadataProperties.GENERATED })
    public Integer getPushAliasType() {
        return this.pushAliasType;
    }

    /**
     * Get the qrAppIcons property: The qr_app_icons property.
     * 
     * @return the qrAppIcons value.
     */
    @Metadata(properties = { MetadataProperties.GENERATED })
    public SdkGranterQrAppIcons getQrAppIcons() {
        return this.qrAppIcons;
    }

    /**
     * Get the qrCloudDisplayName property: The qr_cloud_display_name property.
     * 
     * @return the qrCloudDisplayName value.
     */
    @Metadata(properties = { MetadataProperties.GENERATED })
    public String getQrCloudDisplayName() {
        return this.qrCloudDisplayName;
    }

    /**
     * Get the qrEnabled property: The qr_enabled property.
     * 
     * @return the qrEnabled value.
     */
    @Metadata(properties = { MetadataProperties.GENERATED })
    public Boolean isQrEnabled() {
        return this.qrEnabled;
    }

    /**
     * Get the qrEnabledApps property: The qr_enabled_apps property.
     * 
     * @return the qrEnabledApps value.
     */
    @Metadata(properties = { MetadataProperties.GENERATED })
    public SdkGranterQrEnabledApps getQrEnabledApps() {
        return this.qrEnabledApps;
    }

    /**
     * Get the ugcProtocol property: The ugc_protocol property.
     * 
     * @return the ugcProtocol value.
     */
    @Metadata(properties = { MetadataProperties.GENERATED })
    public Boolean isUgcProtocol() {
        return this.ugcProtocol;
    }

    /**
     * Get the widgetConfig property: The widget_config property.
     * 
     * @return the widgetConfig value.
     */
    @Metadata(properties = { MetadataProperties.GENERATED })
    public BinaryData getWidgetConfig() {
        return this.widgetConfig;
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
     * {@inheritDoc}
     */
    @Metadata(properties = { MetadataProperties.GENERATED })
    @Override
    public JsonWriter toJson(JsonWriter jsonWriter) throws IOException {
        jsonWriter.writeStartObject();
        jsonWriter.writeStringField("announce_url", this.announceUrl);
        jsonWriter.writeStringField("app_name", this.appName);
        jsonWriter.writeBooleanField("disable_ysdk_guard", this.disableYsdkGuard);
        jsonWriter.writeBooleanField("enable_announce_pic_popup", this.enableAnnouncePicPopup);
        jsonWriter.writeBooleanField("enable_user_center", this.enableUserCenter);
        jsonWriter.writeMapField("functional_switch_configs", this.functionalSwitchConfigs, (writer, element) -> {
            if (element == null) {
                writer.writeNull();
            } else {
                element.writeTo(writer);
            }
        });
        jsonWriter.writeStringField("log_level", this.logLevel);
        jsonWriter.writeBooleanField("protocol", this.protocol);
        jsonWriter.writeNumberField("push_alias_type", this.pushAliasType);
        jsonWriter.writeJsonField("qr_app_icons", this.qrAppIcons);
        jsonWriter.writeStringField("qr_cloud_display_name", this.qrCloudDisplayName);
        jsonWriter.writeBooleanField("qr_enabled", this.qrEnabled);
        jsonWriter.writeJsonField("qr_enabled_apps", this.qrEnabledApps);
        jsonWriter.writeBooleanField("ugc_protocol", this.ugcProtocol);
        if (this.widgetConfig != null) {
            jsonWriter.writeFieldName("widget_config");
            this.widgetConfig.writeTo(jsonWriter);
        }
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
     * Reads an instance of SdkGranterConfigData from the JsonReader.
     * 
     * @param jsonReader The JsonReader being read.
     * @return An instance of SdkGranterConfigData if the JsonReader was pointing to an instance of it, or null if it
     * was pointing to JSON null.
     * @throws IOException If an error occurs while reading the SdkGranterConfigData.
     */
    @Metadata(properties = { MetadataProperties.GENERATED })
    public static SdkGranterConfigData fromJson(JsonReader jsonReader) throws IOException {
        return jsonReader.readObject(reader -> {
            SdkGranterConfigData deserializedSdkGranterConfigData = new SdkGranterConfigData();
            Map<String, BinaryData> additionalProperties = null;
            while (reader.nextToken() != JsonToken.END_OBJECT) {
                String fieldName = reader.getFieldName();
                reader.nextToken();

                if ("announce_url".equals(fieldName)) {
                    deserializedSdkGranterConfigData.announceUrl = reader.getString();
                } else if ("app_name".equals(fieldName)) {
                    deserializedSdkGranterConfigData.appName = reader.getString();
                } else if ("disable_ysdk_guard".equals(fieldName)) {
                    deserializedSdkGranterConfigData.disableYsdkGuard = reader.getNullable(JsonReader::getBoolean);
                } else if ("enable_announce_pic_popup".equals(fieldName)) {
                    deserializedSdkGranterConfigData.enableAnnouncePicPopup
                        = reader.getNullable(JsonReader::getBoolean);
                } else if ("enable_user_center".equals(fieldName)) {
                    deserializedSdkGranterConfigData.enableUserCenter = reader.getNullable(JsonReader::getBoolean);
                } else if ("functional_switch_configs".equals(fieldName)) {
                    Map<String, BinaryData> functionalSwitchConfigs = reader.readMap(reader1 -> reader1
                        .getNullable(nonNullReader -> BinaryData.fromObject(nonNullReader.readUntyped())));
                    deserializedSdkGranterConfigData.functionalSwitchConfigs = functionalSwitchConfigs;
                } else if ("log_level".equals(fieldName)) {
                    deserializedSdkGranterConfigData.logLevel = reader.getString();
                } else if ("protocol".equals(fieldName)) {
                    deserializedSdkGranterConfigData.protocol = reader.getNullable(JsonReader::getBoolean);
                } else if ("push_alias_type".equals(fieldName)) {
                    deserializedSdkGranterConfigData.pushAliasType = reader.getNullable(JsonReader::getInt);
                } else if ("qr_app_icons".equals(fieldName)) {
                    deserializedSdkGranterConfigData.qrAppIcons = SdkGranterQrAppIcons.fromJson(reader);
                } else if ("qr_cloud_display_name".equals(fieldName)) {
                    deserializedSdkGranterConfigData.qrCloudDisplayName = reader.getString();
                } else if ("qr_enabled".equals(fieldName)) {
                    deserializedSdkGranterConfigData.qrEnabled = reader.getNullable(JsonReader::getBoolean);
                } else if ("qr_enabled_apps".equals(fieldName)) {
                    deserializedSdkGranterConfigData.qrEnabledApps = SdkGranterQrEnabledApps.fromJson(reader);
                } else if ("ugc_protocol".equals(fieldName)) {
                    deserializedSdkGranterConfigData.ugcProtocol = reader.getNullable(JsonReader::getBoolean);
                } else if ("widget_config".equals(fieldName)) {
                    deserializedSdkGranterConfigData.widgetConfig
                        = reader.getNullable(nonNullReader -> BinaryData.fromObject(nonNullReader.readUntyped()));
                } else {
                    if (additionalProperties == null) {
                        additionalProperties = new LinkedHashMap<>();
                    }

                    additionalProperties.put(fieldName,
                        reader.getNullable(nonNullReader -> BinaryData.fromObject(nonNullReader.readUntyped())));
                }
            }
            deserializedSdkGranterConfigData.additionalProperties = additionalProperties;

            return deserializedSdkGranterConfigData;
        });
    }
}
