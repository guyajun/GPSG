package org.shu.model;

import java.sql.Timestamp;

/**
 * RfidRefGp entity. @author MyEclipse Persistence Tools
 */

public class RfidRefGp implements java.io.Serializable {

	// Fields

	private Integer id;
	private String rfidTid;
	private Integer proId;
	private String gpId;
	private String coverId;
	private String status;
	private String gpStatus;
	private Timestamp enableTime;
	private String creator;
	private Timestamp createTime;
	private String modifier;
	private Timestamp modifyTime;

	// Constructors

	/** default constructor */
	public RfidRefGp() {
	}

	/** full constructor */
	public RfidRefGp(String rfidTid, Integer proId, String gpId,
			String coverId, String status, String gpStatus,
			Timestamp enableTime, String creator, Timestamp createTime,
			String modifier, Timestamp modifyTime) {
		this.rfidTid = rfidTid;
		this.proId = proId;
		this.gpId = gpId;
		this.coverId = coverId;
		this.status = status;
		this.gpStatus = gpStatus;
		this.enableTime = enableTime;
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

	public String getRfidTid() {
		return this.rfidTid;
	}

	public void setRfidTid(String rfidTid) {
		this.rfidTid = rfidTid;
	}

	public Integer getProId() {
		return this.proId;
	}

	public void setProId(Integer proId) {
		this.proId = proId;
	}

	public String getGpId() {
		return this.gpId;
	}

	public void setGpId(String gpId) {
		this.gpId = gpId;
	}

	public String getCoverId() {
		return this.coverId;
	}

	public void setCoverId(String coverId) {
		this.coverId = coverId;
	}

	public String getStatus() {
		return this.status;
	}

	public void setStatus(String status) {
		this.status = status;
	}

	public String getGpStatus() {
		return this.gpStatus;
	}

	public void setGpStatus(String gpStatus) {
		this.gpStatus = gpStatus;
	}

	public Timestamp getEnableTime() {
		return this.enableTime;
	}

	public void setEnableTime(Timestamp enableTime) {
		this.enableTime = enableTime;
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