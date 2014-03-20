package org.shu.model;

/**
 * GpQualCert entity. @author MyEclipse Persistence Tools
 */

public class GpQualCert implements java.io.Serializable {

	// Fields

	private Integer id;
	private String reportId;
	private Integer proId;
	private String produceUnit;
	private String checkType;
	private String qualifyStd;
	private String checkResult;
	private String segmentType;
	private String produceDate;
	private Integer sendNum;
	private String sendDate;
	private String produceAdvice;
	private String manageWorker;
	private String supervisionAdvice;
	private String supervisor;
	private Integer status;

	// Constructors

	/** default constructor */
	public GpQualCert() {
	}

	/** full constructor */
	public GpQualCert(String reportId, Integer proId, String produceUnit,
			String checkType, String qualifyStd, String checkResult,
			String segmentType, String produceDate, Integer sendNum,
			String sendDate, String produceAdvice, String manageWorker,
			String supervisionAdvice, String supervisor, Integer status) {
		this.reportId = reportId;
		this.proId = proId;
		this.produceUnit = produceUnit;
		this.checkType = checkType;
		this.qualifyStd = qualifyStd;
		this.checkResult = checkResult;
		this.segmentType = segmentType;
		this.produceDate = produceDate;
		this.sendNum = sendNum;
		this.sendDate = sendDate;
		this.produceAdvice = produceAdvice;
		this.manageWorker = manageWorker;
		this.supervisionAdvice = supervisionAdvice;
		this.supervisor = supervisor;
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

	public String getProduceUnit() {
		return this.produceUnit;
	}

	public void setProduceUnit(String produceUnit) {
		this.produceUnit = produceUnit;
	}

	public String getCheckType() {
		return this.checkType;
	}

	public void setCheckType(String checkType) {
		this.checkType = checkType;
	}

	public String getQualifyStd() {
		return this.qualifyStd;
	}

	public void setQualifyStd(String qualifyStd) {
		this.qualifyStd = qualifyStd;
	}

	public String getCheckResult() {
		return this.checkResult;
	}

	public void setCheckResult(String checkResult) {
		this.checkResult = checkResult;
	}

	public String getSegmentType() {
		return this.segmentType;
	}

	public void setSegmentType(String segmentType) {
		this.segmentType = segmentType;
	}

	public String getProduceDate() {
		return this.produceDate;
	}

	public void setProduceDate(String produceDate) {
		this.produceDate = produceDate;
	}

	public Integer getSendNum() {
		return this.sendNum;
	}

	public void setSendNum(Integer sendNum) {
		this.sendNum = sendNum;
	}

	public String getSendDate() {
		return this.sendDate;
	}

	public void setSendDate(String sendDate) {
		this.sendDate = sendDate;
	}

	public String getProduceAdvice() {
		return this.produceAdvice;
	}

	public void setProduceAdvice(String produceAdvice) {
		this.produceAdvice = produceAdvice;
	}

	public String getManageWorker() {
		return this.manageWorker;
	}

	public void setManageWorker(String manageWorker) {
		this.manageWorker = manageWorker;
	}

	public String getSupervisionAdvice() {
		return this.supervisionAdvice;
	}

	public void setSupervisionAdvice(String supervisionAdvice) {
		this.supervisionAdvice = supervisionAdvice;
	}

	public String getSupervisor() {
		return this.supervisor;
	}

	public void setSupervisor(String supervisor) {
		this.supervisor = supervisor;
	}

	public Integer getStatus() {
		return this.status;
	}

	public void setStatus(Integer status) {
		this.status = status;
	}

}