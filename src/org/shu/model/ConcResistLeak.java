package org.shu.model;

/**
 * ConcResistLeak entity. @author MyEclipse Persistence Tools
 */

public class ConcResistLeak implements java.io.Serializable {

	// Fields

	private Integer id;
	private String reportId;
	private Integer proId;
	private String resistLeakStan;
	private String resistLeakValue;
	private String resistLeakIsQual;
	private String clDiffuseStan;
	private String clDiffuseValue;
	private String clDiffuseIsQual;
	private String clContentStan;
	private String clContentValue;
	private String clContentIsQual;
	private String alkaliStan;
	private String alkaliValue;
	private String alkaliIsQual;
	private String approvor;
	private String auditor;
	private String checker;
	private String date;
	private String url;

	// Constructors

	/** default constructor */
	public ConcResistLeak() {
	}

	/** full constructor */
	public ConcResistLeak(String reportId, Integer proId,
			String resistLeakStan, String resistLeakValue,
			String resistLeakIsQual, String clDiffuseStan,
			String clDiffuseValue, String clDiffuseIsQual,
			String clContentStan, String clContentValue,
			String clContentIsQual, String alkaliStan, String alkaliValue,
			String alkaliIsQual, String approvor, String auditor,
			String checker, String date, String url) {
		this.reportId = reportId;
		this.proId = proId;
		this.resistLeakStan = resistLeakStan;
		this.resistLeakValue = resistLeakValue;
		this.resistLeakIsQual = resistLeakIsQual;
		this.clDiffuseStan = clDiffuseStan;
		this.clDiffuseValue = clDiffuseValue;
		this.clDiffuseIsQual = clDiffuseIsQual;
		this.clContentStan = clContentStan;
		this.clContentValue = clContentValue;
		this.clContentIsQual = clContentIsQual;
		this.alkaliStan = alkaliStan;
		this.alkaliValue = alkaliValue;
		this.alkaliIsQual = alkaliIsQual;
		this.approvor = approvor;
		this.auditor = auditor;
		this.checker = checker;
		this.date = date;
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

	public String getResistLeakStan() {
		return this.resistLeakStan;
	}

	public void setResistLeakStan(String resistLeakStan) {
		this.resistLeakStan = resistLeakStan;
	}

	public String getResistLeakValue() {
		return this.resistLeakValue;
	}

	public void setResistLeakValue(String resistLeakValue) {
		this.resistLeakValue = resistLeakValue;
	}

	public String getResistLeakIsQual() {
		return this.resistLeakIsQual;
	}

	public void setResistLeakIsQual(String resistLeakIsQual) {
		this.resistLeakIsQual = resistLeakIsQual;
	}

	public String getClDiffuseStan() {
		return this.clDiffuseStan;
	}

	public void setClDiffuseStan(String clDiffuseStan) {
		this.clDiffuseStan = clDiffuseStan;
	}

	public String getClDiffuseValue() {
		return this.clDiffuseValue;
	}

	public void setClDiffuseValue(String clDiffuseValue) {
		this.clDiffuseValue = clDiffuseValue;
	}

	public String getClDiffuseIsQual() {
		return this.clDiffuseIsQual;
	}

	public void setClDiffuseIsQual(String clDiffuseIsQual) {
		this.clDiffuseIsQual = clDiffuseIsQual;
	}

	public String getClContentStan() {
		return this.clContentStan;
	}

	public void setClContentStan(String clContentStan) {
		this.clContentStan = clContentStan;
	}

	public String getClContentValue() {
		return this.clContentValue;
	}

	public void setClContentValue(String clContentValue) {
		this.clContentValue = clContentValue;
	}

	public String getClContentIsQual() {
		return this.clContentIsQual;
	}

	public void setClContentIsQual(String clContentIsQual) {
		this.clContentIsQual = clContentIsQual;
	}

	public String getAlkaliStan() {
		return this.alkaliStan;
	}

	public void setAlkaliStan(String alkaliStan) {
		this.alkaliStan = alkaliStan;
	}

	public String getAlkaliValue() {
		return this.alkaliValue;
	}

	public void setAlkaliValue(String alkaliValue) {
		this.alkaliValue = alkaliValue;
	}

	public String getAlkaliIsQual() {
		return this.alkaliIsQual;
	}

	public void setAlkaliIsQual(String alkaliIsQual) {
		this.alkaliIsQual = alkaliIsQual;
	}

	public String getApprovor() {
		return this.approvor;
	}

	public void setApprovor(String approvor) {
		this.approvor = approvor;
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

	public String getDate() {
		return this.date;
	}

	public void setDate(String date) {
		this.date = date;
	}

	public String getUrl() {
		return this.url;
	}

	public void setUrl(String url) {
		this.url = url;
	}

}