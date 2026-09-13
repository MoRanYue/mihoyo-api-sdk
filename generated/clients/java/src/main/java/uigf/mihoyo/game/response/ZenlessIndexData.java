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
 * The ZenlessIndexData model.
 */
@Metadata(properties = { MetadataProperties.IMMUTABLE })
public final class ZenlessIndexData implements JsonSerializable<ZenlessIndexData> {
    /*
     * The area_collections property.
     */
    @Metadata(properties = { MetadataProperties.GENERATED })
    private List<Map<String, BinaryData>> areaCollections;

    /*
     * The avatar_list property.
     */
    @Metadata(properties = { MetadataProperties.GENERATED })
    private List<Map<String, BinaryData>> avatarList;

    /*
     * The award_state property.
     */
    @Metadata(properties = { MetadataProperties.GENERATED })
    private String awardState;

    /*
     * The buddy_list property.
     */
    @Metadata(properties = { MetadataProperties.GENERATED })
    private List<Map<String, BinaryData>> buddyList;

    /*
     * The cat_notes_list property.
     */
    @Metadata(properties = { MetadataProperties.GENERATED })
    private List<BinaryData> catNotesList;

    /*
     * The challenge_schedule_list property.
     */
    @Metadata(properties = { MetadataProperties.GENERATED })
    private List<Map<String, BinaryData>> challengeScheduleList;

    /*
     * The cur_head_icon_url property.
     */
    @Metadata(properties = { MetadataProperties.GENERATED })
    private String curHeadIconUrl;

    /*
     * The game_data_show property.
     */
    @Metadata(properties = { MetadataProperties.GENERATED })
    private Map<String, BinaryData> gameDataShow;

    /*
     * The stats property.
     */
    @Metadata(properties = { MetadataProperties.GENERATED })
    private Map<String, BinaryData> stats;

    /*
     * Additional properties
     */
    @Metadata(properties = { MetadataProperties.GENERATED })
    private Map<String, BinaryData> additionalProperties;

    /**
     * Creates an instance of ZenlessIndexData class.
     */
    @Metadata(properties = { MetadataProperties.GENERATED })
    private ZenlessIndexData() {
    }

    /**
     * Get the areaCollections property: The area_collections property.
     * 
     * @return the areaCollections value.
     */
    @Metadata(properties = { MetadataProperties.GENERATED })
    public List<Map<String, BinaryData>> getAreaCollections() {
        return this.areaCollections;
    }

    /**
     * Get the avatarList property: The avatar_list property.
     * 
     * @return the avatarList value.
     */
    @Metadata(properties = { MetadataProperties.GENERATED })
    public List<Map<String, BinaryData>> getAvatarList() {
        return this.avatarList;
    }

    /**
     * Get the awardState property: The award_state property.
     * 
     * @return the awardState value.
     */
    @Metadata(properties = { MetadataProperties.GENERATED })
    public String getAwardState() {
        return this.awardState;
    }

    /**
     * Get the buddyList property: The buddy_list property.
     * 
     * @return the buddyList value.
     */
    @Metadata(properties = { MetadataProperties.GENERATED })
    public List<Map<String, BinaryData>> getBuddyList() {
        return this.buddyList;
    }

    /**
     * Get the catNotesList property: The cat_notes_list property.
     * 
     * @return the catNotesList value.
     */
    @Metadata(properties = { MetadataProperties.GENERATED })
    public List<BinaryData> getCatNotesList() {
        return this.catNotesList;
    }

    /**
     * Get the challengeScheduleList property: The challenge_schedule_list property.
     * 
     * @return the challengeScheduleList value.
     */
    @Metadata(properties = { MetadataProperties.GENERATED })
    public List<Map<String, BinaryData>> getChallengeScheduleList() {
        return this.challengeScheduleList;
    }

    /**
     * Get the curHeadIconUrl property: The cur_head_icon_url property.
     * 
     * @return the curHeadIconUrl value.
     */
    @Metadata(properties = { MetadataProperties.GENERATED })
    public String getCurHeadIconUrl() {
        return this.curHeadIconUrl;
    }

    /**
     * Get the gameDataShow property: The game_data_show property.
     * 
     * @return the gameDataShow value.
     */
    @Metadata(properties = { MetadataProperties.GENERATED })
    public Map<String, BinaryData> getGameDataShow() {
        return this.gameDataShow;
    }

