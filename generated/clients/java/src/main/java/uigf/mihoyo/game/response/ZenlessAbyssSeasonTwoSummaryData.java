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
 * The ZenlessAbyssSeasonTwoSummaryData model.
 */
@Metadata(properties = { MetadataProperties.IMMUTABLE })
public final class ZenlessAbyssSeasonTwoSummaryData implements JsonSerializable<ZenlessAbyssSeasonTwoSummaryData> {
    /*
     * The abyss_collect property.
     */
    @Metadata(properties = { MetadataProperties.GENERATED })
    private List<Map<String, BinaryData>> abyssCollect;

    /*
     * The abyss_duty property.
     */
    @Metadata(properties = { MetadataProperties.GENERATED })
    private Map<String, BinaryData> abyssDuty;

    /*
     * The abyss_level property.
     */
    @Metadata(properties = { MetadataProperties.GENERATED })
    private Map<String, BinaryData> abyssLevel;

    /*
     * The abyss_max property.
     */
    @Metadata(properties = { MetadataProperties.GENERATED })
    private Map<String, BinaryData> abyssMax;

    /*
     * The abyss_task property.
     */
    @Metadata(properties = { MetadataProperties.GENERATED })
    private Map<String, BinaryData> abyssTask;

    /*
     * The abyss_task_force_investigation_max property.
     */
    @Metadata(properties = { MetadataProperties.GENERATED })
    private Map<String, BinaryData> abyssTaskForceInvestigationMax;

    /*
     * The hide_abyss_duty property.
     */
    @Metadata(properties = { MetadataProperties.GENERATED })
    private Boolean hideAbyssDuty;

    /*
     * The refresh_time property.
     */
    @Metadata(properties = { MetadataProperties.GENERATED })
    private Long refreshTime;

    /*
     * The special_mission property.
     */
    @Metadata(properties = { MetadataProperties.GENERATED })
    private Map<String, BinaryData> specialMission;

    /*
     * The unlock property.
     */
    @Metadata(properties = { MetadataProperties.GENERATED })
    private Boolean unlock;

    /*
     * Additional properties
     */
    @Metadata(properties = { MetadataProperties.GENERATED })
    private Map<String, BinaryData> additionalProperties;

    /**
     * Creates an instance of ZenlessAbyssSeasonTwoSummaryData class.
     */
    @Metadata(properties = { MetadataProperties.GENERATED })
    private ZenlessAbyssSeasonTwoSummaryData() {
    }

    /**
     * Get the abyssCollect property: The abyss_collect property.
     * 
     * @return the abyssCollect value.
     */
    @Metadata(properties = { MetadataProperties.GENERATED })
    public List<Map<String, BinaryData>> getAbyssCollect() {
        return this.abyssCollect;
    }

    /**
     * Get the abyssDuty property: The abyss_duty property.
     * 
     * @return the abyssDuty value.
     */
    @Metadata(properties = { MetadataProperties.GENERATED })
    public Map<String, BinaryData> getAbyssDuty() {
        return this.abyssDuty;
    }

    /**
     * Get the abyssLevel property: The abyss_level property.
     * 
     * @return the abyssLevel value.
     */
    @Metadata(properties = { MetadataProperties.GENERATED })
    public Map<String, BinaryData> getAbyssLevel() {
        return this.abyssLevel;
    }

    /**
     * Get the abyssMax property: The abyss_max property.
     * 
     * @return the abyssMax value.
     */
    @Metadata(properties = { MetadataProperties.GENERATED })
    public Map<String, BinaryData> getAbyssMax() {
        return this.abyssMax;
    }

    /**
     * Get the abyssTask property: The abyss_task property.
     * 
     * @return the abyssTask value.
     */
    @Metadata(properties = { MetadataProperties.GENERATED })
    public Map<String, BinaryData> getAbyssTask() {
        return this.abyssTask;
    }

