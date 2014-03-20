package org.shu.model;

/**
 * ConcQual entity. @author MyEclipse Persistence Tools
 */

public class ConcQual implements java.io.Serializable {

	// Fields

	private Integer id;
	private String reportId;
	private Integer proId;
	private String mixRatioId;
	private String purchaseTime;
	private Integer purchaseAmount;
	private String manufacturer;
	private String useBeginTime;
	private String useEndTime;
	private String approver;
	private String auditor;
	private String checker;
	private String url;

	// Constructors

	/** default constructor */
	public ConcQual() {
	}

	/** full constructor */
	public ConcQual(String reportId, Integer proId, String mixRatioId,
			String purchaseTime, Integer purchaseAmount, String manufacturer,
			String useBeginTime, String useEndTime, String approver,
			String auditor, String checker, String url) {
		this.reportId = reportId;
		this.proId = proId;
		this.mixRatioId = mixRatioId;
		this.purchaseTime = purchaseTime;
		this.purchaseAmount = purchaseAmount;
		this.manufacturer = manufacturer;
		this.useBeginTime = useBeginTime;
		this.useEndTime = useEndTime;
		this.approver = approver;
		this.auditor = auditor;
		this.checker = checker;
		this.url = url;
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

	public String getMixRatioId() {
		return this.mixRatioId;
	}

	public void setMixRatioId(String mixRatioId) {
		this.mixRatioId = mixRatioId;
	}

	public String getPurchaseTime() {
		return this.purchaseTime;
	}

	public void setPurchaseTime(String purchaseTime) {
		this.purchaseTime = purchaseTime;
	}

	public Integer getPurchaseAmount() {
		return this.purchaseAmount;
	}

	public void setPurchaseAmount(Integer purchaseAmount) {
		this.purchaseAmount = purchaseAmount;
	}

	public String getManufacturer() {
		return this.manufacturer;
	}

	public void setManufacturer(String manufacturer) {
		this.manufacturer = manufacturer;
	}

	public String getUseBeginTime() {
		return this.useBeginTime;
	}

	public void setUseBeginTime(String useBeginTime) {
		this.useBeginTime = useBeginTime;
	}

	public String getUseEndTime() {
		return this.useEndTime;
	}

	public void setUseEndTime(String useEndTime) {
		this.useEndTime = useEndTime;
	}

	public String getApprover() {
		return this.approver;
	}

	public void setApprover(String approver) {
		this.approver = approver;
	}

	public String getAuditor() {
		return this.auditor;
	}

	public void setAuditor(String auditor) {
		this.auditor = auditor;
	}

	public String getChecker() {
		return this.checker;
	}

	public void setChecker(String checker) {
		this.checker = checker;
	}

	public String getUrl() {
		return this.url;
	}

	public void setUrl(String url) {
		this.url = url;
	}

}