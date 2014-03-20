package org.shu.model;

/**
 * GpCheckindex entity. @author MyEclipse Persistence Tools
 */

public class GpCheckindex implements java.io.Serializable {

	// Fields

	private Integer tgIndx;
	private Integer proId;
	private Double tgGaocheng;
	private Double tgPingmian;
	private Double tgYxgc;
	private Double tgHfzk;
	private Double tgZfzk;
	private Double tgTyd;
	private Double tgDmcjlq;
	private Double tgDmcjcj;
	private Double tgZbjzbx;
	private Double tgGxzdbx;
	private Integer isEast;

	// Constructors

	/** default constructor */
	public GpCheckindex() {
	}

	/** full constructor */
	public GpCheckindex(Integer proId, Double tgGaocheng, Double tgPingmian,
			Double tgYxgc, Double tgHfzk, Double tgZfzk, Double tgTyd,
			Double tgDmcjlq, Double tgDmcjcj, Double tgZbjzbx, Double tgGxzdbx,
			Integer isEast) {
		this.proId = proId;
		this.tgGaocheng = tgGaocheng;
		this.tgPingmian = tgPingmian;
		this.tgYxgc = tgYxgc;
		this.tgHfzk = tgHfzk;
		this.tgZfzk = tgZfzk;
		this.tgTyd = tgTyd;
		this.tgDmcjlq = tgDmcjlq;
		this.tgDmcjcj = tgDmcjcj;
		this.tgZbjzbx = tgZbjzbx;
		this.tgGxzdbx = tgGxzdbx;
		this.isEast = isEast;
	}

	// Property accessors

	public Integer getTgIndx() {
		return this.tgIndx;
	}

	public void setTgIndx(Integer tgIndx) {
		this.tgIndx = tgIndx;
	}

	public Integer getProId() {
		return this.proId;
	}

	public void setProId(Integer proId) {
		this.proId = proId;
	}

	public Double getTgGaocheng() {
		return this.tgGaocheng;
	}

	public void setTgGaocheng(Double tgGaocheng) {
		this.tgGaocheng = tgGaocheng;
	}

	public Double getTgPingmian() {
		return this.tgPingmian;
	}

	public void setTgPingmian(Double tgPingmian) {
		this.tgPingmian = tgPingmian;
	}

	public Double getTgYxgc() {
		return this.tgYxgc;
	}

	public void setTgYxgc(Double tgYxgc) {
		this.tgYxgc = tgYxgc;
	}

	public Double getTgHfzk() {
		return this.tgHfzk;
	}

	public void setTgHfzk(Double tgHfzk) {
		this.tgHfzk = tgHfzk;
	}

	public Double getTgZfzk() {
		return this.tgZfzk;
	}

	public void setTgZfzk(Double tgZfzk) {
		this.tgZfzk = tgZfzk;
	}

	public Double getTgTyd() {
		return this.tgTyd;
	}

	public void setTgTyd(Double tgTyd) {
		this.tgTyd = tgTyd;
	}

	public Double getTgDmcjlq() {
		return this.tgDmcjlq;
	}

	public void setTgDmcjlq(Double tgDmcjlq) {
		this.tgDmcjlq = tgDmcjlq;
	}

	public Double getTgDmcjcj() {
		return this.tgDmcjcj;
	}

	public void setTgDmcjcj(Double tgDmcjcj) {
		this.tgDmcjcj = tgDmcjcj;
	}

	public Double getTgZbjzbx() {
		return this.tgZbjzbx;
	}

	public void setTgZbjzbx(Double tgZbjzbx) {
		this.tgZbjzbx = tgZbjzbx;
	}

	public Double getTgGxzdbx() {
		return this.tgGxzdbx;
	}

	public void setTgGxzdbx(Double tgGxzdbx) {
		this.tgGxzdbx = tgGxzdbx;
	}

	public Integer getIsEast() {
		return this.isEast;
	}

	public void setIsEast(Integer isEast) {
		this.isEast = isEast;
	}

}