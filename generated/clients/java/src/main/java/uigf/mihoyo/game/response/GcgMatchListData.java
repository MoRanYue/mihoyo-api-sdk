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
 * The GcgMatchListData model.
 */
@Metadata(properties = { MetadataProperties.IMMUTABLE })
public final class GcgMatchListData implements JsonSerializable<GcgMatchListData> {
    /*
     * The favourite_matches property.
     */
    @Metadata(properties = { MetadataProperties.GENERATED })
    private List<BinaryData> favouriteMatches;

    /*
     * The recent_matches property.
     */
    @Metadata(properties = { MetadataProperties.GENERATED })
    private List<Map<String, BinaryData>> recentMatches;

    /*
     * Additional properties
     */
    @Metadata(properties = { MetadataProperties.GENERATED })
    private Map<String, BinaryData> additionalProperties;

    /**
     * Creates an instance of GcgMatchListData class.
     */
    @Metadata(properties = { MetadataProperties.GENERATED })
    private GcgMatchListData() {
    }

    /**
     * Get the favouriteMatches property: The favourite_matches property.
     * 
     * @return the favouriteMatches value.
     */
    @Metadata(properties = { MetadataProperties.GENERATED })
    public List<BinaryData> getFavouriteMatches() {
        return this.favouriteMatches;
    }

    /**
     * Get the recentMatches property: The recent_matches property.
     * 
     * @return the recentMatches value.
     */
    @Metadata(properties = { MetadataProperties.GENERATED })
    public List<Map<String, BinaryData>> getRecentMatches() {
        return this.recentMatches;
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
        jsonWriter.writeArrayField("favourite_matches", this.favouriteMatches, (writer, element) -> {
            if (element == null) {
                writer.writeNull();
            } else {
                element.writeTo(writer);
            }
        });
        jsonWriter.writeArrayField("recent_matches", this.recentMatches,
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
     * Reads an instance of GcgMatchListData from the JsonReader.
     * 
     * @param jsonReader The JsonReader being read.
     * @return An instance of GcgMatchListData if the JsonReader was pointing to an instance of it, or null if it was
     * pointing to JSON null.
     * @throws IOException If an error occurs while reading the GcgMatchListData.
     */
    @Metadata(properties = { MetadataProperties.GENERATED })
    public static GcgMatchListData fromJson(JsonReader jsonReader) throws IOException {
        return jsonReader.readObject(reader -> {
            GcgMatchListData deserializedGcgMatchListData = new GcgMatchListData();
            Map<String, BinaryData> additionalProperties = null;
            while (reader.nextToken() != JsonToken.END_OBJECT) {
                String fieldName = reader.getFieldName();
                reader.nextToken();

                if ("favourite_matches".equals(fieldName)) {
                    List<BinaryData> favouriteMatches = reader.readArray(reader1 -> reader1
                        .getNullable(nonNullReader -> BinaryData.fromObject(nonNullReader.readUntyped())));
                    deserializedGcgMatchListData.favouriteMatches = favouriteMatches;
                } else if ("recent_matches".equals(fieldName)) {
                    List<Map<String, BinaryData>> recentMatches
                        = reader.readArray(reader1 -> reader1.readMap(reader2 -> reader2
                            .getNullable(nonNullReader -> BinaryData.fromObject(nonNullReader.readUntyped()))));
                    deserializedGcgMatchListData.recentMatches = recentMatches;
                } else {
                    if (additionalProperties == null) {
                        additionalProperties = new LinkedHashMap<>();
                    }

                    additionalProperties.put(fieldName,
                        reader.getNullable(nonNullReader -> BinaryData.fromObject(nonNullReader.readUntyped())));
                }
            }
            deserializedGcgMatchListData.additionalProperties = additionalProperties;

            return deserializedGcgMatchListData;
        });
    }
}
