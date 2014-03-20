package org.shu.model;

/**
 * GpCrane entity. @author MyEclipse Persistence Tools
 */

public class GpCrane implements java.io.Serializable {

	// Fields

	private Integer id;
	private String reportId;
	private Integer proId;
	private String produceDate;
	private String craneTime;
	private String signer;
	private String signTime;
	private String url;

	// Constructors

	/** default constructor */
	public GpCrane() {
	}

	/** full constructor */
	public GpCrane(String reportId, Integer proId, String produceDate,
			String craneTime, String signer, String signTime, String url) {
		this.reportId = reportId;
		this.proId = proId;
		this.produceDate = produceDate;
		this.craneTime = craneTime;
		this.signer = signer;
		this.signTime = signTime;
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

	public String getProduceDate() {
		return this.produceDate;
	}

	public void setProduceDate(String produceDate) {
		this.produceDate = produceDate;
	}

	public String getCraneTime() {
		return this.craneTime;
	}

	public void setCraneTime(String craneTime) {
		this.craneTime = craneTime;
	}

	public String getSigner() {
		return this.signer;
	}

	public void setSigner(String signer) {
		this.signer = signer;
	}

	public String getSignTime() {
		return this.signTime;
	}

	public void setSignTime(String signTime) {
		this.signTime = signTime;
	}

	public String getUrl() {
		return this.url;
	}

	public void setUrl(String url) {
		this.url = url;
	}

}