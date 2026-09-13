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
 * The SdkShieldConfigData model.
 */
@Metadata(properties = { MetadataProperties.IMMUTABLE })
public final class SdkShieldConfigData implements JsonSerializable<SdkShieldConfigData> {
    /*
     * The bbs_auth_login property.
     */
    @Metadata(properties = { MetadataProperties.GENERATED })
    private Boolean bbsAuthLogin;

    /*
     * The bbs_auth_login_ignore property.
     */
    @Metadata(properties = { MetadataProperties.GENERATED })
    private List<BinaryData> bbsAuthLoginIgnore;

    /*
     * The client property.
     */
    @Metadata(properties = { MetadataProperties.GENERATED })
    private String client;

    /*
     * The disable_mmt property.
     */
    @Metadata(properties = { MetadataProperties.GENERATED })
    private Boolean disableMmt;

    /*
     * The disable_regist property.
     */
    @Metadata(properties = { MetadataProperties.GENERATED })
    private Boolean disableRegist;

    /*
     * The enable_age_gate property.
     */
    @Metadata(properties = { MetadataProperties.GENERATED })
    private Boolean enableAgeGate;

    /*
     * The enable_age_gate_ignore property.
     */
    @Metadata(properties = { MetadataProperties.GENERATED })
    private List<BinaryData> enableAgeGateIgnore;

    /*
     * The enable_br_age_gate property.
     */
    @Metadata(properties = { MetadataProperties.GENERATED })
    private Boolean enableBrAgeGate;

    /*
     * The enable_br_age_gate_ignore property.
     */
    @Metadata(properties = { MetadataProperties.GENERATED })
    private List<BinaryData> enableBrAgeGateIgnore;

    /*
     * The enable_cx_bind_account property.
     */
    @Metadata(properties = { MetadataProperties.GENERATED })
    private Boolean enableCxBindAccount;

    /*
     * The enable_douyin_flash_login property.
     */
    @Metadata(properties = { MetadataProperties.GENERATED })
    private Boolean enableDouyinFlashLogin;

    /*
     * The enable_email_captcha property.
     */
    @Metadata(properties = { MetadataProperties.GENERATED })
    private Boolean enableEmailCaptcha;

    /*
     * The enable_eu_age_gate property.
     */
    @Metadata(properties = { MetadataProperties.GENERATED })
    private Boolean enableEuAgeGate;

    /*
     * The enable_eu_age_gate_ignore property.
     */
    @Metadata(properties = { MetadataProperties.GENERATED })
    private List<BinaryData> enableEuAgeGateIgnore;

    /*
     * The enable_flash_login property.
     */
    @Metadata(properties = { MetadataProperties.GENERATED })
    private Boolean enableFlashLogin;

    /*
     * The enable_logo_18 property.
     */
    @Metadata(properties = { MetadataProperties.GENERATED })
    private Boolean enableLogo18;

    /*
     * The enable_ps_bind_account property.
     */
    @Metadata(properties = { MetadataProperties.GENERATED })
    private Boolean enablePsBindAccount;

    /*
     * The fetch_instance_id property.
     */
    @Metadata(properties = { MetadataProperties.GENERATED })
    private Boolean fetchInstanceId;

    /*
     * The firebase_blacklist_devices_switch property.
     */
    @Metadata(properties = { MetadataProperties.GENERATED })
    private Boolean firebaseBlacklistDevicesSwitch;

    /*
     * The firebase_blacklist_devices_version property.
     */
    @Metadata(properties = { MetadataProperties.GENERATED })
    private Integer firebaseBlacklistDevicesVersion;

    /*
     * The game_key property.
     */
    @Metadata(properties = { MetadataProperties.GENERATED })
    private String gameKey;

    /*
     * The guest property.
     */
    @Metadata(properties = { MetadataProperties.GENERATED })
    private Boolean guest;

    /*
     * The hoyolab_auth_login property.
     */
    @Metadata(properties = { MetadataProperties.GENERATED })
    private Boolean hoyolabAuthLogin;

