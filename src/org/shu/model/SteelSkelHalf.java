package org.shu.model;

import java.sql.Timestamp;

/**
 * SteelSkelHalf entity. @author MyEclipse Persistence Tools
 */

public class SteelSkelHalf implements java.io.Serializable {

	// Fields

	private Integer id;
	private String reportId;
	private Integer proId;
	private String buildUnite;
	private Integer startNum;
	private Integer endNum;
	private String steelframeType;
	private Integer diameter;
	private String code;
	private String designSize;
	private String realSize;
	private String range;
	private String deviation;
	private String isQualified;
	private Timestamp checkDate;
	private String recordWorker;
	private String picLink;
	private String reportStatus;

	// Constructors

	/** default constructor */
	public SteelSkelHalf() {
	}

	/** full constructor */
	public SteelSkelHalf(String reportId, Integer proId, String buildUnite,
			Integer startNum, Integer endNum, String steelframeType,
			Integer diameter, String code, String designSize, String realSize,
			String range, String deviation, String isQualified,
			Timestamp checkDate, String recordWorker, String picLink,
			String reportStatus) {
		this.reportId = reportId;
		this.proId = proId;
		this.buildUnite = buildUnite;
		this.startNum = startNum;
		this.endNum = endNum;
		this.steelframeType = steelframeType;
		this.diameter = diameter;
		this.code = code;
		this.designSize = designSize;
		this.realSize = realSize;
		this.range = range;
		this.deviation = deviation;
		this.isQualified = isQualified;
		this.checkDate = checkDate;
		this.recordWorker = recordWorker;
		this.picLink = picLink;
		this.reportStatus = reportStatus;
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

	public String getBuildUnite() {
		return this.buildUnite;
	}

	public void setBuildUnite(String buildUnite) {
		this.buildUnite = buildUnite;
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

	public String getSteelframeType() {
		return this.steelframeType;
	}

	public void setSteelframeType(String steelframeType) {
		this.steelframeType = steelframeType;
	}

	public Integer getDiameter() {
		return this.diameter;
	}

	public void setDiameter(Integer diameter) {
		this.diameter = diameter;
	}

	public String getCode() {
		return this.code;
	}

	public void setCode(String code) {
		this.code = code;
	}

	public String getDesignSize() {
		return this.designSize;
	}

	public void setDesignSize(String designSize) {
		this.designSize = designSize;
	}

	public String getRealSize() {
		return this.realSize;
	}

	public void setRealSize(String realSize) {
		this.realSize = realSize;
	}

	public String getRange() {
		return this.range;
	}

	public void setRange(String range) {
		this.range = range;
	}

	public String getDeviation() {
		return this.deviation;
	}

	public void setDeviation(String deviation) {
		this.deviation = deviation;
	}

	public String getIsQualified() {
		return this.isQualified;
	}

	public void setIsQualified(String isQualified) {
		this.isQualified = isQualified;
	}

	public Timestamp getCheckDate() {
		return this.checkDate;
	}

	public void setCheckDate(Timestamp checkDate) {
		this.checkDate = checkDate;
	}

	public String getRecordWorker() {
		return this.recordWorker;
	}

	public void setRecordWorker(String recordWorker) {
		this.recordWorker = recordWorker;
	}

	public String getPicLink() {
		return this.picLink;
	}

	public void setPicLink(String picLink) {
		this.picLink = picLink;
	}

	public String getReportStatus() {
		return this.reportStatus;
	}

	public void setReportStatus(String reportStatus) {
		this.reportStatus = reportStatus;
	}

}