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
 * The TelemetryEvent model.
 */
@Metadata(properties = { MetadataProperties.FLUENT })
public class TelemetryEvent implements JsonSerializable<TelemetryEvent> {
    /*
     * The applicationId property.
     */
    @Metadata(properties = { MetadataProperties.GENERATED })
    private Integer applicationId;

    /*
     * The applicationName property.
     */
    @Metadata(properties = { MetadataProperties.GENERATED })
    private String applicationName;

    /*
     * The eventId property.
     */
    @Metadata(properties = { MetadataProperties.GENERATED })
    private Integer eventId;

    /*
     * The eventName property.
     */
    @Metadata(properties = { MetadataProperties.GENERATED })
    private String eventName;

    /*
     * The eventTime property.
     */
    @Metadata(properties = { MetadataProperties.GENERATED })
    private String eventTime;

    /*
     * Additional properties
     */
    @Metadata(properties = { MetadataProperties.GENERATED })
    private Map<String, BinaryData> additionalProperties;

    /**
     * Creates an instance of TelemetryEvent class.
     */
    @Metadata(properties = { MetadataProperties.GENERATED })
    public TelemetryEvent() {
    }

    /**
     * Get the applicationId property: The applicationId property.
     * 
     * @return the applicationId value.
     */
    @Metadata(properties = { MetadataProperties.GENERATED })
    public Integer getApplicationId() {
        return this.applicationId;
    }

    /**
     * Set the applicationId property: The applicationId property.
     * 
     * @param applicationId the applicationId value to set.
     * @return the TelemetryEvent object itself.
     */
    @Metadata(properties = { MetadataProperties.GENERATED })
    public TelemetryEvent setApplicationId(Integer applicationId) {
        this.applicationId = applicationId;
        return this;
    }

    /**
     * Get the applicationName property: The applicationName property.
     * 
     * @return the applicationName value.
     */
    @Metadata(properties = { MetadataProperties.GENERATED })
    public String getApplicationName() {
        return this.applicationName;
    }

    /**
     * Set the applicationName property: The applicationName property.
     * 
     * @param applicationName the applicationName value to set.
     * @return the TelemetryEvent object itself.
     */
    @Metadata(properties = { MetadataProperties.GENERATED })
    public TelemetryEvent setApplicationName(String applicationName) {
        this.applicationName = applicationName;
        return this;
    }

    /**
     * Get the eventId property: The eventId property.
     * 
     * @return the eventId value.
     */
    @Metadata(properties = { MetadataProperties.GENERATED })
    public Integer getEventId() {
        return this.eventId;
    }

    /**
     * Set the eventId property: The eventId property.
     * 
     * @param eventId the eventId value to set.
     * @return the TelemetryEvent object itself.
     */
    @Metadata(properties = { MetadataProperties.GENERATED })
    public TelemetryEvent setEventId(Integer eventId) {
        this.eventId = eventId;
        return this;
    }

    /**
     * Get the eventName property: The eventName property.
     * 
     * @return the eventName value.
     */
    @Metadata(properties = { MetadataProperties.GENERATED })
    public String getEventName() {
        return this.eventName;
    }

    /**
     * Set the eventName property: The eventName property.
     * 
     * @param eventName the eventName value to set.
     * @return the TelemetryEvent object itself.
     */
    @Metadata(properties = { MetadataProperties.GENERATED })
    public TelemetryEvent setEventName(String eventName) {
        this.eventName = eventName;
        return this;
    }

    /**
     * Get the eventTime property: The eventTime property.
     * 
     * @return the eventTime value.
     */
    @Metadata(properties = { MetadataProperties.GENERATED })
    public String getEventTime() {
        return this.eventTime;
    }

    /**
     * Set the eventTime property: The eventTime property.
     * 
     * @param eventTime the eventTime value to set.
     * @return the TelemetryEvent object itself.
     */
    @Metadata(properties = { MetadataProperties.GENERATED })
    public TelemetryEvent setEventTime(String eventTime) {
        this.eventTime = eventTime;
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
     * @return the TelemetryEvent object itself.
     */
    @Metadata(properties = { MetadataProperties.GENERATED })
    public TelemetryEvent setAdditionalProperties(Map<String, BinaryData> additionalProperties) {
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
        jsonWriter.writeNumberField("applicationId", this.applicationId);
        jsonWriter.writeStringField("applicationName", this.applicationName);
        jsonWriter.writeNumberField("eventId", this.eventId);
        jsonWriter.writeStringField("eventName", this.eventName);
        jsonWriter.writeStringField("eventTime", this.eventTime);
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
     * Reads an instance of TelemetryEvent from the JsonReader.
     * 
     * @param jsonReader The JsonReader being read.
     * @return An instance of TelemetryEvent if the JsonReader was pointing to an instance of it, or null if it was
     * pointing to JSON null.
     * @throws IOException If an error occurs while reading the TelemetryEvent.
     */
    @Metadata(properties = { MetadataProperties.GENERATED })
    public static TelemetryEvent fromJson(JsonReader jsonReader) throws IOException {
        return jsonReader.readObject(reader -> {
            TelemetryEvent deserializedTelemetryEvent = new TelemetryEvent();
            Map<String, BinaryData> additionalProperties = null;
            while (reader.nextToken() != JsonToken.END_OBJECT) {
                String fieldName = reader.getFieldName();
                reader.nextToken();

                if ("applicationId".equals(fieldName)) {
                    deserializedTelemetryEvent.applicationId = reader.getNullable(JsonReader::getInt);
                } else if ("applicationName".equals(fieldName)) {
                    deserializedTelemetryEvent.applicationName = reader.getString();
                } else if ("eventId".equals(fieldName)) {
                    deserializedTelemetryEvent.eventId = reader.getNullable(JsonReader::getInt);
                } else if ("eventName".equals(fieldName)) {
                    deserializedTelemetryEvent.eventName = reader.getString();
                } else if ("eventTime".equals(fieldName)) {
                    deserializedTelemetryEvent.eventTime = reader.getString();
                } else {
                    if (additionalProperties == null) {
                        additionalProperties = new LinkedHashMap<>();
                    }

                    additionalProperties.put(fieldName,
                        reader.getNullable(nonNullReader -> BinaryData.fromObject(nonNullReader.readUntyped())));
                }
            }
            deserializedTelemetryEvent.additionalProperties = additionalProperties;

            return deserializedTelemetryEvent;
        });
    }
}
