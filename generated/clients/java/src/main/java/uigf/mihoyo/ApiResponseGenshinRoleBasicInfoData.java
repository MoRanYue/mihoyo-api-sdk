package uigf.mihoyo;

import io.clientcore.core.annotations.Metadata;
import io.clientcore.core.annotations.MetadataProperties;
import io.clientcore.core.serialization.json.JsonReader;
import io.clientcore.core.serialization.json.JsonSerializable;
import io.clientcore.core.serialization.json.JsonToken;
import io.clientcore.core.serialization.json.JsonWriter;
import java.io.IOException;
import uigf.mihoyo.game.response.GenshinRoleBasicInfoData;

/**
 * Common response wrapper returned by MiHoYo and HoYoLAB services.
 */
@Metadata(properties = { MetadataProperties.IMMUTABLE })
public final class ApiResponseGenshinRoleBasicInfoData
    implements JsonSerializable<ApiResponseGenshinRoleBasicInfoData> {
    /*
     * Vendor result code. `0` normally represents success.
     */
    @Metadata(properties = { MetadataProperties.GENERATED })
    private final int retcode;

    /*
     * Vendor diagnostic message.
     */
    @Metadata(properties = { MetadataProperties.GENERATED })
    private final String message;

    /*
     * Endpoint-specific payload.
     */
    @Metadata(properties = { MetadataProperties.GENERATED })
    private final GenshinRoleBasicInfoData data;

    /**
     * Creates an instance of ApiResponseGenshinRoleBasicInfoData class.
     * 
     * @param retcode the retcode value to set.
     * @param message the message value to set.
     * @param data the data value to set.
     */
    @Metadata(properties = { MetadataProperties.GENERATED })
    private ApiResponseGenshinRoleBasicInfoData(int retcode, String message, GenshinRoleBasicInfoData data) {
        this.retcode = retcode;
        this.message = message;
        this.data = data;
    }

    /**
     * Get the retcode property: Vendor result code. `0` normally represents success.
     * 
     * @return the retcode value.
     */
    @Metadata(properties = { MetadataProperties.GENERATED })
    public int getRetcode() {
        return this.retcode;
    }

    /**
     * Get the message property: Vendor diagnostic message.
     * 
     * @return the message value.
     */
    @Metadata(properties = { MetadataProperties.GENERATED })
    public String getMessage() {
        return this.message;
    }

    /**
     * Get the data property: Endpoint-specific payload.
     * 
     * @return the data value.
     */
    @Metadata(properties = { MetadataProperties.GENERATED })
    public GenshinRoleBasicInfoData getData() {
        return this.data;
    }

    /**
     * {@inheritDoc}
     */
    @Metadata(properties = { MetadataProperties.GENERATED })
    @Override
    public JsonWriter toJson(JsonWriter jsonWriter) throws IOException {
        jsonWriter.writeStartObject();
        jsonWriter.writeIntField("retcode", this.retcode);
        jsonWriter.writeStringField("message", this.message);
        jsonWriter.writeJsonField("data", this.data);
        return jsonWriter.writeEndObject();
    }

    /**
     * Reads an instance of ApiResponseGenshinRoleBasicInfoData from the JsonReader.
     * 
     * @param jsonReader The JsonReader being read.
     * @return An instance of ApiResponseGenshinRoleBasicInfoData if the JsonReader was pointing to an instance of it,
     * or null if it was pointing to JSON null.
     * @throws IllegalStateException If the deserialized JSON object was missing any required properties.
     * @throws IOException If an error occurs while reading the ApiResponseGenshinRoleBasicInfoData.
     */
    @Metadata(properties = { MetadataProperties.GENERATED })
    public static ApiResponseGenshinRoleBasicInfoData fromJson(JsonReader jsonReader) throws IOException {
        return jsonReader.readObject(reader -> {
            int retcode = 0;
            String message = null;
            GenshinRoleBasicInfoData data = null;
            while (reader.nextToken() != JsonToken.END_OBJECT) {
                String fieldName = reader.getFieldName();
                reader.nextToken();

                if ("retcode".equals(fieldName)) {
                    retcode = reader.getInt();
                } else if ("message".equals(fieldName)) {
                    message = reader.getString();
                } else if ("data".equals(fieldName)) {
                    data = GenshinRoleBasicInfoData.fromJson(reader);
                } else {
                    reader.skipChildren();
                }
            }
            return new ApiResponseGenshinRoleBasicInfoData(retcode, message, data);
        });
    }
}
