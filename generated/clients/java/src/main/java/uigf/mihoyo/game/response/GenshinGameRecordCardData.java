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
 * The GenshinGameRecordCardData model.
 */
@Metadata(properties = { MetadataProperties.IMMUTABLE })
public final class GenshinGameRecordCardData implements JsonSerializable<GenshinGameRecordCardData> {
    /*
     * The list property.
     */
    @Metadata(properties = { MetadataProperties.GENERATED })
    private List<Map<String, BinaryData>> list;

    /*
     * Additional properties
     */
    @Metadata(properties = { MetadataProperties.GENERATED })
    private Map<String, BinaryData> additionalProperties;

    /**
     * Creates an instance of GenshinGameRecordCardData class.
     */
    @Metadata(properties = { MetadataProperties.GENERATED })
    private GenshinGameRecordCardData() {
    }

    /**
     * Get the list property: The list property.
     * 
     * @return the list value.
     */
    @Metadata(properties = { MetadataProperties.GENERATED })
    public List<Map<String, BinaryData>> getList() {
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
        jsonWriter.writeArrayField("list", this.list,
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
     * Reads an instance of GenshinGameRecordCardData from the JsonReader.
     * 
     * @param jsonReader The JsonReader being read.
     * @return An instance of GenshinGameRecordCardData if the JsonReader was pointing to an instance of it, or null if
     * it was pointing to JSON null.
     * @throws IOException If an error occurs while reading the GenshinGameRecordCardData.
     */
    @Metadata(properties = { MetadataProperties.GENERATED })
    public static GenshinGameRecordCardData fromJson(JsonReader jsonReader) throws IOException {
        return jsonReader.readObject(reader -> {
            GenshinGameRecordCardData deserializedGenshinGameRecordCardData = new GenshinGameRecordCardData();
            Map<String, BinaryData> additionalProperties = null;
            while (reader.nextToken() != JsonToken.END_OBJECT) {
                String fieldName = reader.getFieldName();
                reader.nextToken();

                if ("list".equals(fieldName)) {
                    List<Map<String, BinaryData>> list = reader.readArray(reader1 -> reader1.readMap(reader2 -> reader2
                        .getNullable(nonNullReader -> BinaryData.fromObject(nonNullReader.readUntyped()))));
                    deserializedGenshinGameRecordCardData.list = list;
                } else {
                    if (additionalProperties == null) {
                        additionalProperties = new LinkedHashMap<>();
                    }

                    additionalProperties.put(fieldName,
                        reader.getNullable(nonNullReader -> BinaryData.fromObject(nonNullReader.readUntyped())));
                }
            }
            deserializedGenshinGameRecordCardData.additionalProperties = additionalProperties;

            return deserializedGenshinGameRecordCardData;
        });
    }
}
