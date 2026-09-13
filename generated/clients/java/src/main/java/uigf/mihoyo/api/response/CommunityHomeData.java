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
 * The CommunityHomeData model.
 */
@Metadata(properties = { MetadataProperties.IMMUTABLE })
public final class CommunityHomeData implements JsonSerializable<CommunityHomeData> {
    /*
     * The album_card property.
     */
    @Metadata(properties = { MetadataProperties.GENERATED })
    private List<BinaryData> albumCard;

    /*
     * The background property.
     */
    @Metadata(properties = { MetadataProperties.GENERATED })
    private Map<String, BinaryData> background;

    /*
     * The break_frame_card property.
     */
    @Metadata(properties = { MetadataProperties.GENERATED })
    private BinaryData breakFrameCard;

    /*
     * The carousels property.
     */
    @Metadata(properties = { MetadataProperties.GENERATED })
    private BinaryData carousels;

    /*
     * The discussion property.
     */
    @Metadata(properties = { MetadataProperties.GENERATED })
    private BinaryData discussion;

    /*
     * The exposed_resource_tickets property.
     */
    @Metadata(properties = { MetadataProperties.GENERATED })
    private List<BinaryData> exposedResourceTickets;

    /*
     * The game_receptions property.
     */
    @Metadata(properties = { MetadataProperties.GENERATED })
    private List<Map<String, BinaryData>> gameReceptions;

    /*
     * The hot_topics property.
     */
    @Metadata(properties = { MetadataProperties.GENERATED })
    private BinaryData hotTopics;

    /*
     * The image_post_card property.
     */
    @Metadata(properties = { MetadataProperties.GENERATED })
    private List<BinaryData> imagePostCard;

    /*
     * The is_resource_unchanged property.
     */
    @Metadata(properties = { MetadataProperties.GENERATED })
    private Boolean isResourceUnchanged;

    /*
     * The light_interactive_card property.
     */
    @Metadata(properties = { MetadataProperties.GENERATED })
    private BinaryData lightInteractiveCard;

    /*
     * The link_card property.
     */
    @Metadata(properties = { MetadataProperties.GENERATED })
    private List<BinaryData> linkCard;

    /*
     * The link_topic_card property.
     */
    @Metadata(properties = { MetadataProperties.GENERATED })
    private List<BinaryData> linkTopicCard;

    /*
     * The lives property.
     */
    @Metadata(properties = { MetadataProperties.GENERATED })
    private List<BinaryData> lives;

    /*
     * The navigator property.
     */
    @Metadata(properties = { MetadataProperties.GENERATED })
    private List<Map<String, BinaryData>> navigator;

    /*
     * The official property.
     */
    @Metadata(properties = { MetadataProperties.GENERATED })
    private Map<String, BinaryData> official;

    /*
     * The perspective_card property.
     */
    @Metadata(properties = { MetadataProperties.GENERATED })
    private BinaryData perspectiveCard;

    /*
     * The posts property.
     */
    @Metadata(properties = { MetadataProperties.GENERATED })
    private List<BinaryData> posts;

    /*
     * The recommend_villa property.
     */
    @Metadata(properties = { MetadataProperties.GENERATED })
    private BinaryData recommendVilla;

    /*
     * Additional properties
     */
    @Metadata(properties = { MetadataProperties.GENERATED })
    private Map<String, BinaryData> additionalProperties;

    /**
     * Creates an instance of CommunityHomeData class.
     */
    @Metadata(properties = { MetadataProperties.GENERATED })
    private CommunityHomeData() {
    }

    /**
     * Get the albumCard property: The album_card property.
     * 
     * @return the albumCard value.
     */
    @Metadata(properties = { MetadataProperties.GENERATED })
    public List<BinaryData> getAlbumCard() {
        return this.albumCard;
    }

    /**
     * Get the background property: The background property.
     * 
     * @return the background value.
     */
    @Metadata(properties = { MetadataProperties.GENERATED })
    public Map<String, BinaryData> getBackground() {
        return this.background;
    }

    /**
     * Get the breakFrameCard property: The break_frame_card property.
     * 
     * @return the breakFrameCard value.
     */
    @Metadata(properties = { MetadataProperties.GENERATED })
    public BinaryData getBreakFrameCard() {
        return this.breakFrameCard;
    }

    /**
     * Get the carousels property: The carousels property.
     * 
     * @return the carousels value.
     */
    @Metadata(properties = { MetadataProperties.GENERATED })
    public BinaryData getCarousels() {
        return this.carousels;
    }

    /**
     * Get the discussion property: The discussion property.
     * 
     * @return the discussion value.
     */
    @Metadata(properties = { MetadataProperties.GENERATED })
    public BinaryData getDiscussion() {
        return this.discussion;
    }

