package uigf.mihoyo.api.request;

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
 * The MobileStartupRequestPayload model.
 */
@Metadata(properties = { MetadataProperties.FLUENT })
public final class MobileStartupRequestPayload implements JsonSerializable<MobileStartupRequestPayload> {
    /*
     * The fetch_image_template_list_req property.
     */
    @Metadata(properties = { MetadataProperties.GENERATED })
    private MobileStartupImageTemplateRequest fetchImageTemplateListReq;

    /*
     * The get_all_game_role_keyword_req property.
     */
    @Metadata(properties = { MetadataProperties.GENERATED })
    private Map<String, BinaryData> getAllGameRoleKeywordReq;

    /*
     * The get_all_static_resource_versions_req property.
     */
    @Metadata(properties = { MetadataProperties.GENERATED })
    private Map<String, BinaryData> getAllStaticResourceVersionsReq;

    /*
     * The get_app_config_request property.
     */
    @Metadata(properties = { MetadataProperties.GENERATED })
    private Map<String, BinaryData> getAppConfigRequest;

    /*
     * The get_app_media_data_req property.
     */
    @Metadata(properties = { MetadataProperties.GENERATED })
    private Map<String, BinaryData> getAppMediaDataReq;

    /*
     * The get_link_card_whitelist_req property.
     */
    @Metadata(properties = { MetadataProperties.GENERATED })
    private Map<String, BinaryData> getLinkCardWhitelistReq;

    /*
     * The get_teenager_info_req property.
     */
    @Metadata(properties = { MetadataProperties.GENERATED })
    private Map<String, BinaryData> getTeenagerInfoReq;

    /*
     * The recent_emoticon_list_req property.
     */
    @Metadata(properties = { MetadataProperties.GENERATED })
    private Map<String, BinaryData> recentEmoticonListReq;

    /*
     * Additional properties
     */
    @Metadata(properties = { MetadataProperties.GENERATED })
    private Map<String, BinaryData> additionalProperties;

    /**
     * Creates an instance of MobileStartupRequestPayload class.
     */
    @Metadata(properties = { MetadataProperties.GENERATED })
    public MobileStartupRequestPayload() {
    }

    /**
     * Get the fetchImageTemplateListReq property: The fetch_image_template_list_req property.
     * 
     * @return the fetchImageTemplateListReq value.
     */
    @Metadata(properties = { MetadataProperties.GENERATED })
    public MobileStartupImageTemplateRequest getFetchImageTemplateListReq() {
        return this.fetchImageTemplateListReq;
    }

    /**
     * Set the fetchImageTemplateListReq property: The fetch_image_template_list_req property.
     * 
     * @param fetchImageTemplateListReq the fetchImageTemplateListReq value to set.
     * @return the MobileStartupRequestPayload object itself.
     */
    @Metadata(properties = { MetadataProperties.GENERATED })
    public MobileStartupRequestPayload
        setFetchImageTemplateListReq(MobileStartupImageTemplateRequest fetchImageTemplateListReq) {
        this.fetchImageTemplateListReq = fetchImageTemplateListReq;
        return this;
    }

    /**
     * Get the getAllGameRoleKeywordReq property: The get_all_game_role_keyword_req property.
     * 
     * @return the getAllGameRoleKeywordReq value.
     */
    @Metadata(properties = { MetadataProperties.GENERATED })
    public Map<String, BinaryData> getGetAllGameRoleKeywordReq() {
        return this.getAllGameRoleKeywordReq;
    }

    /**
     * Set the getAllGameRoleKeywordReq property: The get_all_game_role_keyword_req property.
     * 
     * @param getAllGameRoleKeywordReq the getAllGameRoleKeywordReq value to set.
     * @return the MobileStartupRequestPayload object itself.
     */
    @Metadata(properties = { MetadataProperties.GENERATED })
    public MobileStartupRequestPayload setGetAllGameRoleKeywordReq(Map<String, BinaryData> getAllGameRoleKeywordReq) {
        this.getAllGameRoleKeywordReq = getAllGameRoleKeywordReq;
        return this;
    }

