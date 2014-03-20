package org.shu.model;

import java.sql.Timestamp;

/**
 * FourTableSamePart entity. @author MyEclipse Persistence Tools
 */

public class FourTableSamePart implements java.io.Serializable {

	// Fields

	private Integer id;
	private String reportId;
	private Integer reportType;
	private Integer proId;
	private String uniteName;
	private Integer startNum;
	private Integer endNum;
	private String buildUnite;
	private String standardName;
	private String checkWorker;
	private String checkMonitor;
	private String qualityWorker;
	private Timestamp checkTime;
	private String supervisor;
	private Timestamp supervisorTime;
	private String buildConclusion;
	private String supervisorConclusion;
	private String reportStatus;

	// Constructors

	/** default constructor */
	public FourTableSamePart() {
	}

	/** minimal constructor */
	public FourTableSamePart(String reportStatus) {
		this.reportStatus = reportStatus;
	}

	/** full constructor */
	public FourTableSamePart(String reportId, Integer reportType,
			Integer proId, String uniteName, Integer startNum, Integer endNum,
			String buildUnite, String standardName, String checkWorker,
			String checkMonitor, String qualityWorker, Timestamp checkTime,
			String supervisor, Timestamp supervisorTime,
			String buildConclusion, String supervisorConclusion,
			String reportStatus) {
		this.reportId = reportId;
		this.reportType = reportType;
		this.proId = proId;
		this.uniteName = uniteName;
		this.startNum = startNum;
		this.endNum = endNum;
		this.buildUnite = buildUnite;
		this.standardName = standardName;
		this.checkWorker = checkWorker;
		this.checkMonitor = checkMonitor;
		this.qualityWorker = qualityWorker;
		this.checkTime = checkTime;
		this.supervisor = supervisor;
		this.supervisorTime = supervisorTime;
		this.buildConclusion = buildConclusion;
		this.supervisorConclusion = supervisorConclusion;
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

	public Integer getReportType() {
		return this.reportType;
	}

	public void setReportType(Integer reportType) {
		this.reportType = reportType;
	}

	public Integer getProId() {
		return this.proId;
	}

	public void setProId(Integer proId) {
		this.proId = proId;
	}

	public String getUniteName() {
		return this.uniteName;
	}

	public void setUniteName(String uniteName) {
		this.uniteName = uniteName;
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

	public String getBuildUnite() {
		return this.buildUnite;
	}

	public void setBuildUnite(String buildUnite) {
		this.buildUnite = buildUnite;
	}

	public String getStandardName() {
		return this.standardName;
	}

	public void setStandardName(String standardName) {
		this.standardName = standardName;
	}

	public String getCheckWorker() {
		return this.checkWorker;
	}

	public void setCheckWorker(String checkWorker) {
		this.checkWorker = checkWorker;
	}

	public String getCheckMonitor() {
		return this.checkMonitor;
	}

	public void setCheckMonitor(String checkMonitor) {
		this.checkMonitor = checkMonitor;
	}

	public String getQualityWorker() {
		return this.qualityWorker;
	}

	public void setQualityWorker(String qualityWorker) {
		this.qualityWorker = qualityWorker;
	}

	public Timestamp getCheckTime() {
		return this.checkTime;
	}

	public void setCheckTime(Timestamp checkTime) {
		this.checkTime = checkTime;
	}

	public String getSupervisor() {
		return this.supervisor;
	}

	public void setSupervisor(String supervisor) {
		this.supervisor = supervisor;
	}

	public Timestamp getSupervisorTime() {
		return this.supervisorTime;
	}

	public void setSupervisorTime(Timestamp supervisorTime) {
		this.supervisorTime = supervisorTime;
	}

	public String getBuildConclusion() {
		return this.buildConclusion;
	}

	public void setBuildConclusion(String buildConclusion) {
		this.buildConclusion = buildConclusion;
	}

	public String getSupervisorConclusion() {
		return this.supervisorConclusion;
	}

	public void setSupervisorConclusion(String supervisorConclusion) {
		this.supervisorConclusion = supervisorConclusion;
	}

	public String getReportStatus() {
		return this.reportStatus;
	}

	public void setReportStatus(String reportStatus) {
		this.reportStatus = reportStatus;
	}

}