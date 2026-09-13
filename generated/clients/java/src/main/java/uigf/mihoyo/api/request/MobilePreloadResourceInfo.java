package uigf.mihoyo.api.request;

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
 * The MobilePreloadResourceInfo model.
 */
@Metadata(properties = { MetadataProperties.FLUENT })
public final class MobilePreloadResourceInfo implements JsonSerializable<MobilePreloadResourceInfo> {
    /*
     * The module_name property.
     */
    @Metadata(properties = { MetadataProperties.GENERATED })
    private final String moduleName;

    /*
     * The resource_url property.
     */
    @Metadata(properties = { MetadataProperties.GENERATED })
    private final String resourceUrl;

    /*
     * The rn_version property.
     */
    @Metadata(properties = { MetadataProperties.GENERATED })
    private final String rnVersion;

    /*
     * The sha1 property.
     */
    @Metadata(properties = { MetadataProperties.GENERATED })
    private final String sha1;

    /*
     * Additional properties
     */
    @Metadata(properties = { MetadataProperties.GENERATED })
    private Map<String, BinaryData> additionalProperties;

    /**
     * Creates an instance of MobilePreloadResourceInfo class.
     * 
     * @param moduleName the moduleName value to set.
     * @param resourceUrl the resourceUrl value to set.
     * @param rnVersion the rnVersion value to set.
     * @param sha1 the sha1 value to set.
     */
    @Metadata(properties = { MetadataProperties.GENERATED })
    public MobilePreloadResourceInfo(String moduleName, String resourceUrl, String rnVersion, String sha1) {
        this.moduleName = moduleName;
        this.resourceUrl = resourceUrl;
        this.rnVersion = rnVersion;
        this.sha1 = sha1;
    }

    /**
     * Get the moduleName property: The module_name property.
     * 
     * @return the moduleName value.
     */
    @Metadata(properties = { MetadataProperties.GENERATED })
    public String getModuleName() {
        return this.moduleName;
    }

    /**
     * Get the resourceUrl property: The resource_url property.
     * 
     * @return the resourceUrl value.
     */
    @Metadata(properties = { MetadataProperties.GENERATED })
    public String getResourceUrl() {
        return this.resourceUrl;
    }

    /**
     * Get the rnVersion property: The rn_version property.
     * 
     * @return the rnVersion value.
     */
    @Metadata(properties = { MetadataProperties.GENERATED })
    public String getRnVersion() {
        return this.rnVersion;
    }

    /**
     * Get the sha1 property: The sha1 property.
     * 
     * @return the sha1 value.
     */
    @Metadata(properties = { MetadataProperties.GENERATED })
    public String getSha1() {
        return this.sha1;
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
     * Set the additionalProperties property: Additional properties.
     * 
     * @param additionalProperties the additionalProperties value to set.
     * @return the MobilePreloadResourceInfo object itself.
     */
    @Metadata(properties = { MetadataProperties.GENERATED })
    public MobilePreloadResourceInfo setAdditionalProperties(Map<String, BinaryData> additionalProperties) {
        this.additionalProperties = additionalProperties;
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Metadata(properties = { MetadataProperties.GENERATED })
    @Override
    public JsonWriter toJson(JsonWriter jsonWriter) throws IOException {
        jsonWriter.writeStartObject();
        jsonWriter.writeStringField("module_name", this.moduleName);
        jsonWriter.writeStringField("resource_url", this.resourceUrl);
        jsonWriter.writeStringField("rn_version", this.rnVersion);
        jsonWriter.writeStringField("sha1", this.sha1);
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
     * Reads an instance of MobilePreloadResourceInfo from the JsonReader.
     * 
     * @param jsonReader The JsonReader being read.
     * @return An instance of MobilePreloadResourceInfo if the JsonReader was pointing to an instance of it, or null if
     * it was pointing to JSON null.
     * @throws IllegalStateException If the deserialized JSON object was missing any required properties.
     * @throws IOException If an error occurs while reading the MobilePreloadResourceInfo.
     */
    @Metadata(properties = { MetadataProperties.GENERATED })
    public static MobilePreloadResourceInfo fromJson(JsonReader jsonReader) throws IOException {
        return jsonReader.readObject(reader -> {
            String moduleName = null;
            String resourceUrl = null;
            String rnVersion = null;
            String sha1 = null;
            Map<String, BinaryData> additionalProperties = null;
            while (reader.nextToken() != JsonToken.END_OBJECT) {
                String fieldName = reader.getFieldName();
                reader.nextToken();

                if ("module_name".equals(fieldName)) {
                    moduleName = reader.getString();
                } else if ("resource_url".equals(fieldName)) {
                    resourceUrl = reader.getString();
                } else if ("rn_version".equals(fieldName)) {
                    rnVersion = reader.getString();
                } else if ("sha1".equals(fieldName)) {
                    sha1 = reader.getString();
                } else {
                    if (additionalProperties == null) {
                        additionalProperties = new LinkedHashMap<>();
                    }

                    additionalProperties.put(fieldName,
                        reader.getNullable(nonNullReader -> BinaryData.fromObject(nonNullReader.readUntyped())));
                }
            }
            MobilePreloadResourceInfo deserializedMobilePreloadResourceInfo
                = new MobilePreloadResourceInfo(moduleName, resourceUrl, rnVersion, sha1);
            deserializedMobilePreloadResourceInfo.additionalProperties = additionalProperties;

            return deserializedMobilePreloadResourceInfo;
        });
    }
}
