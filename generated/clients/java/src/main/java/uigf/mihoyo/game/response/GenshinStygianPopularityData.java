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
 * The GenshinStygianPopularityData model.
 */
@Metadata(properties = { MetadataProperties.IMMUTABLE })
public final class GenshinStygianPopularityData implements JsonSerializable<GenshinStygianPopularityData> {
    /*
     * The avatar_list property.
     */
    @Metadata(properties = { MetadataProperties.GENERATED })
    private List<Map<String, BinaryData>> avatarList;

    /*
     * Additional properties
     */
    @Metadata(properties = { MetadataProperties.GENERATED })
    private Map<String, BinaryData> additionalProperties;

    /**
     * Creates an instance of GenshinStygianPopularityData class.
     */
    @Metadata(properties = { MetadataProperties.GENERATED })
    private GenshinStygianPopularityData() {
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
        jsonWriter.writeArrayField("avatar_list", this.avatarList,
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
     * Reads an instance of GenshinStygianPopularityData from the JsonReader.
     * 
     * @param jsonReader The JsonReader being read.
     * @return An instance of GenshinStygianPopularityData if the JsonReader was pointing to an instance of it, or null
     * if it was pointing to JSON null.
     * @throws IOException If an error occurs while reading the GenshinStygianPopularityData.
     */
    @Metadata(properties = { MetadataProperties.GENERATED })
    public static GenshinStygianPopularityData fromJson(JsonReader jsonReader) throws IOException {
        return jsonReader.readObject(reader -> {
            GenshinStygianPopularityData deserializedGenshinStygianPopularityData = new GenshinStygianPopularityData();
            Map<String, BinaryData> additionalProperties = null;
            while (reader.nextToken() != JsonToken.END_OBJECT) {
                String fieldName = reader.getFieldName();
                reader.nextToken();

                if ("avatar_list".equals(fieldName)) {
                    List<Map<String, BinaryData>> avatarList
                        = reader.readArray(reader1 -> reader1.readMap(reader2 -> reader2
                            .getNullable(nonNullReader -> BinaryData.fromObject(nonNullReader.readUntyped()))));
                    deserializedGenshinStygianPopularityData.avatarList = avatarList;
                } else {
                    if (additionalProperties == null) {
                        additionalProperties = new LinkedHashMap<>();
                    }

                    additionalProperties.put(fieldName,
                        reader.getNullable(nonNullReader -> BinaryData.fromObject(nonNullReader.readUntyped())));
                }
            }
            deserializedGenshinStygianPopularityData.additionalProperties = additionalProperties;

            return deserializedGenshinStygianPopularityData;
        });
    }
}
