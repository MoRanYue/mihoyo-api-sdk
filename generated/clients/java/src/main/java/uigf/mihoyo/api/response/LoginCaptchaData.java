package uigf.mihoyo.api.response;

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
 * The LoginCaptchaData model.
 */
@Metadata(properties = { MetadataProperties.IMMUTABLE })
public final class LoginCaptchaData implements JsonSerializable<LoginCaptchaData> {
    /*
     * The action_type property.
     */
    @Metadata(properties = { MetadataProperties.GENERATED })
    private String actionType;

    /*
     * The countdown property.
     */
    @Metadata(properties = { MetadataProperties.GENERATED })
    private Integer countdown;

    /*
     * The sent_new property.
     */
    @Metadata(properties = { MetadataProperties.GENERATED })
    private Boolean sentNew;

    /*
     * Additional properties
     */
    @Metadata(properties = { MetadataProperties.GENERATED })
    private Map<String, BinaryData> additionalProperties;

    /**
     * Creates an instance of LoginCaptchaData class.
     */
    @Metadata(properties = { MetadataProperties.GENERATED })
    private LoginCaptchaData() {
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
     * Get the countdown property: The countdown property.
     * 
     * @return the countdown value.
     */
    @Metadata(properties = { MetadataProperties.GENERATED })
    public Integer getCountdown() {
        return this.countdown;
    }

    /**
     * Get the sentNew property: The sent_new property.
     * 
     * @return the sentNew value.
     */
    @Metadata(properties = { MetadataProperties.GENERATED })
    public Boolean isSentNew() {
        return this.sentNew;
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
        jsonWriter.writeStringField("action_type", this.actionType);
        jsonWriter.writeNumberField("countdown", this.countdown);
        jsonWriter.writeBooleanField("sent_new", this.sentNew);
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
     * Reads an instance of LoginCaptchaData from the JsonReader.
     * 
     * @param jsonReader The JsonReader being read.
     * @return An instance of LoginCaptchaData if the JsonReader was pointing to an instance of it, or null if it was
     * pointing to JSON null.
     * @throws IOException If an error occurs while reading the LoginCaptchaData.
     */
    @Metadata(properties = { MetadataProperties.GENERATED })
    public static LoginCaptchaData fromJson(JsonReader jsonReader) throws IOException {
        return jsonReader.readObject(reader -> {
            LoginCaptchaData deserializedLoginCaptchaData = new LoginCaptchaData();
            Map<String, BinaryData> additionalProperties = null;
            while (reader.nextToken() != JsonToken.END_OBJECT) {
                String fieldName = reader.getFieldName();
                reader.nextToken();

                if ("action_type".equals(fieldName)) {
                    deserializedLoginCaptchaData.actionType = reader.getString();
                } else if ("countdown".equals(fieldName)) {
                    deserializedLoginCaptchaData.countdown = reader.getNullable(JsonReader::getInt);
                } else if ("sent_new".equals(fieldName)) {
                    deserializedLoginCaptchaData.sentNew = reader.getNullable(JsonReader::getBoolean);
                } else {
                    if (additionalProperties == null) {
                        additionalProperties = new LinkedHashMap<>();
                    }

                    additionalProperties.put(fieldName,
                        reader.getNullable(nonNullReader -> BinaryData.fromObject(nonNullReader.readUntyped())));
                }
            }
            deserializedLoginCaptchaData.additionalProperties = additionalProperties;

            return deserializedLoginCaptchaData;
        });
    }
}
