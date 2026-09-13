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
 * The ZenlessClimbingTowerDetailData model.
 */
@Metadata(properties = { MetadataProperties.IMMUTABLE })
public final class ZenlessClimbingTowerDetailData implements JsonSerializable<ZenlessClimbingTowerDetailData> {
    /*
     * The climbing_tower_s1 property.
     */
    @Metadata(properties = { MetadataProperties.GENERATED })
    private BinaryData climbingTowerS1;

    /*
     * The climbing_tower_s2 property.
     */
    @Metadata(properties = { MetadataProperties.GENERATED })
    private BinaryData climbingTowerS2;

    /*
     * The climbing_tower_s3 property.
     */
    @Metadata(properties = { MetadataProperties.GENERATED })
    private BinaryData climbingTowerS3;

    /*
     * The climbing_tower_s4 property.
     */
    @Metadata(properties = { MetadataProperties.GENERATED })
    private BinaryData climbingTowerS4;

    /*
     * Additional properties
     */
    @Metadata(properties = { MetadataProperties.GENERATED })
    private Map<String, BinaryData> additionalProperties;

    /**
     * Creates an instance of ZenlessClimbingTowerDetailData class.
     */
    @Metadata(properties = { MetadataProperties.GENERATED })
    private ZenlessClimbingTowerDetailData() {
    }

    /**
     * Get the climbingTowerS1 property: The climbing_tower_s1 property.
     * 
     * @return the climbingTowerS1 value.
     */
    @Metadata(properties = { MetadataProperties.GENERATED })
    public BinaryData getClimbingTowerS1() {
        return this.climbingTowerS1;
    }

    /**
     * Get the climbingTowerS2 property: The climbing_tower_s2 property.
     * 
     * @return the climbingTowerS2 value.
     */
    @Metadata(properties = { MetadataProperties.GENERATED })
    public BinaryData getClimbingTowerS2() {
        return this.climbingTowerS2;
    }

    /**
     * Get the climbingTowerS3 property: The climbing_tower_s3 property.
     * 
     * @return the climbingTowerS3 value.
     */
    @Metadata(properties = { MetadataProperties.GENERATED })
    public BinaryData getClimbingTowerS3() {
        return this.climbingTowerS3;
    }

    /**
     * Get the climbingTowerS4 property: The climbing_tower_s4 property.
     * 
     * @return the climbingTowerS4 value.
     */
    @Metadata(properties = { MetadataProperties.GENERATED })
    public BinaryData getClimbingTowerS4() {
        return this.climbingTowerS4;
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
        if (this.climbingTowerS1 != null) {
            jsonWriter.writeFieldName("climbing_tower_s1");
            this.climbingTowerS1.writeTo(jsonWriter);
        }
        if (this.climbingTowerS2 != null) {
            jsonWriter.writeFieldName("climbing_tower_s2");
            this.climbingTowerS2.writeTo(jsonWriter);
        }
        if (this.climbingTowerS3 != null) {
            jsonWriter.writeFieldName("climbing_tower_s3");
            this.climbingTowerS3.writeTo(jsonWriter);
        }
        if (this.climbingTowerS4 != null) {
            jsonWriter.writeFieldName("climbing_tower_s4");
            this.climbingTowerS4.writeTo(jsonWriter);
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
     * Reads an instance of ZenlessClimbingTowerDetailData from the JsonReader.
     * 
     * @param jsonReader The JsonReader being read.
     * @return An instance of ZenlessClimbingTowerDetailData if the JsonReader was pointing to an instance of it, or
     * null if it was pointing to JSON null.
     * @throws IOException If an error occurs while reading the ZenlessClimbingTowerDetailData.
     */
    @Metadata(properties = { MetadataProperties.GENERATED })
    public static ZenlessClimbingTowerDetailData fromJson(JsonReader jsonReader) throws IOException {
        return jsonReader.readObject(reader -> {
            ZenlessClimbingTowerDetailData deserializedZenlessClimbingTowerDetailData
                = new ZenlessClimbingTowerDetailData();
            Map<String, BinaryData> additionalProperties = null;
            while (reader.nextToken() != JsonToken.END_OBJECT) {
                String fieldName = reader.getFieldName();
                reader.nextToken();

                if ("climbing_tower_s1".equals(fieldName)) {
                    deserializedZenlessClimbingTowerDetailData.climbingTowerS1
                        = reader.getNullable(nonNullReader -> BinaryData.fromObject(nonNullReader.readUntyped()));
                } else if ("climbing_tower_s2".equals(fieldName)) {
                    deserializedZenlessClimbingTowerDetailData.climbingTowerS2
                        = reader.getNullable(nonNullReader -> BinaryData.fromObject(nonNullReader.readUntyped()));
                } else if ("climbing_tower_s3".equals(fieldName)) {
                    deserializedZenlessClimbingTowerDetailData.climbingTowerS3
                        = reader.getNullable(nonNullReader -> BinaryData.fromObject(nonNullReader.readUntyped()));
                } else if ("climbing_tower_s4".equals(fieldName)) {
                    deserializedZenlessClimbingTowerDetailData.climbingTowerS4
                        = reader.getNullable(nonNullReader -> BinaryData.fromObject(nonNullReader.readUntyped()));
                } else {
                    if (additionalProperties == null) {
                        additionalProperties = new LinkedHashMap<>();
                    }

                    additionalProperties.put(fieldName,
                        reader.getNullable(nonNullReader -> BinaryData.fromObject(nonNullReader.readUntyped())));
                }
            }
            deserializedZenlessClimbingTowerDetailData.additionalProperties = additionalProperties;

            return deserializedZenlessClimbingTowerDetailData;
        });
    }
}