    /*
     * The hoyolab_auth_login_ignore property.
     */
    @Metadata(properties = { MetadataProperties.GENERATED })
    private List<BinaryData> hoyolabAuthLoginIgnore;

    /*
     * The hoyoplay_auth_login property.
     */
    @Metadata(properties = { MetadataProperties.GENERATED })
    private Boolean hoyoplayAuthLogin;

    /*
     * The id property.
     */
    @Metadata(properties = { MetadataProperties.GENERATED })
    private Integer id;

    /*
     * The identity property.
     */
    @Metadata(properties = { MetadataProperties.GENERATED })
    private String identity;

    /*
     * The ignore_versions property.
     */
    @Metadata(properties = { MetadataProperties.GENERATED })
    private String ignoreVersions;

    /*
     * The initialize_firebase property.
     */
    @Metadata(properties = { MetadataProperties.GENERATED })
    private Boolean initializeFirebase;

    /*
     * The logo_height property.
     */
    @Metadata(properties = { MetadataProperties.GENERATED })
    private String logoHeight;

    /*
     * The logo_width property.
     */
    @Metadata(properties = { MetadataProperties.GENERATED })
    private String logoWidth;

    /*
     * The name property.
     */
    @Metadata(properties = { MetadataProperties.GENERATED })
    private String name;

    /*
     * The scene property.
     */
    @Metadata(properties = { MetadataProperties.GENERATED })
    private String scene;

    /*
     * The server_guest property.
     */
    @Metadata(properties = { MetadataProperties.GENERATED })
    private Boolean serverGuest;

    /*
     * The thirdparty property.
     */
    @Metadata(properties = { MetadataProperties.GENERATED })
    private List<String> thirdparty;

    /*
     * The thirdparty_ignore property.
     */
    @Metadata(properties = { MetadataProperties.GENERATED })
    private Map<String, BinaryData> thirdpartyIgnore;

    /*
     * The thirdparty_login_configs property.
     */
    @Metadata(properties = { MetadataProperties.GENERATED })
    private Map<String, BinaryData> thirdpartyLoginConfigs;

    /*
     * The vn_webview_realname_enabled property.
     */
    @Metadata(properties = { MetadataProperties.GENERATED })
    private Boolean vnWebviewRealnameEnabled;

    /*
     * Additional properties
     */
    @Metadata(properties = { MetadataProperties.GENERATED })
    private Map<String, BinaryData> additionalProperties;

    /**
     * Creates an instance of SdkShieldConfigData class.
     */
    @Metadata(properties = { MetadataProperties.GENERATED })
    private SdkShieldConfigData() {
    }

    /**
     * Get the bbsAuthLogin property: The bbs_auth_login property.
     * 
     * @return the bbsAuthLogin value.
     */
    @Metadata(properties = { MetadataProperties.GENERATED })
    public Boolean isBbsAuthLogin() {
        return this.bbsAuthLogin;
    }

    /**
     * Get the bbsAuthLoginIgnore property: The bbs_auth_login_ignore property.
     * 
     * @return the bbsAuthLoginIgnore value.
     */
    @Metadata(properties = { MetadataProperties.GENERATED })
    public List<BinaryData> getBbsAuthLoginIgnore() {
        return this.bbsAuthLoginIgnore;
    }

    /**
     * Get the client property: The client property.
     * 
     * @return the client value.
     */
    @Metadata(properties = { MetadataProperties.GENERATED })
    public String getClient() {
        return this.client;
    }

    /**
     * Get the disableMmt property: The disable_mmt property.
     * 
     * @return the disableMmt value.
     */
    @Metadata(properties = { MetadataProperties.GENERATED })
    public Boolean isDisableMmt() {
        return this.disableMmt;
    }

    /**
     * Get the disableRegist property: The disable_regist property.
     * 
     * @return the disableRegist value.
     */
    @Metadata(properties = { MetadataProperties.GENERATED })
    public Boolean isDisableRegist() {
        return this.disableRegist;
    }

