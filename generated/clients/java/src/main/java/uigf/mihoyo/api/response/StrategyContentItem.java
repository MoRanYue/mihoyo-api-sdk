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
import java.util.Map;

/**
 * The StrategyContentItem model.
 */
@Metadata(properties = { MetadataProperties.IMMUTABLE })
public final class StrategyContentItem implements JsonSerializable<StrategyContentItem> {
    /*
     * The alias_name property.
     */
    @Metadata(properties = { MetadataProperties.GENERATED })
    private String aliasName;

    /*
     * The article_time property.
     */
    @Metadata(properties = { MetadataProperties.GENERATED })
    private String articleTime;

    /*
     * The article_user_name property.
     */
    @Metadata(properties = { MetadataProperties.GENERATED })
    private String articleUserName;

    /*
     * The avatar_url property.
     */
    @Metadata(properties = { MetadataProperties.GENERATED })
    private String avatarUrl;

    /*
     * The bbs_url property.
     */
    @Metadata(properties = { MetadataProperties.GENERATED })
    private String bbsUrl;

    /*
     * The content_id property.
     */
    @Metadata(properties = { MetadataProperties.GENERATED })
    private Long contentId;

    /*
     * The corner_mark property.
     */
    @Metadata(properties = { MetadataProperties.GENERATED })
    private String cornerMark;

    /*
     * The ext property.
     */
    @Metadata(properties = { MetadataProperties.GENERATED })
    private String ext;

    /*
     * The icon property.
     */
    @Metadata(properties = { MetadataProperties.GENERATED })
    private String icon;

    /*
     * The summary property.
     */
    @Metadata(properties = { MetadataProperties.GENERATED })
    private String summary;

    /*
     * The title property.
     */
    @Metadata(properties = { MetadataProperties.GENERATED })
    private String title;

    /*
     * Additional properties
     */
    @Metadata(properties = { MetadataProperties.GENERATED })
    private Map<String, BinaryData> additionalProperties;

    /**
     * Creates an instance of StrategyContentItem class.
     */
    @Metadata(properties = { MetadataProperties.GENERATED })
    private StrategyContentItem() {
    }

    /**
     * Get the aliasName property: The alias_name property.
     * 
     * @return the aliasName value.
     */
    @Metadata(properties = { MetadataProperties.GENERATED })
    public String getAliasName() {
        return this.aliasName;
    }

    /**
     * Get the articleTime property: The article_time property.
     * 
     * @return the articleTime value.
     */
    @Metadata(properties = { MetadataProperties.GENERATED })
    public String getArticleTime() {
        return this.articleTime;
    }

    /**
     * Get the articleUserName property: The article_user_name property.
     * 
     * @return the articleUserName value.
     */
    @Metadata(properties = { MetadataProperties.GENERATED })
    public String getArticleUserName() {
        return this.articleUserName;
    }

    /**
     * Get the avatarUrl property: The avatar_url property.
     * 
     * @return the avatarUrl value.
     */
    @Metadata(properties = { MetadataProperties.GENERATED })
    public String getAvatarUrl() {
        return this.avatarUrl;
    }

    /**
     * Get the bbsUrl property: The bbs_url property.
     * 
     * @return the bbsUrl value.
     */
    @Metadata(properties = { MetadataProperties.GENERATED })
    public String getBbsUrl() {
        return this.bbsUrl;
    }

    /**
     * Get the contentId property: The content_id property.
     * 
     * @return the contentId value.
     */
    @Metadata(properties = { MetadataProperties.GENERATED })
    public Long getContentId() {
        return this.contentId;
    }

    /**
     * Get the cornerMark property: The corner_mark property.
     * 
     * @return the cornerMark value.
     */
    @Metadata(properties = { MetadataProperties.GENERATED })
    public String getCornerMark() {
        return this.cornerMark;
    }

    /**
     * Get the ext property: The ext property.
     * 
     * @return the ext value.
     */
    @Metadata(properties = { MetadataProperties.GENERATED })
    public String getExt() {
        return this.ext;
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
     * Get the summary property: The summary property.
     * 
     * @return the summary value.
     */
    @Metadata(properties = { MetadataProperties.GENERATED })
    public String getSummary() {
        return this.summary;
    }

    /**
     * Get the title property: The title property.
     * 
     * @return the title value.
     */
    @Metadata(properties = { MetadataProperties.GENERATED })
    public String getTitle() {
        return this.title;
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
        jsonWriter.writeStringField("alias_name", this.aliasName);
        jsonWriter.writeStringField("article_time", this.articleTime);
        jsonWriter.writeStringField("article_user_name", this.articleUserName);
        jsonWriter.writeStringField("avatar_url", this.avatarUrl);
        jsonWriter.writeStringField("bbs_url", this.bbsUrl);
        jsonWriter.writeNumberField("content_id", this.contentId);
        jsonWriter.writeStringField("corner_mark", this.cornerMark);
        jsonWriter.writeStringField("ext", this.ext);
        jsonWriter.writeStringField("icon", this.icon);
        jsonWriter.writeStringField("summary", this.summary);
        jsonWriter.writeStringField("title", this.title);
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
     * Reads an instance of StrategyContentItem from the JsonReader.
     * 
     * @param jsonReader The JsonReader being read.
     * @return An instance of StrategyContentItem if the JsonReader was pointing to an instance of it, or null if it was
     * pointing to JSON null.
     * @throws IOException If an error occurs while reading the StrategyContentItem.
     */
    @Metadata(properties = { MetadataProperties.GENERATED })
    public static StrategyContentItem fromJson(JsonReader jsonReader) throws IOException {
        return jsonReader.readObject(reader -> {
            StrategyContentItem deserializedStrategyContentItem = new StrategyContentItem();
            Map<String, BinaryData> additionalProperties = null;
            while (reader.nextToken() != JsonToken.END_OBJECT) {
                String fieldName = reader.getFieldName();
                reader.nextToken();

                if ("alias_name".equals(fieldName)) {
                    deserializedStrategyContentItem.aliasName = reader.getString();
                } else if ("article_time".equals(fieldName)) {
                    deserializedStrategyContentItem.articleTime = reader.getString();
                } else if ("article_user_name".equals(fieldName)) {
                    deserializedStrategyContentItem.articleUserName = reader.getString();
                } else if ("avatar_url".equals(fieldName)) {
                    deserializedStrategyContentItem.avatarUrl = reader.getString();
                } else if ("bbs_url".equals(fieldName)) {
                    deserializedStrategyContentItem.bbsUrl = reader.getString();
                } else if ("content_id".equals(fieldName)) {
                    deserializedStrategyContentItem.contentId = reader.getNullable(JsonReader::getLong);
                } else if ("corner_mark".equals(fieldName)) {
                    deserializedStrategyContentItem.cornerMark = reader.getString();
                } else if ("ext".equals(fieldName)) {
                    deserializedStrategyContentItem.ext = reader.getString();
                } else if ("icon".equals(fieldName)) {
                    deserializedStrategyContentItem.icon = reader.getString();
                } else if ("summary".equals(fieldName)) {
                    deserializedStrategyContentItem.summary = reader.getString();
                } else if ("title".equals(fieldName)) {
                    deserializedStrategyContentItem.title = reader.getString();
                } else {
                    if (additionalProperties == null) {
                        additionalProperties = new LinkedHashMap<>();
                    }

                    additionalProperties.put(fieldName,
                        reader.getNullable(nonNullReader -> BinaryData.fromObject(nonNullReader.readUntyped())));
                }
            }
            deserializedStrategyContentItem.additionalProperties = additionalProperties;

            return deserializedStrategyContentItem;
        });
    }
}
