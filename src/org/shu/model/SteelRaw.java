package org.shu.model;

/**
 * SteelRaw entity. @author MyEclipse Persistence Tools
 */

public class SteelRaw implements java.io.Serializable {

	// Fields

	private Integer id;
	private String reportId;
	private String mapQualId;
	private Integer proId;
	private Integer specification;
	private String tensileStan;
	private String tensileValue;
	private String tensileIsQulified;
	private String elongationStan;
	private String elongationValue;
	private String elongationIsQulified;
	private String yieldStan;
	private String yieldValue;
	private String yieldIsQulified;
	private String bendStan;
	private String bendValue;
	private String bendIsQulified;
	private String WOffsetStan;
	private String WOffsetValue;
	private String WOffsetIsQulified;
	private String purchaseTime;
	private String purchaseAmount;
	private String manufacturer;
	private String useBeginTime;
	private String useEndTime;
	private String approver;
	private String auditor;
	private String checker;
	private String url;

	// Constructors

	/** default constructor */
	public SteelRaw() {
	}

	/** full constructor */
	public SteelRaw(String reportId, String mapQualId, Integer proId,
			Integer specification, String tensileStan, String tensileValue,
			String tensileIsQulified, String elongationStan,
			String elongationValue, String elongationIsQulified,
			String yieldStan, String yieldValue, String yieldIsQulified,
			String bendStan, String bendValue, String bendIsQulified,
			String WOffsetStan, String WOffsetValue, String WOffsetIsQulified,
			String purchaseTime, String purchaseAmount, String manufacturer,
			String useBeginTime, String useEndTime, String approver,
			String auditor, String checker, String url) {
		this.reportId = reportId;
		this.mapQualId = mapQualId;
		this.proId = proId;
		this.specification = specification;
		this.tensileStan = tensileStan;
		this.tensileValue = tensileValue;
		this.tensileIsQulified = tensileIsQulified;
		this.elongationStan = elongationStan;
		this.elongationValue = elongationValue;
		this.elongationIsQulified = elongationIsQulified;
		this.yieldStan = yieldStan;
		this.yieldValue = yieldValue;
		this.yieldIsQulified = yieldIsQulified;
		this.bendStan = bendStan;
		this.bendValue = bendValue;
		this.bendIsQulified = bendIsQulified;
		this.WOffsetStan = WOffsetStan;
		this.WOffsetValue = WOffsetValue;
		this.WOffsetIsQulified = WOffsetIsQulified;
		this.purchaseTime = purchaseTime;
		this.purchaseAmount = purchaseAmount;
		this.manufacturer = manufacturer;
		this.useBeginTime = useBeginTime;
		this.useEndTime = useEndTime;
		this.approver = approver;
		this.auditor = auditor;
		this.checker = checker;
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

	public String getMapQualId() {
		return this.mapQualId;
	}

	public void setMapQualId(String mapQualId) {
		this.mapQualId = mapQualId;
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

	public String getTensileStan() {
		return this.tensileStan;
	}

	public void setTensileStan(String tensileStan) {
		this.tensileStan = tensileStan;
	}

	public String getTensileValue() {
		return this.tensileValue;
	}

	public void setTensileValue(String tensileValue) {
		this.tensileValue = tensileValue;
	}

	public String getTensileIsQulified() {
		return this.tensileIsQulified;
	}

	public void setTensileIsQulified(String tensileIsQulified) {
		this.tensileIsQulified = tensileIsQulified;
	}

	public String getElongationStan() {
		return this.elongationStan;
	}

	public void setElongationStan(String elongationStan) {
		this.elongationStan = elongationStan;
	}

	public String getElongationValue() {
		return this.elongationValue;
	}

	public void setElongationValue(String elongationValue) {
		this.elongationValue = elongationValue;
	}

	public String getElongationIsQulified() {
		return this.elongationIsQulified;
	}

	public void setElongationIsQulified(String elongationIsQulified) {
		this.elongationIsQulified = elongationIsQulified;
	}

	public String getYieldStan() {
		return this.yieldStan;
	}

	public void setYieldStan(String yieldStan) {
		this.yieldStan = yieldStan;
	}

	public String getYieldValue() {
		return this.yieldValue;
	}

	public void setYieldValue(String yieldValue) {
		this.yieldValue = yieldValue;
	}

	public String getYieldIsQulified() {
		return this.yieldIsQulified;
	}

	public void setYieldIsQulified(String yieldIsQulified) {
		this.yieldIsQulified = yieldIsQulified;
	}

	public String getBendStan() {
		return this.bendStan;
	}

	public void setBendStan(String bendStan) {
		this.bendStan = bendStan;
	}

	public String getBendValue() {
		return this.bendValue;
	}

	public void setBendValue(String bendValue) {
		this.bendValue = bendValue;
	}

	public String getBendIsQulified() {
		return this.bendIsQulified;
	}

	public void setBendIsQulified(String bendIsQulified) {
		this.bendIsQulified = bendIsQulified;
	}

	public String getWOffsetStan() {
		return this.WOffsetStan;
	}

	public void setWOffsetStan(String WOffsetStan) {
		this.WOffsetStan = WOffsetStan;
	}

	public String getWOffsetValue() {
		return this.WOffsetValue;
	}

	public void setWOffsetValue(String WOffsetValue) {
		this.WOffsetValue = WOffsetValue;
	}

	public String getWOffsetIsQulified() {
		return this.WOffsetIsQulified;
	}

	public void setWOffsetIsQulified(String WOffsetIsQulified) {
		this.WOffsetIsQulified = WOffsetIsQulified;
	}

	public String getPurchaseTime() {
		return this.purchaseTime;
	}

	public void setPurchaseTime(String purchaseTime) {
		this.purchaseTime = purchaseTime;
	}

	public String getPurchaseAmount() {
		return this.purchaseAmount;
	}

	public void setPurchaseAmount(String purchaseAmount) {
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

	public String getUseEndTime() {
		return this.useEndTime;
	}

	public void setUseEndTime(String useEndTime) {
		this.useEndTime = useEndTime;
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

	public String getChecker() {
		return this.checker;
	}

	public void setChecker(String checker) {
		this.checker = checker;
	}

	public String getUrl() {
		return this.url;
	}

	public void setUrl(String url) {
		this.url = url;
	}

}