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
 * The MobileDiscussion model.
 */
@Metadata(properties = { MetadataProperties.IMMUTABLE })
public final class MobileDiscussion implements JsonSerializable<MobileDiscussion> {
    /*
     * The created_at property.
     */
    @Metadata(properties = { MetadataProperties.GENERATED })
    private Long createdAt;

    /*
     * The default_feed_forum_id property.
     */
    @Metadata(properties = { MetadataProperties.GENERATED })
    private Long defaultFeedForumId;

    /*
     * The default_feed_tab property.
     */
    @Metadata(properties = { MetadataProperties.GENERATED })
    private Integer defaultFeedTab;

    /*
     * The desc property.
     */
    @Metadata(properties = { MetadataProperties.GENERATED })
    private String desc;

    /*
     * The desc_type property.
     */
    @Metadata(properties = { MetadataProperties.GENERATED })
    private Integer descType;

    /*
     * The discussion_id property.
     */
    @Metadata(properties = { MetadataProperties.GENERATED })
    private Long discussionId;

    /*
     * The forums property.
     */
    @Metadata(properties = { MetadataProperties.GENERATED })
    private List<BinaryData> forums;

    /*
     * The game_id property.
     */
    @Metadata(properties = { MetadataProperties.GENERATED })
    private Integer gameId;

    /*
     * The hot_posts property.
     */
    @Metadata(properties = { MetadataProperties.GENERATED })
    private List<BinaryData> hotPosts;

    /*
     * The icon property.
     */
    @Metadata(properties = { MetadataProperties.GENERATED })
    private String icon;

    /*
     * The subject property.
     */
    @Metadata(properties = { MetadataProperties.GENERATED })
    private String subject;

    /*
     * The talking_forum_id property.
     */
    @Metadata(properties = { MetadataProperties.GENERATED })
    private String talkingForumId;

    /*
     * The talking_prompt property.
     */
    @Metadata(properties = { MetadataProperties.GENERATED })
    private String talkingPrompt;

    /*
     * The updated_at property.
     */
    @Metadata(properties = { MetadataProperties.GENERATED })
    private Long updatedAt;

    /*
     * Additional properties
     */
    @Metadata(properties = { MetadataProperties.GENERATED })
    private Map<String, BinaryData> additionalProperties;

    /**
     * Creates an instance of MobileDiscussion class.
     */
    @Metadata(properties = { MetadataProperties.GENERATED })
    private MobileDiscussion() {
    }

    /**
     * Get the createdAt property: The created_at property.
     * 
     * @return the createdAt value.
     */
    @Metadata(properties = { MetadataProperties.GENERATED })
    public Long getCreatedAt() {
        return this.createdAt;
    }

    /**
     * Get the defaultFeedForumId property: The default_feed_forum_id property.
     * 
     * @return the defaultFeedForumId value.
     */
    @Metadata(properties = { MetadataProperties.GENERATED })
    public Long getDefaultFeedForumId() {
        return this.defaultFeedForumId;
    }

    /**
     * Get the defaultFeedTab property: The default_feed_tab property.
     * 
     * @return the defaultFeedTab value.
     */
    @Metadata(properties = { MetadataProperties.GENERATED })
    public Integer getDefaultFeedTab() {
        return this.defaultFeedTab;
    }

    /**
     * Get the desc property: The desc property.
     * 
     * @return the desc value.
     */
    @Metadata(properties = { MetadataProperties.GENERATED })
    public String getDesc() {
        return this.desc;
    }

    /**
     * Get the descType property: The desc_type property.
     * 
     * @return the descType value.
     */
    @Metadata(properties = { MetadataProperties.GENERATED })
    public Integer getDescType() {
        return this.descType;
    }

    /**
     * Get the discussionId property: The discussion_id property.
     * 
     * @return the discussionId value.
     */
    @Metadata(properties = { MetadataProperties.GENERATED })
    public Long getDiscussionId() {
        return this.discussionId;
    }

    /**
     * Get the forums property: The forums property.
     * 
     * @return the forums value.
     */
    @Metadata(properties = { MetadataProperties.GENERATED })
    public List<BinaryData> getForums() {
        return this.forums;
    }

    /**
     * Get the gameId property: The game_id property.
     * 
     * @return the gameId value.
     */
    @Metadata(properties = { MetadataProperties.GENERATED })
    public Integer getGameId() {
        return this.gameId;
    }

    /**
     * Get the hotPosts property: The hot_posts property.
     * 
     * @return the hotPosts value.
     */
    @Metadata(properties = { MetadataProperties.GENERATED })
    public List<BinaryData> getHotPosts() {
        return this.hotPosts;
    }

    /**
     * Get the icon property: The icon property.
     * 
     * @return the icon value.
     */
    @Metadata(properties = { MetadataProperties.GENERATED })
    public String getIcon() {
        return this.icon;
    }

    /**
     * Get the subject property: The subject property.
     * 
     * @return the subject value.
     */
    @Metadata(properties = { MetadataProperties.GENERATED })
    public String getSubject() {
        return this.subject;
    }

    /**
     * Get the talkingForumId property: The talking_forum_id property.
     * 
     * @return the talkingForumId value.
     */
    @Metadata(properties = { MetadataProperties.GENERATED })
    public String getTalkingForumId() {
        return this.talkingForumId;
    }