    /**
     * Get the exposedResourceTickets property: The exposed_resource_tickets property.
     * 
     * @return the exposedResourceTickets value.
     */
    @Metadata(properties = { MetadataProperties.GENERATED })
    public List<BinaryData> getExposedResourceTickets() {
        return this.exposedResourceTickets;
    }

    /**
     * Get the gameReceptions property: The game_receptions property.
     * 
     * @return the gameReceptions value.
     */
    @Metadata(properties = { MetadataProperties.GENERATED })
    public List<Map<String, BinaryData>> getGameReceptions() {
        return this.gameReceptions;
    }

    /**
     * Get the hotTopics property: The hot_topics property.
     * 
     * @return the hotTopics value.
     */
    @Metadata(properties = { MetadataProperties.GENERATED })
    public BinaryData getHotTopics() {
        return this.hotTopics;
    }

    /**
     * Get the imagePostCard property: The image_post_card property.
     * 
     * @return the imagePostCard value.
     */
    @Metadata(properties = { MetadataProperties.GENERATED })
    public List<BinaryData> getImagePostCard() {
        return this.imagePostCard;
    }

    /**
     * Get the isResourceUnchanged property: The is_resource_unchanged property.
     * 
     * @return the isResourceUnchanged value.
     */
    @Metadata(properties = { MetadataProperties.GENERATED })
    public Boolean isResourceUnchanged() {
        return this.isResourceUnchanged;
    }

    /**
     * Get the lightInteractiveCard property: The light_interactive_card property.
     * 
     * @return the lightInteractiveCard value.
     */
    @Metadata(properties = { MetadataProperties.GENERATED })
    public BinaryData getLightInteractiveCard() {
        return this.lightInteractiveCard;
    }

    /**
     * Get the linkCard property: The link_card property.
     * 
     * @return the linkCard value.
     */
    @Metadata(properties = { MetadataProperties.GENERATED })
    public List<BinaryData> getLinkCard() {
        return this.linkCard;
    }

    /**
     * Get the linkTopicCard property: The link_topic_card property.
     * 
     * @return the linkTopicCard value.
     */
    @Metadata(properties = { MetadataProperties.GENERATED })
    public List<BinaryData> getLinkTopicCard() {
        return this.linkTopicCard;
    }

    /**
     * Get the lives property: The lives property.
     * 
     * @return the lives value.
     */
    @Metadata(properties = { MetadataProperties.GENERATED })
    public List<BinaryData> getLives() {
        return this.lives;
    }

    /**
     * Get the navigator property: The navigator property.
     * 
     * @return the navigator value.
     */
    @Metadata(properties = { MetadataProperties.GENERATED })
    public List<Map<String, BinaryData>> getNavigator() {
        return this.navigator;
    }

    /**
     * Get the official property: The official property.
     * 
     * @return the official value.
     */
    @Metadata(properties = { MetadataProperties.GENERATED })
    public Map<String, BinaryData> getOfficial() {
        return this.official;
    }

    /**
     * Get the perspectiveCard property: The perspective_card property.
     * 
     * @return the perspectiveCard value.
     */
    @Metadata(properties = { MetadataProperties.GENERATED })
    public BinaryData getPerspectiveCard() {
        return this.perspectiveCard;
    }

    /**
     * Get the posts property: The posts property.
     * 
     * @return the posts value.
     */
    @Metadata(properties = { MetadataProperties.GENERATED })
    public List<BinaryData> getPosts() {
        return this.posts;
    }

