package org.shu.construct.action;

/**
 * GpTotalInfo entity. @author MyEclipse Persistence Tools
 */

public class ShengChanGpTotalInfo implements java.io.Serializable {

	// Fields

	private Integer id;
	private String gpId;
	private Integer proId;
	private String coverid;
	private Integer produceLoop;
	private Integer tunnelLoop;
	private Integer tunnelLoopLocation;
	private String type;
	private String gpStatus;
	private Integer workShift;
	private String steelRawReportId;
	private String steelQualReportId;
	private String concResistCompReportId;
	private String concMixRatioId;
	private String preEmbed;
	private String concQual;
	private String concResistLeakId;
	private String steelProcessReportId;
	private String steelSkelHalfReportId;
	private String steelSkelQualReportId;
	private String gpAppeSizeReportId;
	private String moldQualReportId;
	private String concPourReportId;
	private String gpSteamCuringId;
	private String waterCuringReportId;
	private String assemReportId;
	private String checkLeakReportId;
	private String gpTransportReportId;
	private String scrapDate;
	private String scrapReason;
	private String gpCraneId;

	// Constructors

	/** default constructor */
	public ShengChanGpTotalInfo() {
	}

	/** full constructor */
	public ShengChanGpTotalInfo(String gpId, Integer proId, String coverid,
			Integer produceLoop, Integer tunnelLoop,
			Integer tunnelLoopLocation, String type, String gpStatus,
			Integer workShift, String steelRawReportId,
			String steelQualReportId, String concResistCompReportId,
			String concMixRatioId, String preEmbed, String concQual,
			String concResistLeakId, String steelProcessReportId,
			String steelSkelHalfReportId, String steelSkelQualReportId,
			String gpAppeSizeReportId, String moldQualReportId,
			String concPourReportId, String gpSteamCuringId,
			String waterCuringReportId, String assemReportId,
			String checkLeakReportId, String gpTransportReportId,
			String scrapDate, String scrapReason, String gpCraneId) {
		this.gpId = gpId;
		this.proId = proId;
		this.coverid = coverid;
		this.produceLoop = produceLoop;
		this.tunnelLoop = tunnelLoop;
		this.tunnelLoopLocation = tunnelLoopLocation;
		this.type = type;
		this.gpStatus = gpStatus;
		this.workShift = workShift;
		this.steelRawReportId = steelRawReportId;
		this.steelQualReportId = steelQualReportId;
		this.concResistCompReportId = concResistCompReportId;
		this.concMixRatioId = concMixRatioId;
		this.preEmbed = preEmbed;
		this.concQual = concQual;
		this.concResistLeakId = concResistLeakId;
		this.steelProcessReportId = steelProcessReportId;
		this.steelSkelHalfReportId = steelSkelHalfReportId;
		this.steelSkelQualReportId = steelSkelQualReportId;
		this.gpAppeSizeReportId = gpAppeSizeReportId;
		this.moldQualReportId = moldQualReportId;
		this.concPourReportId = concPourReportId;
		this.gpSteamCuringId = gpSteamCuringId;
		this.waterCuringReportId = waterCuringReportId;
		this.assemReportId = assemReportId;
		this.checkLeakReportId = checkLeakReportId;
		this.gpTransportReportId = gpTransportReportId;
		this.scrapDate = scrapDate;
		this.scrapReason = scrapReason;
		this.gpCraneId = gpCraneId;
	}

	// Property accessors

