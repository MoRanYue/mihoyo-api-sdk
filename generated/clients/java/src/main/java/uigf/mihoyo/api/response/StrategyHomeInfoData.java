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
 * The StrategyHomeInfoData model.
 */
@Metadata(properties = { MetadataProperties.IMMUTABLE })
public final class StrategyHomeInfoData implements JsonSerializable<StrategyHomeInfoData> {
    /*
     * The announce property.
     */
    @Metadata(properties = { MetadataProperties.GENERATED })
    private StrategyAnnouncement announce;

    /*
     * The pop_window property.
     */
    @Metadata(properties = { MetadataProperties.GENERATED })
    private BinaryData popWindow;

    /*
     * The search property.
     */
    @Metadata(properties = { MetadataProperties.GENERATED })
    private StrategySearch search;

    /*
     * The speaker property.
     */
    @Metadata(properties = { MetadataProperties.GENERATED })
    private BinaryData speaker;

    /*
     * Additional properties
     */
    @Metadata(properties = { MetadataProperties.GENERATED })
    private Map<String, BinaryData> additionalProperties;

    /**
     * Creates an instance of StrategyHomeInfoData class.
     */
    @Metadata(properties = { MetadataProperties.GENERATED })
    private StrategyHomeInfoData() {
    }

    /**
     * Get the announce property: The announce property.
     * 
     * @return the announce value.
     */
    @Metadata(properties = { MetadataProperties.GENERATED })
    public StrategyAnnouncement getAnnounce() {
        return this.announce;
    }

    /**
     * Get the popWindow property: The pop_window property.
     * 
     * @return the popWindow value.
     */
    @Metadata(properties = { MetadataProperties.GENERATED })
    public BinaryData getPopWindow() {
        return this.popWindow;
    }

    /**
     * Get the search property: The search property.
     * 
     * @return the search value.
     */
    @Metadata(properties = { MetadataProperties.GENERATED })
    public StrategySearch getSearch() {
        return this.search;
    }

    /**
     * Get the speaker property: The speaker property.
     * 
     * @return the speaker value.
     */
    @Metadata(properties = { MetadataProperties.GENERATED })
    public BinaryData getSpeaker() {
        return this.speaker;
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
        jsonWriter.writeJsonField("announce", this.announce);
        if (this.popWindow != null) {
            jsonWriter.writeFieldName("pop_window");
            this.popWindow.writeTo(jsonWriter);
        }
        jsonWriter.writeJsonField("search", this.search);
        if (this.speaker != null) {
            jsonWriter.writeFieldName("speaker");
            this.speaker.writeTo(jsonWriter);
        }
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
     * Reads an instance of StrategyHomeInfoData from the JsonReader.
     * 
     * @param jsonReader The JsonReader being read.
     * @return An instance of StrategyHomeInfoData if the JsonReader was pointing to an instance of it, or null if it
     * was pointing to JSON null.
     * @throws IOException If an error occurs while reading the StrategyHomeInfoData.
     */
    @Metadata(properties = { MetadataProperties.GENERATED })
    public static StrategyHomeInfoData fromJson(JsonReader jsonReader) throws IOException {
        return jsonReader.readObject(reader -> {
            StrategyHomeInfoData deserializedStrategyHomeInfoData = new StrategyHomeInfoData();
            Map<String, BinaryData> additionalProperties = null;
            while (reader.nextToken() != JsonToken.END_OBJECT) {
                String fieldName = reader.getFieldName();
                reader.nextToken();

                if ("announce".equals(fieldName)) {
                    deserializedStrategyHomeInfoData.announce = StrategyAnnouncement.fromJson(reader);
                } else if ("pop_window".equals(fieldName)) {
                    deserializedStrategyHomeInfoData.popWindow
                        = reader.getNullable(nonNullReader -> BinaryData.fromObject(nonNullReader.readUntyped()));
                } else if ("search".equals(fieldName)) {
                    deserializedStrategyHomeInfoData.search = StrategySearch.fromJson(reader);
                } else if ("speaker".equals(fieldName)) {
                    deserializedStrategyHomeInfoData.speaker
                        = reader.getNullable(nonNullReader -> BinaryData.fromObject(nonNullReader.readUntyped()));
                } else {
                    if (additionalProperties == null) {
                        additionalProperties = new LinkedHashMap<>();
                    }

                    additionalProperties.put(fieldName,
                        reader.getNullable(nonNullReader -> BinaryData.fromObject(nonNullReader.readUntyped())));
                }
            }
            deserializedStrategyHomeInfoData.additionalProperties = additionalProperties;

            return deserializedStrategyHomeInfoData;
        });
    }
}
