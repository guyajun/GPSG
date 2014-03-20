package org.shu.model;

import java.sql.Timestamp;
import java.util.HashSet;
import java.util.Set;

/**
 * RoleInfo entity. @author MyEclipse Persistence Tools
 */

public class RoleInfo implements java.io.Serializable {

	// Fields

	private Integer id;
	private String roleName;
	private String roleDescription;
	private String creator;
	private Timestamp createTime;
	private String modifier;
	private Timestamp modifyTime;
	private Set roleRefUsers = new HashSet(0);
	private Set roleRefFunctions = new HashSet(0);
	private Set userInfos = new HashSet(0);

	// Constructors

	/** default constructor */
	public RoleInfo() {
	}

	/** full constructor */
	public RoleInfo(String roleName, String roleDescription, String creator,
			Timestamp createTime, String modifier, Timestamp modifyTime,
			Set roleRefUsers, Set roleRefFunctions, Set userInfos) {
		this.roleName = roleName;
		this.roleDescription = roleDescription;
		this.creator = creator;
		this.createTime = createTime;
		this.modifier = modifier;
		this.modifyTime = modifyTime;
		this.roleRefUsers = roleRefUsers;
		this.roleRefFunctions = roleRefFunctions;
		this.userInfos = userInfos;
	}

	// Property accessors

	public Integer getId() {
		return this.id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getRoleName() {
		return this.roleName;
	}

	public void setRoleName(String roleName) {
		this.roleName = roleName;
	}

	public String getRoleDescription() {
		return this.roleDescription;
	}

	public void setRoleDescription(String roleDescription) {
		this.roleDescription = roleDescription;
	}

	public String getCreator() {
		return this.creator;
	}

	public void setCreator(String creator) {
		this.creator = creator;
	}

	public Timestamp getCreateTime() {
		return this.createTime;
	}

	public void setCreateTime(Timestamp createTime) {
		this.createTime = createTime;
	}

	public String getModifier() {
		return this.modifier;
	}

	public void setModifier(String modifier) {
		this.modifier = modifier;
	}

	public Timestamp getModifyTime() {
		return this.modifyTime;
	}

	public void setModifyTime(Timestamp modifyTime) {
		this.modifyTime = modifyTime;
	}

	public Set getRoleRefUsers() {
		return this.roleRefUsers;
	}

	public void setRoleRefUsers(Set roleRefUsers) {
		this.roleRefUsers = roleRefUsers;
	}

	public Set getRoleRefFunctions() {
		return this.roleRefFunctions;
	}

	public void setRoleRefFunctions(Set roleRefFunctions) {
		this.roleRefFunctions = roleRefFunctions;
	}

	public Set getUserInfos() {
		return this.userInfos;
	}

	public void setUserInfos(Set userInfos) {
		this.userInfos = userInfos;
	}

}