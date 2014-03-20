package org.shu.model;

/**
 * ReportPdfMapping entity. @author MyEclipse Persistence Tools
 */

public class ReportPdfMapping implements java.io.Serializable {

	// Fields

	private Integer id;
	private String reportId;
	private Integer proId;
	private String pdfLocation;
	private String mark;

	// Constructors

	/** default constructor */
	public ReportPdfMapping() {
	}

	/** full constructor */
	public ReportPdfMapping(String reportId, Integer proId, String pdfLocation,
			String mark) {
		this.reportId = reportId;
		this.proId = proId;
		this.pdfLocation = pdfLocation;
		this.mark = mark;
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

	public String getPdfLocation() {
		return this.pdfLocation;
	}

	public void setPdfLocation(String pdfLocation) {
		this.pdfLocation = pdfLocation;
	}

	public String getMark() {
		return this.mark;
	}

	public void setMark(String mark) {
		this.mark = mark;
	}

}