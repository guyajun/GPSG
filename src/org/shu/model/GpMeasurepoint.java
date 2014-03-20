package org.shu.model;

/**
 * GpMeasurepoint entity. @author MyEclipse Persistence Tools
 */

public class GpMeasurepoint implements java.io.Serializable {

	// Fields

	private Integer cbIndx;
	private Integer proId;
	private String cbCdno;
	private String cbType;
	private String cbLicheng;
	private Double cbTx;
	private Double cbTy;
	private Double cbGx;
	private Double cbGy;
	private String cbBase;
	private String cbBldrel;
	private Integer isEast;

	// Constructors

	/** default constructor */
	public GpMeasurepoint() {
	}

	/** full constructor */
	public GpMeasurepoint(Integer proId, String cbCdno, String cbType,
			String cbLicheng, Double cbTx, Double cbTy, Double cbGx,
			Double cbGy, String cbBase, String cbBldrel, Integer isEast) {
		this.proId = proId;
		this.cbCdno = cbCdno;
		this.cbType = cbType;
		this.cbLicheng = cbLicheng;
		this.cbTx = cbTx;
		this.cbTy = cbTy;
		this.cbGx = cbGx;
		this.cbGy = cbGy;
		this.cbBase = cbBase;
		this.cbBldrel = cbBldrel;
		this.isEast = isEast;
	}

	// Property accessors

	public Integer getCbIndx() {
		return this.cbIndx;
	}

	public void setCbIndx(Integer cbIndx) {
		this.cbIndx = cbIndx;
	}

	public Integer getProId() {
		return this.proId;
	}

	public void setProId(Integer proId) {
		this.proId = proId;
	}

	public String getCbCdno() {
		return this.cbCdno;
	}

	public void setCbCdno(String cbCdno) {
		this.cbCdno = cbCdno;
	}

	public String getCbType() {
		return this.cbType;
	}

	public void setCbType(String cbType) {
		this.cbType = cbType;
	}

	public String getCbLicheng() {
		return this.cbLicheng;
	}

	public void setCbLicheng(String cbLicheng) {
		this.cbLicheng = cbLicheng;
	}

	public Double getCbTx() {
		return this.cbTx;
	}

	public void setCbTx(Double cbTx) {
		this.cbTx = cbTx;
	}

	public Double getCbTy() {
		return this.cbTy;
	}

	public void setCbTy(Double cbTy) {
		this.cbTy = cbTy;
	}

	public Double getCbGx() {
		return this.cbGx;
	}

	public void setCbGx(Double cbGx) {
		this.cbGx = cbGx;
	}

	public Double getCbGy() {
		return this.cbGy;
	}

	public void setCbGy(Double cbGy) {
		this.cbGy = cbGy;
	}

	public String getCbBase() {
		return this.cbBase;
	}

	public void setCbBase(String cbBase) {
		this.cbBase = cbBase;
	}

	public String getCbBldrel() {
		return this.cbBldrel;
	}

	public void setCbBldrel(String cbBldrel) {
		this.cbBldrel = cbBldrel;
	}

	public Integer getIsEast() {
		return this.isEast;
	}

	public void setIsEast(Integer isEast) {
		this.isEast = isEast;
	}

}