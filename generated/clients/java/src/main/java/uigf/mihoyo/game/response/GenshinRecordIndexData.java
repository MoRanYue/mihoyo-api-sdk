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
 * The GenshinRecordIndexData model.
 */
@Metadata(properties = { MetadataProperties.IMMUTABLE })
public final class GenshinRecordIndexData implements JsonSerializable<GenshinRecordIndexData> {
    /*
     * The avatars property.
     */
    @Metadata(properties = { MetadataProperties.GENERATED })
    private List<Map<String, BinaryData>> avatars;

    /*
     * The city_explorations property.
     */
    @Metadata(properties = { MetadataProperties.GENERATED })
    private List<BinaryData> cityExplorations;

    /*
     * The homes property.
     */
    @Metadata(properties = { MetadataProperties.GENERATED })
    private List<Map<String, BinaryData>> homes;

    /*
     * The query_tool_image property.
     */
    @Metadata(properties = { MetadataProperties.GENERATED })
    private String queryToolImage;

    /*
     * The query_tool_link property.
     */
    @Metadata(properties = { MetadataProperties.GENERATED })
    private String queryToolLink;

    /*
     * The role property.
     */
    @Metadata(properties = { MetadataProperties.GENERATED })
    private GenshinRecordRole role;

    /*
     * The stats property.
     */
    @Metadata(properties = { MetadataProperties.GENERATED })
    private Map<String, BinaryData> stats;

    /*
     * The world_exploration_display property.
     */
    @Metadata(properties = { MetadataProperties.GENERATED })
    private List<Map<String, BinaryData>> worldExplorationDisplay;

    /*
     * The world_explorations property.
     */
    @Metadata(properties = { MetadataProperties.GENERATED })
    private List<Map<String, BinaryData>> worldExplorations;

    /*
     * Additional properties
     */
    @Metadata(properties = { MetadataProperties.GENERATED })
    private Map<String, BinaryData> additionalProperties;

    /**
     * Creates an instance of GenshinRecordIndexData class.
     */
    @Metadata(properties = { MetadataProperties.GENERATED })
    private GenshinRecordIndexData() {
    }

    /**
     * Get the avatars property: The avatars property.
     * 
     * @return the avatars value.
     */
    @Metadata(properties = { MetadataProperties.GENERATED })
    public List<Map<String, BinaryData>> getAvatars() {
        return this.avatars;
    }

    /**
     * Get the cityExplorations property: The city_explorations property.
     * 
     * @return the cityExplorations value.
     */
    @Metadata(properties = { MetadataProperties.GENERATED })
    public List<BinaryData> getCityExplorations() {
        return this.cityExplorations;
    }

    /**
     * Get the homes property: The homes property.
     * 
     * @return the homes value.
     */
    @Metadata(properties = { MetadataProperties.GENERATED })
    public List<Map<String, BinaryData>> getHomes() {
        return this.homes;
    }

    /**
     * Get the queryToolImage property: The query_tool_image property.
     * 
     * @return the queryToolImage value.
     */
    @Metadata(properties = { MetadataProperties.GENERATED })
    public String getQueryToolImage() {
        return this.queryToolImage;
    }

    /**
     * Get the queryToolLink property: The query_tool_link property.
     * 
     * @return the queryToolLink value.
     */
    @Metadata(properties = { MetadataProperties.GENERATED })
    public String getQueryToolLink() {
        return this.queryToolLink;
    }

