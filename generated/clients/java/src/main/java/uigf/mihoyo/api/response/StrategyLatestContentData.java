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
 * The StrategyLatestContentData model.
 */
@Metadata(properties = { MetadataProperties.IMMUTABLE })
public final class StrategyLatestContentData implements JsonSerializable<StrategyLatestContentData> {
    /*
     * The list property.
     */
    @Metadata(properties = { MetadataProperties.GENERATED })
    private List<StrategyContentItem> list;

    /*
     * Additional properties
     */
    @Metadata(properties = { MetadataProperties.GENERATED })
    private Map<String, BinaryData> additionalProperties;

    /**
     * Creates an instance of StrategyLatestContentData class.
     */
    @Metadata(properties = { MetadataProperties.GENERATED })
    private StrategyLatestContentData() {
    }

    /**
     * Get the list property: The list property.
     * 
     * @return the list value.
     */
    @Metadata(properties = { MetadataProperties.GENERATED })
    public List<StrategyContentItem> getList() {
        return this.list;
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
        jsonWriter.writeArrayField("list", this.list, (writer, element) -> writer.writeJson(element));
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
     * Reads an instance of StrategyLatestContentData from the JsonReader.
     * 
     * @param jsonReader The JsonReader being read.
     * @return An instance of StrategyLatestContentData if the JsonReader was pointing to an instance of it, or null if
     * it was pointing to JSON null.
     * @throws IOException If an error occurs while reading the StrategyLatestContentData.
     */
    @Metadata(properties = { MetadataProperties.GENERATED })
    public static StrategyLatestContentData fromJson(JsonReader jsonReader) throws IOException {
        return jsonReader.readObject(reader -> {
            StrategyLatestContentData deserializedStrategyLatestContentData = new StrategyLatestContentData();
            Map<String, BinaryData> additionalProperties = null;
            while (reader.nextToken() != JsonToken.END_OBJECT) {
                String fieldName = reader.getFieldName();
                reader.nextToken();

                if ("list".equals(fieldName)) {
                    List<StrategyContentItem> list = reader.readArray(reader1 -> StrategyContentItem.fromJson(reader1));
                    deserializedStrategyLatestContentData.list = list;
                } else {
                    if (additionalProperties == null) {
                        additionalProperties = new LinkedHashMap<>();
                    }

                    additionalProperties.put(fieldName,
                        reader.getNullable(nonNullReader -> BinaryData.fromObject(nonNullReader.readUntyped())));
                }
            }
            deserializedStrategyLatestContentData.additionalProperties = additionalProperties;

            return deserializedStrategyLatestContentData;
        });
    }
}
