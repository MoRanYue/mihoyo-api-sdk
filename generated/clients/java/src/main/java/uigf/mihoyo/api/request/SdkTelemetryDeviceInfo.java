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
 * The SdkTelemetryDeviceInfo model.
 */
@Metadata(properties = { MetadataProperties.FLUENT })
public final class SdkTelemetryDeviceInfo implements JsonSerializable<SdkTelemetryDeviceInfo> {
    /*
     * The addressMac property.
     */
    @Metadata(properties = { MetadataProperties.GENERATED })
    private String addressMac;

    /*
     * The bundleId property.
     */
    @Metadata(properties = { MetadataProperties.GENERATED })
    private String bundleId;

    /*
     * The cps property.
     */
    @Metadata(properties = { MetadataProperties.GENERATED })
    private String cps;

    /*
     * The device_fp property.
     */
    @Metadata(properties = { MetadataProperties.GENERATED })
    private String deviceFp;

    /*
     * The device_sciX property.
     */
    @Metadata(properties = { MetadataProperties.GENERATED })
    private Integer snakeDeviceSciX;

    /*
     * The device_sciY property.
     */
    @Metadata(properties = { MetadataProperties.GENERATED })
    private Integer snakeDeviceSciY;

    /*
     * The deviceId property.
     */
    @Metadata(properties = { MetadataProperties.GENERATED })
    private String deviceId;

    /*
     * The deviceModel property.
     */
    @Metadata(properties = { MetadataProperties.GENERATED })
    private String deviceModel;

    /*
     * The deviceName property.
     */
    @Metadata(properties = { MetadataProperties.GENERATED })
    private String deviceName;

    /*
     * The deviceSciX property.
     */
    @Metadata(properties = { MetadataProperties.GENERATED })
    private Integer deviceSciX;

    /*
     * The deviceSciY property.
     */
    @Metadata(properties = { MetadataProperties.GENERATED })
    private Integer deviceSciY;

    /*
     * The dpi property.
     */
    @Metadata(properties = { MetadataProperties.GENERATED })
    private Integer dpi;

    /*
     * The gpuMemSize property.
     */
    @Metadata(properties = { MetadataProperties.GENERATED })
    private Integer gpuMemSize;

    /*
     * The gpuName property.
     */
    @Metadata(properties = { MetadataProperties.GENERATED })
    private String gpuName;

    /*
     * The ip property.
     */
    @Metadata(properties = { MetadataProperties.GENERATED })
    private String ip;

    /*
     * The isp property.
     */
    @Metadata(properties = { MetadataProperties.GENERATED })
    private String isp;

    /*
     * The network_type property.
     */
    @Metadata(properties = { MetadataProperties.GENERATED })
    private String snakeNetworkType;

    /*
     * The networkType property.
     */
    @Metadata(properties = { MetadataProperties.GENERATED })
    private String networkType;

    /*
     * The platform property.
     */
    @Metadata(properties = { MetadataProperties.GENERATED })
    private BinaryData platform;

    /*
     * The platformName property.
     */
    @Metadata(properties = { MetadataProperties.GENERATED })
    private String platformName;

    /*
     * The processorCount property.
     */
    @Metadata(properties = { MetadataProperties.GENERATED })
    private Integer processorCount;

    /*
     * The processorFrequency property.
     */
    @Metadata(properties = { MetadataProperties.GENERATED })
    private Double processorFrequency;

    /*
     * The processorType property.
     */
    @Metadata(properties = { MetadataProperties.GENERATED })
    private String processorType;

    /*
     * The ramCapacity property.
     */
    @Metadata(properties = { MetadataProperties.GENERATED })
    private BinaryData ramCapacity;

    /*
     * The ramRemain property.
     */
    @Metadata(properties = { MetadataProperties.GENERATED })
    private BinaryData ramRemain;

    /*
     * The registerCPS property.
     */
    @Metadata(properties = { MetadataProperties.GENERATED })
    private String registerCPS;

    /*
     * The romCapacity property.
     */
    @Metadata(properties = { MetadataProperties.GENERATED })
    private BinaryData romCapacity;

    /*
     * The romRemain property.
     */
    @Metadata(properties = { MetadataProperties.GENERATED })
    private Double romRemain;

    /*
     * The soft_sciX property.
     */
    @Metadata(properties = { MetadataProperties.GENERATED })
    private Integer softSciX;

    /*
     * The soft_sciY property.
     */
    @Metadata(properties = { MetadataProperties.GENERATED })
    private Integer softSciY;

    /*
     * The systemInfo property.
     */
    @Metadata(properties = { MetadataProperties.GENERATED })
    private String systemInfo;

