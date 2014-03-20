package org.shu.model;

import java.sql.Timestamp;

/**
 * ShieldPose entity. @author MyEclipse Persistence Tools
 */

public class ShieldPose implements java.io.Serializable {

	// Fields

	private Integer id;
	private Integer tunnelLoop;
	private Integer proId;
	private String designLinear;
	private String designSlope;
	private String shieldSlope;
	private String rotateAngle;
	private String incisionMileage;
	private String shieldVerticalTwo;
	private String shieldPlaneTwo;
	private String gpVertical;
	private String gpPlane;
	private String shieldTailEight;
	private String gpMiliage;
	private String transverseDiameter;
	private String shaftDiameter;
	private String capBlockLocation;
	private String looker;
	private String checker;
	private Timestamp checkDate;
	private String memo;
	private Integer status;
	private String lastGap;
	private String lastHpd;
	private Integer isEast;

	// Constructors

	/** default constructor */
	public ShieldPose() {
	}

	/** full constructor */
	public ShieldPose(Integer tunnelLoop, Integer proId, String designLinear,
			String designSlope, String shieldSlope, String rotateAngle,
			String incisionMileage, String shieldVerticalTwo,
			String shieldPlaneTwo, String gpVertical, String gpPlane,
			String shieldTailEight, String gpMiliage,
			String transverseDiameter, String shaftDiameter,
			String capBlockLocation, String looker, String checker,
			Timestamp checkDate, String memo, Integer status, String lastGap,
			String lastHpd, Integer isEast) {
		this.tunnelLoop = tunnelLoop;
		this.proId = proId;
		this.designLinear = designLinear;
		this.designSlope = designSlope;
		this.shieldSlope = shieldSlope;
		this.rotateAngle = rotateAngle;
		this.incisionMileage = incisionMileage;
		this.shieldVerticalTwo = shieldVerticalTwo;
		this.shieldPlaneTwo = shieldPlaneTwo;
		this.gpVertical = gpVertical;
		this.gpPlane = gpPlane;
		this.shieldTailEight = shieldTailEight;
		this.gpMiliage = gpMiliage;
		this.transverseDiameter = transverseDiameter;
		this.shaftDiameter = shaftDiameter;
		this.capBlockLocation = capBlockLocation;
		this.looker = looker;
		this.checker = checker;
		this.checkDate = checkDate;
		this.memo = memo;
		this.status = status;
		this.lastGap = lastGap;
		this.lastHpd = lastHpd;
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

	public String getDesignLinear() {
		return this.designLinear;
	}

	public void setDesignLinear(String designLinear) {
		this.designLinear = designLinear;
	}

	public String getDesignSlope() {
		return this.designSlope;
	}

	public void setDesignSlope(String designSlope) {
		this.designSlope = designSlope;
	}

	public String getShieldSlope() {
		return this.shieldSlope;
	}

	public void setShieldSlope(String shieldSlope) {
		this.shieldSlope = shieldSlope;
	}

	public String getRotateAngle() {
		return this.rotateAngle;
	}

	public void setRotateAngle(String rotateAngle) {
		this.rotateAngle = rotateAngle;
	}

	public String getIncisionMileage() {
		return this.incisionMileage;
	}

	public void setIncisionMileage(String incisionMileage) {
		this.incisionMileage = incisionMileage;
	}

	public String getShieldVerticalTwo() {
		return this.shieldVerticalTwo;
	}

	public void setShieldVerticalTwo(String shieldVerticalTwo) {
		this.shieldVerticalTwo = shieldVerticalTwo;
	}

	public String getShieldPlaneTwo() {
		return this.shieldPlaneTwo;
	}

	public void setShieldPlaneTwo(String shieldPlaneTwo) {
		this.shieldPlaneTwo = shieldPlaneTwo;
	}

	public String getGpVertical() {
		return this.gpVertical;
	}

	public void setGpVertical(String gpVertical) {
		this.gpVertical = gpVertical;
	}

	public String getGpPlane() {
		return this.gpPlane;
	}

	public void setGpPlane(String gpPlane) {
		this.gpPlane = gpPlane;
	}

	public String getShieldTailEight() {
		return this.shieldTailEight;
	}

	public void setShieldTailEight(String shieldTailEight) {
		this.shieldTailEight = shieldTailEight;
	}

	public String getGpMiliage() {
		return this.gpMiliage;
	}

	public void setGpMiliage(String gpMiliage) {
		this.gpMiliage = gpMiliage;
	}

	public String getTransverseDiameter() {
		return this.transverseDiameter;
	}

	public void setTransverseDiameter(String transverseDiameter) {
		this.transverseDiameter = transverseDiameter;
	}

	public String getShaftDiameter() {
		return this.shaftDiameter;
	}

	public void setShaftDiameter(String shaftDiameter) {
		this.shaftDiameter = shaftDiameter;
	}

	public String getCapBlockLocation() {
		return this.capBlockLocation;
	}

	public void setCapBlockLocation(String capBlockLocation) {
		this.capBlockLocation = capBlockLocation;
	}

	public String getLooker() {
		return this.looker;
	}

	public void setLooker(String looker) {
		this.looker = looker;
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

	public String getMemo() {
		return this.memo;
	}

	public void setMemo(String memo) {
		this.memo = memo;
	}

	public Integer getStatus() {
		return this.status;
	}

	public void setStatus(Integer status) {
		this.status = status;
	}

	public String getLastGap() {
		return this.lastGap;
	}

	public void setLastGap(String lastGap) {
		this.lastGap = lastGap;
	}

	public String getLastHpd() {
		return this.lastHpd;
	}

	public void setLastHpd(String lastHpd) {
		this.lastHpd = lastHpd;
	}

	public Integer getIsEast() {
		return this.isEast;
	}

	public void setIsEast(Integer isEast) {
		this.isEast = isEast;
	}

}