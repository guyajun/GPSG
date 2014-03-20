package org.shu.model;

/**
 * BuildingInModelInfo entity. @author MyEclipse Persistence Tools
 */

public class BuildingInModelInfo implements java.io.Serializable {

	// Fields

	private Integer id;
	private String proId;
	private String buildingName;
	private String buildingNameInModel;
	private Integer ringNo;
	private String photoPath;
	private Integer isEast;

	// Constructors

	/** default constructor */
	public BuildingInModelInfo() {
	}

	/** full constructor */
	public BuildingInModelInfo(String proId, String buildingName,
			String buildingNameInModel, Integer ringNo, String photoPath,
			Integer isEast) {
		this.proId = proId;
		this.buildingName = buildingName;
		this.buildingNameInModel = buildingNameInModel;
		this.ringNo = ringNo;
		this.photoPath = photoPath;
		this.isEast = isEast;
	}

	// Property accessors

	public Integer getId() {
		return this.id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getProId() {
		return this.proId;
	}

	public void setProId(String proId) {
		this.proId = proId;
	}

	public String getBuildingName() {
		return this.buildingName;
	}

	public void setBuildingName(String buildingName) {
		this.buildingName = buildingName;
	}

	public String getBuildingNameInModel() {
		return this.buildingNameInModel;
	}

	public void setBuildingNameInModel(String buildingNameInModel) {
		this.buildingNameInModel = buildingNameInModel;
	}

	public Integer getRingNo() {
		return this.ringNo;
	}

	public void setRingNo(Integer ringNo) {
		this.ringNo = ringNo;
	}

	public String getPhotoPath() {
		return this.photoPath;
	}

	public void setPhotoPath(String photoPath) {
		this.photoPath = photoPath;
	}

	public Integer getIsEast() {
		return this.isEast;
	}

	public void setIsEast(Integer isEast) {
		this.isEast = isEast;
	}

}