    /*
     * The systemLang property.
     */
    @Metadata(properties = { MetadataProperties.GENERATED })
    private String systemLang;

    /*
     * The uapc property.
     */
    @Metadata(properties = { MetadataProperties.GENERATED })
    private String uapc;

    /*
     * The wmac property.
     */
    @Metadata(properties = { MetadataProperties.GENERATED })
    private String wmac;

    /*
     * Additional properties
     */
    @Metadata(properties = { MetadataProperties.GENERATED })
    private Map<String, BinaryData> additionalProperties;

    /**
     * Creates an instance of SdkTelemetryDeviceInfo class.
     */
    @Metadata(properties = { MetadataProperties.GENERATED })
    public SdkTelemetryDeviceInfo() {
    }

    /**
     * Get the addressMac property: The addressMac property.
     * 
     * @return the addressMac value.
     */
    @Metadata(properties = { MetadataProperties.GENERATED })
    public String getAddressMac() {
        return this.addressMac;
    }

    /**
     * Set the addressMac property: The addressMac property.
     * 
     * @param addressMac the addressMac value to set.
     * @return the SdkTelemetryDeviceInfo object itself.
     */
    @Metadata(properties = { MetadataProperties.GENERATED })
    public SdkTelemetryDeviceInfo setAddressMac(String addressMac) {
        this.addressMac = addressMac;
        return this;
    }

    /**
     * Get the bundleId property: The bundleId property.
     * 
     * @return the bundleId value.
     */
    @Metadata(properties = { MetadataProperties.GENERATED })
    public String getBundleId() {
        return this.bundleId;
    }

    /**
     * Set the bundleId property: The bundleId property.
     * 
     * @param bundleId the bundleId value to set.
     * @return the SdkTelemetryDeviceInfo object itself.
     */
    @Metadata(properties = { MetadataProperties.GENERATED })
    public SdkTelemetryDeviceInfo setBundleId(String bundleId) {
        this.bundleId = bundleId;
        return this;
    }

    /**
     * Get the cps property: The cps property.
     * 
     * @return the cps value.
     */
    @Metadata(properties = { MetadataProperties.GENERATED })
    public String getCps() {
        return this.cps;
    }

    /**
     * Set the cps property: The cps property.
     * 
     * @param cps the cps value to set.
     * @return the SdkTelemetryDeviceInfo object itself.
     */
    @Metadata(properties = { MetadataProperties.GENERATED })
    public SdkTelemetryDeviceInfo setCps(String cps) {
        this.cps = cps;
        return this;
    }

    /**
     * Get the deviceFp property: The device_fp property.
     * 
     * @return the deviceFp value.
     */
    @Metadata(properties = { MetadataProperties.GENERATED })
    public String getDeviceFp() {
        return this.deviceFp;
    }

    /**
     * Set the deviceFp property: The device_fp property.
     * 
     * @param deviceFp the deviceFp value to set.
     * @return the SdkTelemetryDeviceInfo object itself.
     */
    @Metadata(properties = { MetadataProperties.GENERATED })
    public SdkTelemetryDeviceInfo setDeviceFp(String deviceFp) {
        this.deviceFp = deviceFp;
        return this;
    }

    /**
     * Get the snakeDeviceSciX property: The device_sciX property.
     * 
     * @return the snakeDeviceSciX value.
     */
    @Metadata(properties = { MetadataProperties.GENERATED })
    public Integer getSnakeDeviceSciX() {
        return this.snakeDeviceSciX;
    }

    /**
     * Set the snakeDeviceSciX property: The device_sciX property.
     * 
     * @param snakeDeviceSciX the snakeDeviceSciX value to set.
     * @return the SdkTelemetryDeviceInfo object itself.
     */
    @Metadata(properties = { MetadataProperties.GENERATED })
    public SdkTelemetryDeviceInfo setSnakeDeviceSciX(Integer snakeDeviceSciX) {
        this.snakeDeviceSciX = snakeDeviceSciX;
        return this;
    }

    /**
     * Get the snakeDeviceSciY property: The device_sciY property.
     * 
     * @return the snakeDeviceSciY value.
     */
    @Metadata(properties = { MetadataProperties.GENERATED })
    public Integer getSnakeDeviceSciY() {
        return this.snakeDeviceSciY;
    }

    /**
     * Set the snakeDeviceSciY property: The device_sciY property.
     * 
     * @param snakeDeviceSciY the snakeDeviceSciY value to set.
     * @return the SdkTelemetryDeviceInfo object itself.
     */
    @Metadata(properties = { MetadataProperties.GENERATED })
    public SdkTelemetryDeviceInfo setSnakeDeviceSciY(Integer snakeDeviceSciY) {
        this.snakeDeviceSciY = snakeDeviceSciY;
        return this;
    }

