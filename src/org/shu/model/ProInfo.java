package org.shu.model;

import java.sql.Timestamp;
import java.util.HashSet;
import java.util.Set;

/**
 * ProInfo entity. @author MyEclipse Persistence Tools
 */

public class ProInfo implements java.io.Serializable {

	// Fields

	private Integer id;
	private String proCode;
	private String proName;
	private String proType;
	private Integer gpCount;
	private String startGpId;
	private String endGpId;
	private Double gkTltp;
	private Double gkTllg;
	private Double gkIndm;
	private Double gkOtdm;
	private String gkSdtp;
	private Double gkSddm;
	private Double gkSdlg;
	private Integer gkStrg;
	private String gkStdt;
	private String gkLayer;
	private String gkAxspic1;
	private String gkAxspic2;
	private String gkPzxs;
	private String gkXt;
	private String gkCst;
	private String gkSpt;
	private String gkBld;
	private String gkCstmg;
	private String gkSptmg;
	private String gkBldmg;
	private String description;
	private String ringWidth;
	private String proStatus;
	private String produceUnit;
	private Timestamp completeTime;
	private String memo;
	private Integer isEast;
	private Set concRcvds = new HashSet(0);

	// Constructors

	/** default constructor */
	public ProInfo() {
	}

	/** full constructor */
	public ProInfo(String proCode, String proName, String proType,
			Integer gpCount, String startGpId, String endGpId, Double gkTltp,
			Double gkTllg, Double gkIndm, Double gkOtdm, String gkSdtp,
			Double gkSddm, Double gkSdlg, Integer gkStrg, String gkStdt,
			String gkLayer, String gkAxspic1, String gkAxspic2, String gkPzxs,
			String gkXt, String gkCst, String gkSpt, String gkBld,
			String gkCstmg, String gkSptmg, String gkBldmg, String description,
			String ringWidth, String proStatus, String produceUnit,
			Timestamp completeTime, String memo, Integer isEast, Set concRcvds) {
		this.proCode = proCode;
		this.proName = proName;
		this.proType = proType;
		this.gpCount = gpCount;
		this.startGpId = startGpId;
		this.endGpId = endGpId;
		this.gkTltp = gkTltp;
		this.gkTllg = gkTllg;
		this.gkIndm = gkIndm;
		this.gkOtdm = gkOtdm;
		this.gkSdtp = gkSdtp;
		this.gkSddm = gkSddm;
		this.gkSdlg = gkSdlg;
		this.gkStrg = gkStrg;
		this.gkStdt = gkStdt;
		this.gkLayer = gkLayer;
		this.gkAxspic1 = gkAxspic1;
		this.gkAxspic2 = gkAxspic2;
		this.gkPzxs = gkPzxs;
		this.gkXt = gkXt;
		this.gkCst = gkCst;
		this.gkSpt = gkSpt;
		this.gkBld = gkBld;
		this.gkCstmg = gkCstmg;
		this.gkSptmg = gkSptmg;
		this.gkBldmg = gkBldmg;
		this.description = description;
		this.ringWidth = ringWidth;
		this.proStatus = proStatus;
		this.produceUnit = produceUnit;
		this.completeTime = completeTime;
		this.memo = memo;
		this.isEast = isEast;
		this.concRcvds = concRcvds;
	}

	// Property accessors

