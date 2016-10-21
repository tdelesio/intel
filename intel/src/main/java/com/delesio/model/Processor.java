package com.delesio.model;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Transient;

import com.fasterxml.jackson.annotation.JsonProperty;

@Entity
public class Processor implements Serializable{

	@Id
	@JsonProperty("ProductId")
	private Integer ProductId;
	
	@JsonProperty("ProductFamilyId")
	private Integer ProductFamilyId;
	
	@JsonProperty("ProductSeriesId")
	private Integer ProductSeriesId;

	@JsonProperty("CodeNameEPMId")
	private Integer CodeNameEPMId;

	@JsonProperty("ProcessorBreandId")
	private Integer ProcessorBrandId;

	@JsonProperty("Embedded")
	private Boolean Embedded;

	@JsonProperty("Lithography")
	private String Lithography;

	@JsonProperty("PackageSize")
	private String PackageSize;

	@JsonProperty("MaxTDP")
	private Double MaxTDP;

	@JsonProperty("TCase")
	private String TCase;

	@JsonProperty("DatasheetUrl")
	private String DatasheetUrl;

	@JsonProperty("ProcessorNumber")
	private String ProcessorNumber;

	@JsonProperty("CoreCount")
	private Integer CoreCount;

	@JsonProperty("SpeedstepTechnology")
	private Boolean SpeedstepTechnology;

	@JsonProperty("ExecuteDisable")
	private Boolean ExecuteDisable;

	@JsonProperty("HaltState")
	private Boolean HaltState;

	@JsonProperty("EM64")
	private Boolean EM64;

	@JsonProperty("TXT")
	private Boolean TXT;

	@JsonProperty("VTX")
	private String VTX;

	@JsonProperty("HyperThreading")
	private Boolean HyperThreading;

	@JsonProperty("DemandBasedSwitching")
	private Boolean DemandBasedSwitching;

	@JsonProperty("CoreVoltage")
	private String CoreVoltage;

	@JsonProperty("FSBParity")
	private Boolean FSBParity;

	@JsonProperty("MemoryTypes")
	private String MemoryTypes;

	@JsonProperty("ECCMemory")
	private Boolean ECCMemory;

	@JsonProperty("NumMemoryChannels")
	private Integer NumMemoryChannels;

	@JsonProperty("MaxMemoryBandwidth")
	private Double MaxMemoryBandwidth;

	@JsonProperty("MaxCPUs")
	private Integer MaxCPUs;

	@JsonProperty("IntegratedGraphics")
	private Boolean IntegratedGraphics;

	@JsonProperty("DualDisplay")
	private Boolean DualDisplay;

	@JsonProperty("GraphicsOutput")
	private String GraphicsOutput;

	@JsonProperty("FlexMemoryTechnology")
	private Boolean FlexMemoryTechnology;

	@JsonProperty("FastMemoryTechnology")
	private Boolean FastMemoryTechnology;

	@JsonProperty("NumPCIExpressPorts")
	private Integer NumPCIExpressPorts;

        @JsonProperty("VTD")
	private Boolean VTD;

        @JsonProperty("CacheKB")
	private Double CacheKB;

        @JsonProperty("ClockSpeedMhz")
	private Double ClockSpeedMhz;

        @JsonProperty("TransistorCount")
	private Float TransistorCount;

        @JsonProperty("DieSize")
	private String DieSize;

        @JsonProperty("ThermalJunctionRateCode")
	private String ThermalJunctionRateCode;

        @JsonProperty("ThermalMonitoring2Indicator")
	private Boolean ThermalMonitoring2Indicator;

        @JsonProperty("TBT")
	private Boolean TBT;

        @JsonProperty("PhysicalAddressExtension")
	private String PhysicalAddressExtension;

        @JsonProperty("InustructionSet")
	private String InstructionSet;

        @JsonProperty("InstructionSetExtensions")
	private String InstructionSetExtensions;

        @JsonProperty("BusType")
	private String BusType;

        @JsonProperty("BusBandwidth")
	private Double BusBandwidth;

        @JsonProperty("BusTypeUnits")
	private String BusTypeUnits;

        @JsonProperty("BusNumPorts")
	private Integer BusNumPorts;

        @JsonProperty("MaxMemMB")
	private Integer MaxMemMB;

        @JsonProperty("PCIExpressRevision")
	private String PCIExpressRevision;

        @JsonProperty("PCIExpressConfigs")
	private String PCIExpressConfigs;

        @JsonProperty("AESTech")
	private Boolean AESTech;

        @JsonProperty("CacheType")
	private String CacheType;

        @JsonProperty("BusCoreRatio")
	private String BusCoreRatio;

        @JsonProperty("ClockSpeedMaxMhz")
	private Double ClockSpeedMaxMhz;

        @JsonProperty("CVTMID")
	private Boolean CVTMID;

        @JsonProperty("CVTHD")
	private Boolean CVTHD;

        @JsonProperty("FDI")
	private Boolean FDI;

        @JsonProperty("GraphicsMaxMemMB")
	private Integer GraphicsMaxMemMB;

        @JsonProperty("GraphicsFreqMHz")
	private Double GraphicsFreqMHz;

        @JsonProperty("GraphicsMaxFreqMHz")
	private Double GraphicsMaxFreqMHz;

        @JsonProperty("GIMCLithography")
	private String GIMCLithography;

