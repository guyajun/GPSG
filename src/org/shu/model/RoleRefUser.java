package org.shu.model;

/**
 * RoleRefUser entity. @author MyEclipse Persistence Tools
 */

public class RoleRefUser implements java.io.Serializable {

	// Fields

	private Integer id;
	private UserInfo userInfo;
	private RoleInfo roleInfo;
	private String creator;
	private String createTime;

	// Constructors

	/** default constructor */
	public RoleRefUser() {
	}

	/** full constructor */
	public RoleRefUser(UserInfo userInfo, RoleInfo roleInfo, String creator,
			String createTime) {
		this.userInfo = userInfo;
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

	public UserInfo getUserInfo() {
		return this.userInfo;
	}

	public void setUserInfo(UserInfo userInfo) {
		this.userInfo = userInfo;
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