package org.shu.model;

import java.sql.Timestamp;
import java.util.HashSet;
import java.util.Set;

/**
 * UserInfo entity. @author MyEclipse Persistence Tools
 */

public class UserInfo implements java.io.Serializable {

	// Fields

	private Integer id;
	private DepartmentInfo departmentInfo;
	private RoleInfo roleInfo;
	private String jobNumber;
	private String fullName;
	private String loginName;
	private String password;
	private String cellPhone;
	private String email;
	private String creator;
	private Timestamp createTime;
	private String modifier;
	private Timestamp modifyTime;
	private String url;
	private String isMark;
	private Set roleRefUsers = new HashSet(0);

	// Constructors

	/** default constructor */
	public UserInfo() {
	}

	/** full constructor */
	public UserInfo(DepartmentInfo departmentInfo, RoleInfo roleInfo,
			String jobNumber, String fullName, String loginName,
			String password, String cellPhone, String email, String creator,
			Timestamp createTime, String modifier, Timestamp modifyTime,
			String url, String isMark, Set roleRefUsers) {
		this.departmentInfo = departmentInfo;
		this.roleInfo = roleInfo;
		this.jobNumber = jobNumber;
		this.fullName = fullName;
		this.loginName = loginName;
		this.password = password;
		this.cellPhone = cellPhone;
		this.email = email;
		this.creator = creator;
		this.createTime = createTime;
		this.modifier = modifier;
		this.modifyTime = modifyTime;
		this.url = url;
		this.isMark = isMark;
		this.roleRefUsers = roleRefUsers;
	}

	// Property accessors

	public Integer getId() {
		return this.id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public DepartmentInfo getDepartmentInfo() {
		return this.departmentInfo;
	}

	public void setDepartmentInfo(DepartmentInfo departmentInfo) {
		this.departmentInfo = departmentInfo;
	}

	public RoleInfo getRoleInfo() {
		return this.roleInfo;
	}

	public void setRoleInfo(RoleInfo roleInfo) {
		this.roleInfo = roleInfo;
	}

	public String getJobNumber() {
		return this.jobNumber;
	}

	public void setJobNumber(String jobNumber) {
		this.jobNumber = jobNumber;
	}

	public String getFullName() {
		return this.fullName;
	}

	public void setFullName(String fullName) {
		this.fullName = fullName;
	}

	public String getLoginName() {
		return this.loginName;
	}

	public void setLoginName(String loginName) {
		this.loginName = loginName;
	}

	public String getPassword() {
		return this.password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getCellPhone() {
		return this.cellPhone;
	}

	public void setCellPhone(String cellPhone) {
		this.cellPhone = cellPhone;
	}

	public String getEmail() {
		return this.email;
	}

	public void setEmail(String email) {
		this.email = email;
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

	public String getUrl() {
		return this.url;
	}

	public void setUrl(String url) {
		this.url = url;
	}

	public String getIsMark() {
		return this.isMark;
	}

	public void setIsMark(String isMark) {
		this.isMark = isMark;
	}

	public Set getRoleRefUsers() {
		return this.roleRefUsers;
	}

	public void setRoleRefUsers(Set roleRefUsers) {
		this.roleRefUsers = roleRefUsers;
	}

}