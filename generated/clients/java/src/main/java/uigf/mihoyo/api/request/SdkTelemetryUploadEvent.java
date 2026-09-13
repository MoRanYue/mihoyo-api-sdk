package uigf.mihoyo.api.request;

import io.clientcore.core.annotations.Metadata;
import io.clientcore.core.annotations.MetadataProperties;
import io.clientcore.core.models.binarydata.BinaryData;
import io.clientcore.core.serialization.json.JsonReader;
import io.clientcore.core.serialization.json.JsonToken;
import io.clientcore.core.serialization.json.JsonWriter;
import java.io.IOException;
import java.util.LinkedHashMap;
import java.util.Map;

/**
 * The SdkTelemetryUploadEvent model.
 */
@Metadata(properties = { MetadataProperties.FLUENT })
public final class SdkTelemetryUploadEvent extends TelemetryEvent {
    /*
     * The msgId property.
     */
    @Metadata(properties = { MetadataProperties.GENERATED })
    private String msgId;

    /*
     * The uploadContent property.
     */
    @Metadata(properties = { MetadataProperties.GENERATED })
    private SdkTelemetryUploadContent uploadContent;

    /**
     * Creates an instance of SdkTelemetryUploadEvent class.
     */
    @Metadata(properties = { MetadataProperties.GENERATED })
    public SdkTelemetryUploadEvent() {
    }

    /**
     * Get the msgId property: The msgId property.
     * 
     * @return the msgId value.
     */
    @Metadata(properties = { MetadataProperties.GENERATED })
    public String getMsgId() {
        return this.msgId;
    }

    /**
     * Set the msgId property: The msgId property.
     * 
     * @param msgId the msgId value to set.
     * @return the SdkTelemetryUploadEvent object itself.
     */
    @Metadata(properties = { MetadataProperties.GENERATED })
    public SdkTelemetryUploadEvent setMsgId(String msgId) {
        this.msgId = msgId;
        return this;
    }

    /**
     * Get the uploadContent property: The uploadContent property.
     * 
     * @return the uploadContent value.
     */
    @Metadata(properties = { MetadataProperties.GENERATED })
    public SdkTelemetryUploadContent getUploadContent() {
        return this.uploadContent;
    }

    /**
     * Set the uploadContent property: The uploadContent property.
     * 
     * @param uploadContent the uploadContent value to set.
     * @return the SdkTelemetryUploadEvent object itself.
     */
    @Metadata(properties = { MetadataProperties.GENERATED })
    public SdkTelemetryUploadEvent setUploadContent(SdkTelemetryUploadContent uploadContent) {
        this.uploadContent = uploadContent;
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Metadata(properties = { MetadataProperties.GENERATED })
    @Override
    public SdkTelemetryUploadEvent setApplicationId(Integer applicationId) {
        super.setApplicationId(applicationId);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Metadata(properties = { MetadataProperties.GENERATED })
    @Override
    public SdkTelemetryUploadEvent setApplicationName(String applicationName) {
        super.setApplicationName(applicationName);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Metadata(properties = { MetadataProperties.GENERATED })
    @Override
    public SdkTelemetryUploadEvent setEventId(Integer eventId) {
        super.setEventId(eventId);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Metadata(properties = { MetadataProperties.GENERATED })
    @Override
    public SdkTelemetryUploadEvent setEventName(String eventName) {
        super.setEventName(eventName);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Metadata(properties = { MetadataProperties.GENERATED })
    @Override
    public SdkTelemetryUploadEvent setEventTime(String eventTime) {
        super.setEventTime(eventTime);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Metadata(properties = { MetadataProperties.GENERATED })
    @Override
    public JsonWriter toJson(JsonWriter jsonWriter) throws IOException {
        jsonWriter.writeStartObject();
        jsonWriter.writeNumberField("applicationId", getApplicationId());
        jsonWriter.writeStringField("applicationName", getApplicationName());
        jsonWriter.writeNumberField("eventId", getEventId());
        jsonWriter.writeStringField("eventName", getEventName());
        jsonWriter.writeStringField("eventTime", getEventTime());
        jsonWriter.writeStringField("msgId", this.msgId);
        jsonWriter.writeJsonField("uploadContent", this.uploadContent);
        if (getAdditionalProperties() != null) {
            for (Map.Entry<String, BinaryData> additionalProperty : getAdditionalProperties().entrySet()) {
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
     * Reads an instance of SdkTelemetryUploadEvent from the JsonReader.
     * 
     * @param jsonReader The JsonReader being read.
     * @return An instance of SdkTelemetryUploadEvent if the JsonReader was pointing to an instance of it, or null if it
     * was pointing to JSON null.
     * @throws IOException If an error occurs while reading the SdkTelemetryUploadEvent.
     */
    @Metadata(properties = { MetadataProperties.GENERATED })
    public static SdkTelemetryUploadEvent fromJson(JsonReader jsonReader) throws IOException {
        return jsonReader.readObject(reader -> {
            SdkTelemetryUploadEvent deserializedSdkTelemetryUploadEvent = new SdkTelemetryUploadEvent();
            Map<String, BinaryData> additionalProperties = null;
            while (reader.nextToken() != JsonToken.END_OBJECT) {
                String fieldName = reader.getFieldName();
                reader.nextToken();

                if ("applicationId".equals(fieldName)) {
                    deserializedSdkTelemetryUploadEvent.setApplicationId(reader.getNullable(JsonReader::getInt));
                } else if ("applicationName".equals(fieldName)) {
                    deserializedSdkTelemetryUploadEvent.setApplicationName(reader.getString());
                } else if ("eventId".equals(fieldName)) {
                    deserializedSdkTelemetryUploadEvent.setEventId(reader.getNullable(JsonReader::getInt));
                } else if ("eventName".equals(fieldName)) {
                    deserializedSdkTelemetryUploadEvent.setEventName(reader.getString());
                } else if ("eventTime".equals(fieldName)) {
                    deserializedSdkTelemetryUploadEvent.setEventTime(reader.getString());
                } else if ("msgId".equals(fieldName)) {
                    deserializedSdkTelemetryUploadEvent.msgId = reader.getString();
                } else if ("uploadContent".equals(fieldName)) {
                    deserializedSdkTelemetryUploadEvent.uploadContent = SdkTelemetryUploadContent.fromJson(reader);
                } else {
                    if (additionalProperties == null) {
                        additionalProperties = new LinkedHashMap<>();
                    }

                    additionalProperties.put(fieldName,
                        reader.getNullable(nonNullReader -> BinaryData.fromObject(nonNullReader.readUntyped())));
                }
            }
            deserializedSdkTelemetryUploadEvent.setAdditionalProperties(additionalProperties);

            return deserializedSdkTelemetryUploadEvent;
        });
    }
}
