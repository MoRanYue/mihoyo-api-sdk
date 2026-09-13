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
import java.util.List;
import java.util.Map;

/**
 * The LoginUserInfo model.
 */
@Metadata(properties = { MetadataProperties.IMMUTABLE })
public final class LoginUserInfo implements JsonSerializable<LoginUserInfo> {
    /*
     * The account_name property.
     */
    @Metadata(properties = { MetadataProperties.GENERATED })
    private String accountName;

    /*
     * The aid property.
     */
    @Metadata(properties = { MetadataProperties.GENERATED })
    private String aid;

    /*
     * The area_code property.
     */
    @Metadata(properties = { MetadataProperties.GENERATED })
    private String areaCode;

    /*
     * The country property.
     */
    @Metadata(properties = { MetadataProperties.GENERATED })
    private String country;

    /*
     * The email property.
     */
    @Metadata(properties = { MetadataProperties.GENERATED })
    private String email;

    /*
     * The identity_code property.
     */
    @Metadata(properties = { MetadataProperties.GENERATED })
    private String identityCode;

    /*
     * The is_adult property.
     */
    @Metadata(properties = { MetadataProperties.GENERATED })
    private Integer isAdult;

    /*
     * The is_email_verify property.
     */
    @Metadata(properties = { MetadataProperties.GENERATED })
    private Integer isEmailVerify;

    /*
     * The links property.
     */
    @Metadata(properties = { MetadataProperties.GENERATED })
    private List<BinaryData> links;

    /*
     * The mid property.
     */
    @Metadata(properties = { MetadataProperties.GENERATED })
    private String mid;

    /*
     * The mobile property.
     */
    @Metadata(properties = { MetadataProperties.GENERATED })
    private String mobile;

    /*
     * The password_time property.
     */
    @Metadata(properties = { MetadataProperties.GENERATED })
    private String passwordTime;

    /*
     * The realname property.
     */
    @Metadata(properties = { MetadataProperties.GENERATED })
    private String realname;

    /*
     * The rebind_area_code property.
     */
    @Metadata(properties = { MetadataProperties.GENERATED })
    private String rebindAreaCode;

    /*
     * The rebind_mobile property.
     */
    @Metadata(properties = { MetadataProperties.GENERATED })
    private String rebindMobile;

    /*
     * The rebind_mobile_time property.
     */
    @Metadata(properties = { MetadataProperties.GENERATED })
    private String rebindMobileTime;

    /*
     * The safe_area_code property.
     */
    @Metadata(properties = { MetadataProperties.GENERATED })
    private String safeAreaCode;

    /*
     * The safe_mobile property.
     */
    @Metadata(properties = { MetadataProperties.GENERATED })
    private String safeMobile;

    /*
     * The unmasked_email property.
     */
    @Metadata(properties = { MetadataProperties.GENERATED })
    private String unmaskedEmail;

    /*
     * The unmasked_email_type property.
     */
    @Metadata(properties = { MetadataProperties.GENERATED })
    private Integer unmaskedEmailType;

    /*
     * Additional properties
     */
    @Metadata(properties = { MetadataProperties.GENERATED })
    private Map<String, BinaryData> additionalProperties;

    /**
     * Creates an instance of LoginUserInfo class.
     */
    @Metadata(properties = { MetadataProperties.GENERATED })
    private LoginUserInfo() {
    }

    /**
     * Get the accountName property: The account_name property.
     * 
     * @return the accountName value.
     */
    @Metadata(properties = { MetadataProperties.GENERATED })
    public String getAccountName() {
        return this.accountName;
    }

    /**
     * Get the aid property: The aid property.
     * 
     * @return the aid value.
     */
    @Metadata(properties = { MetadataProperties.GENERATED })
    public String getAid() {
        return this.aid;
    }

    /**
     * Get the areaCode property: The area_code property.
     * 
     * @return the areaCode value.
     */
    @Metadata(properties = { MetadataProperties.GENERATED })
    public String getAreaCode() {
        return this.areaCode;
    }

    /**
     * Get the country property: The country property.
     * 
     * @return the country value.
     */
    @Metadata(properties = { MetadataProperties.GENERATED })
    public String getCountry() {
        return this.country;
    }

    /**
     * Get the email property: The email property.
     * 
     * @return the email value.
     */
    @Metadata(properties = { MetadataProperties.GENERATED })
    public String getEmail() {
        return this.email;
    }

    /**
     * Get the identityCode property: The identity_code property.
     * 
     * @return the identityCode value.
     */
    @Metadata(properties = { MetadataProperties.GENERATED })
    public String getIdentityCode() {
        return this.identityCode;
    }

