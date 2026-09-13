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
 * The GameSdkTelemetryUploadContent model.
 */
@Metadata(properties = { MetadataProperties.FLUENT })
public final class GameSdkTelemetryUploadContent implements JsonSerializable<GameSdkTelemetryUploadContent> {
    /*
     * The device_info property.
     */
    @Metadata(properties = { MetadataProperties.GENERATED })
    private GameSdkSnakeDeviceInfo snakeDeviceInfo;

    /*
     * The deviceInfo property.
     */
    @Metadata(properties = { MetadataProperties.GENERATED })
    private GameSdkCamelDeviceInfo camelDeviceInfo;

    /*
     * The eventTimeMs property.
     */
    @Metadata(properties = { MetadataProperties.GENERATED })
    private String eventTimeMs;

    /*
     * The launchTraceId property.
     */
    @Metadata(properties = { MetadataProperties.GENERATED })
    private String launchTraceId;

    /*
     * The log_info property.
     */
    @Metadata(properties = { MetadataProperties.GENERATED })
    private GameSdkLogInfo logInfo;

    /*
     * The telemetryInfo property.
     */
    @Metadata(properties = { MetadataProperties.GENERATED })
    private SdkTelemetryInfo telemetryInfo;

    /*
     * The user_info property.
     */
    @Metadata(properties = { MetadataProperties.GENERATED })
    private GameSdkUserInfo userInfo;

    /*
     * The version_info property.
     */
    @Metadata(properties = { MetadataProperties.GENERATED })
    private GameSdkVersionInfo versionInfo;

    /*
     * Additional properties
     */
    @Metadata(properties = { MetadataProperties.GENERATED })
    private Map<String, BinaryData> additionalProperties;

    /**
     * Creates an instance of GameSdkTelemetryUploadContent class.
     */
    @Metadata(properties = { MetadataProperties.GENERATED })
    public GameSdkTelemetryUploadContent() {
    }

    /**
     * Get the snakeDeviceInfo property: The device_info property.
     * 
     * @return the snakeDeviceInfo value.
     */
    @Metadata(properties = { MetadataProperties.GENERATED })
    public GameSdkSnakeDeviceInfo getSnakeDeviceInfo() {
        return this.snakeDeviceInfo;
    }

    /**
     * Set the snakeDeviceInfo property: The device_info property.
     * 
     * @param snakeDeviceInfo the snakeDeviceInfo value to set.
     * @return the GameSdkTelemetryUploadContent object itself.
     */
    @Metadata(properties = { MetadataProperties.GENERATED })
    public GameSdkTelemetryUploadContent setSnakeDeviceInfo(GameSdkSnakeDeviceInfo snakeDeviceInfo) {
        this.snakeDeviceInfo = snakeDeviceInfo;
        return this;
    }

    /**
     * Get the camelDeviceInfo property: The deviceInfo property.
     * 
     * @return the camelDeviceInfo value.
     */
    @Metadata(properties = { MetadataProperties.GENERATED })
    public GameSdkCamelDeviceInfo getCamelDeviceInfo() {
        return this.camelDeviceInfo;
    }

    /**
     * Set the camelDeviceInfo property: The deviceInfo property.
     * 
     * @param camelDeviceInfo the camelDeviceInfo value to set.
     * @return the GameSdkTelemetryUploadContent object itself.
     */
    @Metadata(properties = { MetadataProperties.GENERATED })
    public GameSdkTelemetryUploadContent setCamelDeviceInfo(GameSdkCamelDeviceInfo camelDeviceInfo) {
        this.camelDeviceInfo = camelDeviceInfo;
        return this;
    }

    /**
     * Get the eventTimeMs property: The eventTimeMs property.
     * 
     * @return the eventTimeMs value.
     */
    @Metadata(properties = { MetadataProperties.GENERATED })
    public String getEventTimeMs() {
        return this.eventTimeMs;
    }

    /**
     * Set the eventTimeMs property: The eventTimeMs property.
     * 
     * @param eventTimeMs the eventTimeMs value to set.
     * @return the GameSdkTelemetryUploadContent object itself.
     */
    @Metadata(properties = { MetadataProperties.GENERATED })
    public GameSdkTelemetryUploadContent setEventTimeMs(String eventTimeMs) {
        this.eventTimeMs = eventTimeMs;
        return this;
    }

    /**
     * Get the launchTraceId property: The launchTraceId property.
     * 
     * @return the launchTraceId value.
     */
    @Metadata(properties = { MetadataProperties.GENERATED })
    public String getLaunchTraceId() {
        return this.launchTraceId;
    }

    /**
     * Set the launchTraceId property: The launchTraceId property.
     * 
     * @param launchTraceId the launchTraceId value to set.
     * @return the GameSdkTelemetryUploadContent object itself.
     */
    @Metadata(properties = { MetadataProperties.GENERATED })
    public GameSdkTelemetryUploadContent setLaunchTraceId(String launchTraceId) {
        this.launchTraceId = launchTraceId;
        return this;
    }

    /**
     * Get the logInfo property: The log_info property.
     * 
     * @return the logInfo value.
     */
    @Metadata(properties = { MetadataProperties.GENERATED })
    public GameSdkLogInfo getLogInfo() {
        return this.logInfo;
    }

    /**
     * Set the logInfo property: The log_info property.
     * 
     * @param logInfo the logInfo value to set.
     * @return the GameSdkTelemetryUploadContent object itself.
     */
    @Metadata(properties = { MetadataProperties.GENERATED })
    public GameSdkTelemetryUploadContent setLogInfo(GameSdkLogInfo logInfo) {
        this.logInfo = logInfo;
        return this;
    }