    /**
     * Get the talkingPrompt property: The talking_prompt property.
     * 
     * @return the talkingPrompt value.
     */
    @Metadata(properties = { MetadataProperties.GENERATED })
    public String getTalkingPrompt() {
        return this.talkingPrompt;
    }

    /**
     * Get the updatedAt property: The updated_at property.
     * 
     * @return the updatedAt value.
     */
    @Metadata(properties = { MetadataProperties.GENERATED })
    public Long getUpdatedAt() {
        return this.updatedAt;
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
        jsonWriter.writeNumberField("created_at", this.createdAt);
        jsonWriter.writeNumberField("default_feed_forum_id", this.defaultFeedForumId);
        jsonWriter.writeNumberField("default_feed_tab", this.defaultFeedTab);
        jsonWriter.writeStringField("desc", this.desc);
        jsonWriter.writeNumberField("desc_type", this.descType);
        jsonWriter.writeNumberField("discussion_id", this.discussionId);
        jsonWriter.writeArrayField("forums", this.forums, (writer, element) -> {
            if (element == null) {
                writer.writeNull();
            } else {
                element.writeTo(writer);
            }
        });
        jsonWriter.writeNumberField("game_id", this.gameId);
        jsonWriter.writeArrayField("hot_posts", this.hotPosts, (writer, element) -> {
            if (element == null) {
                writer.writeNull();
            } else {
                element.writeTo(writer);
            }
        });
        jsonWriter.writeStringField("icon", this.icon);
        jsonWriter.writeStringField("subject", this.subject);
        jsonWriter.writeStringField("talking_forum_id", this.talkingForumId);
        jsonWriter.writeStringField("talking_prompt", this.talkingPrompt);
        jsonWriter.writeNumberField("updated_at", this.updatedAt);
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
     * Reads an instance of MobileDiscussion from the JsonReader.
     * 
     * @param jsonReader The JsonReader being read.
     * @return An instance of MobileDiscussion if the JsonReader was pointing to an instance of it, or null if it was
     * pointing to JSON null.
     * @throws IOException If an error occurs while reading the MobileDiscussion.
     */
    @Metadata(properties = { MetadataProperties.GENERATED })
    public static MobileDiscussion fromJson(JsonReader jsonReader) throws IOException {
        return jsonReader.readObject(reader -> {
            MobileDiscussion deserializedMobileDiscussion = new MobileDiscussion();
            Map<String, BinaryData> additionalProperties = null;
            while (reader.nextToken() != JsonToken.END_OBJECT) {
                String fieldName = reader.getFieldName();
                reader.nextToken();

                if ("created_at".equals(fieldName)) {
                    deserializedMobileDiscussion.createdAt = reader.getNullable(JsonReader::getLong);
                } else if ("default_feed_forum_id".equals(fieldName)) {
                    deserializedMobileDiscussion.defaultFeedForumId = reader.getNullable(JsonReader::getLong);
                } else if ("default_feed_tab".equals(fieldName)) {
                    deserializedMobileDiscussion.defaultFeedTab = reader.getNullable(JsonReader::getInt);
                } else if ("desc".equals(fieldName)) {
                    deserializedMobileDiscussion.desc = reader.getString();
                } else if ("desc_type".equals(fieldName)) {
                    deserializedMobileDiscussion.descType = reader.getNullable(JsonReader::getInt);
                } else if ("discussion_id".equals(fieldName)) {
                    deserializedMobileDiscussion.discussionId = reader.getNullable(JsonReader::getLong);
                } else if ("forums".equals(fieldName)) {
                    List<BinaryData> forums = reader.readArray(reader1 -> reader1
                        .getNullable(nonNullReader -> BinaryData.fromObject(nonNullReader.readUntyped())));
                    deserializedMobileDiscussion.forums = forums;
                } else if ("game_id".equals(fieldName)) {
                    deserializedMobileDiscussion.gameId = reader.getNullable(JsonReader::getInt);
                } else if ("hot_posts".equals(fieldName)) {
                    List<BinaryData> hotPosts = reader.readArray(reader1 -> reader1
                        .getNullable(nonNullReader -> BinaryData.fromObject(nonNullReader.readUntyped())));
                    deserializedMobileDiscussion.hotPosts = hotPosts;
                } else if ("icon".equals(fieldName)) {
                    deserializedMobileDiscussion.icon = reader.getString();
                } else if ("subject".equals(fieldName)) {
                    deserializedMobileDiscussion.subject = reader.getString();
                } else if ("talking_forum_id".equals(fieldName)) {
                    deserializedMobileDiscussion.talkingForumId = reader.getString();
                } else if ("talking_prompt".equals(fieldName)) {
                    deserializedMobileDiscussion.talkingPrompt = reader.getString();
                } else if ("updated_at".equals(fieldName)) {
                    deserializedMobileDiscussion.updatedAt = reader.getNullable(JsonReader::getLong);
                } else {
                    if (additionalProperties == null) {
                        additionalProperties = new LinkedHashMap<>();
                    }

                    additionalProperties.put(fieldName,
                        reader.getNullable(nonNullReader -> BinaryData.fromObject(nonNullReader.readUntyped())));
                }
            }
            deserializedMobileDiscussion.additionalProperties = additionalProperties;

            return deserializedMobileDiscussion;
        });
    }
}
