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
 * The MobileWindowPrepareData model.
 */
@Metadata(properties = { MetadataProperties.IMMUTABLE })
public final class MobileWindowPrepareData implements JsonSerializable<MobileWindowPrepareData> {
    /*
     * The android_pkg property.
     */
    @Metadata(properties = { MetadataProperties.GENERATED })
    private List<BinaryData> androidPkg;

    /*
     * The ios_app property.
     */
    @Metadata(properties = { MetadataProperties.GENERATED })
    private List<BinaryData> iosApp;

    /*
     * The ticket property.
     */
    @Metadata(properties = { MetadataProperties.GENERATED })
    private String ticket;

    /*
     * Additional properties
     */
    @Metadata(properties = { MetadataProperties.GENERATED })
    private Map<String, BinaryData> additionalProperties;

    /**
     * Creates an instance of MobileWindowPrepareData class.
     */
    @Metadata(properties = { MetadataProperties.GENERATED })
    private MobileWindowPrepareData() {
    }

    /**
     * Get the androidPkg property: The android_pkg property.
     * 
     * @return the androidPkg value.
     */
    @Metadata(properties = { MetadataProperties.GENERATED })
    public List<BinaryData> getAndroidPkg() {
        return this.androidPkg;
    }

    /**
     * Get the iosApp property: The ios_app property.
     * 
     * @return the iosApp value.
     */
    @Metadata(properties = { MetadataProperties.GENERATED })
    public List<BinaryData> getIosApp() {
        return this.iosApp;
    }

    /**
     * Get the ticket property: The ticket property.
     * 
     * @return the ticket value.
     */
    @Metadata(properties = { MetadataProperties.GENERATED })
    public String getTicket() {
        return this.ticket;
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
        jsonWriter.writeArrayField("android_pkg", this.androidPkg, (writer, element) -> {
            if (element == null) {
                writer.writeNull();
            } else {
                element.writeTo(writer);
            }
        });
        jsonWriter.writeArrayField("ios_app", this.iosApp, (writer, element) -> {
            if (element == null) {
                writer.writeNull();
            } else {
                element.writeTo(writer);
            }
        });
        jsonWriter.writeStringField("ticket", this.ticket);
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
     * Reads an instance of MobileWindowPrepareData from the JsonReader.
     * 
     * @param jsonReader The JsonReader being read.
     * @return An instance of MobileWindowPrepareData if the JsonReader was pointing to an instance of it, or null if it
     * was pointing to JSON null.
     * @throws IOException If an error occurs while reading the MobileWindowPrepareData.
     */
    @Metadata(properties = { MetadataProperties.GENERATED })
    public static MobileWindowPrepareData fromJson(JsonReader jsonReader) throws IOException {
        return jsonReader.readObject(reader -> {
            MobileWindowPrepareData deserializedMobileWindowPrepareData = new MobileWindowPrepareData();
            Map<String, BinaryData> additionalProperties = null;
            while (reader.nextToken() != JsonToken.END_OBJECT) {
                String fieldName = reader.getFieldName();
                reader.nextToken();

                if ("android_pkg".equals(fieldName)) {
                    List<BinaryData> androidPkg = reader.readArray(reader1 -> reader1
                        .getNullable(nonNullReader -> BinaryData.fromObject(nonNullReader.readUntyped())));
                    deserializedMobileWindowPrepareData.androidPkg = androidPkg;
                } else if ("ios_app".equals(fieldName)) {
                    List<BinaryData> iosApp = reader.readArray(reader1 -> reader1
                        .getNullable(nonNullReader -> BinaryData.fromObject(nonNullReader.readUntyped())));
                    deserializedMobileWindowPrepareData.iosApp = iosApp;
                } else if ("ticket".equals(fieldName)) {
                    deserializedMobileWindowPrepareData.ticket = reader.getString();
                } else {
                    if (additionalProperties == null) {
                        additionalProperties = new LinkedHashMap<>();
                    }

                    additionalProperties.put(fieldName,
                        reader.getNullable(nonNullReader -> BinaryData.fromObject(nonNullReader.readUntyped())));
                }
            }
            deserializedMobileWindowPrepareData.additionalProperties = additionalProperties;

            return deserializedMobileWindowPrepareData;
        });
    }
}