    /**
     * Get the abyssTaskForceInvestigationMax property: The abyss_task_force_investigation_max property.
     * 
     * @return the abyssTaskForceInvestigationMax value.
     */
    @Metadata(properties = { MetadataProperties.GENERATED })
    public Map<String, BinaryData> getAbyssTaskForceInvestigationMax() {
        return this.abyssTaskForceInvestigationMax;
    }

    /**
     * Get the hideAbyssDuty property: The hide_abyss_duty property.
     * 
     * @return the hideAbyssDuty value.
     */
    @Metadata(properties = { MetadataProperties.GENERATED })
    public Boolean isHideAbyssDuty() {
        return this.hideAbyssDuty;
    }

    /**
     * Get the refreshTime property: The refresh_time property.
     * 
     * @return the refreshTime value.
     */
    @Metadata(properties = { MetadataProperties.GENERATED })
    public Long getRefreshTime() {
        return this.refreshTime;
    }

    /**
     * Get the specialMission property: The special_mission property.
     * 
     * @return the specialMission value.
     */
    @Metadata(properties = { MetadataProperties.GENERATED })
    public Map<String, BinaryData> getSpecialMission() {
        return this.specialMission;
    }

    /**
     * Get the unlock property: The unlock property.
     * 
     * @return the unlock value.
     */
    @Metadata(properties = { MetadataProperties.GENERATED })
    public Boolean isUnlock() {
        return this.unlock;
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
        jsonWriter.writeArrayField("abyss_collect", this.abyssCollect,
            (writer, element) -> writer.writeMap(element, (writer1, element1) -> {
                if (element1 == null) {
                    writer1.writeNull();
                } else {
                    element1.writeTo(writer1);
                }
            }));
        jsonWriter.writeMapField("abyss_duty", this.abyssDuty, (writer, element) -> {
            if (element == null) {
                writer.writeNull();
            } else {
                element.writeTo(writer);
            }
        });
        jsonWriter.writeMapField("abyss_level", this.abyssLevel, (writer, element) -> {
            if (element == null) {
                writer.writeNull();
            } else {
                element.writeTo(writer);
            }
        });
        jsonWriter.writeMapField("abyss_max", this.abyssMax, (writer, element) -> {
            if (element == null) {
                writer.writeNull();
            } else {
                element.writeTo(writer);
            }
        });
        jsonWriter.writeMapField("abyss_task", this.abyssTask, (writer, element) -> {
            if (element == null) {
                writer.writeNull();
            } else {
                element.writeTo(writer);
            }
        });
        jsonWriter.writeMapField("abyss_task_force_investigation_max", this.abyssTaskForceInvestigationMax,
            (writer, element) -> {
                if (element == null) {
                    writer.writeNull();
                } else {
                    element.writeTo(writer);
                }
            });
        jsonWriter.writeBooleanField("hide_abyss_duty", this.hideAbyssDuty);
        jsonWriter.writeNumberField("refresh_time", this.refreshTime);
        jsonWriter.writeMapField("special_mission", this.specialMission, (writer, element) -> {
            if (element == null) {
                writer.writeNull();
            } else {
                element.writeTo(writer);
            }
        });
        jsonWriter.writeBooleanField("unlock", this.unlock);
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
     * Reads an instance of ZenlessAbyssSeasonTwoSummaryData from the JsonReader.
     * 
     * @param jsonReader The JsonReader being read.
     * @return An instance of ZenlessAbyssSeasonTwoSummaryData if the JsonReader was pointing to an instance of it, or
     * null if it was pointing to JSON null.
     * @throws IOException If an error occurs while reading the ZenlessAbyssSeasonTwoSummaryData.
     */
    @Metadata(properties = { MetadataProperties.GENERATED })
    public static ZenlessAbyssSeasonTwoSummaryData fromJson(JsonReader jsonReader) throws IOException {
        return jsonReader.readObject(reader -> {
            ZenlessAbyssSeasonTwoSummaryData deserializedZenlessAbyssSeasonTwoSummaryData
                = new ZenlessAbyssSeasonTwoSummaryData();
            Map<String, BinaryData> additionalProperties = null;
            while (reader.nextToken() != JsonToken.END_OBJECT) {
                String fieldName = reader.getFieldName();
                reader.nextToken();

                if ("abyss_collect".equals(fieldName)) {
                    List<Map<String, BinaryData>> abyssCollect
                        = reader.readArray(reader1 -> reader1.readMap(reader2 -> reader2
                            .getNullable(nonNullReader -> BinaryData.fromObject(nonNullReader.readUntyped()))));
                    deserializedZenlessAbyssSeasonTwoSummaryData.abyssCollect = abyssCollect;
                } else if ("abyss_duty".equals(fieldName)) {
                    Map<String, BinaryData> abyssDuty = reader.readMap(reader1 -> reader1
                        .getNullable(nonNullReader -> BinaryData.fromObject(nonNullReader.readUntyped())));
                    deserializedZenlessAbyssSeasonTwoSummaryData.abyssDuty = abyssDuty;
                } else if ("abyss_level".equals(fieldName)) {
                    Map<String, BinaryData> abyssLevel = reader.readMap(reader1 -> reader1
                        .getNullable(nonNullReader -> BinaryData.fromObject(nonNullReader.readUntyped())));
                    deserializedZenlessAbyssSeasonTwoSummaryData.abyssLevel = abyssLevel;
                } else if ("abyss_max".equals(fieldName)) {
                    Map<String, BinaryData> abyssMax = reader.readMap(reader1 -> reader1
                        .getNullable(nonNullReader -> BinaryData.fromObject(nonNullReader.readUntyped())));
                    deserializedZenlessAbyssSeasonTwoSummaryData.abyssMax = abyssMax;
                } else if ("abyss_task".equals(fieldName)) {
                    Map<String, BinaryData> abyssTask = reader.readMap(reader1 -> reader1
                        .getNullable(nonNullReader -> BinaryData.fromObject(nonNullReader.readUntyped())));
                    deserializedZenlessAbyssSeasonTwoSummaryData.abyssTask = abyssTask;
                } else if ("abyss_task_force_investigation_max".equals(fieldName)) {
                    Map<String, BinaryData> abyssTaskForceInvestigationMax = reader.readMap(reader1 -> reader1
                        .getNullable(nonNullReader -> BinaryData.fromObject(nonNullReader.readUntyped())));
                    deserializedZenlessAbyssSeasonTwoSummaryData.abyssTaskForceInvestigationMax
                        = abyssTaskForceInvestigationMax;
                } else if ("hide_abyss_duty".equals(fieldName)) {
                    deserializedZenlessAbyssSeasonTwoSummaryData.hideAbyssDuty
                        = reader.getNullable(JsonReader::getBoolean);
                } else if ("refresh_time".equals(fieldName)) {
                    deserializedZenlessAbyssSeasonTwoSummaryData.refreshTime = reader.getNullable(JsonReader::getLong);
                } else if ("special_mission".equals(fieldName)) {
                    Map<String, BinaryData> specialMission = reader.readMap(reader1 -> reader1
                        .getNullable(nonNullReader -> BinaryData.fromObject(nonNullReader.readUntyped())));
                    deserializedZenlessAbyssSeasonTwoSummaryData.specialMission = specialMission;
                } else if ("unlock".equals(fieldName)) {
                    deserializedZenlessAbyssSeasonTwoSummaryData.unlock = reader.getNullable(JsonReader::getBoolean);
                } else {
                    if (additionalProperties == null) {
                        additionalProperties = new LinkedHashMap<>();
                    }

                    additionalProperties.put(fieldName,
                        reader.getNullable(nonNullReader -> BinaryData.fromObject(nonNullReader.readUntyped())));
                }
            }
            deserializedZenlessAbyssSeasonTwoSummaryData.additionalProperties = additionalProperties;

            return deserializedZenlessAbyssSeasonTwoSummaryData;
        });
    }
}
