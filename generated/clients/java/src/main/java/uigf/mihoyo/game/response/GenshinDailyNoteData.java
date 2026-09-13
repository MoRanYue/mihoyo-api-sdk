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
 * The GenshinDailyNoteData model.
 */
@Metadata(properties = { MetadataProperties.IMMUTABLE })
public final class GenshinDailyNoteData implements JsonSerializable<GenshinDailyNoteData> {
    /*
     * The archon_quest_progress property.
     */
    @Metadata(properties = { MetadataProperties.GENERATED })
    private Map<String, BinaryData> archonQuestProgress;

    /*
     * The calendar_url property.
     */
    @Metadata(properties = { MetadataProperties.GENERATED })
    private String calendarUrl;

    /*
     * The current_expedition_num property.
     */
    @Metadata(properties = { MetadataProperties.GENERATED })
    private Integer currentExpeditionNum;

    /*
     * The current_home_coin property.
     */
    @Metadata(properties = { MetadataProperties.GENERATED })
    private Integer currentHomeCoin;

    /*
     * The current_resin property.
     */
    @Metadata(properties = { MetadataProperties.GENERATED })
    private Integer currentResin;

    /*
     * The daily_task property.
     */
    @Metadata(properties = { MetadataProperties.GENERATED })
    private Map<String, BinaryData> dailyTask;

    /*
     * The expeditions property.
     */
    @Metadata(properties = { MetadataProperties.GENERATED })
    private List<Map<String, BinaryData>> expeditions;

    /*
     * The finished_task_num property.
     */
    @Metadata(properties = { MetadataProperties.GENERATED })
    private Integer finishedTaskNum;

    /*
     * The home_coin_recovery_time property.
     */
    @Metadata(properties = { MetadataProperties.GENERATED })
    private String homeCoinRecoveryTime;

    /*
     * The is_extra_task_reward_received property.
     */
    @Metadata(properties = { MetadataProperties.GENERATED })
    private Boolean isExtraTaskRewardReceived;

    /*
     * The max_expedition_num property.
     */
    @Metadata(properties = { MetadataProperties.GENERATED })
    private Integer maxExpeditionNum;

    /*
     * The max_home_coin property.
     */
    @Metadata(properties = { MetadataProperties.GENERATED })
    private Integer maxHomeCoin;

    /*
     * The max_resin property.
     */
    @Metadata(properties = { MetadataProperties.GENERATED })
    private Integer maxResin;

    /*
     * The remain_resin_discount_num property.
     */
    @Metadata(properties = { MetadataProperties.GENERATED })
    private Integer remainResinDiscountNum;

    /*
     * The resin_discount_num_limit property.
     */
    @Metadata(properties = { MetadataProperties.GENERATED })
    private Integer resinDiscountNumLimit;

    /*
     * The resin_recovery_time property.
     */
    @Metadata(properties = { MetadataProperties.GENERATED })
    private String resinRecoveryTime;

    /*
     * The total_task_num property.
     */
    @Metadata(properties = { MetadataProperties.GENERATED })
    private Integer totalTaskNum;

    /*
     * The transformer property.
     */
    @Metadata(properties = { MetadataProperties.GENERATED })
    private Map<String, BinaryData> transformer;

    /*
     * The week_active_progress property.
     */
    @Metadata(properties = { MetadataProperties.GENERATED })
    private Map<String, BinaryData> weekActiveProgress;

    /*
     * Additional properties
     */
    @Metadata(properties = { MetadataProperties.GENERATED })
    private Map<String, BinaryData> additionalProperties;

    /**
     * Creates an instance of GenshinDailyNoteData class.
     */
    @Metadata(properties = { MetadataProperties.GENERATED })
    private GenshinDailyNoteData() {
    }

    /**
     * Get the archonQuestProgress property: The archon_quest_progress property.
     * 
     * @return the archonQuestProgress value.
     */
    @Metadata(properties = { MetadataProperties.GENERATED })
    public Map<String, BinaryData> getArchonQuestProgress() {
        return this.archonQuestProgress;
    }

    /**
     * Get the calendarUrl property: The calendar_url property.
     * 
     * @return the calendarUrl value.
     */
    @Metadata(properties = { MetadataProperties.GENERATED })
    public String getCalendarUrl() {
        return this.calendarUrl;
    }

