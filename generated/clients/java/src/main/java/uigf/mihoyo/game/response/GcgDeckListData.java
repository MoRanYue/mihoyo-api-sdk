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
 * The GcgDeckListData model.
 */
@Metadata(properties = { MetadataProperties.IMMUTABLE })
public final class GcgDeckListData implements JsonSerializable<GcgDeckListData> {
    /*
     * The deck_list property.
     */
    @Metadata(properties = { MetadataProperties.GENERATED })
    private List<Map<String, BinaryData>> deckList;

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
     * The role_id property.
     */
    @Metadata(properties = { MetadataProperties.GENERATED })
    private String roleId;

    /*
     * Additional properties
     */
    @Metadata(properties = { MetadataProperties.GENERATED })
    private Map<String, BinaryData> additionalProperties;

    /**
     * Creates an instance of GcgDeckListData class.
     */
    @Metadata(properties = { MetadataProperties.GENERATED })
    private GcgDeckListData() {
    }

    /**
     * Get the deckList property: The deck_list property.
     * 
     * @return the deckList value.
     */
    @Metadata(properties = { MetadataProperties.GENERATED })
    public List<Map<String, BinaryData>> getDeckList() {
        return this.deckList;
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
     * Get the roleId property: The role_id property.
     * 
     * @return the roleId value.
     */
    @Metadata(properties = { MetadataProperties.GENERATED })
    public String getRoleId() {
        return this.roleId;
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
        jsonWriter.writeArrayField("deck_list", this.deckList,
            (writer, element) -> writer.writeMap(element, (writer1, element1) -> {
                if (element1 == null) {
                    writer1.writeNull();
                } else {
                    element1.writeTo(writer1);
                }
            }));
        jsonWriter.writeNumberField("level", this.level);
        jsonWriter.writeStringField("nickname", this.nickname);
        jsonWriter.writeStringField("role_id", this.roleId);
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
     * Reads an instance of GcgDeckListData from the JsonReader.
     * 
     * @param jsonReader The JsonReader being read.
     * @return An instance of GcgDeckListData if the JsonReader was pointing to an instance of it, or null if it was
     * pointing to JSON null.
     * @throws IOException If an error occurs while reading the GcgDeckListData.
     */
    @Metadata(properties = { MetadataProperties.GENERATED })
    public static GcgDeckListData fromJson(JsonReader jsonReader) throws IOException {
        return jsonReader.readObject(reader -> {
            GcgDeckListData deserializedGcgDeckListData = new GcgDeckListData();
            Map<String, BinaryData> additionalProperties = null;
            while (reader.nextToken() != JsonToken.END_OBJECT) {
                String fieldName = reader.getFieldName();
                reader.nextToken();

                if ("deck_list".equals(fieldName)) {
                    List<Map<String, BinaryData>> deckList
                        = reader.readArray(reader1 -> reader1.readMap(reader2 -> reader2
                            .getNullable(nonNullReader -> BinaryData.fromObject(nonNullReader.readUntyped()))));
                    deserializedGcgDeckListData.deckList = deckList;
                } else if ("level".equals(fieldName)) {
                    deserializedGcgDeckListData.level = reader.getNullable(JsonReader::getInt);
                } else if ("nickname".equals(fieldName)) {
                    deserializedGcgDeckListData.nickname = reader.getString();
                } else if ("role_id".equals(fieldName)) {
                    deserializedGcgDeckListData.roleId = reader.getString();
                } else {
                    if (additionalProperties == null) {
                        additionalProperties = new LinkedHashMap<>();
                    }

                    additionalProperties.put(fieldName,
                        reader.getNullable(nonNullReader -> BinaryData.fromObject(nonNullReader.readUntyped())));
                }
            }
            deserializedGcgDeckListData.additionalProperties = additionalProperties;

            return deserializedGcgDeckListData;
        });
    }
}
