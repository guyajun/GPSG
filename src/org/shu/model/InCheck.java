package org.shu.model;

/**
 * InCheck entity. @author MyEclipse Persistence Tools
 */

public class InCheck implements java.io.Serializable {

	// Fields

	private Integer id;
	private String produceLoop;
	private String condition;
	private String photo;
	private String result;
	private String creator;
	private String createDate;
	private Integer status;
	private Integer isEast;

	// Constructors

	/** default constructor */
	public InCheck() {
	}

	/** full constructor */
	public InCheck(String produceLoop, String condition, String photo,
			String result, String creator, String createDate, Integer status,
			Integer isEast) {
		this.produceLoop = produceLoop;
		this.condition = condition;
		this.photo = photo;
		this.result = result;
		this.creator = creator;
		this.createDate = createDate;
		this.status = status;
		this.isEast = isEast;
	}

	// Property accessors

	public Integer getId() {
		return this.id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getProduceLoop() {
		return this.produceLoop;
	}

	public void setProduceLoop(String produceLoop) {
		this.produceLoop = produceLoop;
	}

	public String getCondition() {
		return this.condition;
	}

	public void setCondition(String condition) {
		this.condition = condition;
	}

	public String getPhoto() {
		return this.photo;
	}

	public void setPhoto(String photo) {
		this.photo = photo;
	}

	public String getResult() {
		return this.result;
	}

	public void setResult(String result) {
		this.result = result;
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

	public Integer getStatus() {
		return this.status;
	}

	public void setStatus(Integer status) {
		this.status = status;
	}

	public Integer getIsEast() {
		return this.isEast;
	}

	public void setIsEast(Integer isEast) {
		this.isEast = isEast;
	}

}