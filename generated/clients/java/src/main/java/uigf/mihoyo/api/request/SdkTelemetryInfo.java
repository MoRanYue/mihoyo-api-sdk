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
 * The SdkTelemetryInfo model.
 */
@Metadata(properties = { MetadataProperties.FLUENT })
public final class SdkTelemetryInfo implements JsonSerializable<SdkTelemetryInfo> {
    /*
     * The area property.
     */
    @Metadata(properties = { MetadataProperties.GENERATED })
    private String area;

    /*
     * The lifecycleId property.
     */
    @Metadata(properties = { MetadataProperties.GENERATED })
    private String lifecycleId;

    /*
     * The telemetryVersion property.
     */
    @Metadata(properties = { MetadataProperties.GENERATED })
    private String telemetryVersion;

    /*
     * Additional properties
     */
    @Metadata(properties = { MetadataProperties.GENERATED })
    private Map<String, BinaryData> additionalProperties;

    /**
     * Creates an instance of SdkTelemetryInfo class.
     */
    @Metadata(properties = { MetadataProperties.GENERATED })
    public SdkTelemetryInfo() {
    }

    /**
     * Get the area property: The area property.
     * 
     * @return the area value.
     */
    @Metadata(properties = { MetadataProperties.GENERATED })
    public String getArea() {
        return this.area;
    }

    /**
     * Set the area property: The area property.
     * 
     * @param area the area value to set.
     * @return the SdkTelemetryInfo object itself.
     */
    @Metadata(properties = { MetadataProperties.GENERATED })
    public SdkTelemetryInfo setArea(String area) {
        this.area = area;
        return this;
    }

    /**
     * Get the lifecycleId property: The lifecycleId property.
     * 
     * @return the lifecycleId value.
     */
    @Metadata(properties = { MetadataProperties.GENERATED })
    public String getLifecycleId() {
        return this.lifecycleId;
    }

    /**
     * Set the lifecycleId property: The lifecycleId property.
     * 
     * @param lifecycleId the lifecycleId value to set.
     * @return the SdkTelemetryInfo object itself.
     */
    @Metadata(properties = { MetadataProperties.GENERATED })
    public SdkTelemetryInfo setLifecycleId(String lifecycleId) {
        this.lifecycleId = lifecycleId;
        return this;
    }

    /**
     * Get the telemetryVersion property: The telemetryVersion property.
     * 
     * @return the telemetryVersion value.
     */
    @Metadata(properties = { MetadataProperties.GENERATED })
    public String getTelemetryVersion() {
        return this.telemetryVersion;
    }

    /**
     * Set the telemetryVersion property: The telemetryVersion property.
     * 
     * @param telemetryVersion the telemetryVersion value to set.
     * @return the SdkTelemetryInfo object itself.
     */
    @Metadata(properties = { MetadataProperties.GENERATED })
    public SdkTelemetryInfo setTelemetryVersion(String telemetryVersion) {
        this.telemetryVersion = telemetryVersion;
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
     * @return the SdkTelemetryInfo object itself.
     */
    @Metadata(properties = { MetadataProperties.GENERATED })
    public SdkTelemetryInfo setAdditionalProperties(Map<String, BinaryData> additionalProperties) {
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
        jsonWriter.writeStringField("area", this.area);
        jsonWriter.writeStringField("lifecycleId", this.lifecycleId);
        jsonWriter.writeStringField("telemetryVersion", this.telemetryVersion);
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
     * Reads an instance of SdkTelemetryInfo from the JsonReader.
     * 
     * @param jsonReader The JsonReader being read.
     * @return An instance of SdkTelemetryInfo if the JsonReader was pointing to an instance of it, or null if it was
     * pointing to JSON null.
     * @throws IOException If an error occurs while reading the SdkTelemetryInfo.
     */
    @Metadata(properties = { MetadataProperties.GENERATED })
    public static SdkTelemetryInfo fromJson(JsonReader jsonReader) throws IOException {
        return jsonReader.readObject(reader -> {
            SdkTelemetryInfo deserializedSdkTelemetryInfo = new SdkTelemetryInfo();
            Map<String, BinaryData> additionalProperties = null;
            while (reader.nextToken() != JsonToken.END_OBJECT) {
                String fieldName = reader.getFieldName();
                reader.nextToken();

                if ("area".equals(fieldName)) {
                    deserializedSdkTelemetryInfo.area = reader.getString();
                } else if ("lifecycleId".equals(fieldName)) {
                    deserializedSdkTelemetryInfo.lifecycleId = reader.getString();
                } else if ("telemetryVersion".equals(fieldName)) {
                    deserializedSdkTelemetryInfo.telemetryVersion = reader.getString();
                } else {
                    if (additionalProperties == null) {
                        additionalProperties = new LinkedHashMap<>();
                    }

                    additionalProperties.put(fieldName,
                        reader.getNullable(nonNullReader -> BinaryData.fromObject(nonNullReader.readUntyped())));
                }
            }
            deserializedSdkTelemetryInfo.additionalProperties = additionalProperties;

            return deserializedSdkTelemetryInfo;
        });
    }
}
