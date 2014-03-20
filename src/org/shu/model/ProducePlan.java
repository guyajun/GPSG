package org.shu.model;

import java.sql.Timestamp;

/**
 * ProducePlan entity. @author MyEclipse Persistence Tools
 */

public class ProducePlan implements java.io.Serializable {

	// Fields

	private Integer id;
	private Integer proId;
	private String startTime;
	private String endTime;
	private Integer workShift;
	private Integer startNum;
	private Integer endNum;
	private String coverDepth;
	private Integer loopsCount;
	private String creator;
	private Timestamp createTime;
	private String modifier;
	private Timestamp modifyTime;

	// Constructors

	/** default constructor */
	public ProducePlan() {
	}

	/** full constructor */
	public ProducePlan(Integer proId, String startTime, String endTime,
			Integer workShift, Integer startNum, Integer endNum,
			String coverDepth, Integer loopsCount, String creator,
			Timestamp createTime, String modifier, Timestamp modifyTime) {
		this.proId = proId;
		this.startTime = startTime;
		this.endTime = endTime;
		this.workShift = workShift;
		this.startNum = startNum;
		this.endNum = endNum;
		this.coverDepth = coverDepth;
		this.loopsCount = loopsCount;
		this.creator = creator;
		this.createTime = createTime;
		this.modifier = modifier;
		this.modifyTime = modifyTime;
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

	public String getStartTime() {
		return this.startTime;
	}

	public void setStartTime(String startTime) {
		this.startTime = startTime;
	}

	public String getEndTime() {
		return this.endTime;
	}

	public void setEndTime(String endTime) {
		this.endTime = endTime;
	}

	public Integer getWorkShift() {
		return this.workShift;
	}

	public void setWorkShift(Integer workShift) {
		this.workShift = workShift;
	}

	public Integer getStartNum() {
		return this.startNum;
	}

	public void setStartNum(Integer startNum) {
		this.startNum = startNum;
	}

	public Integer getEndNum() {
		return this.endNum;
	}

	public void setEndNum(Integer endNum) {
		this.endNum = endNum;
	}

	public String getCoverDepth() {
		return this.coverDepth;
	}

	public void setCoverDepth(String coverDepth) {
		this.coverDepth = coverDepth;
	}

	public Integer getLoopsCount() {
		return this.loopsCount;
	}

	public void setLoopsCount(Integer loopsCount) {
		this.loopsCount = loopsCount;
	}

	public String getCreator() {
		return this.creator;
	}

	public void setCreator(String creator) {
		this.creator = creator;
	}

	public Timestamp getCreateTime() {
		return this.createTime;
	}

	public void setCreateTime(Timestamp createTime) {
		this.createTime = createTime;
	}

	public String getModifier() {
		return this.modifier;
	}

	public void setModifier(String modifier) {
		this.modifier = modifier;
	}

	public Timestamp getModifyTime() {
		return this.modifyTime;
	}

	public void setModifyTime(Timestamp modifyTime) {
		this.modifyTime = modifyTime;
	}

}