package org.shu.model;

/**
 * ConcResistComp entity. @author MyEclipse Persistence Tools
 */

public class ConcResistComp implements java.io.Serializable {

	// Fields

	private Integer id;
	private String reportId;
	private Integer proId;
	private String resistCompStan;
	private String resistCompValue;
	private String resistCompIsQual;
	private String approver;
	private String auditor;
	private String checker;
	private String date;
	private String url;

	// Constructors

	/** default constructor */
	public ConcResistComp() {
	}

	/** full constructor */
	public ConcResistComp(String reportId, Integer proId,
			String resistCompStan, String resistCompValue,
			String resistCompIsQual, String approver, String auditor,
			String checker, String date, String url) {
		this.reportId = reportId;
		this.proId = proId;
		this.resistCompStan = resistCompStan;
		this.resistCompValue = resistCompValue;
		this.resistCompIsQual = resistCompIsQual;
		this.approver = approver;
		this.auditor = auditor;
		this.checker = checker;
		this.date = date;
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

	public String getResistCompStan() {
		return this.resistCompStan;
	}

	public void setResistCompStan(String resistCompStan) {
		this.resistCompStan = resistCompStan;
	}

	public String getResistCompValue() {
		return this.resistCompValue;
	}

	public void setResistCompValue(String resistCompValue) {
		this.resistCompValue = resistCompValue;
	}

	public String getResistCompIsQual() {
		return this.resistCompIsQual;
	}

	public void setResistCompIsQual(String resistCompIsQual) {
		this.resistCompIsQual = resistCompIsQual;
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

	public String getDate() {
		return this.date;
	}

	public void setDate(String date) {
		this.date = date;
	}

	public String getUrl() {
		return this.url;
	}

	public void setUrl(String url) {
		this.url = url;
	}

}