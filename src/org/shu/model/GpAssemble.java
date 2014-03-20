package org.shu.model;

import java.sql.Timestamp;

/**
 * GpAssemble entity. @author MyEclipse Persistence Tools
 */

public class GpAssemble implements java.io.Serializable {

	// Fields

	private Integer id;
	private String reportId;
	private Integer proId;
	private Integer startNum;
	private Integer endNum;
	private Timestamp produceDate;
	private String protaitInner;
	private String protaitOuter;
	private Integer protaitInnerCount;
	private Integer innerQualified;
	private String innerRatio;
	private Integer protaitOuterCount;
	private Integer outerQualified;
	private String outerRatio;
	private String protaitTotalRatio;
	private String loopInner;
	private String loopOuter;
	private Integer loopInnerCount;
	private Integer loopInnerCountQua;
	private String loopInnerRatio;
	private Integer loopOuterCount;
	private Integer loopOuterCountQua;
	private String loopOutRatio;
	private String loopTotalRatio;
	private String foundationLoop;
	private String secondLoop;
	private Integer foundationCount;
	private Integer foundationCountQua;
	private String foundationRatio;
	private Integer secondCount;
	private Integer secondCountQua;
	private String secondCountRatio;
	private String highLowTotalratio;
	private String inFundLoop;
	private String inSecLoop;
	private String outFundLoop;
	private String outSecLoop;
	private String allowDeviation;
	private String memo;
	private String qualifiedRate;
	private String inspector;
	private String supervisor;
	private Timestamp checkTime;
	private Integer status;
	private String url1;
	private String url2;

	// Constructors

	/** default constructor */
	public GpAssemble() {
	}

