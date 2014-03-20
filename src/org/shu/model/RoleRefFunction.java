package org.shu.model;

/**
 * RoleRefFunction entity. @author MyEclipse Persistence Tools
 */

public class RoleRefFunction implements java.io.Serializable {

	// Fields

	private Integer id;
	private FunctionInfo functionInfo;
	private RoleInfo roleInfo;
	private String creator;
	private String createTime;

	// Constructors

	/** default constructor */
	public RoleRefFunction() {
	}

	/** full constructor */
	public RoleRefFunction(FunctionInfo functionInfo, RoleInfo roleInfo,
			String creator, String createTime) {
		this.functionInfo = functionInfo;
		this.roleInfo = roleInfo;
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

	public FunctionInfo getFunctionInfo() {
		return this.functionInfo;
	}

	public void setFunctionInfo(FunctionInfo functionInfo) {
		this.functionInfo = functionInfo;
	}

	public RoleInfo getRoleInfo() {
		return this.roleInfo;
	}

	public void setRoleInfo(RoleInfo roleInfo) {
		this.roleInfo = roleInfo;
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