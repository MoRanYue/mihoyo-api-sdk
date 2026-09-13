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
 * The LoginTelemetryVersionInfo model.
 */
@Metadata(properties = { MetadataProperties.FLUENT })
public final class LoginTelemetryVersionInfo implements JsonSerializable<LoginTelemetryVersionInfo> {
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
     * The sdkVersion property.
     */
    @Metadata(properties = { MetadataProperties.GENERATED })
    private String sdkVersion;

    /*
     * Additional properties
     */
    @Metadata(properties = { MetadataProperties.GENERATED })
    private Map<String, BinaryData> additionalProperties;

    /**
     * Creates an instance of LoginTelemetryVersionInfo class.
     */
    @Metadata(properties = { MetadataProperties.GENERATED })
    public LoginTelemetryVersionInfo() {
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
     * @return the LoginTelemetryVersionInfo object itself.
     */
    @Metadata(properties = { MetadataProperties.GENERATED })
    public LoginTelemetryVersionInfo setClientVersion(String clientVersion) {
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
     * @return the LoginTelemetryVersionInfo object itself.
     */
    @Metadata(properties = { MetadataProperties.GENERATED })
    public LoginTelemetryVersionInfo setLogVersion(String logVersion) {
        this.logVersion = logVersion;
        return this;
    }

    /**
     * Get the sdkVersion property: The sdkVersion property.
     * 
     * @return the sdkVersion value.
     */
    @Metadata(properties = { MetadataProperties.GENERATED })
    public String getSdkVersion() {
        return this.sdkVersion;
    }

    /**
     * Set the sdkVersion property: The sdkVersion property.
     * 
     * @param sdkVersion the sdkVersion value to set.
     * @return the LoginTelemetryVersionInfo object itself.
     */
    @Metadata(properties = { MetadataProperties.GENERATED })
    public LoginTelemetryVersionInfo setSdkVersion(String sdkVersion) {
        this.sdkVersion = sdkVersion;
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
     * @return the LoginTelemetryVersionInfo object itself.
     */
    @Metadata(properties = { MetadataProperties.GENERATED })
    public LoginTelemetryVersionInfo setAdditionalProperties(Map<String, BinaryData> additionalProperties) {
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
        jsonWriter.writeStringField("sdkVersion", this.sdkVersion);
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
     * Reads an instance of LoginTelemetryVersionInfo from the JsonReader.
     * 
     * @param jsonReader The JsonReader being read.
     * @return An instance of LoginTelemetryVersionInfo if the JsonReader was pointing to an instance of it, or null if
     * it was pointing to JSON null.
     * @throws IOException If an error occurs while reading the LoginTelemetryVersionInfo.
     */
    @Metadata(properties = { MetadataProperties.GENERATED })
    public static LoginTelemetryVersionInfo fromJson(JsonReader jsonReader) throws IOException {
        return jsonReader.readObject(reader -> {
            LoginTelemetryVersionInfo deserializedLoginTelemetryVersionInfo = new LoginTelemetryVersionInfo();
            Map<String, BinaryData> additionalProperties = null;
            while (reader.nextToken() != JsonToken.END_OBJECT) {
                String fieldName = reader.getFieldName();
                reader.nextToken();

                if ("clientVersion".equals(fieldName)) {
                    deserializedLoginTelemetryVersionInfo.clientVersion = reader.getString();
                } else if ("logVersion".equals(fieldName)) {
                    deserializedLoginTelemetryVersionInfo.logVersion = reader.getString();
                } else if ("sdkVersion".equals(fieldName)) {
                    deserializedLoginTelemetryVersionInfo.sdkVersion = reader.getString();
                } else {
                    if (additionalProperties == null) {
                        additionalProperties = new LinkedHashMap<>();
                    }

                    additionalProperties.put(fieldName,
                        reader.getNullable(nonNullReader -> BinaryData.fromObject(nonNullReader.readUntyped())));
                }
            }
            deserializedLoginTelemetryVersionInfo.additionalProperties = additionalProperties;

            return deserializedLoginTelemetryVersionInfo;
        });
    }
}