	public Integer getId() {
		return this.id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getProCode() {
		return this.proCode;
	}

	public void setProCode(String proCode) {
		this.proCode = proCode;
	}

	public String getProName() {
		return this.proName;
	}

	public void setProName(String proName) {
		this.proName = proName;
	}

	public String getProType() {
		return this.proType;
	}

	public void setProType(String proType) {
		this.proType = proType;
	}

	public Integer getGpCount() {
		return this.gpCount;
	}

	public void setGpCount(Integer gpCount) {
		this.gpCount = gpCount;
	}

	public String getStartGpId() {
		return this.startGpId;
	}

	public void setStartGpId(String startGpId) {
		this.startGpId = startGpId;
	}

	public String getEndGpId() {
		return this.endGpId;
	}

	public void setEndGpId(String endGpId) {
		this.endGpId = endGpId;
	}

	public Double getGkTltp() {
		return this.gkTltp;
	}

	public void setGkTltp(Double gkTltp) {
		this.gkTltp = gkTltp;
	}

	public Double getGkTllg() {
		return this.gkTllg;
	}

	public void setGkTllg(Double gkTllg) {
		this.gkTllg = gkTllg;
	}

	public Double getGkIndm() {
		return this.gkIndm;
	}

	public void setGkIndm(Double gkIndm) {
		this.gkIndm = gkIndm;
	}

	public Double getGkOtdm() {
		return this.gkOtdm;
	}

	public void setGkOtdm(Double gkOtdm) {
		this.gkOtdm = gkOtdm;
	}

	public String getGkSdtp() {
		return this.gkSdtp;
	}

	public void setGkSdtp(String gkSdtp) {
		this.gkSdtp = gkSdtp;
	}

	public Double getGkSddm() {
		return this.gkSddm;
	}

	public void setGkSddm(Double gkSddm) {
		this.gkSddm = gkSddm;
	}

	public Double getGkSdlg() {
		return this.gkSdlg;
	}

	public void setGkSdlg(Double gkSdlg) {
		this.gkSdlg = gkSdlg;
	}

	public Integer getGkStrg() {
		return this.gkStrg;
	}

	public void setGkStrg(Integer gkStrg) {
		this.gkStrg = gkStrg;
	}

	public String getGkStdt() {
		return this.gkStdt;
	}

	public void setGkStdt(String gkStdt) {
		this.gkStdt = gkStdt;
	}

	public String getGkLayer() {
		return this.gkLayer;
	}

	public void setGkLayer(String gkLayer) {
		this.gkLayer = gkLayer;
	}

	public String getGkAxspic1() {
		return this.gkAxspic1;
	}

	public void setGkAxspic1(String gkAxspic1) {
		this.gkAxspic1 = gkAxspic1;
	}

	public String getGkAxspic2() {
		return this.gkAxspic2;
	}

	public void setGkAxspic2(String gkAxspic2) {
		this.gkAxspic2 = gkAxspic2;
	}

	public String getGkPzxs() {
		return this.gkPzxs;
	}

	public void setGkPzxs(String gkPzxs) {
		this.gkPzxs = gkPzxs;
	}

	public String getGkXt() {
		return this.gkXt;
	}

	public void setGkXt(String gkXt) {
		this.gkXt = gkXt;
	}

	public String getGkCst() {
		return this.gkCst;
	}

	public void setGkCst(String gkCst) {
		this.gkCst = gkCst;
	}

	public String getGkSpt() {
		return this.gkSpt;
	}

	public void setGkSpt(String gkSpt) {
		this.gkSpt = gkSpt;
	}

	public String getGkBld() {
		return this.gkBld;
	}

	public void setGkBld(String gkBld) {
		this.gkBld = gkBld;
	}

	public String getGkCstmg() {
		return this.gkCstmg;
	}

	public void setGkCstmg(String gkCstmg) {
		this.gkCstmg = gkCstmg;
	}

	public String getGkSptmg() {
		return this.gkSptmg;
	}

	public void setGkSptmg(String gkSptmg) {
		this.gkSptmg = gkSptmg;
	}

	public String getGkBldmg() {
		return this.gkBldmg;
	}

	public void setGkBldmg(String gkBldmg) {
		this.gkBldmg = gkBldmg;
	}

	public String getDescription() {
		return this.description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public String getRingWidth() {
		return this.ringWidth;
	}

	public void setRingWidth(String ringWidth) {
		this.ringWidth = ringWidth;
	}

	public String getProStatus() {
		return this.proStatus;
	}

	public void setProStatus(String proStatus) {
		this.proStatus = proStatus;
	}

	public String getProduceUnit() {
		return this.produceUnit;
	}

	public void setProduceUnit(String produceUnit) {
		this.produceUnit = produceUnit;
	}

	public Timestamp getCompleteTime() {
		return this.completeTime;
	}

	public void setCompleteTime(Timestamp completeTime) {
		this.completeTime = completeTime;
	}

	public String getMemo() {
		return this.memo;
	}

	public void setMemo(String memo) {
		this.memo = memo;
	}

	public Integer getIsEast() {
		return this.isEast;
	}

	public void setIsEast(Integer isEast) {
		this.isEast = isEast;
	}

	public Set getConcRcvds() {
		return this.concRcvds;
	}

	public void setConcRcvds(Set concRcvds) {
		this.concRcvds = concRcvds;
	}

}