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
import java.util.List;
import java.util.Map;

/**
 * The MobilePreloadConfigRequest model.
 */
@Metadata(properties = { MetadataProperties.FLUENT })
public final class MobilePreloadConfigRequest implements JsonSerializable<MobilePreloadConfigRequest> {
    /*
     * The client_version property.
     */
    @Metadata(properties = { MetadataProperties.GENERATED })
    private final String clientVersion;

    /*
     * The platform property.
     */
    @Metadata(properties = { MetadataProperties.GENERATED })
    private final String platform;

    /*
     * The rn_app property.
     */
    @Metadata(properties = { MetadataProperties.GENERATED })
    private final String rnApp;

    /*
     * The rn_infos property.
     */
    @Metadata(properties = { MetadataProperties.GENERATED })
    private final List<MobilePreloadResourceInfo> rnInfos;

    /*
     * Additional properties
     */
    @Metadata(properties = { MetadataProperties.GENERATED })
    private Map<String, BinaryData> additionalProperties;

    /**
     * Creates an instance of MobilePreloadConfigRequest class.
     * 
     * @param clientVersion the clientVersion value to set.
     * @param platform the platform value to set.
     * @param rnApp the rnApp value to set.
     * @param rnInfos the rnInfos value to set.
     */
    @Metadata(properties = { MetadataProperties.GENERATED })
    public MobilePreloadConfigRequest(String clientVersion, String platform, String rnApp,
        List<MobilePreloadResourceInfo> rnInfos) {
        this.clientVersion = clientVersion;
        this.platform = platform;
        this.rnApp = rnApp;
        this.rnInfos = rnInfos;
    }

    /**
     * Get the clientVersion property: The client_version property.
     * 
     * @return the clientVersion value.
     */
    @Metadata(properties = { MetadataProperties.GENERATED })
    public String getClientVersion() {
        return this.clientVersion;
    }

    /**
     * Get the platform property: The platform property.
     * 
     * @return the platform value.
     */
    @Metadata(properties = { MetadataProperties.GENERATED })
    public String getPlatform() {
        return this.platform;
    }

    /**
     * Get the rnApp property: The rn_app property.
     * 
     * @return the rnApp value.
     */
    @Metadata(properties = { MetadataProperties.GENERATED })
    public String getRnApp() {
        return this.rnApp;
    }

    /**
     * Get the rnInfos property: The rn_infos property.
     * 
     * @return the rnInfos value.
     */
    @Metadata(properties = { MetadataProperties.GENERATED })
    public List<MobilePreloadResourceInfo> getRnInfos() {
        return this.rnInfos;
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
     * @return the MobilePreloadConfigRequest object itself.
     */
    @Metadata(properties = { MetadataProperties.GENERATED })
    public MobilePreloadConfigRequest setAdditionalProperties(Map<String, BinaryData> additionalProperties) {
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
        jsonWriter.writeStringField("client_version", this.clientVersion);
        jsonWriter.writeStringField("platform", this.platform);
        jsonWriter.writeStringField("rn_app", this.rnApp);
        jsonWriter.writeArrayField("rn_infos", this.rnInfos, (writer, element) -> writer.writeJson(element));
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
     * Reads an instance of MobilePreloadConfigRequest from the JsonReader.
     * 
     * @param jsonReader The JsonReader being read.
     * @return An instance of MobilePreloadConfigRequest if the JsonReader was pointing to an instance of it, or null if
     * it was pointing to JSON null.
     * @throws IllegalStateException If the deserialized JSON object was missing any required properties.
     * @throws IOException If an error occurs while reading the MobilePreloadConfigRequest.
     */
    @Metadata(properties = { MetadataProperties.GENERATED })
    public static MobilePreloadConfigRequest fromJson(JsonReader jsonReader) throws IOException {
        return jsonReader.readObject(reader -> {
            String clientVersion = null;
            String platform = null;
            String rnApp = null;
            List<MobilePreloadResourceInfo> rnInfos = null;
            Map<String, BinaryData> additionalProperties = null;
            while (reader.nextToken() != JsonToken.END_OBJECT) {
                String fieldName = reader.getFieldName();
                reader.nextToken();

                if ("client_version".equals(fieldName)) {
                    clientVersion = reader.getString();
                } else if ("platform".equals(fieldName)) {
                    platform = reader.getString();
                } else if ("rn_app".equals(fieldName)) {
                    rnApp = reader.getString();
                } else if ("rn_infos".equals(fieldName)) {
                    rnInfos = reader.readArray(reader1 -> MobilePreloadResourceInfo.fromJson(reader1));
                } else {
                    if (additionalProperties == null) {
                        additionalProperties = new LinkedHashMap<>();
                    }

                    additionalProperties.put(fieldName,
                        reader.getNullable(nonNullReader -> BinaryData.fromObject(nonNullReader.readUntyped())));
                }
            }
            MobilePreloadConfigRequest deserializedMobilePreloadConfigRequest
                = new MobilePreloadConfigRequest(clientVersion, platform, rnApp, rnInfos);
            deserializedMobilePreloadConfigRequest.additionalProperties = additionalProperties;

            return deserializedMobilePreloadConfigRequest;
        });
    }
}
