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
 * The GenshinSpiralAbyssData model.
 */
@Metadata(properties = { MetadataProperties.IMMUTABLE })
public final class GenshinSpiralAbyssData implements JsonSerializable<GenshinSpiralAbyssData> {
    /*
     * The damage_rank property.
     */
    @Metadata(properties = { MetadataProperties.GENERATED })
    private List<BinaryData> damageRank;

    /*
     * The defeat_rank property.
     */
    @Metadata(properties = { MetadataProperties.GENERATED })
    private List<BinaryData> defeatRank;

    /*
     * The end_time property.
     */
    @Metadata(properties = { MetadataProperties.GENERATED })
    private String endTime;

    /*
     * The energy_skill_rank property.
     */
    @Metadata(properties = { MetadataProperties.GENERATED })
    private List<BinaryData> energySkillRank;

    /*
     * The floors property.
     */
    @Metadata(properties = { MetadataProperties.GENERATED })
    private List<BinaryData> floors;

    /*
     * The is_just_skipped_floor property.
     */
    @Metadata(properties = { MetadataProperties.GENERATED })
    private Boolean isJustSkippedFloor;

    /*
     * The is_unlock property.
     */
    @Metadata(properties = { MetadataProperties.GENERATED })
    private Boolean isUnlock;

    /*
     * The max_floor property.
     */
    @Metadata(properties = { MetadataProperties.GENERATED })
    private String maxFloor;

    /*
     * The normal_skill_rank property.
     */
    @Metadata(properties = { MetadataProperties.GENERATED })
    private List<BinaryData> normalSkillRank;

    /*
     * The reveal_rank property.
     */
    @Metadata(properties = { MetadataProperties.GENERATED })
    private List<BinaryData> revealRank;

    /*
     * The schedule_id property.
     */
    @Metadata(properties = { MetadataProperties.GENERATED })
    private Long scheduleId;

    /*
     * The skipped_floor property.
     */
    @Metadata(properties = { MetadataProperties.GENERATED })
    private String skippedFloor;

    /*
     * The start_time property.
     */
    @Metadata(properties = { MetadataProperties.GENERATED })
    private String startTime;

    /*
     * The take_damage_rank property.
     */
    @Metadata(properties = { MetadataProperties.GENERATED })
    private List<BinaryData> takeDamageRank;

    /*
     * The total_battle_times property.
     */
    @Metadata(properties = { MetadataProperties.GENERATED })
    private Integer totalBattleTimes;

    /*
     * The total_star property.
     */
    @Metadata(properties = { MetadataProperties.GENERATED })
    private Integer totalStar;

    /*
     * The total_win_times property.
     */
    @Metadata(properties = { MetadataProperties.GENERATED })
    private Integer totalWinTimes;

    /*
     * Additional properties
     */
    @Metadata(properties = { MetadataProperties.GENERATED })
    private Map<String, BinaryData> additionalProperties;

    /**
     * Creates an instance of GenshinSpiralAbyssData class.
     */
    @Metadata(properties = { MetadataProperties.GENERATED })
    private GenshinSpiralAbyssData() {
    }

    /**
     * Get the damageRank property: The damage_rank property.
     * 
     * @return the damageRank value.
     */
    @Metadata(properties = { MetadataProperties.GENERATED })
    public List<BinaryData> getDamageRank() {
        return this.damageRank;
    }

    /**
     * Get the defeatRank property: The defeat_rank property.
     * 
     * @return the defeatRank value.
     */
    @Metadata(properties = { MetadataProperties.GENERATED })
    public List<BinaryData> getDefeatRank() {
        return this.defeatRank;
    }

    /**
     * Get the endTime property: The end_time property.
     * 
     * @return the endTime value.
     */
    @Metadata(properties = { MetadataProperties.GENERATED })
    public String getEndTime() {
        return this.endTime;
    }

    /**
     * Get the energySkillRank property: The energy_skill_rank property.
     * 
     * @return the energySkillRank value.
     */
    @Metadata(properties = { MetadataProperties.GENERATED })
    public List<BinaryData> getEnergySkillRank() {
        return this.energySkillRank;
    }

    /**
     * Get the floors property: The floors property.
     * 
     * @return the floors value.
     */
    @Metadata(properties = { MetadataProperties.GENERATED })
    public List<BinaryData> getFloors() {
        return this.floors;
    }

    /**
     * Get the isJustSkippedFloor property: The is_just_skipped_floor property.
     * 
     * @return the isJustSkippedFloor value.
     */
    @Metadata(properties = { MetadataProperties.GENERATED })
    public Boolean isJustSkippedFloor() {
        return this.isJustSkippedFloor;
    }

    /**
     * Get the isUnlock property: The is_unlock property.
     * 
     * @return the isUnlock value.
     */
    @Metadata(properties = { MetadataProperties.GENERATED })
    public Boolean isUnlock() {
        return this.isUnlock;
    }

