package uigf.mihoyo.game.response;

import io.clientcore.core.annotations.Metadata;
import io.clientcore.core.annotations.MetadataProperties;
import io.clientcore.core.models.binarydata.BinaryData;
import io.clientcore.core.serialization.json.JsonReader;
import io.clientcore.core.serialization.json.JsonToken;
import io.clientcore.core.serialization.json.JsonWriter;
import java.io.IOException;
import java.util.LinkedHashMap;
import java.util.Map;

/**
 * The GenshinRoleBasicInfoData model.
 */
@Metadata(properties = { MetadataProperties.IMMUTABLE })
public final class GenshinRoleBasicInfoData extends GenshinRecordRole {
    /*
     * The card_play_level property.
     */
    @Metadata(properties = { MetadataProperties.GENERATED })
    private Integer cardPlayLevel;

    /*
     * Additional properties
     */
    @Metadata(properties = { MetadataProperties.GENERATED })
    private Map<String, BinaryData> additionalProperties;

    /*
     * The region property.
     */
    @Metadata(properties = { MetadataProperties.GENERATED })
    private String region;

    /*
     * The nickname property.
     */
    @Metadata(properties = { MetadataProperties.GENERATED })
    private String nickname;

    /*
     * The level property.
     */
    @Metadata(properties = { MetadataProperties.GENERATED })
    private Integer level;

    /*
     * The game_head_icon property.
     */
    @Metadata(properties = { MetadataProperties.GENERATED })
    private String gameHeadIcon;

    /*
     * The AvatarUrl property.
     */
    @Metadata(properties = { MetadataProperties.GENERATED })
    private String avatarUrl;

    /**
     * Creates an instance of GenshinRoleBasicInfoData class.
     */
    @Metadata(properties = { MetadataProperties.GENERATED })
    private GenshinRoleBasicInfoData() {
    }

    /**
     * Get the cardPlayLevel property: The card_play_level property.
     * 
     * @return the cardPlayLevel value.
     */
    @Metadata(properties = { MetadataProperties.GENERATED })
    public Integer getCardPlayLevel() {
        return this.cardPlayLevel;
    }

    /**
     * Get the additionalProperties property: Additional properties.
     * 
     * @return the additionalProperties value.
     */
    @Metadata(properties = { MetadataProperties.GENERATED })
    @Override
    public Map<String, BinaryData> getAdditionalProperties() {
        return this.additionalProperties;
    }

    /**
     * Get the region property: The region property.
     * 
     * @return the region value.
     */
    @Metadata(properties = { MetadataProperties.GENERATED })
    @Override
    public String getRegion() {
        return this.region;
    }

    /**
     * Get the nickname property: The nickname property.
     * 
     * @return the nickname value.
     */
    @Metadata(properties = { MetadataProperties.GENERATED })
    @Override
    public String getNickname() {
        return this.nickname;
    }

    /**
     * Get the level property: The level property.
     * 
     * @return the level value.
     */
    @Metadata(properties = { MetadataProperties.GENERATED })
    @Override
    public Integer getLevel() {
        return this.level;
    }

    /**
     * Get the gameHeadIcon property: The game_head_icon property.
     * 
     * @return the gameHeadIcon value.
     */
    @Metadata(properties = { MetadataProperties.GENERATED })
    @Override
    public String getGameHeadIcon() {
        return this.gameHeadIcon;
    }

    /**
     * Get the avatarUrl property: The AvatarUrl property.
     * 
     * @return the avatarUrl value.
     */
    @Metadata(properties = { MetadataProperties.GENERATED })
    @Override
    public String getAvatarUrl() {
        return this.avatarUrl;
    }

    /**
     * {@inheritDoc}
     */
    @Metadata(properties = { MetadataProperties.GENERATED })
    @Override
    public JsonWriter toJson(JsonWriter jsonWriter) throws IOException {
        jsonWriter.writeStartObject();
        jsonWriter.writeStringField("AvatarUrl", getAvatarUrl());
        jsonWriter.writeStringField("game_head_icon", getGameHeadIcon());
        jsonWriter.writeNumberField("level", getLevel());
        jsonWriter.writeStringField("nickname", getNickname());
        jsonWriter.writeStringField("region", getRegion());
        jsonWriter.writeNumberField("card_play_level", this.cardPlayLevel);
        if (getAdditionalProperties() != null) {
            for (Map.Entry<String, BinaryData> additionalProperty : getAdditionalProperties().entrySet()) {
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
     * Reads an instance of GenshinRoleBasicInfoData from the JsonReader.
     * 
     * @param jsonReader The JsonReader being read.
     * @return An instance of GenshinRoleBasicInfoData if the JsonReader was pointing to an instance of it, or null if
     * it was pointing to JSON null.
     * @throws IOException If an error occurs while reading the GenshinRoleBasicInfoData.
     */
    @Metadata(properties = { MetadataProperties.GENERATED })
    public static GenshinRoleBasicInfoData fromJson(JsonReader jsonReader) throws IOException {
        return jsonReader.readObject(reader -> {
            GenshinRoleBasicInfoData deserializedGenshinRoleBasicInfoData = new GenshinRoleBasicInfoData();
            Map<String, BinaryData> additionalProperties = null;
            while (reader.nextToken() != JsonToken.END_OBJECT) {
                String fieldName = reader.getFieldName();
                reader.nextToken();

                if ("AvatarUrl".equals(fieldName)) {
                    deserializedGenshinRoleBasicInfoData.avatarUrl = reader.getString();
                } else if ("game_head_icon".equals(fieldName)) {
                    deserializedGenshinRoleBasicInfoData.gameHeadIcon = reader.getString();
                } else if ("level".equals(fieldName)) {
                    deserializedGenshinRoleBasicInfoData.level = reader.getNullable(JsonReader::getInt);
                } else if ("nickname".equals(fieldName)) {
                    deserializedGenshinRoleBasicInfoData.nickname = reader.getString();
                } else if ("region".equals(fieldName)) {
                    deserializedGenshinRoleBasicInfoData.region = reader.getString();
                } else if ("card_play_level".equals(fieldName)) {
                    deserializedGenshinRoleBasicInfoData.cardPlayLevel = reader.getNullable(JsonReader::getInt);
                } else {
                    if (additionalProperties == null) {
                        additionalProperties = new LinkedHashMap<>();
                    }

                    additionalProperties.put(fieldName,
                        reader.getNullable(nonNullReader -> BinaryData.fromObject(nonNullReader.readUntyped())));
                }
            }
            deserializedGenshinRoleBasicInfoData.additionalProperties = additionalProperties;

            return deserializedGenshinRoleBasicInfoData;
        });
    }
}