        @JsonProperty("GIMCTransistorCount")
	private Float GIMCTransistorCount;

        @JsonProperty("GIMCDieSize")
	private String GIMCDieSize;

        @JsonProperty("Cache")
	private String Cache;

        @JsonProperty("ClockSpeed")
	private String ClockSpeed;

        @JsonProperty("ClockSpeedMax")
	private String ClockSpeedMax;

        @JsonProperty("ThreadCount")
	private Integer ThreadCount;

        @JsonProperty("MaxMem")
	private String MaxMem;

        @JsonProperty("GraphicsMaxMem")
	private String GraphicsMaxMem;

        @JsonProperty("GraphicsFreq")
	private String GraphicsFreq;

        @JsonProperty("GraphicsMaxFreq")
	private String GraphicsMaxFreq;

        @JsonProperty("BrandBadge")
	private String BrandBadge;

        @JsonProperty("ProcessorBrandName")
	private String ProcessorBrandName;

        @JsonProperty("Status")
	private Integer Status;

        @JsonProperty("ProductType")
	private Integer ProductType;

        @JsonProperty("MarketSegment")
	private String MarketSegment;

        @JsonProperty("BornOnDate")
	private String BornOnDate;

        @JsonProperty("ProductName")
	private String ProductName;

        @JsonProperty("TBTVersion")
	private String TBTVersion;

        @JsonProperty("QuickSyncVideo")
	private Boolean QuickSyncVideo;

        @JsonProperty("WiDi")
	private Boolean WiDi;

        @JsonProperty("AdvancedVectorExtensions")
	private Boolean AdvancedVectorExtensions;

        @JsonProperty("InTru3D")
	private Boolean InTru3D;

        @JsonProperty("MyWiFiTech")
	private Boolean MyWiFiTech;

        @JsonProperty("ScalableSockets")
	private String ScalableSockets;

    @JsonProperty("LaunchDate")
    private String LaunchDate;
    
    private Long launchDateDisplay;

        @JsonProperty("Link")
	private String Link;

        @JsonProperty("IntelInsider")
	private Boolean IntelInsider;

        @JsonProperty("ProcessorGraphics")
	private Boolean ProcessorGraphics;

        @JsonProperty("GraphicsModel")
	private String GraphicsModel;

        @JsonProperty("LastChange")
	private Integer LastChange;

        @JsonProperty("VProTechnology")
	private Boolean VProTechnology;

        @JsonProperty("ExtendedPageTables")
	private Boolean ExtendedPageTables;

        @JsonProperty("NumDisplaysSupported")
	private Integer NumDisplaysSupported;

        @JsonProperty("SocketsSupported")
	private String SocketsSupported;

        @JsonProperty("ScenarioDesignPower")
	private Double ScenarioDesignPower;

        @JsonProperty("SecureKeyTechVersion")
	private Float SecureKeyTechVersion;

        @JsonProperty("IdentityProtectionTechVersion")
	private Float IdentityProtectionTechVersion;

        @JsonProperty("InstructionReplayTechVersion")
	private Float InstructionReplayTechVersion;

        @JsonProperty("TransactionalSynchronizationExtensionVersion")
	private Float TransactionalSynchronizationExtensionVersion;

        @JsonProperty("ThermalSolutionSpecification")
	private String ThermalSolutionSpecification;

        @JsonProperty("SmartConnectVersion")
	private Float SmartConnectVersion;

        @JsonProperty("RapidStorageTech")
	private Boolean RapidStorageTech;

        @JsonProperty("SATA6PortCount")
	private Integer SATA6PortCount;

        @JsonProperty("GraphicsCoreCount")
	private Integer GraphicsCoreCount;

        @JsonProperty("GraphicsVideoDecode")
	private String GraphicsVideoDecode;

        @JsonProperty("SmartIdleTechVersion")
	private Float SmartIdleTechVersion;

        @JsonProperty("Antenna")
	private String Antenna;

        @JsonProperty("BurstFrequencyMhz")
	private Double BurstFrequencyMhz;

        @JsonProperty("GraphicsBurstFrequencyMhz")
	private Double GraphicsBurstFrequencyMhz;

        @JsonProperty("AntiTheftTechnology")
	private Boolean AntiTheftTechnology;

        @JsonProperty("SmartResponseTechVersion")
	private Float SmartResponseTechVersion;

        @JsonProperty("SmallBusinessAdvantageTechVersion")
	private Float SmallBusinessAdvantageTechVersion;

        @JsonProperty("StableImagePlatformProgramVersion")
	private Float StableImagePlatformProgramVersion;

        @JsonProperty("GraphicsBurstFrequency")
	private String GraphicsBurstFrequency;

        @JsonProperty("BurstFrequency")
	private String BurstFrequency;

        @JsonProperty("SecureBootTechVersion")
	private Float SecureBootTechVersion;

        @JsonProperty("DrcConflictFree")
	private Boolean DrcConflictFree;

        @JsonProperty("ClearVideoTechnology")
	private Boolean ClearVideoTechnology;

        @JsonProperty("ConfigTDPMax")
	private Double ConfigTDPMax;

        @JsonProperty("ConfigTDPMaxFrequencyMhz")
	private Double ConfigTDPMaxFrequencyMhz;

        @JsonProperty("ConfigTDPMaxFrequency")
	private String ConfigTDPMaxFrequency;