    /**
     * Get the isAdult property: The is_adult property.
     * 
     * @return the isAdult value.
     */
    @Metadata(properties = { MetadataProperties.GENERATED })
    public Integer getIsAdult() {
        return this.isAdult;
    }

    /**
     * Get the isEmailVerify property: The is_email_verify property.
     * 
     * @return the isEmailVerify value.
     */
    @Metadata(properties = { MetadataProperties.GENERATED })
    public Integer getIsEmailVerify() {
        return this.isEmailVerify;
    }

    /**
     * Get the links property: The links property.
     * 
     * @return the links value.
     */
    @Metadata(properties = { MetadataProperties.GENERATED })
    public List<BinaryData> getLinks() {
        return this.links;
    }

    /**
     * Get the mid property: The mid property.
     * 
     * @return the mid value.
     */
    @Metadata(properties = { MetadataProperties.GENERATED })
    public String getMid() {
        return this.mid;
    }

    /**
     * Get the mobile property: The mobile property.
     * 
     * @return the mobile value.
     */
    @Metadata(properties = { MetadataProperties.GENERATED })
    public String getMobile() {
        return this.mobile;
    }

    /**
     * Get the passwordTime property: The password_time property.
     * 
     * @return the passwordTime value.
     */
    @Metadata(properties = { MetadataProperties.GENERATED })
    public String getPasswordTime() {
        return this.passwordTime;
    }

    /**
     * Get the realname property: The realname property.
     * 
     * @return the realname value.
     */
    @Metadata(properties = { MetadataProperties.GENERATED })
    public String getRealname() {
        return this.realname;
    }

    /**
     * Get the rebindAreaCode property: The rebind_area_code property.
     * 
     * @return the rebindAreaCode value.
     */
    @Metadata(properties = { MetadataProperties.GENERATED })
    public String getRebindAreaCode() {
        return this.rebindAreaCode;
    }

    /**
     * Get the rebindMobile property: The rebind_mobile property.
     * 
     * @return the rebindMobile value.
     */
    @Metadata(properties = { MetadataProperties.GENERATED })
    public String getRebindMobile() {
        return this.rebindMobile;
    }

    /**
     * Get the rebindMobileTime property: The rebind_mobile_time property.
     * 
     * @return the rebindMobileTime value.
     */
    @Metadata(properties = { MetadataProperties.GENERATED })
    public String getRebindMobileTime() {
        return this.rebindMobileTime;
    }

    /**
     * Get the safeAreaCode property: The safe_area_code property.
     * 
     * @return the safeAreaCode value.
     */
    @Metadata(properties = { MetadataProperties.GENERATED })
    public String getSafeAreaCode() {
        return this.safeAreaCode;
    }

    /**
     * Get the safeMobile property: The safe_mobile property.
     * 
     * @return the safeMobile value.
     */
    @Metadata(properties = { MetadataProperties.GENERATED })
    public String getSafeMobile() {
        return this.safeMobile;
    }

    /**
     * Get the unmaskedEmail property: The unmasked_email property.
     * 
     * @return the unmaskedEmail value.
     */
    @Metadata(properties = { MetadataProperties.GENERATED })
    public String getUnmaskedEmail() {
        return this.unmaskedEmail;
    }

