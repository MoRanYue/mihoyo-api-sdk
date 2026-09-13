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
import java.util.Map;

/**
 * The SdkGranterQrEnabledApps model.
 */
@Metadata(properties = { MetadataProperties.IMMUTABLE })
public final class SdkGranterQrEnabledApps implements JsonSerializable<SdkGranterQrEnabledApps> {
    /*
     * The bbs property.
     */
    @Metadata(properties = { MetadataProperties.GENERATED })
    private Boolean bbs;

    /*
     * The cloud property.
     */
    @Metadata(properties = { MetadataProperties.GENERATED })
    private Boolean cloud;

    /*
     * Additional properties
     */
    @Metadata(properties = { MetadataProperties.GENERATED })
    private Map<String, BinaryData> additionalProperties;

    /**
     * Creates an instance of SdkGranterQrEnabledApps class.
     */
    @Metadata(properties = { MetadataProperties.GENERATED })
    private SdkGranterQrEnabledApps() {
    }

    /**
     * Get the bbs property: The bbs property.
     * 
     * @return the bbs value.
     */
    @Metadata(properties = { MetadataProperties.GENERATED })
    public Boolean isBbs() {
        return this.bbs;
    }

    /**
     * Get the cloud property: The cloud property.
     * 
     * @return the cloud value.
     */
    @Metadata(properties = { MetadataProperties.GENERATED })
    public Boolean isCloud() {
        return this.cloud;
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
        jsonWriter.writeBooleanField("bbs", this.bbs);
        jsonWriter.writeBooleanField("cloud", this.cloud);
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
     * Reads an instance of SdkGranterQrEnabledApps from the JsonReader.
     * 
     * @param jsonReader The JsonReader being read.
     * @return An instance of SdkGranterQrEnabledApps if the JsonReader was pointing to an instance of it, or null if it
     * was pointing to JSON null.
     * @throws IOException If an error occurs while reading the SdkGranterQrEnabledApps.
     */
    @Metadata(properties = { MetadataProperties.GENERATED })
    public static SdkGranterQrEnabledApps fromJson(JsonReader jsonReader) throws IOException {
        return jsonReader.readObject(reader -> {
            SdkGranterQrEnabledApps deserializedSdkGranterQrEnabledApps = new SdkGranterQrEnabledApps();
            Map<String, BinaryData> additionalProperties = null;
            while (reader.nextToken() != JsonToken.END_OBJECT) {
                String fieldName = reader.getFieldName();
                reader.nextToken();

                if ("bbs".equals(fieldName)) {
                    deserializedSdkGranterQrEnabledApps.bbs = reader.getNullable(JsonReader::getBoolean);
                } else if ("cloud".equals(fieldName)) {
                    deserializedSdkGranterQrEnabledApps.cloud = reader.getNullable(JsonReader::getBoolean);
                } else {
                    if (additionalProperties == null) {
                        additionalProperties = new LinkedHashMap<>();
                    }

                    additionalProperties.put(fieldName,
                        reader.getNullable(nonNullReader -> BinaryData.fromObject(nonNullReader.readUntyped())));
                }
            }
            deserializedSdkGranterQrEnabledApps.additionalProperties = additionalProperties;

            return deserializedSdkGranterQrEnabledApps;
        });
    }
}
