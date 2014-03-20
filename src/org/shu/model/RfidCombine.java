package org.shu.model;

import java.sql.Timestamp;

/**
 * RfidCombine entity. @author MyEclipse Persistence Tools
 */

public class RfidCombine implements java.io.Serializable {

	// Fields

	private Integer id;
	private Integer tunnelLoop;
	private Integer proId;
	private String tid;
	private String coverId;
	private String code;
	private String circlelist;
	private String rfidLoc;
	private String creator;
	private Timestamp createDate;
	private String downTid;
	private String downCode;
	private String downCreator;
	private Timestamp downCreatdate;

	// Constructors

	/** default constructor */
	public RfidCombine() {
	}

	/** full constructor */
	public RfidCombine(Integer tunnelLoop, Integer proId, String tid,
			String coverId, String code, String circlelist, String rfidLoc,
			String creator, Timestamp createDate, String downTid,
			String downCode, String downCreator, Timestamp downCreatdate) {
		this.tunnelLoop = tunnelLoop;
		this.proId = proId;
		this.tid = tid;
		this.coverId = coverId;
		this.code = code;
		this.circlelist = circlelist;
		this.rfidLoc = rfidLoc;
		this.creator = creator;
		this.createDate = createDate;
		this.downTid = downTid;
		this.downCode = downCode;
		this.downCreator = downCreator;
		this.downCreatdate = downCreatdate;
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

	public String getTid() {
		return this.tid;
	}

	public void setTid(String tid) {
		this.tid = tid;
	}

	public String getCoverId() {
		return this.coverId;
	}

	public void setCoverId(String coverId) {
		this.coverId = coverId;
	}

	public String getCode() {
		return this.code;
	}

	public void setCode(String code) {
		this.code = code;
	}

	public String getCirclelist() {
		return this.circlelist;
	}

	public void setCirclelist(String circlelist) {
		this.circlelist = circlelist;
	}

	public String getRfidLoc() {
		return this.rfidLoc;
	}

	public void setRfidLoc(String rfidLoc) {
		this.rfidLoc = rfidLoc;
	}

	public String getCreator() {
		return this.creator;
	}

	public void setCreator(String creator) {
		this.creator = creator;
	}

	public Timestamp getCreateDate() {
		return this.createDate;
	}

	public void setCreateDate(Timestamp createDate) {
		this.createDate = createDate;
	}

	public String getDownTid() {
		return this.downTid;
	}

	public void setDownTid(String downTid) {
		this.downTid = downTid;
	}

	public String getDownCode() {
		return this.downCode;
	}

	public void setDownCode(String downCode) {
		this.downCode = downCode;
	}

	public String getDownCreator() {
		return this.downCreator;
	}

	public void setDownCreator(String downCreator) {
		this.downCreator = downCreator;
	}

	public Timestamp getDownCreatdate() {
		return this.downCreatdate;
	}

	public void setDownCreatdate(Timestamp downCreatdate) {
		this.downCreatdate = downCreatdate;
	}

}