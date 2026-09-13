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
 * The ZenlessShiyuDefenseData model.
 */
@Metadata(properties = { MetadataProperties.IMMUTABLE })
public final class ZenlessShiyuDefenseData implements JsonSerializable<ZenlessShiyuDefenseData> {
    /*
     * The hadal_info_v2 property.
     */
    @Metadata(properties = { MetadataProperties.GENERATED })
    private Map<String, BinaryData> hadalInfoV2;

    /*
     * The hadal_ver property.
     */
    @Metadata(properties = { MetadataProperties.GENERATED })
    private String hadalVer;

    /*
     * The icon property.
     */
    @Metadata(properties = { MetadataProperties.GENERATED })
    private String icon;

    /*
     * The nick_name property.
     */
    @Metadata(properties = { MetadataProperties.GENERATED })
    private String nickName;

    /*
     * Additional properties
     */
    @Metadata(properties = { MetadataProperties.GENERATED })
    private Map<String, BinaryData> additionalProperties;

    /**
     * Creates an instance of ZenlessShiyuDefenseData class.
     */
    @Metadata(properties = { MetadataProperties.GENERATED })
    private ZenlessShiyuDefenseData() {
    }

    /**
     * Get the hadalInfoV2 property: The hadal_info_v2 property.
     * 
     * @return the hadalInfoV2 value.
     */
    @Metadata(properties = { MetadataProperties.GENERATED })
    public Map<String, BinaryData> getHadalInfoV2() {
        return this.hadalInfoV2;
    }

    /**
     * Get the hadalVer property: The hadal_ver property.
     * 
     * @return the hadalVer value.
     */
    @Metadata(properties = { MetadataProperties.GENERATED })
    public String getHadalVer() {
        return this.hadalVer;
    }

    /**
     * Get the icon property: The icon property.
     * 
     * @return the icon value.
     */
    @Metadata(properties = { MetadataProperties.GENERATED })
    public String getIcon() {
        return this.icon;
    }

    /**
     * Get the nickName property: The nick_name property.
     * 
     * @return the nickName value.
     */
    @Metadata(properties = { MetadataProperties.GENERATED })
    public String getNickName() {
        return this.nickName;
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
        jsonWriter.writeMapField("hadal_info_v2", this.hadalInfoV2, (writer, element) -> {
            if (element == null) {
                writer.writeNull();
            } else {
                element.writeTo(writer);
            }
        });
        jsonWriter.writeStringField("hadal_ver", this.hadalVer);
        jsonWriter.writeStringField("icon", this.icon);
        jsonWriter.writeStringField("nick_name", this.nickName);
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
     * Reads an instance of ZenlessShiyuDefenseData from the JsonReader.
     * 
     * @param jsonReader The JsonReader being read.
     * @return An instance of ZenlessShiyuDefenseData if the JsonReader was pointing to an instance of it, or null if it
     * was pointing to JSON null.
     * @throws IOException If an error occurs while reading the ZenlessShiyuDefenseData.
     */
    @Metadata(properties = { MetadataProperties.GENERATED })
    public static ZenlessShiyuDefenseData fromJson(JsonReader jsonReader) throws IOException {
        return jsonReader.readObject(reader -> {
            ZenlessShiyuDefenseData deserializedZenlessShiyuDefenseData = new ZenlessShiyuDefenseData();
            Map<String, BinaryData> additionalProperties = null;
            while (reader.nextToken() != JsonToken.END_OBJECT) {
                String fieldName = reader.getFieldName();
                reader.nextToken();

                if ("hadal_info_v2".equals(fieldName)) {
                    Map<String, BinaryData> hadalInfoV2 = reader.readMap(reader1 -> reader1
                        .getNullable(nonNullReader -> BinaryData.fromObject(nonNullReader.readUntyped())));
                    deserializedZenlessShiyuDefenseData.hadalInfoV2 = hadalInfoV2;
                } else if ("hadal_ver".equals(fieldName)) {
                    deserializedZenlessShiyuDefenseData.hadalVer = reader.getString();
                } else if ("icon".equals(fieldName)) {
                    deserializedZenlessShiyuDefenseData.icon = reader.getString();
                } else if ("nick_name".equals(fieldName)) {
                    deserializedZenlessShiyuDefenseData.nickName = reader.getString();
                } else {
                    if (additionalProperties == null) {
                        additionalProperties = new LinkedHashMap<>();
                    }

                    additionalProperties.put(fieldName,
                        reader.getNullable(nonNullReader -> BinaryData.fromObject(nonNullReader.readUntyped())));
                }
            }
            deserializedZenlessShiyuDefenseData.additionalProperties = additionalProperties;

            return deserializedZenlessShiyuDefenseData;
        });
    }
}
