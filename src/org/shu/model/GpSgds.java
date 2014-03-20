package org.shu.model;

/**
 * GpSgds entity. @author MyEclipse Persistence Tools
 */

public class GpSgds implements java.io.Serializable {

	// Fields

	private Integer dsIndx;
	private Integer proId;
	private String dsDate;
	private String dsTitl;
	private String dsDspt;
	private String dsPzr;
	private Integer isEast;

	// Constructors

	/** default constructor */
	public GpSgds() {
	}

	/** full constructor */
	public GpSgds(Integer proId, String dsDate, String dsTitl, String dsDspt,
			String dsPzr, Integer isEast) {
		this.proId = proId;
		this.dsDate = dsDate;
		this.dsTitl = dsTitl;
		this.dsDspt = dsDspt;
		this.dsPzr = dsPzr;
		this.isEast = isEast;
	}

	// Property accessors

	public Integer getDsIndx() {
		return this.dsIndx;
	}

	public void setDsIndx(Integer dsIndx) {
		this.dsIndx = dsIndx;
	}

	public Integer getProId() {
		return this.proId;
	}

	public void setProId(Integer proId) {
		this.proId = proId;
	}

	public String getDsDate() {
		return this.dsDate;
	}

	public void setDsDate(String dsDate) {
		this.dsDate = dsDate;
	}

	public String getDsTitl() {
		return this.dsTitl;
	}

	public void setDsTitl(String dsTitl) {
		this.dsTitl = dsTitl;
	}

	public String getDsDspt() {
		return this.dsDspt;
	}

	public void setDsDspt(String dsDspt) {
		this.dsDspt = dsDspt;
	}

	public String getDsPzr() {
		return this.dsPzr;
	}

	public void setDsPzr(String dsPzr) {
		this.dsPzr = dsPzr;
	}

	public Integer getIsEast() {
		return this.isEast;
	}

	public void setIsEast(Integer isEast) {
		this.isEast = isEast;
	}

}