package org.shu.model;

import java.sql.Timestamp;

/**
 * Segmentrepair entity. @author MyEclipse Persistence Tools
 */

public class Segmentrepair implements java.io.Serializable {

	// Fields

	private Integer id;
	private String reportId;
	private Integer proId;
	private Integer startNum;
	private Integer endNum;
	private Integer tunnelLoop;
	private String pipeStatus;
	private String pipeStatusPos;
	private String checker;
	private Timestamp checkDate;
	private String status;
	private String isPhoto;
	private Integer isEast;

	// Constructors

	/** default constructor */
	public Segmentrepair() {
	}

	/** full constructor */
	public Segmentrepair(String reportId, Integer proId, Integer startNum,
			Integer endNum, Integer tunnelLoop, String pipeStatus,
			String pipeStatusPos, String checker, Timestamp checkDate,
			String status, String isPhoto, Integer isEast) {
		this.reportId = reportId;
		this.proId = proId;
		this.startNum = startNum;
		this.endNum = endNum;
		this.tunnelLoop = tunnelLoop;
		this.pipeStatus = pipeStatus;
		this.pipeStatusPos = pipeStatusPos;
		this.checker = checker;
		this.checkDate = checkDate;
		this.status = status;
		this.isPhoto = isPhoto;
		this.isEast = isEast;
	}

	// Property accessors

	public Integer getId() {
		return this.id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getReportId() {
		return this.reportId;
	}

	public void setReportId(String reportId) {
		this.reportId = reportId;
	}

	public Integer getProId() {
		return this.proId;
	}

	public void setProId(Integer proId) {
		this.proId = proId;
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

	public Integer getTunnelLoop() {
		return this.tunnelLoop;
	}

	public void setTunnelLoop(Integer tunnelLoop) {
		this.tunnelLoop = tunnelLoop;
	}

	public String getPipeStatus() {
		return this.pipeStatus;
	}

	public void setPipeStatus(String pipeStatus) {
		this.pipeStatus = pipeStatus;
	}

	public String getPipeStatusPos() {
		return this.pipeStatusPos;
	}

	public void setPipeStatusPos(String pipeStatusPos) {
		this.pipeStatusPos = pipeStatusPos;
	}

	public String getChecker() {
		return this.checker;
	}

	public void setChecker(String checker) {
		this.checker = checker;
	}

	public Timestamp getCheckDate() {
		return this.checkDate;
	}

	public void setCheckDate(Timestamp checkDate) {
		this.checkDate = checkDate;
	}

	public String getStatus() {
		return this.status;
	}

	public void setStatus(String status) {
		this.status = status;
	}

	public String getIsPhoto() {
		return this.isPhoto;
	}

	public void setIsPhoto(String isPhoto) {
		this.isPhoto = isPhoto;
	}

	public Integer getIsEast() {
		return this.isEast;
	}

	public void setIsEast(Integer isEast) {
		this.isEast = isEast;
	}

}