package org.shu.model;

import java.sql.Timestamp;

/**
 * SynchronousGrout entity. @author MyEclipse Persistence Tools
 */

public class SynchronousGrout implements java.io.Serializable {

	// Fields

	private Integer id;
	private Integer tunnelLoop;
	private Integer proId;
	private Timestamp today;
	private String setUpperLimit;
	private String actualUpperLimit;
	private String setLowerLimit;
	private String actualLowerLimit;
	private String checkPressureTime;
	private String groutSetValue;
	private String groutActualValue;
	private String serifluxRatio;
	private String slump;
	private String accident;
	private String memo;
	private String creator;
	private String createDate;
	private Integer status;
	private Integer isEast;

	// Constructors

	/** default constructor */
	public SynchronousGrout() {
	}

	/** full constructor */
	public SynchronousGrout(Integer tunnelLoop, Integer proId, Timestamp today,
			String setUpperLimit, String actualUpperLimit,
			String setLowerLimit, String actualLowerLimit,
			String checkPressureTime, String groutSetValue,
			String groutActualValue, String serifluxRatio, String slump,
			String accident, String memo, String creator, String createDate,
			Integer status, Integer isEast) {
		this.tunnelLoop = tunnelLoop;
		this.proId = proId;
		this.today = today;
		this.setUpperLimit = setUpperLimit;
		this.actualUpperLimit = actualUpperLimit;
		this.setLowerLimit = setLowerLimit;
		this.actualLowerLimit = actualLowerLimit;
		this.checkPressureTime = checkPressureTime;
		this.groutSetValue = groutSetValue;
		this.groutActualValue = groutActualValue;
		this.serifluxRatio = serifluxRatio;
		this.slump = slump;
		this.accident = accident;
		this.memo = memo;
		this.creator = creator;
		this.createDate = createDate;
		this.status = status;
		this.isEast = isEast;
	}

	// Property accessors

	public Integer getId() {
		return this.id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public Integer getTunnelLoop() {
		return this.tunnelLoop;
	}

	public void setTunnelLoop(Integer tunnelLoop) {
		this.tunnelLoop = tunnelLoop;
	}

	public Integer getProId() {
		return this.proId;
	}

	public void setProId(Integer proId) {
		this.proId = proId;
	}

	public Timestamp getToday() {
		return this.today;
	}

	public void setToday(Timestamp today) {
		this.today = today;
	}

	public String getSetUpperLimit() {
		return this.setUpperLimit;
	}

	public void setSetUpperLimit(String setUpperLimit) {
		this.setUpperLimit = setUpperLimit;
	}

	public String getActualUpperLimit() {
		return this.actualUpperLimit;
	}

	public void setActualUpperLimit(String actualUpperLimit) {
		this.actualUpperLimit = actualUpperLimit;
	}

	public String getSetLowerLimit() {
		return this.setLowerLimit;
	}

	public void setSetLowerLimit(String setLowerLimit) {
		this.setLowerLimit = setLowerLimit;
	}

	public String getActualLowerLimit() {
		return this.actualLowerLimit;
	}

	public void setActualLowerLimit(String actualLowerLimit) {
		this.actualLowerLimit = actualLowerLimit;
	}

	public String getCheckPressureTime() {
		return this.checkPressureTime;
	}

	public void setCheckPressureTime(String checkPressureTime) {
		this.checkPressureTime = checkPressureTime;
	}

	public String getGroutSetValue() {
		return this.groutSetValue;
	}

	public void setGroutSetValue(String groutSetValue) {
		this.groutSetValue = groutSetValue;
	}

	public String getGroutActualValue() {
		return this.groutActualValue;
	}

	public void setGroutActualValue(String groutActualValue) {
		this.groutActualValue = groutActualValue;
	}

	public String getSerifluxRatio() {
		return this.serifluxRatio;
	}

	public void setSerifluxRatio(String serifluxRatio) {
		this.serifluxRatio = serifluxRatio;
	}

	public String getSlump() {
		return this.slump;
	}

	public void setSlump(String slump) {
		this.slump = slump;
	}

	public String getAccident() {
		return this.accident;
	}

	public void setAccident(String accident) {
		this.accident = accident;
	}

	public String getMemo() {
		return this.memo;
	}

	public void setMemo(String memo) {
		this.memo = memo;
	}

	public String getCreator() {
		return this.creator;
	}

	public void setCreator(String creator) {
		this.creator = creator;
	}

	public String getCreateDate() {
		return this.createDate;
	}

	public void setCreateDate(String createDate) {
		this.createDate = createDate;
	}

	public Integer getStatus() {
		return this.status;
	}

	public void setStatus(Integer status) {
		this.status = status;
	}

	public Integer getIsEast() {
		return this.isEast;
	}

	public void setIsEast(Integer isEast) {
		this.isEast = isEast;
	}

}