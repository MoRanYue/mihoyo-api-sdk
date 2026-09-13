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
 * The GcgCardListData model.
 */
@Metadata(properties = { MetadataProperties.IMMUTABLE })
public final class GcgCardListData implements JsonSerializable<GcgCardListData> {
    /*
     * The card_list property.
     */
    @Metadata(properties = { MetadataProperties.GENERATED })
    private List<Map<String, BinaryData>> cardList;

    /*
     * The is_last property.
     */
    @Metadata(properties = { MetadataProperties.GENERATED })
    private Boolean isLast;

    /*
     * The next_offset property.
     */
    @Metadata(properties = { MetadataProperties.GENERATED })
    private Integer nextOffset;

    /*
     * The stats property.
     */
    @Metadata(properties = { MetadataProperties.GENERATED })
    private Map<String, BinaryData> stats;

    /*
     * Additional properties
     */
    @Metadata(properties = { MetadataProperties.GENERATED })
    private Map<String, BinaryData> additionalProperties;

    /**
     * Creates an instance of GcgCardListData class.
     */
    @Metadata(properties = { MetadataProperties.GENERATED })
    private GcgCardListData() {
    }

    /**
     * Get the cardList property: The card_list property.
     * 
     * @return the cardList value.
     */
    @Metadata(properties = { MetadataProperties.GENERATED })
    public List<Map<String, BinaryData>> getCardList() {
        return this.cardList;
    }

    /**
     * Get the isLast property: The is_last property.
     * 
     * @return the isLast value.
     */
    @Metadata(properties = { MetadataProperties.GENERATED })
    public Boolean isLast() {
        return this.isLast;
    }

    /**
     * Get the nextOffset property: The next_offset property.
     * 
     * @return the nextOffset value.
     */
    @Metadata(properties = { MetadataProperties.GENERATED })
    public Integer getNextOffset() {
        return this.nextOffset;
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
        jsonWriter.writeArrayField("card_list", this.cardList,
            (writer, element) -> writer.writeMap(element, (writer1, element1) -> {
                if (element1 == null) {
                    writer1.writeNull();
                } else {
                    element1.writeTo(writer1);
                }
            }));
        jsonWriter.writeBooleanField("is_last", this.isLast);
        jsonWriter.writeNumberField("next_offset", this.nextOffset);
        jsonWriter.writeMapField("stats", this.stats, (writer, element) -> {
            if (element == null) {
                writer.writeNull();
            } else {
                element.writeTo(writer);
            }
        });
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
     * Reads an instance of GcgCardListData from the JsonReader.
     * 
     * @param jsonReader The JsonReader being read.
     * @return An instance of GcgCardListData if the JsonReader was pointing to an instance of it, or null if it was
     * pointing to JSON null.
     * @throws IOException If an error occurs while reading the GcgCardListData.
     */
    @Metadata(properties = { MetadataProperties.GENERATED })
    public static GcgCardListData fromJson(JsonReader jsonReader) throws IOException {
        return jsonReader.readObject(reader -> {
            GcgCardListData deserializedGcgCardListData = new GcgCardListData();
            Map<String, BinaryData> additionalProperties = null;
            while (reader.nextToken() != JsonToken.END_OBJECT) {
                String fieldName = reader.getFieldName();
                reader.nextToken();

                if ("card_list".equals(fieldName)) {
                    List<Map<String, BinaryData>> cardList
                        = reader.readArray(reader1 -> reader1.readMap(reader2 -> reader2
                            .getNullable(nonNullReader -> BinaryData.fromObject(nonNullReader.readUntyped()))));
                    deserializedGcgCardListData.cardList = cardList;
                } else if ("is_last".equals(fieldName)) {
                    deserializedGcgCardListData.isLast = reader.getNullable(JsonReader::getBoolean);
                } else if ("next_offset".equals(fieldName)) {
                    deserializedGcgCardListData.nextOffset = reader.getNullable(JsonReader::getInt);
                } else if ("stats".equals(fieldName)) {
                    Map<String, BinaryData> stats = reader.readMap(reader1 -> reader1
                        .getNullable(nonNullReader -> BinaryData.fromObject(nonNullReader.readUntyped())));
                    deserializedGcgCardListData.stats = stats;
                } else {
                    if (additionalProperties == null) {
                        additionalProperties = new LinkedHashMap<>();
                    }

                    additionalProperties.put(fieldName,
                        reader.getNullable(nonNullReader -> BinaryData.fromObject(nonNullReader.readUntyped())));
                }
            }
            deserializedGcgCardListData.additionalProperties = additionalProperties;

            return deserializedGcgCardListData;
        });
    }
}
