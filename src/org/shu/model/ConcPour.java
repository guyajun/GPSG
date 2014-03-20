package org.shu.model;

import java.sql.Timestamp;

/**
 * ConcPour entity. @author MyEclipse Persistence Tools
 */

public class ConcPour implements java.io.Serializable {

	// Fields

	private Integer id;
	private String reportId;
	private Integer proId;
	private String buildUnite;
	private Integer startNum;
	private Integer endNum;
	private Timestamp produceDate;
	private String weather;
	private String designStrength;
	private String concreteType;
	private String mixRatioId;
	private String fieldName;
	private String fieldStrength;
	private String slumps;
	private Integer concreteCount;
	private String completeDate;
	private String eventType;
	private String pourSituation;
	private String responseWorker;
	private String recordWorker;
	private String reportStatus;

	// Constructors

	/** default constructor */
	public ConcPour() {
	}

	/** full constructor */
	public ConcPour(String reportId, Integer proId, String buildUnite,
			Integer startNum, Integer endNum, Timestamp produceDate,
			String weather, String designStrength, String concreteType,
			String mixRatioId, String fieldName, String fieldStrength,
			String slumps, Integer concreteCount, String completeDate,
			String eventType, String pourSituation, String responseWorker,
			String recordWorker, String reportStatus) {
		this.reportId = reportId;
		this.proId = proId;
		this.buildUnite = buildUnite;
		this.startNum = startNum;
		this.endNum = endNum;
		this.produceDate = produceDate;
		this.weather = weather;
		this.designStrength = designStrength;
		this.concreteType = concreteType;
		this.mixRatioId = mixRatioId;
		this.fieldName = fieldName;
		this.fieldStrength = fieldStrength;
		this.slumps = slumps;
		this.concreteCount = concreteCount;
		this.completeDate = completeDate;
		this.eventType = eventType;
		this.pourSituation = pourSituation;
		this.responseWorker = responseWorker;
		this.recordWorker = recordWorker;
		this.reportStatus = reportStatus;
	}

	// Property accessors

	public Integer getId() {
		return this.id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getReportId() {
		return this.reportId;
	}

	public void setReportId(String reportId) {
		this.reportId = reportId;
	}

	public Integer getProId() {
		return this.proId;
	}

	public void setProId(Integer proId) {
		this.proId = proId;
	}

	public String getBuildUnite() {
		return this.buildUnite;
	}

	public void setBuildUnite(String buildUnite) {
		this.buildUnite = buildUnite;
	}

	public Integer getStartNum() {
		return this.startNum;
	}

	public void setStartNum(Integer startNum) {
		this.startNum = startNum;
	}

	public Integer getEndNum() {
		return this.endNum;
	}

	public void setEndNum(Integer endNum) {
		this.endNum = endNum;
	}

	public Timestamp getProduceDate() {
		return this.produceDate;
	}

	public void setProduceDate(Timestamp produceDate) {
		this.produceDate = produceDate;
	}

	public String getWeather() {
		return this.weather;
	}

	public void setWeather(String weather) {
		this.weather = weather;
	}

	public String getDesignStrength() {
		return this.designStrength;
	}

	public void setDesignStrength(String designStrength) {
		this.designStrength = designStrength;
	}

	public String getConcreteType() {
		return this.concreteType;
	}

	public void setConcreteType(String concreteType) {
		this.concreteType = concreteType;
	}

	public String getMixRatioId() {
		return this.mixRatioId;
	}

	public void setMixRatioId(String mixRatioId) {
		this.mixRatioId = mixRatioId;
	}

	public String getFieldName() {
		return this.fieldName;
	}

	public void setFieldName(String fieldName) {
		this.fieldName = fieldName;
	}

	public String getFieldStrength() {
		return this.fieldStrength;
	}

	public void setFieldStrength(String fieldStrength) {
		this.fieldStrength = fieldStrength;
	}

	public String getSlumps() {
		return this.slumps;
	}

	public void setSlumps(String slumps) {
		this.slumps = slumps;
	}

	public Integer getConcreteCount() {
		return this.concreteCount;
	}

	public void setConcreteCount(Integer concreteCount) {
		this.concreteCount = concreteCount;
	}

	public String getCompleteDate() {
		return this.completeDate;
	}

	public void setCompleteDate(String completeDate) {
		this.completeDate = completeDate;
	}

	public String getEventType() {
		return this.eventType;
	}

	public void setEventType(String eventType) {
		this.eventType = eventType;
	}

	public String getPourSituation() {
		return this.pourSituation;
	}

	public void setPourSituation(String pourSituation) {
		this.pourSituation = pourSituation;
	}

	public String getResponseWorker() {
		return this.responseWorker;
	}

	public void setResponseWorker(String responseWorker) {
		this.responseWorker = responseWorker;
	}

	public String getRecordWorker() {
		return this.recordWorker;
	}

	public void setRecordWorker(String recordWorker) {
		this.recordWorker = recordWorker;
	}

	public String getReportStatus() {
		return this.reportStatus;
	}

	public void setReportStatus(String reportStatus) {
		this.reportStatus = reportStatus;
	}

}