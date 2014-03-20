package org.shu.model;

/**
 * GpStorage entity. @author MyEclipse Persistence Tools
 */

public class GpStorage implements java.io.Serializable {

	// Fields

	private Integer id;
	private String coverId;
	private String storageArea;
	private String storageDate;

	// Constructors

	/** default constructor */
	public GpStorage() {
	}

	/** full constructor */
	public GpStorage(String coverId, String storageArea, String storageDate) {
		this.coverId = coverId;
		this.storageArea = storageArea;
		this.storageDate = storageDate;
	}

	// Property accessors

	public Integer getId() {
		return this.id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getCoverId() {
		return this.coverId;
	}

	public void setCoverId(String coverId) {
		this.coverId = coverId;
	}

	public String getStorageArea() {
		return this.storageArea;
	}

	public void setStorageArea(String storageArea) {
		this.storageArea = storageArea;
	}

	public String getStorageDate() {
		return this.storageDate;
	}

	public void setStorageDate(String storageDate) {
		this.storageDate = storageDate;
	}

}