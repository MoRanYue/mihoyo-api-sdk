package uigf.mihoyo.api.response;

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
 * The ZenlessFeedbackScheduleData model.
 */
@Metadata(properties = { MetadataProperties.IMMUTABLE })
public final class ZenlessFeedbackScheduleData implements JsonSerializable<ZenlessFeedbackScheduleData> {
    /*
     * The is_need_collect property.
     */
    @Metadata(properties = { MetadataProperties.GENERATED })
    private Boolean isNeedCollect;

    /*
     * The schedule_id property.
     */
    @Metadata(properties = { MetadataProperties.GENERATED })
    private String scheduleId;

    /*
     * Additional properties
     */
    @Metadata(properties = { MetadataProperties.GENERATED })
    private Map<String, BinaryData> additionalProperties;

    /**
     * Creates an instance of ZenlessFeedbackScheduleData class.
     */
    @Metadata(properties = { MetadataProperties.GENERATED })
    private ZenlessFeedbackScheduleData() {
    }

    /**
     * Get the isNeedCollect property: The is_need_collect property.
     * 
     * @return the isNeedCollect value.
     */
    @Metadata(properties = { MetadataProperties.GENERATED })
    public Boolean isNeedCollect() {
        return this.isNeedCollect;
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
     * Get the additionalProperties property: Additional properties.
     * 
     * @return the additionalProperties value.
     */
    @Metadata(properties = { MetadataProperties.GENERATED })
    public Map<String, BinaryData> getAdditionalProperties() {
        return this.additionalProperties;
    }

    /**
     * {@inheritDoc}
     */
    @Metadata(properties = { MetadataProperties.GENERATED })
    @Override
    public JsonWriter toJson(JsonWriter jsonWriter) throws IOException {
        jsonWriter.writeStartObject();
        jsonWriter.writeBooleanField("is_need_collect", this.isNeedCollect);
        jsonWriter.writeStringField("schedule_id", this.scheduleId);
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
     * Reads an instance of ZenlessFeedbackScheduleData from the JsonReader.
     * 
     * @param jsonReader The JsonReader being read.
     * @return An instance of ZenlessFeedbackScheduleData if the JsonReader was pointing to an instance of it, or null
     * if it was pointing to JSON null.
     * @throws IOException If an error occurs while reading the ZenlessFeedbackScheduleData.
     */
    @Metadata(properties = { MetadataProperties.GENERATED })
    public static ZenlessFeedbackScheduleData fromJson(JsonReader jsonReader) throws IOException {
        return jsonReader.readObject(reader -> {
            ZenlessFeedbackScheduleData deserializedZenlessFeedbackScheduleData = new ZenlessFeedbackScheduleData();
            Map<String, BinaryData> additionalProperties = null;
            while (reader.nextToken() != JsonToken.END_OBJECT) {
                String fieldName = reader.getFieldName();
                reader.nextToken();

                if ("is_need_collect".equals(fieldName)) {
                    deserializedZenlessFeedbackScheduleData.isNeedCollect = reader.getNullable(JsonReader::getBoolean);
                } else if ("schedule_id".equals(fieldName)) {
                    deserializedZenlessFeedbackScheduleData.scheduleId = reader.getString();
                } else {
                    if (additionalProperties == null) {
                        additionalProperties = new LinkedHashMap<>();
                    }

                    additionalProperties.put(fieldName,
                        reader.getNullable(nonNullReader -> BinaryData.fromObject(nonNullReader.readUntyped())));
                }
            }
            deserializedZenlessFeedbackScheduleData.additionalProperties = additionalProperties;

            return deserializedZenlessFeedbackScheduleData;
        });
    }
}