        @JsonProperty("ConfigTDPMin")
	private Double ConfigTDPMin;

        @JsonProperty("ConfigTDPMinFrequencyMhz")
	private Double ConfigTDPMinFrequencyMhz;

        @JsonProperty("ConfigTDPMinFrequency")
	private String ConfigTDPMinFrequency;

        @JsonProperty("GraphicsExecutionUnits")
	private Integer GraphicsExecutionUnits;

        @JsonProperty("GraphicsMaxResolutionHDMI")
	private String GraphicsMaxResolutionHDMI;

        @JsonProperty("GraphicsMaxResolutionDP")
	private String GraphicsMaxResolutionDP;

        @JsonProperty("GraphicsMaxResolutionnIFP")
	private String GraphicsMaxResolutionIFP;

        @JsonProperty("GraphicsMaxResoluionVGA")
	private String GraphicsMaxResoluionVGA;

        @JsonProperty("GraphicsDirectXSupport")
	private String GraphicsDirectXSupport;

        @JsonProperty("GraphicsOpenGLSupport")
	private String GraphicsOpenGLSupport;

        @JsonProperty("GraphicsDeviceId")
	private String GraphicsDeviceId;

        @JsonProperty("BaseBandFunctions")
	private String BasebandFunctions;

        @JsonProperty("RadioFreqTransceiver")
	private String RadioFreqTransceiver;

        @JsonProperty("RadioFreqTransceiverFunctions")
	private String RadioFreqTransceiverFunctions;

        @JsonProperty("ProtocolStack")
	private String ProtocolStack;

        @JsonProperty("SoftwareGuardExtensions")
	private Integer SoftwareGuardExtensions;

        @JsonProperty("GraphicsMaxResolutionHDMI2")
	private String GraphicsMaxResolutionHDMI2;

        @JsonProperty("GraphicsMaxResolutionWiDi")
	private String GraphicsMaxResolutionWiDi;

        @JsonProperty("Graphics4KSupportLevel")
	private String Graphics4KSupportLevel;

        @JsonProperty("GraphicsMaxRefreshRateHz")
	private Integer GraphicsMaxRefreshRateHz;
    
        
    //private Long launchDateDisplay;

