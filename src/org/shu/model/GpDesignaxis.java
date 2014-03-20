package org.shu.model;

/**
 * GpDesignaxis entity. @author MyEclipse Persistence Tools
 */

public class GpDesignaxis implements java.io.Serializable {

	// Fields

	private Integer zxIndx;
	private Integer proId;
	private Integer zxStrg;
	private Integer zxEndg;
	private String zxStdt;
	private Double zxStdp;
	private Double zxStcd;
	private Double zxSlop;
	private Double zxHrds;
	private Double zxVrds;
	private Double zxElop;
	private Integer isEast;

	// Constructors

	/** default constructor */
	public GpDesignaxis() {
	}

	/** full constructor */
	public GpDesignaxis(Integer proId, Integer zxStrg, Integer zxEndg,
			String zxStdt, Double zxStdp, Double zxStcd, Double zxSlop,
			Double zxHrds, Double zxVrds, Double zxElop, Integer isEast) {
		this.proId = proId;
		this.zxStrg = zxStrg;
		this.zxEndg = zxEndg;
		this.zxStdt = zxStdt;
		this.zxStdp = zxStdp;
		this.zxStcd = zxStcd;
		this.zxSlop = zxSlop;
		this.zxHrds = zxHrds;
		this.zxVrds = zxVrds;
		this.zxElop = zxElop;
		this.isEast = isEast;
	}

	// Property accessors

	public Integer getZxIndx() {
		return this.zxIndx;
	}

	public void setZxIndx(Integer zxIndx) {
		this.zxIndx = zxIndx;
	}

	public Integer getProId() {
		return this.proId;
	}

	public void setProId(Integer proId) {
		this.proId = proId;
	}

	public Integer getZxStrg() {
		return this.zxStrg;
	}

	public void setZxStrg(Integer zxStrg) {
		this.zxStrg = zxStrg;
	}

	public Integer getZxEndg() {
		return this.zxEndg;
	}

	public void setZxEndg(Integer zxEndg) {
		this.zxEndg = zxEndg;
	}

	public String getZxStdt() {
		return this.zxStdt;
	}

	public void setZxStdt(String zxStdt) {
		this.zxStdt = zxStdt;
	}

	public Double getZxStdp() {
		return this.zxStdp;
	}

	public void setZxStdp(Double zxStdp) {
		this.zxStdp = zxStdp;
	}

	public Double getZxStcd() {
		return this.zxStcd;
	}

	public void setZxStcd(Double zxStcd) {
		this.zxStcd = zxStcd;
	}

	public Double getZxSlop() {
		return this.zxSlop;
	}

	public void setZxSlop(Double zxSlop) {
		this.zxSlop = zxSlop;
	}

	public Double getZxHrds() {
		return this.zxHrds;
	}

	public void setZxHrds(Double zxHrds) {
		this.zxHrds = zxHrds;
	}

	public Double getZxVrds() {
		return this.zxVrds;
	}

	public void setZxVrds(Double zxVrds) {
		this.zxVrds = zxVrds;
	}

	public Double getZxElop() {
		return this.zxElop;
	}

	public void setZxElop(Double zxElop) {
		this.zxElop = zxElop;
	}

	public Integer getIsEast() {
		return this.isEast;
	}

	public void setIsEast(Integer isEast) {
		this.isEast = isEast;
	}

}