    /**
     * Get the enableAgeGate property: The enable_age_gate property.
     * 
     * @return the enableAgeGate value.
     */
    @Metadata(properties = { MetadataProperties.GENERATED })
    public Boolean isEnableAgeGate() {
        return this.enableAgeGate;
    }

    /**
     * Get the enableAgeGateIgnore property: The enable_age_gate_ignore property.
     * 
     * @return the enableAgeGateIgnore value.
     */
    @Metadata(properties = { MetadataProperties.GENERATED })
    public List<BinaryData> getEnableAgeGateIgnore() {
        return this.enableAgeGateIgnore;
    }

    /**
     * Get the enableBrAgeGate property: The enable_br_age_gate property.
     * 
     * @return the enableBrAgeGate value.
     */
    @Metadata(properties = { MetadataProperties.GENERATED })
    public Boolean isEnableBrAgeGate() {
        return this.enableBrAgeGate;
    }

    /**
     * Get the enableBrAgeGateIgnore property: The enable_br_age_gate_ignore property.
     * 
     * @return the enableBrAgeGateIgnore value.
     */
    @Metadata(properties = { MetadataProperties.GENERATED })
    public List<BinaryData> getEnableBrAgeGateIgnore() {
        return this.enableBrAgeGateIgnore;
    }

    /**
     * Get the enableCxBindAccount property: The enable_cx_bind_account property.
     * 
     * @return the enableCxBindAccount value.
     */
    @Metadata(properties = { MetadataProperties.GENERATED })
    public Boolean isEnableCxBindAccount() {
        return this.enableCxBindAccount;
    }

    /**
     * Get the enableDouyinFlashLogin property: The enable_douyin_flash_login property.
     * 
     * @return the enableDouyinFlashLogin value.
     */
    @Metadata(properties = { MetadataProperties.GENERATED })
    public Boolean isEnableDouyinFlashLogin() {
        return this.enableDouyinFlashLogin;
    }

    /**
     * Get the enableEmailCaptcha property: The enable_email_captcha property.
     * 
     * @return the enableEmailCaptcha value.
     */
    @Metadata(properties = { MetadataProperties.GENERATED })
    public Boolean isEnableEmailCaptcha() {
        return this.enableEmailCaptcha;
    }

    /**
     * Get the enableEuAgeGate property: The enable_eu_age_gate property.
     * 
     * @return the enableEuAgeGate value.
     */
    @Metadata(properties = { MetadataProperties.GENERATED })
    public Boolean isEnableEuAgeGate() {
        return this.enableEuAgeGate;
    }

    /**
     * Get the enableEuAgeGateIgnore property: The enable_eu_age_gate_ignore property.
     * 
     * @return the enableEuAgeGateIgnore value.
     */
    @Metadata(properties = { MetadataProperties.GENERATED })
    public List<BinaryData> getEnableEuAgeGateIgnore() {
        return this.enableEuAgeGateIgnore;
    }

    /**
     * Get the enableFlashLogin property: The enable_flash_login property.
     * 
     * @return the enableFlashLogin value.
     */
    @Metadata(properties = { MetadataProperties.GENERATED })
    public Boolean isEnableFlashLogin() {
        return this.enableFlashLogin;
    }

    /**
     * Get the enableLogo18 property: The enable_logo_18 property.
     * 
     * @return the enableLogo18 value.
     */
    @Metadata(properties = { MetadataProperties.GENERATED })
    public Boolean isEnableLogo18() {
        return this.enableLogo18;
    }

    /**
     * Get the enablePsBindAccount property: The enable_ps_bind_account property.
     * 
     * @return the enablePsBindAccount value.
     */
    @Metadata(properties = { MetadataProperties.GENERATED })
    public Boolean isEnablePsBindAccount() {
        return this.enablePsBindAccount;
    }

