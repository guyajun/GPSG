package org.shu.model;

/**
 * BoltQuality entity. @author MyEclipse Persistence Tools
 */

public class BoltQuality implements java.io.Serializable {

	// Fields

	private Integer id;
	private String proId;
	private String url;

	// Constructors

	/** default constructor */
	public BoltQuality() {
	}

	/** full constructor */
	public BoltQuality(String proId, String url) {
		this.proId = proId;
		this.url = url;
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

	public String getUrl() {
		return this.url;
	}

	public void setUrl(String url) {
		this.url = url;
	}

}