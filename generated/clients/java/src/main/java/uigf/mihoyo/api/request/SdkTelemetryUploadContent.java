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
 * The SdkTelemetryUploadContent model.
 */
@Metadata(properties = { MetadataProperties.FLUENT })
public final class SdkTelemetryUploadContent implements JsonSerializable<SdkTelemetryUploadContent> {
    /*
     * The deviceInfo property.
     */
    @Metadata(properties = { MetadataProperties.GENERATED })
    private SdkTelemetryDeviceInfo deviceInfo;

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
     * The logInfo property.
     */
    @Metadata(properties = { MetadataProperties.GENERATED })
    private SdkTelemetryLogInfo logInfo;

    /*
     * The telemetryInfo property.
     */
    @Metadata(properties = { MetadataProperties.GENERATED })
    private SdkTelemetryInfo telemetryInfo;

    /*
     * The userInfo property.
     */
    @Metadata(properties = { MetadataProperties.GENERATED })
    private SdkTelemetryUserInfo userInfo;

    /*
     * The versionInfo property.
     */
    @Metadata(properties = { MetadataProperties.GENERATED })
    private SdkTelemetryVersionInfo versionInfo;

    /*
     * Additional properties
     */
    @Metadata(properties = { MetadataProperties.GENERATED })
    private Map<String, BinaryData> additionalProperties;

    /**
     * Creates an instance of SdkTelemetryUploadContent class.
     */
    @Metadata(properties = { MetadataProperties.GENERATED })
    public SdkTelemetryUploadContent() {
    }

    /**
     * Get the deviceInfo property: The deviceInfo property.
     * 
     * @return the deviceInfo value.
     */
    @Metadata(properties = { MetadataProperties.GENERATED })
    public SdkTelemetryDeviceInfo getDeviceInfo() {
        return this.deviceInfo;
    }

