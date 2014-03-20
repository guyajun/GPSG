package org.shu.model;

/**
 * GpQuality entity. @author MyEclipse Persistence Tools
 */

public class GpQuality implements java.io.Serializable {

	// Fields

	private Integer id;
	private String reportId;
	private String proId;
	private String url;

	// Constructors

	/** default constructor */
	public GpQuality() {
	}

	/** full constructor */
	public GpQuality(String reportId, String proId, String url) {
		this.reportId = reportId;
		this.proId = proId;
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

	public String getProId() {
		return this.proId;
	}

	public void setProId(String proId) {
		this.proId = proId;
	}

	public String getUrl() {
		return this.url;
	}

	public void setUrl(String url) {
		this.url = url;
	}

}