    /**
     * Get the fetchInstanceId property: The fetch_instance_id property.
     * 
     * @return the fetchInstanceId value.
     */
    @Metadata(properties = { MetadataProperties.GENERATED })
    public Boolean isFetchInstanceId() {
        return this.fetchInstanceId;
    }

    /**
     * Get the firebaseBlacklistDevicesSwitch property: The firebase_blacklist_devices_switch property.
     * 
     * @return the firebaseBlacklistDevicesSwitch value.
     */
    @Metadata(properties = { MetadataProperties.GENERATED })
    public Boolean isFirebaseBlacklistDevicesSwitch() {
        return this.firebaseBlacklistDevicesSwitch;
    }

    /**
     * Get the firebaseBlacklistDevicesVersion property: The firebase_blacklist_devices_version property.
     * 
     * @return the firebaseBlacklistDevicesVersion value.
     */
    @Metadata(properties = { MetadataProperties.GENERATED })
    public Integer getFirebaseBlacklistDevicesVersion() {
        return this.firebaseBlacklistDevicesVersion;
    }

    /**
     * Get the gameKey property: The game_key property.
     * 
     * @return the gameKey value.
     */
    @Metadata(properties = { MetadataProperties.GENERATED })
    public String getGameKey() {
        return this.gameKey;
    }

    /**
     * Get the guest property: The guest property.
     * 
     * @return the guest value.
     */
    @Metadata(properties = { MetadataProperties.GENERATED })
    public Boolean isGuest() {
        return this.guest;
    }

    /**
     * Get the hoyolabAuthLogin property: The hoyolab_auth_login property.
     * 
     * @return the hoyolabAuthLogin value.
     */
    @Metadata(properties = { MetadataProperties.GENERATED })
    public Boolean isHoyolabAuthLogin() {
        return this.hoyolabAuthLogin;
    }

    /**
     * Get the hoyolabAuthLoginIgnore property: The hoyolab_auth_login_ignore property.
     * 
     * @return the hoyolabAuthLoginIgnore value.
     */
    @Metadata(properties = { MetadataProperties.GENERATED })
    public List<BinaryData> getHoyolabAuthLoginIgnore() {
        return this.hoyolabAuthLoginIgnore;
    }

    /**
     * Get the hoyoplayAuthLogin property: The hoyoplay_auth_login property.
     * 
     * @return the hoyoplayAuthLogin value.
     */
    @Metadata(properties = { MetadataProperties.GENERATED })
    public Boolean isHoyoplayAuthLogin() {
        return this.hoyoplayAuthLogin;
    }

    /**
     * Get the id property: The id property.
     * 
     * @return the id value.
     */
    @Metadata(properties = { MetadataProperties.GENERATED })
    public Integer getId() {
        return this.id;
    }

    /**
     * Get the identity property: The identity property.
     * 
     * @return the identity value.
     */
    @Metadata(properties = { MetadataProperties.GENERATED })
    public String getIdentity() {
        return this.identity;
    }

    /**
     * Get the ignoreVersions property: The ignore_versions property.
     * 
     * @return the ignoreVersions value.
     */
    @Metadata(properties = { MetadataProperties.GENERATED })
    public String getIgnoreVersions() {
        return this.ignoreVersions;
    }

    /**
     * Get the initializeFirebase property: The initialize_firebase property.
     * 
     * @return the initializeFirebase value.
     */
    @Metadata(properties = { MetadataProperties.GENERATED })
    public Boolean isInitializeFirebase() {
        return this.initializeFirebase;
    }

    /**
     * Get the logoHeight property: The logo_height property.
     * 
     * @return the logoHeight value.
     */
    @Metadata(properties = { MetadataProperties.GENERATED })
    public String getLogoHeight() {
        return this.logoHeight;
    }

    /**
     * Get the logoWidth property: The logo_width property.
     * 
     * @return the logoWidth value.
     */
    @Metadata(properties = { MetadataProperties.GENERATED })
    public String getLogoWidth() {
        return this.logoWidth;
    }

