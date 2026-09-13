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
 * The GcgBasicInfoData model.
 */
@Metadata(properties = { MetadataProperties.IMMUTABLE })
public final class GcgBasicInfoData implements JsonSerializable<GcgBasicInfoData> {
    /*
     * The action_card_num_gained property.
     */
    @Metadata(properties = { MetadataProperties.GENERATED })
    private Integer actionCardNumGained;

    /*
     * The action_card_num_total property.
     */
    @Metadata(properties = { MetadataProperties.GENERATED })
    private Integer actionCardNumTotal;

    /*
     * The avatar_card_num_gained property.
     */
    @Metadata(properties = { MetadataProperties.GENERATED })
    private Integer avatarCardNumGained;

    /*
     * The avatar_card_num_total property.
     */
    @Metadata(properties = { MetadataProperties.GENERATED })
    private Integer avatarCardNumTotal;

    /*
     * The challenge_basic property.
     */
    @Metadata(properties = { MetadataProperties.GENERATED })
    private Map<String, BinaryData> challengeBasic;

    /*
     * The covers property.
     */
    @Metadata(properties = { MetadataProperties.GENERATED })
    private List<Map<String, BinaryData>> covers;

    /*
     * The hornor_character property.
     */
    @Metadata(properties = { MetadataProperties.GENERATED })
    private BinaryData hornorCharacter;

    /*
     * The is_hide_covers property.
     */
    @Metadata(properties = { MetadataProperties.GENERATED })
    private Boolean isHideCovers;

    /*
     * The is_hide_replays property.
     */
    @Metadata(properties = { MetadataProperties.GENERATED })
    private Boolean isHideReplays;

    /*
     * The level property.
     */
    @Metadata(properties = { MetadataProperties.GENERATED })
    private Integer level;

    /*
     * The nickname property.
     */
    @Metadata(properties = { MetadataProperties.GENERATED })
    private String nickname;

    /*
     * The replays property.
     */
    @Metadata(properties = { MetadataProperties.GENERATED })
    private List<Map<String, BinaryData>> replays;

    /*
     * Additional properties
     */
    @Metadata(properties = { MetadataProperties.GENERATED })
    private Map<String, BinaryData> additionalProperties;

    /**
     * Creates an instance of GcgBasicInfoData class.
     */
    @Metadata(properties = { MetadataProperties.GENERATED })
    private GcgBasicInfoData() {
    }

    /**
     * Get the actionCardNumGained property: The action_card_num_gained property.
     * 
     * @return the actionCardNumGained value.
     */
    @Metadata(properties = { MetadataProperties.GENERATED })
    public Integer getActionCardNumGained() {
        return this.actionCardNumGained;
    }

    /**
     * Get the actionCardNumTotal property: The action_card_num_total property.
     * 
     * @return the actionCardNumTotal value.
     */
    @Metadata(properties = { MetadataProperties.GENERATED })
    public Integer getActionCardNumTotal() {
        return this.actionCardNumTotal;
    }

    /**
     * Get the avatarCardNumGained property: The avatar_card_num_gained property.
     * 
     * @return the avatarCardNumGained value.
     */
    @Metadata(properties = { MetadataProperties.GENERATED })
    public Integer getAvatarCardNumGained() {
        return this.avatarCardNumGained;
    }

    /**
     * Get the avatarCardNumTotal property: The avatar_card_num_total property.
     * 
     * @return the avatarCardNumTotal value.
     */
    @Metadata(properties = { MetadataProperties.GENERATED })
    public Integer getAvatarCardNumTotal() {
        return this.avatarCardNumTotal;
    }

    /**
     * Get the challengeBasic property: The challenge_basic property.
     * 
     * @return the challengeBasic value.
     */
    @Metadata(properties = { MetadataProperties.GENERATED })
    public Map<String, BinaryData> getChallengeBasic() {
        return this.challengeBasic;
    }

    /**
     * Get the covers property: The covers property.
     * 
     * @return the covers value.
     */
    @Metadata(properties = { MetadataProperties.GENERATED })
    public List<Map<String, BinaryData>> getCovers() {
        return this.covers;
    }

    /**
     * Get the hornorCharacter property: The hornor_character property.
     * 
     * @return the hornorCharacter value.
     */
    @Metadata(properties = { MetadataProperties.GENERATED })
    public BinaryData getHornorCharacter() {
        return this.hornorCharacter;
    }

    /**
     * Get the isHideCovers property: The is_hide_covers property.
     * 
     * @return the isHideCovers value.
     */
    @Metadata(properties = { MetadataProperties.GENERATED })
    public Boolean isHideCovers() {
        return this.isHideCovers;
    }

    /**
     * Get the isHideReplays property: The is_hide_replays property.
     * 
     * @return the isHideReplays value.
     */
    @Metadata(properties = { MetadataProperties.GENERATED })
    public Boolean isHideReplays() {
        return this.isHideReplays;
    }

    /**
     * Get the level property: The level property.
     * 
     * @return the level value.
     */
    @Metadata(properties = { MetadataProperties.GENERATED })
    public Integer getLevel() {
        return this.level;
    }

    /**
     * Get the nickname property: The nickname property.
     * 
     * @return the nickname value.
     */
    @Metadata(properties = { MetadataProperties.GENERATED })
    public String getNickname() {
        return this.nickname;
    }

