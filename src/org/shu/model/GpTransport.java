package org.shu.model;

/**
 * GpTransport entity. @author MyEclipse Persistence Tools
 */

public class GpTransport implements java.io.Serializable {

	// Fields

	private Integer id;
	private Integer proId;
	private String reportId;
	private String url;

	// Constructors

	/** default constructor */
	public GpTransport() {
	}

	/** full constructor */
	public GpTransport(Integer proId, String reportId, String url) {
		this.proId = proId;
		this.reportId = reportId;
		this.url = url;
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

	public String getReportId() {
		return this.reportId;
	}

	public void setReportId(String reportId) {
		this.reportId = reportId;
	}

	public String getUrl() {
		return this.url;
	}

	public void setUrl(String url) {
		this.url = url;
	}

}