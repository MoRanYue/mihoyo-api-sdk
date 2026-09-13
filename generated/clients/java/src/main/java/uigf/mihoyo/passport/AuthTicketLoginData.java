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
 * The AuthTicketLoginData model.
 */
@Metadata(properties = { MetadataProperties.IMMUTABLE })
public final class AuthTicketLoginData implements JsonSerializable<AuthTicketLoginData> {
    /*
     * The login_ticket property.
     */
    @Metadata(properties = { MetadataProperties.GENERATED })
    private String loginTicket;

    /*
     * The need_realperson property.
     */
    @Metadata(properties = { MetadataProperties.GENERATED })
    private Boolean needRealperson;

    /*
     * The oauth_hw_open_id property.
     */
    @Metadata(properties = { MetadataProperties.GENERATED })
    private String oauthHwOpenId;

    /*
     * The reactivate_info property.
     */
    @Metadata(properties = { MetadataProperties.GENERATED })
    private ReactivateInfo reactivateInfo;

    /*
     * The realname_info property.
     */
    @Metadata(properties = { MetadataProperties.GENERATED })
    private RealnameInfo realnameInfo;

    /*
     * The token property.
     */
    @Metadata(properties = { MetadataProperties.GENERATED })
    private LoginToken token;

    /*
     * The user_info property.
     */
    @Metadata(properties = { MetadataProperties.GENERATED })
    private LoginUserInfo userInfo;

    /*
     * Additional properties
     */
    @Metadata(properties = { MetadataProperties.GENERATED })
    private Map<String, BinaryData> additionalProperties;

    /**
     * Creates an instance of AuthTicketLoginData class.
     */
    @Metadata(properties = { MetadataProperties.GENERATED })
    private AuthTicketLoginData() {
    }

    /**
     * Get the loginTicket property: The login_ticket property.
     * 
     * @return the loginTicket value.
     */
    @Metadata(properties = { MetadataProperties.GENERATED })
    public String getLoginTicket() {
        return this.loginTicket;
    }

    /**
     * Get the needRealperson property: The need_realperson property.
     * 
     * @return the needRealperson value.
     */
    @Metadata(properties = { MetadataProperties.GENERATED })
    public Boolean isNeedRealperson() {
        return this.needRealperson;
    }

    /**
     * Get the oauthHwOpenId property: The oauth_hw_open_id property.
     * 
     * @return the oauthHwOpenId value.
     */
    @Metadata(properties = { MetadataProperties.GENERATED })
    public String getOauthHwOpenId() {
        return this.oauthHwOpenId;
    }

    /**
     * Get the reactivateInfo property: The reactivate_info property.
     * 
     * @return the reactivateInfo value.
     */
    @Metadata(properties = { MetadataProperties.GENERATED })
    public ReactivateInfo getReactivateInfo() {
        return this.reactivateInfo;
    }

    /**
     * Get the realnameInfo property: The realname_info property.
     * 
     * @return the realnameInfo value.
     */
    @Metadata(properties = { MetadataProperties.GENERATED })
    public RealnameInfo getRealnameInfo() {
        return this.realnameInfo;
    }

    /**
     * Get the token property: The token property.
     * 
     * @return the token value.
     */
    @Metadata(properties = { MetadataProperties.GENERATED })
    public LoginToken getToken() {
        return this.token;
    }

    /**
     * Get the userInfo property: The user_info property.
     * 
     * @return the userInfo value.
     */
    @Metadata(properties = { MetadataProperties.GENERATED })
    public LoginUserInfo getUserInfo() {
        return this.userInfo;
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
        jsonWriter.writeStringField("login_ticket", this.loginTicket);
        jsonWriter.writeBooleanField("need_realperson", this.needRealperson);
        jsonWriter.writeStringField("oauth_hw_open_id", this.oauthHwOpenId);
        jsonWriter.writeJsonField("reactivate_info", this.reactivateInfo);
        jsonWriter.writeJsonField("realname_info", this.realnameInfo);
        jsonWriter.writeJsonField("token", this.token);
        jsonWriter.writeJsonField("user_info", this.userInfo);
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
     * Reads an instance of AuthTicketLoginData from the JsonReader.
     * 
     * @param jsonReader The JsonReader being read.
     * @return An instance of AuthTicketLoginData if the JsonReader was pointing to an instance of it, or null if it was
     * pointing to JSON null.
     * @throws IOException If an error occurs while reading the AuthTicketLoginData.
     */
    @Metadata(properties = { MetadataProperties.GENERATED })
    public static AuthTicketLoginData fromJson(JsonReader jsonReader) throws IOException {
        return jsonReader.readObject(reader -> {
            AuthTicketLoginData deserializedAuthTicketLoginData = new AuthTicketLoginData();
            Map<String, BinaryData> additionalProperties = null;
            while (reader.nextToken() != JsonToken.END_OBJECT) {
                String fieldName = reader.getFieldName();
                reader.nextToken();

                if ("login_ticket".equals(fieldName)) {
                    deserializedAuthTicketLoginData.loginTicket = reader.getString();
                } else if ("need_realperson".equals(fieldName)) {
                    deserializedAuthTicketLoginData.needRealperson = reader.getNullable(JsonReader::getBoolean);
                } else if ("oauth_hw_open_id".equals(fieldName)) {
                    deserializedAuthTicketLoginData.oauthHwOpenId = reader.getString();
                } else if ("reactivate_info".equals(fieldName)) {
                    deserializedAuthTicketLoginData.reactivateInfo = ReactivateInfo.fromJson(reader);
                } else if ("realname_info".equals(fieldName)) {
                    deserializedAuthTicketLoginData.realnameInfo = RealnameInfo.fromJson(reader);
                } else if ("token".equals(fieldName)) {
                    deserializedAuthTicketLoginData.token = LoginToken.fromJson(reader);
                } else if ("user_info".equals(fieldName)) {
                    deserializedAuthTicketLoginData.userInfo = LoginUserInfo.fromJson(reader);
                } else {
                    if (additionalProperties == null) {
                        additionalProperties = new LinkedHashMap<>();
                    }

                    additionalProperties.put(fieldName,
                        reader.getNullable(nonNullReader -> BinaryData.fromObject(nonNullReader.readUntyped())));
                }
            }
            deserializedAuthTicketLoginData.additionalProperties = additionalProperties;

            return deserializedAuthTicketLoginData;
        });
    }
}
