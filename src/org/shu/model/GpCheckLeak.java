package org.shu.model;

import java.sql.Timestamp;

/**
 * GpCheckLeak entity. @author MyEclipse Persistence Tools
 */

public class GpCheckLeak implements java.io.Serializable {

	// Fields

	private Integer id;
	private String reportId;
	private Integer proId;
	private Integer startNum;
	private Integer endNum;
	private String proName;
	private String pressureDesign;
	private Integer constainDesign;
	private Integer seepageDesign;
	private Timestamp produceDate;
	private Timestamp checkDate;
	private String gpId;
	private String pressureTime;
	private String pressureSize;
	private String frontPosition;
	private String backPosition;
	private String frontSeepage;
	private String backSeepage;
	private String frontHight;
	private String backHight;
	private String isQualified;
	private String losepreTime;
	private String checkWorker;
	private String supervisorWorker;
	private String steadyPressure;
	private Timestamp checkedDate;
	private String reportStatus;
	private String status;

	// Constructors

	/** default constructor */
	public GpCheckLeak() {
	}

	/** full constructor */
	public GpCheckLeak(String reportId, Integer proId, Integer startNum,
			Integer endNum, String proName, String pressureDesign,
			Integer constainDesign, Integer seepageDesign,
			Timestamp produceDate, Timestamp checkDate, String gpId,
			String pressureTime, String pressureSize, String frontPosition,
			String backPosition, String frontSeepage, String backSeepage,
			String frontHight, String backHight, String isQualified,
			String losepreTime, String checkWorker, String supervisorWorker,
			String steadyPressure, Timestamp checkedDate, String reportStatus,
			String status) {
		this.reportId = reportId;
		this.proId = proId;
		this.startNum = startNum;
		this.endNum = endNum;
		this.proName = proName;
		this.pressureDesign = pressureDesign;
		this.constainDesign = constainDesign;
		this.seepageDesign = seepageDesign;
		this.produceDate = produceDate;
		this.checkDate = checkDate;
		this.gpId = gpId;
		this.pressureTime = pressureTime;
		this.pressureSize = pressureSize;
		this.frontPosition = frontPosition;
		this.backPosition = backPosition;
		this.frontSeepage = frontSeepage;
		this.backSeepage = backSeepage;
		this.frontHight = frontHight;
		this.backHight = backHight;
		this.isQualified = isQualified;
		this.losepreTime = losepreTime;
		this.checkWorker = checkWorker;
		this.supervisorWorker = supervisorWorker;
		this.steadyPressure = steadyPressure;
		this.checkedDate = checkedDate;
		this.reportStatus = reportStatus;
		this.status = status;
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

	public String getProName() {
		return this.proName;
	}

	public void setProName(String proName) {
		this.proName = proName;
	}

	public String getPressureDesign() {
		return this.pressureDesign;
	}

	public void setPressureDesign(String pressureDesign) {
		this.pressureDesign = pressureDesign;
	}

	public Integer getConstainDesign() {
		return this.constainDesign;
	}

	public void setConstainDesign(Integer constainDesign) {
		this.constainDesign = constainDesign;
	}

	public Integer getSeepageDesign() {
		return this.seepageDesign;
	}

	public void setSeepageDesign(Integer seepageDesign) {
		this.seepageDesign = seepageDesign;
	}

	public Timestamp getProduceDate() {
		return this.produceDate;
	}

	public void setProduceDate(Timestamp produceDate) {
		this.produceDate = produceDate;
	}

	public Timestamp getCheckDate() {
		return this.checkDate;
	}

	public void setCheckDate(Timestamp checkDate) {
		this.checkDate = checkDate;
	}

	public String getGpId() {
		return this.gpId;
	}

	public void setGpId(String gpId) {
		this.gpId = gpId;
	}

	public String getPressureTime() {
		return this.pressureTime;
	}

	public void setPressureTime(String pressureTime) {
		this.pressureTime = pressureTime;
	}

	public String getPressureSize() {
		return this.pressureSize;
	}

	public void setPressureSize(String pressureSize) {
		this.pressureSize = pressureSize;
	}

	public String getFrontPosition() {
		return this.frontPosition;
	}

	public void setFrontPosition(String frontPosition) {
		this.frontPosition = frontPosition;
	}

	public String getBackPosition() {
		return this.backPosition;
	}

	public void setBackPosition(String backPosition) {
		this.backPosition = backPosition;
	}

	public String getFrontSeepage() {
		return this.frontSeepage;
	}

	public void setFrontSeepage(String frontSeepage) {
		this.frontSeepage = frontSeepage;
	}

	public String getBackSeepage() {
		return this.backSeepage;
	}

	public void setBackSeepage(String backSeepage) {
		this.backSeepage = backSeepage;
	}

	public String getFrontHight() {
		return this.frontHight;
	}

	public void setFrontHight(String frontHight) {
		this.frontHight = frontHight;
	}

	public String getBackHight() {
		return this.backHight;
	}

	public void setBackHight(String backHight) {
		this.backHight = backHight;
	}

	public String getIsQualified() {
		return this.isQualified;
	}

	public void setIsQualified(String isQualified) {
		this.isQualified = isQualified;
	}

	public String getLosepreTime() {
		return this.losepreTime;
	}

	public void setLosepreTime(String losepreTime) {
		this.losepreTime = losepreTime;
	}

	public String getCheckWorker() {
		return this.checkWorker;
	}

	public void setCheckWorker(String checkWorker) {
		this.checkWorker = checkWorker;
	}

	public String getSupervisorWorker() {
		return this.supervisorWorker;
	}

	public void setSupervisorWorker(String supervisorWorker) {
		this.supervisorWorker = supervisorWorker;
	}

	public String getSteadyPressure() {
		return this.steadyPressure;
	}

	public void setSteadyPressure(String steadyPressure) {
		this.steadyPressure = steadyPressure;
	}

	public Timestamp getCheckedDate() {
		return this.checkedDate;
	}

	public void setCheckedDate(Timestamp checkedDate) {
		this.checkedDate = checkedDate;
	}

	public String getReportStatus() {
		return this.reportStatus;
	}

	public void setReportStatus(String reportStatus) {
		this.reportStatus = reportStatus;
	}

	public String getStatus() {
		return this.status;
	}

	public void setStatus(String status) {
		this.status = status;
	}

}