    /**
     * Get the getAllStaticResourceVersionsReq property: The get_all_static_resource_versions_req property.
     * 
     * @return the getAllStaticResourceVersionsReq value.
     */
    @Metadata(properties = { MetadataProperties.GENERATED })
    public Map<String, BinaryData> getGetAllStaticResourceVersionsReq() {
        return this.getAllStaticResourceVersionsReq;
    }

    /**
     * Set the getAllStaticResourceVersionsReq property: The get_all_static_resource_versions_req property.
     * 
     * @param getAllStaticResourceVersionsReq the getAllStaticResourceVersionsReq value to set.
     * @return the MobileStartupRequestPayload object itself.
     */
    @Metadata(properties = { MetadataProperties.GENERATED })
    public MobileStartupRequestPayload
        setGetAllStaticResourceVersionsReq(Map<String, BinaryData> getAllStaticResourceVersionsReq) {
        this.getAllStaticResourceVersionsReq = getAllStaticResourceVersionsReq;
        return this;
    }

    /**
     * Get the getAppConfigRequest property: The get_app_config_request property.
     * 
     * @return the getAppConfigRequest value.
     */
    @Metadata(properties = { MetadataProperties.GENERATED })
    public Map<String, BinaryData> getGetAppConfigRequest() {
        return this.getAppConfigRequest;
    }

    /**
     * Set the getAppConfigRequest property: The get_app_config_request property.
     * 
     * @param getAppConfigRequest the getAppConfigRequest value to set.
     * @return the MobileStartupRequestPayload object itself.
     */
    @Metadata(properties = { MetadataProperties.GENERATED })
    public MobileStartupRequestPayload setGetAppConfigRequest(Map<String, BinaryData> getAppConfigRequest) {
        this.getAppConfigRequest = getAppConfigRequest;
        return this;
    }

    /**
     * Get the getAppMediaDataReq property: The get_app_media_data_req property.
     * 
     * @return the getAppMediaDataReq value.
     */
    @Metadata(properties = { MetadataProperties.GENERATED })
    public Map<String, BinaryData> getGetAppMediaDataReq() {
        return this.getAppMediaDataReq;
    }

    /**
     * Set the getAppMediaDataReq property: The get_app_media_data_req property.
     * 
     * @param getAppMediaDataReq the getAppMediaDataReq value to set.
     * @return the MobileStartupRequestPayload object itself.
     */
    @Metadata(properties = { MetadataProperties.GENERATED })
    public MobileStartupRequestPayload setGetAppMediaDataReq(Map<String, BinaryData> getAppMediaDataReq) {
        this.getAppMediaDataReq = getAppMediaDataReq;
        return this;
    }

    /**
     * Get the getLinkCardWhitelistReq property: The get_link_card_whitelist_req property.
     * 
     * @return the getLinkCardWhitelistReq value.
     */
    @Metadata(properties = { MetadataProperties.GENERATED })
    public Map<String, BinaryData> getGetLinkCardWhitelistReq() {
        return this.getLinkCardWhitelistReq;
    }

    /**
     * Set the getLinkCardWhitelistReq property: The get_link_card_whitelist_req property.
     * 
     * @param getLinkCardWhitelistReq the getLinkCardWhitelistReq value to set.
     * @return the MobileStartupRequestPayload object itself.
     */
    @Metadata(properties = { MetadataProperties.GENERATED })
    public MobileStartupRequestPayload setGetLinkCardWhitelistReq(Map<String, BinaryData> getLinkCardWhitelistReq) {
        this.getLinkCardWhitelistReq = getLinkCardWhitelistReq;
        return this;
    }

    /**
     * Get the getTeenagerInfoReq property: The get_teenager_info_req property.
     * 
     * @return the getTeenagerInfoReq value.
     */
    @Metadata(properties = { MetadataProperties.GENERATED })
    public Map<String, BinaryData> getGetTeenagerInfoReq() {
        return this.getTeenagerInfoReq;
    }

