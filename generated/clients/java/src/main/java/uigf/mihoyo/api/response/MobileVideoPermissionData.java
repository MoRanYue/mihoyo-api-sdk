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
import java.util.Map;

/**
 * The MobileVideoPermissionData model.
 */
@Metadata(properties = { MetadataProperties.IMMUTABLE })
public final class MobileVideoPermissionData implements JsonSerializable<MobileVideoPermissionData> {
    /*
     * The can_publish property.
     */
    @Metadata(properties = { MetadataProperties.GENERATED })
    private Boolean canPublish;

    /*
     * The toast property.
     */
    @Metadata(properties = { MetadataProperties.GENERATED })
    private String toast;

    /*
     * Additional properties
     */
    @Metadata(properties = { MetadataProperties.GENERATED })
    private Map<String, BinaryData> additionalProperties;

    /**
     * Creates an instance of MobileVideoPermissionData class.
     */
    @Metadata(properties = { MetadataProperties.GENERATED })
    private MobileVideoPermissionData() {
    }

    /**
     * Get the canPublish property: The can_publish property.
     * 
     * @return the canPublish value.
     */
    @Metadata(properties = { MetadataProperties.GENERATED })
    public Boolean isCanPublish() {
        return this.canPublish;
    }

    /**
     * Get the toast property: The toast property.
     * 
     * @return the toast value.
     */
    @Metadata(properties = { MetadataProperties.GENERATED })
    public String getToast() {
        return this.toast;
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
        jsonWriter.writeBooleanField("can_publish", this.canPublish);
        jsonWriter.writeStringField("toast", this.toast);
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
     * Reads an instance of MobileVideoPermissionData from the JsonReader.
     * 
     * @param jsonReader The JsonReader being read.
     * @return An instance of MobileVideoPermissionData if the JsonReader was pointing to an instance of it, or null if
     * it was pointing to JSON null.
     * @throws IOException If an error occurs while reading the MobileVideoPermissionData.
     */
    @Metadata(properties = { MetadataProperties.GENERATED })
    public static MobileVideoPermissionData fromJson(JsonReader jsonReader) throws IOException {
        return jsonReader.readObject(reader -> {
            MobileVideoPermissionData deserializedMobileVideoPermissionData = new MobileVideoPermissionData();
            Map<String, BinaryData> additionalProperties = null;
            while (reader.nextToken() != JsonToken.END_OBJECT) {
                String fieldName = reader.getFieldName();
                reader.nextToken();

                if ("can_publish".equals(fieldName)) {
                    deserializedMobileVideoPermissionData.canPublish = reader.getNullable(JsonReader::getBoolean);
                } else if ("toast".equals(fieldName)) {
                    deserializedMobileVideoPermissionData.toast = reader.getString();
                } else {
                    if (additionalProperties == null) {
                        additionalProperties = new LinkedHashMap<>();
                    }

                    additionalProperties.put(fieldName,
                        reader.getNullable(nonNullReader -> BinaryData.fromObject(nonNullReader.readUntyped())));
                }
            }
            deserializedMobileVideoPermissionData.additionalProperties = additionalProperties;

            return deserializedMobileVideoPermissionData;
        });
    }
}
