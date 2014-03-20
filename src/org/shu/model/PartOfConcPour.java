package org.shu.model;

/**
 * PartOfConcPour entity. @author MyEclipse Persistence Tools
 */

public class PartOfConcPour implements java.io.Serializable {

	// Fields

	private Integer id;
	private String reportId;
	private String proId;
	private Integer startNum;
	private Integer endNum;
	private String materialName;
	private String standardProduce;
	private String usePerMeter;
	private String usePerPlate;
	private String materialWater;
	private String realUse;

	// Constructors

	/** default constructor */
	public PartOfConcPour() {
	}

	/** full constructor */
	public PartOfConcPour(String reportId, String proId, Integer startNum,
			Integer endNum, String materialName, String standardProduce,
			String usePerMeter, String usePerPlate, String materialWater,
			String realUse) {
		this.reportId = reportId;
		this.proId = proId;
		this.startNum = startNum;
		this.endNum = endNum;
		this.materialName = materialName;
		this.standardProduce = standardProduce;
		this.usePerMeter = usePerMeter;
		this.usePerPlate = usePerPlate;
		this.materialWater = materialWater;
		this.realUse = realUse;
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

	public String getProId() {
		return this.proId;
	}

	public void setProId(String proId) {
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

	public String getMaterialName() {
		return this.materialName;
	}

	public void setMaterialName(String materialName) {
		this.materialName = materialName;
	}

	public String getStandardProduce() {
		return this.standardProduce;
	}

	public void setStandardProduce(String standardProduce) {
		this.standardProduce = standardProduce;
	}

	public String getUsePerMeter() {
		return this.usePerMeter;
	}

	public void setUsePerMeter(String usePerMeter) {
		this.usePerMeter = usePerMeter;
	}

	public String getUsePerPlate() {
		return this.usePerPlate;
	}

	public void setUsePerPlate(String usePerPlate) {
		this.usePerPlate = usePerPlate;
	}

	public String getMaterialWater() {
		return this.materialWater;
	}

	public void setMaterialWater(String materialWater) {
		this.materialWater = materialWater;
	}

	public String getRealUse() {
		return this.realUse;
	}

	public void setRealUse(String realUse) {
		this.realUse = realUse;
	}

}