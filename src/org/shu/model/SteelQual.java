package org.shu.model;

/**
 * SteelQual entity. @author MyEclipse Persistence Tools
 */

public class SteelQual implements java.io.Serializable {

	// Fields

	private Integer id;
	private String reportId;
	private Integer proId;
	private Integer specification;
	private String purchaseTime;
	private Integer purchaseAmount;
	private String manufacturer;
	private String useBeginTime;
	private String consignee;
	private String url;

	// Constructors

	/** default constructor */
	public SteelQual() {
	}

	/** full constructor */
	public SteelQual(String reportId, Integer proId, Integer specification,
			String purchaseTime, Integer purchaseAmount, String manufacturer,
			String useBeginTime, String consignee, String url) {
		this.reportId = reportId;
		this.proId = proId;
		this.specification = specification;
		this.purchaseTime = purchaseTime;
		this.purchaseAmount = purchaseAmount;
		this.manufacturer = manufacturer;
		this.useBeginTime = useBeginTime;
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

	public Integer getProId() {
		return this.proId;
	}

	public void setProId(Integer proId) {
		this.proId = proId;
	}

	public Integer getSpecification() {
		return this.specification;
	}

	public void setSpecification(Integer specification) {
		this.specification = specification;
	}

	public String getPurchaseTime() {
		return this.purchaseTime;
	}

	public void setPurchaseTime(String purchaseTime) {
		this.purchaseTime = purchaseTime;
	}

	public Integer getPurchaseAmount() {
		return this.purchaseAmount;
	}

	public void setPurchaseAmount(Integer purchaseAmount) {
		this.purchaseAmount = purchaseAmount;
	}

	public String getManufacturer() {
		return this.manufacturer;
	}

	public void setManufacturer(String manufacturer) {
		this.manufacturer = manufacturer;
	}

	public String getUseBeginTime() {
		return this.useBeginTime;
	}

	public void setUseBeginTime(String useBeginTime) {
		this.useBeginTime = useBeginTime;
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