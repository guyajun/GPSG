package org.shu.model;

/**
 * WaterProof entity. @author MyEclipse Persistence Tools
 */

public class WaterProof implements java.io.Serializable {

	// Fields

	private Integer id;
	private String reportId;
	private String proId;
	private String url1;
	private String url2;
	private String url3;

	// Constructors

	/** default constructor */
	public WaterProof() {
	}

	/** full constructor */
	public WaterProof(String reportId, String proId, String url1, String url2,
			String url3) {
		this.reportId = reportId;
		this.proId = proId;
		this.url1 = url1;
		this.url2 = url2;
		this.url3 = url3;
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

	public String getUrl1() {
		return this.url1;
	}

	public void setUrl1(String url1) {
		this.url1 = url1;
	}

	public String getUrl2() {
		return this.url2;
	}

	public void setUrl2(String url2) {
		this.url2 = url2;
	}

	public String getUrl3() {
		return this.url3;
	}

	public void setUrl3(String url3) {
		this.url3 = url3;
	}

}