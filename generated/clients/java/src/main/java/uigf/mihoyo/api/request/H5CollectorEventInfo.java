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
 * The H5CollectorEventInfo model.
 */
@Metadata(properties = { MetadataProperties.FLUENT })
public final class H5CollectorEventInfo implements JsonSerializable<H5CollectorEventInfo> {
    /*
     * The eventAction property.
     */
    @Metadata(properties = { MetadataProperties.GENERATED })
    private String eventAction;

    /*
     * The eventCategory property.
     */
    @Metadata(properties = { MetadataProperties.GENERATED })
    private String eventCategory;

    /*
     * The eventLabel property.
     */
    @Metadata(properties = { MetadataProperties.GENERATED })
    private String eventLabel;

    /*
     * The eventValue property.
     */
    @Metadata(properties = { MetadataProperties.GENERATED })
    private BinaryData eventValue;

    /*
     * The extra_info property.
     */
    @Metadata(properties = { MetadataProperties.GENERATED })
    private H5CollectorEventExtraInfo extraInfo;

    /*
     * The timestamp property.
     */
    @Metadata(properties = { MetadataProperties.GENERATED })
    private Long timestamp;

    /*
     * Additional properties
     */
    @Metadata(properties = { MetadataProperties.GENERATED })
    private Map<String, BinaryData> additionalProperties;

    /**
     * Creates an instance of H5CollectorEventInfo class.
     */
    @Metadata(properties = { MetadataProperties.GENERATED })
    public H5CollectorEventInfo() {
    }

    /**
     * Get the eventAction property: The eventAction property.
     * 
     * @return the eventAction value.
     */
    @Metadata(properties = { MetadataProperties.GENERATED })
    public String getEventAction() {
        return this.eventAction;
    }

    /**
     * Set the eventAction property: The eventAction property.
     * 
     * @param eventAction the eventAction value to set.
     * @return the H5CollectorEventInfo object itself.
     */
    @Metadata(properties = { MetadataProperties.GENERATED })
    public H5CollectorEventInfo setEventAction(String eventAction) {
        this.eventAction = eventAction;
        return this;
    }

    /**
     * Get the eventCategory property: The eventCategory property.
     * 
     * @return the eventCategory value.
     */
    @Metadata(properties = { MetadataProperties.GENERATED })
    public String getEventCategory() {
        return this.eventCategory;
    }

    /**
     * Set the eventCategory property: The eventCategory property.
     * 
     * @param eventCategory the eventCategory value to set.
     * @return the H5CollectorEventInfo object itself.
     */
    @Metadata(properties = { MetadataProperties.GENERATED })
    public H5CollectorEventInfo setEventCategory(String eventCategory) {
        this.eventCategory = eventCategory;
        return this;
    }

    /**
     * Get the eventLabel property: The eventLabel property.
     * 
     * @return the eventLabel value.
     */
    @Metadata(properties = { MetadataProperties.GENERATED })
    public String getEventLabel() {
        return this.eventLabel;
    }

    /**
     * Set the eventLabel property: The eventLabel property.
     * 
     * @param eventLabel the eventLabel value to set.
     * @return the H5CollectorEventInfo object itself.
     */
    @Metadata(properties = { MetadataProperties.GENERATED })
    public H5CollectorEventInfo setEventLabel(String eventLabel) {
        this.eventLabel = eventLabel;
        return this;
    }

    /**
     * Get the eventValue property: The eventValue property.
     * 
     * @return the eventValue value.
     */
    @Metadata(properties = { MetadataProperties.GENERATED })
    public BinaryData getEventValue() {
        return this.eventValue;
    }

    /**
     * Set the eventValue property: The eventValue property.
     * 
     * @param eventValue the eventValue value to set.
     * @return the H5CollectorEventInfo object itself.
     */
    @Metadata(properties = { MetadataProperties.GENERATED })
    public H5CollectorEventInfo setEventValue(BinaryData eventValue) {
        this.eventValue = eventValue;
        return this;
    }

    /**
     * Get the extraInfo property: The extra_info property.
     * 
     * @return the extraInfo value.
     */
    @Metadata(properties = { MetadataProperties.GENERATED })
    public H5CollectorEventExtraInfo getExtraInfo() {
        return this.extraInfo;
    }

