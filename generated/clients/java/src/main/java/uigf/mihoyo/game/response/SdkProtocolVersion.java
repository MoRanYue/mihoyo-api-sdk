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
 * The SdkProtocolVersion model.
 */
@Metadata(properties = { MetadataProperties.IMMUTABLE })
public final class SdkProtocolVersion implements JsonSerializable<SdkProtocolVersion> {
    /*
     * The app_id property.
     */
    @Metadata(properties = { MetadataProperties.GENERATED })
    private Integer appId;

    /*
     * The create_time property.
     */
    @Metadata(properties = { MetadataProperties.GENERATED })
    private String createTime;

    /*
     * The full_priv_proto property.
     */
    @Metadata(properties = { MetadataProperties.GENERATED })
    private String fullPrivProto;

    /*
     * The id property.
     */
    @Metadata(properties = { MetadataProperties.GENERATED })
    private Integer id;

    /*
     * The language property.
     */
    @Metadata(properties = { MetadataProperties.GENERATED })
    private String language;

    /*
     * The major property.
     */
    @Metadata(properties = { MetadataProperties.GENERATED })
    private Integer major;

    /*
     * The minimum property.
     */
    @Metadata(properties = { MetadataProperties.GENERATED })
    private Integer minimum;

    /*
     * The priv_proto property.
     */
    @Metadata(properties = { MetadataProperties.GENERATED })
    private String privProto;

    /*
     * The teenager_proto property.
     */
    @Metadata(properties = { MetadataProperties.GENERATED })
    private String teenagerProto;

    /*
     * The third_proto property.
     */
    @Metadata(properties = { MetadataProperties.GENERATED })
    private String thirdProto;

    /*
     * The user_proto property.
     */
    @Metadata(properties = { MetadataProperties.GENERATED })
    private String userProto;

    /*
     * Additional properties
     */
    @Metadata(properties = { MetadataProperties.GENERATED })
    private Map<String, BinaryData> additionalProperties;

    /**
     * Creates an instance of SdkProtocolVersion class.
     */
    @Metadata(properties = { MetadataProperties.GENERATED })
    private SdkProtocolVersion() {
    }

    /**
     * Get the appId property: The app_id property.
     * 
     * @return the appId value.
     */
    @Metadata(properties = { MetadataProperties.GENERATED })
    public Integer getAppId() {
        return this.appId;
    }

    /**
     * Get the createTime property: The create_time property.
     * 
     * @return the createTime value.
     */
    @Metadata(properties = { MetadataProperties.GENERATED })
    public String getCreateTime() {
        return this.createTime;
    }

    /**
     * Get the fullPrivProto property: The full_priv_proto property.
     * 
     * @return the fullPrivProto value.
     */
    @Metadata(properties = { MetadataProperties.GENERATED })
    public String getFullPrivProto() {
        return this.fullPrivProto;
    }

    /**
     * Get the id property: The id property.
     * 
     * @return the id value.
     */
    @Metadata(properties = { MetadataProperties.GENERATED })
    public Integer getId() {
        return this.id;
    }

    /**
     * Get the language property: The language property.
     * 
     * @return the language value.
     */
    @Metadata(properties = { MetadataProperties.GENERATED })
    public String getLanguage() {
        return this.language;
    }

    /**
     * Get the major property: The major property.
     * 
     * @return the major value.
     */
    @Metadata(properties = { MetadataProperties.GENERATED })
    public Integer getMajor() {
        return this.major;
    }

    /**
     * Get the minimum property: The minimum property.
     * 
     * @return the minimum value.
     */
    @Metadata(properties = { MetadataProperties.GENERATED })
    public Integer getMinimum() {
        return this.minimum;
    }

    /**
     * Get the privProto property: The priv_proto property.
     * 
     * @return the privProto value.
     */
    @Metadata(properties = { MetadataProperties.GENERATED })
    public String getPrivProto() {
        return this.privProto;
    }

    /**
     * Get the teenagerProto property: The teenager_proto property.
     * 
     * @return the teenagerProto value.
     */
    @Metadata(properties = { MetadataProperties.GENERATED })
    public String getTeenagerProto() {
        return this.teenagerProto;
    }