    /**
     * Get the replays property: The replays property.
     * 
     * @return the replays value.
     */
    @Metadata(properties = { MetadataProperties.GENERATED })
    public List<Map<String, BinaryData>> getReplays() {
        return this.replays;
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
        jsonWriter.writeNumberField("action_card_num_gained", this.actionCardNumGained);
        jsonWriter.writeNumberField("action_card_num_total", this.actionCardNumTotal);
        jsonWriter.writeNumberField("avatar_card_num_gained", this.avatarCardNumGained);
        jsonWriter.writeNumberField("avatar_card_num_total", this.avatarCardNumTotal);
        jsonWriter.writeMapField("challenge_basic", this.challengeBasic, (writer, element) -> {
            if (element == null) {
                writer.writeNull();
            } else {
                element.writeTo(writer);
            }
        });
        jsonWriter.writeArrayField("covers", this.covers,
            (writer, element) -> writer.writeMap(element, (writer1, element1) -> {
                if (element1 == null) {
                    writer1.writeNull();
                } else {
                    element1.writeTo(writer1);
                }
            }));
        if (this.hornorCharacter != null) {
            jsonWriter.writeFieldName("hornor_character");
            this.hornorCharacter.writeTo(jsonWriter);
        }
        jsonWriter.writeBooleanField("is_hide_covers", this.isHideCovers);
        jsonWriter.writeBooleanField("is_hide_replays", this.isHideReplays);
        jsonWriter.writeNumberField("level", this.level);
        jsonWriter.writeStringField("nickname", this.nickname);
        jsonWriter.writeArrayField("replays", this.replays,
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
     * Reads an instance of GcgBasicInfoData from the JsonReader.
     * 
     * @param jsonReader The JsonReader being read.
     * @return An instance of GcgBasicInfoData if the JsonReader was pointing to an instance of it, or null if it was
     * pointing to JSON null.
     * @throws IOException If an error occurs while reading the GcgBasicInfoData.
     */
    @Metadata(properties = { MetadataProperties.GENERATED })
    public static GcgBasicInfoData fromJson(JsonReader jsonReader) throws IOException {
        return jsonReader.readObject(reader -> {
            GcgBasicInfoData deserializedGcgBasicInfoData = new GcgBasicInfoData();
            Map<String, BinaryData> additionalProperties = null;
            while (reader.nextToken() != JsonToken.END_OBJECT) {
                String fieldName = reader.getFieldName();
                reader.nextToken();

                if ("action_card_num_gained".equals(fieldName)) {
                    deserializedGcgBasicInfoData.actionCardNumGained = reader.getNullable(JsonReader::getInt);
                } else if ("action_card_num_total".equals(fieldName)) {
                    deserializedGcgBasicInfoData.actionCardNumTotal = reader.getNullable(JsonReader::getInt);
                } else if ("avatar_card_num_gained".equals(fieldName)) {
                    deserializedGcgBasicInfoData.avatarCardNumGained = reader.getNullable(JsonReader::getInt);
                } else if ("avatar_card_num_total".equals(fieldName)) {
                    deserializedGcgBasicInfoData.avatarCardNumTotal = reader.getNullable(JsonReader::getInt);
                } else if ("challenge_basic".equals(fieldName)) {
                    Map<String, BinaryData> challengeBasic = reader.readMap(reader1 -> reader1
                        .getNullable(nonNullReader -> BinaryData.fromObject(nonNullReader.readUntyped())));
                    deserializedGcgBasicInfoData.challengeBasic = challengeBasic;
                } else if ("covers".equals(fieldName)) {
                    List<Map<String, BinaryData>> covers
                        = reader.readArray(reader1 -> reader1.readMap(reader2 -> reader2
                            .getNullable(nonNullReader -> BinaryData.fromObject(nonNullReader.readUntyped()))));
                    deserializedGcgBasicInfoData.covers = covers;
                } else if ("hornor_character".equals(fieldName)) {
                    deserializedGcgBasicInfoData.hornorCharacter
                        = reader.getNullable(nonNullReader -> BinaryData.fromObject(nonNullReader.readUntyped()));
                } else if ("is_hide_covers".equals(fieldName)) {
                    deserializedGcgBasicInfoData.isHideCovers = reader.getNullable(JsonReader::getBoolean);
                } else if ("is_hide_replays".equals(fieldName)) {
                    deserializedGcgBasicInfoData.isHideReplays = reader.getNullable(JsonReader::getBoolean);
                } else if ("level".equals(fieldName)) {
                    deserializedGcgBasicInfoData.level = reader.getNullable(JsonReader::getInt);
                } else if ("nickname".equals(fieldName)) {
                    deserializedGcgBasicInfoData.nickname = reader.getString();
                } else if ("replays".equals(fieldName)) {
                    List<Map<String, BinaryData>> replays
                        = reader.readArray(reader1 -> reader1.readMap(reader2 -> reader2
                            .getNullable(nonNullReader -> BinaryData.fromObject(nonNullReader.readUntyped()))));
                    deserializedGcgBasicInfoData.replays = replays;
                } else {
                    if (additionalProperties == null) {
                        additionalProperties = new LinkedHashMap<>();
                    }

                    additionalProperties.put(fieldName,
                        reader.getNullable(nonNullReader -> BinaryData.fromObject(nonNullReader.readUntyped())));
                }
            }
            deserializedGcgBasicInfoData.additionalProperties = additionalProperties;

            return deserializedGcgBasicInfoData;
        });
    }
}