    /**
     * Get the name property: The name property.
     * 
     * @return the name value.
     */
    @Metadata(properties = { MetadataProperties.GENERATED })
    public String getName() {
        return this.name;
    }

    /**
     * Get the scene property: The scene property.
     * 
     * @return the scene value.
     */
    @Metadata(properties = { MetadataProperties.GENERATED })
    public String getScene() {
        return this.scene;
    }

    /**
     * Get the serverGuest property: The server_guest property.
     * 
     * @return the serverGuest value.
     */
    @Metadata(properties = { MetadataProperties.GENERATED })
    public Boolean isServerGuest() {
        return this.serverGuest;
    }

    /**
     * Get the thirdparty property: The thirdparty property.
     * 
     * @return the thirdparty value.
     */
    @Metadata(properties = { MetadataProperties.GENERATED })
    public List<String> getThirdparty() {
        return this.thirdparty;
    }

    /**
     * Get the thirdpartyIgnore property: The thirdparty_ignore property.
     * 
     * @return the thirdpartyIgnore value.
     */
    @Metadata(properties = { MetadataProperties.GENERATED })
    public Map<String, BinaryData> getThirdpartyIgnore() {
        return this.thirdpartyIgnore;
    }

    /**
     * Get the thirdpartyLoginConfigs property: The thirdparty_login_configs property.
     * 
     * @return the thirdpartyLoginConfigs value.
     */
    @Metadata(properties = { MetadataProperties.GENERATED })
    public Map<String, BinaryData> getThirdpartyLoginConfigs() {
        return this.thirdpartyLoginConfigs;
    }

