package org.shu.model;

/**
 * FourTableMapping entity. @author MyEclipse Persistence Tools
 */

public class FourTableMapping implements java.io.Serializable {

	// Fields

	private Integer id;
	private String reportId;
	private Integer checkId;
	private Integer proId;

	// Constructors

	/** default constructor */
	public FourTableMapping() {
	}

	/** full constructor */
	public FourTableMapping(String reportId, Integer checkId, Integer proId) {
		this.reportId = reportId;
		this.checkId = checkId;
		this.proId = proId;
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

	public Integer getCheckId() {
		return this.checkId;
	}

	public void setCheckId(Integer checkId) {
		this.checkId = checkId;
	}

	public Integer getProId() {
		return this.proId;
	}

	public void setProId(Integer proId) {
		this.proId = proId;
	}

}