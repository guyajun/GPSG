package org.shu.model;

/**
 * GpSoilproperty entity. @author MyEclipse Persistence Tools
 */

public class GpSoilproperty implements java.io.Serializable {

	// Fields

	private Integer tcIndx;
	private Integer proId;
	private String tcCno;
	private String tcTcmc;
	private String tcLoop;
	private String tcLicheng;
	private Double tcHsl;
	private Double tcZd;
	private Double tcMd;
	private Double tcBhd;
	private Double tcKxb;
	private Double tcNr;
	private Double tcKh;
	private Double tcKv;
	private Double tcCu;
	private Double tcYsml;
	private Double tcN;
	private Double tcYs;
	private Double tcCy;
	private Double tcWp;
	private Double tcWl;
	private Double tcIl;
	private Double tcIp;
	private Double tcDzky;
	private Double tcSyhl;
	private Integer isEast;

	// Constructors

	/** default constructor */
	public GpSoilproperty() {
	}

	/** full constructor */
	public GpSoilproperty(Integer proId, String tcCno, String tcTcmc,
			String tcLoop, String tcLicheng, Double tcHsl, Double tcZd,
			Double tcMd, Double tcBhd, Double tcKxb, Double tcNr, Double tcKh,
			Double tcKv, Double tcCu, Double tcYsml, Double tcN, Double tcYs,
			Double tcCy, Double tcWp, Double tcWl, Double tcIl, Double tcIp,
			Double tcDzky, Double tcSyhl, Integer isEast) {
		this.proId = proId;
		this.tcCno = tcCno;
		this.tcTcmc = tcTcmc;
		this.tcLoop = tcLoop;
		this.tcLicheng = tcLicheng;
		this.tcHsl = tcHsl;
		this.tcZd = tcZd;
		this.tcMd = tcMd;
		this.tcBhd = tcBhd;
		this.tcKxb = tcKxb;
		this.tcNr = tcNr;
		this.tcKh = tcKh;
		this.tcKv = tcKv;
		this.tcCu = tcCu;
		this.tcYsml = tcYsml;
		this.tcN = tcN;
		this.tcYs = tcYs;
		this.tcCy = tcCy;
		this.tcWp = tcWp;
		this.tcWl = tcWl;
		this.tcIl = tcIl;
		this.tcIp = tcIp;
		this.tcDzky = tcDzky;
		this.tcSyhl = tcSyhl;
		this.isEast = isEast;
	}

	// Property accessors

	public Integer getTcIndx() {
		return this.tcIndx;
	}

	public void setTcIndx(Integer tcIndx) {
		this.tcIndx = tcIndx;
	}

	public Integer getProId() {
		return this.proId;
	}

	public void setProId(Integer proId) {
		this.proId = proId;
	}

	public String getTcCno() {
		return this.tcCno;
	}

	public void setTcCno(String tcCno) {
		this.tcCno = tcCno;
	}

	public String getTcTcmc() {
		return this.tcTcmc;
	}

	public void setTcTcmc(String tcTcmc) {
		this.tcTcmc = tcTcmc;
	}

	public String getTcLoop() {
		return this.tcLoop;
	}

	public void setTcLoop(String tcLoop) {
		this.tcLoop = tcLoop;
	}

	public String getTcLicheng() {
		return this.tcLicheng;
	}

	public void setTcLicheng(String tcLicheng) {
		this.tcLicheng = tcLicheng;
	}

	public Double getTcHsl() {
		return this.tcHsl;
	}

	public void setTcHsl(Double tcHsl) {
		this.tcHsl = tcHsl;
	}

	public Double getTcZd() {
		return this.tcZd;
	}

	public void setTcZd(Double tcZd) {
		this.tcZd = tcZd;
	}

	public Double getTcMd() {
		return this.tcMd;
	}

	public void setTcMd(Double tcMd) {
		this.tcMd = tcMd;
	}

	public Double getTcBhd() {
		return this.tcBhd;
	}

	public void setTcBhd(Double tcBhd) {
		this.tcBhd = tcBhd;
	}

	public Double getTcKxb() {
		return this.tcKxb;
	}

	public void setTcKxb(Double tcKxb) {
		this.tcKxb = tcKxb;
	}

	public Double getTcNr() {
		return this.tcNr;
	}

	public void setTcNr(Double tcNr) {
		this.tcNr = tcNr;
	}

	public Double getTcKh() {
		return this.tcKh;
	}

	public void setTcKh(Double tcKh) {
		this.tcKh = tcKh;
	}

	public Double getTcKv() {
		return this.tcKv;
	}

	public void setTcKv(Double tcKv) {
		this.tcKv = tcKv;
	}

	public Double getTcCu() {
		return this.tcCu;
	}

	public void setTcCu(Double tcCu) {
		this.tcCu = tcCu;
	}

	public Double getTcYsml() {
		return this.tcYsml;
	}

	public void setTcYsml(Double tcYsml) {
		this.tcYsml = tcYsml;
	}

	public Double getTcN() {
		return this.tcN;
	}

	public void setTcN(Double tcN) {
		this.tcN = tcN;
	}

	public Double getTcYs() {
		return this.tcYs;
	}

	public void setTcYs(Double tcYs) {
		this.tcYs = tcYs;
	}

	public Double getTcCy() {
		return this.tcCy;
	}

	public void setTcCy(Double tcCy) {
		this.tcCy = tcCy;
	}

	public Double getTcWp() {
		return this.tcWp;
	}

	public void setTcWp(Double tcWp) {
		this.tcWp = tcWp;
	}

	public Double getTcWl() {
		return this.tcWl;
	}

	public void setTcWl(Double tcWl) {
		this.tcWl = tcWl;
	}

	public Double getTcIl() {
		return this.tcIl;
	}

	public void setTcIl(Double tcIl) {
		this.tcIl = tcIl;
	}

	public Double getTcIp() {
		return this.tcIp;
	}

	public void setTcIp(Double tcIp) {
		this.tcIp = tcIp;
	}

	public Double getTcDzky() {
		return this.tcDzky;
	}

	public void setTcDzky(Double tcDzky) {
		this.tcDzky = tcDzky;
	}

	public Double getTcSyhl() {
		return this.tcSyhl;
	}

	public void setTcSyhl(Double tcSyhl) {
		this.tcSyhl = tcSyhl;
	}

	public Integer getIsEast() {
		return this.isEast;
	}

	public void setIsEast(Integer isEast) {
		this.isEast = isEast;
	}

}