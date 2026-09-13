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
 * The MobileReplyPermissionData model.
 */
@Metadata(properties = { MetadataProperties.IMMUTABLE })
public final class MobileReplyPermissionData implements JsonSerializable<MobileReplyPermissionData> {
    /*
     * The instant property.
     */
    @Metadata(properties = { MetadataProperties.GENERATED })
    private List<BinaryData> instant;

    /*
     * The max_image_number property.
     */
    @Metadata(properties = { MetadataProperties.GENERATED })
    private Integer maxImageNumber;

    /*
     * The post property.
     */
    @Metadata(properties = { MetadataProperties.GENERATED })
    private List<BinaryData> post;

    /*
     * Additional properties
     */
    @Metadata(properties = { MetadataProperties.GENERATED })
    private Map<String, BinaryData> additionalProperties;

    /**
     * Creates an instance of MobileReplyPermissionData class.
     */
    @Metadata(properties = { MetadataProperties.GENERATED })
    private MobileReplyPermissionData() {
    }

    /**
     * Get the instant property: The instant property.
     * 
     * @return the instant value.
     */
    @Metadata(properties = { MetadataProperties.GENERATED })
    public List<BinaryData> getInstant() {
        return this.instant;
    }

    /**
     * Get the maxImageNumber property: The max_image_number property.
     * 
     * @return the maxImageNumber value.
     */
    @Metadata(properties = { MetadataProperties.GENERATED })
    public Integer getMaxImageNumber() {
        return this.maxImageNumber;
    }

    /**
     * Get the post property: The post property.
     * 
     * @return the post value.
     */
    @Metadata(properties = { MetadataProperties.GENERATED })
    public List<BinaryData> getPost() {
        return this.post;
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
        jsonWriter.writeArrayField("instant", this.instant, (writer, element) -> {
            if (element == null) {
                writer.writeNull();
            } else {
                element.writeTo(writer);
            }
        });
        jsonWriter.writeNumberField("max_image_number", this.maxImageNumber);
        jsonWriter.writeArrayField("post", this.post, (writer, element) -> {
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
     * Reads an instance of MobileReplyPermissionData from the JsonReader.
     * 
     * @param jsonReader The JsonReader being read.
     * @return An instance of MobileReplyPermissionData if the JsonReader was pointing to an instance of it, or null if
     * it was pointing to JSON null.
     * @throws IOException If an error occurs while reading the MobileReplyPermissionData.
     */
    @Metadata(properties = { MetadataProperties.GENERATED })
    public static MobileReplyPermissionData fromJson(JsonReader jsonReader) throws IOException {
        return jsonReader.readObject(reader -> {
            MobileReplyPermissionData deserializedMobileReplyPermissionData = new MobileReplyPermissionData();
            Map<String, BinaryData> additionalProperties = null;
            while (reader.nextToken() != JsonToken.END_OBJECT) {
                String fieldName = reader.getFieldName();
                reader.nextToken();

                if ("instant".equals(fieldName)) {
                    List<BinaryData> instant = reader.readArray(reader1 -> reader1
                        .getNullable(nonNullReader -> BinaryData.fromObject(nonNullReader.readUntyped())));
                    deserializedMobileReplyPermissionData.instant = instant;
                } else if ("max_image_number".equals(fieldName)) {
                    deserializedMobileReplyPermissionData.maxImageNumber = reader.getNullable(JsonReader::getInt);
                } else if ("post".equals(fieldName)) {
                    List<BinaryData> post = reader.readArray(reader1 -> reader1
                        .getNullable(nonNullReader -> BinaryData.fromObject(nonNullReader.readUntyped())));
                    deserializedMobileReplyPermissionData.post = post;
                } else {
                    if (additionalProperties == null) {
                        additionalProperties = new LinkedHashMap<>();
                    }

                    additionalProperties.put(fieldName,
                        reader.getNullable(nonNullReader -> BinaryData.fromObject(nonNullReader.readUntyped())));
                }
            }
            deserializedMobileReplyPermissionData.additionalProperties = additionalProperties;

            return deserializedMobileReplyPermissionData;
        });
    }
}
