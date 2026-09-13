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
 * The MobileWindowShowData model.
 */
@Metadata(properties = { MetadataProperties.IMMUTABLE })
public final class MobileWindowShowData implements JsonSerializable<MobileWindowShowData> {
    /*
     * The bubble_list property.
     */
    @Metadata(properties = { MetadataProperties.GENERATED })
    private List<BinaryData> bubbleList;

    /*
     * The list property.
     */
    @Metadata(properties = { MetadataProperties.GENERATED })
    private List<BinaryData> list;

    /*
     * Additional properties
     */
    @Metadata(properties = { MetadataProperties.GENERATED })
    private Map<String, BinaryData> additionalProperties;

    /**
     * Creates an instance of MobileWindowShowData class.
     */
    @Metadata(properties = { MetadataProperties.GENERATED })
    private MobileWindowShowData() {
    }

    /**
     * Get the bubbleList property: The bubble_list property.
     * 
     * @return the bubbleList value.
     */
    @Metadata(properties = { MetadataProperties.GENERATED })
    public List<BinaryData> getBubbleList() {
        return this.bubbleList;
    }

    /**
     * Get the list property: The list property.
     * 
     * @return the list value.
     */
    @Metadata(properties = { MetadataProperties.GENERATED })
    public List<BinaryData> getList() {
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
        jsonWriter.writeArrayField("bubble_list", this.bubbleList, (writer, element) -> {
            if (element == null) {
                writer.writeNull();
            } else {
                element.writeTo(writer);
            }
        });
        jsonWriter.writeArrayField("list", this.list, (writer, element) -> {
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
     * Reads an instance of MobileWindowShowData from the JsonReader.
     * 
     * @param jsonReader The JsonReader being read.
     * @return An instance of MobileWindowShowData if the JsonReader was pointing to an instance of it, or null if it
     * was pointing to JSON null.
     * @throws IOException If an error occurs while reading the MobileWindowShowData.
     */
    @Metadata(properties = { MetadataProperties.GENERATED })
    public static MobileWindowShowData fromJson(JsonReader jsonReader) throws IOException {
        return jsonReader.readObject(reader -> {
            MobileWindowShowData deserializedMobileWindowShowData = new MobileWindowShowData();
            Map<String, BinaryData> additionalProperties = null;
            while (reader.nextToken() != JsonToken.END_OBJECT) {
                String fieldName = reader.getFieldName();
                reader.nextToken();

                if ("bubble_list".equals(fieldName)) {
                    List<BinaryData> bubbleList = reader.readArray(reader1 -> reader1
                        .getNullable(nonNullReader -> BinaryData.fromObject(nonNullReader.readUntyped())));
                    deserializedMobileWindowShowData.bubbleList = bubbleList;
                } else if ("list".equals(fieldName)) {
                    List<BinaryData> list = reader.readArray(reader1 -> reader1
                        .getNullable(nonNullReader -> BinaryData.fromObject(nonNullReader.readUntyped())));
                    deserializedMobileWindowShowData.list = list;
                } else {
                    if (additionalProperties == null) {
                        additionalProperties = new LinkedHashMap<>();
                    }

                    additionalProperties.put(fieldName,
                        reader.getNullable(nonNullReader -> BinaryData.fromObject(nonNullReader.readUntyped())));
                }
            }
            deserializedMobileWindowShowData.additionalProperties = additionalProperties;

            return deserializedMobileWindowShowData;
        });
    }
}