    /**
     * Get the currentExpeditionNum property: The current_expedition_num property.
     * 
     * @return the currentExpeditionNum value.
     */
    @Metadata(properties = { MetadataProperties.GENERATED })
    public Integer getCurrentExpeditionNum() {
        return this.currentExpeditionNum;
    }

    /**
     * Get the currentHomeCoin property: The current_home_coin property.
     * 
     * @return the currentHomeCoin value.
     */
    @Metadata(properties = { MetadataProperties.GENERATED })
    public Integer getCurrentHomeCoin() {
        return this.currentHomeCoin;
    }

    /**
     * Get the currentResin property: The current_resin property.
     * 
     * @return the currentResin value.
     */
    @Metadata(properties = { MetadataProperties.GENERATED })
    public Integer getCurrentResin() {
        return this.currentResin;
    }

    /**
     * Get the dailyTask property: The daily_task property.
     * 
     * @return the dailyTask value.
     */
    @Metadata(properties = { MetadataProperties.GENERATED })
    public Map<String, BinaryData> getDailyTask() {
        return this.dailyTask;
    }

    /**
     * Get the expeditions property: The expeditions property.
     * 
     * @return the expeditions value.
     */
    @Metadata(properties = { MetadataProperties.GENERATED })
    public List<Map<String, BinaryData>> getExpeditions() {
        return this.expeditions;
    }

    /**
     * Get the finishedTaskNum property: The finished_task_num property.
     * 
     * @return the finishedTaskNum value.
     */
    @Metadata(properties = { MetadataProperties.GENERATED })
    public Integer getFinishedTaskNum() {
        return this.finishedTaskNum;
    }

    /**
     * Get the homeCoinRecoveryTime property: The home_coin_recovery_time property.
     * 
     * @return the homeCoinRecoveryTime value.
     */
    @Metadata(properties = { MetadataProperties.GENERATED })
    public String getHomeCoinRecoveryTime() {
        return this.homeCoinRecoveryTime;
    }

    /**
     * Get the isExtraTaskRewardReceived property: The is_extra_task_reward_received property.
     * 
     * @return the isExtraTaskRewardReceived value.
     */
    @Metadata(properties = { MetadataProperties.GENERATED })
    public Boolean isExtraTaskRewardReceived() {
        return this.isExtraTaskRewardReceived;
    }

    /**
     * Get the maxExpeditionNum property: The max_expedition_num property.
     * 
     * @return the maxExpeditionNum value.
     */
    @Metadata(properties = { MetadataProperties.GENERATED })
    public Integer getMaxExpeditionNum() {
        return this.maxExpeditionNum;
    }

    /**
     * Get the maxHomeCoin property: The max_home_coin property.
     * 
     * @return the maxHomeCoin value.
     */
    @Metadata(properties = { MetadataProperties.GENERATED })
    public Integer getMaxHomeCoin() {
        return this.maxHomeCoin;
    }

    /**
     * Get the maxResin property: The max_resin property.
     * 
     * @return the maxResin value.
     */
    @Metadata(properties = { MetadataProperties.GENERATED })
    public Integer getMaxResin() {
        return this.maxResin;
    }

    /**
     * Get the remainResinDiscountNum property: The remain_resin_discount_num property.
     * 
     * @return the remainResinDiscountNum value.
     */
    @Metadata(properties = { MetadataProperties.GENERATED })
    public Integer getRemainResinDiscountNum() {
        return this.remainResinDiscountNum;
    }

    /**
     * Get the resinDiscountNumLimit property: The resin_discount_num_limit property.
     * 
     * @return the resinDiscountNumLimit value.
     */
    @Metadata(properties = { MetadataProperties.GENERATED })
    public Integer getResinDiscountNumLimit() {
        return this.resinDiscountNumLimit;
    }

    /**
     * Get the resinRecoveryTime property: The resin_recovery_time property.
     * 
     * @return the resinRecoveryTime value.
     */
    @Metadata(properties = { MetadataProperties.GENERATED })
    public String getResinRecoveryTime() {
        return this.resinRecoveryTime;
    }