    /**
     * Get the maxFloor property: The max_floor property.
     * 
     * @return the maxFloor value.
     */
    @Metadata(properties = { MetadataProperties.GENERATED })
    public String getMaxFloor() {
        return this.maxFloor;
    }

    /**
     * Get the normalSkillRank property: The normal_skill_rank property.
     * 
     * @return the normalSkillRank value.
     */
    @Metadata(properties = { MetadataProperties.GENERATED })
    public List<BinaryData> getNormalSkillRank() {
        return this.normalSkillRank;
    }

    /**
     * Get the revealRank property: The reveal_rank property.
     * 
     * @return the revealRank value.
     */
    @Metadata(properties = { MetadataProperties.GENERATED })
    public List<BinaryData> getRevealRank() {
        return this.revealRank;
    }

    /**
     * Get the scheduleId property: The schedule_id property.
     * 
     * @return the scheduleId value.
     */
    @Metadata(properties = { MetadataProperties.GENERATED })
    public Long getScheduleId() {
        return this.scheduleId;
    }

    /**
     * Get the skippedFloor property: The skipped_floor property.
     * 
     * @return the skippedFloor value.
     */
    @Metadata(properties = { MetadataProperties.GENERATED })
    public String getSkippedFloor() {
        return this.skippedFloor;
    }

    /**
     * Get the startTime property: The start_time property.
     * 
     * @return the startTime value.
     */
    @Metadata(properties = { MetadataProperties.GENERATED })
    public String getStartTime() {
        return this.startTime;
    }

    /**
     * Get the takeDamageRank property: The take_damage_rank property.
     * 
     * @return the takeDamageRank value.
     */
    @Metadata(properties = { MetadataProperties.GENERATED })
    public List<BinaryData> getTakeDamageRank() {
        return this.takeDamageRank;
    }

    /**
     * Get the totalBattleTimes property: The total_battle_times property.
     * 
     * @return the totalBattleTimes value.
     */
    @Metadata(properties = { MetadataProperties.GENERATED })
    public Integer getTotalBattleTimes() {
        return this.totalBattleTimes;
    }

    /**
     * Get the totalStar property: The total_star property.
     * 
     * @return the totalStar value.
     */
    @Metadata(properties = { MetadataProperties.GENERATED })
    public Integer getTotalStar() {
        return this.totalStar;
    }

