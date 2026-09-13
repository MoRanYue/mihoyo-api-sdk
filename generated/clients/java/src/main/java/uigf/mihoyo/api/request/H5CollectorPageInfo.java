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
 * The H5CollectorPageInfo model.
 */
@Metadata(properties = { MetadataProperties.FLUENT })
public final class H5CollectorPageInfo implements JsonSerializable<H5CollectorPageInfo> {
    /*
     * The app_id property.
     */
    @Metadata(properties = { MetadataProperties.GENERATED })
    private String appId;

    /*
     * The document_referrer property.
     */
    @Metadata(properties = { MetadataProperties.GENERATED })
    private String documentReferrer;

    /*
     * The extra_info property.
     */
    @Metadata(properties = { MetadataProperties.GENERATED })
    private H5CollectorPageExtraInfo extraInfo;

    /*
     * The page_fullurl property.
     */
    @Metadata(properties = { MetadataProperties.GENERATED })
    private String pageFullurl;

    /*
     * The page_name property.
     */
    @Metadata(properties = { MetadataProperties.GENERATED })
    private String pageName;

    /*
     * The page_url property.
     */
    @Metadata(properties = { MetadataProperties.GENERATED })
    private String pageUrl;

    /*
     * Additional properties
     */
    @Metadata(properties = { MetadataProperties.GENERATED })
    private Map<String, BinaryData> additionalProperties;

    /**
     * Creates an instance of H5CollectorPageInfo class.
     */
    @Metadata(properties = { MetadataProperties.GENERATED })
    public H5CollectorPageInfo() {
    }

    /**
     * Get the appId property: The app_id property.
     * 
     * @return the appId value.
     */
    @Metadata(properties = { MetadataProperties.GENERATED })
    public String getAppId() {
        return this.appId;
    }

    /**
     * Set the appId property: The app_id property.
     * 
     * @param appId the appId value to set.
     * @return the H5CollectorPageInfo object itself.
     */
    @Metadata(properties = { MetadataProperties.GENERATED })
    public H5CollectorPageInfo setAppId(String appId) {
        this.appId = appId;
        return this;
    }

    /**
     * Get the documentReferrer property: The document_referrer property.
     * 
     * @return the documentReferrer value.
     */
    @Metadata(properties = { MetadataProperties.GENERATED })
    public String getDocumentReferrer() {
        return this.documentReferrer;
    }

    /**
     * Set the documentReferrer property: The document_referrer property.
     * 
     * @param documentReferrer the documentReferrer value to set.
     * @return the H5CollectorPageInfo object itself.
     */
    @Metadata(properties = { MetadataProperties.GENERATED })
    public H5CollectorPageInfo setDocumentReferrer(String documentReferrer) {
        this.documentReferrer = documentReferrer;
        return this;
    }

    /**
     * Get the extraInfo property: The extra_info property.
     * 
     * @return the extraInfo value.
     */
    @Metadata(properties = { MetadataProperties.GENERATED })
    public H5CollectorPageExtraInfo getExtraInfo() {
        return this.extraInfo;
    }

    /**
     * Set the extraInfo property: The extra_info property.
     * 
     * @param extraInfo the extraInfo value to set.
     * @return the H5CollectorPageInfo object itself.
     */
    @Metadata(properties = { MetadataProperties.GENERATED })
    public H5CollectorPageInfo setExtraInfo(H5CollectorPageExtraInfo extraInfo) {
        this.extraInfo = extraInfo;
        return this;
    }

    /**
     * Get the pageFullurl property: The page_fullurl property.
     * 
     * @return the pageFullurl value.
     */
    @Metadata(properties = { MetadataProperties.GENERATED })
    public String getPageFullurl() {
        return this.pageFullurl;
    }

    /**
     * Set the pageFullurl property: The page_fullurl property.
     * 
     * @param pageFullurl the pageFullurl value to set.
     * @return the H5CollectorPageInfo object itself.
     */
    @Metadata(properties = { MetadataProperties.GENERATED })
    public H5CollectorPageInfo setPageFullurl(String pageFullurl) {
        this.pageFullurl = pageFullurl;
        return this;
    }

