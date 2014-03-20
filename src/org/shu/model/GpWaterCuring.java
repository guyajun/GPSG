package org.shu.model;

import java.sql.Timestamp;

/**
 * GpWaterCuring entity. @author MyEclipse Persistence Tools
 */

public class GpWaterCuring implements java.io.Serializable {

	// Fields

	private Integer id;
	private String reportId;
	private Integer proId;
	private Integer startNum;
	private Integer endNum;
	private Timestamp produceDate;
	private Timestamp inpoolTime;
	private String segmentTem;
	private String waterTem;
	private String temRange;
	private String waterPh;
	private Timestamp outpoolTime;
	private String recordWorker;
	private String memo;
	private String reportStatus;
	private String status;

	// Constructors

	/** default constructor */
	public GpWaterCuring() {
	}

	/** full constructor */
	public GpWaterCuring(String reportId, Integer proId, Integer startNum,
			Integer endNum, Timestamp produceDate, Timestamp inpoolTime,
			String segmentTem, String waterTem, String temRange,
			String waterPh, Timestamp outpoolTime, String recordWorker,
			String memo, String reportStatus, String status) {
		this.reportId = reportId;
		this.proId = proId;
		this.startNum = startNum;
		this.endNum = endNum;
		this.produceDate = produceDate;
		this.inpoolTime = inpoolTime;
		this.segmentTem = segmentTem;
		this.waterTem = waterTem;
		this.temRange = temRange;
		this.waterPh = waterPh;
		this.outpoolTime = outpoolTime;
		this.recordWorker = recordWorker;
		this.memo = memo;
		this.reportStatus = reportStatus;
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

	public Timestamp getInpoolTime() {
		return this.inpoolTime;
	}

	public void setInpoolTime(Timestamp inpoolTime) {
		this.inpoolTime = inpoolTime;
	}

	public String getSegmentTem() {
		return this.segmentTem;
	}

	public void setSegmentTem(String segmentTem) {
		this.segmentTem = segmentTem;
	}

	public String getWaterTem() {
		return this.waterTem;
	}

	public void setWaterTem(String waterTem) {
		this.waterTem = waterTem;
	}

	public String getTemRange() {
		return this.temRange;
	}

	public void setTemRange(String temRange) {
		this.temRange = temRange;
	}

	public String getWaterPh() {
		return this.waterPh;
	}

	public void setWaterPh(String waterPh) {
		this.waterPh = waterPh;
	}

	public Timestamp getOutpoolTime() {
		return this.outpoolTime;
	}

	public void setOutpoolTime(Timestamp outpoolTime) {
		this.outpoolTime = outpoolTime;
	}

	public String getRecordWorker() {
		return this.recordWorker;
	}

	public void setRecordWorker(String recordWorker) {
		this.recordWorker = recordWorker;
	}

	public String getMemo() {
		return this.memo;
	}

	public void setMemo(String memo) {
		this.memo = memo;
	}

	public String getReportStatus() {
		return this.reportStatus;
	}

	public void setReportStatus(String reportStatus) {
		this.reportStatus = reportStatus;
	}

	public String getStatus() {
		return this.status;
	}

	public void setStatus(String status) {
		this.status = status;
	}

}