    /**
     * Get the deviceId property: The deviceId property.
     * 
     * @return the deviceId value.
     */
    @Metadata(properties = { MetadataProperties.GENERATED })
    public String getDeviceId() {
        return this.deviceId;
    }

    /**
     * Set the deviceId property: The deviceId property.
     * 
     * @param deviceId the deviceId value to set.
     * @return the SdkTelemetryDeviceInfo object itself.
     */
    @Metadata(properties = { MetadataProperties.GENERATED })
    public SdkTelemetryDeviceInfo setDeviceId(String deviceId) {
        this.deviceId = deviceId;
        return this;
    }

    /**
     * Get the deviceModel property: The deviceModel property.
     * 
     * @return the deviceModel value.
     */
    @Metadata(properties = { MetadataProperties.GENERATED })
    public String getDeviceModel() {
        return this.deviceModel;
    }

    /**
     * Set the deviceModel property: The deviceModel property.
     * 
     * @param deviceModel the deviceModel value to set.
     * @return the SdkTelemetryDeviceInfo object itself.
     */
    @Metadata(properties = { MetadataProperties.GENERATED })
    public SdkTelemetryDeviceInfo setDeviceModel(String deviceModel) {
        this.deviceModel = deviceModel;
        return this;
    }

    /**
     * Get the deviceName property: The deviceName property.
     * 
     * @return the deviceName value.
     */
    @Metadata(properties = { MetadataProperties.GENERATED })
    public String getDeviceName() {
        return this.deviceName;
    }

    /**
     * Set the deviceName property: The deviceName property.
     * 
     * @param deviceName the deviceName value to set.
     * @return the SdkTelemetryDeviceInfo object itself.
     */
    @Metadata(properties = { MetadataProperties.GENERATED })
    public SdkTelemetryDeviceInfo setDeviceName(String deviceName) {
        this.deviceName = deviceName;
        return this;
    }

    /**
     * Get the deviceSciX property: The deviceSciX property.
     * 
     * @return the deviceSciX value.
     */
    @Metadata(properties = { MetadataProperties.GENERATED })
    public Integer getDeviceSciX() {
        return this.deviceSciX;
    }

    /**
     * Set the deviceSciX property: The deviceSciX property.
     * 
     * @param deviceSciX the deviceSciX value to set.
     * @return the SdkTelemetryDeviceInfo object itself.
     */
    @Metadata(properties = { MetadataProperties.GENERATED })
    public SdkTelemetryDeviceInfo setDeviceSciX(Integer deviceSciX) {
        this.deviceSciX = deviceSciX;
        return this;
    }

    /**
     * Get the deviceSciY property: The deviceSciY property.
     * 
     * @return the deviceSciY value.
     */
    @Metadata(properties = { MetadataProperties.GENERATED })
    public Integer getDeviceSciY() {
        return this.deviceSciY;
    }

    /**
     * Set the deviceSciY property: The deviceSciY property.
     * 
     * @param deviceSciY the deviceSciY value to set.
     * @return the SdkTelemetryDeviceInfo object itself.
     */
    @Metadata(properties = { MetadataProperties.GENERATED })
    public SdkTelemetryDeviceInfo setDeviceSciY(Integer deviceSciY) {
        this.deviceSciY = deviceSciY;
        return this;
    }

    /**
     * Get the dpi property: The dpi property.
     * 
     * @return the dpi value.
     */
    @Metadata(properties = { MetadataProperties.GENERATED })
    public Integer getDpi() {
        return this.dpi;
    }

    /**
     * Set the dpi property: The dpi property.
     * 
     * @param dpi the dpi value to set.
     * @return the SdkTelemetryDeviceInfo object itself.
     */
    @Metadata(properties = { MetadataProperties.GENERATED })
    public SdkTelemetryDeviceInfo setDpi(Integer dpi) {
        this.dpi = dpi;
        return this;
    }

    /**
     * Get the gpuMemSize property: The gpuMemSize property.
     * 
     * @return the gpuMemSize value.
     */
    @Metadata(properties = { MetadataProperties.GENERATED })
    public Integer getGpuMemSize() {
        return this.gpuMemSize;
    }

    /**
     * Set the gpuMemSize property: The gpuMemSize property.
     * 
     * @param gpuMemSize the gpuMemSize value to set.
     * @return the SdkTelemetryDeviceInfo object itself.
     */
    @Metadata(properties = { MetadataProperties.GENERATED })
    public SdkTelemetryDeviceInfo setGpuMemSize(Integer gpuMemSize) {
        this.gpuMemSize = gpuMemSize;
        return this;
    }

