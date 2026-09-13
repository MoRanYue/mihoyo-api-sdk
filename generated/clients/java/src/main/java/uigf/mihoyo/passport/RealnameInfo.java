package uigf.mihoyo.passport;

import io.clientcore.core.annotations.Metadata;
import io.clientcore.core.annotations.MetadataProperties;
import io.clientcore.core.models.binarydata.BinaryData;
import io.clientcore.core.serialization.json.JsonReader;
import io.clientcore.core.serialization.json.JsonSerializable;
import io.clientcore.core.serialization.json.JsonToken;
import io.clientcore.core.serialization.json.JsonWriter;
import java.io.IOException;
import java.util.LinkedHashMap;
import java.util.Map;

/**
 * The RealnameInfo model.
 */
@Metadata(properties = { MetadataProperties.IMMUTABLE })
public final class RealnameInfo implements JsonSerializable<RealnameInfo> {
    /*
     * The action_ticket property.
     */
    @Metadata(properties = { MetadataProperties.GENERATED })
    private String actionTicket;

    /*
     * The action_type property.
     */
    @Metadata(properties = { MetadataProperties.GENERATED })
    private String actionType;

    /*
     * The required property.
     */
    @Metadata(properties = { MetadataProperties.GENERATED })
    private Boolean required;

    /*
     * Additional properties
     */
    @Metadata(properties = { MetadataProperties.GENERATED })
    private Map<String, BinaryData> additionalProperties;

    /**
     * Creates an instance of RealnameInfo class.
     */
    @Metadata(properties = { MetadataProperties.GENERATED })
    private RealnameInfo() {
    }

    /**
     * Get the actionTicket property: The action_ticket property.
     * 
     * @return the actionTicket value.
     */
    @Metadata(properties = { MetadataProperties.GENERATED })
    public String getActionTicket() {
        return this.actionTicket;
    }

    /**
     * Get the actionType property: The action_type property.
     * 
     * @return the actionType value.
     */
    @Metadata(properties = { MetadataProperties.GENERATED })
    public String getActionType() {
        return this.actionType;
    }

    /**
     * Get the required property: The required property.
     * 
     * @return the required value.
     */
    @Metadata(properties = { MetadataProperties.GENERATED })
    public Boolean isRequired() {
        return this.required;
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
        jsonWriter.writeStringField("action_ticket", this.actionTicket);
        jsonWriter.writeStringField("action_type", this.actionType);
        jsonWriter.writeBooleanField("required", this.required);
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
     * Reads an instance of RealnameInfo from the JsonReader.
     * 
     * @param jsonReader The JsonReader being read.
     * @return An instance of RealnameInfo if the JsonReader was pointing to an instance of it, or null if it was
     * pointing to JSON null.
     * @throws IOException If an error occurs while reading the RealnameInfo.
     */
    @Metadata(properties = { MetadataProperties.GENERATED })
    public static RealnameInfo fromJson(JsonReader jsonReader) throws IOException {
        return jsonReader.readObject(reader -> {
            RealnameInfo deserializedRealnameInfo = new RealnameInfo();
            Map<String, BinaryData> additionalProperties = null;
            while (reader.nextToken() != JsonToken.END_OBJECT) {
                String fieldName = reader.getFieldName();
                reader.nextToken();

                if ("action_ticket".equals(fieldName)) {
                    deserializedRealnameInfo.actionTicket = reader.getString();
                } else if ("action_type".equals(fieldName)) {
                    deserializedRealnameInfo.actionType = reader.getString();
                } else if ("required".equals(fieldName)) {
                    deserializedRealnameInfo.required = reader.getNullable(JsonReader::getBoolean);
                } else {
                    if (additionalProperties == null) {
                        additionalProperties = new LinkedHashMap<>();
                    }

                    additionalProperties.put(fieldName,
                        reader.getNullable(nonNullReader -> BinaryData.fromObject(nonNullReader.readUntyped())));
                }
            }
            deserializedRealnameInfo.additionalProperties = additionalProperties;

            return deserializedRealnameInfo;
        });
    }
}
