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
 * The GameCustomTelemetryEvent model.
 */
@Metadata(properties = { MetadataProperties.FLUENT })
public final class GameCustomTelemetryEvent extends TelemetryEvent {
    /*
     * The msgID property.
     */
    @Metadata(properties = { MetadataProperties.GENERATED })
    private String msgID;

    /*
     * The uploadContent property.
     */
    @Metadata(properties = { MetadataProperties.GENERATED })
    private GameCustomTelemetryUploadContent uploadContent;

    /**
     * Creates an instance of GameCustomTelemetryEvent class.
     */
    @Metadata(properties = { MetadataProperties.GENERATED })
    public GameCustomTelemetryEvent() {
    }

    /**
     * Get the msgID property: The msgID property.
     * 
     * @return the msgID value.
     */
    @Metadata(properties = { MetadataProperties.GENERATED })
    public String getMsgID() {
        return this.msgID;
    }

    /**
     * Set the msgID property: The msgID property.
     * 
     * @param msgID the msgID value to set.
     * @return the GameCustomTelemetryEvent object itself.
     */
    @Metadata(properties = { MetadataProperties.GENERATED })
    public GameCustomTelemetryEvent setMsgID(String msgID) {
        this.msgID = msgID;
        return this;
    }

    /**
     * Get the uploadContent property: The uploadContent property.
     * 
     * @return the uploadContent value.
     */
    @Metadata(properties = { MetadataProperties.GENERATED })
    public GameCustomTelemetryUploadContent getUploadContent() {
        return this.uploadContent;
    }

    /**
     * Set the uploadContent property: The uploadContent property.
     * 
     * @param uploadContent the uploadContent value to set.
     * @return the GameCustomTelemetryEvent object itself.
     */
    @Metadata(properties = { MetadataProperties.GENERATED })
    public GameCustomTelemetryEvent setUploadContent(GameCustomTelemetryUploadContent uploadContent) {
        this.uploadContent = uploadContent;
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Metadata(properties = { MetadataProperties.GENERATED })
    @Override
    public GameCustomTelemetryEvent setApplicationId(Integer applicationId) {
        super.setApplicationId(applicationId);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Metadata(properties = { MetadataProperties.GENERATED })
    @Override
    public GameCustomTelemetryEvent setApplicationName(String applicationName) {
        super.setApplicationName(applicationName);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Metadata(properties = { MetadataProperties.GENERATED })
    @Override
    public GameCustomTelemetryEvent setEventId(Integer eventId) {
        super.setEventId(eventId);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Metadata(properties = { MetadataProperties.GENERATED })
    @Override
    public GameCustomTelemetryEvent setEventName(String eventName) {
        super.setEventName(eventName);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Metadata(properties = { MetadataProperties.GENERATED })
    @Override
    public GameCustomTelemetryEvent setEventTime(String eventTime) {
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
        jsonWriter.writeStringField("msgID", this.msgID);
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
     * Reads an instance of GameCustomTelemetryEvent from the JsonReader.
     * 
     * @param jsonReader The JsonReader being read.
     * @return An instance of GameCustomTelemetryEvent if the JsonReader was pointing to an instance of it, or null if
     * it was pointing to JSON null.
     * @throws IOException If an error occurs while reading the GameCustomTelemetryEvent.
     */
    @Metadata(properties = { MetadataProperties.GENERATED })
    public static GameCustomTelemetryEvent fromJson(JsonReader jsonReader) throws IOException {
        return jsonReader.readObject(reader -> {
            GameCustomTelemetryEvent deserializedGameCustomTelemetryEvent = new GameCustomTelemetryEvent();
            Map<String, BinaryData> additionalProperties = null;
            while (reader.nextToken() != JsonToken.END_OBJECT) {
                String fieldName = reader.getFieldName();
                reader.nextToken();

                if ("applicationId".equals(fieldName)) {
                    deserializedGameCustomTelemetryEvent.setApplicationId(reader.getNullable(JsonReader::getInt));
                } else if ("applicationName".equals(fieldName)) {
                    deserializedGameCustomTelemetryEvent.setApplicationName(reader.getString());
                } else if ("eventId".equals(fieldName)) {
                    deserializedGameCustomTelemetryEvent.setEventId(reader.getNullable(JsonReader::getInt));
                } else if ("eventName".equals(fieldName)) {
                    deserializedGameCustomTelemetryEvent.setEventName(reader.getString());
                } else if ("eventTime".equals(fieldName)) {
                    deserializedGameCustomTelemetryEvent.setEventTime(reader.getString());
                } else if ("msgID".equals(fieldName)) {
                    deserializedGameCustomTelemetryEvent.msgID = reader.getString();
                } else if ("uploadContent".equals(fieldName)) {
                    deserializedGameCustomTelemetryEvent.uploadContent
                        = GameCustomTelemetryUploadContent.fromJson(reader);
                } else {
                    if (additionalProperties == null) {
                        additionalProperties = new LinkedHashMap<>();
                    }

                    additionalProperties.put(fieldName,
                        reader.getNullable(nonNullReader -> BinaryData.fromObject(nonNullReader.readUntyped())));
                }
            }
            deserializedGameCustomTelemetryEvent.setAdditionalProperties(additionalProperties);

            return deserializedGameCustomTelemetryEvent;
        });
    }
}
