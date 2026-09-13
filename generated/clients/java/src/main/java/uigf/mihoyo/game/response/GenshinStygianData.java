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
 * The GenshinStygianData model.
 */
@Metadata(properties = { MetadataProperties.IMMUTABLE })
public final class GenshinStygianData implements JsonSerializable<GenshinStygianData> {
    /*
     * The data property.
     */
    @Metadata(properties = { MetadataProperties.GENERATED })
    private List<Map<String, BinaryData>> data;

    /*
     * The is_unlock property.
     */
    @Metadata(properties = { MetadataProperties.GENERATED })
    private Boolean isUnlock;

    /*
     * The links property.
     */
    @Metadata(properties = { MetadataProperties.GENERATED })
    private Map<String, BinaryData> links;

    /*
     * Additional properties
     */
    @Metadata(properties = { MetadataProperties.GENERATED })
    private Map<String, BinaryData> additionalProperties;

    /**
     * Creates an instance of GenshinStygianData class.
     */
    @Metadata(properties = { MetadataProperties.GENERATED })
    private GenshinStygianData() {
    }

    /**
     * Get the data property: The data property.
     * 
     * @return the data value.
     */
    @Metadata(properties = { MetadataProperties.GENERATED })
    public List<Map<String, BinaryData>> getData() {
        return this.data;
    }

    /**
     * Get the isUnlock property: The is_unlock property.
     * 
     * @return the isUnlock value.
     */
    @Metadata(properties = { MetadataProperties.GENERATED })
    public Boolean isUnlock() {
        return this.isUnlock;
    }

    /**
     * Get the links property: The links property.
     * 
     * @return the links value.
     */
    @Metadata(properties = { MetadataProperties.GENERATED })
    public Map<String, BinaryData> getLinks() {
        return this.links;
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
        jsonWriter.writeArrayField("data", this.data,
            (writer, element) -> writer.writeMap(element, (writer1, element1) -> {
                if (element1 == null) {
                    writer1.writeNull();
                } else {
                    element1.writeTo(writer1);
                }
            }));
        jsonWriter.writeBooleanField("is_unlock", this.isUnlock);
        jsonWriter.writeMapField("links", this.links, (writer, element) -> {
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
     * Reads an instance of GenshinStygianData from the JsonReader.
     * 
     * @param jsonReader The JsonReader being read.
     * @return An instance of GenshinStygianData if the JsonReader was pointing to an instance of it, or null if it was
     * pointing to JSON null.
     * @throws IOException If an error occurs while reading the GenshinStygianData.
     */
    @Metadata(properties = { MetadataProperties.GENERATED })
    public static GenshinStygianData fromJson(JsonReader jsonReader) throws IOException {
        return jsonReader.readObject(reader -> {
            GenshinStygianData deserializedGenshinStygianData = new GenshinStygianData();
            Map<String, BinaryData> additionalProperties = null;
            while (reader.nextToken() != JsonToken.END_OBJECT) {
                String fieldName = reader.getFieldName();
                reader.nextToken();

                if ("data".equals(fieldName)) {
                    List<Map<String, BinaryData>> data = reader.readArray(reader1 -> reader1.readMap(reader2 -> reader2
                        .getNullable(nonNullReader -> BinaryData.fromObject(nonNullReader.readUntyped()))));
                    deserializedGenshinStygianData.data = data;
                } else if ("is_unlock".equals(fieldName)) {
                    deserializedGenshinStygianData.isUnlock = reader.getNullable(JsonReader::getBoolean);
                } else if ("links".equals(fieldName)) {
                    Map<String, BinaryData> links = reader.readMap(reader1 -> reader1
                        .getNullable(nonNullReader -> BinaryData.fromObject(nonNullReader.readUntyped())));
                    deserializedGenshinStygianData.links = links;
                } else {
                    if (additionalProperties == null) {
                        additionalProperties = new LinkedHashMap<>();
                    }

                    additionalProperties.put(fieldName,
                        reader.getNullable(nonNullReader -> BinaryData.fromObject(nonNullReader.readUntyped())));
                }
            }
            deserializedGenshinStygianData.additionalProperties = additionalProperties;

            return deserializedGenshinStygianData;
        });
    }
}
