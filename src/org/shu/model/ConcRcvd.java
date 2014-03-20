package org.shu.model;

import java.sql.Timestamp;

/**
 * ConcRcvd entity. @author MyEclipse Persistence Tools
 */

public class ConcRcvd implements java.io.Serializable {

	// Fields

	private Integer id;
	private ProInfo proInfo;
	private String reportId;
	private String supportDate;
	private String weather;
	private String temperature;
	private String strengthLevel;
	private String imperviousLevel;
	private String supportUnit;
	private String designDegree;
	private String apperaQuality;
	private String realDepth;
	private Timestamp startTime;
	private Timestamp endTime;
	private String hangTest;
	private String RTest;
	private String imperviousTest;
	private String isQualified;
	private String mixRatioId;
	private String checker;

	// Constructors

	/** default constructor */
	public ConcRcvd() {
	}

	/** full constructor */
	public ConcRcvd(ProInfo proInfo, String reportId, String supportDate,
			String weather, String temperature, String strengthLevel,
			String imperviousLevel, String supportUnit, String designDegree,
			String apperaQuality, String realDepth, Timestamp startTime,
			Timestamp endTime, String hangTest, String RTest,
			String imperviousTest, String isQualified, String mixRatioId,
			String checker) {
		this.proInfo = proInfo;
		this.reportId = reportId;
		this.supportDate = supportDate;
		this.weather = weather;
		this.temperature = temperature;
		this.strengthLevel = strengthLevel;
		this.imperviousLevel = imperviousLevel;
		this.supportUnit = supportUnit;
		this.designDegree = designDegree;
		this.apperaQuality = apperaQuality;
		this.realDepth = realDepth;
		this.startTime = startTime;
		this.endTime = endTime;
		this.hangTest = hangTest;
		this.RTest = RTest;
		this.imperviousTest = imperviousTest;
		this.isQualified = isQualified;
		this.mixRatioId = mixRatioId;
		this.checker = checker;
	}

	// Property accessors

	public Integer getId() {
		return this.id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public ProInfo getProInfo() {
		return this.proInfo;
	}

	public void setProInfo(ProInfo proInfo) {
		this.proInfo = proInfo;
	}

	public String getReportId() {
		return this.reportId;
	}

	public void setReportId(String reportId) {
		this.reportId = reportId;
	}

	public String getSupportDate() {
		return this.supportDate;
	}

	public void setSupportDate(String supportDate) {
		this.supportDate = supportDate;
	}

	public String getWeather() {
		return this.weather;
	}

	public void setWeather(String weather) {
		this.weather = weather;
	}

	public String getTemperature() {
		return this.temperature;
	}

	public void setTemperature(String temperature) {
		this.temperature = temperature;
	}

	public String getStrengthLevel() {
		return this.strengthLevel;
	}

	public void setStrengthLevel(String strengthLevel) {
		this.strengthLevel = strengthLevel;
	}

	public String getImperviousLevel() {
		return this.imperviousLevel;
	}

	public void setImperviousLevel(String imperviousLevel) {
		this.imperviousLevel = imperviousLevel;
	}

	public String getSupportUnit() {
		return this.supportUnit;
	}

	public void setSupportUnit(String supportUnit) {
		this.supportUnit = supportUnit;
	}

	public String getDesignDegree() {
		return this.designDegree;
	}

	public void setDesignDegree(String designDegree) {
		this.designDegree = designDegree;
	}

	public String getApperaQuality() {
		return this.apperaQuality;
	}

	public void setApperaQuality(String apperaQuality) {
		this.apperaQuality = apperaQuality;
	}

	public String getRealDepth() {
		return this.realDepth;
	}

	public void setRealDepth(String realDepth) {
		this.realDepth = realDepth;
	}

	public Timestamp getStartTime() {
		return this.startTime;
	}

	public void setStartTime(Timestamp startTime) {
		this.startTime = startTime;
	}

	public Timestamp getEndTime() {
		return this.endTime;
	}

	public void setEndTime(Timestamp endTime) {
		this.endTime = endTime;
	}

	public String getHangTest() {
		return this.hangTest;
	}

	public void setHangTest(String hangTest) {
		this.hangTest = hangTest;
	}

	public String getRTest() {
		return this.RTest;
	}

	public void setRTest(String RTest) {
		this.RTest = RTest;
	}

	public String getImperviousTest() {
		return this.imperviousTest;
	}

	public void setImperviousTest(String imperviousTest) {
		this.imperviousTest = imperviousTest;
	}

	public String getIsQualified() {
		return this.isQualified;
	}

	public void setIsQualified(String isQualified) {
		this.isQualified = isQualified;
	}

	public String getMixRatioId() {
		return this.mixRatioId;
	}

	public void setMixRatioId(String mixRatioId) {
		this.mixRatioId = mixRatioId;
	}

	public String getChecker() {
		return this.checker;
	}

	public void setChecker(String checker) {
		this.checker = checker;
	}

}