    /**
     * Get the totalWinTimes property: The total_win_times property.
     * 
     * @return the totalWinTimes value.
     */
    @Metadata(properties = { MetadataProperties.GENERATED })
    public Integer getTotalWinTimes() {
        return this.totalWinTimes;
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
        jsonWriter.writeArrayField("damage_rank", this.damageRank, (writer, element) -> {
            if (element == null) {
                writer.writeNull();
            } else {
                element.writeTo(writer);
            }
        });
        jsonWriter.writeArrayField("defeat_rank", this.defeatRank, (writer, element) -> {
            if (element == null) {
                writer.writeNull();
            } else {
                element.writeTo(writer);
            }
        });
        jsonWriter.writeStringField("end_time", this.endTime);
        jsonWriter.writeArrayField("energy_skill_rank", this.energySkillRank, (writer, element) -> {
            if (element == null) {
                writer.writeNull();
            } else {
                element.writeTo(writer);
            }
        });
        jsonWriter.writeArrayField("floors", this.floors, (writer, element) -> {
            if (element == null) {
                writer.writeNull();
            } else {
                element.writeTo(writer);
            }
        });
        jsonWriter.writeBooleanField("is_just_skipped_floor", this.isJustSkippedFloor);
        jsonWriter.writeBooleanField("is_unlock", this.isUnlock);
        jsonWriter.writeStringField("max_floor", this.maxFloor);
        jsonWriter.writeArrayField("normal_skill_rank", this.normalSkillRank, (writer, element) -> {
            if (element == null) {
                writer.writeNull();
            } else {
                element.writeTo(writer);
            }
        });
        jsonWriter.writeArrayField("reveal_rank", this.revealRank, (writer, element) -> {
            if (element == null) {
                writer.writeNull();
            } else {
                element.writeTo(writer);
            }
        });
        jsonWriter.writeNumberField("schedule_id", this.scheduleId);
        jsonWriter.writeStringField("skipped_floor", this.skippedFloor);
        jsonWriter.writeStringField("start_time", this.startTime);
        jsonWriter.writeArrayField("take_damage_rank", this.takeDamageRank, (writer, element) -> {
            if (element == null) {
                writer.writeNull();
            } else {
                element.writeTo(writer);
            }
        });
        jsonWriter.writeNumberField("total_battle_times", this.totalBattleTimes);
        jsonWriter.writeNumberField("total_star", this.totalStar);
        jsonWriter.writeNumberField("total_win_times", this.totalWinTimes);
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
     * Reads an instance of GenshinSpiralAbyssData from the JsonReader.
     * 
     * @param jsonReader The JsonReader being read.
     * @return An instance of GenshinSpiralAbyssData if the JsonReader was pointing to an instance of it, or null if it
     * was pointing to JSON null.
     * @throws IOException If an error occurs while reading the GenshinSpiralAbyssData.
     */
    @Metadata(properties = { MetadataProperties.GENERATED })
    public static GenshinSpiralAbyssData fromJson(JsonReader jsonReader) throws IOException {
        return jsonReader.readObject(reader -> {
            GenshinSpiralAbyssData deserializedGenshinSpiralAbyssData = new GenshinSpiralAbyssData();
            Map<String, BinaryData> additionalProperties = null;
            while (reader.nextToken() != JsonToken.END_OBJECT) {
                String fieldName = reader.getFieldName();
                reader.nextToken();

                if ("damage_rank".equals(fieldName)) {
                    List<BinaryData> damageRank = reader.readArray(reader1 -> reader1
                        .getNullable(nonNullReader -> BinaryData.fromObject(nonNullReader.readUntyped())));
                    deserializedGenshinSpiralAbyssData.damageRank = damageRank;
                } else if ("defeat_rank".equals(fieldName)) {
                    List<BinaryData> defeatRank = reader.readArray(reader1 -> reader1
                        .getNullable(nonNullReader -> BinaryData.fromObject(nonNullReader.readUntyped())));
                    deserializedGenshinSpiralAbyssData.defeatRank = defeatRank;
                } else if ("end_time".equals(fieldName)) {
                    deserializedGenshinSpiralAbyssData.endTime = reader.getString();
                } else if ("energy_skill_rank".equals(fieldName)) {
                    List<BinaryData> energySkillRank = reader.readArray(reader1 -> reader1
                        .getNullable(nonNullReader -> BinaryData.fromObject(nonNullReader.readUntyped())));
                    deserializedGenshinSpiralAbyssData.energySkillRank = energySkillRank;
                } else if ("floors".equals(fieldName)) {
                    List<BinaryData> floors = reader.readArray(reader1 -> reader1
                        .getNullable(nonNullReader -> BinaryData.fromObject(nonNullReader.readUntyped())));
                    deserializedGenshinSpiralAbyssData.floors = floors;
                } else if ("is_just_skipped_floor".equals(fieldName)) {
                    deserializedGenshinSpiralAbyssData.isJustSkippedFloor = reader.getNullable(JsonReader::getBoolean);
                } else if ("is_unlock".equals(fieldName)) {
                    deserializedGenshinSpiralAbyssData.isUnlock = reader.getNullable(JsonReader::getBoolean);
                } else if ("max_floor".equals(fieldName)) {
                    deserializedGenshinSpiralAbyssData.maxFloor = reader.getString();
                } else if ("normal_skill_rank".equals(fieldName)) {
                    List<BinaryData> normalSkillRank = reader.readArray(reader1 -> reader1
                        .getNullable(nonNullReader -> BinaryData.fromObject(nonNullReader.readUntyped())));
                    deserializedGenshinSpiralAbyssData.normalSkillRank = normalSkillRank;
                } else if ("reveal_rank".equals(fieldName)) {
                    List<BinaryData> revealRank = reader.readArray(reader1 -> reader1
                        .getNullable(nonNullReader -> BinaryData.fromObject(nonNullReader.readUntyped())));
                    deserializedGenshinSpiralAbyssData.revealRank = revealRank;
                } else if ("schedule_id".equals(fieldName)) {
                    deserializedGenshinSpiralAbyssData.scheduleId = reader.getNullable(JsonReader::getLong);
                } else if ("skipped_floor".equals(fieldName)) {
                    deserializedGenshinSpiralAbyssData.skippedFloor = reader.getString();
                } else if ("start_time".equals(fieldName)) {
                    deserializedGenshinSpiralAbyssData.startTime = reader.getString();
                } else if ("take_damage_rank".equals(fieldName)) {
                    List<BinaryData> takeDamageRank = reader.readArray(reader1 -> reader1
                        .getNullable(nonNullReader -> BinaryData.fromObject(nonNullReader.readUntyped())));
                    deserializedGenshinSpiralAbyssData.takeDamageRank = takeDamageRank;
                } else if ("total_battle_times".equals(fieldName)) {
                    deserializedGenshinSpiralAbyssData.totalBattleTimes = reader.getNullable(JsonReader::getInt);
                } else if ("total_star".equals(fieldName)) {
                    deserializedGenshinSpiralAbyssData.totalStar = reader.getNullable(JsonReader::getInt);
                } else if ("total_win_times".equals(fieldName)) {
                    deserializedGenshinSpiralAbyssData.totalWinTimes = reader.getNullable(JsonReader::getInt);
                } else {
                    if (additionalProperties == null) {
                        additionalProperties = new LinkedHashMap<>();
                    }

                    additionalProperties.put(fieldName,
                        reader.getNullable(nonNullReader -> BinaryData.fromObject(nonNullReader.readUntyped())));
                }
            }
            deserializedGenshinSpiralAbyssData.additionalProperties = additionalProperties;

            return deserializedGenshinSpiralAbyssData;
        });
    }
}
