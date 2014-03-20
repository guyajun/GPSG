package org.shu.model;

/**
 * PreEmbed entity. @author MyEclipse Persistence Tools
 */

public class PreEmbed implements java.io.Serializable {

	// Fields

	private Integer id;
	private String reportId;
	private String type;
	private Integer purchaseAmount;
	private String purchaseTime;
	private String manufacturer;
	private String consignee;
	private String url;

	// Constructors

	/** default constructor */
	public PreEmbed() {
	}

	/** full constructor */
	public PreEmbed(String reportId, String type, Integer purchaseAmount,
			String purchaseTime, String manufacturer, String consignee,
			String url) {
		this.reportId = reportId;
		this.type = type;
		this.purchaseAmount = purchaseAmount;
		this.purchaseTime = purchaseTime;
		this.manufacturer = manufacturer;
		this.consignee = consignee;
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

	public String getType() {
		return this.type;
	}

	public void setType(String type) {
		this.type = type;
	}

	public Integer getPurchaseAmount() {
		return this.purchaseAmount;
	}

	public void setPurchaseAmount(Integer purchaseAmount) {
		this.purchaseAmount = purchaseAmount;
	}

	public String getPurchaseTime() {
		return this.purchaseTime;
	}

	public void setPurchaseTime(String purchaseTime) {
		this.purchaseTime = purchaseTime;
	}

	public String getManufacturer() {
		return this.manufacturer;
	}

	public void setManufacturer(String manufacturer) {
		this.manufacturer = manufacturer;
	}

	public String getConsignee() {
		return this.consignee;
	}

	public void setConsignee(String consignee) {
		this.consignee = consignee;
	}

	public String getUrl() {
		return this.url;
	}

	public void setUrl(String url) {
		this.url = url;
	}

}