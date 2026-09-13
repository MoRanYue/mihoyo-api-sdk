package uigf.mihoyo.commerce;

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
 * The CurrencyAndCountry model.
 */
@Metadata(properties = { MetadataProperties.IMMUTABLE })
public final class CurrencyAndCountry implements JsonSerializable<CurrencyAndCountry> {
    /*
     * The country property.
     */
    @Metadata(properties = { MetadataProperties.GENERATED })
    private String country;

    /*
     * The currency property.
     */
    @Metadata(properties = { MetadataProperties.GENERATED })
    private String currency;

    /*
     * The price_tier_version property.
     */
    @Metadata(properties = { MetadataProperties.GENERATED })
    private String priceTierVersion;

    /*
     * Additional properties
     */
    @Metadata(properties = { MetadataProperties.GENERATED })
    private Map<String, BinaryData> additionalProperties;

    /**
     * Creates an instance of CurrencyAndCountry class.
     */
    @Metadata(properties = { MetadataProperties.GENERATED })
    private CurrencyAndCountry() {
    }

    /**
     * Get the country property: The country property.
     * 
     * @return the country value.
     */
    @Metadata(properties = { MetadataProperties.GENERATED })
    public String getCountry() {
        return this.country;
    }

    /**
     * Get the currency property: The currency property.
     * 
     * @return the currency value.
     */
    @Metadata(properties = { MetadataProperties.GENERATED })
    public String getCurrency() {
        return this.currency;
    }

    /**
     * Get the priceTierVersion property: The price_tier_version property.
     * 
     * @return the priceTierVersion value.
     */
    @Metadata(properties = { MetadataProperties.GENERATED })
    public String getPriceTierVersion() {
        return this.priceTierVersion;
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
        jsonWriter.writeStringField("country", this.country);
        jsonWriter.writeStringField("currency", this.currency);
        jsonWriter.writeStringField("price_tier_version", this.priceTierVersion);
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
     * Reads an instance of CurrencyAndCountry from the JsonReader.
     * 
     * @param jsonReader The JsonReader being read.
     * @return An instance of CurrencyAndCountry if the JsonReader was pointing to an instance of it, or null if it was
     * pointing to JSON null.
     * @throws IOException If an error occurs while reading the CurrencyAndCountry.
     */
    @Metadata(properties = { MetadataProperties.GENERATED })
    public static CurrencyAndCountry fromJson(JsonReader jsonReader) throws IOException {
        return jsonReader.readObject(reader -> {
            CurrencyAndCountry deserializedCurrencyAndCountry = new CurrencyAndCountry();
            Map<String, BinaryData> additionalProperties = null;
            while (reader.nextToken() != JsonToken.END_OBJECT) {
                String fieldName = reader.getFieldName();
                reader.nextToken();

                if ("country".equals(fieldName)) {
                    deserializedCurrencyAndCountry.country = reader.getString();
                } else if ("currency".equals(fieldName)) {
                    deserializedCurrencyAndCountry.currency = reader.getString();
                } else if ("price_tier_version".equals(fieldName)) {
                    deserializedCurrencyAndCountry.priceTierVersion = reader.getString();
                } else {
                    if (additionalProperties == null) {
                        additionalProperties = new LinkedHashMap<>();
                    }

                    additionalProperties.put(fieldName,
                        reader.getNullable(nonNullReader -> BinaryData.fromObject(nonNullReader.readUntyped())));
                }
            }
            deserializedCurrencyAndCountry.additionalProperties = additionalProperties;

            return deserializedCurrencyAndCountry;
        });
    }
}