    /**
     * Get the vnWebviewRealnameEnabled property: The vn_webview_realname_enabled property.
     * 
     * @return the vnWebviewRealnameEnabled value.
     */
    @Metadata(properties = { MetadataProperties.GENERATED })
    public Boolean isVnWebviewRealnameEnabled() {
        return this.vnWebviewRealnameEnabled;
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
        jsonWriter.writeBooleanField("bbs_auth_login", this.bbsAuthLogin);
        jsonWriter.writeArrayField("bbs_auth_login_ignore", this.bbsAuthLoginIgnore, (writer, element) -> {
            if (element == null) {
                writer.writeNull();
            } else {
                element.writeTo(writer);
            }
        });
        jsonWriter.writeStringField("client", this.client);
        jsonWriter.writeBooleanField("disable_mmt", this.disableMmt);
        jsonWriter.writeBooleanField("disable_regist", this.disableRegist);
        jsonWriter.writeBooleanField("enable_age_gate", this.enableAgeGate);
        jsonWriter.writeArrayField("enable_age_gate_ignore", this.enableAgeGateIgnore, (writer, element) -> {
            if (element == null) {
                writer.writeNull();
            } else {
                element.writeTo(writer);
            }
        });
        jsonWriter.writeBooleanField("enable_br_age_gate", this.enableBrAgeGate);
        jsonWriter.writeArrayField("enable_br_age_gate_ignore", this.enableBrAgeGateIgnore, (writer, element) -> {
            if (element == null) {
                writer.writeNull();
            } else {
                element.writeTo(writer);
            }
        });
        jsonWriter.writeBooleanField("enable_cx_bind_account", this.enableCxBindAccount);
        jsonWriter.writeBooleanField("enable_douyin_flash_login", this.enableDouyinFlashLogin);
        jsonWriter.writeBooleanField("enable_email_captcha", this.enableEmailCaptcha);
        jsonWriter.writeBooleanField("enable_eu_age_gate", this.enableEuAgeGate);
        jsonWriter.writeArrayField("enable_eu_age_gate_ignore", this.enableEuAgeGateIgnore, (writer, element) -> {
            if (element == null) {
                writer.writeNull();
            } else {
                element.writeTo(writer);
            }
        });
        jsonWriter.writeBooleanField("enable_flash_login", this.enableFlashLogin);
        jsonWriter.writeBooleanField("enable_logo_18", this.enableLogo18);
        jsonWriter.writeBooleanField("enable_ps_bind_account", this.enablePsBindAccount);
        jsonWriter.writeBooleanField("fetch_instance_id", this.fetchInstanceId);
        jsonWriter.writeBooleanField("firebase_blacklist_devices_switch", this.firebaseBlacklistDevicesSwitch);
        jsonWriter.writeNumberField("firebase_blacklist_devices_version", this.firebaseBlacklistDevicesVersion);
        jsonWriter.writeStringField("game_key", this.gameKey);
        jsonWriter.writeBooleanField("guest", this.guest);
        jsonWriter.writeBooleanField("hoyolab_auth_login", this.hoyolabAuthLogin);
        jsonWriter.writeArrayField("hoyolab_auth_login_ignore", this.hoyolabAuthLoginIgnore, (writer, element) -> {
            if (element == null) {
                writer.writeNull();
            } else {
                element.writeTo(writer);
            }
        });
        jsonWriter.writeBooleanField("hoyoplay_auth_login", this.hoyoplayAuthLogin);
        jsonWriter.writeNumberField("id", this.id);
        jsonWriter.writeStringField("identity", this.identity);
        jsonWriter.writeStringField("ignore_versions", this.ignoreVersions);
        jsonWriter.writeBooleanField("initialize_firebase", this.initializeFirebase);
        jsonWriter.writeStringField("logo_height", this.logoHeight);
        jsonWriter.writeStringField("logo_width", this.logoWidth);
        jsonWriter.writeStringField("name", this.name);
        jsonWriter.writeStringField("scene", this.scene);
        jsonWriter.writeBooleanField("server_guest", this.serverGuest);
        jsonWriter.writeArrayField("thirdparty", this.thirdparty, (writer, element) -> writer.writeString(element));
        jsonWriter.writeMapField("thirdparty_ignore", this.thirdpartyIgnore, (writer, element) -> {
            if (element == null) {
                writer.writeNull();
            } else {
                element.writeTo(writer);
            }
        });
        jsonWriter.writeMapField("thirdparty_login_configs", this.thirdpartyLoginConfigs, (writer, element) -> {
            if (element == null) {
                writer.writeNull();
            } else {
                element.writeTo(writer);
            }
        });
        jsonWriter.writeBooleanField("vn_webview_realname_enabled", this.vnWebviewRealnameEnabled);
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
     * Reads an instance of SdkShieldConfigData from the JsonReader.
     * 
     * @param jsonReader The JsonReader being read.
     * @return An instance of SdkShieldConfigData if the JsonReader was pointing to an instance of it, or null if it was
     * pointing to JSON null.
     * @throws IOException If an error occurs while reading the SdkShieldConfigData.
     */
    @Metadata(properties = { MetadataProperties.GENERATED })
    public static SdkShieldConfigData fromJson(JsonReader jsonReader) throws IOException {
        return jsonReader.readObject(reader -> {
            SdkShieldConfigData deserializedSdkShieldConfigData = new SdkShieldConfigData();
            Map<String, BinaryData> additionalProperties = null;
            while (reader.nextToken() != JsonToken.END_OBJECT) {
                String fieldName = reader.getFieldName();
                reader.nextToken();

                if ("bbs_auth_login".equals(fieldName)) {
                    deserializedSdkShieldConfigData.bbsAuthLogin = reader.getNullable(JsonReader::getBoolean);
                } else if ("bbs_auth_login_ignore".equals(fieldName)) {
                    List<BinaryData> bbsAuthLoginIgnore = reader.readArray(reader1 -> reader1
                        .getNullable(nonNullReader -> BinaryData.fromObject(nonNullReader.readUntyped())));
                    deserializedSdkShieldConfigData.bbsAuthLoginIgnore = bbsAuthLoginIgnore;
                } else if ("client".equals(fieldName)) {
                    deserializedSdkShieldConfigData.client = reader.getString();
                } else if ("disable_mmt".equals(fieldName)) {
                    deserializedSdkShieldConfigData.disableMmt = reader.getNullable(JsonReader::getBoolean);
                } else if ("disable_regist".equals(fieldName)) {
                    deserializedSdkShieldConfigData.disableRegist = reader.getNullable(JsonReader::getBoolean);
                } else if ("enable_age_gate".equals(fieldName)) {
                    deserializedSdkShieldConfigData.enableAgeGate = reader.getNullable(JsonReader::getBoolean);
                } else if ("enable_age_gate_ignore".equals(fieldName)) {
                    List<BinaryData> enableAgeGateIgnore = reader.readArray(reader1 -> reader1
                        .getNullable(nonNullReader -> BinaryData.fromObject(nonNullReader.readUntyped())));
                    deserializedSdkShieldConfigData.enableAgeGateIgnore = enableAgeGateIgnore;
                } else if ("enable_br_age_gate".equals(fieldName)) {
                    deserializedSdkShieldConfigData.enableBrAgeGate = reader.getNullable(JsonReader::getBoolean);
                } else if ("enable_br_age_gate_ignore".equals(fieldName)) {
                    List<BinaryData> enableBrAgeGateIgnore = reader.readArray(reader1 -> reader1
                        .getNullable(nonNullReader -> BinaryData.fromObject(nonNullReader.readUntyped())));
                    deserializedSdkShieldConfigData.enableBrAgeGateIgnore = enableBrAgeGateIgnore;
                } else if ("enable_cx_bind_account".equals(fieldName)) {
                    deserializedSdkShieldConfigData.enableCxBindAccount = reader.getNullable(JsonReader::getBoolean);
                } else if ("enable_douyin_flash_login".equals(fieldName)) {
                    deserializedSdkShieldConfigData.enableDouyinFlashLogin = reader.getNullable(JsonReader::getBoolean);
                } else if ("enable_email_captcha".equals(fieldName)) {
                    deserializedSdkShieldConfigData.enableEmailCaptcha = reader.getNullable(JsonReader::getBoolean);
                } else if ("enable_eu_age_gate".equals(fieldName)) {
                    deserializedSdkShieldConfigData.enableEuAgeGate = reader.getNullable(JsonReader::getBoolean);
                } else if ("enable_eu_age_gate_ignore".equals(fieldName)) {
                    List<BinaryData> enableEuAgeGateIgnore = reader.readArray(reader1 -> reader1
                        .getNullable(nonNullReader -> BinaryData.fromObject(nonNullReader.readUntyped())));
                    deserializedSdkShieldConfigData.enableEuAgeGateIgnore = enableEuAgeGateIgnore;
                } else if ("enable_flash_login".equals(fieldName)) {
                    deserializedSdkShieldConfigData.enableFlashLogin = reader.getNullable(JsonReader::getBoolean);
                } else if ("enable_logo_18".equals(fieldName)) {
                    deserializedSdkShieldConfigData.enableLogo18 = reader.getNullable(JsonReader::getBoolean);
                } else if ("enable_ps_bind_account".equals(fieldName)) {
                    deserializedSdkShieldConfigData.enablePsBindAccount = reader.getNullable(JsonReader::getBoolean);
                } else if ("fetch_instance_id".equals(fieldName)) {
                    deserializedSdkShieldConfigData.fetchInstanceId = reader.getNullable(JsonReader::getBoolean);
                } else if ("firebase_blacklist_devices_switch".equals(fieldName)) {
                    deserializedSdkShieldConfigData.firebaseBlacklistDevicesSwitch
                        = reader.getNullable(JsonReader::getBoolean);
                } else if ("firebase_blacklist_devices_version".equals(fieldName)) {
                    deserializedSdkShieldConfigData.firebaseBlacklistDevicesVersion
                        = reader.getNullable(JsonReader::getInt);
                } else if ("game_key".equals(fieldName)) {
                    deserializedSdkShieldConfigData.gameKey = reader.getString();
                } else if ("guest".equals(fieldName)) {
                    deserializedSdkShieldConfigData.guest = reader.getNullable(JsonReader::getBoolean);
                } else if ("hoyolab_auth_login".equals(fieldName)) {
                    deserializedSdkShieldConfigData.hoyolabAuthLogin = reader.getNullable(JsonReader::getBoolean);
                } else if ("hoyolab_auth_login_ignore".equals(fieldName)) {
                    List<BinaryData> hoyolabAuthLoginIgnore = reader.readArray(reader1 -> reader1
                        .getNullable(nonNullReader -> BinaryData.fromObject(nonNullReader.readUntyped())));
                    deserializedSdkShieldConfigData.hoyolabAuthLoginIgnore = hoyolabAuthLoginIgnore;
                } else if ("hoyoplay_auth_login".equals(fieldName)) {
                    deserializedSdkShieldConfigData.hoyoplayAuthLogin = reader.getNullable(JsonReader::getBoolean);
                } else if ("id".equals(fieldName)) {
                    deserializedSdkShieldConfigData.id = reader.getNullable(JsonReader::getInt);
                } else if ("identity".equals(fieldName)) {
                    deserializedSdkShieldConfigData.identity = reader.getString();
                } else if ("ignore_versions".equals(fieldName)) {
                    deserializedSdkShieldConfigData.ignoreVersions = reader.getString();
                } else if ("initialize_firebase".equals(fieldName)) {
                    deserializedSdkShieldConfigData.initializeFirebase = reader.getNullable(JsonReader::getBoolean);
                } else if ("logo_height".equals(fieldName)) {
                    deserializedSdkShieldConfigData.logoHeight = reader.getString();
                } else if ("logo_width".equals(fieldName)) {
                    deserializedSdkShieldConfigData.logoWidth = reader.getString();
                } else if ("name".equals(fieldName)) {
                    deserializedSdkShieldConfigData.name = reader.getString();
                } else if ("scene".equals(fieldName)) {
                    deserializedSdkShieldConfigData.scene = reader.getString();
                } else if ("server_guest".equals(fieldName)) {
                    deserializedSdkShieldConfigData.serverGuest = reader.getNullable(JsonReader::getBoolean);
                } else if ("thirdparty".equals(fieldName)) {
                    List<String> thirdparty = reader.readArray(reader1 -> reader1.getString());
                    deserializedSdkShieldConfigData.thirdparty = thirdparty;
                } else if ("thirdparty_ignore".equals(fieldName)) {
                    Map<String, BinaryData> thirdpartyIgnore = reader.readMap(reader1 -> reader1
                        .getNullable(nonNullReader -> BinaryData.fromObject(nonNullReader.readUntyped())));
                    deserializedSdkShieldConfigData.thirdpartyIgnore = thirdpartyIgnore;
                } else if ("thirdparty_login_configs".equals(fieldName)) {
                    Map<String, BinaryData> thirdpartyLoginConfigs = reader.readMap(reader1 -> reader1
                        .getNullable(nonNullReader -> BinaryData.fromObject(nonNullReader.readUntyped())));
                    deserializedSdkShieldConfigData.thirdpartyLoginConfigs = thirdpartyLoginConfigs;
                } else if ("vn_webview_realname_enabled".equals(fieldName)) {
                    deserializedSdkShieldConfigData.vnWebviewRealnameEnabled
                        = reader.getNullable(JsonReader::getBoolean);
                } else {
                    if (additionalProperties == null) {
                        additionalProperties = new LinkedHashMap<>();
                    }

                    additionalProperties.put(fieldName,
                        reader.getNullable(nonNullReader -> BinaryData.fromObject(nonNullReader.readUntyped())));
                }
            }
            deserializedSdkShieldConfigData.additionalProperties = additionalProperties;

            return deserializedSdkShieldConfigData;
        });
    }
}
