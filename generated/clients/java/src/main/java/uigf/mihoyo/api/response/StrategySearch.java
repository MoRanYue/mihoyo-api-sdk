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
 * The StrategySearch model.
 */
@Metadata(properties = { MetadataProperties.IMMUTABLE })
public final class StrategySearch implements JsonSerializable<StrategySearch> {
    /*
     * The hot_words property.
     */
    @Metadata(properties = { MetadataProperties.GENERATED })
    private List<String> hotWords;

    /*
     * The placeholder property.
     */
    @Metadata(properties = { MetadataProperties.GENERATED })
    private String placeholder;

    /*
     * Additional properties
     */
    @Metadata(properties = { MetadataProperties.GENERATED })
    private Map<String, BinaryData> additionalProperties;

    /**
     * Creates an instance of StrategySearch class.
     */
    @Metadata(properties = { MetadataProperties.GENERATED })
    private StrategySearch() {
    }

    /**
     * Get the hotWords property: The hot_words property.
     * 
     * @return the hotWords value.
     */
    @Metadata(properties = { MetadataProperties.GENERATED })
    public List<String> getHotWords() {
        return this.hotWords;
    }

    /**
     * Get the placeholder property: The placeholder property.
     * 
     * @return the placeholder value.
     */
    @Metadata(properties = { MetadataProperties.GENERATED })
    public String getPlaceholder() {
        return this.placeholder;
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
        jsonWriter.writeArrayField("hot_words", this.hotWords, (writer, element) -> writer.writeString(element));
        jsonWriter.writeStringField("placeholder", this.placeholder);
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
     * Reads an instance of StrategySearch from the JsonReader.
     * 
     * @param jsonReader The JsonReader being read.
     * @return An instance of StrategySearch if the JsonReader was pointing to an instance of it, or null if it was
     * pointing to JSON null.
     * @throws IOException If an error occurs while reading the StrategySearch.
     */
    @Metadata(properties = { MetadataProperties.GENERATED })
    public static StrategySearch fromJson(JsonReader jsonReader) throws IOException {
        return jsonReader.readObject(reader -> {
            StrategySearch deserializedStrategySearch = new StrategySearch();
            Map<String, BinaryData> additionalProperties = null;
            while (reader.nextToken() != JsonToken.END_OBJECT) {
                String fieldName = reader.getFieldName();
                reader.nextToken();

                if ("hot_words".equals(fieldName)) {
                    List<String> hotWords = reader.readArray(reader1 -> reader1.getString());
                    deserializedStrategySearch.hotWords = hotWords;
                } else if ("placeholder".equals(fieldName)) {
                    deserializedStrategySearch.placeholder = reader.getString();
                } else {
                    if (additionalProperties == null) {
                        additionalProperties = new LinkedHashMap<>();
                    }

                    additionalProperties.put(fieldName,
                        reader.getNullable(nonNullReader -> BinaryData.fromObject(nonNullReader.readUntyped())));
                }
            }
            deserializedStrategySearch.additionalProperties = additionalProperties;

            return deserializedStrategySearch;
        });
    }
}