    /**
     * Get the recommendVilla property: The recommend_villa property.
     * 
     * @return the recommendVilla value.
     */
    @Metadata(properties = { MetadataProperties.GENERATED })
    public BinaryData getRecommendVilla() {
        return this.recommendVilla;
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
        jsonWriter.writeArrayField("album_card", this.albumCard, (writer, element) -> {
            if (element == null) {
                writer.writeNull();
            } else {
                element.writeTo(writer);
            }
        });
        jsonWriter.writeMapField("background", this.background, (writer, element) -> {
            if (element == null) {
                writer.writeNull();
            } else {
                element.writeTo(writer);
            }
        });
        if (this.breakFrameCard != null) {
            jsonWriter.writeFieldName("break_frame_card");
            this.breakFrameCard.writeTo(jsonWriter);
        }
        if (this.carousels != null) {
            jsonWriter.writeFieldName("carousels");
            this.carousels.writeTo(jsonWriter);
        }
        if (this.discussion != null) {
            jsonWriter.writeFieldName("discussion");
            this.discussion.writeTo(jsonWriter);
        }
        jsonWriter.writeArrayField("exposed_resource_tickets", this.exposedResourceTickets, (writer, element) -> {
            if (element == null) {
                writer.writeNull();
            } else {
                element.writeTo(writer);
            }
        });
        jsonWriter.writeArrayField("game_receptions", this.gameReceptions,
            (writer, element) -> writer.writeMap(element, (writer1, element1) -> {
                if (element1 == null) {
                    writer1.writeNull();
                } else {
                    element1.writeTo(writer1);
                }
            }));
        if (this.hotTopics != null) {
            jsonWriter.writeFieldName("hot_topics");
            this.hotTopics.writeTo(jsonWriter);
        }
        jsonWriter.writeArrayField("image_post_card", this.imagePostCard, (writer, element) -> {
            if (element == null) {
                writer.writeNull();
            } else {
                element.writeTo(writer);
            }
        });
        jsonWriter.writeBooleanField("is_resource_unchanged", this.isResourceUnchanged);
        if (this.lightInteractiveCard != null) {
            jsonWriter.writeFieldName("light_interactive_card");
            this.lightInteractiveCard.writeTo(jsonWriter);
        }
        jsonWriter.writeArrayField("link_card", this.linkCard, (writer, element) -> {
            if (element == null) {
                writer.writeNull();
            } else {
                element.writeTo(writer);
            }
        });
        jsonWriter.writeArrayField("link_topic_card", this.linkTopicCard, (writer, element) -> {
            if (element == null) {
                writer.writeNull();
            } else {
                element.writeTo(writer);
            }
        });
        jsonWriter.writeArrayField("lives", this.lives, (writer, element) -> {
            if (element == null) {
                writer.writeNull();
            } else {
                element.writeTo(writer);
            }
        });
        jsonWriter.writeArrayField("navigator", this.navigator,
            (writer, element) -> writer.writeMap(element, (writer1, element1) -> {
                if (element1 == null) {
                    writer1.writeNull();
                } else {
                    element1.writeTo(writer1);
                }
            }));
        jsonWriter.writeMapField("official", this.official, (writer, element) -> {
            if (element == null) {
                writer.writeNull();
            } else {
                element.writeTo(writer);
            }
        });
        if (this.perspectiveCard != null) {
            jsonWriter.writeFieldName("perspective_card");
            this.perspectiveCard.writeTo(jsonWriter);
        }
        jsonWriter.writeArrayField("posts", this.posts, (writer, element) -> {
            if (element == null) {
                writer.writeNull();
            } else {
                element.writeTo(writer);
            }
        });
        if (this.recommendVilla != null) {
            jsonWriter.writeFieldName("recommend_villa");
            this.recommendVilla.writeTo(jsonWriter);
        }
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
     * Reads an instance of CommunityHomeData from the JsonReader.
     * 
     * @param jsonReader The JsonReader being read.
     * @return An instance of CommunityHomeData if the JsonReader was pointing to an instance of it, or null if it was
     * pointing to JSON null.
     * @throws IOException If an error occurs while reading the CommunityHomeData.
     */
    @Metadata(properties = { MetadataProperties.GENERATED })
    public static CommunityHomeData fromJson(JsonReader jsonReader) throws IOException {
        return jsonReader.readObject(reader -> {
            CommunityHomeData deserializedCommunityHomeData = new CommunityHomeData();
            Map<String, BinaryData> additionalProperties = null;
            while (reader.nextToken() != JsonToken.END_OBJECT) {
                String fieldName = reader.getFieldName();
                reader.nextToken();

                if ("album_card".equals(fieldName)) {
                    List<BinaryData> albumCard = reader.readArray(reader1 -> reader1
                        .getNullable(nonNullReader -> BinaryData.fromObject(nonNullReader.readUntyped())));
                    deserializedCommunityHomeData.albumCard = albumCard;
                } else if ("background".equals(fieldName)) {
                    Map<String, BinaryData> background = reader.readMap(reader1 -> reader1
                        .getNullable(nonNullReader -> BinaryData.fromObject(nonNullReader.readUntyped())));
                    deserializedCommunityHomeData.background = background;
                } else if ("break_frame_card".equals(fieldName)) {
                    deserializedCommunityHomeData.breakFrameCard
                        = reader.getNullable(nonNullReader -> BinaryData.fromObject(nonNullReader.readUntyped()));
                } else if ("carousels".equals(fieldName)) {
                    deserializedCommunityHomeData.carousels
                        = reader.getNullable(nonNullReader -> BinaryData.fromObject(nonNullReader.readUntyped()));
                } else if ("discussion".equals(fieldName)) {
                    deserializedCommunityHomeData.discussion
                        = reader.getNullable(nonNullReader -> BinaryData.fromObject(nonNullReader.readUntyped()));
                } else if ("exposed_resource_tickets".equals(fieldName)) {
                    List<BinaryData> exposedResourceTickets = reader.readArray(reader1 -> reader1
                        .getNullable(nonNullReader -> BinaryData.fromObject(nonNullReader.readUntyped())));
                    deserializedCommunityHomeData.exposedResourceTickets = exposedResourceTickets;
                } else if ("game_receptions".equals(fieldName)) {
                    List<Map<String, BinaryData>> gameReceptions
                        = reader.readArray(reader1 -> reader1.readMap(reader2 -> reader2
                            .getNullable(nonNullReader -> BinaryData.fromObject(nonNullReader.readUntyped()))));
                    deserializedCommunityHomeData.gameReceptions = gameReceptions;
                } else if ("hot_topics".equals(fieldName)) {
                    deserializedCommunityHomeData.hotTopics
                        = reader.getNullable(nonNullReader -> BinaryData.fromObject(nonNullReader.readUntyped()));
                } else if ("image_post_card".equals(fieldName)) {
                    List<BinaryData> imagePostCard = reader.readArray(reader1 -> reader1
                        .getNullable(nonNullReader -> BinaryData.fromObject(nonNullReader.readUntyped())));
                    deserializedCommunityHomeData.imagePostCard = imagePostCard;
                } else if ("is_resource_unchanged".equals(fieldName)) {
                    deserializedCommunityHomeData.isResourceUnchanged = reader.getNullable(JsonReader::getBoolean);
                } else if ("light_interactive_card".equals(fieldName)) {
                    deserializedCommunityHomeData.lightInteractiveCard
                        = reader.getNullable(nonNullReader -> BinaryData.fromObject(nonNullReader.readUntyped()));
                } else if ("link_card".equals(fieldName)) {
                    List<BinaryData> linkCard = reader.readArray(reader1 -> reader1
                        .getNullable(nonNullReader -> BinaryData.fromObject(nonNullReader.readUntyped())));
                    deserializedCommunityHomeData.linkCard = linkCard;
                } else if ("link_topic_card".equals(fieldName)) {
                    List<BinaryData> linkTopicCard = reader.readArray(reader1 -> reader1
                        .getNullable(nonNullReader -> BinaryData.fromObject(nonNullReader.readUntyped())));
                    deserializedCommunityHomeData.linkTopicCard = linkTopicCard;
                } else if ("lives".equals(fieldName)) {
                    List<BinaryData> lives = reader.readArray(reader1 -> reader1
                        .getNullable(nonNullReader -> BinaryData.fromObject(nonNullReader.readUntyped())));
                    deserializedCommunityHomeData.lives = lives;
                } else if ("navigator".equals(fieldName)) {
                    List<Map<String, BinaryData>> navigator
                        = reader.readArray(reader1 -> reader1.readMap(reader2 -> reader2
                            .getNullable(nonNullReader -> BinaryData.fromObject(nonNullReader.readUntyped()))));
                    deserializedCommunityHomeData.navigator = navigator;
                } else if ("official".equals(fieldName)) {
                    Map<String, BinaryData> official = reader.readMap(reader1 -> reader1
                        .getNullable(nonNullReader -> BinaryData.fromObject(nonNullReader.readUntyped())));
                    deserializedCommunityHomeData.official = official;
                } else if ("perspective_card".equals(fieldName)) {
                    deserializedCommunityHomeData.perspectiveCard
                        = reader.getNullable(nonNullReader -> BinaryData.fromObject(nonNullReader.readUntyped()));
                } else if ("posts".equals(fieldName)) {
                    List<BinaryData> posts = reader.readArray(reader1 -> reader1
                        .getNullable(nonNullReader -> BinaryData.fromObject(nonNullReader.readUntyped())));
                    deserializedCommunityHomeData.posts = posts;
                } else if ("recommend_villa".equals(fieldName)) {
                    deserializedCommunityHomeData.recommendVilla
                        = reader.getNullable(nonNullReader -> BinaryData.fromObject(nonNullReader.readUntyped()));
                } else {
                    if (additionalProperties == null) {
                        additionalProperties = new LinkedHashMap<>();
                    }

                    additionalProperties.put(fieldName,
                        reader.getNullable(nonNullReader -> BinaryData.fromObject(nonNullReader.readUntyped())));
                }
            }
            deserializedCommunityHomeData.additionalProperties = additionalProperties;

            return deserializedCommunityHomeData;
        });
    }
}
