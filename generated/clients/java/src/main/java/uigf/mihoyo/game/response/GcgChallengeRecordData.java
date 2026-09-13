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
 * The GcgChallengeRecordData model.
 */
@Metadata(properties = { MetadataProperties.IMMUTABLE })
public final class GcgChallengeRecordData implements JsonSerializable<GcgChallengeRecordData> {
    /*
     * The basic property.
     */
    @Metadata(properties = { MetadataProperties.GENERATED })
    private Map<String, BinaryData> basic;

    /*
     * The deck_list property.
     */
    @Metadata(properties = { MetadataProperties.GENERATED })
    private List<BinaryData> deckList;

    /*
     * The honor_character property.
     */
    @Metadata(properties = { MetadataProperties.GENERATED })
    private List<BinaryData> honorCharacter;

    /*
     * The recommend_url property.
     */
    @Metadata(properties = { MetadataProperties.GENERATED })
    private String recommendUrl;

    /*
     * Additional properties
     */
    @Metadata(properties = { MetadataProperties.GENERATED })
    private Map<String, BinaryData> additionalProperties;

    /**
     * Creates an instance of GcgChallengeRecordData class.
     */
    @Metadata(properties = { MetadataProperties.GENERATED })
    private GcgChallengeRecordData() {
    }

    /**
     * Get the basic property: The basic property.
     * 
     * @return the basic value.
     */
    @Metadata(properties = { MetadataProperties.GENERATED })
    public Map<String, BinaryData> getBasic() {
        return this.basic;
    }

    /**
     * Get the deckList property: The deck_list property.
     * 
     * @return the deckList value.
     */
    @Metadata(properties = { MetadataProperties.GENERATED })
    public List<BinaryData> getDeckList() {
        return this.deckList;
    }

    /**
     * Get the honorCharacter property: The honor_character property.
     * 
     * @return the honorCharacter value.
     */
    @Metadata(properties = { MetadataProperties.GENERATED })
    public List<BinaryData> getHonorCharacter() {
        return this.honorCharacter;
    }

    /**
     * Get the recommendUrl property: The recommend_url property.
     * 
     * @return the recommendUrl value.
     */
    @Metadata(properties = { MetadataProperties.GENERATED })
    public String getRecommendUrl() {
        return this.recommendUrl;
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
        jsonWriter.writeMapField("basic", this.basic, (writer, element) -> {
            if (element == null) {
                writer.writeNull();
            } else {
                element.writeTo(writer);
            }
        });
        jsonWriter.writeArrayField("deck_list", this.deckList, (writer, element) -> {
            if (element == null) {
                writer.writeNull();
            } else {
                element.writeTo(writer);
            }
        });
        jsonWriter.writeArrayField("honor_character", this.honorCharacter, (writer, element) -> {
            if (element == null) {
                writer.writeNull();
            } else {
                element.writeTo(writer);
            }
        });
        jsonWriter.writeStringField("recommend_url", this.recommendUrl);
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
     * Reads an instance of GcgChallengeRecordData from the JsonReader.
     * 
     * @param jsonReader The JsonReader being read.
     * @return An instance of GcgChallengeRecordData if the JsonReader was pointing to an instance of it, or null if it
     * was pointing to JSON null.
     * @throws IOException If an error occurs while reading the GcgChallengeRecordData.
     */
    @Metadata(properties = { MetadataProperties.GENERATED })
    public static GcgChallengeRecordData fromJson(JsonReader jsonReader) throws IOException {
        return jsonReader.readObject(reader -> {
            GcgChallengeRecordData deserializedGcgChallengeRecordData = new GcgChallengeRecordData();
            Map<String, BinaryData> additionalProperties = null;
            while (reader.nextToken() != JsonToken.END_OBJECT) {
                String fieldName = reader.getFieldName();
                reader.nextToken();

                if ("basic".equals(fieldName)) {
                    Map<String, BinaryData> basic = reader.readMap(reader1 -> reader1
                        .getNullable(nonNullReader -> BinaryData.fromObject(nonNullReader.readUntyped())));
                    deserializedGcgChallengeRecordData.basic = basic;
                } else if ("deck_list".equals(fieldName)) {
                    List<BinaryData> deckList = reader.readArray(reader1 -> reader1
                        .getNullable(nonNullReader -> BinaryData.fromObject(nonNullReader.readUntyped())));
                    deserializedGcgChallengeRecordData.deckList = deckList;
                } else if ("honor_character".equals(fieldName)) {
                    List<BinaryData> honorCharacter = reader.readArray(reader1 -> reader1
                        .getNullable(nonNullReader -> BinaryData.fromObject(nonNullReader.readUntyped())));
                    deserializedGcgChallengeRecordData.honorCharacter = honorCharacter;
                } else if ("recommend_url".equals(fieldName)) {
                    deserializedGcgChallengeRecordData.recommendUrl = reader.getString();
                } else {
                    if (additionalProperties == null) {
                        additionalProperties = new LinkedHashMap<>();
                    }

                    additionalProperties.put(fieldName,
                        reader.getNullable(nonNullReader -> BinaryData.fromObject(nonNullReader.readUntyped())));
                }
            }
            deserializedGcgChallengeRecordData.additionalProperties = additionalProperties;

            return deserializedGcgChallengeRecordData;
        });
    }
}
