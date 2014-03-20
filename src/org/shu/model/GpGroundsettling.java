package org.shu.model;

import java.sql.Timestamp;

/**
 * GpGroundsettling entity. @author MyEclipse Persistence Tools
 */

public class GpGroundsettling implements java.io.Serializable {

	// Fields

	private Integer dcIndx;
	private Integer proId;
	private String dcCdno;
	private Timestamp dcTime;
	private Double dcValue;
	private Double dcVary;
	private Double dcTotl;
	private Double dcX;
	private Double dcY;
	private Double dcJzwmaxlq;
	private Double dcJzwmaxcj;
	private Double dcGxmaxlq;
	private Double dcGxmaxcj;
	private Integer isEast;

	// Constructors

	/** default constructor */
	public GpGroundsettling() {
	}

	/** full constructor */
	public GpGroundsettling(Integer proId, String dcCdno, Timestamp dcTime,
			Double dcValue, Double dcVary, Double dcTotl, Double dcX,
			Double dcY, Double dcJzwmaxlq, Double dcJzwmaxcj, Double dcGxmaxlq,
			Double dcGxmaxcj, Integer isEast) {
		this.proId = proId;
		this.dcCdno = dcCdno;
		this.dcTime = dcTime;
		this.dcValue = dcValue;
		this.dcVary = dcVary;
		this.dcTotl = dcTotl;
		this.dcX = dcX;
		this.dcY = dcY;
		this.dcJzwmaxlq = dcJzwmaxlq;
		this.dcJzwmaxcj = dcJzwmaxcj;
		this.dcGxmaxlq = dcGxmaxlq;
		this.dcGxmaxcj = dcGxmaxcj;
		this.isEast = isEast;
	}

	// Property accessors

	public Integer getDcIndx() {
		return this.dcIndx;
	}

	public void setDcIndx(Integer dcIndx) {
		this.dcIndx = dcIndx;
	}

	public Integer getProId() {
		return this.proId;
	}

	public void setProId(Integer proId) {
		this.proId = proId;
	}

	public String getDcCdno() {
		return this.dcCdno;
	}

	public void setDcCdno(String dcCdno) {
		this.dcCdno = dcCdno;
	}

	public Timestamp getDcTime() {
		return this.dcTime;
	}

	public void setDcTime(Timestamp dcTime) {
		this.dcTime = dcTime;
	}

	public Double getDcValue() {
		return this.dcValue;
	}

	public void setDcValue(Double dcValue) {
		this.dcValue = dcValue;
	}

	public Double getDcVary() {
		return this.dcVary;
	}

	public void setDcVary(Double dcVary) {
		this.dcVary = dcVary;
	}

	public Double getDcTotl() {
		return this.dcTotl;
	}

	public void setDcTotl(Double dcTotl) {
		this.dcTotl = dcTotl;
	}

	public Double getDcX() {
		return this.dcX;
	}

	public void setDcX(Double dcX) {
		this.dcX = dcX;
	}

	public Double getDcY() {
		return this.dcY;
	}

	public void setDcY(Double dcY) {
		this.dcY = dcY;
	}

	public Double getDcJzwmaxlq() {
		return this.dcJzwmaxlq;
	}

	public void setDcJzwmaxlq(Double dcJzwmaxlq) {
		this.dcJzwmaxlq = dcJzwmaxlq;
	}

	public Double getDcJzwmaxcj() {
		return this.dcJzwmaxcj;
	}

	public void setDcJzwmaxcj(Double dcJzwmaxcj) {
		this.dcJzwmaxcj = dcJzwmaxcj;
	}

	public Double getDcGxmaxlq() {
		return this.dcGxmaxlq;
	}

	public void setDcGxmaxlq(Double dcGxmaxlq) {
		this.dcGxmaxlq = dcGxmaxlq;
	}

	public Double getDcGxmaxcj() {
		return this.dcGxmaxcj;
	}

	public void setDcGxmaxcj(Double dcGxmaxcj) {
		this.dcGxmaxcj = dcGxmaxcj;
	}

	public Integer getIsEast() {
		return this.isEast;
	}

	public void setIsEast(Integer isEast) {
		this.isEast = isEast;
	}

}