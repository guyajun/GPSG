package org.shu.model;

/**
 * GpMendInfo entity. @author MyEclipse Persistence Tools
 */

public class GpMendInfo implements java.io.Serializable {

	// Fields

	private String gpId;
	private String mendDesc;
	private String url;
	private String conclusion;
	private String checkTime;
	private String recorder;

	// Constructors

	/** default constructor */
	public GpMendInfo() {
	}

	/** full constructor */
	public GpMendInfo(String mendDesc, String url, String conclusion,
			String checkTime, String recorder) {
		this.mendDesc = mendDesc;
		this.url = url;
		this.conclusion = conclusion;
		this.checkTime = checkTime;
		this.recorder = recorder;
	}

	// Property accessors

	public String getGpId() {
		return this.gpId;
	}

	public void setGpId(String gpId) {
		this.gpId = gpId;
	}

	public String getMendDesc() {
		return this.mendDesc;
	}

	public void setMendDesc(String mendDesc) {
		this.mendDesc = mendDesc;
	}

	public String getUrl() {
		return this.url;
	}

	public void setUrl(String url) {
		this.url = url;
	}

	public String getConclusion() {
		return this.conclusion;
	}

	public void setConclusion(String conclusion) {
		this.conclusion = conclusion;
	}

	public String getCheckTime() {
		return this.checkTime;
	}

	public void setCheckTime(String checkTime) {
		this.checkTime = checkTime;
	}

	public String getRecorder() {
		return this.recorder;
	}

	public void setRecorder(String recorder) {
		this.recorder = recorder;
	}

}