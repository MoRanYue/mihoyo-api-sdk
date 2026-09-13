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
import java.util.Map;

/**
 * The GenshinRecordRole model.
 */
@Metadata(properties = { MetadataProperties.IMMUTABLE })
public class GenshinRecordRole implements JsonSerializable<GenshinRecordRole> {
    /*
     * The AvatarUrl property.
     */
    @Metadata(properties = { MetadataProperties.GENERATED })
    private String avatarUrl;

    /*
     * The game_head_icon property.
     */
    @Metadata(properties = { MetadataProperties.GENERATED })
    private String gameHeadIcon;

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
     * The region property.
     */
    @Metadata(properties = { MetadataProperties.GENERATED })
    private String region;

    /*
     * Additional properties
     */
    @Metadata(properties = { MetadataProperties.GENERATED })
    private Map<String, BinaryData> additionalProperties;

    /**
     * Creates an instance of GenshinRecordRole class.
     */
    @Metadata(properties = { MetadataProperties.GENERATED })
    protected GenshinRecordRole() {
    }

    /**
     * Get the avatarUrl property: The AvatarUrl property.
     * 
     * @return the avatarUrl value.
     */
    @Metadata(properties = { MetadataProperties.GENERATED })
    public String getAvatarUrl() {
        return this.avatarUrl;
    }

    /**
     * Set the avatarUrl property: The AvatarUrl property.
     * 
     * @param avatarUrl the avatarUrl value to set.
     * @return the GenshinRecordRole object itself.
     */
    @Metadata(properties = { MetadataProperties.GENERATED })
    GenshinRecordRole setAvatarUrl(String avatarUrl) {
        this.avatarUrl = avatarUrl;
        return this;
    }

    /**
     * Get the gameHeadIcon property: The game_head_icon property.
     * 
     * @return the gameHeadIcon value.
     */
    @Metadata(properties = { MetadataProperties.GENERATED })
    public String getGameHeadIcon() {
        return this.gameHeadIcon;
    }

    /**
     * Set the gameHeadIcon property: The game_head_icon property.
     * 
     * @param gameHeadIcon the gameHeadIcon value to set.
     * @return the GenshinRecordRole object itself.
     */
    @Metadata(properties = { MetadataProperties.GENERATED })
    GenshinRecordRole setGameHeadIcon(String gameHeadIcon) {
        this.gameHeadIcon = gameHeadIcon;
        return this;
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
     * Set the level property: The level property.
     * 
     * @param level the level value to set.
     * @return the GenshinRecordRole object itself.
     */
    @Metadata(properties = { MetadataProperties.GENERATED })
    GenshinRecordRole setLevel(Integer level) {
        this.level = level;
        return this;
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
     * Set the nickname property: The nickname property.
     * 
     * @param nickname the nickname value to set.
     * @return the GenshinRecordRole object itself.
     */
    @Metadata(properties = { MetadataProperties.GENERATED })
    GenshinRecordRole setNickname(String nickname) {
        this.nickname = nickname;
        return this;
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
     * Set the region property: The region property.
     * 
     * @param region the region value to set.
     * @return the GenshinRecordRole object itself.
     */
    @Metadata(properties = { MetadataProperties.GENERATED })
    GenshinRecordRole setRegion(String region) {
        this.region = region;
        return this;
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
     * @return the GenshinRecordRole object itself.
     */
    @Metadata(properties = { MetadataProperties.GENERATED })
    GenshinRecordRole setAdditionalProperties(Map<String, BinaryData> additionalProperties) {
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
        jsonWriter.writeStringField("AvatarUrl", this.avatarUrl);
        jsonWriter.writeStringField("game_head_icon", this.gameHeadIcon);
        jsonWriter.writeNumberField("level", this.level);
        jsonWriter.writeStringField("nickname", this.nickname);
        jsonWriter.writeStringField("region", this.region);
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
     * Reads an instance of GenshinRecordRole from the JsonReader.
     * 
     * @param jsonReader The JsonReader being read.
     * @return An instance of GenshinRecordRole if the JsonReader was pointing to an instance of it, or null if it was
     * pointing to JSON null.
     * @throws IOException If an error occurs while reading the GenshinRecordRole.
     */
    @Metadata(properties = { MetadataProperties.GENERATED })
    public static GenshinRecordRole fromJson(JsonReader jsonReader) throws IOException {
        return jsonReader.readObject(reader -> {
            GenshinRecordRole deserializedGenshinRecordRole = new GenshinRecordRole();
            Map<String, BinaryData> additionalProperties = null;
            while (reader.nextToken() != JsonToken.END_OBJECT) {
                String fieldName = reader.getFieldName();
                reader.nextToken();

                if ("AvatarUrl".equals(fieldName)) {
                    deserializedGenshinRecordRole.avatarUrl = reader.getString();
                } else if ("game_head_icon".equals(fieldName)) {
                    deserializedGenshinRecordRole.gameHeadIcon = reader.getString();
                } else if ("level".equals(fieldName)) {
                    deserializedGenshinRecordRole.level = reader.getNullable(JsonReader::getInt);
                } else if ("nickname".equals(fieldName)) {
                    deserializedGenshinRecordRole.nickname = reader.getString();
                } else if ("region".equals(fieldName)) {
                    deserializedGenshinRecordRole.region = reader.getString();
                } else {
                    if (additionalProperties == null) {
                        additionalProperties = new LinkedHashMap<>();
                    }

                    additionalProperties.put(fieldName,
                        reader.getNullable(nonNullReader -> BinaryData.fromObject(nonNullReader.readUntyped())));
                }
            }
            deserializedGenshinRecordRole.additionalProperties = additionalProperties;

            return deserializedGenshinRecordRole;
        });
    }
}
