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
 * The GameSdkTelemetryEvent model.
 */
@Metadata(properties = { MetadataProperties.FLUENT })
public final class GameSdkTelemetryEvent extends TelemetryEvent {
    /*
     * The msgId property.
     */
    @Metadata(properties = { MetadataProperties.GENERATED })
    private String msgId;

    /*
     * The uploadContent property.
     */
    @Metadata(properties = { MetadataProperties.GENERATED })
    private GameSdkTelemetryUploadContent uploadContent;

    /**
     * Creates an instance of GameSdkTelemetryEvent class.
     */
    @Metadata(properties = { MetadataProperties.GENERATED })
    public GameSdkTelemetryEvent() {
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
     * @return the GameSdkTelemetryEvent object itself.
     */
    @Metadata(properties = { MetadataProperties.GENERATED })
    public GameSdkTelemetryEvent setMsgId(String msgId) {
        this.msgId = msgId;
        return this;
    }

    /**
     * Get the uploadContent property: The uploadContent property.
     * 
     * @return the uploadContent value.
     */
    @Metadata(properties = { MetadataProperties.GENERATED })
    public GameSdkTelemetryUploadContent getUploadContent() {
        return this.uploadContent;
    }

    /**
     * Set the uploadContent property: The uploadContent property.
     * 
     * @param uploadContent the uploadContent value to set.
     * @return the GameSdkTelemetryEvent object itself.
     */
    @Metadata(properties = { MetadataProperties.GENERATED })
    public GameSdkTelemetryEvent setUploadContent(GameSdkTelemetryUploadContent uploadContent) {
        this.uploadContent = uploadContent;
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Metadata(properties = { MetadataProperties.GENERATED })
    @Override
    public GameSdkTelemetryEvent setApplicationId(Integer applicationId) {
        super.setApplicationId(applicationId);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Metadata(properties = { MetadataProperties.GENERATED })
    @Override
    public GameSdkTelemetryEvent setApplicationName(String applicationName) {
        super.setApplicationName(applicationName);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Metadata(properties = { MetadataProperties.GENERATED })
    @Override
    public GameSdkTelemetryEvent setEventId(Integer eventId) {
        super.setEventId(eventId);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Metadata(properties = { MetadataProperties.GENERATED })
    @Override
    public GameSdkTelemetryEvent setEventName(String eventName) {
        super.setEventName(eventName);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Metadata(properties = { MetadataProperties.GENERATED })
    @Override
    public GameSdkTelemetryEvent setEventTime(String eventTime) {
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
     * Reads an instance of GameSdkTelemetryEvent from the JsonReader.
     * 
     * @param jsonReader The JsonReader being read.
     * @return An instance of GameSdkTelemetryEvent if the JsonReader was pointing to an instance of it, or null if it
     * was pointing to JSON null.
     * @throws IOException If an error occurs while reading the GameSdkTelemetryEvent.
     */
    @Metadata(properties = { MetadataProperties.GENERATED })
    public static GameSdkTelemetryEvent fromJson(JsonReader jsonReader) throws IOException {
        return jsonReader.readObject(reader -> {
            GameSdkTelemetryEvent deserializedGameSdkTelemetryEvent = new GameSdkTelemetryEvent();
            Map<String, BinaryData> additionalProperties = null;
            while (reader.nextToken() != JsonToken.END_OBJECT) {
                String fieldName = reader.getFieldName();
                reader.nextToken();

                if ("applicationId".equals(fieldName)) {
                    deserializedGameSdkTelemetryEvent.setApplicationId(reader.getNullable(JsonReader::getInt));
                } else if ("applicationName".equals(fieldName)) {
                    deserializedGameSdkTelemetryEvent.setApplicationName(reader.getString());
                } else if ("eventId".equals(fieldName)) {
                    deserializedGameSdkTelemetryEvent.setEventId(reader.getNullable(JsonReader::getInt));
                } else if ("eventName".equals(fieldName)) {
                    deserializedGameSdkTelemetryEvent.setEventName(reader.getString());
                } else if ("eventTime".equals(fieldName)) {
                    deserializedGameSdkTelemetryEvent.setEventTime(reader.getString());
                } else if ("msgId".equals(fieldName)) {
                    deserializedGameSdkTelemetryEvent.msgId = reader.getString();
                } else if ("uploadContent".equals(fieldName)) {
                    deserializedGameSdkTelemetryEvent.uploadContent = GameSdkTelemetryUploadContent.fromJson(reader);
                } else {
                    if (additionalProperties == null) {
                        additionalProperties = new LinkedHashMap<>();
                    }

                    additionalProperties.put(fieldName,
                        reader.getNullable(nonNullReader -> BinaryData.fromObject(nonNullReader.readUntyped())));
                }
            }
            deserializedGameSdkTelemetryEvent.setAdditionalProperties(additionalProperties);

            return deserializedGameSdkTelemetryEvent;
        });
    }
}