    /**
     * Set the deviceInfo property: The deviceInfo property.
     * 
     * @param deviceInfo the deviceInfo value to set.
     * @return the SdkTelemetryUploadContent object itself.
     */
    @Metadata(properties = { MetadataProperties.GENERATED })
    public SdkTelemetryUploadContent setDeviceInfo(SdkTelemetryDeviceInfo deviceInfo) {
        this.deviceInfo = deviceInfo;
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
     * @return the SdkTelemetryUploadContent object itself.
     */
    @Metadata(properties = { MetadataProperties.GENERATED })
    public SdkTelemetryUploadContent setEventTimeMs(String eventTimeMs) {
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
     * @return the SdkTelemetryUploadContent object itself.
     */
    @Metadata(properties = { MetadataProperties.GENERATED })
    public SdkTelemetryUploadContent setLaunchTraceId(String launchTraceId) {
        this.launchTraceId = launchTraceId;
        return this;
    }

    /**
     * Get the logInfo property: The logInfo property.
     * 
     * @return the logInfo value.
     */
    @Metadata(properties = { MetadataProperties.GENERATED })
    public SdkTelemetryLogInfo getLogInfo() {
        return this.logInfo;
    }

    /**
     * Set the logInfo property: The logInfo property.
     * 
     * @param logInfo the logInfo value to set.
     * @return the SdkTelemetryUploadContent object itself.
     */
    @Metadata(properties = { MetadataProperties.GENERATED })
    public SdkTelemetryUploadContent setLogInfo(SdkTelemetryLogInfo logInfo) {
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
     * @return the SdkTelemetryUploadContent object itself.
     */
    @Metadata(properties = { MetadataProperties.GENERATED })
    public SdkTelemetryUploadContent setTelemetryInfo(SdkTelemetryInfo telemetryInfo) {
        this.telemetryInfo = telemetryInfo;
        return this;
    }

    /**
     * Get the userInfo property: The userInfo property.
     * 
     * @return the userInfo value.
     */
    @Metadata(properties = { MetadataProperties.GENERATED })
    public SdkTelemetryUserInfo getUserInfo() {
        return this.userInfo;
    }

    /**
     * Set the userInfo property: The userInfo property.
     * 
     * @param userInfo the userInfo value to set.
     * @return the SdkTelemetryUploadContent object itself.
     */
    @Metadata(properties = { MetadataProperties.GENERATED })
    public SdkTelemetryUploadContent setUserInfo(SdkTelemetryUserInfo userInfo) {
        this.userInfo = userInfo;
        return this;
    }

    /**
     * Get the versionInfo property: The versionInfo property.
     * 
     * @return the versionInfo value.
     */
    @Metadata(properties = { MetadataProperties.GENERATED })
    public SdkTelemetryVersionInfo getVersionInfo() {
        return this.versionInfo;
    }

    /**
     * Set the versionInfo property: The versionInfo property.
     * 
     * @param versionInfo the versionInfo value to set.
     * @return the SdkTelemetryUploadContent object itself.
     */
    @Metadata(properties = { MetadataProperties.GENERATED })
    public SdkTelemetryUploadContent setVersionInfo(SdkTelemetryVersionInfo versionInfo) {
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
     * @return the SdkTelemetryUploadContent object itself.
     */
    @Metadata(properties = { MetadataProperties.GENERATED })
    public SdkTelemetryUploadContent setAdditionalProperties(Map<String, BinaryData> additionalProperties) {
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
        jsonWriter.writeJsonField("deviceInfo", this.deviceInfo);
        jsonWriter.writeStringField("eventTimeMs", this.eventTimeMs);
        jsonWriter.writeStringField("launchTraceId", this.launchTraceId);
        jsonWriter.writeJsonField("logInfo", this.logInfo);
        jsonWriter.writeJsonField("telemetryInfo", this.telemetryInfo);
        jsonWriter.writeJsonField("userInfo", this.userInfo);
        jsonWriter.writeJsonField("versionInfo", this.versionInfo);
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
     * Reads an instance of SdkTelemetryUploadContent from the JsonReader.
     * 
     * @param jsonReader The JsonReader being read.
     * @return An instance of SdkTelemetryUploadContent if the JsonReader was pointing to an instance of it, or null if
     * it was pointing to JSON null.
     * @throws IOException If an error occurs while reading the SdkTelemetryUploadContent.
     */
    @Metadata(properties = { MetadataProperties.GENERATED })
    public static SdkTelemetryUploadContent fromJson(JsonReader jsonReader) throws IOException {
        return jsonReader.readObject(reader -> {
            SdkTelemetryUploadContent deserializedSdkTelemetryUploadContent = new SdkTelemetryUploadContent();
            Map<String, BinaryData> additionalProperties = null;
            while (reader.nextToken() != JsonToken.END_OBJECT) {
                String fieldName = reader.getFieldName();
                reader.nextToken();

                if ("deviceInfo".equals(fieldName)) {
                    deserializedSdkTelemetryUploadContent.deviceInfo = SdkTelemetryDeviceInfo.fromJson(reader);
                } else if ("eventTimeMs".equals(fieldName)) {
                    deserializedSdkTelemetryUploadContent.eventTimeMs = reader.getString();
                } else if ("launchTraceId".equals(fieldName)) {
                    deserializedSdkTelemetryUploadContent.launchTraceId = reader.getString();
                } else if ("logInfo".equals(fieldName)) {
                    deserializedSdkTelemetryUploadContent.logInfo = SdkTelemetryLogInfo.fromJson(reader);
                } else if ("telemetryInfo".equals(fieldName)) {
                    deserializedSdkTelemetryUploadContent.telemetryInfo = SdkTelemetryInfo.fromJson(reader);
                } else if ("userInfo".equals(fieldName)) {
                    deserializedSdkTelemetryUploadContent.userInfo = SdkTelemetryUserInfo.fromJson(reader);
                } else if ("versionInfo".equals(fieldName)) {
                    deserializedSdkTelemetryUploadContent.versionInfo = SdkTelemetryVersionInfo.fromJson(reader);
                } else {
                    if (additionalProperties == null) {
                        additionalProperties = new LinkedHashMap<>();
                    }

                    additionalProperties.put(fieldName,
                        reader.getNullable(nonNullReader -> BinaryData.fromObject(nonNullReader.readUntyped())));
                }
            }
            deserializedSdkTelemetryUploadContent.additionalProperties = additionalProperties;

            return deserializedSdkTelemetryUploadContent;
        });
    }
}
