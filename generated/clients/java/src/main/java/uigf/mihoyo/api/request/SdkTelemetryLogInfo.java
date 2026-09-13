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
 * The SdkTelemetryLogInfo model.
 */
@Metadata(properties = { MetadataProperties.FLUENT })
public final class SdkTelemetryLogInfo implements JsonSerializable<SdkTelemetryLogInfo> {
    /*
     * The actionId property.
     */
    @Metadata(properties = { MetadataProperties.GENERATED })
    private Integer actionId;

    /*
     * The actionName property.
     */
    @Metadata(properties = { MetadataProperties.GENERATED })
    private String actionName;

    /*
     * The cBody property.
     */
    @Metadata(properties = { MetadataProperties.GENERATED })
    private String cBody;

    /*
     * The logTime property.
     */
    @Metadata(properties = { MetadataProperties.GENERATED })
    private String logTime;

    /*
     * Additional properties
     */
    @Metadata(properties = { MetadataProperties.GENERATED })
    private Map<String, BinaryData> additionalProperties;

    /**
     * Creates an instance of SdkTelemetryLogInfo class.
     */
    @Metadata(properties = { MetadataProperties.GENERATED })
    public SdkTelemetryLogInfo() {
    }

    /**
     * Get the actionId property: The actionId property.
     * 
     * @return the actionId value.
     */
    @Metadata(properties = { MetadataProperties.GENERATED })
    public Integer getActionId() {
        return this.actionId;
    }

    /**
     * Set the actionId property: The actionId property.
     * 
     * @param actionId the actionId value to set.
     * @return the SdkTelemetryLogInfo object itself.
     */
    @Metadata(properties = { MetadataProperties.GENERATED })
    public SdkTelemetryLogInfo setActionId(Integer actionId) {
        this.actionId = actionId;
        return this;
    }

    /**
     * Get the actionName property: The actionName property.
     * 
     * @return the actionName value.
     */
    @Metadata(properties = { MetadataProperties.GENERATED })
    public String getActionName() {
        return this.actionName;
    }

    /**
     * Set the actionName property: The actionName property.
     * 
     * @param actionName the actionName value to set.
     * @return the SdkTelemetryLogInfo object itself.
     */
    @Metadata(properties = { MetadataProperties.GENERATED })
    public SdkTelemetryLogInfo setActionName(String actionName) {
        this.actionName = actionName;
        return this;
    }

    /**
     * Get the cBody property: The cBody property.
     * 
     * @return the cBody value.
     */
    @Metadata(properties = { MetadataProperties.GENERATED })
    public String getCBody() {
        return this.cBody;
    }

    /**
     * Set the cBody property: The cBody property.
     * 
     * @param cBody the cBody value to set.
     * @return the SdkTelemetryLogInfo object itself.
     */
    @Metadata(properties = { MetadataProperties.GENERATED })
    public SdkTelemetryLogInfo setCBody(String cBody) {
        this.cBody = cBody;
        return this;
    }

    /**
     * Get the logTime property: The logTime property.
     * 
     * @return the logTime value.
     */
    @Metadata(properties = { MetadataProperties.GENERATED })
    public String getLogTime() {
        return this.logTime;
    }

    /**
     * Set the logTime property: The logTime property.
     * 
     * @param logTime the logTime value to set.
     * @return the SdkTelemetryLogInfo object itself.
     */
    @Metadata(properties = { MetadataProperties.GENERATED })
    public SdkTelemetryLogInfo setLogTime(String logTime) {
        this.logTime = logTime;
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
     * @return the SdkTelemetryLogInfo object itself.
     */
    @Metadata(properties = { MetadataProperties.GENERATED })
    public SdkTelemetryLogInfo setAdditionalProperties(Map<String, BinaryData> additionalProperties) {
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
        jsonWriter.writeNumberField("actionId", this.actionId);
        jsonWriter.writeStringField("actionName", this.actionName);
        jsonWriter.writeStringField("cBody", this.cBody);
        jsonWriter.writeStringField("logTime", this.logTime);
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
     * Reads an instance of SdkTelemetryLogInfo from the JsonReader.
     * 
     * @param jsonReader The JsonReader being read.
     * @return An instance of SdkTelemetryLogInfo if the JsonReader was pointing to an instance of it, or null if it was
     * pointing to JSON null.
     * @throws IOException If an error occurs while reading the SdkTelemetryLogInfo.
     */
    @Metadata(properties = { MetadataProperties.GENERATED })
    public static SdkTelemetryLogInfo fromJson(JsonReader jsonReader) throws IOException {
        return jsonReader.readObject(reader -> {
            SdkTelemetryLogInfo deserializedSdkTelemetryLogInfo = new SdkTelemetryLogInfo();
            Map<String, BinaryData> additionalProperties = null;
            while (reader.nextToken() != JsonToken.END_OBJECT) {
                String fieldName = reader.getFieldName();
                reader.nextToken();

                if ("actionId".equals(fieldName)) {
                    deserializedSdkTelemetryLogInfo.actionId = reader.getNullable(JsonReader::getInt);
                } else if ("actionName".equals(fieldName)) {
                    deserializedSdkTelemetryLogInfo.actionName = reader.getString();
                } else if ("cBody".equals(fieldName)) {
                    deserializedSdkTelemetryLogInfo.cBody = reader.getString();
                } else if ("logTime".equals(fieldName)) {
                    deserializedSdkTelemetryLogInfo.logTime = reader.getString();
                } else {
                    if (additionalProperties == null) {
                        additionalProperties = new LinkedHashMap<>();
                    }

                    additionalProperties.put(fieldName,
                        reader.getNullable(nonNullReader -> BinaryData.fromObject(nonNullReader.readUntyped())));
                }
            }
            deserializedSdkTelemetryLogInfo.additionalProperties = additionalProperties;

            return deserializedSdkTelemetryLogInfo;
        });
    }
}