    /**
     * Get the unmaskedEmailType property: The unmasked_email_type property.
     * 
     * @return the unmaskedEmailType value.
     */
    @Metadata(properties = { MetadataProperties.GENERATED })
    public Integer getUnmaskedEmailType() {
        return this.unmaskedEmailType;
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
        jsonWriter.writeStringField("account_name", this.accountName);
        jsonWriter.writeStringField("aid", this.aid);
        jsonWriter.writeStringField("area_code", this.areaCode);
        jsonWriter.writeStringField("country", this.country);
        jsonWriter.writeStringField("email", this.email);
        jsonWriter.writeStringField("identity_code", this.identityCode);
        jsonWriter.writeNumberField("is_adult", this.isAdult);
        jsonWriter.writeNumberField("is_email_verify", this.isEmailVerify);
        jsonWriter.writeArrayField("links", this.links, (writer, element) -> {
            if (element == null) {
                writer.writeNull();
            } else {
                element.writeTo(writer);
            }
        });
        jsonWriter.writeStringField("mid", this.mid);
        jsonWriter.writeStringField("mobile", this.mobile);
        jsonWriter.writeStringField("password_time", this.passwordTime);
        jsonWriter.writeStringField("realname", this.realname);
        jsonWriter.writeStringField("rebind_area_code", this.rebindAreaCode);
        jsonWriter.writeStringField("rebind_mobile", this.rebindMobile);
        jsonWriter.writeStringField("rebind_mobile_time", this.rebindMobileTime);
        jsonWriter.writeStringField("safe_area_code", this.safeAreaCode);
        jsonWriter.writeStringField("safe_mobile", this.safeMobile);
        jsonWriter.writeStringField("unmasked_email", this.unmaskedEmail);
        jsonWriter.writeNumberField("unmasked_email_type", this.unmaskedEmailType);
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
     * Reads an instance of LoginUserInfo from the JsonReader.
     * 
     * @param jsonReader The JsonReader being read.
     * @return An instance of LoginUserInfo if the JsonReader was pointing to an instance of it, or null if it was
     * pointing to JSON null.
     * @throws IOException If an error occurs while reading the LoginUserInfo.
     */
    @Metadata(properties = { MetadataProperties.GENERATED })
    public static LoginUserInfo fromJson(JsonReader jsonReader) throws IOException {
        return jsonReader.readObject(reader -> {
            LoginUserInfo deserializedLoginUserInfo = new LoginUserInfo();
            Map<String, BinaryData> additionalProperties = null;
            while (reader.nextToken() != JsonToken.END_OBJECT) {
                String fieldName = reader.getFieldName();
                reader.nextToken();

                if ("account_name".equals(fieldName)) {
                    deserializedLoginUserInfo.accountName = reader.getString();
                } else if ("aid".equals(fieldName)) {
                    deserializedLoginUserInfo.aid = reader.getString();
                } else if ("area_code".equals(fieldName)) {
                    deserializedLoginUserInfo.areaCode = reader.getString();
                } else if ("country".equals(fieldName)) {
                    deserializedLoginUserInfo.country = reader.getString();
                } else if ("email".equals(fieldName)) {
                    deserializedLoginUserInfo.email = reader.getString();
                } else if ("identity_code".equals(fieldName)) {
                    deserializedLoginUserInfo.identityCode = reader.getString();
                } else if ("is_adult".equals(fieldName)) {
                    deserializedLoginUserInfo.isAdult = reader.getNullable(JsonReader::getInt);
                } else if ("is_email_verify".equals(fieldName)) {
                    deserializedLoginUserInfo.isEmailVerify = reader.getNullable(JsonReader::getInt);
                } else if ("links".equals(fieldName)) {
                    List<BinaryData> links = reader.readArray(reader1 -> reader1
                        .getNullable(nonNullReader -> BinaryData.fromObject(nonNullReader.readUntyped())));
                    deserializedLoginUserInfo.links = links;
                } else if ("mid".equals(fieldName)) {
                    deserializedLoginUserInfo.mid = reader.getString();
                } else if ("mobile".equals(fieldName)) {
                    deserializedLoginUserInfo.mobile = reader.getString();
                } else if ("password_time".equals(fieldName)) {
                    deserializedLoginUserInfo.passwordTime = reader.getString();
                } else if ("realname".equals(fieldName)) {
                    deserializedLoginUserInfo.realname = reader.getString();
                } else if ("rebind_area_code".equals(fieldName)) {
                    deserializedLoginUserInfo.rebindAreaCode = reader.getString();
                } else if ("rebind_mobile".equals(fieldName)) {
                    deserializedLoginUserInfo.rebindMobile = reader.getString();
                } else if ("rebind_mobile_time".equals(fieldName)) {
                    deserializedLoginUserInfo.rebindMobileTime = reader.getString();
                } else if ("safe_area_code".equals(fieldName)) {
                    deserializedLoginUserInfo.safeAreaCode = reader.getString();
                } else if ("safe_mobile".equals(fieldName)) {
                    deserializedLoginUserInfo.safeMobile = reader.getString();
                } else if ("unmasked_email".equals(fieldName)) {
                    deserializedLoginUserInfo.unmaskedEmail = reader.getString();
                } else if ("unmasked_email_type".equals(fieldName)) {
                    deserializedLoginUserInfo.unmaskedEmailType = reader.getNullable(JsonReader::getInt);
                } else {
                    if (additionalProperties == null) {
                        additionalProperties = new LinkedHashMap<>();
                    }

                    additionalProperties.put(fieldName,
                        reader.getNullable(nonNullReader -> BinaryData.fromObject(nonNullReader.readUntyped())));
                }
            }
            deserializedLoginUserInfo.additionalProperties = additionalProperties;

            return deserializedLoginUserInfo;
        });
    }
}