    /**
     * Set the getTeenagerInfoReq property: The get_teenager_info_req property.
     * 
     * @param getTeenagerInfoReq the getTeenagerInfoReq value to set.
     * @return the MobileStartupRequestPayload object itself.
     */
    @Metadata(properties = { MetadataProperties.GENERATED })
    public MobileStartupRequestPayload setGetTeenagerInfoReq(Map<String, BinaryData> getTeenagerInfoReq) {
        this.getTeenagerInfoReq = getTeenagerInfoReq;
        return this;
    }

    /**
     * Get the recentEmoticonListReq property: The recent_emoticon_list_req property.
     * 
     * @return the recentEmoticonListReq value.
     */
    @Metadata(properties = { MetadataProperties.GENERATED })
    public Map<String, BinaryData> getRecentEmoticonListReq() {
        return this.recentEmoticonListReq;
    }

    /**
     * Set the recentEmoticonListReq property: The recent_emoticon_list_req property.
     * 
     * @param recentEmoticonListReq the recentEmoticonListReq value to set.
     * @return the MobileStartupRequestPayload object itself.
     */
    @Metadata(properties = { MetadataProperties.GENERATED })
    public MobileStartupRequestPayload setRecentEmoticonListReq(Map<String, BinaryData> recentEmoticonListReq) {
        this.recentEmoticonListReq = recentEmoticonListReq;
        return this;
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
     * Set the additionalProperties property: Additional properties.
     * 
     * @param additionalProperties the additionalProperties value to set.
     * @return the MobileStartupRequestPayload object itself.
     */
    @Metadata(properties = { MetadataProperties.GENERATED })
    public MobileStartupRequestPayload setAdditionalProperties(Map<String, BinaryData> additionalProperties) {
        this.additionalProperties = additionalProperties;
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Metadata(properties = { MetadataProperties.GENERATED })
    @Override
    public JsonWriter toJson(JsonWriter jsonWriter) throws IOException {
        jsonWriter.writeStartObject();
        jsonWriter.writeJsonField("fetch_image_template_list_req", this.fetchImageTemplateListReq);
        jsonWriter.writeMapField("get_all_game_role_keyword_req", this.getAllGameRoleKeywordReq, (writer, element) -> {
            if (element == null) {
                writer.writeNull();
            } else {
                element.writeTo(writer);
            }
        });
        jsonWriter.writeMapField("get_all_static_resource_versions_req", this.getAllStaticResourceVersionsReq,
            (writer, element) -> {
                if (element == null) {
                    writer.writeNull();
                } else {
                    element.writeTo(writer);
                }
            });
        jsonWriter.writeMapField("get_app_config_request", this.getAppConfigRequest, (writer, element) -> {
            if (element == null) {
                writer.writeNull();
            } else {
                element.writeTo(writer);
            }
        });
        jsonWriter.writeMapField("get_app_media_data_req", this.getAppMediaDataReq, (writer, element) -> {
            if (element == null) {
                writer.writeNull();
            } else {
                element.writeTo(writer);
            }
        });
        jsonWriter.writeMapField("get_link_card_whitelist_req", this.getLinkCardWhitelistReq, (writer, element) -> {
            if (element == null) {
                writer.writeNull();
            } else {
                element.writeTo(writer);
            }
        });
        jsonWriter.writeMapField("get_teenager_info_req", this.getTeenagerInfoReq, (writer, element) -> {
            if (element == null) {
                writer.writeNull();
            } else {
                element.writeTo(writer);
            }
        });
        jsonWriter.writeMapField("recent_emoticon_list_req", this.recentEmoticonListReq, (writer, element) -> {
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
     * Reads an instance of MobileStartupRequestPayload from the JsonReader.
     * 
     * @param jsonReader The JsonReader being read.
     * @return An instance of MobileStartupRequestPayload if the JsonReader was pointing to an instance of it, or null
     * if it was pointing to JSON null.
     * @throws IOException If an error occurs while reading the MobileStartupRequestPayload.
     */
    @Metadata(properties = { MetadataProperties.GENERATED })
    public static MobileStartupRequestPayload fromJson(JsonReader jsonReader) throws IOException {
        return jsonReader.readObject(reader -> {
            MobileStartupRequestPayload deserializedMobileStartupRequestPayload = new MobileStartupRequestPayload();
            Map<String, BinaryData> additionalProperties = null;
            while (reader.nextToken() != JsonToken.END_OBJECT) {
                String fieldName = reader.getFieldName();
                reader.nextToken();

                if ("fetch_image_template_list_req".equals(fieldName)) {
                    deserializedMobileStartupRequestPayload.fetchImageTemplateListReq
                        = MobileStartupImageTemplateRequest.fromJson(reader);
                } else if ("get_all_game_role_keyword_req".equals(fieldName)) {
                    Map<String, BinaryData> getAllGameRoleKeywordReq = reader.readMap(reader1 -> reader1
                        .getNullable(nonNullReader -> BinaryData.fromObject(nonNullReader.readUntyped())));
                    deserializedMobileStartupRequestPayload.getAllGameRoleKeywordReq = getAllGameRoleKeywordReq;
                } else if ("get_all_static_resource_versions_req".equals(fieldName)) {
                    Map<String, BinaryData> getAllStaticResourceVersionsReq = reader.readMap(reader1 -> reader1
                        .getNullable(nonNullReader -> BinaryData.fromObject(nonNullReader.readUntyped())));
                    deserializedMobileStartupRequestPayload.getAllStaticResourceVersionsReq
                        = getAllStaticResourceVersionsReq;
                } else if ("get_app_config_request".equals(fieldName)) {
                    Map<String, BinaryData> getAppConfigRequest = reader.readMap(reader1 -> reader1
                        .getNullable(nonNullReader -> BinaryData.fromObject(nonNullReader.readUntyped())));
                    deserializedMobileStartupRequestPayload.getAppConfigRequest = getAppConfigRequest;
                } else if ("get_app_media_data_req".equals(fieldName)) {
                    Map<String, BinaryData> getAppMediaDataReq = reader.readMap(reader1 -> reader1
                        .getNullable(nonNullReader -> BinaryData.fromObject(nonNullReader.readUntyped())));
                    deserializedMobileStartupRequestPayload.getAppMediaDataReq = getAppMediaDataReq;
                } else if ("get_link_card_whitelist_req".equals(fieldName)) {
                    Map<String, BinaryData> getLinkCardWhitelistReq = reader.readMap(reader1 -> reader1
                        .getNullable(nonNullReader -> BinaryData.fromObject(nonNullReader.readUntyped())));
                    deserializedMobileStartupRequestPayload.getLinkCardWhitelistReq = getLinkCardWhitelistReq;
                } else if ("get_teenager_info_req".equals(fieldName)) {
                    Map<String, BinaryData> getTeenagerInfoReq = reader.readMap(reader1 -> reader1
                        .getNullable(nonNullReader -> BinaryData.fromObject(nonNullReader.readUntyped())));
                    deserializedMobileStartupRequestPayload.getTeenagerInfoReq = getTeenagerInfoReq;
                } else if ("recent_emoticon_list_req".equals(fieldName)) {
                    Map<String, BinaryData> recentEmoticonListReq = reader.readMap(reader1 -> reader1
                        .getNullable(nonNullReader -> BinaryData.fromObject(nonNullReader.readUntyped())));
                    deserializedMobileStartupRequestPayload.recentEmoticonListReq = recentEmoticonListReq;
                } else {
                    if (additionalProperties == null) {
                        additionalProperties = new LinkedHashMap<>();
                    }

                    additionalProperties.put(fieldName,
                        reader.getNullable(nonNullReader -> BinaryData.fromObject(nonNullReader.readUntyped())));
                }
            }
            deserializedMobileStartupRequestPayload.additionalProperties = additionalProperties;

            return deserializedMobileStartupRequestPayload;
        });
    }
}
