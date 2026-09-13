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
import java.util.List;
import java.util.Map;

/**
 * The ZenlessAbyssSummaryData model.
 */
@Metadata(properties = { MetadataProperties.IMMUTABLE })
public final class ZenlessAbyssSummaryData implements JsonSerializable<ZenlessAbyssSummaryData> {
    /*
     * The abyss_collect property.
     */
    @Metadata(properties = { MetadataProperties.GENERATED })
    private List<Map<String, BinaryData>> abyssCollect;

    /*
     * The abyss_duty property.
     */
    @Metadata(properties = { MetadataProperties.GENERATED })
    private BinaryData abyssDuty;

    /*
     * The abyss_level property.
     */
    @Metadata(properties = { MetadataProperties.GENERATED })
    private Map<String, BinaryData> abyssLevel;

    /*
     * The abyss_nest property.
     */
    @Metadata(properties = { MetadataProperties.GENERATED })
    private Map<String, BinaryData> abyssNest;

    /*
     * The abyss_point property.
     */
    @Metadata(properties = { MetadataProperties.GENERATED })
    private Map<String, BinaryData> abyssPoint;

    /*
     * The abyss_talent property.
     */
    @Metadata(properties = { MetadataProperties.GENERATED })
    private Map<String, BinaryData> abyssTalent;

    /*
     * The abyss_throne property.
     */
    @Metadata(properties = { MetadataProperties.GENERATED })
    private Map<String, BinaryData> abyssThrone;

    /*
     * The refresh_time property.
     */
    @Metadata(properties = { MetadataProperties.GENERATED })
    private Long refreshTime;

    /*
     * The unlock property.
     */
    @Metadata(properties = { MetadataProperties.GENERATED })
    private Boolean unlock;

    /*
     * Additional properties
     */
    @Metadata(properties = { MetadataProperties.GENERATED })
    private Map<String, BinaryData> additionalProperties;

    /**
     * Creates an instance of ZenlessAbyssSummaryData class.
     */
    @Metadata(properties = { MetadataProperties.GENERATED })
    private ZenlessAbyssSummaryData() {
    }

    /**
     * Get the abyssCollect property: The abyss_collect property.
     * 
     * @return the abyssCollect value.
     */
    @Metadata(properties = { MetadataProperties.GENERATED })
    public List<Map<String, BinaryData>> getAbyssCollect() {
        return this.abyssCollect;
    }

    /**
     * Get the abyssDuty property: The abyss_duty property.
     * 
     * @return the abyssDuty value.
     */
    @Metadata(properties = { MetadataProperties.GENERATED })
    public BinaryData getAbyssDuty() {
        return this.abyssDuty;
    }

    /**
     * Get the abyssLevel property: The abyss_level property.
     * 
     * @return the abyssLevel value.
     */
    @Metadata(properties = { MetadataProperties.GENERATED })
    public Map<String, BinaryData> getAbyssLevel() {
        return this.abyssLevel;
    }

    /**
     * Get the abyssNest property: The abyss_nest property.
     * 
     * @return the abyssNest value.
     */
    @Metadata(properties = { MetadataProperties.GENERATED })
    public Map<String, BinaryData> getAbyssNest() {
        return this.abyssNest;
    }

    /**
     * Get the abyssPoint property: The abyss_point property.
     * 
     * @return the abyssPoint value.
     */
    @Metadata(properties = { MetadataProperties.GENERATED })
    public Map<String, BinaryData> getAbyssPoint() {
        return this.abyssPoint;
    }

    /**
     * Get the abyssTalent property: The abyss_talent property.
     * 
     * @return the abyssTalent value.
     */
    @Metadata(properties = { MetadataProperties.GENERATED })
    public Map<String, BinaryData> getAbyssTalent() {
        return this.abyssTalent;
    }

    /**
     * Get the abyssThrone property: The abyss_throne property.
     * 
     * @return the abyssThrone value.
     */
    @Metadata(properties = { MetadataProperties.GENERATED })
    public Map<String, BinaryData> getAbyssThrone() {
        return this.abyssThrone;
    }

    /**
     * Get the refreshTime property: The refresh_time property.
     * 
     * @return the refreshTime value.
     */
    @Metadata(properties = { MetadataProperties.GENERATED })
    public Long getRefreshTime() {
        return this.refreshTime;
    }