    /**
     * Get the totalTaskNum property: The total_task_num property.
     * 
     * @return the totalTaskNum value.
     */
    @Metadata(properties = { MetadataProperties.GENERATED })
    public Integer getTotalTaskNum() {
        return this.totalTaskNum;
    }

    /**
     * Get the transformer property: The transformer property.
     * 
     * @return the transformer value.
     */
    @Metadata(properties = { MetadataProperties.GENERATED })
    public Map<String, BinaryData> getTransformer() {
        return this.transformer;
    }

    /**
     * Get the weekActiveProgress property: The week_active_progress property.
     * 
     * @return the weekActiveProgress value.
     */
    @Metadata(properties = { MetadataProperties.GENERATED })
    public Map<String, BinaryData> getWeekActiveProgress() {
        return this.weekActiveProgress;
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
        jsonWriter.writeMapField("archon_quest_progress", this.archonQuestProgress, (writer, element) -> {
            if (element == null) {
                writer.writeNull();
            } else {
                element.writeTo(writer);
            }
        });
        jsonWriter.writeStringField("calendar_url", this.calendarUrl);
        jsonWriter.writeNumberField("current_expedition_num", this.currentExpeditionNum);
        jsonWriter.writeNumberField("current_home_coin", this.currentHomeCoin);
        jsonWriter.writeNumberField("current_resin", this.currentResin);
        jsonWriter.writeMapField("daily_task", this.dailyTask, (writer, element) -> {
            if (element == null) {
                writer.writeNull();
            } else {
                element.writeTo(writer);
            }
        });
        jsonWriter.writeArrayField("expeditions", this.expeditions,
            (writer, element) -> writer.writeMap(element, (writer1, element1) -> {
                if (element1 == null) {
                    writer1.writeNull();
                } else {
                    element1.writeTo(writer1);
                }
            }));
        jsonWriter.writeNumberField("finished_task_num", this.finishedTaskNum);
        jsonWriter.writeStringField("home_coin_recovery_time", this.homeCoinRecoveryTime);
        jsonWriter.writeBooleanField("is_extra_task_reward_received", this.isExtraTaskRewardReceived);
        jsonWriter.writeNumberField("max_expedition_num", this.maxExpeditionNum);
        jsonWriter.writeNumberField("max_home_coin", this.maxHomeCoin);
        jsonWriter.writeNumberField("max_resin", this.maxResin);
        jsonWriter.writeNumberField("remain_resin_discount_num", this.remainResinDiscountNum);
        jsonWriter.writeNumberField("resin_discount_num_limit", this.resinDiscountNumLimit);
        jsonWriter.writeStringField("resin_recovery_time", this.resinRecoveryTime);
        jsonWriter.writeNumberField("total_task_num", this.totalTaskNum);
        jsonWriter.writeMapField("transformer", this.transformer, (writer, element) -> {
            if (element == null) {
                writer.writeNull();
            } else {
                element.writeTo(writer);
            }
        });
        jsonWriter.writeMapField("week_active_progress", this.weekActiveProgress, (writer, element) -> {
            if (element == null) {
                writer.writeNull();
            } else {
                element.writeTo(writer);
            }
        });
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
     * Reads an instance of GenshinDailyNoteData from the JsonReader.
     * 
     * @param jsonReader The JsonReader being read.
     * @return An instance of GenshinDailyNoteData if the JsonReader was pointing to an instance of it, or null if it
     * was pointing to JSON null.
     * @throws IOException If an error occurs while reading the GenshinDailyNoteData.
     */
    @Metadata(properties = { MetadataProperties.GENERATED })
    public static GenshinDailyNoteData fromJson(JsonReader jsonReader) throws IOException {
        return jsonReader.readObject(reader -> {
            GenshinDailyNoteData deserializedGenshinDailyNoteData = new GenshinDailyNoteData();
            Map<String, BinaryData> additionalProperties = null;
            while (reader.nextToken() != JsonToken.END_OBJECT) {
                String fieldName = reader.getFieldName();
                reader.nextToken();

                if ("archon_quest_progress".equals(fieldName)) {
                    Map<String, BinaryData> archonQuestProgress = reader.readMap(reader1 -> reader1
                        .getNullable(nonNullReader -> BinaryData.fromObject(nonNullReader.readUntyped())));
                    deserializedGenshinDailyNoteData.archonQuestProgress = archonQuestProgress;
                } else if ("calendar_url".equals(fieldName)) {
                    deserializedGenshinDailyNoteData.calendarUrl = reader.getString();
                } else if ("current_expedition_num".equals(fieldName)) {
                    deserializedGenshinDailyNoteData.currentExpeditionNum = reader.getNullable(JsonReader::getInt);
                } else if ("current_home_coin".equals(fieldName)) {
                    deserializedGenshinDailyNoteData.currentHomeCoin = reader.getNullable(JsonReader::getInt);
                } else if ("current_resin".equals(fieldName)) {
                    deserializedGenshinDailyNoteData.currentResin = reader.getNullable(JsonReader::getInt);
                } else if ("daily_task".equals(fieldName)) {
                    Map<String, BinaryData> dailyTask = reader.readMap(reader1 -> reader1
                        .getNullable(nonNullReader -> BinaryData.fromObject(nonNullReader.readUntyped())));
                    deserializedGenshinDailyNoteData.dailyTask = dailyTask;
                } else if ("expeditions".equals(fieldName)) {
                    List<Map<String, BinaryData>> expeditions
                        = reader.readArray(reader1 -> reader1.readMap(reader2 -> reader2
                            .getNullable(nonNullReader -> BinaryData.fromObject(nonNullReader.readUntyped()))));
                    deserializedGenshinDailyNoteData.expeditions = expeditions;
                } else if ("finished_task_num".equals(fieldName)) {
                    deserializedGenshinDailyNoteData.finishedTaskNum = reader.getNullable(JsonReader::getInt);
                } else if ("home_coin_recovery_time".equals(fieldName)) {
                    deserializedGenshinDailyNoteData.homeCoinRecoveryTime = reader.getString();
                } else if ("is_extra_task_reward_received".equals(fieldName)) {
                    deserializedGenshinDailyNoteData.isExtraTaskRewardReceived
                        = reader.getNullable(JsonReader::getBoolean);
                } else if ("max_expedition_num".equals(fieldName)) {
                    deserializedGenshinDailyNoteData.maxExpeditionNum = reader.getNullable(JsonReader::getInt);
                } else if ("max_home_coin".equals(fieldName)) {
                    deserializedGenshinDailyNoteData.maxHomeCoin = reader.getNullable(JsonReader::getInt);
                } else if ("max_resin".equals(fieldName)) {
                    deserializedGenshinDailyNoteData.maxResin = reader.getNullable(JsonReader::getInt);
                } else if ("remain_resin_discount_num".equals(fieldName)) {
                    deserializedGenshinDailyNoteData.remainResinDiscountNum = reader.getNullable(JsonReader::getInt);
                } else if ("resin_discount_num_limit".equals(fieldName)) {
                    deserializedGenshinDailyNoteData.resinDiscountNumLimit = reader.getNullable(JsonReader::getInt);
                } else if ("resin_recovery_time".equals(fieldName)) {
                    deserializedGenshinDailyNoteData.resinRecoveryTime = reader.getString();
                } else if ("total_task_num".equals(fieldName)) {
                    deserializedGenshinDailyNoteData.totalTaskNum = reader.getNullable(JsonReader::getInt);
                } else if ("transformer".equals(fieldName)) {
                    Map<String, BinaryData> transformer = reader.readMap(reader1 -> reader1
                        .getNullable(nonNullReader -> BinaryData.fromObject(nonNullReader.readUntyped())));
                    deserializedGenshinDailyNoteData.transformer = transformer;
                } else if ("week_active_progress".equals(fieldName)) {
                    Map<String, BinaryData> weekActiveProgress = reader.readMap(reader1 -> reader1
                        .getNullable(nonNullReader -> BinaryData.fromObject(nonNullReader.readUntyped())));
                    deserializedGenshinDailyNoteData.weekActiveProgress = weekActiveProgress;
                } else {
                    if (additionalProperties == null) {
                        additionalProperties = new LinkedHashMap<>();
                    }

                    additionalProperties.put(fieldName,
                        reader.getNullable(nonNullReader -> BinaryData.fromObject(nonNullReader.readUntyped())));
                }
            }
            deserializedGenshinDailyNoteData.additionalProperties = additionalProperties;

            return deserializedGenshinDailyNoteData;
        });
    }
}