    /**
     * Get the stats property: The stats property.
     * 
     * @return the stats value.
     */
    @Metadata(properties = { MetadataProperties.GENERATED })
    public Map<String, BinaryData> getStats() {
        return this.stats;
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
        jsonWriter.writeArrayField("area_collections", this.areaCollections,
            (writer, element) -> writer.writeMap(element, (writer1, element1) -> {
                if (element1 == null) {
                    writer1.writeNull();
                } else {
                    element1.writeTo(writer1);
                }
            }));
        jsonWriter.writeArrayField("avatar_list", this.avatarList,
            (writer, element) -> writer.writeMap(element, (writer1, element1) -> {
                if (element1 == null) {
                    writer1.writeNull();
                } else {
                    element1.writeTo(writer1);
                }
            }));
        jsonWriter.writeStringField("award_state", this.awardState);
        jsonWriter.writeArrayField("buddy_list", this.buddyList,
            (writer, element) -> writer.writeMap(element, (writer1, element1) -> {
                if (element1 == null) {
                    writer1.writeNull();
                } else {
                    element1.writeTo(writer1);
                }
            }));
        jsonWriter.writeArrayField("cat_notes_list", this.catNotesList, (writer, element) -> {
            if (element == null) {
                writer.writeNull();
            } else {
                element.writeTo(writer);
            }
        });
        jsonWriter.writeArrayField("challenge_schedule_list", this.challengeScheduleList,
            (writer, element) -> writer.writeMap(element, (writer1, element1) -> {
                if (element1 == null) {
                    writer1.writeNull();
                } else {
                    element1.writeTo(writer1);
                }
            }));
        jsonWriter.writeStringField("cur_head_icon_url", this.curHeadIconUrl);
        jsonWriter.writeMapField("game_data_show", this.gameDataShow, (writer, element) -> {
            if (element == null) {
                writer.writeNull();
            } else {
                element.writeTo(writer);
            }
        });
        jsonWriter.writeMapField("stats", this.stats, (writer, element) -> {
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
     * Reads an instance of ZenlessIndexData from the JsonReader.
     * 
     * @param jsonReader The JsonReader being read.
     * @return An instance of ZenlessIndexData if the JsonReader was pointing to an instance of it, or null if it was
     * pointing to JSON null.
     * @throws IOException If an error occurs while reading the ZenlessIndexData.
     */
    @Metadata(properties = { MetadataProperties.GENERATED })
    public static ZenlessIndexData fromJson(JsonReader jsonReader) throws IOException {
        return jsonReader.readObject(reader -> {
            ZenlessIndexData deserializedZenlessIndexData = new ZenlessIndexData();
            Map<String, BinaryData> additionalProperties = null;
            while (reader.nextToken() != JsonToken.END_OBJECT) {
                String fieldName = reader.getFieldName();
                reader.nextToken();

                if ("area_collections".equals(fieldName)) {
                    List<Map<String, BinaryData>> areaCollections
                        = reader.readArray(reader1 -> reader1.readMap(reader2 -> reader2
                            .getNullable(nonNullReader -> BinaryData.fromObject(nonNullReader.readUntyped()))));
                    deserializedZenlessIndexData.areaCollections = areaCollections;
                } else if ("avatar_list".equals(fieldName)) {
                    List<Map<String, BinaryData>> avatarList
                        = reader.readArray(reader1 -> reader1.readMap(reader2 -> reader2
                            .getNullable(nonNullReader -> BinaryData.fromObject(nonNullReader.readUntyped()))));
                    deserializedZenlessIndexData.avatarList = avatarList;
                } else if ("award_state".equals(fieldName)) {
                    deserializedZenlessIndexData.awardState = reader.getString();
                } else if ("buddy_list".equals(fieldName)) {
                    List<Map<String, BinaryData>> buddyList
                        = reader.readArray(reader1 -> reader1.readMap(reader2 -> reader2
                            .getNullable(nonNullReader -> BinaryData.fromObject(nonNullReader.readUntyped()))));
                    deserializedZenlessIndexData.buddyList = buddyList;
                } else if ("cat_notes_list".equals(fieldName)) {
                    List<BinaryData> catNotesList = reader.readArray(reader1 -> reader1
                        .getNullable(nonNullReader -> BinaryData.fromObject(nonNullReader.readUntyped())));
                    deserializedZenlessIndexData.catNotesList = catNotesList;
                } else if ("challenge_schedule_list".equals(fieldName)) {
                    List<Map<String, BinaryData>> challengeScheduleList
                        = reader.readArray(reader1 -> reader1.readMap(reader2 -> reader2
                            .getNullable(nonNullReader -> BinaryData.fromObject(nonNullReader.readUntyped()))));
                    deserializedZenlessIndexData.challengeScheduleList = challengeScheduleList;
                } else if ("cur_head_icon_url".equals(fieldName)) {
                    deserializedZenlessIndexData.curHeadIconUrl = reader.getString();
                } else if ("game_data_show".equals(fieldName)) {
                    Map<String, BinaryData> gameDataShow = reader.readMap(reader1 -> reader1
                        .getNullable(nonNullReader -> BinaryData.fromObject(nonNullReader.readUntyped())));
                    deserializedZenlessIndexData.gameDataShow = gameDataShow;
                } else if ("stats".equals(fieldName)) {
                    Map<String, BinaryData> stats = reader.readMap(reader1 -> reader1
                        .getNullable(nonNullReader -> BinaryData.fromObject(nonNullReader.readUntyped())));
                    deserializedZenlessIndexData.stats = stats;
                } else {
                    if (additionalProperties == null) {
                        additionalProperties = new LinkedHashMap<>();
                    }

                    additionalProperties.put(fieldName,
                        reader.getNullable(nonNullReader -> BinaryData.fromObject(nonNullReader.readUntyped())));
                }
            }
            deserializedZenlessIndexData.additionalProperties = additionalProperties;

            return deserializedZenlessIndexData;
        });
    }
}
