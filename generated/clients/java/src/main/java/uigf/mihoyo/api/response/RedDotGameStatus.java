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
 * The RedDotGameStatus model.
 */
@Metadata(properties = { MetadataProperties.IMMUTABLE })
public final class RedDotGameStatus implements JsonSerializable<RedDotGameStatus> {
    /*
     * The bbs_cn property.
     */
    @Metadata(properties = { MetadataProperties.GENERATED })
    private Boolean bbsCn;

    /*
     * The hk4e_cn property.
     */
    @Metadata(properties = { MetadataProperties.GENERATED })
    private Boolean hk4eCn;

    /*
     * The nap_cn property.
     */
    @Metadata(properties = { MetadataProperties.GENERATED })
    private Boolean napCn;

    /*
     * Additional properties
     */
    @Metadata(properties = { MetadataProperties.GENERATED })
    private Map<String, BinaryData> additionalProperties;

    /**
     * Creates an instance of RedDotGameStatus class.
     */
    @Metadata(properties = { MetadataProperties.GENERATED })
    private RedDotGameStatus() {
    }

    /**
     * Get the bbsCn property: The bbs_cn property.
     * 
     * @return the bbsCn value.
     */
    @Metadata(properties = { MetadataProperties.GENERATED })
    public Boolean isBbsCn() {
        return this.bbsCn;
    }

    /**
     * Get the hk4eCn property: The hk4e_cn property.
     * 
     * @return the hk4eCn value.
     */
    @Metadata(properties = { MetadataProperties.GENERATED })
    public Boolean isHk4eCn() {
        return this.hk4eCn;
    }

    /**
     * Get the napCn property: The nap_cn property.
     * 
     * @return the napCn value.
     */
    @Metadata(properties = { MetadataProperties.GENERATED })
    public Boolean isNapCn() {
        return this.napCn;
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
        jsonWriter.writeBooleanField("bbs_cn", this.bbsCn);
        jsonWriter.writeBooleanField("hk4e_cn", this.hk4eCn);
        jsonWriter.writeBooleanField("nap_cn", this.napCn);
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
     * Reads an instance of RedDotGameStatus from the JsonReader.
     * 
     * @param jsonReader The JsonReader being read.
     * @return An instance of RedDotGameStatus if the JsonReader was pointing to an instance of it, or null if it was
     * pointing to JSON null.
     * @throws IOException If an error occurs while reading the RedDotGameStatus.
     */
    @Metadata(properties = { MetadataProperties.GENERATED })
    public static RedDotGameStatus fromJson(JsonReader jsonReader) throws IOException {
        return jsonReader.readObject(reader -> {
            RedDotGameStatus deserializedRedDotGameStatus = new RedDotGameStatus();
            Map<String, BinaryData> additionalProperties = null;
            while (reader.nextToken() != JsonToken.END_OBJECT) {
                String fieldName = reader.getFieldName();
                reader.nextToken();

                if ("bbs_cn".equals(fieldName)) {
                    deserializedRedDotGameStatus.bbsCn = reader.getNullable(JsonReader::getBoolean);
                } else if ("hk4e_cn".equals(fieldName)) {
                    deserializedRedDotGameStatus.hk4eCn = reader.getNullable(JsonReader::getBoolean);
                } else if ("nap_cn".equals(fieldName)) {
                    deserializedRedDotGameStatus.napCn = reader.getNullable(JsonReader::getBoolean);
                } else {
                    if (additionalProperties == null) {
                        additionalProperties = new LinkedHashMap<>();
                    }

                    additionalProperties.put(fieldName,
                        reader.getNullable(nonNullReader -> BinaryData.fromObject(nonNullReader.readUntyped())));
                }
            }
            deserializedRedDotGameStatus.additionalProperties = additionalProperties;

            return deserializedRedDotGameStatus;
        });
    }
}
