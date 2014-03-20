package org.shu.model;

/**
 * LogInfo entity. @author MyEclipse Persistence Tools
 */

public class LogInfo implements java.io.Serializable {

	// Fields

	private Integer id;
	private String description;
	private String className;
	private String classMethod;
	private String creator;
	private String createTime;

	// Constructors

	/** default constructor */
	public LogInfo() {
	}

	/** full constructor */
	public LogInfo(String description, String className, String classMethod,
			String creator, String createTime) {
		this.description = description;
		this.className = className;
		this.classMethod = classMethod;
		this.creator = creator;
		this.createTime = createTime;
	}

	// Property accessors

	public Integer getId() {
		return this.id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getDescription() {
		return this.description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public String getClassName() {
		return this.className;
	}

	public void setClassName(String className) {
		this.className = className;
	}

	public String getClassMethod() {
		return this.classMethod;
	}

	public void setClassMethod(String classMethod) {
		this.classMethod = classMethod;
	}

	public String getCreator() {
		return this.creator;
	}

	public void setCreator(String creator) {
		this.creator = creator;
	}

	public String getCreateTime() {
		return this.createTime;
	}

	public void setCreateTime(String createTime) {
		this.createTime = createTime;
	}

}