	public Integer getId() {
		return this.id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getGpId() {
		return this.gpId;
	}

	public void setGpId(String gpId) {
		this.gpId = gpId;
	}

	public Integer getProId() {
		return this.proId;
	}

	public void setProId(Integer proId) {
		this.proId = proId;
	}

	public String getCoverid() {
		return this.coverid;
	}

	public void setCoverid(String coverid) {
		this.coverid = coverid;
	}

	public Integer getProduceLoop() {
		return this.produceLoop;
	}

	public void setProduceLoop(Integer produceLoop) {
		this.produceLoop = produceLoop;
	}

	public Integer getTunnelLoop() {
		return this.tunnelLoop;
	}

	public void setTunnelLoop(Integer tunnelLoop) {
		this.tunnelLoop = tunnelLoop;
	}

	public Integer getTunnelLoopLocation() {
		return this.tunnelLoopLocation;
	}

	public void setTunnelLoopLocation(Integer tunnelLoopLocation) {
		this.tunnelLoopLocation = tunnelLoopLocation;
	}

	public String getType() {
		return this.type;
	}

	public void setType(String type) {
		this.type = type;
	}

	public String getGpStatus() {
		return this.gpStatus;
	}

	public void setGpStatus(String gpStatus) {
		this.gpStatus = gpStatus;
	}

	public Integer getWorkShift() {
		return this.workShift;
	}

	public void setWorkShift(Integer workShift) {
		this.workShift = workShift;
	}

	public String getSteelRawReportId() {
		return this.steelRawReportId;
	}

	public void setSteelRawReportId(String steelRawReportId) {
		this.steelRawReportId = steelRawReportId;
	}

	public String getSteelQualReportId() {
		return this.steelQualReportId;
	}

	public void setSteelQualReportId(String steelQualReportId) {
		this.steelQualReportId = steelQualReportId;
	}

	public String getConcResistCompReportId() {
		return this.concResistCompReportId;
	}

	public void setConcResistCompReportId(String concResistCompReportId) {
		this.concResistCompReportId = concResistCompReportId;
	}

	public String getConcMixRatioId() {
		return this.concMixRatioId;
	}

	public void setConcMixRatioId(String concMixRatioId) {
		this.concMixRatioId = concMixRatioId;
	}

	public String getPreEmbed() {
		return this.preEmbed;
	}

	public void setPreEmbed(String preEmbed) {
		this.preEmbed = preEmbed;
	}

	public String getConcQual() {
		return this.concQual;
	}

	public void setConcQual(String concQual) {
		this.concQual = concQual;
	}

	public String getConcResistLeakId() {
		return this.concResistLeakId;
	}

	public void setConcResistLeakId(String concResistLeakId) {
		this.concResistLeakId = concResistLeakId;
	}

	public String getSteelProcessReportId() {
		return this.steelProcessReportId;
	}

	public void setSteelProcessReportId(String steelProcessReportId) {
		this.steelProcessReportId = steelProcessReportId;
	}

	public String getSteelSkelHalfReportId() {
		return this.steelSkelHalfReportId;
	}

	public void setSteelSkelHalfReportId(String steelSkelHalfReportId) {
		this.steelSkelHalfReportId = steelSkelHalfReportId;
	}

	public String getSteelSkelQualReportId() {
		return this.steelSkelQualReportId;
	}

	public void setSteelSkelQualReportId(String steelSkelQualReportId) {
		this.steelSkelQualReportId = steelSkelQualReportId;
	}

	public String getGpAppeSizeReportId() {
		return this.gpAppeSizeReportId;
	}

	public void setGpAppeSizeReportId(String gpAppeSizeReportId) {
		this.gpAppeSizeReportId = gpAppeSizeReportId;
	}

	public String getMoldQualReportId() {
		return this.moldQualReportId;
	}

	public void setMoldQualReportId(String moldQualReportId) {
		this.moldQualReportId = moldQualReportId;
	}

	public String getConcPourReportId() {
		return this.concPourReportId;
	}

	public void setConcPourReportId(String concPourReportId) {
		this.concPourReportId = concPourReportId;
	}

	public String getGpSteamCuringId() {
		return this.gpSteamCuringId;
	}

	public void setGpSteamCuringId(String gpSteamCuringId) {
		this.gpSteamCuringId = gpSteamCuringId;
	}

	public String getWaterCuringReportId() {
		return this.waterCuringReportId;
	}

	public void setWaterCuringReportId(String waterCuringReportId) {
		this.waterCuringReportId = waterCuringReportId;
	}

	public String getAssemReportId() {
		return this.assemReportId;
	}

	public void setAssemReportId(String assemReportId) {
		this.assemReportId = assemReportId;
	}

	public String getCheckLeakReportId() {
		return this.checkLeakReportId;
	}

	public void setCheckLeakReportId(String checkLeakReportId) {
		this.checkLeakReportId = checkLeakReportId;
	}

	public String getGpTransportReportId() {
		return this.gpTransportReportId;
	}

	public void setGpTransportReportId(String gpTransportReportId) {
		this.gpTransportReportId = gpTransportReportId;
	}

	public String getScrapDate() {
		return this.scrapDate;
	}

	public void setScrapDate(String scrapDate) {
		this.scrapDate = scrapDate;
	}

	public String getScrapReason() {
		return this.scrapReason;
	}

	public void setScrapReason(String scrapReason) {
		this.scrapReason = scrapReason;
	}

	public String getGpCraneId() {
		return this.gpCraneId;
	}

	public void setGpCraneId(String gpCraneId) {
		this.gpCraneId = gpCraneId;
	}

}