package uigf.mihoyo.game;

import io.clientcore.core.annotations.Metadata;
import io.clientcore.core.annotations.MetadataProperties;
import io.clientcore.core.serialization.json.JsonReader;
import io.clientcore.core.serialization.json.JsonSerializable;
import io.clientcore.core.serialization.json.JsonToken;
import io.clientcore.core.serialization.json.JsonWriter;
import java.io.IOException;

/**
 * The CharacterListRequest model.
 */
@Metadata(properties = { MetadataProperties.FLUENT })
public class CharacterListRequest implements JsonSerializable<CharacterListRequest> {
    /*
     * The role_id property.
     */
    @Metadata(properties = { MetadataProperties.GENERATED })
    private final String roleId;

    /*
     * The server property.
     */
    @Metadata(properties = { MetadataProperties.GENERATED })
    private final String server;

    /*
     * The sort_type property.
     */
    @Metadata(properties = { MetadataProperties.GENERATED })
    private Integer sortType;

    /**
     * Creates an instance of CharacterListRequest class.
     * 
     * @param roleId the roleId value to set.
     * @param server the server value to set.
     */
    @Metadata(properties = { MetadataProperties.GENERATED })
    public CharacterListRequest(String roleId, String server) {
        this.roleId = roleId;
        this.server = server;
    }

    /**
     * Get the roleId property: The role_id property.
     * 
     * @return the roleId value.
     */
    @Metadata(properties = { MetadataProperties.GENERATED })
    public String getRoleId() {
        return this.roleId;
    }

    /**
     * Get the server property: The server property.
     * 
     * @return the server value.
     */
    @Metadata(properties = { MetadataProperties.GENERATED })
    public String getServer() {
        return this.server;
    }

    /**
     * Get the sortType property: The sort_type property.
     * 
     * @return the sortType value.
     */
    @Metadata(properties = { MetadataProperties.GENERATED })
    public Integer getSortType() {
        return this.sortType;
    }

    /**
     * Set the sortType property: The sort_type property.
     * 
     * @param sortType the sortType value to set.
     * @return the CharacterListRequest object itself.
     */
    @Metadata(properties = { MetadataProperties.GENERATED })
    public CharacterListRequest setSortType(Integer sortType) {
        this.sortType = sortType;
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Metadata(properties = { MetadataProperties.GENERATED })
    @Override
    public JsonWriter toJson(JsonWriter jsonWriter) throws IOException {
        jsonWriter.writeStartObject();
        jsonWriter.writeStringField("role_id", this.roleId);
        jsonWriter.writeStringField("server", this.server);
        jsonWriter.writeNumberField("sort_type", this.sortType);
        return jsonWriter.writeEndObject();
    }

    /**
     * Reads an instance of CharacterListRequest from the JsonReader.
     * 
     * @param jsonReader The JsonReader being read.
     * @return An instance of CharacterListRequest if the JsonReader was pointing to an instance of it, or null if it
     * was pointing to JSON null.
     * @throws IllegalStateException If the deserialized JSON object was missing any required properties.
     * @throws IOException If an error occurs while reading the CharacterListRequest.
     */
    @Metadata(properties = { MetadataProperties.GENERATED })
    public static CharacterListRequest fromJson(JsonReader jsonReader) throws IOException {
        return jsonReader.readObject(reader -> {
            String roleId = null;
            String server = null;
            Integer sortType = null;
            while (reader.nextToken() != JsonToken.END_OBJECT) {
                String fieldName = reader.getFieldName();
                reader.nextToken();

                if ("role_id".equals(fieldName)) {
                    roleId = reader.getString();
                } else if ("server".equals(fieldName)) {
                    server = reader.getString();
                } else if ("sort_type".equals(fieldName)) {
                    sortType = reader.getNullable(JsonReader::getInt);
                } else {
                    reader.skipChildren();
                }
            }
            CharacterListRequest deserializedCharacterListRequest = new CharacterListRequest(roleId, server);
            deserializedCharacterListRequest.sortType = sortType;

            return deserializedCharacterListRequest;
        });
    }
}
