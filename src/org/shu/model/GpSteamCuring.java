package org.shu.model;

import java.sql.Timestamp;

/**
 * GpSteamCuring entity. @author MyEclipse Persistence Tools
 */

public class GpSteamCuring implements java.io.Serializable {

	// Fields

	private Integer id;
	private String reportId;
	private Integer proId;
	private Integer startNum;
	private Integer endNum;
	private Timestamp produceDate;
	private String moldNum;
	private String mark;
	private String temStage;
	private String time;
	private String temperature;
	private String recordWorker;
	private String steamDate;
	private Integer status;

	// Constructors

	/** default constructor */
	public GpSteamCuring() {
	}

	/** full constructor */
	public GpSteamCuring(String reportId, Integer proId, Integer startNum,
			Integer endNum, Timestamp produceDate, String moldNum, String mark,
			String temStage, String time, String temperature,
			String recordWorker, String steamDate, Integer status) {
		this.reportId = reportId;
		this.proId = proId;
		this.startNum = startNum;
		this.endNum = endNum;
		this.produceDate = produceDate;
		this.moldNum = moldNum;
		this.mark = mark;
		this.temStage = temStage;
		this.time = time;
		this.temperature = temperature;
		this.recordWorker = recordWorker;
		this.steamDate = steamDate;
		this.status = status;
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

	public Timestamp getProduceDate() {
		return this.produceDate;
	}

	public void setProduceDate(Timestamp produceDate) {
		this.produceDate = produceDate;
	}

	public String getMoldNum() {
		return this.moldNum;
	}

	public void setMoldNum(String moldNum) {
		this.moldNum = moldNum;
	}

	public String getMark() {
		return this.mark;
	}

	public void setMark(String mark) {
		this.mark = mark;
	}

	public String getTemStage() {
		return this.temStage;
	}

	public void setTemStage(String temStage) {
		this.temStage = temStage;
	}

	public String getTime() {
		return this.time;
	}

	public void setTime(String time) {
		this.time = time;
	}

	public String getTemperature() {
		return this.temperature;
	}

	public void setTemperature(String temperature) {
		this.temperature = temperature;
	}

	public String getRecordWorker() {
		return this.recordWorker;
	}

	public void setRecordWorker(String recordWorker) {
		this.recordWorker = recordWorker;
	}

	public String getSteamDate() {
		return this.steamDate;
	}

	public void setSteamDate(String steamDate) {
		this.steamDate = steamDate;
	}

	public Integer getStatus() {
		return this.status;
	}

	public void setStatus(Integer status) {
		this.status = status;
	}

}