	/** full constructor */
	public GpAssemble(String reportId, Integer proId, Integer startNum,
			Integer endNum, Timestamp produceDate, String protaitInner,
			String protaitOuter, Integer protaitInnerCount,
			Integer innerQualified, String innerRatio,
			Integer protaitOuterCount, Integer outerQualified,
			String outerRatio, String protaitTotalRatio, String loopInner,
			String loopOuter, Integer loopInnerCount,
			Integer loopInnerCountQua, String loopInnerRatio,
			Integer loopOuterCount, Integer loopOuterCountQua,
			String loopOutRatio, String loopTotalRatio, String foundationLoop,
			String secondLoop, Integer foundationCount,
			Integer foundationCountQua, String foundationRatio,
			Integer secondCount, Integer secondCountQua,
			String secondCountRatio, String highLowTotalratio,
			String inFundLoop, String inSecLoop, String outFundLoop,
			String outSecLoop, String allowDeviation, String memo,
			String qualifiedRate, String inspector, String supervisor,
			Timestamp checkTime, Integer status, String url1, String url2) {
		this.reportId = reportId;
		this.proId = proId;
		this.startNum = startNum;
		this.endNum = endNum;
		this.produceDate = produceDate;
		this.protaitInner = protaitInner;
		this.protaitOuter = protaitOuter;
		this.protaitInnerCount = protaitInnerCount;
		this.innerQualified = innerQualified;
		this.innerRatio = innerRatio;
		this.protaitOuterCount = protaitOuterCount;
		this.outerQualified = outerQualified;
		this.outerRatio = outerRatio;
		this.protaitTotalRatio = protaitTotalRatio;
		this.loopInner = loopInner;
		this.loopOuter = loopOuter;
		this.loopInnerCount = loopInnerCount;
		this.loopInnerCountQua = loopInnerCountQua;
		this.loopInnerRatio = loopInnerRatio;
		this.loopOuterCount = loopOuterCount;
		this.loopOuterCountQua = loopOuterCountQua;
		this.loopOutRatio = loopOutRatio;
		this.loopTotalRatio = loopTotalRatio;
		this.foundationLoop = foundationLoop;
		this.secondLoop = secondLoop;
		this.foundationCount = foundationCount;
		this.foundationCountQua = foundationCountQua;
		this.foundationRatio = foundationRatio;
		this.secondCount = secondCount;
		this.secondCountQua = secondCountQua;
		this.secondCountRatio = secondCountRatio;
		this.highLowTotalratio = highLowTotalratio;
		this.inFundLoop = inFundLoop;
		this.inSecLoop = inSecLoop;
		this.outFundLoop = outFundLoop;
		this.outSecLoop = outSecLoop;
		this.allowDeviation = allowDeviation;
		this.memo = memo;
		this.qualifiedRate = qualifiedRate;
		this.inspector = inspector;
		this.supervisor = supervisor;
		this.checkTime = checkTime;
		this.status = status;
		this.url1 = url1;
		this.url2 = url2;
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

	public String getProtaitInner() {
		return this.protaitInner;
	}

	public void setProtaitInner(String protaitInner) {
		this.protaitInner = protaitInner;
	}

	public String getProtaitOuter() {
		return this.protaitOuter;
	}

	public void setProtaitOuter(String protaitOuter) {
		this.protaitOuter = protaitOuter;
	}

	public Integer getProtaitInnerCount() {
		return this.protaitInnerCount;
	}

	public void setProtaitInnerCount(Integer protaitInnerCount) {
		this.protaitInnerCount = protaitInnerCount;
	}

	public Integer getInnerQualified() {
		return this.innerQualified;
	}

	public void setInnerQualified(Integer innerQualified) {
		this.innerQualified = innerQualified;
	}

	public String getInnerRatio() {
		return this.innerRatio;
	}

	public void setInnerRatio(String innerRatio) {
		this.innerRatio = innerRatio;
	}

	public Integer getProtaitOuterCount() {
		return this.protaitOuterCount;
	}

	public void setProtaitOuterCount(Integer protaitOuterCount) {
		this.protaitOuterCount = protaitOuterCount;
	}

	public Integer getOuterQualified() {
		return this.outerQualified;
	}

	public void setOuterQualified(Integer outerQualified) {
		this.outerQualified = outerQualified;
	}

	public String getOuterRatio() {
		return this.outerRatio;
	}

	public void setOuterRatio(String outerRatio) {
		this.outerRatio = outerRatio;
	}

	public String getProtaitTotalRatio() {
		return this.protaitTotalRatio;
	}

	public void setProtaitTotalRatio(String protaitTotalRatio) {
		this.protaitTotalRatio = protaitTotalRatio;
	}

	public String getLoopInner() {
		return this.loopInner;
	}

	public void setLoopInner(String loopInner) {
		this.loopInner = loopInner;
	}

	public String getLoopOuter() {
		return this.loopOuter;
	}

	public void setLoopOuter(String loopOuter) {
		this.loopOuter = loopOuter;
	}

	public Integer getLoopInnerCount() {
		return this.loopInnerCount;
	}

	public void setLoopInnerCount(Integer loopInnerCount) {
		this.loopInnerCount = loopInnerCount;
	}

	public Integer getLoopInnerCountQua() {
		return this.loopInnerCountQua;
	}

	public void setLoopInnerCountQua(Integer loopInnerCountQua) {
		this.loopInnerCountQua = loopInnerCountQua;
	}

	public String getLoopInnerRatio() {
		return this.loopInnerRatio;
	}

	public void setLoopInnerRatio(String loopInnerRatio) {
		this.loopInnerRatio = loopInnerRatio;
	}

	public Integer getLoopOuterCount() {
		return this.loopOuterCount;
	}

	public void setLoopOuterCount(Integer loopOuterCount) {
		this.loopOuterCount = loopOuterCount;
	}

	public Integer getLoopOuterCountQua() {
		return this.loopOuterCountQua;
	}

	public void setLoopOuterCountQua(Integer loopOuterCountQua) {
		this.loopOuterCountQua = loopOuterCountQua;
	}

	public String getLoopOutRatio() {
		return this.loopOutRatio;
	}

	public void setLoopOutRatio(String loopOutRatio) {
		this.loopOutRatio = loopOutRatio;
	}

	public String getLoopTotalRatio() {
		return this.loopTotalRatio;
	}

	public void setLoopTotalRatio(String loopTotalRatio) {
		this.loopTotalRatio = loopTotalRatio;
	}

	public String getFoundationLoop() {
		return this.foundationLoop;
	}

	public void setFoundationLoop(String foundationLoop) {
		this.foundationLoop = foundationLoop;
	}

	public String getSecondLoop() {
		return this.secondLoop;
	}

	public void setSecondLoop(String secondLoop) {
		this.secondLoop = secondLoop;
	}

	public Integer getFoundationCount() {
		return this.foundationCount;
	}

	public void setFoundationCount(Integer foundationCount) {
		this.foundationCount = foundationCount;
	}

	public Integer getFoundationCountQua() {
		return this.foundationCountQua;
	}

	public void setFoundationCountQua(Integer foundationCountQua) {
		this.foundationCountQua = foundationCountQua;
	}

	public String getFoundationRatio() {
		return this.foundationRatio;
	}

	public void setFoundationRatio(String foundationRatio) {
		this.foundationRatio = foundationRatio;
	}

	public Integer getSecondCount() {
		return this.secondCount;
	}

	public void setSecondCount(Integer secondCount) {
		this.secondCount = secondCount;
	}

	public Integer getSecondCountQua() {
		return this.secondCountQua;
	}

	public void setSecondCountQua(Integer secondCountQua) {
		this.secondCountQua = secondCountQua;
	}

	public String getSecondCountRatio() {
		return this.secondCountRatio;
	}

	public void setSecondCountRatio(String secondCountRatio) {
		this.secondCountRatio = secondCountRatio;
	}

	public String getHighLowTotalratio() {
		return this.highLowTotalratio;
	}

	public void setHighLowTotalratio(String highLowTotalratio) {
		this.highLowTotalratio = highLowTotalratio;
	}

	public String getInFundLoop() {
		return this.inFundLoop;
	}

	public void setInFundLoop(String inFundLoop) {
		this.inFundLoop = inFundLoop;
	}

	public String getInSecLoop() {
		return this.inSecLoop;
	}

	public void setInSecLoop(String inSecLoop) {
		this.inSecLoop = inSecLoop;
	}

	public String getOutFundLoop() {
		return this.outFundLoop;
	}

	public void setOutFundLoop(String outFundLoop) {
		this.outFundLoop = outFundLoop;
	}

	public String getOutSecLoop() {
		return this.outSecLoop;
	}

	public void setOutSecLoop(String outSecLoop) {
		this.outSecLoop = outSecLoop;
	}

	public String getAllowDeviation() {
		return this.allowDeviation;
	}

	public void setAllowDeviation(String allowDeviation) {
		this.allowDeviation = allowDeviation;
	}

	public String getMemo() {
		return this.memo;
	}

	public void setMemo(String memo) {
		this.memo = memo;
	}

	public String getQualifiedRate() {
		return this.qualifiedRate;
	}

	public void setQualifiedRate(String qualifiedRate) {
		this.qualifiedRate = qualifiedRate;
	}

	public String getInspector() {
		return this.inspector;
	}

	public void setInspector(String inspector) {
		this.inspector = inspector;
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

	public Integer getStatus() {
		return this.status;
	}

	public void setStatus(Integer status) {
		this.status = status;
	}

	public String getUrl1() {
		return this.url1;
	}

	public void setUrl1(String url1) {
		this.url1 = url1;
	}

	public String getUrl2() {
		return this.url2;
	}

	public void setUrl2(String url2) {
		this.url2 = url2;
	}

}