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
 * The SdkTelemetryVersionInfo model.
 */
@Metadata(properties = { MetadataProperties.FLUENT })
public final class SdkTelemetryVersionInfo implements JsonSerializable<SdkTelemetryVersionInfo> {
    /*
     * The clientVersion property.
     */
    @Metadata(properties = { MetadataProperties.GENERATED })
    private String clientVersion;

    /*
     * The logVersion property.
     */
    @Metadata(properties = { MetadataProperties.GENERATED })
    private String logVersion;

    /*
     * Additional properties
     */
    @Metadata(properties = { MetadataProperties.GENERATED })
    private Map<String, BinaryData> additionalProperties;

    /**
     * Creates an instance of SdkTelemetryVersionInfo class.
     */
    @Metadata(properties = { MetadataProperties.GENERATED })
    public SdkTelemetryVersionInfo() {
    }

    /**
     * Get the clientVersion property: The clientVersion property.
     * 
     * @return the clientVersion value.
     */
    @Metadata(properties = { MetadataProperties.GENERATED })
    public String getClientVersion() {
        return this.clientVersion;
    }

    /**
     * Set the clientVersion property: The clientVersion property.
     * 
     * @param clientVersion the clientVersion value to set.
     * @return the SdkTelemetryVersionInfo object itself.
     */
    @Metadata(properties = { MetadataProperties.GENERATED })
    public SdkTelemetryVersionInfo setClientVersion(String clientVersion) {
        this.clientVersion = clientVersion;
        return this;
    }

    /**
     * Get the logVersion property: The logVersion property.
     * 
     * @return the logVersion value.
     */
    @Metadata(properties = { MetadataProperties.GENERATED })
    public String getLogVersion() {
        return this.logVersion;
    }

    /**
     * Set the logVersion property: The logVersion property.
     * 
     * @param logVersion the logVersion value to set.
     * @return the SdkTelemetryVersionInfo object itself.
     */
    @Metadata(properties = { MetadataProperties.GENERATED })
    public SdkTelemetryVersionInfo setLogVersion(String logVersion) {
        this.logVersion = logVersion;
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
     * @return the SdkTelemetryVersionInfo object itself.
     */
    @Metadata(properties = { MetadataProperties.GENERATED })
    public SdkTelemetryVersionInfo setAdditionalProperties(Map<String, BinaryData> additionalProperties) {
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
        jsonWriter.writeStringField("clientVersion", this.clientVersion);
        jsonWriter.writeStringField("logVersion", this.logVersion);
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
     * Reads an instance of SdkTelemetryVersionInfo from the JsonReader.
     * 
     * @param jsonReader The JsonReader being read.
     * @return An instance of SdkTelemetryVersionInfo if the JsonReader was pointing to an instance of it, or null if it
     * was pointing to JSON null.
     * @throws IOException If an error occurs while reading the SdkTelemetryVersionInfo.
     */
    @Metadata(properties = { MetadataProperties.GENERATED })
    public static SdkTelemetryVersionInfo fromJson(JsonReader jsonReader) throws IOException {
        return jsonReader.readObject(reader -> {
            SdkTelemetryVersionInfo deserializedSdkTelemetryVersionInfo = new SdkTelemetryVersionInfo();
            Map<String, BinaryData> additionalProperties = null;
            while (reader.nextToken() != JsonToken.END_OBJECT) {
                String fieldName = reader.getFieldName();
                reader.nextToken();

                if ("clientVersion".equals(fieldName)) {
                    deserializedSdkTelemetryVersionInfo.clientVersion = reader.getString();
                } else if ("logVersion".equals(fieldName)) {
                    deserializedSdkTelemetryVersionInfo.logVersion = reader.getString();
                } else {
                    if (additionalProperties == null) {
                        additionalProperties = new LinkedHashMap<>();
                    }

                    additionalProperties.put(fieldName,
                        reader.getNullable(nonNullReader -> BinaryData.fromObject(nonNullReader.readUntyped())));
                }
            }
            deserializedSdkTelemetryVersionInfo.additionalProperties = additionalProperties;

            return deserializedSdkTelemetryVersionInfo;
        });
    }
}
