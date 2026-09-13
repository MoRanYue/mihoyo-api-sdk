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
 * The GameCrashTelemetryEvent model.
 */
@Metadata(properties = { MetadataProperties.FLUENT })
public final class GameCrashTelemetryEvent extends TelemetryEvent {
    /*
     * The msgID property.
     */
    @Metadata(properties = { MetadataProperties.GENERATED })
    private String msgID;

    /*
     * The uploadContent property.
     */
    @Metadata(properties = { MetadataProperties.GENERATED })
    private GameCrashTelemetryUploadContent uploadContent;

    /**
     * Creates an instance of GameCrashTelemetryEvent class.
     */
    @Metadata(properties = { MetadataProperties.GENERATED })
    public GameCrashTelemetryEvent() {
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
     * @return the GameCrashTelemetryEvent object itself.
     */
    @Metadata(properties = { MetadataProperties.GENERATED })
    public GameCrashTelemetryEvent setMsgID(String msgID) {
        this.msgID = msgID;
        return this;
    }

    /**
     * Get the uploadContent property: The uploadContent property.
     * 
     * @return the uploadContent value.
     */
    @Metadata(properties = { MetadataProperties.GENERATED })
    public GameCrashTelemetryUploadContent getUploadContent() {
        return this.uploadContent;
    }

    /**
     * Set the uploadContent property: The uploadContent property.
     * 
     * @param uploadContent the uploadContent value to set.
     * @return the GameCrashTelemetryEvent object itself.
     */
    @Metadata(properties = { MetadataProperties.GENERATED })
    public GameCrashTelemetryEvent setUploadContent(GameCrashTelemetryUploadContent uploadContent) {
        this.uploadContent = uploadContent;
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Metadata(properties = { MetadataProperties.GENERATED })
    @Override
    public GameCrashTelemetryEvent setApplicationId(Integer applicationId) {
        super.setApplicationId(applicationId);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Metadata(properties = { MetadataProperties.GENERATED })
    @Override
    public GameCrashTelemetryEvent setApplicationName(String applicationName) {
        super.setApplicationName(applicationName);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Metadata(properties = { MetadataProperties.GENERATED })
    @Override
    public GameCrashTelemetryEvent setEventId(Integer eventId) {
        super.setEventId(eventId);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Metadata(properties = { MetadataProperties.GENERATED })
    @Override
    public GameCrashTelemetryEvent setEventName(String eventName) {
        super.setEventName(eventName);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Metadata(properties = { MetadataProperties.GENERATED })
    @Override
    public GameCrashTelemetryEvent setEventTime(String eventTime) {
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
     * Reads an instance of GameCrashTelemetryEvent from the JsonReader.
     * 
     * @param jsonReader The JsonReader being read.
     * @return An instance of GameCrashTelemetryEvent if the JsonReader was pointing to an instance of it, or null if it
     * was pointing to JSON null.
     * @throws IOException If an error occurs while reading the GameCrashTelemetryEvent.
     */
    @Metadata(properties = { MetadataProperties.GENERATED })
    public static GameCrashTelemetryEvent fromJson(JsonReader jsonReader) throws IOException {
        return jsonReader.readObject(reader -> {
            GameCrashTelemetryEvent deserializedGameCrashTelemetryEvent = new GameCrashTelemetryEvent();
            Map<String, BinaryData> additionalProperties = null;
            while (reader.nextToken() != JsonToken.END_OBJECT) {
                String fieldName = reader.getFieldName();
                reader.nextToken();

                if ("applicationId".equals(fieldName)) {
                    deserializedGameCrashTelemetryEvent.setApplicationId(reader.getNullable(JsonReader::getInt));
                } else if ("applicationName".equals(fieldName)) {
                    deserializedGameCrashTelemetryEvent.setApplicationName(reader.getString());
                } else if ("eventId".equals(fieldName)) {
                    deserializedGameCrashTelemetryEvent.setEventId(reader.getNullable(JsonReader::getInt));
                } else if ("eventName".equals(fieldName)) {
                    deserializedGameCrashTelemetryEvent.setEventName(reader.getString());
                } else if ("eventTime".equals(fieldName)) {
                    deserializedGameCrashTelemetryEvent.setEventTime(reader.getString());
                } else if ("msgID".equals(fieldName)) {
                    deserializedGameCrashTelemetryEvent.msgID = reader.getString();
                } else if ("uploadContent".equals(fieldName)) {
                    deserializedGameCrashTelemetryEvent.uploadContent
                        = GameCrashTelemetryUploadContent.fromJson(reader);
                } else {
                    if (additionalProperties == null) {
                        additionalProperties = new LinkedHashMap<>();
                    }

                    additionalProperties.put(fieldName,
                        reader.getNullable(nonNullReader -> BinaryData.fromObject(nonNullReader.readUntyped())));
                }
            }
            deserializedGameCrashTelemetryEvent.setAdditionalProperties(additionalProperties);

            return deserializedGameCrashTelemetryEvent;
        });
    }
}