    /**
     * Get the gpuName property: The gpuName property.
     * 
     * @return the gpuName value.
     */
    @Metadata(properties = { MetadataProperties.GENERATED })
    public String getGpuName() {
        return this.gpuName;
    }

    /**
     * Set the gpuName property: The gpuName property.
     * 
     * @param gpuName the gpuName value to set.
     * @return the SdkTelemetryDeviceInfo object itself.
     */
    @Metadata(properties = { MetadataProperties.GENERATED })
    public SdkTelemetryDeviceInfo setGpuName(String gpuName) {
        this.gpuName = gpuName;
        return this;
    }

    /**
     * Get the ip property: The ip property.
     * 
     * @return the ip value.
     */
    @Metadata(properties = { MetadataProperties.GENERATED })
    public String getIp() {
        return this.ip;
    }

    /**
     * Set the ip property: The ip property.
     * 
     * @param ip the ip value to set.
     * @return the SdkTelemetryDeviceInfo object itself.
     */
    @Metadata(properties = { MetadataProperties.GENERATED })
    public SdkTelemetryDeviceInfo setIp(String ip) {
        this.ip = ip;
        return this;
    }

    /**
     * Get the isp property: The isp property.
     * 
     * @return the isp value.
     */
    @Metadata(properties = { MetadataProperties.GENERATED })
    public String getIsp() {
        return this.isp;
    }

    /**
     * Set the isp property: The isp property.
     * 
     * @param isp the isp value to set.
     * @return the SdkTelemetryDeviceInfo object itself.
     */
    @Metadata(properties = { MetadataProperties.GENERATED })
    public SdkTelemetryDeviceInfo setIsp(String isp) {
        this.isp = isp;
        return this;
    }

    /**
     * Get the snakeNetworkType property: The network_type property.
     * 
     * @return the snakeNetworkType value.
     */
    @Metadata(properties = { MetadataProperties.GENERATED })
    public String getSnakeNetworkType() {
        return this.snakeNetworkType;
    }

    /**
     * Set the snakeNetworkType property: The network_type property.
     * 
     * @param snakeNetworkType the snakeNetworkType value to set.
     * @return the SdkTelemetryDeviceInfo object itself.
     */
    @Metadata(properties = { MetadataProperties.GENERATED })
    public SdkTelemetryDeviceInfo setSnakeNetworkType(String snakeNetworkType) {
        this.snakeNetworkType = snakeNetworkType;
        return this;
    }

    /**
     * Get the networkType property: The networkType property.
     * 
     * @return the networkType value.
     */
    @Metadata(properties = { MetadataProperties.GENERATED })
    public String getNetworkType() {
        return this.networkType;
    }

    /**
     * Set the networkType property: The networkType property.
     * 
     * @param networkType the networkType value to set.
     * @return the SdkTelemetryDeviceInfo object itself.
     */
    @Metadata(properties = { MetadataProperties.GENERATED })
    public SdkTelemetryDeviceInfo setNetworkType(String networkType) {
        this.networkType = networkType;
        return this;
    }

    /**
     * Get the platform property: The platform property.
     * 
     * @return the platform value.
     */
    @Metadata(properties = { MetadataProperties.GENERATED })
    public BinaryData getPlatform() {
        return this.platform;
    }

    /**
     * Set the platform property: The platform property.
     * 
     * @param platform the platform value to set.
     * @return the SdkTelemetryDeviceInfo object itself.
     */
    @Metadata(properties = { MetadataProperties.GENERATED })
    public SdkTelemetryDeviceInfo setPlatform(BinaryData platform) {
        this.platform = platform;
        return this;
    }

    /**
     * Get the platformName property: The platformName property.
     * 
     * @return the platformName value.
     */
    @Metadata(properties = { MetadataProperties.GENERATED })
    public String getPlatformName() {
        return this.platformName;
    }

    /**
     * Set the platformName property: The platformName property.
     * 
     * @param platformName the platformName value to set.
     * @return the SdkTelemetryDeviceInfo object itself.
     */
    @Metadata(properties = { MetadataProperties.GENERATED })
    public SdkTelemetryDeviceInfo setPlatformName(String platformName) {
        this.platformName = platformName;
        return this;
    }

    /**
     * Get the processorCount property: The processorCount property.
     * 
     * @return the processorCount value.
     */
    @Metadata(properties = { MetadataProperties.GENERATED })
    public Integer getProcessorCount() {
        return this.processorCount;
    }

