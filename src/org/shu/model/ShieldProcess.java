package org.shu.model;

/**
 * ShieldProcess entity. @author MyEclipse Persistence Tools
 */

public class ShieldProcess implements java.io.Serializable {

	// Fields

	private Integer id;
	private Integer tunnelLoop;
	private Integer proId;
	private String today;
	private String startTime;
	private String endTime;
	private String speed;
	private String shieldPushStrength;
	private String cutterTorque;
	private String cutterRotateSpeed;
	private String penetrationSpeed;
	private String blenderTorqueLr;
	private String jackStrokeStartAbcdef;
	private String jackStrokeEndAbcdef;
	private String jackOilStartAbcdef;
	private String jackOilEndAbcdef;
	private String bubbleSetValue;
	private String bubblePressureSme;
	private String bubbleLiduidSme;
	private String inFlowSme;
	private String outFlowSme;
	private String inDensitySme;
	private String outDensitySme;
	private String oilInjectionFmr;
	private String oilRemainFmr;
	private String oilUseFmr;
	private String oilTotalFmr;
	private String creator;
	private String createDate;
	private String memo;
	private Integer status;
	private String shift;
	private Integer isEast;

	// Constructors

	/** default constructor */
	public ShieldProcess() {
	}

	/** full constructor */
	public ShieldProcess(Integer tunnelLoop, Integer proId, String today,
			String startTime, String endTime, String speed,
			String shieldPushStrength, String cutterTorque,
			String cutterRotateSpeed, String penetrationSpeed,
			String blenderTorqueLr, String jackStrokeStartAbcdef,
			String jackStrokeEndAbcdef, String jackOilStartAbcdef,
			String jackOilEndAbcdef, String bubbleSetValue,
			String bubblePressureSme, String bubbleLiduidSme, String inFlowSme,
			String outFlowSme, String inDensitySme, String outDensitySme,
			String oilInjectionFmr, String oilRemainFmr, String oilUseFmr,
			String oilTotalFmr, String creator, String createDate, String memo,
			Integer status, String shift, Integer isEast) {
		this.tunnelLoop = tunnelLoop;
		this.proId = proId;
		this.today = today;
		this.startTime = startTime;
		this.endTime = endTime;
		this.speed = speed;
		this.shieldPushStrength = shieldPushStrength;
		this.cutterTorque = cutterTorque;
		this.cutterRotateSpeed = cutterRotateSpeed;
		this.penetrationSpeed = penetrationSpeed;
		this.blenderTorqueLr = blenderTorqueLr;
		this.jackStrokeStartAbcdef = jackStrokeStartAbcdef;
		this.jackStrokeEndAbcdef = jackStrokeEndAbcdef;
		this.jackOilStartAbcdef = jackOilStartAbcdef;
		this.jackOilEndAbcdef = jackOilEndAbcdef;
		this.bubbleSetValue = bubbleSetValue;
		this.bubblePressureSme = bubblePressureSme;
		this.bubbleLiduidSme = bubbleLiduidSme;
		this.inFlowSme = inFlowSme;
		this.outFlowSme = outFlowSme;
		this.inDensitySme = inDensitySme;
		this.outDensitySme = outDensitySme;
		this.oilInjectionFmr = oilInjectionFmr;
		this.oilRemainFmr = oilRemainFmr;
		this.oilUseFmr = oilUseFmr;
		this.oilTotalFmr = oilTotalFmr;
		this.creator = creator;
		this.createDate = createDate;
		this.memo = memo;
		this.status = status;
		this.shift = shift;
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

	public String getToday() {
		return this.today;
	}

	public void setToday(String today) {
		this.today = today;
	}

	public String getStartTime() {
		return this.startTime;
	}

	public void setStartTime(String startTime) {
		this.startTime = startTime;
	}

	public String getEndTime() {
		return this.endTime;
	}

	public void setEndTime(String endTime) {
		this.endTime = endTime;
	}

	public String getSpeed() {
		return this.speed;
	}

	public void setSpeed(String speed) {
		this.speed = speed;
	}

	public String getShieldPushStrength() {
		return this.shieldPushStrength;
	}

	public void setShieldPushStrength(String shieldPushStrength) {
		this.shieldPushStrength = shieldPushStrength;
	}

	public String getCutterTorque() {
		return this.cutterTorque;
	}

	public void setCutterTorque(String cutterTorque) {
		this.cutterTorque = cutterTorque;
	}

	public String getCutterRotateSpeed() {
		return this.cutterRotateSpeed;
	}

	public void setCutterRotateSpeed(String cutterRotateSpeed) {
		this.cutterRotateSpeed = cutterRotateSpeed;
	}

	public String getPenetrationSpeed() {
		return this.penetrationSpeed;
	}

	public void setPenetrationSpeed(String penetrationSpeed) {
		this.penetrationSpeed = penetrationSpeed;
	}

	public String getBlenderTorqueLr() {
		return this.blenderTorqueLr;
	}

	public void setBlenderTorqueLr(String blenderTorqueLr) {
		this.blenderTorqueLr = blenderTorqueLr;
	}

	public String getJackStrokeStartAbcdef() {
		return this.jackStrokeStartAbcdef;
	}

	public void setJackStrokeStartAbcdef(String jackStrokeStartAbcdef) {
		this.jackStrokeStartAbcdef = jackStrokeStartAbcdef;
	}

	public String getJackStrokeEndAbcdef() {
		return this.jackStrokeEndAbcdef;
	}

	public void setJackStrokeEndAbcdef(String jackStrokeEndAbcdef) {
		this.jackStrokeEndAbcdef = jackStrokeEndAbcdef;
	}

	public String getJackOilStartAbcdef() {
		return this.jackOilStartAbcdef;
	}

	public void setJackOilStartAbcdef(String jackOilStartAbcdef) {
		this.jackOilStartAbcdef = jackOilStartAbcdef;
	}

	public String getJackOilEndAbcdef() {
		return this.jackOilEndAbcdef;
	}

	public void setJackOilEndAbcdef(String jackOilEndAbcdef) {
		this.jackOilEndAbcdef = jackOilEndAbcdef;
	}

	public String getBubbleSetValue() {
		return this.bubbleSetValue;
	}

	public void setBubbleSetValue(String bubbleSetValue) {
		this.bubbleSetValue = bubbleSetValue;
	}

	public String getBubblePressureSme() {
		return this.bubblePressureSme;
	}

	public void setBubblePressureSme(String bubblePressureSme) {
		this.bubblePressureSme = bubblePressureSme;
	}

	public String getBubbleLiduidSme() {
		return this.bubbleLiduidSme;
	}

	public void setBubbleLiduidSme(String bubbleLiduidSme) {
		this.bubbleLiduidSme = bubbleLiduidSme;
	}

	public String getInFlowSme() {
		return this.inFlowSme;
	}

	public void setInFlowSme(String inFlowSme) {
		this.inFlowSme = inFlowSme;
	}

	public String getOutFlowSme() {
		return this.outFlowSme;
	}

	public void setOutFlowSme(String outFlowSme) {
		this.outFlowSme = outFlowSme;
	}

	public String getInDensitySme() {
		return this.inDensitySme;
	}

	public void setInDensitySme(String inDensitySme) {
		this.inDensitySme = inDensitySme;
	}

	public String getOutDensitySme() {
		return this.outDensitySme;
	}

	public void setOutDensitySme(String outDensitySme) {
		this.outDensitySme = outDensitySme;
	}

	public String getOilInjectionFmr() {
		return this.oilInjectionFmr;
	}

	public void setOilInjectionFmr(String oilInjectionFmr) {
		this.oilInjectionFmr = oilInjectionFmr;
	}

	public String getOilRemainFmr() {
		return this.oilRemainFmr;
	}

	public void setOilRemainFmr(String oilRemainFmr) {
		this.oilRemainFmr = oilRemainFmr;
	}

	public String getOilUseFmr() {
		return this.oilUseFmr;
	}

	public void setOilUseFmr(String oilUseFmr) {
		this.oilUseFmr = oilUseFmr;
	}

	public String getOilTotalFmr() {
		return this.oilTotalFmr;
	}

	public void setOilTotalFmr(String oilTotalFmr) {
		this.oilTotalFmr = oilTotalFmr;
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

	public String getShift() {
		return this.shift;
	}

	public void setShift(String shift) {
		this.shift = shift;
	}

	public Integer getIsEast() {
		return this.isEast;
	}

	public void setIsEast(Integer isEast) {
		this.isEast = isEast;
	}

}