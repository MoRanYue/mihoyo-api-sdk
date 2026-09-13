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
 * The MobileUnreadMessageData model.
 */
@Metadata(properties = { MetadataProperties.IMMUTABLE })
public final class MobileUnreadMessageData implements JsonSerializable<MobileUnreadMessageData> {
    /*
     * The chat_unread property.
     */
    @Metadata(properties = { MetadataProperties.GENERATED })
    private Map<String, BinaryData> chatUnread;

    /*
     * The notification_unread property.
     */
    @Metadata(properties = { MetadataProperties.GENERATED })
    private Map<String, BinaryData> notificationUnread;

    /*
     * The sem_notification property.
     */
    @Metadata(properties = { MetadataProperties.GENERATED })
    private Map<String, BinaryData> semNotification;

    /*
     * Additional properties
     */
    @Metadata(properties = { MetadataProperties.GENERATED })
    private Map<String, BinaryData> additionalProperties;

    /**
     * Creates an instance of MobileUnreadMessageData class.
     */
    @Metadata(properties = { MetadataProperties.GENERATED })
    private MobileUnreadMessageData() {
    }

    /**
     * Get the chatUnread property: The chat_unread property.
     * 
     * @return the chatUnread value.
     */
    @Metadata(properties = { MetadataProperties.GENERATED })
    public Map<String, BinaryData> getChatUnread() {
        return this.chatUnread;
    }

    /**
     * Get the notificationUnread property: The notification_unread property.
     * 
     * @return the notificationUnread value.
     */
    @Metadata(properties = { MetadataProperties.GENERATED })
    public Map<String, BinaryData> getNotificationUnread() {
        return this.notificationUnread;
    }

    /**
     * Get the semNotification property: The sem_notification property.
     * 
     * @return the semNotification value.
     */
    @Metadata(properties = { MetadataProperties.GENERATED })
    public Map<String, BinaryData> getSemNotification() {
        return this.semNotification;
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
        jsonWriter.writeMapField("chat_unread", this.chatUnread, (writer, element) -> {
            if (element == null) {
                writer.writeNull();
            } else {
                element.writeTo(writer);
            }
        });
        jsonWriter.writeMapField("notification_unread", this.notificationUnread, (writer, element) -> {
            if (element == null) {
                writer.writeNull();
            } else {
                element.writeTo(writer);
            }
        });
        jsonWriter.writeMapField("sem_notification", this.semNotification, (writer, element) -> {
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
     * Reads an instance of MobileUnreadMessageData from the JsonReader.
     * 
     * @param jsonReader The JsonReader being read.
     * @return An instance of MobileUnreadMessageData if the JsonReader was pointing to an instance of it, or null if it
     * was pointing to JSON null.
     * @throws IOException If an error occurs while reading the MobileUnreadMessageData.
     */
    @Metadata(properties = { MetadataProperties.GENERATED })
    public static MobileUnreadMessageData fromJson(JsonReader jsonReader) throws IOException {
        return jsonReader.readObject(reader -> {
            MobileUnreadMessageData deserializedMobileUnreadMessageData = new MobileUnreadMessageData();
            Map<String, BinaryData> additionalProperties = null;
            while (reader.nextToken() != JsonToken.END_OBJECT) {
                String fieldName = reader.getFieldName();
                reader.nextToken();

                if ("chat_unread".equals(fieldName)) {
                    Map<String, BinaryData> chatUnread = reader.readMap(reader1 -> reader1
                        .getNullable(nonNullReader -> BinaryData.fromObject(nonNullReader.readUntyped())));
                    deserializedMobileUnreadMessageData.chatUnread = chatUnread;
                } else if ("notification_unread".equals(fieldName)) {
                    Map<String, BinaryData> notificationUnread = reader.readMap(reader1 -> reader1
                        .getNullable(nonNullReader -> BinaryData.fromObject(nonNullReader.readUntyped())));
                    deserializedMobileUnreadMessageData.notificationUnread = notificationUnread;
                } else if ("sem_notification".equals(fieldName)) {
                    Map<String, BinaryData> semNotification = reader.readMap(reader1 -> reader1
                        .getNullable(nonNullReader -> BinaryData.fromObject(nonNullReader.readUntyped())));
                    deserializedMobileUnreadMessageData.semNotification = semNotification;
                } else {
                    if (additionalProperties == null) {
                        additionalProperties = new LinkedHashMap<>();
                    }

                    additionalProperties.put(fieldName,
                        reader.getNullable(nonNullReader -> BinaryData.fromObject(nonNullReader.readUntyped())));
                }
            }
            deserializedMobileUnreadMessageData.additionalProperties = additionalProperties;

            return deserializedMobileUnreadMessageData;
        });
    }
}