    /**
     * Set the processorCount property: The processorCount property.
     * 
     * @param processorCount the processorCount value to set.
     * @return the SdkTelemetryDeviceInfo object itself.
     */
    @Metadata(properties = { MetadataProperties.GENERATED })
    public SdkTelemetryDeviceInfo setProcessorCount(Integer processorCount) {
        this.processorCount = processorCount;
        return this;
    }

    /**
     * Get the processorFrequency property: The processorFrequency property.
     * 
     * @return the processorFrequency value.
     */
    @Metadata(properties = { MetadataProperties.GENERATED })
    public Double getProcessorFrequency() {
        return this.processorFrequency;
    }

    /**
     * Set the processorFrequency property: The processorFrequency property.
     * 
     * @param processorFrequency the processorFrequency value to set.
     * @return the SdkTelemetryDeviceInfo object itself.
     */
    @Metadata(properties = { MetadataProperties.GENERATED })
    public SdkTelemetryDeviceInfo setProcessorFrequency(Double processorFrequency) {
        this.processorFrequency = processorFrequency;
        return this;
    }

    /**
     * Get the processorType property: The processorType property.
     * 
     * @return the processorType value.
     */
    @Metadata(properties = { MetadataProperties.GENERATED })
    public String getProcessorType() {
        return this.processorType;
    }

    /**
     * Set the processorType property: The processorType property.
     * 
     * @param processorType the processorType value to set.
     * @return the SdkTelemetryDeviceInfo object itself.
     */
    @Metadata(properties = { MetadataProperties.GENERATED })
    public SdkTelemetryDeviceInfo setProcessorType(String processorType) {
        this.processorType = processorType;
        return this;
    }

    /**
     * Get the ramCapacity property: The ramCapacity property.
     * 
     * @return the ramCapacity value.
     */
    @Metadata(properties = { MetadataProperties.GENERATED })
    public BinaryData getRamCapacity() {
        return this.ramCapacity;
    }

    /**
     * Set the ramCapacity property: The ramCapacity property.
     * 
     * @param ramCapacity the ramCapacity value to set.
     * @return the SdkTelemetryDeviceInfo object itself.
     */
    @Metadata(properties = { MetadataProperties.GENERATED })
    public SdkTelemetryDeviceInfo setRamCapacity(BinaryData ramCapacity) {
        this.ramCapacity = ramCapacity;
        return this;
    }

    /**
     * Get the ramRemain property: The ramRemain property.
     * 
     * @return the ramRemain value.
     */
    @Metadata(properties = { MetadataProperties.GENERATED })
    public BinaryData getRamRemain() {
        return this.ramRemain;
    }

    /**
     * Set the ramRemain property: The ramRemain property.
     * 
     * @param ramRemain the ramRemain value to set.
     * @return the SdkTelemetryDeviceInfo object itself.
     */
    @Metadata(properties = { MetadataProperties.GENERATED })
    public SdkTelemetryDeviceInfo setRamRemain(BinaryData ramRemain) {
        this.ramRemain = ramRemain;
        return this;
    }

    /**
     * Get the registerCPS property: The registerCPS property.
     * 
     * @return the registerCPS value.
     */
    @Metadata(properties = { MetadataProperties.GENERATED })
    public String getRegisterCPS() {
        return this.registerCPS;
    }

    /**
     * Set the registerCPS property: The registerCPS property.
     * 
     * @param registerCPS the registerCPS value to set.
     * @return the SdkTelemetryDeviceInfo object itself.
     */
    @Metadata(properties = { MetadataProperties.GENERATED })
    public SdkTelemetryDeviceInfo setRegisterCPS(String registerCPS) {
        this.registerCPS = registerCPS;
        return this;
    }

    /**
     * Get the romCapacity property: The romCapacity property.
     * 
     * @return the romCapacity value.
     */
    @Metadata(properties = { MetadataProperties.GENERATED })
    public BinaryData getRomCapacity() {
        return this.romCapacity;
    }

    /**
     * Set the romCapacity property: The romCapacity property.
     * 
     * @param romCapacity the romCapacity value to set.
     * @return the SdkTelemetryDeviceInfo object itself.
     */
    @Metadata(properties = { MetadataProperties.GENERATED })
    public SdkTelemetryDeviceInfo setRomCapacity(BinaryData romCapacity) {
        this.romCapacity = romCapacity;
        return this;
    }

    /**
     * Get the romRemain property: The romRemain property.
     * 
     * @return the romRemain value.
     */
    @Metadata(properties = { MetadataProperties.GENERATED })
    public Double getRomRemain() {
        return this.romRemain;
    }