    /**
     * Set the extraInfo property: The extra_info property.
     * 
     * @param extraInfo the extraInfo value to set.
     * @return the H5CollectorEventInfo object itself.
     */
    @Metadata(properties = { MetadataProperties.GENERATED })
    public H5CollectorEventInfo setExtraInfo(H5CollectorEventExtraInfo extraInfo) {
        this.extraInfo = extraInfo;
        return this;
    }

    /**
     * Get the timestamp property: The timestamp property.
     * 
     * @return the timestamp value.
     */
    @Metadata(properties = { MetadataProperties.GENERATED })
    public Long getTimestamp() {
        return this.timestamp;
    }

    /**
     * Set the timestamp property: The timestamp property.
     * 
     * @param timestamp the timestamp value to set.
     * @return the H5CollectorEventInfo object itself.
     */
    @Metadata(properties = { MetadataProperties.GENERATED })
    public H5CollectorEventInfo setTimestamp(Long timestamp) {
        this.timestamp = timestamp;
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
     * @return the H5CollectorEventInfo object itself.
     */
    @Metadata(properties = { MetadataProperties.GENERATED })
    public H5CollectorEventInfo setAdditionalProperties(Map<String, BinaryData> additionalProperties) {
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
        jsonWriter.writeStringField("eventAction", this.eventAction);
        jsonWriter.writeStringField("eventCategory", this.eventCategory);
        jsonWriter.writeStringField("eventLabel", this.eventLabel);
        if (this.eventValue != null) {
            jsonWriter.writeFieldName("eventValue");
            this.eventValue.writeTo(jsonWriter);
        }
        jsonWriter.writeJsonField("extra_info", this.extraInfo);
        jsonWriter.writeNumberField("timestamp", this.timestamp);
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
     * Reads an instance of H5CollectorEventInfo from the JsonReader.
     * 
     * @param jsonReader The JsonReader being read.
     * @return An instance of H5CollectorEventInfo if the JsonReader was pointing to an instance of it, or null if it
     * was pointing to JSON null.
     * @throws IOException If an error occurs while reading the H5CollectorEventInfo.
     */
    @Metadata(properties = { MetadataProperties.GENERATED })
    public static H5CollectorEventInfo fromJson(JsonReader jsonReader) throws IOException {
        return jsonReader.readObject(reader -> {
            H5CollectorEventInfo deserializedH5CollectorEventInfo = new H5CollectorEventInfo();
            Map<String, BinaryData> additionalProperties = null;
            while (reader.nextToken() != JsonToken.END_OBJECT) {
                String fieldName = reader.getFieldName();
                reader.nextToken();

                if ("eventAction".equals(fieldName)) {
                    deserializedH5CollectorEventInfo.eventAction = reader.getString();
                } else if ("eventCategory".equals(fieldName)) {
                    deserializedH5CollectorEventInfo.eventCategory = reader.getString();
                } else if ("eventLabel".equals(fieldName)) {
                    deserializedH5CollectorEventInfo.eventLabel = reader.getString();
                } else if ("eventValue".equals(fieldName)) {
                    deserializedH5CollectorEventInfo.eventValue
                        = reader.getNullable(nonNullReader -> BinaryData.fromObject(nonNullReader.readUntyped()));
                } else if ("extra_info".equals(fieldName)) {
                    deserializedH5CollectorEventInfo.extraInfo = H5CollectorEventExtraInfo.fromJson(reader);
                } else if ("timestamp".equals(fieldName)) {
                    deserializedH5CollectorEventInfo.timestamp = reader.getNullable(JsonReader::getLong);
                } else {
                    if (additionalProperties == null) {
                        additionalProperties = new LinkedHashMap<>();
                    }

                    additionalProperties.put(fieldName,
                        reader.getNullable(nonNullReader -> BinaryData.fromObject(nonNullReader.readUntyped())));
                }
            }
            deserializedH5CollectorEventInfo.additionalProperties = additionalProperties;

            return deserializedH5CollectorEventInfo;
        });
    }
}
