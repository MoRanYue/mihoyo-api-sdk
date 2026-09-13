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
 * The MobileFeedPostsData model.
 */
@Metadata(properties = { MetadataProperties.IMMUTABLE })
public final class MobileFeedPostsData implements JsonSerializable<MobileFeedPostsData> {
    /*
     * The databox property.
     */
    @Metadata(properties = { MetadataProperties.GENERATED })
    private Map<String, String> databox;

    /*
     * The is_original property.
     */
    @Metadata(properties = { MetadataProperties.GENERATED })
    private Boolean isOriginal;

    /*
     * The is_resource_unchanged property.
     */
    @Metadata(properties = { MetadataProperties.GENERATED })
    private Boolean isResourceUnchanged;

    /*
     * The last_id property.
     */
    @Metadata(properties = { MetadataProperties.GENERATED })
    private String lastId;

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
     * Creates an instance of MobileFeedPostsData class.
     */
    @Metadata(properties = { MetadataProperties.GENERATED })
    private MobileFeedPostsData() {
    }

    /**
     * Get the databox property: The databox property.
     * 
     * @return the databox value.
     */
    @Metadata(properties = { MetadataProperties.GENERATED })
    public Map<String, String> getDatabox() {
        return this.databox;
    }

    /**
     * Get the isOriginal property: The is_original property.
     * 
     * @return the isOriginal value.
     */
    @Metadata(properties = { MetadataProperties.GENERATED })
    public Boolean isOriginal() {
        return this.isOriginal;
    }

    /**
     * Get the isResourceUnchanged property: The is_resource_unchanged property.
     * 
     * @return the isResourceUnchanged value.
     */
    @Metadata(properties = { MetadataProperties.GENERATED })
    public Boolean isResourceUnchanged() {
        return this.isResourceUnchanged;
    }

    /**
     * Get the lastId property: The last_id property.
     * 
     * @return the lastId value.
     */
    @Metadata(properties = { MetadataProperties.GENERATED })
    public String getLastId() {
        return this.lastId;
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
        jsonWriter.writeMapField("databox", this.databox, (writer, element) -> writer.writeString(element));
        jsonWriter.writeBooleanField("is_original", this.isOriginal);
        jsonWriter.writeBooleanField("is_resource_unchanged", this.isResourceUnchanged);
        jsonWriter.writeStringField("last_id", this.lastId);
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
     * Reads an instance of MobileFeedPostsData from the JsonReader.
     * 
     * @param jsonReader The JsonReader being read.
     * @return An instance of MobileFeedPostsData if the JsonReader was pointing to an instance of it, or null if it was
     * pointing to JSON null.
     * @throws IOException If an error occurs while reading the MobileFeedPostsData.
     */
    @Metadata(properties = { MetadataProperties.GENERATED })
    public static MobileFeedPostsData fromJson(JsonReader jsonReader) throws IOException {
        return jsonReader.readObject(reader -> {
            MobileFeedPostsData deserializedMobileFeedPostsData = new MobileFeedPostsData();
            Map<String, BinaryData> additionalProperties = null;
            while (reader.nextToken() != JsonToken.END_OBJECT) {
                String fieldName = reader.getFieldName();
                reader.nextToken();

                if ("databox".equals(fieldName)) {
                    Map<String, String> databox = reader.readMap(reader1 -> reader1.getString());
                    deserializedMobileFeedPostsData.databox = databox;
                } else if ("is_original".equals(fieldName)) {
                    deserializedMobileFeedPostsData.isOriginal = reader.getNullable(JsonReader::getBoolean);
                } else if ("is_resource_unchanged".equals(fieldName)) {
                    deserializedMobileFeedPostsData.isResourceUnchanged = reader.getNullable(JsonReader::getBoolean);
                } else if ("last_id".equals(fieldName)) {
                    deserializedMobileFeedPostsData.lastId = reader.getString();
                } else if ("list".equals(fieldName)) {
                    List<Map<String, BinaryData>> list = reader.readArray(reader1 -> reader1.readMap(reader2 -> reader2
                        .getNullable(nonNullReader -> BinaryData.fromObject(nonNullReader.readUntyped()))));
                    deserializedMobileFeedPostsData.list = list;
                } else {
                    if (additionalProperties == null) {
                        additionalProperties = new LinkedHashMap<>();
                    }

                    additionalProperties.put(fieldName,
                        reader.getNullable(nonNullReader -> BinaryData.fromObject(nonNullReader.readUntyped())));
                }
            }
            deserializedMobileFeedPostsData.additionalProperties = additionalProperties;

            return deserializedMobileFeedPostsData;
        });
    }
}
