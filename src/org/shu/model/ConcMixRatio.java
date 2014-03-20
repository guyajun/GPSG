package org.shu.model;

/**
 * ConcMixRatio entity. @author MyEclipse Persistence Tools
 */

public class ConcMixRatio implements java.io.Serializable {

	// Fields

	private Integer id;
	private String mixRatioId;
	private Integer proId;
	private String approver;
	private String auditor;
	private String designer;
	private String url;

	// Constructors

	/** default constructor */
	public ConcMixRatio() {
	}

	/** full constructor */
	public ConcMixRatio(String mixRatioId, Integer proId, String approver,
			String auditor, String designer, String url) {
		this.mixRatioId = mixRatioId;
		this.proId = proId;
		this.approver = approver;
		this.auditor = auditor;
		this.designer = designer;
		this.url = url;
	}

	// Property accessors

	public Integer getId() {
		return this.id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getMixRatioId() {
		return this.mixRatioId;
	}

	public void setMixRatioId(String mixRatioId) {
		this.mixRatioId = mixRatioId;
	}

	public Integer getProId() {
		return this.proId;
	}

	public void setProId(Integer proId) {
		this.proId = proId;
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

	public String getDesigner() {
		return this.designer;
	}

	public void setDesigner(String designer) {
		this.designer = designer;
	}

	public String getUrl() {
		return this.url;
	}

	public void setUrl(String url) {
		this.url = url;
	}

}