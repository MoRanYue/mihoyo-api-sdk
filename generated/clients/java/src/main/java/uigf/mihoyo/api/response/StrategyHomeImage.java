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
 * The StrategyHomeImage model.
 */
@Metadata(properties = { MetadataProperties.IMMUTABLE })
public final class StrategyHomeImage implements JsonSerializable<StrategyHomeImage> {
    /*
     * The headImg property.
     */
    @Metadata(properties = { MetadataProperties.GENERATED })
    private String headImg;

    /*
     * The logo property.
     */
    @Metadata(properties = { MetadataProperties.GENERATED })
    private String logo;

    /*
     * Additional properties
     */
    @Metadata(properties = { MetadataProperties.GENERATED })
    private Map<String, BinaryData> additionalProperties;

    /**
     * Creates an instance of StrategyHomeImage class.
     */
    @Metadata(properties = { MetadataProperties.GENERATED })
    private StrategyHomeImage() {
    }

    /**
     * Get the headImg property: The headImg property.
     * 
     * @return the headImg value.
     */
    @Metadata(properties = { MetadataProperties.GENERATED })
    public String getHeadImg() {
        return this.headImg;
    }

    /**
     * Get the logo property: The logo property.
     * 
     * @return the logo value.
     */
    @Metadata(properties = { MetadataProperties.GENERATED })
    public String getLogo() {
        return this.logo;
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
        jsonWriter.writeStringField("headImg", this.headImg);
        jsonWriter.writeStringField("logo", this.logo);
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
     * Reads an instance of StrategyHomeImage from the JsonReader.
     * 
     * @param jsonReader The JsonReader being read.
     * @return An instance of StrategyHomeImage if the JsonReader was pointing to an instance of it, or null if it was
     * pointing to JSON null.
     * @throws IOException If an error occurs while reading the StrategyHomeImage.
     */
    @Metadata(properties = { MetadataProperties.GENERATED })
    public static StrategyHomeImage fromJson(JsonReader jsonReader) throws IOException {
        return jsonReader.readObject(reader -> {
            StrategyHomeImage deserializedStrategyHomeImage = new StrategyHomeImage();
            Map<String, BinaryData> additionalProperties = null;
            while (reader.nextToken() != JsonToken.END_OBJECT) {
                String fieldName = reader.getFieldName();
                reader.nextToken();

                if ("headImg".equals(fieldName)) {
                    deserializedStrategyHomeImage.headImg = reader.getString();
                } else if ("logo".equals(fieldName)) {
                    deserializedStrategyHomeImage.logo = reader.getString();
                } else {
                    if (additionalProperties == null) {
                        additionalProperties = new LinkedHashMap<>();
                    }

                    additionalProperties.put(fieldName,
                        reader.getNullable(nonNullReader -> BinaryData.fromObject(nonNullReader.readUntyped())));
                }
            }
            deserializedStrategyHomeImage.additionalProperties = additionalProperties;

            return deserializedStrategyHomeImage;
        });
    }
}
