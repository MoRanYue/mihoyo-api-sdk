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
import java.util.List;
import java.util.Map;

/**
 * The MobileMissionsStateData model.
 */
@Metadata(properties = { MetadataProperties.IMMUTABLE })
public final class MobileMissionsStateData implements JsonSerializable<MobileMissionsStateData> {
    /*
     * The already_received_points property.
     */
    @Metadata(properties = { MetadataProperties.GENERATED })
    private Integer alreadyReceivedPoints;

    /*
     * The can_get_points property.
     */
    @Metadata(properties = { MetadataProperties.GENERATED })
    private Integer canGetPoints;

    /*
     * The is_unclaimed property.
     */
    @Metadata(properties = { MetadataProperties.GENERATED })
    private Boolean isUnclaimed;

    /*
     * The states property.
     */
    @Metadata(properties = { MetadataProperties.GENERATED })
    private List<Map<String, BinaryData>> states;

    /*
     * The today_total_points property.
     */
    @Metadata(properties = { MetadataProperties.GENERATED })
    private Integer todayTotalPoints;

    /*
     * The total_points property.
     */
    @Metadata(properties = { MetadataProperties.GENERATED })
    private Integer totalPoints;

    /*
     * Additional properties
     */
    @Metadata(properties = { MetadataProperties.GENERATED })
    private Map<String, BinaryData> additionalProperties;

    /**
     * Creates an instance of MobileMissionsStateData class.
     */
    @Metadata(properties = { MetadataProperties.GENERATED })
    private MobileMissionsStateData() {
    }

    /**
     * Get the alreadyReceivedPoints property: The already_received_points property.
     * 
     * @return the alreadyReceivedPoints value.
     */
    @Metadata(properties = { MetadataProperties.GENERATED })
    public Integer getAlreadyReceivedPoints() {
        return this.alreadyReceivedPoints;
    }

    /**
     * Get the canGetPoints property: The can_get_points property.
     * 
     * @return the canGetPoints value.
     */
    @Metadata(properties = { MetadataProperties.GENERATED })
    public Integer getCanGetPoints() {
        return this.canGetPoints;
    }

    /**
     * Get the isUnclaimed property: The is_unclaimed property.
     * 
     * @return the isUnclaimed value.
     */
    @Metadata(properties = { MetadataProperties.GENERATED })
    public Boolean isUnclaimed() {
        return this.isUnclaimed;
    }

    /**
     * Get the states property: The states property.
     * 
     * @return the states value.
     */
    @Metadata(properties = { MetadataProperties.GENERATED })
    public List<Map<String, BinaryData>> getStates() {
        return this.states;
    }

    /**
     * Get the todayTotalPoints property: The today_total_points property.
     * 
     * @return the todayTotalPoints value.
     */
    @Metadata(properties = { MetadataProperties.GENERATED })
    public Integer getTodayTotalPoints() {
        return this.todayTotalPoints;
    }

    /**
     * Get the totalPoints property: The total_points property.
     * 
     * @return the totalPoints value.
     */
    @Metadata(properties = { MetadataProperties.GENERATED })
    public Integer getTotalPoints() {
        return this.totalPoints;
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
        jsonWriter.writeNumberField("already_received_points", this.alreadyReceivedPoints);
        jsonWriter.writeNumberField("can_get_points", this.canGetPoints);
        jsonWriter.writeBooleanField("is_unclaimed", this.isUnclaimed);
        jsonWriter.writeArrayField("states", this.states,
            (writer, element) -> writer.writeMap(element, (writer1, element1) -> {
                if (element1 == null) {
                    writer1.writeNull();
                } else {
                    element1.writeTo(writer1);
                }
            }));
        jsonWriter.writeNumberField("today_total_points", this.todayTotalPoints);
        jsonWriter.writeNumberField("total_points", this.totalPoints);
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
     * Reads an instance of MobileMissionsStateData from the JsonReader.
     * 
     * @param jsonReader The JsonReader being read.
     * @return An instance of MobileMissionsStateData if the JsonReader was pointing to an instance of it, or null if it
     * was pointing to JSON null.
     * @throws IOException If an error occurs while reading the MobileMissionsStateData.
     */
    @Metadata(properties = { MetadataProperties.GENERATED })
    public static MobileMissionsStateData fromJson(JsonReader jsonReader) throws IOException {
        return jsonReader.readObject(reader -> {
            MobileMissionsStateData deserializedMobileMissionsStateData = new MobileMissionsStateData();
            Map<String, BinaryData> additionalProperties = null;
            while (reader.nextToken() != JsonToken.END_OBJECT) {
                String fieldName = reader.getFieldName();
                reader.nextToken();

                if ("already_received_points".equals(fieldName)) {
                    deserializedMobileMissionsStateData.alreadyReceivedPoints = reader.getNullable(JsonReader::getInt);
                } else if ("can_get_points".equals(fieldName)) {
                    deserializedMobileMissionsStateData.canGetPoints = reader.getNullable(JsonReader::getInt);
                } else if ("is_unclaimed".equals(fieldName)) {
                    deserializedMobileMissionsStateData.isUnclaimed = reader.getNullable(JsonReader::getBoolean);
                } else if ("states".equals(fieldName)) {
                    List<Map<String, BinaryData>> states
                        = reader.readArray(reader1 -> reader1.readMap(reader2 -> reader2
                            .getNullable(nonNullReader -> BinaryData.fromObject(nonNullReader.readUntyped()))));
                    deserializedMobileMissionsStateData.states = states;
                } else if ("today_total_points".equals(fieldName)) {
                    deserializedMobileMissionsStateData.todayTotalPoints = reader.getNullable(JsonReader::getInt);
                } else if ("total_points".equals(fieldName)) {
                    deserializedMobileMissionsStateData.totalPoints = reader.getNullable(JsonReader::getInt);
                } else {
                    if (additionalProperties == null) {
                        additionalProperties = new LinkedHashMap<>();
                    }

                    additionalProperties.put(fieldName,
                        reader.getNullable(nonNullReader -> BinaryData.fromObject(nonNullReader.readUntyped())));
                }
            }
            deserializedMobileMissionsStateData.additionalProperties = additionalProperties;

            return deserializedMobileMissionsStateData;
        });
    }
}
