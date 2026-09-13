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
import java.util.List;
import java.util.Map;

/**
 * The MobileAppSplashData model.
 */
@Metadata(properties = { MetadataProperties.IMMUTABLE })
public final class MobileAppSplashData implements JsonSerializable<MobileAppSplashData> {
    /*
     * The has_splash property.
     */
    @Metadata(properties = { MetadataProperties.GENERATED })
    private Boolean hasSplash;

    /*
     * The splashes property.
     */
    @Metadata(properties = { MetadataProperties.GENERATED })
    private List<BinaryData> splashes;

    /*
     * Additional properties
     */
    @Metadata(properties = { MetadataProperties.GENERATED })
    private Map<String, BinaryData> additionalProperties;

    /**
     * Creates an instance of MobileAppSplashData class.
     */
    @Metadata(properties = { MetadataProperties.GENERATED })
    private MobileAppSplashData() {
    }

    /**
     * Get the hasSplash property: The has_splash property.
     * 
     * @return the hasSplash value.
     */
    @Metadata(properties = { MetadataProperties.GENERATED })
    public Boolean isHasSplash() {
        return this.hasSplash;
    }

    /**
     * Get the splashes property: The splashes property.
     * 
     * @return the splashes value.
     */
    @Metadata(properties = { MetadataProperties.GENERATED })
    public List<BinaryData> getSplashes() {
        return this.splashes;
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
        jsonWriter.writeBooleanField("has_splash", this.hasSplash);
        jsonWriter.writeArrayField("splashes", this.splashes, (writer, element) -> {
            if (element == null) {
                writer.writeNull();
            } else {
                element.writeTo(writer);
            }
        });
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
     * Reads an instance of MobileAppSplashData from the JsonReader.
     * 
     * @param jsonReader The JsonReader being read.
     * @return An instance of MobileAppSplashData if the JsonReader was pointing to an instance of it, or null if it was
     * pointing to JSON null.
     * @throws IOException If an error occurs while reading the MobileAppSplashData.
     */
    @Metadata(properties = { MetadataProperties.GENERATED })
    public static MobileAppSplashData fromJson(JsonReader jsonReader) throws IOException {
        return jsonReader.readObject(reader -> {
            MobileAppSplashData deserializedMobileAppSplashData = new MobileAppSplashData();
            Map<String, BinaryData> additionalProperties = null;
            while (reader.nextToken() != JsonToken.END_OBJECT) {
                String fieldName = reader.getFieldName();
                reader.nextToken();

                if ("has_splash".equals(fieldName)) {
                    deserializedMobileAppSplashData.hasSplash = reader.getNullable(JsonReader::getBoolean);
                } else if ("splashes".equals(fieldName)) {
                    List<BinaryData> splashes = reader.readArray(reader1 -> reader1
                        .getNullable(nonNullReader -> BinaryData.fromObject(nonNullReader.readUntyped())));
                    deserializedMobileAppSplashData.splashes = splashes;
                } else {
                    if (additionalProperties == null) {
                        additionalProperties = new LinkedHashMap<>();
                    }

                    additionalProperties.put(fieldName,
                        reader.getNullable(nonNullReader -> BinaryData.fromObject(nonNullReader.readUntyped())));
                }
            }
            deserializedMobileAppSplashData.additionalProperties = additionalProperties;

            return deserializedMobileAppSplashData;
        });
    }
}
