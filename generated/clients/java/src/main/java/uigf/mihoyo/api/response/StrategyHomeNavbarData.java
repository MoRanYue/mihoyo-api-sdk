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
 * The StrategyHomeNavbarData model.
 */
@Metadata(properties = { MetadataProperties.IMMUTABLE })
public final class StrategyHomeNavbarData implements JsonSerializable<StrategyHomeNavbarData> {
    /*
     * The home_img property.
     */
    @Metadata(properties = { MetadataProperties.GENERATED })
    private StrategyHomeImage homeImg;

    /*
     * The navbar property.
     */
    @Metadata(properties = { MetadataProperties.GENERATED })
    private List<BinaryData> navbar;

    /*
     * Additional properties
     */
    @Metadata(properties = { MetadataProperties.GENERATED })
    private Map<String, BinaryData> additionalProperties;

    /**
     * Creates an instance of StrategyHomeNavbarData class.
     */
    @Metadata(properties = { MetadataProperties.GENERATED })
    private StrategyHomeNavbarData() {
    }

    /**
     * Get the homeImg property: The home_img property.
     * 
     * @return the homeImg value.
     */
    @Metadata(properties = { MetadataProperties.GENERATED })
    public StrategyHomeImage getHomeImg() {
        return this.homeImg;
    }

    /**
     * Get the navbar property: The navbar property.
     * 
     * @return the navbar value.
     */
    @Metadata(properties = { MetadataProperties.GENERATED })
    public List<BinaryData> getNavbar() {
        return this.navbar;
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
        jsonWriter.writeJsonField("home_img", this.homeImg);
        jsonWriter.writeArrayField("navbar", this.navbar, (writer, element) -> {
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
     * Reads an instance of StrategyHomeNavbarData from the JsonReader.
     * 
     * @param jsonReader The JsonReader being read.
     * @return An instance of StrategyHomeNavbarData if the JsonReader was pointing to an instance of it, or null if it
     * was pointing to JSON null.
     * @throws IOException If an error occurs while reading the StrategyHomeNavbarData.
     */
    @Metadata(properties = { MetadataProperties.GENERATED })
    public static StrategyHomeNavbarData fromJson(JsonReader jsonReader) throws IOException {
        return jsonReader.readObject(reader -> {
            StrategyHomeNavbarData deserializedStrategyHomeNavbarData = new StrategyHomeNavbarData();
            Map<String, BinaryData> additionalProperties = null;
            while (reader.nextToken() != JsonToken.END_OBJECT) {
                String fieldName = reader.getFieldName();
                reader.nextToken();

                if ("home_img".equals(fieldName)) {
                    deserializedStrategyHomeNavbarData.homeImg = StrategyHomeImage.fromJson(reader);
                } else if ("navbar".equals(fieldName)) {
                    List<BinaryData> navbar = reader.readArray(reader1 -> reader1
                        .getNullable(nonNullReader -> BinaryData.fromObject(nonNullReader.readUntyped())));
                    deserializedStrategyHomeNavbarData.navbar = navbar;
                } else {
                    if (additionalProperties == null) {
                        additionalProperties = new LinkedHashMap<>();
                    }

                    additionalProperties.put(fieldName,
                        reader.getNullable(nonNullReader -> BinaryData.fromObject(nonNullReader.readUntyped())));
                }
            }
            deserializedStrategyHomeNavbarData.additionalProperties = additionalProperties;

            return deserializedStrategyHomeNavbarData;
        });
    }
}
