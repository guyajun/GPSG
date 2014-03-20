package org.shu.model;

import java.sql.Timestamp;
import java.util.HashSet;
import java.util.Set;

/**
 * DepartmentInfo entity. @author MyEclipse Persistence Tools
 */

public class DepartmentInfo implements java.io.Serializable {

	// Fields

	private Integer id;
	private Integer parentId;
	private String departmentName;
	private String departmentDescription;
	private String creatorId;
	private Timestamp createTime;
	private String modifierId;
	private Timestamp modifyTime;
	private Set userInfos = new HashSet(0);

	// Constructors

	/** default constructor */
	public DepartmentInfo() {
	}

	/** full constructor */
	public DepartmentInfo(Integer parentId, String departmentName,
			String departmentDescription, String creatorId,
			Timestamp createTime, String modifierId, Timestamp modifyTime,
			Set userInfos) {
		this.parentId = parentId;
		this.departmentName = departmentName;
		this.departmentDescription = departmentDescription;
		this.creatorId = creatorId;
		this.createTime = createTime;
		this.modifierId = modifierId;
		this.modifyTime = modifyTime;
		this.userInfos = userInfos;
	}

	// Property accessors

	public Integer getId() {
		return this.id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public Integer getParentId() {
		return this.parentId;
	}

	public void setParentId(Integer parentId) {
		this.parentId = parentId;
	}

	public String getDepartmentName() {
		return this.departmentName;
	}

	public void setDepartmentName(String departmentName) {
		this.departmentName = departmentName;
	}

	public String getDepartmentDescription() {
		return this.departmentDescription;
	}

	public void setDepartmentDescription(String departmentDescription) {
		this.departmentDescription = departmentDescription;
	}

	public String getCreatorId() {
		return this.creatorId;
	}

	public void setCreatorId(String creatorId) {
		this.creatorId = creatorId;
	}

	public Timestamp getCreateTime() {
		return this.createTime;
	}

	public void setCreateTime(Timestamp createTime) {
		this.createTime = createTime;
	}

	public String getModifierId() {
		return this.modifierId;
	}

	public void setModifierId(String modifierId) {
		this.modifierId = modifierId;
	}

	public Timestamp getModifyTime() {
		return this.modifyTime;
	}

	public void setModifyTime(Timestamp modifyTime) {
		this.modifyTime = modifyTime;
	}

	public Set getUserInfos() {
		return this.userInfos;
	}

	public void setUserInfos(Set userInfos) {
		this.userInfos = userInfos;
	}

}