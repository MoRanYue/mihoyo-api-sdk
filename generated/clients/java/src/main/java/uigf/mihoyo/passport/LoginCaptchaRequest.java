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
 * The LoginCaptchaRequest model.
 */
@Metadata(properties = { MetadataProperties.FLUENT })
public final class LoginCaptchaRequest implements JsonSerializable<LoginCaptchaRequest> {
    /*
     * The area_code property.
     */
    @Metadata(properties = { MetadataProperties.GENERATED })
    private final String areaCode;

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
     * Creates an instance of LoginCaptchaRequest class.
     * 
     * @param areaCode the areaCode value to set.
     * @param mobile the mobile value to set.
     */
    @Metadata(properties = { MetadataProperties.GENERATED })
    public LoginCaptchaRequest(String areaCode, String mobile) {
        this.areaCode = areaCode;
        this.mobile = mobile;
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
     * @return the LoginCaptchaRequest object itself.
     */
    @Metadata(properties = { MetadataProperties.GENERATED })
    public LoginCaptchaRequest setAdditionalProperties(Map<String, BinaryData> additionalProperties) {
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
        jsonWriter.writeStringField("area_code", this.areaCode);
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
     * Reads an instance of LoginCaptchaRequest from the JsonReader.
     * 
     * @param jsonReader The JsonReader being read.
     * @return An instance of LoginCaptchaRequest if the JsonReader was pointing to an instance of it, or null if it was
     * pointing to JSON null.
     * @throws IllegalStateException If the deserialized JSON object was missing any required properties.
     * @throws IOException If an error occurs while reading the LoginCaptchaRequest.
     */
    @Metadata(properties = { MetadataProperties.GENERATED })
    public static LoginCaptchaRequest fromJson(JsonReader jsonReader) throws IOException {
        return jsonReader.readObject(reader -> {
            String areaCode = null;
            String mobile = null;
            Map<String, BinaryData> additionalProperties = null;
            while (reader.nextToken() != JsonToken.END_OBJECT) {
                String fieldName = reader.getFieldName();
                reader.nextToken();

                if ("area_code".equals(fieldName)) {
                    areaCode = reader.getString();
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
            LoginCaptchaRequest deserializedLoginCaptchaRequest = new LoginCaptchaRequest(areaCode, mobile);
            deserializedLoginCaptchaRequest.additionalProperties = additionalProperties;

            return deserializedLoginCaptchaRequest;
        });
    }
}