    /**
     * Get the telemetryInfo property: The telemetryInfo property.
     * 
     * @return the telemetryInfo value.
     */
    @Metadata(properties = { MetadataProperties.GENERATED })
    public SdkTelemetryInfo getTelemetryInfo() {
        return this.telemetryInfo;
    }

    /**
     * Set the telemetryInfo property: The telemetryInfo property.
     * 
     * @param telemetryInfo the telemetryInfo value to set.
     * @return the GameSdkTelemetryUploadContent object itself.
     */
    @Metadata(properties = { MetadataProperties.GENERATED })
    public GameSdkTelemetryUploadContent setTelemetryInfo(SdkTelemetryInfo telemetryInfo) {
        this.telemetryInfo = telemetryInfo;
        return this;
    }

    /**
     * Get the userInfo property: The user_info property.
     * 
     * @return the userInfo value.
     */
    @Metadata(properties = { MetadataProperties.GENERATED })
    public GameSdkUserInfo getUserInfo() {
        return this.userInfo;
    }

    /**
     * Set the userInfo property: The user_info property.
     * 
     * @param userInfo the userInfo value to set.
     * @return the GameSdkTelemetryUploadContent object itself.
     */
    @Metadata(properties = { MetadataProperties.GENERATED })
    public GameSdkTelemetryUploadContent setUserInfo(GameSdkUserInfo userInfo) {
        this.userInfo = userInfo;
        return this;
    }

    /**
     * Get the versionInfo property: The version_info property.
     * 
     * @return the versionInfo value.
     */
    @Metadata(properties = { MetadataProperties.GENERATED })
    public GameSdkVersionInfo getVersionInfo() {
        return this.versionInfo;
    }

    /**
     * Set the versionInfo property: The version_info property.
     * 
     * @param versionInfo the versionInfo value to set.
     * @return the GameSdkTelemetryUploadContent object itself.
     */
    @Metadata(properties = { MetadataProperties.GENERATED })
    public GameSdkTelemetryUploadContent setVersionInfo(GameSdkVersionInfo versionInfo) {
        this.versionInfo = versionInfo;
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
     * @return the GameSdkTelemetryUploadContent object itself.
     */
    @Metadata(properties = { MetadataProperties.GENERATED })
    public GameSdkTelemetryUploadContent setAdditionalProperties(Map<String, BinaryData> additionalProperties) {
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
        jsonWriter.writeJsonField("device_info", this.snakeDeviceInfo);
        jsonWriter.writeJsonField("deviceInfo", this.camelDeviceInfo);
        jsonWriter.writeStringField("eventTimeMs", this.eventTimeMs);
        jsonWriter.writeStringField("launchTraceId", this.launchTraceId);
        jsonWriter.writeJsonField("log_info", this.logInfo);
        jsonWriter.writeJsonField("telemetryInfo", this.telemetryInfo);
        jsonWriter.writeJsonField("user_info", this.userInfo);
        jsonWriter.writeJsonField("version_info", this.versionInfo);
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
     * Reads an instance of GameSdkTelemetryUploadContent from the JsonReader.
     * 
     * @param jsonReader The JsonReader being read.
     * @return An instance of GameSdkTelemetryUploadContent if the JsonReader was pointing to an instance of it, or null
     * if it was pointing to JSON null.
     * @throws IOException If an error occurs while reading the GameSdkTelemetryUploadContent.
     */
    @Metadata(properties = { MetadataProperties.GENERATED })
    public static GameSdkTelemetryUploadContent fromJson(JsonReader jsonReader) throws IOException {
        return jsonReader.readObject(reader -> {
            GameSdkTelemetryUploadContent deserializedGameSdkTelemetryUploadContent
                = new GameSdkTelemetryUploadContent();
            Map<String, BinaryData> additionalProperties = null;
            while (reader.nextToken() != JsonToken.END_OBJECT) {
                String fieldName = reader.getFieldName();
                reader.nextToken();

                if ("device_info".equals(fieldName)) {
                    deserializedGameSdkTelemetryUploadContent.snakeDeviceInfo = GameSdkSnakeDeviceInfo.fromJson(reader);
                } else if ("deviceInfo".equals(fieldName)) {
                    deserializedGameSdkTelemetryUploadContent.camelDeviceInfo = GameSdkCamelDeviceInfo.fromJson(reader);
                } else if ("eventTimeMs".equals(fieldName)) {
                    deserializedGameSdkTelemetryUploadContent.eventTimeMs = reader.getString();
                } else if ("launchTraceId".equals(fieldName)) {
                    deserializedGameSdkTelemetryUploadContent.launchTraceId = reader.getString();
                } else if ("log_info".equals(fieldName)) {
                    deserializedGameSdkTelemetryUploadContent.logInfo = GameSdkLogInfo.fromJson(reader);
                } else if ("telemetryInfo".equals(fieldName)) {
                    deserializedGameSdkTelemetryUploadContent.telemetryInfo = SdkTelemetryInfo.fromJson(reader);
                } else if ("user_info".equals(fieldName)) {
                    deserializedGameSdkTelemetryUploadContent.userInfo = GameSdkUserInfo.fromJson(reader);
                } else if ("version_info".equals(fieldName)) {
                    deserializedGameSdkTelemetryUploadContent.versionInfo = GameSdkVersionInfo.fromJson(reader);
                } else {
                    if (additionalProperties == null) {
                        additionalProperties = new LinkedHashMap<>();
                    }

                    additionalProperties.put(fieldName,
                        reader.getNullable(nonNullReader -> BinaryData.fromObject(nonNullReader.readUntyped())));
                }
            }
            deserializedGameSdkTelemetryUploadContent.additionalProperties = additionalProperties;

            return deserializedGameSdkTelemetryUploadContent;
        });
    }
}