    /**
     * Set the romRemain property: The romRemain property.
     * 
     * @param romRemain the romRemain value to set.
     * @return the SdkTelemetryDeviceInfo object itself.
     */
    @Metadata(properties = { MetadataProperties.GENERATED })
    public SdkTelemetryDeviceInfo setRomRemain(Double romRemain) {
        this.romRemain = romRemain;
        return this;
    }

    /**
     * Get the softSciX property: The soft_sciX property.
     * 
     * @return the softSciX value.
     */
    @Metadata(properties = { MetadataProperties.GENERATED })
    public Integer getSoftSciX() {
        return this.softSciX;
    }

    /**
     * Set the softSciX property: The soft_sciX property.
     * 
     * @param softSciX the softSciX value to set.
     * @return the SdkTelemetryDeviceInfo object itself.
     */
    @Metadata(properties = { MetadataProperties.GENERATED })
    public SdkTelemetryDeviceInfo setSoftSciX(Integer softSciX) {
        this.softSciX = softSciX;
        return this;
    }

    /**
     * Get the softSciY property: The soft_sciY property.
     * 
     * @return the softSciY value.
     */
    @Metadata(properties = { MetadataProperties.GENERATED })
    public Integer getSoftSciY() {
        return this.softSciY;
    }

    /**
     * Set the softSciY property: The soft_sciY property.
     * 
     * @param softSciY the softSciY value to set.
     * @return the SdkTelemetryDeviceInfo object itself.
     */
    @Metadata(properties = { MetadataProperties.GENERATED })
    public SdkTelemetryDeviceInfo setSoftSciY(Integer softSciY) {
        this.softSciY = softSciY;
        return this;
    }

    /**
     * Get the systemInfo property: The systemInfo property.
     * 
     * @return the systemInfo value.
     */
    @Metadata(properties = { MetadataProperties.GENERATED })
    public String getSystemInfo() {
        return this.systemInfo;
    }

    /**
     * Set the systemInfo property: The systemInfo property.
     * 
     * @param systemInfo the systemInfo value to set.
     * @return the SdkTelemetryDeviceInfo object itself.
     */
    @Metadata(properties = { MetadataProperties.GENERATED })
    public SdkTelemetryDeviceInfo setSystemInfo(String systemInfo) {
        this.systemInfo = systemInfo;
        return this;
    }

    /**
     * Get the systemLang property: The systemLang property.
     * 
     * @return the systemLang value.
     */
    @Metadata(properties = { MetadataProperties.GENERATED })
    public String getSystemLang() {
        return this.systemLang;
    }

    /**
     * Set the systemLang property: The systemLang property.
     * 
     * @param systemLang the systemLang value to set.
     * @return the SdkTelemetryDeviceInfo object itself.
     */
    @Metadata(properties = { MetadataProperties.GENERATED })
    public SdkTelemetryDeviceInfo setSystemLang(String systemLang) {
        this.systemLang = systemLang;
        return this;
    }

    /**
     * Get the uapc property: The uapc property.
     * 
     * @return the uapc value.
     */
    @Metadata(properties = { MetadataProperties.GENERATED })
    public String getUapc() {
        return this.uapc;
    }

    /**
     * Set the uapc property: The uapc property.
     * 
     * @param uapc the uapc value to set.
     * @return the SdkTelemetryDeviceInfo object itself.
     */
    @Metadata(properties = { MetadataProperties.GENERATED })
    public SdkTelemetryDeviceInfo setUapc(String uapc) {
        this.uapc = uapc;
        return this;
    }

    /**
     * Get the wmac property: The wmac property.
     * 
     * @return the wmac value.
     */
    @Metadata(properties = { MetadataProperties.GENERATED })
    public String getWmac() {
        return this.wmac;
    }

