package org.shu.model;

/**
 * GpReceive entity. @author MyEclipse Persistence Tools
 */

public class GpReceive implements java.io.Serializable {

	// Fields

	private Integer id;
	private String reportId;
	private Integer receiveCount;
	private String receiveDate;
	private String receiver;
	private String url;

	// Constructors

	/** default constructor */
	public GpReceive() {
	}

	/** full constructor */
	public GpReceive(String reportId, Integer receiveCount, String receiveDate,
			String receiver, String url) {
		this.reportId = reportId;
		this.receiveCount = receiveCount;
		this.receiveDate = receiveDate;
		this.receiver = receiver;
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

	public Integer getReceiveCount() {
		return this.receiveCount;
	}

	public void setReceiveCount(Integer receiveCount) {
		this.receiveCount = receiveCount;
	}

	public String getReceiveDate() {
		return this.receiveDate;
	}

	public void setReceiveDate(String receiveDate) {
		this.receiveDate = receiveDate;
	}

	public String getReceiver() {
		return this.receiver;
	}

	public void setReceiver(String receiver) {
		this.receiver = receiver;
	}

	public String getUrl() {
		return this.url;
	}

	public void setUrl(String url) {
		this.url = url;
	}

}