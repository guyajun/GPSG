package org.shu.model;

/**
 * GpAlongsheshi entity. @author MyEclipse Persistence Tools
 */

public class GpAlongsheshi implements java.io.Serializable {

	// Fields

	private Integer ssIndx;
	private Integer proId;
	private Integer ssLoop;
	private String ssLicheng;
	private String ssDspt;
	private String ssType;
	private String ssYear;
	private String ssJiegou;
	private String ssYongtu;
	private String ssCyxs;
	private String ssBase;
	private String ssJdbg;
	private String ssZsjj;
	private Double ssCycj;
	private Double ssLqcj;
	private String ssRelcd;
	private Double ssQx;
	private Integer isEast;

	// Constructors

	/** default constructor */
	public GpAlongsheshi() {
	}

	/** full constructor */
	public GpAlongsheshi(Integer proId, Integer ssLoop, String ssLicheng,
			String ssDspt, String ssType, String ssYear, String ssJiegou,
			String ssYongtu, String ssCyxs, String ssBase, String ssJdbg,
			String ssZsjj, Double ssCycj, Double ssLqcj, String ssRelcd,
			Double ssQx, Integer isEast) {
		this.proId = proId;
		this.ssLoop = ssLoop;
		this.ssLicheng = ssLicheng;
		this.ssDspt = ssDspt;
		this.ssType = ssType;
		this.ssYear = ssYear;
		this.ssJiegou = ssJiegou;
		this.ssYongtu = ssYongtu;
		this.ssCyxs = ssCyxs;
		this.ssBase = ssBase;
		this.ssJdbg = ssJdbg;
		this.ssZsjj = ssZsjj;
		this.ssCycj = ssCycj;
		this.ssLqcj = ssLqcj;
		this.ssRelcd = ssRelcd;
		this.ssQx = ssQx;
		this.isEast = isEast;
	}

	// Property accessors

	public Integer getSsIndx() {
		return this.ssIndx;
	}

	public void setSsIndx(Integer ssIndx) {
		this.ssIndx = ssIndx;
	}

	public Integer getProId() {
		return this.proId;
	}

	public void setProId(Integer proId) {
		this.proId = proId;
	}

	public Integer getSsLoop() {
		return this.ssLoop;
	}

	public void setSsLoop(Integer ssLoop) {
		this.ssLoop = ssLoop;
	}

	public String getSsLicheng() {
		return this.ssLicheng;
	}

	public void setSsLicheng(String ssLicheng) {
		this.ssLicheng = ssLicheng;
	}

	public String getSsDspt() {
		return this.ssDspt;
	}

	public void setSsDspt(String ssDspt) {
		this.ssDspt = ssDspt;
	}

	public String getSsType() {
		return this.ssType;
	}

	public void setSsType(String ssType) {
		this.ssType = ssType;
	}

	public String getSsYear() {
		return this.ssYear;
	}

	public void setSsYear(String ssYear) {
		this.ssYear = ssYear;
	}

	public String getSsJiegou() {
		return this.ssJiegou;
	}

	public void setSsJiegou(String ssJiegou) {
		this.ssJiegou = ssJiegou;
	}

	public String getSsYongtu() {
		return this.ssYongtu;
	}

	public void setSsYongtu(String ssYongtu) {
		this.ssYongtu = ssYongtu;
	}

	public String getSsCyxs() {
		return this.ssCyxs;
	}

	public void setSsCyxs(String ssCyxs) {
		this.ssCyxs = ssCyxs;
	}

	public String getSsBase() {
		return this.ssBase;
	}

	public void setSsBase(String ssBase) {
		this.ssBase = ssBase;
	}

	public String getSsJdbg() {
		return this.ssJdbg;
	}

	public void setSsJdbg(String ssJdbg) {
		this.ssJdbg = ssJdbg;
	}

	public String getSsZsjj() {
		return this.ssZsjj;
	}

	public void setSsZsjj(String ssZsjj) {
		this.ssZsjj = ssZsjj;
	}

	public Double getSsCycj() {
		return this.ssCycj;
	}

	public void setSsCycj(Double ssCycj) {
		this.ssCycj = ssCycj;
	}

	public Double getSsLqcj() {
		return this.ssLqcj;
	}

	public void setSsLqcj(Double ssLqcj) {
		this.ssLqcj = ssLqcj;
	}

	public String getSsRelcd() {
		return this.ssRelcd;
	}

	public void setSsRelcd(String ssRelcd) {
		this.ssRelcd = ssRelcd;
	}

	public Double getSsQx() {
		return this.ssQx;
	}

	public void setSsQx(Double ssQx) {
		this.ssQx = ssQx;
	}

	public Integer getIsEast() {
		return this.isEast;
	}

	public void setIsEast(Integer isEast) {
		this.isEast = isEast;
	}

}