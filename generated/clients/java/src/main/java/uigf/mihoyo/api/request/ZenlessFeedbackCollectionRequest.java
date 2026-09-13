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
 * The ZenlessFeedbackCollectionRequest model.
 */
@Metadata(properties = { MetadataProperties.FLUENT })
public final class ZenlessFeedbackCollectionRequest implements JsonSerializable<ZenlessFeedbackCollectionRequest> {
    /*
     * The region property.
     */
    @Metadata(properties = { MetadataProperties.GENERATED })
    private final String region;

    /*
     * The schedule_id property.
     */
    @Metadata(properties = { MetadataProperties.GENERATED })
    private final String scheduleId;

    /*
     * The score property.
     */
    @Metadata(properties = { MetadataProperties.GENERATED })
    private final int score;

    /*
     * The source property.
     */
    @Metadata(properties = { MetadataProperties.GENERATED })
    private final int source;

    /*
     * The tool_type property.
     */
    @Metadata(properties = { MetadataProperties.GENERATED })
    private final int toolType;

    /*
     * The uid property.
     */
    @Metadata(properties = { MetadataProperties.GENERATED })
    private final String uid;

    /*
     * Additional properties
     */
    @Metadata(properties = { MetadataProperties.GENERATED })
    private Map<String, BinaryData> additionalProperties;

    /**
     * Creates an instance of ZenlessFeedbackCollectionRequest class.
     * 
     * @param region the region value to set.
     * @param scheduleId the scheduleId value to set.
     * @param score the score value to set.
     * @param source the source value to set.
     * @param toolType the toolType value to set.
     * @param uid the uid value to set.
     */
    @Metadata(properties = { MetadataProperties.GENERATED })
    public ZenlessFeedbackCollectionRequest(String region, String scheduleId, int score, int source, int toolType,
        String uid) {
        this.region = region;
        this.scheduleId = scheduleId;
        this.score = score;
        this.source = source;
        this.toolType = toolType;
        this.uid = uid;
    }

    /**
     * Get the region property: The region property.
     * 
     * @return the region value.
     */
    @Metadata(properties = { MetadataProperties.GENERATED })
    public String getRegion() {
        return this.region;
    }

    /**
     * Get the scheduleId property: The schedule_id property.
     * 
     * @return the scheduleId value.
     */
    @Metadata(properties = { MetadataProperties.GENERATED })
    public String getScheduleId() {
        return this.scheduleId;
    }

    /**
     * Get the score property: The score property.
     * 
     * @return the score value.
     */
    @Metadata(properties = { MetadataProperties.GENERATED })
    public int getScore() {
        return this.score;
    }

    /**
     * Get the source property: The source property.
     * 
     * @return the source value.
     */
    @Metadata(properties = { MetadataProperties.GENERATED })
    public int getSource() {
        return this.source;
    }

    /**
     * Get the toolType property: The tool_type property.
     * 
     * @return the toolType value.
     */
    @Metadata(properties = { MetadataProperties.GENERATED })
    public int getToolType() {
        return this.toolType;
    }

    /**
     * Get the uid property: The uid property.
     * 
     * @return the uid value.
     */
    @Metadata(properties = { MetadataProperties.GENERATED })
    public String getUid() {
        return this.uid;
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
     * @return the ZenlessFeedbackCollectionRequest object itself.
     */
    @Metadata(properties = { MetadataProperties.GENERATED })
    public ZenlessFeedbackCollectionRequest setAdditionalProperties(Map<String, BinaryData> additionalProperties) {
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
        jsonWriter.writeStringField("region", this.region);
        jsonWriter.writeStringField("schedule_id", this.scheduleId);
        jsonWriter.writeIntField("score", this.score);
        jsonWriter.writeIntField("source", this.source);
        jsonWriter.writeIntField("tool_type", this.toolType);
        jsonWriter.writeStringField("uid", this.uid);
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
     * Reads an instance of ZenlessFeedbackCollectionRequest from the JsonReader.
     * 
     * @param jsonReader The JsonReader being read.
     * @return An instance of ZenlessFeedbackCollectionRequest if the JsonReader was pointing to an instance of it, or
     * null if it was pointing to JSON null.
     * @throws IllegalStateException If the deserialized JSON object was missing any required properties.
     * @throws IOException If an error occurs while reading the ZenlessFeedbackCollectionRequest.
     */
    @Metadata(properties = { MetadataProperties.GENERATED })
    public static ZenlessFeedbackCollectionRequest fromJson(JsonReader jsonReader) throws IOException {
        return jsonReader.readObject(reader -> {
            String region = null;
            String scheduleId = null;
            int score = 0;
            int source = 0;
            int toolType = 0;
            String uid = null;
            Map<String, BinaryData> additionalProperties = null;
            while (reader.nextToken() != JsonToken.END_OBJECT) {
                String fieldName = reader.getFieldName();
                reader.nextToken();

                if ("region".equals(fieldName)) {
                    region = reader.getString();
                } else if ("schedule_id".equals(fieldName)) {
                    scheduleId = reader.getString();
                } else if ("score".equals(fieldName)) {
                    score = reader.getInt();
                } else if ("source".equals(fieldName)) {
                    source = reader.getInt();
                } else if ("tool_type".equals(fieldName)) {
                    toolType = reader.getInt();
                } else if ("uid".equals(fieldName)) {
                    uid = reader.getString();
                } else {
                    if (additionalProperties == null) {
                        additionalProperties = new LinkedHashMap<>();
                    }

                    additionalProperties.put(fieldName,
                        reader.getNullable(nonNullReader -> BinaryData.fromObject(nonNullReader.readUntyped())));
                }
            }
            ZenlessFeedbackCollectionRequest deserializedZenlessFeedbackCollectionRequest
                = new ZenlessFeedbackCollectionRequest(region, scheduleId, score, source, toolType, uid);
            deserializedZenlessFeedbackCollectionRequest.additionalProperties = additionalProperties;

            return deserializedZenlessFeedbackCollectionRequest;
        });
    }
}