    /**
     * Get the unlock property: The unlock property.
     * 
     * @return the unlock value.
     */
    @Metadata(properties = { MetadataProperties.GENERATED })
    public Boolean isUnlock() {
        return this.unlock;
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
        jsonWriter.writeArrayField("abyss_collect", this.abyssCollect,
            (writer, element) -> writer.writeMap(element, (writer1, element1) -> {
                if (element1 == null) {
                    writer1.writeNull();
                } else {
                    element1.writeTo(writer1);
                }
            }));
        if (this.abyssDuty != null) {
            jsonWriter.writeFieldName("abyss_duty");
            this.abyssDuty.writeTo(jsonWriter);
        }
        jsonWriter.writeMapField("abyss_level", this.abyssLevel, (writer, element) -> {
            if (element == null) {
                writer.writeNull();
            } else {
                element.writeTo(writer);
            }
        });
        jsonWriter.writeMapField("abyss_nest", this.abyssNest, (writer, element) -> {
            if (element == null) {
                writer.writeNull();
            } else {
                element.writeTo(writer);
            }
        });
        jsonWriter.writeMapField("abyss_point", this.abyssPoint, (writer, element) -> {
            if (element == null) {
                writer.writeNull();
            } else {
                element.writeTo(writer);
            }
        });
        jsonWriter.writeMapField("abyss_talent", this.abyssTalent, (writer, element) -> {
            if (element == null) {
                writer.writeNull();
            } else {
                element.writeTo(writer);
            }
        });
        jsonWriter.writeMapField("abyss_throne", this.abyssThrone, (writer, element) -> {
            if (element == null) {
                writer.writeNull();
            } else {
                element.writeTo(writer);
            }
        });
        jsonWriter.writeNumberField("refresh_time", this.refreshTime);
        jsonWriter.writeBooleanField("unlock", this.unlock);
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
     * Reads an instance of ZenlessAbyssSummaryData from the JsonReader.
     * 
     * @param jsonReader The JsonReader being read.
     * @return An instance of ZenlessAbyssSummaryData if the JsonReader was pointing to an instance of it, or null if it
     * was pointing to JSON null.
     * @throws IOException If an error occurs while reading the ZenlessAbyssSummaryData.
     */
    @Metadata(properties = { MetadataProperties.GENERATED })
    public static ZenlessAbyssSummaryData fromJson(JsonReader jsonReader) throws IOException {
        return jsonReader.readObject(reader -> {
            ZenlessAbyssSummaryData deserializedZenlessAbyssSummaryData = new ZenlessAbyssSummaryData();
            Map<String, BinaryData> additionalProperties = null;
            while (reader.nextToken() != JsonToken.END_OBJECT) {
                String fieldName = reader.getFieldName();
                reader.nextToken();

                if ("abyss_collect".equals(fieldName)) {
                    List<Map<String, BinaryData>> abyssCollect
                        = reader.readArray(reader1 -> reader1.readMap(reader2 -> reader2
                            .getNullable(nonNullReader -> BinaryData.fromObject(nonNullReader.readUntyped()))));
                    deserializedZenlessAbyssSummaryData.abyssCollect = abyssCollect;
                } else if ("abyss_duty".equals(fieldName)) {
                    deserializedZenlessAbyssSummaryData.abyssDuty
                        = reader.getNullable(nonNullReader -> BinaryData.fromObject(nonNullReader.readUntyped()));
                } else if ("abyss_level".equals(fieldName)) {
                    Map<String, BinaryData> abyssLevel = reader.readMap(reader1 -> reader1
                        .getNullable(nonNullReader -> BinaryData.fromObject(nonNullReader.readUntyped())));
                    deserializedZenlessAbyssSummaryData.abyssLevel = abyssLevel;
                } else if ("abyss_nest".equals(fieldName)) {
                    Map<String, BinaryData> abyssNest = reader.readMap(reader1 -> reader1
                        .getNullable(nonNullReader -> BinaryData.fromObject(nonNullReader.readUntyped())));
                    deserializedZenlessAbyssSummaryData.abyssNest = abyssNest;
                } else if ("abyss_point".equals(fieldName)) {
                    Map<String, BinaryData> abyssPoint = reader.readMap(reader1 -> reader1
                        .getNullable(nonNullReader -> BinaryData.fromObject(nonNullReader.readUntyped())));
                    deserializedZenlessAbyssSummaryData.abyssPoint = abyssPoint;
                } else if ("abyss_talent".equals(fieldName)) {
                    Map<String, BinaryData> abyssTalent = reader.readMap(reader1 -> reader1
                        .getNullable(nonNullReader -> BinaryData.fromObject(nonNullReader.readUntyped())));
                    deserializedZenlessAbyssSummaryData.abyssTalent = abyssTalent;
                } else if ("abyss_throne".equals(fieldName)) {
                    Map<String, BinaryData> abyssThrone = reader.readMap(reader1 -> reader1
                        .getNullable(nonNullReader -> BinaryData.fromObject(nonNullReader.readUntyped())));
                    deserializedZenlessAbyssSummaryData.abyssThrone = abyssThrone;
                } else if ("refresh_time".equals(fieldName)) {
                    deserializedZenlessAbyssSummaryData.refreshTime = reader.getNullable(JsonReader::getLong);
                } else if ("unlock".equals(fieldName)) {
                    deserializedZenlessAbyssSummaryData.unlock = reader.getNullable(JsonReader::getBoolean);
                } else {
                    if (additionalProperties == null) {
                        additionalProperties = new LinkedHashMap<>();
                    }

                    additionalProperties.put(fieldName,
                        reader.getNullable(nonNullReader -> BinaryData.fromObject(nonNullReader.readUntyped())));
                }
            }
            deserializedZenlessAbyssSummaryData.additionalProperties = additionalProperties;

            return deserializedZenlessAbyssSummaryData;
        });
    }
}