    /**
     * Get the role property: The role property.
     * 
     * @return the role value.
     */
    @Metadata(properties = { MetadataProperties.GENERATED })
    public GenshinRecordRole getRole() {
        return this.role;
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
     * Get the worldExplorationDisplay property: The world_exploration_display property.
     * 
     * @return the worldExplorationDisplay value.
     */
    @Metadata(properties = { MetadataProperties.GENERATED })
    public List<Map<String, BinaryData>> getWorldExplorationDisplay() {
        return this.worldExplorationDisplay;
    }

    /**
     * Get the worldExplorations property: The world_explorations property.
     * 
     * @return the worldExplorations value.
     */
    @Metadata(properties = { MetadataProperties.GENERATED })
    public List<Map<String, BinaryData>> getWorldExplorations() {
        return this.worldExplorations;
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
        jsonWriter.writeArrayField("avatars", this.avatars,
            (writer, element) -> writer.writeMap(element, (writer1, element1) -> {
                if (element1 == null) {
                    writer1.writeNull();
                } else {
                    element1.writeTo(writer1);
                }
            }));
        jsonWriter.writeArrayField("city_explorations", this.cityExplorations, (writer, element) -> {
            if (element == null) {
                writer.writeNull();
            } else {
                element.writeTo(writer);
            }
        });
        jsonWriter.writeArrayField("homes", this.homes,
            (writer, element) -> writer.writeMap(element, (writer1, element1) -> {
                if (element1 == null) {
                    writer1.writeNull();
                } else {
                    element1.writeTo(writer1);
                }
            }));
        jsonWriter.writeStringField("query_tool_image", this.queryToolImage);
        jsonWriter.writeStringField("query_tool_link", this.queryToolLink);
        jsonWriter.writeJsonField("role", this.role);
        jsonWriter.writeMapField("stats", this.stats, (writer, element) -> {
            if (element == null) {
                writer.writeNull();
            } else {
                element.writeTo(writer);
            }
        });
        jsonWriter.writeArrayField("world_exploration_display", this.worldExplorationDisplay,
            (writer, element) -> writer.writeMap(element, (writer1, element1) -> {
                if (element1 == null) {
                    writer1.writeNull();
                } else {
                    element1.writeTo(writer1);
                }
            }));
        jsonWriter.writeArrayField("world_explorations", this.worldExplorations,
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
     * Reads an instance of GenshinRecordIndexData from the JsonReader.
     * 
     * @param jsonReader The JsonReader being read.
     * @return An instance of GenshinRecordIndexData if the JsonReader was pointing to an instance of it, or null if it
     * was pointing to JSON null.
     * @throws IOException If an error occurs while reading the GenshinRecordIndexData.
     */
    @Metadata(properties = { MetadataProperties.GENERATED })
    public static GenshinRecordIndexData fromJson(JsonReader jsonReader) throws IOException {
        return jsonReader.readObject(reader -> {
            GenshinRecordIndexData deserializedGenshinRecordIndexData = new GenshinRecordIndexData();
            Map<String, BinaryData> additionalProperties = null;
            while (reader.nextToken() != JsonToken.END_OBJECT) {
                String fieldName = reader.getFieldName();
                reader.nextToken();

                if ("avatars".equals(fieldName)) {
                    List<Map<String, BinaryData>> avatars
                        = reader.readArray(reader1 -> reader1.readMap(reader2 -> reader2
                            .getNullable(nonNullReader -> BinaryData.fromObject(nonNullReader.readUntyped()))));
                    deserializedGenshinRecordIndexData.avatars = avatars;
                } else if ("city_explorations".equals(fieldName)) {
                    List<BinaryData> cityExplorations = reader.readArray(reader1 -> reader1
                        .getNullable(nonNullReader -> BinaryData.fromObject(nonNullReader.readUntyped())));
                    deserializedGenshinRecordIndexData.cityExplorations = cityExplorations;
                } else if ("homes".equals(fieldName)) {
                    List<Map<String, BinaryData>> homes = reader.readArray(reader1 -> reader1.readMap(reader2 -> reader2
                        .getNullable(nonNullReader -> BinaryData.fromObject(nonNullReader.readUntyped()))));
                    deserializedGenshinRecordIndexData.homes = homes;
                } else if ("query_tool_image".equals(fieldName)) {
                    deserializedGenshinRecordIndexData.queryToolImage = reader.getString();
                } else if ("query_tool_link".equals(fieldName)) {
                    deserializedGenshinRecordIndexData.queryToolLink = reader.getString();
                } else if ("role".equals(fieldName)) {
                    deserializedGenshinRecordIndexData.role = GenshinRecordRole.fromJson(reader);
                } else if ("stats".equals(fieldName)) {
                    Map<String, BinaryData> stats = reader.readMap(reader1 -> reader1
                        .getNullable(nonNullReader -> BinaryData.fromObject(nonNullReader.readUntyped())));
                    deserializedGenshinRecordIndexData.stats = stats;
                } else if ("world_exploration_display".equals(fieldName)) {
                    List<Map<String, BinaryData>> worldExplorationDisplay
                        = reader.readArray(reader1 -> reader1.readMap(reader2 -> reader2
                            .getNullable(nonNullReader -> BinaryData.fromObject(nonNullReader.readUntyped()))));
                    deserializedGenshinRecordIndexData.worldExplorationDisplay = worldExplorationDisplay;
                } else if ("world_explorations".equals(fieldName)) {
                    List<Map<String, BinaryData>> worldExplorations
                        = reader.readArray(reader1 -> reader1.readMap(reader2 -> reader2
                            .getNullable(nonNullReader -> BinaryData.fromObject(nonNullReader.readUntyped()))));
                    deserializedGenshinRecordIndexData.worldExplorations = worldExplorations;
                } else {
                    if (additionalProperties == null) {
                        additionalProperties = new LinkedHashMap<>();
                    }

                    additionalProperties.put(fieldName,
                        reader.getNullable(nonNullReader -> BinaryData.fromObject(nonNullReader.readUntyped())));
                }
            }
            deserializedGenshinRecordIndexData.additionalProperties = additionalProperties;

            return deserializedGenshinRecordIndexData;
        });
    }
}
