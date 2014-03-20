package org.shu.model;

/**
 * CdinModelInfo entity. @author MyEclipse Persistence Tools
 */

public class CdinModelInfo implements java.io.Serializable {

	// Fields

	private Integer id;
	private Integer proId;
	private String cdno;
	private String cdnoinModel;
	private Integer ringNo;
	private String xy;
	private Integer isEast;

	// Constructors

	/** default constructor */
	public CdinModelInfo() {
	}

	/** full constructor */
	public CdinModelInfo(Integer proId, String cdno, String cdnoinModel,
			Integer ringNo, String xy, Integer isEast) {
		this.proId = proId;
		this.cdno = cdno;
		this.cdnoinModel = cdnoinModel;
		this.ringNo = ringNo;
		this.xy = xy;
		this.isEast = isEast;
	}

	// Property accessors

	public Integer getId() {
		return this.id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public Integer getProId() {
		return this.proId;
	}

	public void setProId(Integer proId) {
		this.proId = proId;
	}

	public String getCdno() {
		return this.cdno;
	}

	public void setCdno(String cdno) {
		this.cdno = cdno;
	}

	public String getCdnoinModel() {
		return this.cdnoinModel;
	}

	public void setCdnoinModel(String cdnoinModel) {
		this.cdnoinModel = cdnoinModel;
	}

	public Integer getRingNo() {
		return this.ringNo;
	}

	public void setRingNo(Integer ringNo) {
		this.ringNo = ringNo;
	}

	public String getXy() {
		return this.xy;
	}

	public void setXy(String xy) {
		this.xy = xy;
	}

	public Integer getIsEast() {
		return this.isEast;
	}

	public void setIsEast(Integer isEast) {
		this.isEast = isEast;
	}

}