package org.shu.model;

/**
 * FourTableCheckItems entity. @author MyEclipse Persistence Tools
 */

public class FourTableCheckItems implements java.io.Serializable {

	// Fields

	private Integer id;
	private Integer proId;
	private String reportType;
	private String controlproName;
	private String controlparentId;
	private Integer controlproType;
	private Integer controlstdType;
	private String controlStandard;
	private String masterRecord;

	// Constructors

	/** default constructor */
	public FourTableCheckItems() {
	}

	/** full constructor */
	public FourTableCheckItems(Integer proId, String reportType,
			String controlproName, String controlparentId,
			Integer controlproType, Integer controlstdType,
			String controlStandard, String masterRecord) {
		this.proId = proId;
		this.reportType = reportType;
		this.controlproName = controlproName;
		this.controlparentId = controlparentId;
		this.controlproType = controlproType;
		this.controlstdType = controlstdType;
		this.controlStandard = controlStandard;
		this.masterRecord = masterRecord;
	}

	// Property accessors

	public Integer getId() {
		return this.id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public Integer getProId() {
		return this.proId;
	}

	public void setProId(Integer proId) {
		this.proId = proId;
	}

	public String getReportType() {
		return this.reportType;
	}

	public void setReportType(String reportType) {
		this.reportType = reportType;
	}

	public String getControlproName() {
		return this.controlproName;
	}

	public void setControlproName(String controlproName) {
		this.controlproName = controlproName;
	}

	public String getControlparentId() {
		return this.controlparentId;
	}

	public void setControlparentId(String controlparentId) {
		this.controlparentId = controlparentId;
	}

	public Integer getControlproType() {
		return this.controlproType;
	}

	public void setControlproType(Integer controlproType) {
		this.controlproType = controlproType;
	}

	public Integer getControlstdType() {
		return this.controlstdType;
	}

	public void setControlstdType(Integer controlstdType) {
		this.controlstdType = controlstdType;
	}

	public String getControlStandard() {
		return this.controlStandard;
	}

	public void setControlStandard(String controlStandard) {
		this.controlStandard = controlStandard;
	}

	public String getMasterRecord() {
		return this.masterRecord;
	}

	public void setMasterRecord(String masterRecord) {
		this.masterRecord = masterRecord;
	}

}