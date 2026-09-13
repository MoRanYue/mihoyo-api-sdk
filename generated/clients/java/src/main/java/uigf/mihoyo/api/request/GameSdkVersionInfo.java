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
 * The GameSdkVersionInfo model.
 */
@Metadata(properties = { MetadataProperties.FLUENT })
public final class GameSdkVersionInfo implements JsonSerializable<GameSdkVersionInfo> {
    /*
     * The client_version property.
     */
    @Metadata(properties = { MetadataProperties.GENERATED })
    private String clientVersion;

    /*
     * The log_version property.
     */
    @Metadata(properties = { MetadataProperties.GENERATED })
    private String logVersion;

    /*
     * The sdk_env property.
     */
    @Metadata(properties = { MetadataProperties.GENERATED })
    private Integer sdkEnv;

    /*
     * The sdk_version property.
     */
    @Metadata(properties = { MetadataProperties.GENERATED })
    private String sdkVersion;

    /*
     * Additional properties
     */
    @Metadata(properties = { MetadataProperties.GENERATED })
    private Map<String, BinaryData> additionalProperties;

    /**
     * Creates an instance of GameSdkVersionInfo class.
     */
    @Metadata(properties = { MetadataProperties.GENERATED })
    public GameSdkVersionInfo() {
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
     * Set the clientVersion property: The client_version property.
     * 
     * @param clientVersion the clientVersion value to set.
     * @return the GameSdkVersionInfo object itself.
     */
    @Metadata(properties = { MetadataProperties.GENERATED })
    public GameSdkVersionInfo setClientVersion(String clientVersion) {
        this.clientVersion = clientVersion;
        return this;
    }

    /**
     * Get the logVersion property: The log_version property.
     * 
     * @return the logVersion value.
     */
    @Metadata(properties = { MetadataProperties.GENERATED })
    public String getLogVersion() {
        return this.logVersion;
    }

    /**
     * Set the logVersion property: The log_version property.
     * 
     * @param logVersion the logVersion value to set.
     * @return the GameSdkVersionInfo object itself.
     */
    @Metadata(properties = { MetadataProperties.GENERATED })
    public GameSdkVersionInfo setLogVersion(String logVersion) {
        this.logVersion = logVersion;
        return this;
    }

    /**
     * Get the sdkEnv property: The sdk_env property.
     * 
     * @return the sdkEnv value.
     */
    @Metadata(properties = { MetadataProperties.GENERATED })
    public Integer getSdkEnv() {
        return this.sdkEnv;
    }

    /**
     * Set the sdkEnv property: The sdk_env property.
     * 
     * @param sdkEnv the sdkEnv value to set.
     * @return the GameSdkVersionInfo object itself.
     */
    @Metadata(properties = { MetadataProperties.GENERATED })
    public GameSdkVersionInfo setSdkEnv(Integer sdkEnv) {
        this.sdkEnv = sdkEnv;
        return this;
    }

    /**
     * Get the sdkVersion property: The sdk_version property.
     * 
     * @return the sdkVersion value.
     */
    @Metadata(properties = { MetadataProperties.GENERATED })
    public String getSdkVersion() {
        return this.sdkVersion;
    }

    /**
     * Set the sdkVersion property: The sdk_version property.
     * 
     * @param sdkVersion the sdkVersion value to set.
     * @return the GameSdkVersionInfo object itself.
     */
    @Metadata(properties = { MetadataProperties.GENERATED })
    public GameSdkVersionInfo setSdkVersion(String sdkVersion) {
        this.sdkVersion = sdkVersion;
        return this;
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
     * @return the GameSdkVersionInfo object itself.
     */
    @Metadata(properties = { MetadataProperties.GENERATED })
    public GameSdkVersionInfo setAdditionalProperties(Map<String, BinaryData> additionalProperties) {
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
        jsonWriter.writeStringField("log_version", this.logVersion);
        jsonWriter.writeNumberField("sdk_env", this.sdkEnv);
        jsonWriter.writeStringField("sdk_version", this.sdkVersion);
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
     * Reads an instance of GameSdkVersionInfo from the JsonReader.
     * 
     * @param jsonReader The JsonReader being read.
     * @return An instance of GameSdkVersionInfo if the JsonReader was pointing to an instance of it, or null if it was
     * pointing to JSON null.
     * @throws IOException If an error occurs while reading the GameSdkVersionInfo.
     */
    @Metadata(properties = { MetadataProperties.GENERATED })
    public static GameSdkVersionInfo fromJson(JsonReader jsonReader) throws IOException {
        return jsonReader.readObject(reader -> {
            GameSdkVersionInfo deserializedGameSdkVersionInfo = new GameSdkVersionInfo();
            Map<String, BinaryData> additionalProperties = null;
            while (reader.nextToken() != JsonToken.END_OBJECT) {
                String fieldName = reader.getFieldName();
                reader.nextToken();

                if ("client_version".equals(fieldName)) {
                    deserializedGameSdkVersionInfo.clientVersion = reader.getString();
                } else if ("log_version".equals(fieldName)) {
                    deserializedGameSdkVersionInfo.logVersion = reader.getString();
                } else if ("sdk_env".equals(fieldName)) {
                    deserializedGameSdkVersionInfo.sdkEnv = reader.getNullable(JsonReader::getInt);
                } else if ("sdk_version".equals(fieldName)) {
                    deserializedGameSdkVersionInfo.sdkVersion = reader.getString();
                } else {
                    if (additionalProperties == null) {
                        additionalProperties = new LinkedHashMap<>();
                    }

                    additionalProperties.put(fieldName,
                        reader.getNullable(nonNullReader -> BinaryData.fromObject(nonNullReader.readUntyped())));
                }
            }
            deserializedGameSdkVersionInfo.additionalProperties = additionalProperties;

            return deserializedGameSdkVersionInfo;
        });
    }
}
