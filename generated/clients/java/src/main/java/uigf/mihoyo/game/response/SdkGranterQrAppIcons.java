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
 * The SdkGranterQrAppIcons model.
 */
@Metadata(properties = { MetadataProperties.IMMUTABLE })
public final class SdkGranterQrAppIcons implements JsonSerializable<SdkGranterQrAppIcons> {
    /*
     * The app property.
     */
    @Metadata(properties = { MetadataProperties.GENERATED })
    private String app;

    /*
     * The bbs property.
     */
    @Metadata(properties = { MetadataProperties.GENERATED })
    private String bbs;

    /*
     * The cloud property.
     */
    @Metadata(properties = { MetadataProperties.GENERATED })
    private String cloud;

    /*
     * Additional properties
     */
    @Metadata(properties = { MetadataProperties.GENERATED })
    private Map<String, BinaryData> additionalProperties;

    /**
     * Creates an instance of SdkGranterQrAppIcons class.
     */
    @Metadata(properties = { MetadataProperties.GENERATED })
    private SdkGranterQrAppIcons() {
    }

    /**
     * Get the app property: The app property.
     * 
     * @return the app value.
     */
    @Metadata(properties = { MetadataProperties.GENERATED })
    public String getApp() {
        return this.app;
    }

    /**
     * Get the bbs property: The bbs property.
     * 
     * @return the bbs value.
     */
    @Metadata(properties = { MetadataProperties.GENERATED })
    public String getBbs() {
        return this.bbs;
    }

    /**
     * Get the cloud property: The cloud property.
     * 
     * @return the cloud value.
     */
    @Metadata(properties = { MetadataProperties.GENERATED })
    public String getCloud() {
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
        jsonWriter.writeStringField("app", this.app);
        jsonWriter.writeStringField("bbs", this.bbs);
        jsonWriter.writeStringField("cloud", this.cloud);
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
     * Reads an instance of SdkGranterQrAppIcons from the JsonReader.
     * 
     * @param jsonReader The JsonReader being read.
     * @return An instance of SdkGranterQrAppIcons if the JsonReader was pointing to an instance of it, or null if it
     * was pointing to JSON null.
     * @throws IOException If an error occurs while reading the SdkGranterQrAppIcons.
     */
    @Metadata(properties = { MetadataProperties.GENERATED })
    public static SdkGranterQrAppIcons fromJson(JsonReader jsonReader) throws IOException {
        return jsonReader.readObject(reader -> {
            SdkGranterQrAppIcons deserializedSdkGranterQrAppIcons = new SdkGranterQrAppIcons();
            Map<String, BinaryData> additionalProperties = null;
            while (reader.nextToken() != JsonToken.END_OBJECT) {
                String fieldName = reader.getFieldName();
                reader.nextToken();

                if ("app".equals(fieldName)) {
                    deserializedSdkGranterQrAppIcons.app = reader.getString();
                } else if ("bbs".equals(fieldName)) {
                    deserializedSdkGranterQrAppIcons.bbs = reader.getString();
                } else if ("cloud".equals(fieldName)) {
                    deserializedSdkGranterQrAppIcons.cloud = reader.getString();
                } else {
                    if (additionalProperties == null) {
                        additionalProperties = new LinkedHashMap<>();
                    }

                    additionalProperties.put(fieldName,
                        reader.getNullable(nonNullReader -> BinaryData.fromObject(nonNullReader.readUntyped())));
                }
            }
            deserializedSdkGranterQrAppIcons.additionalProperties = additionalProperties;

            return deserializedSdkGranterQrAppIcons;
        });
    }
}
