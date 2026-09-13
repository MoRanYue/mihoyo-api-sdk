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
 * The MobileCaptchaLoginRequest model.
 */
@Metadata(properties = { MetadataProperties.FLUENT })
public final class MobileCaptchaLoginRequest implements JsonSerializable<MobileCaptchaLoginRequest> {
    /*
     * The action_type property.
     */
    @Metadata(properties = { MetadataProperties.GENERATED })
    private final String actionType;

    /*
     * The area_code property.
     */
    @Metadata(properties = { MetadataProperties.GENERATED })
    private final String areaCode;

    /*
     * The captcha property.
     */
    @Metadata(properties = { MetadataProperties.GENERATED })
    private final String captcha;

    /*
     * The mobile property.
     */
    @Metadata(properties = { MetadataProperties.GENERATED })
    private final String mobile;

    /*
     * Additional properties
     */
    @Metadata(properties = { MetadataProperties.GENERATED })
    private Map<String, BinaryData> additionalProperties;

    /**
     * Creates an instance of MobileCaptchaLoginRequest class.
     * 
     * @param actionType the actionType value to set.
     * @param areaCode the areaCode value to set.
     * @param captcha the captcha value to set.
     * @param mobile the mobile value to set.
     */
    @Metadata(properties = { MetadataProperties.GENERATED })
    public MobileCaptchaLoginRequest(String actionType, String areaCode, String captcha, String mobile) {
        this.actionType = actionType;
        this.areaCode = areaCode;
        this.captcha = captcha;
        this.mobile = mobile;
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
     * Get the areaCode property: The area_code property.
     * 
     * @return the areaCode value.
     */
    @Metadata(properties = { MetadataProperties.GENERATED })
    public String getAreaCode() {
        return this.areaCode;
    }

    /**
     * Get the captcha property: The captcha property.
     * 
     * @return the captcha value.
     */
    @Metadata(properties = { MetadataProperties.GENERATED })
    public String getCaptcha() {
        return this.captcha;
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
     * @return the MobileCaptchaLoginRequest object itself.
     */
    @Metadata(properties = { MetadataProperties.GENERATED })
    public MobileCaptchaLoginRequest setAdditionalProperties(Map<String, BinaryData> additionalProperties) {
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
        jsonWriter.writeStringField("action_type", this.actionType);
        jsonWriter.writeStringField("area_code", this.areaCode);
        jsonWriter.writeStringField("captcha", this.captcha);
        jsonWriter.writeStringField("mobile", this.mobile);
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
     * Reads an instance of MobileCaptchaLoginRequest from the JsonReader.
     * 
     * @param jsonReader The JsonReader being read.
     * @return An instance of MobileCaptchaLoginRequest if the JsonReader was pointing to an instance of it, or null if
     * it was pointing to JSON null.
     * @throws IllegalStateException If the deserialized JSON object was missing any required properties.
     * @throws IOException If an error occurs while reading the MobileCaptchaLoginRequest.
     */
    @Metadata(properties = { MetadataProperties.GENERATED })
    public static MobileCaptchaLoginRequest fromJson(JsonReader jsonReader) throws IOException {
        return jsonReader.readObject(reader -> {
            String actionType = null;
            String areaCode = null;
            String captcha = null;
            String mobile = null;
            Map<String, BinaryData> additionalProperties = null;
            while (reader.nextToken() != JsonToken.END_OBJECT) {
                String fieldName = reader.getFieldName();
                reader.nextToken();

                if ("action_type".equals(fieldName)) {
                    actionType = reader.getString();
                } else if ("area_code".equals(fieldName)) {
                    areaCode = reader.getString();
                } else if ("captcha".equals(fieldName)) {
                    captcha = reader.getString();
                } else if ("mobile".equals(fieldName)) {
                    mobile = reader.getString();
                } else {
                    if (additionalProperties == null) {
                        additionalProperties = new LinkedHashMap<>();
                    }

                    additionalProperties.put(fieldName,
                        reader.getNullable(nonNullReader -> BinaryData.fromObject(nonNullReader.readUntyped())));
                }
            }
            MobileCaptchaLoginRequest deserializedMobileCaptchaLoginRequest
                = new MobileCaptchaLoginRequest(actionType, areaCode, captcha, mobile);
            deserializedMobileCaptchaLoginRequest.additionalProperties = additionalProperties;

            return deserializedMobileCaptchaLoginRequest;
        });
    }
}
