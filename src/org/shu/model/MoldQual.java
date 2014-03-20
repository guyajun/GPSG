package org.shu.model;

import java.sql.Timestamp;

/**
 * MoldQual entity. @author MyEclipse Persistence Tools
 */

public class MoldQual implements java.io.Serializable {

	// Fields

	private Integer id;
	private Integer proId;
	private String moldId;
	private Integer startNum;
	private Integer endNum;
	private String inspector;
	private String monitor;
	private String qualInspector;
	private String supervisor;
	private Timestamp checkTime;
	private String checkResult;
	private String url;

	// Constructors

	/** default constructor */
	public MoldQual() {
	}

	/** full constructor */
	public MoldQual(Integer proId, String moldId, Integer startNum,
			Integer endNum, String inspector, String monitor,
			String qualInspector, String supervisor, Timestamp checkTime,
			String checkResult, String url) {
		this.proId = proId;
		this.moldId = moldId;
		this.startNum = startNum;
		this.endNum = endNum;
		this.inspector = inspector;
		this.monitor = monitor;
		this.qualInspector = qualInspector;
		this.supervisor = supervisor;
		this.checkTime = checkTime;
		this.checkResult = checkResult;
		this.url = url;
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

	public String getMoldId() {
		return this.moldId;
	}

	public void setMoldId(String moldId) {
		this.moldId = moldId;
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

	public String getInspector() {
		return this.inspector;
	}

	public void setInspector(String inspector) {
		this.inspector = inspector;
	}

	public String getMonitor() {
		return this.monitor;
	}

	public void setMonitor(String monitor) {
		this.monitor = monitor;
	}

	public String getQualInspector() {
		return this.qualInspector;
	}

	public void setQualInspector(String qualInspector) {
		this.qualInspector = qualInspector;
	}

	public String getSupervisor() {
		return this.supervisor;
	}

	public void setSupervisor(String supervisor) {
		this.supervisor = supervisor;
	}

	public Timestamp getCheckTime() {
		return this.checkTime;
	}

	public void setCheckTime(Timestamp checkTime) {
		this.checkTime = checkTime;
	}

	public String getCheckResult() {
		return this.checkResult;
	}

	public void setCheckResult(String checkResult) {
		this.checkResult = checkResult;
	}

	public String getUrl() {
		return this.url;
	}

	public void setUrl(String url) {
		this.url = url;
	}

}