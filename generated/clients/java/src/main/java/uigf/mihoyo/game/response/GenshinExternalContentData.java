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
 * The GenshinExternalContentData model.
 */
@Metadata(properties = { MetadataProperties.IMMUTABLE })
public final class GenshinExternalContentData implements JsonSerializable<GenshinExternalContentData> {
    /*
     * The caculator_url property.
     */
    @Metadata(properties = { MetadataProperties.GENERATED })
    private String caculatorUrl;

    /*
     * The lineup_url property.
     */
    @Metadata(properties = { MetadataProperties.GENERATED })
    private String lineupUrl;

    /*
     * The strategy_url property.
     */
    @Metadata(properties = { MetadataProperties.GENERATED })
    private String strategyUrl;

    /*
     * The wiki_url property.
     */
    @Metadata(properties = { MetadataProperties.GENERATED })
    private String wikiUrl;

    /*
     * Additional properties
     */
    @Metadata(properties = { MetadataProperties.GENERATED })
    private Map<String, BinaryData> additionalProperties;

    /**
     * Creates an instance of GenshinExternalContentData class.
     */
    @Metadata(properties = { MetadataProperties.GENERATED })
    private GenshinExternalContentData() {
    }

    /**
     * Get the caculatorUrl property: The caculator_url property.
     * 
     * @return the caculatorUrl value.
     */
    @Metadata(properties = { MetadataProperties.GENERATED })
    public String getCaculatorUrl() {
        return this.caculatorUrl;
    }

    /**
     * Get the lineupUrl property: The lineup_url property.
     * 
     * @return the lineupUrl value.
     */
    @Metadata(properties = { MetadataProperties.GENERATED })
    public String getLineupUrl() {
        return this.lineupUrl;
    }

    /**
     * Get the strategyUrl property: The strategy_url property.
     * 
     * @return the strategyUrl value.
     */
    @Metadata(properties = { MetadataProperties.GENERATED })
    public String getStrategyUrl() {
        return this.strategyUrl;
    }

    /**
     * Get the wikiUrl property: The wiki_url property.
     * 
     * @return the wikiUrl value.
     */
    @Metadata(properties = { MetadataProperties.GENERATED })
    public String getWikiUrl() {
        return this.wikiUrl;
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
        jsonWriter.writeStringField("caculator_url", this.caculatorUrl);
        jsonWriter.writeStringField("lineup_url", this.lineupUrl);
        jsonWriter.writeStringField("strategy_url", this.strategyUrl);
        jsonWriter.writeStringField("wiki_url", this.wikiUrl);
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
     * Reads an instance of GenshinExternalContentData from the JsonReader.
     * 
     * @param jsonReader The JsonReader being read.
     * @return An instance of GenshinExternalContentData if the JsonReader was pointing to an instance of it, or null if
     * it was pointing to JSON null.
     * @throws IOException If an error occurs while reading the GenshinExternalContentData.
     */
    @Metadata(properties = { MetadataProperties.GENERATED })
    public static GenshinExternalContentData fromJson(JsonReader jsonReader) throws IOException {
        return jsonReader.readObject(reader -> {
            GenshinExternalContentData deserializedGenshinExternalContentData = new GenshinExternalContentData();
            Map<String, BinaryData> additionalProperties = null;
            while (reader.nextToken() != JsonToken.END_OBJECT) {
                String fieldName = reader.getFieldName();
                reader.nextToken();

                if ("caculator_url".equals(fieldName)) {
                    deserializedGenshinExternalContentData.caculatorUrl = reader.getString();
                } else if ("lineup_url".equals(fieldName)) {
                    deserializedGenshinExternalContentData.lineupUrl = reader.getString();
                } else if ("strategy_url".equals(fieldName)) {
                    deserializedGenshinExternalContentData.strategyUrl = reader.getString();
                } else if ("wiki_url".equals(fieldName)) {
                    deserializedGenshinExternalContentData.wikiUrl = reader.getString();
                } else {
                    if (additionalProperties == null) {
                        additionalProperties = new LinkedHashMap<>();
                    }

                    additionalProperties.put(fieldName,
                        reader.getNullable(nonNullReader -> BinaryData.fromObject(nonNullReader.readUntyped())));
                }
            }
            deserializedGenshinExternalContentData.additionalProperties = additionalProperties;

            return deserializedGenshinExternalContentData;
        });
    }
}