    /**
     * Get the pageName property: The page_name property.
     * 
     * @return the pageName value.
     */
    @Metadata(properties = { MetadataProperties.GENERATED })
    public String getPageName() {
        return this.pageName;
    }

    /**
     * Set the pageName property: The page_name property.
     * 
     * @param pageName the pageName value to set.
     * @return the H5CollectorPageInfo object itself.
     */
    @Metadata(properties = { MetadataProperties.GENERATED })
    public H5CollectorPageInfo setPageName(String pageName) {
        this.pageName = pageName;
        return this;
    }

    /**
     * Get the pageUrl property: The page_url property.
     * 
     * @return the pageUrl value.
     */
    @Metadata(properties = { MetadataProperties.GENERATED })
    public String getPageUrl() {
        return this.pageUrl;
    }

    /**
     * Set the pageUrl property: The page_url property.
     * 
     * @param pageUrl the pageUrl value to set.
     * @return the H5CollectorPageInfo object itself.
     */
    @Metadata(properties = { MetadataProperties.GENERATED })
    public H5CollectorPageInfo setPageUrl(String pageUrl) {
        this.pageUrl = pageUrl;
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
     * @return the H5CollectorPageInfo object itself.
     */
    @Metadata(properties = { MetadataProperties.GENERATED })
    public H5CollectorPageInfo setAdditionalProperties(Map<String, BinaryData> additionalProperties) {
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
        jsonWriter.writeStringField("app_id", this.appId);
        jsonWriter.writeStringField("document_referrer", this.documentReferrer);
        jsonWriter.writeJsonField("extra_info", this.extraInfo);
        jsonWriter.writeStringField("page_fullurl", this.pageFullurl);
        jsonWriter.writeStringField("page_name", this.pageName);
        jsonWriter.writeStringField("page_url", this.pageUrl);
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
     * Reads an instance of H5CollectorPageInfo from the JsonReader.
     * 
     * @param jsonReader The JsonReader being read.
     * @return An instance of H5CollectorPageInfo if the JsonReader was pointing to an instance of it, or null if it was
     * pointing to JSON null.
     * @throws IOException If an error occurs while reading the H5CollectorPageInfo.
     */
    @Metadata(properties = { MetadataProperties.GENERATED })
    public static H5CollectorPageInfo fromJson(JsonReader jsonReader) throws IOException {
        return jsonReader.readObject(reader -> {
            H5CollectorPageInfo deserializedH5CollectorPageInfo = new H5CollectorPageInfo();
            Map<String, BinaryData> additionalProperties = null;
            while (reader.nextToken() != JsonToken.END_OBJECT) {
                String fieldName = reader.getFieldName();
                reader.nextToken();

                if ("app_id".equals(fieldName)) {
                    deserializedH5CollectorPageInfo.appId = reader.getString();
                } else if ("document_referrer".equals(fieldName)) {
                    deserializedH5CollectorPageInfo.documentReferrer = reader.getString();
                } else if ("extra_info".equals(fieldName)) {
                    deserializedH5CollectorPageInfo.extraInfo = H5CollectorPageExtraInfo.fromJson(reader);
                } else if ("page_fullurl".equals(fieldName)) {
                    deserializedH5CollectorPageInfo.pageFullurl = reader.getString();
                } else if ("page_name".equals(fieldName)) {
                    deserializedH5CollectorPageInfo.pageName = reader.getString();
                } else if ("page_url".equals(fieldName)) {
                    deserializedH5CollectorPageInfo.pageUrl = reader.getString();
                } else {
                    if (additionalProperties == null) {
                        additionalProperties = new LinkedHashMap<>();
                    }

                    additionalProperties.put(fieldName,
                        reader.getNullable(nonNullReader -> BinaryData.fromObject(nonNullReader.readUntyped())));
                }
            }
            deserializedH5CollectorPageInfo.additionalProperties = additionalProperties;

            return deserializedH5CollectorPageInfo;
        });
    }
}