    /**
     * Set the wmac property: The wmac property.
     * 
     * @param wmac the wmac value to set.
     * @return the SdkTelemetryDeviceInfo object itself.
     */
    @Metadata(properties = { MetadataProperties.GENERATED })
    public SdkTelemetryDeviceInfo setWmac(String wmac) {
        this.wmac = wmac;
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
     * @return the SdkTelemetryDeviceInfo object itself.
     */
    @Metadata(properties = { MetadataProperties.GENERATED })
    public SdkTelemetryDeviceInfo setAdditionalProperties(Map<String, BinaryData> additionalProperties) {
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
        jsonWriter.writeStringField("addressMac", this.addressMac);
        jsonWriter.writeStringField("bundleId", this.bundleId);
        jsonWriter.writeStringField("cps", this.cps);
        jsonWriter.writeStringField("device_fp", this.deviceFp);
        jsonWriter.writeNumberField("device_sciX", this.snakeDeviceSciX);
        jsonWriter.writeNumberField("device_sciY", this.snakeDeviceSciY);
        jsonWriter.writeStringField("deviceId", this.deviceId);
        jsonWriter.writeStringField("deviceModel", this.deviceModel);
        jsonWriter.writeStringField("deviceName", this.deviceName);
        jsonWriter.writeNumberField("deviceSciX", this.deviceSciX);
        jsonWriter.writeNumberField("deviceSciY", this.deviceSciY);
        jsonWriter.writeNumberField("dpi", this.dpi);
        jsonWriter.writeNumberField("gpuMemSize", this.gpuMemSize);
        jsonWriter.writeStringField("gpuName", this.gpuName);
        jsonWriter.writeStringField("ip", this.ip);
        jsonWriter.writeStringField("isp", this.isp);
        jsonWriter.writeStringField("network_type", this.snakeNetworkType);
        jsonWriter.writeStringField("networkType", this.networkType);
        if (this.platform != null) {
            jsonWriter.writeFieldName("platform");
            this.platform.writeTo(jsonWriter);
        }
        jsonWriter.writeStringField("platformName", this.platformName);
        jsonWriter.writeNumberField("processorCount", this.processorCount);
        jsonWriter.writeNumberField("processorFrequency", this.processorFrequency);
        jsonWriter.writeStringField("processorType", this.processorType);
        if (this.ramCapacity != null) {
            jsonWriter.writeFieldName("ramCapacity");
            this.ramCapacity.writeTo(jsonWriter);
        }
        if (this.ramRemain != null) {
            jsonWriter.writeFieldName("ramRemain");
            this.ramRemain.writeTo(jsonWriter);
        }
        jsonWriter.writeStringField("registerCPS", this.registerCPS);
        if (this.romCapacity != null) {
            jsonWriter.writeFieldName("romCapacity");
            this.romCapacity.writeTo(jsonWriter);
        }
        jsonWriter.writeNumberField("romRemain", this.romRemain);
        jsonWriter.writeNumberField("soft_sciX", this.softSciX);
        jsonWriter.writeNumberField("soft_sciY", this.softSciY);
        jsonWriter.writeStringField("systemInfo", this.systemInfo);
        jsonWriter.writeStringField("systemLang", this.systemLang);
        jsonWriter.writeStringField("uapc", this.uapc);
        jsonWriter.writeStringField("wmac", this.wmac);
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
     * Reads an instance of SdkTelemetryDeviceInfo from the JsonReader.
     * 
     * @param jsonReader The JsonReader being read.
     * @return An instance of SdkTelemetryDeviceInfo if the JsonReader was pointing to an instance of it, or null if it
     * was pointing to JSON null.
     * @throws IOException If an error occurs while reading the SdkTelemetryDeviceInfo.
     */
    @Metadata(properties = { MetadataProperties.GENERATED })
    public static SdkTelemetryDeviceInfo fromJson(JsonReader jsonReader) throws IOException {
        return jsonReader.readObject(reader -> {
            SdkTelemetryDeviceInfo deserializedSdkTelemetryDeviceInfo = new SdkTelemetryDeviceInfo();
            Map<String, BinaryData> additionalProperties = null;
            while (reader.nextToken() != JsonToken.END_OBJECT) {
                String fieldName = reader.getFieldName();
                reader.nextToken();

                if ("addressMac".equals(fieldName)) {
                    deserializedSdkTelemetryDeviceInfo.addressMac = reader.getString();
                } else if ("bundleId".equals(fieldName)) {
                    deserializedSdkTelemetryDeviceInfo.bundleId = reader.getString();
                } else if ("cps".equals(fieldName)) {
                    deserializedSdkTelemetryDeviceInfo.cps = reader.getString();
                } else if ("device_fp".equals(fieldName)) {
                    deserializedSdkTelemetryDeviceInfo.deviceFp = reader.getString();
                } else if ("device_sciX".equals(fieldName)) {
                    deserializedSdkTelemetryDeviceInfo.snakeDeviceSciX = reader.getNullable(JsonReader::getInt);
                } else if ("device_sciY".equals(fieldName)) {
                    deserializedSdkTelemetryDeviceInfo.snakeDeviceSciY = reader.getNullable(JsonReader::getInt);
                } else if ("deviceId".equals(fieldName)) {
                    deserializedSdkTelemetryDeviceInfo.deviceId = reader.getString();
                } else if ("deviceModel".equals(fieldName)) {
                    deserializedSdkTelemetryDeviceInfo.deviceModel = reader.getString();
                } else if ("deviceName".equals(fieldName)) {
                    deserializedSdkTelemetryDeviceInfo.deviceName = reader.getString();
                } else if ("deviceSciX".equals(fieldName)) {
                    deserializedSdkTelemetryDeviceInfo.deviceSciX = reader.getNullable(JsonReader::getInt);
                } else if ("deviceSciY".equals(fieldName)) {
                    deserializedSdkTelemetryDeviceInfo.deviceSciY = reader.getNullable(JsonReader::getInt);
                } else if ("dpi".equals(fieldName)) {
                    deserializedSdkTelemetryDeviceInfo.dpi = reader.getNullable(JsonReader::getInt);
                } else if ("gpuMemSize".equals(fieldName)) {
                    deserializedSdkTelemetryDeviceInfo.gpuMemSize = reader.getNullable(JsonReader::getInt);
                } else if ("gpuName".equals(fieldName)) {
                    deserializedSdkTelemetryDeviceInfo.gpuName = reader.getString();
                } else if ("ip".equals(fieldName)) {
                    deserializedSdkTelemetryDeviceInfo.ip = reader.getString();
                } else if ("isp".equals(fieldName)) {
                    deserializedSdkTelemetryDeviceInfo.isp = reader.getString();
                } else if ("network_type".equals(fieldName)) {
                    deserializedSdkTelemetryDeviceInfo.snakeNetworkType = reader.getString();
                } else if ("networkType".equals(fieldName)) {
                    deserializedSdkTelemetryDeviceInfo.networkType = reader.getString();
                } else if ("platform".equals(fieldName)) {
                    deserializedSdkTelemetryDeviceInfo.platform
                        = reader.getNullable(nonNullReader -> BinaryData.fromObject(nonNullReader.readUntyped()));
                } else if ("platformName".equals(fieldName)) {
                    deserializedSdkTelemetryDeviceInfo.platformName = reader.getString();
                } else if ("processorCount".equals(fieldName)) {
                    deserializedSdkTelemetryDeviceInfo.processorCount = reader.getNullable(JsonReader::getInt);
                } else if ("processorFrequency".equals(fieldName)) {
                    deserializedSdkTelemetryDeviceInfo.processorFrequency = reader.getNullable(JsonReader::getDouble);
                } else if ("processorType".equals(fieldName)) {
                    deserializedSdkTelemetryDeviceInfo.processorType = reader.getString();
                } else if ("ramCapacity".equals(fieldName)) {
                    deserializedSdkTelemetryDeviceInfo.ramCapacity
                        = reader.getNullable(nonNullReader -> BinaryData.fromObject(nonNullReader.readUntyped()));
                } else if ("ramRemain".equals(fieldName)) {
                    deserializedSdkTelemetryDeviceInfo.ramRemain
                        = reader.getNullable(nonNullReader -> BinaryData.fromObject(nonNullReader.readUntyped()));
                } else if ("registerCPS".equals(fieldName)) {
                    deserializedSdkTelemetryDeviceInfo.registerCPS = reader.getString();
                } else if ("romCapacity".equals(fieldName)) {
                    deserializedSdkTelemetryDeviceInfo.romCapacity
                        = reader.getNullable(nonNullReader -> BinaryData.fromObject(nonNullReader.readUntyped()));
                } else if ("romRemain".equals(fieldName)) {
                    deserializedSdkTelemetryDeviceInfo.romRemain = reader.getNullable(JsonReader::getDouble);
                } else if ("soft_sciX".equals(fieldName)) {
                    deserializedSdkTelemetryDeviceInfo.softSciX = reader.getNullable(JsonReader::getInt);
                } else if ("soft_sciY".equals(fieldName)) {
                    deserializedSdkTelemetryDeviceInfo.softSciY = reader.getNullable(JsonReader::getInt);
                } else if ("systemInfo".equals(fieldName)) {
                    deserializedSdkTelemetryDeviceInfo.systemInfo = reader.getString();
                } else if ("systemLang".equals(fieldName)) {
                    deserializedSdkTelemetryDeviceInfo.systemLang = reader.getString();
                } else if ("uapc".equals(fieldName)) {
                    deserializedSdkTelemetryDeviceInfo.uapc = reader.getString();
                } else if ("wmac".equals(fieldName)) {
                    deserializedSdkTelemetryDeviceInfo.wmac = reader.getString();
                } else {
                    if (additionalProperties == null) {
                        additionalProperties = new LinkedHashMap<>();
                    }

                    additionalProperties.put(fieldName,
                        reader.getNullable(nonNullReader -> BinaryData.fromObject(nonNullReader.readUntyped())));
                }
            }
            deserializedSdkTelemetryDeviceInfo.additionalProperties = additionalProperties;

            return deserializedSdkTelemetryDeviceInfo;
        });
    }
}