	public Integer getProductId() {
		return ProductId;
	}
	public void setProductId(Integer productId) {
		ProductId = productId;
	}
	public Integer getProductFamilyId() {
		return ProductFamilyId;
	}
	public void setProductFamilyId(Integer productFamilyId) {
		ProductFamilyId = productFamilyId;
	}
	public Integer getProductSeriesId() {
		return ProductSeriesId;
	}
	public void setProductSeriesId(Integer productSeriesId) {
		ProductSeriesId = productSeriesId;
	}
	public Integer getCodeNameEPMId() {
		return CodeNameEPMId;
	}
	public void setCodeNameEPMId(Integer codeNameEPMId) {
		CodeNameEPMId = codeNameEPMId;
	}
	public Integer getProcessorBrandId() {
		return ProcessorBrandId;
	}
	public void setProcessorBrandId(Integer processorBrandId) {
		ProcessorBrandId = processorBrandId;
	}
	public Boolean getEmbedded() {
		return Embedded;
	}
	public void setEmbedded(Boolean embedded) {
		Embedded = embedded;
	}
	public String getLithography() {
		return Lithography;
	}
	public void setLithography(String lithography) {
		Lithography = lithography;
	}
	public String getPackageSize() {
		return PackageSize;
	}
	public void setPackageSize(String packageSize) {
		PackageSize = packageSize;
	}
	public Double getMaxTDP() {
		return MaxTDP;
	}
	public void setMaxTDP(Double maxTDP) {
		MaxTDP = maxTDP;
	}
	public String getTCase() {
		return TCase;
	}
	public void setTCase(String tCase) {
		TCase = tCase;
	}
	public String getDatasheetUrl() {
		return DatasheetUrl;
	}
	public void setDatasheetUrl(String datasheetUrl) {
		DatasheetUrl = datasheetUrl;
	}
	public String getProcessorNumber() {
		return ProcessorNumber;
	}
	public void setProcessorNumber(String processorNumber) {
		ProcessorNumber = processorNumber;
	}
	public Integer getCoreCount() {
		return CoreCount;
	}
	public void setCoreCount(Integer coreCount) {
		CoreCount = coreCount;
	}
	public Boolean getSpeedstepTechnology() {
		return SpeedstepTechnology;
	}
	public void setSpeedstepTechnology(Boolean speedstepTechnology) {
		SpeedstepTechnology = speedstepTechnology;
	}
	public Boolean getExecuteDisable() {
		return ExecuteDisable;
	}
	public void setExecuteDisable(Boolean executeDisable) {
		ExecuteDisable = executeDisable;
	}
	public Boolean getHaltState() {
		return HaltState;
	}
	public void setHaltState(Boolean haltState) {
		HaltState = haltState;
	}
	public Boolean getEM64() {
		return EM64;
	}
	public void setEM64(Boolean eM64) {
		EM64 = eM64;
	}
	public Boolean getTXT() {
		return TXT;
	}
	public void setTXT(Boolean tXT) {
		TXT = tXT;
	}
	public String getVTX() {
		return VTX;
	}
	public void setVTX(String vTX) {
		VTX = vTX;
	}
	public Boolean getHyperThreading() {
		return HyperThreading;
	}
	public void setHyperThreading(Boolean hyperThreading) {
		HyperThreading = hyperThreading;
	}
	public Boolean getDemandBasedSwitching() {
		return DemandBasedSwitching;
	}
	public void setDemandBasedSwitching(Boolean demandBasedSwitching) {
		DemandBasedSwitching = demandBasedSwitching;
	}
	public String getCoreVoltage() {
		return CoreVoltage;
	}
	public void setCoreVoltage(String coreVoltage) {
		CoreVoltage = coreVoltage;
	}
	public Boolean getFSBParity() {
		return FSBParity;
	}
	public void setFSBParity(Boolean fSBParity) {
		FSBParity = fSBParity;
	}
	public String getMemoryTypes() {
		return MemoryTypes;
	}
	public void setMemoryTypes(String memoryTypes) {
		MemoryTypes = memoryTypes;
	}
	public Boolean getECCMemory() {
		return ECCMemory;
	}
	public void setECCMemory(Boolean eCCMemory) {
		ECCMemory = eCCMemory;
	}
	public Integer getNumMemoryChannels() {
		return NumMemoryChannels;
	}
	public void setNumMemoryChannels(Integer numMemoryChannels) {
		NumMemoryChannels = numMemoryChannels;
	}
	public Double getMaxMemoryBandwidth() {
		return MaxMemoryBandwidth;
	}
	public void setMaxMemoryBandwidth(Double maxMemoryBandwidth) {
		MaxMemoryBandwidth = maxMemoryBandwidth;
	}
	public Integer getMaxCPUs() {
		return MaxCPUs;
	}
	public void setMaxCPUs(Integer maxCPUs) {
		MaxCPUs = maxCPUs;
	}
	public Boolean getIntegratedGraphics() {
		return IntegratedGraphics;
	}
	public void setIntegratedGraphics(Boolean integratedGraphics) {
		IntegratedGraphics = integratedGraphics;
	}
	public Boolean getDualDisplay() {
		return DualDisplay;
	}
	public void setDualDisplay(Boolean dualDisplay) {
		DualDisplay = dualDisplay;
	}
	public String getGraphicsOutput() {
		return GraphicsOutput;
	}
	public void setGraphicsOutput(String graphicsOutput) {
		GraphicsOutput = graphicsOutput;
	}
	public Boolean getFlexMemoryTechnology() {
		return FlexMemoryTechnology;
	}
	public void setFlexMemoryTechnology(Boolean flexMemoryTechnology) {
		FlexMemoryTechnology = flexMemoryTechnology;
	}
	public Boolean getFastMemoryTechnology() {
		return FastMemoryTechnology;
	}
	public void setFastMemoryTechnology(Boolean fastMemoryTechnology) {
		FastMemoryTechnology = fastMemoryTechnology;
	}
	public Integer getNumPCIExpressPorts() {
		return NumPCIExpressPorts;
	}
	public void setNumPCIExpressPorts(Integer numPCIExpressPorts) {
		NumPCIExpressPorts = numPCIExpressPorts;
	}
	public Boolean getVTD() {
		return VTD;
	}
	public void setVTD(Boolean vTD) {
		VTD = vTD;
	}
	public Double getCacheKB() {
		return CacheKB;
	}
	public void setCacheKB(Double cacheKB) {
		CacheKB = cacheKB;
	}
	public Double getClockSpeedMhz() {
		return ClockSpeedMhz;
	}
	public void setClockSpeedMhz(Double clockSpeedMhz) {
		ClockSpeedMhz = clockSpeedMhz;
	}
	public Float getTransistorCount() {
		return TransistorCount;
	}
	public void setTransistorCount(Float transistorCount) {
		TransistorCount = transistorCount;
	}
	public String getDieSize() {
		return DieSize;
	}
	public void setDieSize(String dieSize) {
		DieSize = dieSize;
	}
	public String getThermalJunctionRateCode() {
		return ThermalJunctionRateCode;
	}
	public void setThermalJunctionRateCode(String thermalJunctionRateCode) {
		ThermalJunctionRateCode = thermalJunctionRateCode;
	}
	public Boolean getThermalMonitoring2Indicator() {
		return ThermalMonitoring2Indicator;
	}
	public void setThermalMonitoring2Indicator(Boolean thermalMonitoring2Indicator) {
		ThermalMonitoring2Indicator = thermalMonitoring2Indicator;
	}
	public Boolean getTBT() {
		return TBT;
	}
	public void setTBT(Boolean tBT) {
		TBT = tBT;
	}
	public String getPhysicalAddressExtension() {
		return PhysicalAddressExtension;
	}
	public void setPhysicalAddressExtension(String physicalAddressExtension) {
		PhysicalAddressExtension = physicalAddressExtension;
	}
	public String getInstructionSet() {
		return InstructionSet;
	}
	public void setInstructionSet(String instructionSet) {
		InstructionSet = instructionSet;
	}
	public String getInstructionSetExtensions() {
		return InstructionSetExtensions;
	}
	public void setInstructionSetExtensions(String instructionSetExtensions) {
		InstructionSetExtensions = instructionSetExtensions;
	}
	public String getBusType() {
		return BusType;
	}
	public void setBusType(String busType) {
		BusType = busType;
	}
	public Double getBusBandwidth() {
		return BusBandwidth;
	}
	public void setBusBandwidth(Double busBandwidth) {
		BusBandwidth = busBandwidth;
	}
	public String getBusTypeUnits() {
		return BusTypeUnits;
	}
	public void setBusTypeUnits(String busTypeUnits) {
		BusTypeUnits = busTypeUnits;
	}
	public Integer getBusNumPorts() {
		return BusNumPorts;
	}
	public void setBusNumPorts(Integer busNumPorts) {
		BusNumPorts = busNumPorts;
	}
	public Integer getMaxMemMB() {
		return MaxMemMB;
	}
	public void setMaxMemMB(Integer maxMemMB) {
		MaxMemMB = maxMemMB;
	}
	public String getPCIExpressRevision() {
		return PCIExpressRevision;
	}
	public void setPCIExpressRevision(String pCIExpressRevision) {
		PCIExpressRevision = pCIExpressRevision;
	}
	public String getPCIExpressConfigs() {
		return PCIExpressConfigs;
	}
	public void setPCIExpressConfigs(String pCIExpressConfigs) {
		PCIExpressConfigs = pCIExpressConfigs;
	}
	public Boolean getAESTech() {
		return AESTech;
	}
	public void setAESTech(Boolean aESTech) {
		AESTech = aESTech;
	}
	public String getCacheType() {
		return CacheType;
	}
	public void setCacheType(String cacheType) {
		CacheType = cacheType;
	}
	public String getBusCoreRatio() {
		return BusCoreRatio;
	}
	public void setBusCoreRatio(String busCoreRatio) {
		BusCoreRatio = busCoreRatio;
	}
	public Double getClockSpeedMaxMhz() {
		return ClockSpeedMaxMhz;
	}
	public void setClockSpeedMaxMhz(Double clockSpeedMaxMhz) {
		ClockSpeedMaxMhz = clockSpeedMaxMhz;
	}
	public Boolean getCVTMID() {
		return CVTMID;
	}
	public void setCVTMID(Boolean cVTMID) {
		CVTMID = cVTMID;
	}
	public Boolean getCVTHD() {
		return CVTHD;
	}
	public void setCVTHD(Boolean cVTHD) {
		CVTHD = cVTHD;
	}
	public Boolean getFDI() {
		return FDI;
	}
	public void setFDI(Boolean fDI) {
		FDI = fDI;
	}
	public Integer getGraphicsMaxMemMB() {
		return GraphicsMaxMemMB;
	}
	public void setGraphicsMaxMemMB(Integer graphicsMaxMemMB) {
		GraphicsMaxMemMB = graphicsMaxMemMB;
	}
	public Double getGraphicsFreqMHz() {
		return GraphicsFreqMHz;
	}
	public void setGraphicsFreqMHz(Double graphicsFreqMHz) {
		GraphicsFreqMHz = graphicsFreqMHz;
	}
	public Double getGraphicsMaxFreqMHz() {
		return GraphicsMaxFreqMHz;
	}
	public void setGraphicsMaxFreqMHz(Double graphicsMaxFreqMHz) {
		GraphicsMaxFreqMHz = graphicsMaxFreqMHz;
	}
	public String getGIMCLithography() {
		return GIMCLithography;
	}
	public void setGIMCLithography(String gIMCLithography) {
		GIMCLithography = gIMCLithography;
	}
	public Float getGIMCTransistorCount() {
		return GIMCTransistorCount;
	}
	public void setGIMCTransistorCount(Float gIMCTransistorCount) {
		GIMCTransistorCount = gIMCTransistorCount;
	}
	public String getGIMCDieSize() {
		return GIMCDieSize;
	}
	public void setGIMCDieSize(String gIMCDieSize) {
		GIMCDieSize = gIMCDieSize;
	}
	public String getCache() {
		return Cache;
	}
	public void setCache(String cache) {
		Cache = cache;
	}
	public String getClockSpeed() {
		return ClockSpeed;
	}
	public void setClockSpeed(String clockSpeed) {
		ClockSpeed = clockSpeed;
	}
	public String getClockSpeedMax() {
		return ClockSpeedMax;
	}
	public void setClockSpeedMax(String clockSpeedMax) {
		ClockSpeedMax = clockSpeedMax;
	}
	public Integer getThreadCount() {
		return ThreadCount;
	}
	public void setThreadCount(Integer threadCount) {
		ThreadCount = threadCount;
	}
	public String getMaxMem() {
		return MaxMem;
	}
	public void setMaxMem(String maxMem) {
		MaxMem = maxMem;
	}
	public String getGraphicsMaxMem() {
		return GraphicsMaxMem;
	}
	public void setGraphicsMaxMem(String graphicsMaxMem) {
		GraphicsMaxMem = graphicsMaxMem;
	}
	public String getGraphicsFreq() {
		return GraphicsFreq;
	}
	public void setGraphicsFreq(String graphicsFreq) {
		GraphicsFreq = graphicsFreq;
	}
	public String getGraphicsMaxFreq() {
		return GraphicsMaxFreq;
	}
	public void setGraphicsMaxFreq(String graphicsMaxFreq) {
		GraphicsMaxFreq = graphicsMaxFreq;
	}
	public String getBrandBadge() {
		return BrandBadge;
	}
	public void setBrandBadge(String brandBadge) {
		BrandBadge = brandBadge;
	}
	public String getProcessorBrandName() {
		return ProcessorBrandName;
	}
	public void setProcessorBrandName(String processorBrandName) {
		ProcessorBrandName = processorBrandName;
	}
	public Integer getStatus() {
		return Status;
	}
	public void setStatus(Integer status) {
		Status = status;
	}
	public Integer getProductType() {
		return ProductType;
	}
	public void setProductType(Integer productType) {
		ProductType = productType;
	}
	public String getMarketSegment() {
		return MarketSegment;
	}
	public void setMarketSegment(String marketSegment) {
		MarketSegment = marketSegment;
	}
	public String getBornOnDate() {
		return BornOnDate;
	}
	public void setBornOnDate(String bornOnDate) {
		BornOnDate = bornOnDate;
	}
	public String getProductName() {
		return ProductName;
	}
	public void setProductName(String productName) {
		ProductName = productName;
	}
	public String getTBTVersion() {
		return TBTVersion;
	}
	public void setTBTVersion(String tBTVersion) {
		TBTVersion = tBTVersion;
	}
	public Boolean getQuickSyncVideo() {
		return QuickSyncVideo;
	}
	public void setQuickSyncVideo(Boolean quickSyncVideo) {
		QuickSyncVideo = quickSyncVideo;
	}
	public Boolean getWiDi() {
		return WiDi;
	}
	public void setWiDi(Boolean wiDi) {
		WiDi = wiDi;
	}
	public Boolean getAdvancedVectorExtensions() {
		return AdvancedVectorExtensions;
	}
	public void setAdvancedVectorExtensions(Boolean advancedVectorExtensions) {
		AdvancedVectorExtensions = advancedVectorExtensions;
	}
	public Boolean getInTru3D() {
		return InTru3D;
	}
	public void setInTru3D(Boolean inTru3D) {
		InTru3D = inTru3D;
	}
	public Boolean getMyWiFiTech() {
		return MyWiFiTech;
	}
	public void setMyWiFiTech(Boolean myWiFiTech) {
		MyWiFiTech = myWiFiTech;
	}
	public String getScalableSockets() {
		return ScalableSockets;
	}
	public void setScalableSockets(String scalableSockets) {
		ScalableSockets = scalableSockets;
	}
	public String getLink() {
		return Link;
	}
	public void setLink(String link) {
		Link = link;
	}
	public Boolean getIntelInsider() {
		return IntelInsider;
	}
	public void setIntelInsider(Boolean intelInsider) {
		IntelInsider = intelInsider;
	}
	public Boolean getProcessorGraphics() {
		return ProcessorGraphics;
	}
	public void setProcessorGraphics(Boolean processorGraphics) {
		ProcessorGraphics = processorGraphics;
	}
	public String getGraphicsModel() {
		return GraphicsModel;
	}
	public void setGraphicsModel(String graphicsModel) {
		GraphicsModel = graphicsModel;
	}
	public Integer getLastChange() {
		return LastChange;
	}
	public void setLastChange(Integer lastChange) {
		LastChange = lastChange;
	}
	public Boolean getVProTechnology() {
		return VProTechnology;
	}
	public void setVProTechnology(Boolean vProTechnology) {
		VProTechnology = vProTechnology;
	}
	public Boolean getExtendedPageTables() {
		return ExtendedPageTables;
	}
	public void setExtendedPageTables(Boolean extendedPageTables) {
		ExtendedPageTables = extendedPageTables;
	}
	public Integer getNumDisplaysSupported() {
		return NumDisplaysSupported;
	}
	public void setNumDisplaysSupported(Integer numDisplaysSupported) {
		NumDisplaysSupported = numDisplaysSupported;
	}
	public String getSocketsSupported() {
		return SocketsSupported;
	}
	public void setSocketsSupported(String socketsSupported) {
		SocketsSupported = socketsSupported;
	}
	public Double getScenarioDesignPower() {
		return ScenarioDesignPower;
	}
	public void setScenarioDesignPower(Double scenarioDesignPower) {
		ScenarioDesignPower = scenarioDesignPower;
	}
	public Float getSecureKeyTechVersion() {
		return SecureKeyTechVersion;
	}
	public void setSecureKeyTechVersion(Float secureKeyTechVersion) {
		SecureKeyTechVersion = secureKeyTechVersion;
	}
	public Float getIdentityProtectionTechVersion() {
		return IdentityProtectionTechVersion;
	}
	public void setIdentityProtectionTechVersion(Float identityProtectionTechVersion) {
		IdentityProtectionTechVersion = identityProtectionTechVersion;
	}
	public Float getInstructionReplayTechVersion() {
		return InstructionReplayTechVersion;
	}
	public void setInstructionReplayTechVersion(Float instructionReplayTechVersion) {
		InstructionReplayTechVersion = instructionReplayTechVersion;
	}
	public Float getTransactionalSynchronizationExtensionVersion() {
		return TransactionalSynchronizationExtensionVersion;
	}
	public void setTransactionalSynchronizationExtensionVersion(Float transactionalSynchronizationExtensionVersion) {
		TransactionalSynchronizationExtensionVersion = transactionalSynchronizationExtensionVersion;
	}
	public String getThermalSolutionSpecification() {
		return ThermalSolutionSpecification;
	}
	public void setThermalSolutionSpecification(String thermalSolutionSpecification) {
		ThermalSolutionSpecification = thermalSolutionSpecification;
	}
	public Float getSmartConnectVersion() {
		return SmartConnectVersion;
	}
	public void setSmartConnectVersion(Float smartConnectVersion) {
		SmartConnectVersion = smartConnectVersion;
	}
	public Boolean getRapidStorageTech() {
		return RapidStorageTech;
	}
	public void setRapidStorageTech(Boolean rapidStorageTech) {
		RapidStorageTech = rapidStorageTech;
	}
	public Integer getSATA6PortCount() {
		return SATA6PortCount;
	}
	public void setSATA6PortCount(Integer sATA6PortCount) {
		SATA6PortCount = sATA6PortCount;
	}
	public Integer getGraphicsCoreCount() {
		return GraphicsCoreCount;
	}
	public void setGraphicsCoreCount(Integer graphicsCoreCount) {
		GraphicsCoreCount = graphicsCoreCount;
	}
	public String getGraphicsVideoDecode() {
		return GraphicsVideoDecode;
	}
	public void setGraphicsVideoDecode(String graphicsVideoDecode) {
		GraphicsVideoDecode = graphicsVideoDecode;
	}
	public Float getSmartIdleTechVersion() {
		return SmartIdleTechVersion;
	}
	public void setSmartIdleTechVersion(Float smartIdleTechVersion) {
		SmartIdleTechVersion = smartIdleTechVersion;
	}
	public String getAntenna() {
		return Antenna;
	}
	public void setAntenna(String antenna) {
		Antenna = antenna;
	}
	public Double getBurstFrequencyMhz() {
		return BurstFrequencyMhz;
	}
	public void setBurstFrequencyMhz(Double burstFrequencyMhz) {
		BurstFrequencyMhz = burstFrequencyMhz;
	}
	public Double getGraphicsBurstFrequencyMhz() {
		return GraphicsBurstFrequencyMhz;
	}
	public void setGraphicsBurstFrequencyMhz(Double graphicsBurstFrequencyMhz) {
		GraphicsBurstFrequencyMhz = graphicsBurstFrequencyMhz;
	}
	public Boolean getAntiTheftTechnology() {
		return AntiTheftTechnology;
	}
	public void setAntiTheftTechnology(Boolean antiTheftTechnology) {
		AntiTheftTechnology = antiTheftTechnology;
	}
	public Float getSmartResponseTechVersion() {
		return SmartResponseTechVersion;
	}
	public void setSmartResponseTechVersion(Float smartResponseTechVersion) {
		SmartResponseTechVersion = smartResponseTechVersion;
	}
	public Float getSmallBusinessAdvantageTechVersion() {
		return SmallBusinessAdvantageTechVersion;
	}
	public void setSmallBusinessAdvantageTechVersion(Float smallBusinessAdvantageTechVersion) {
		SmallBusinessAdvantageTechVersion = smallBusinessAdvantageTechVersion;
	}
	public Float getStableImagePlatformProgramVersion() {
		return StableImagePlatformProgramVersion;
	}
	public void setStableImagePlatformProgramVersion(Float stableImagePlatformProgramVersion) {
		StableImagePlatformProgramVersion = stableImagePlatformProgramVersion;
	}
	public String getGraphicsBurstFrequency() {
		return GraphicsBurstFrequency;
	}
	public void setGraphicsBurstFrequency(String graphicsBurstFrequency) {
		GraphicsBurstFrequency = graphicsBurstFrequency;
	}
	public String getBurstFrequency() {
		return BurstFrequency;
	}
	public void setBurstFrequency(String burstFrequency) {
		BurstFrequency = burstFrequency;
	}
	public Float getSecureBootTechVersion() {
		return SecureBootTechVersion;
	}
	public void setSecureBootTechVersion(Float secureBootTechVersion) {
		SecureBootTechVersion = secureBootTechVersion;
	}
	public Boolean getDrcConflictFree() {
		return DrcConflictFree;
	}
	public void setDrcConflictFree(Boolean drcConflictFree) {
		DrcConflictFree = drcConflictFree;
	}
	public Boolean getClearVideoTechnology() {
		return ClearVideoTechnology;
	}
	public void setClearVideoTechnology(Boolean clearVideoTechnology) {
		ClearVideoTechnology = clearVideoTechnology;
	}
	public Double getConfigTDPMax() {
		return ConfigTDPMax;
	}
	public void setConfigTDPMax(Double configTDPMax) {
		ConfigTDPMax = configTDPMax;
	}
	public Double getConfigTDPMaxFrequencyMhz() {
		return ConfigTDPMaxFrequencyMhz;
	}
	public void setConfigTDPMaxFrequencyMhz(Double configTDPMaxFrequencyMhz) {
		ConfigTDPMaxFrequencyMhz = configTDPMaxFrequencyMhz;
	}
	public String getConfigTDPMaxFrequency() {
		return ConfigTDPMaxFrequency;
	}
	public void setConfigTDPMaxFrequency(String configTDPMaxFrequency) {
		ConfigTDPMaxFrequency = configTDPMaxFrequency;
	}
	public Double getConfigTDPMin() {
		return ConfigTDPMin;
	}
	public void setConfigTDPMin(Double configTDPMin) {
		ConfigTDPMin = configTDPMin;
	}
	public Double getConfigTDPMinFrequencyMhz() {
		return ConfigTDPMinFrequencyMhz;
	}
	public void setConfigTDPMinFrequencyMhz(Double configTDPMinFrequencyMhz) {
		ConfigTDPMinFrequencyMhz = configTDPMinFrequencyMhz;
	}
	public String getConfigTDPMinFrequency() {
		return ConfigTDPMinFrequency;
	}
	public void setConfigTDPMinFrequency(String configTDPMinFrequency) {
		ConfigTDPMinFrequency = configTDPMinFrequency;
	}
	public Integer getGraphicsExecutionUnits() {
		return GraphicsExecutionUnits;
	}
	public void setGraphicsExecutionUnits(Integer graphicsExecutionUnits) {
		GraphicsExecutionUnits = graphicsExecutionUnits;
	}
	public String getGraphicsMaxResolutionHDMI() {
		return GraphicsMaxResolutionHDMI;
	}
	public void setGraphicsMaxResolutionHDMI(String graphicsMaxResolutionHDMI) {
		GraphicsMaxResolutionHDMI = graphicsMaxResolutionHDMI;
	}
	public String getGraphicsMaxResolutionDP() {
		return GraphicsMaxResolutionDP;
	}
	public void setGraphicsMaxResolutionDP(String graphicsMaxResolutionDP) {
		GraphicsMaxResolutionDP = graphicsMaxResolutionDP;
	}
	public String getGraphicsMaxResolutionIFP() {
		return GraphicsMaxResolutionIFP;
	}
	public void setGraphicsMaxResolutionIFP(String graphicsMaxResolutionIFP) {
		GraphicsMaxResolutionIFP = graphicsMaxResolutionIFP;
	}
	public String getGraphicsMaxResoluionVGA() {
		return GraphicsMaxResoluionVGA;
	}
	public void setGraphicsMaxResoluionVGA(String graphicsMaxResoluionVGA) {
		GraphicsMaxResoluionVGA = graphicsMaxResoluionVGA;
	}
	public String getGraphicsDirectXSupport() {
		return GraphicsDirectXSupport;
	}
	public void setGraphicsDirectXSupport(String graphicsDirectXSupport) {
		GraphicsDirectXSupport = graphicsDirectXSupport;
	}
	public String getGraphicsOpenGLSupport() {
		return GraphicsOpenGLSupport;
	}
	public void setGraphicsOpenGLSupport(String graphicsOpenGLSupport) {
		GraphicsOpenGLSupport = graphicsOpenGLSupport;
	}
	public String getGraphicsDeviceId() {
		return GraphicsDeviceId;
	}
	public void setGraphicsDeviceId(String graphicsDeviceId) {
		GraphicsDeviceId = graphicsDeviceId;
	}
	public String getBasebandFunctions() {
		return BasebandFunctions;
	}
	public void setBasebandFunctions(String basebandFunctions) {
		BasebandFunctions = basebandFunctions;
	}
	public String getRadioFreqTransceiver() {
		return RadioFreqTransceiver;
	}
	public void setRadioFreqTransceiver(String radioFreqTransceiver) {
		RadioFreqTransceiver = radioFreqTransceiver;
	}
	public String getRadioFreqTransceiverFunctions() {
		return RadioFreqTransceiverFunctions;
	}
	public void setRadioFreqTransceiverFunctions(String radioFreqTransceiverFunctions) {
		RadioFreqTransceiverFunctions = radioFreqTransceiverFunctions;
	}
	public String getProtocolStack() {
		return ProtocolStack;
	}
	public void setProtocolStack(String protocolStack) {
		ProtocolStack = protocolStack;
	}
	public Integer getSoftwareGuardExtensions() {
		return SoftwareGuardExtensions;
	}
	public void setSoftwareGuardExtensions(Integer softwareGuardExtensions) {
		SoftwareGuardExtensions = softwareGuardExtensions;
	}
	public String getGraphicsMaxResolutionHDMI2() {
		return GraphicsMaxResolutionHDMI2;
	}
	public void setGraphicsMaxResolutionHDMI2(String graphicsMaxResolutionHDMI2) {
		GraphicsMaxResolutionHDMI2 = graphicsMaxResolutionHDMI2;
	}
	public String getGraphicsMaxResolutionWiDi() {
		return GraphicsMaxResolutionWiDi;
	}
	public void setGraphicsMaxResolutionWiDi(String graphicsMaxResolutionWiDi) {
		GraphicsMaxResolutionWiDi = graphicsMaxResolutionWiDi;
	}
	public String getGraphics4KSupportLevel() {
		return Graphics4KSupportLevel;
	}
	public void setGraphics4KSupportLevel(String graphics4kSupportLevel) {
		Graphics4KSupportLevel = graphics4kSupportLevel;
	}
	public Integer getGraphicsMaxRefreshRateHz() {
		return GraphicsMaxRefreshRateHz;
	}
	public void setGraphicsMaxRefreshRateHz(Integer graphicsMaxRefreshRateHz) {
		GraphicsMaxRefreshRateHz = graphicsMaxRefreshRateHz;
	}
	public String getLaunchDate() {
		return LaunchDate;
	}
	public void setLaunchDate(String launchDate) {
		LaunchDate = launchDate;
	}
	public Long getLaunchDateDisplay() {
		return launchDateDisplay;
	}
	public void setLaunchDateDisplay(Long launchDateDisplay) {
		this.launchDateDisplay = launchDateDisplay;
	}
	

	

}
