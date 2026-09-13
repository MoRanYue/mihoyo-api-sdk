package uigf.mihoyo.game.response;

import io.clientcore.core.annotations.Metadata;
import io.clientcore.core.annotations.MetadataProperties;
import io.clientcore.core.models.binarydata.BinaryData;
import io.clientcore.core.serialization.json.JsonReader;
import io.clientcore.core.serialization.json.JsonSerializable;
import io.clientcore.core.serialization.json.JsonToken;
import io.clientcore.core.serialization.json.JsonWriter;
import java.io.IOException;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

/**
 * The GcgChallengeScheduleData model.
 */
@Metadata(properties = { MetadataProperties.IMMUTABLE })
public final class GcgChallengeScheduleData implements JsonSerializable<GcgChallengeScheduleData> {
    /*
     * The schedule_list property.
     */
    @Metadata(properties = { MetadataProperties.GENERATED })
    private List<Map<String, BinaryData>> scheduleList;

    /*
     * Additional properties
     */
    @Metadata(properties = { MetadataProperties.GENERATED })
    private Map<String, BinaryData> additionalProperties;

    /**
     * Creates an instance of GcgChallengeScheduleData class.
     */
    @Metadata(properties = { MetadataProperties.GENERATED })
    private GcgChallengeScheduleData() {
    }

    /**
     * Get the scheduleList property: The schedule_list property.
     * 
     * @return the scheduleList value.
     */
    @Metadata(properties = { MetadataProperties.GENERATED })
    public List<Map<String, BinaryData>> getScheduleList() {
        return this.scheduleList;
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
        jsonWriter.writeArrayField("schedule_list", this.scheduleList,
            (writer, element) -> writer.writeMap(element, (writer1, element1) -> {
                if (element1 == null) {
                    writer1.writeNull();
                } else {
                    element1.writeTo(writer1);
                }
            }));
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
     * Reads an instance of GcgChallengeScheduleData from the JsonReader.
     * 
     * @param jsonReader The JsonReader being read.
     * @return An instance of GcgChallengeScheduleData if the JsonReader was pointing to an instance of it, or null if
     * it was pointing to JSON null.
     * @throws IOException If an error occurs while reading the GcgChallengeScheduleData.
     */
    @Metadata(properties = { MetadataProperties.GENERATED })
    public static GcgChallengeScheduleData fromJson(JsonReader jsonReader) throws IOException {
        return jsonReader.readObject(reader -> {
            GcgChallengeScheduleData deserializedGcgChallengeScheduleData = new GcgChallengeScheduleData();
            Map<String, BinaryData> additionalProperties = null;
            while (reader.nextToken() != JsonToken.END_OBJECT) {
                String fieldName = reader.getFieldName();
                reader.nextToken();

                if ("schedule_list".equals(fieldName)) {
                    List<Map<String, BinaryData>> scheduleList
                        = reader.readArray(reader1 -> reader1.readMap(reader2 -> reader2
                            .getNullable(nonNullReader -> BinaryData.fromObject(nonNullReader.readUntyped()))));
                    deserializedGcgChallengeScheduleData.scheduleList = scheduleList;
                } else {
                    if (additionalProperties == null) {
                        additionalProperties = new LinkedHashMap<>();
                    }

                    additionalProperties.put(fieldName,
                        reader.getNullable(nonNullReader -> BinaryData.fromObject(nonNullReader.readUntyped())));
                }
            }
            deserializedGcgChallengeScheduleData.additionalProperties = additionalProperties;

            return deserializedGcgChallengeScheduleData;
        });
    }
}