    /**
     * Get the thirdProto property: The third_proto property.
     * 
     * @return the thirdProto value.
     */
    @Metadata(properties = { MetadataProperties.GENERATED })
    public String getThirdProto() {
        return this.thirdProto;
    }

    /**
     * Get the userProto property: The user_proto property.
     * 
     * @return the userProto value.
     */
    @Metadata(properties = { MetadataProperties.GENERATED })
    public String getUserProto() {
        return this.userProto;
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
        jsonWriter.writeNumberField("app_id", this.appId);
        jsonWriter.writeStringField("create_time", this.createTime);
        jsonWriter.writeStringField("full_priv_proto", this.fullPrivProto);
        jsonWriter.writeNumberField("id", this.id);
        jsonWriter.writeStringField("language", this.language);
        jsonWriter.writeNumberField("major", this.major);
        jsonWriter.writeNumberField("minimum", this.minimum);
        jsonWriter.writeStringField("priv_proto", this.privProto);
        jsonWriter.writeStringField("teenager_proto", this.teenagerProto);
        jsonWriter.writeStringField("third_proto", this.thirdProto);
        jsonWriter.writeStringField("user_proto", this.userProto);
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
     * Reads an instance of SdkProtocolVersion from the JsonReader.
     * 
     * @param jsonReader The JsonReader being read.
     * @return An instance of SdkProtocolVersion if the JsonReader was pointing to an instance of it, or null if it was
     * pointing to JSON null.
     * @throws IOException If an error occurs while reading the SdkProtocolVersion.
     */
    @Metadata(properties = { MetadataProperties.GENERATED })
    public static SdkProtocolVersion fromJson(JsonReader jsonReader) throws IOException {
        return jsonReader.readObject(reader -> {
            SdkProtocolVersion deserializedSdkProtocolVersion = new SdkProtocolVersion();
            Map<String, BinaryData> additionalProperties = null;
            while (reader.nextToken() != JsonToken.END_OBJECT) {
                String fieldName = reader.getFieldName();
                reader.nextToken();

                if ("app_id".equals(fieldName)) {
                    deserializedSdkProtocolVersion.appId = reader.getNullable(JsonReader::getInt);
                } else if ("create_time".equals(fieldName)) {
                    deserializedSdkProtocolVersion.createTime = reader.getString();
                } else if ("full_priv_proto".equals(fieldName)) {
                    deserializedSdkProtocolVersion.fullPrivProto = reader.getString();
                } else if ("id".equals(fieldName)) {
                    deserializedSdkProtocolVersion.id = reader.getNullable(JsonReader::getInt);
                } else if ("language".equals(fieldName)) {
                    deserializedSdkProtocolVersion.language = reader.getString();
                } else if ("major".equals(fieldName)) {
                    deserializedSdkProtocolVersion.major = reader.getNullable(JsonReader::getInt);
                } else if ("minimum".equals(fieldName)) {
                    deserializedSdkProtocolVersion.minimum = reader.getNullable(JsonReader::getInt);
                } else if ("priv_proto".equals(fieldName)) {
                    deserializedSdkProtocolVersion.privProto = reader.getString();
                } else if ("teenager_proto".equals(fieldName)) {
                    deserializedSdkProtocolVersion.teenagerProto = reader.getString();
                } else if ("third_proto".equals(fieldName)) {
                    deserializedSdkProtocolVersion.thirdProto = reader.getString();
                } else if ("user_proto".equals(fieldName)) {
                    deserializedSdkProtocolVersion.userProto = reader.getString();
                } else {
                    if (additionalProperties == null) {
                        additionalProperties = new LinkedHashMap<>();
                    }

                    additionalProperties.put(fieldName,
                        reader.getNullable(nonNullReader -> BinaryData.fromObject(nonNullReader.readUntyped())));
                }
            }
            deserializedSdkProtocolVersion.additionalProperties = additionalProperties;

            return deserializedSdkProtocolVersion;
        });
    }
}
