package org.shu.model;

import java.util.HashSet;
import java.util.Set;

/**
 * FunctionInfo entity. @author MyEclipse Persistence Tools
 */

public class FunctionInfo implements java.io.Serializable {

	// Fields

	private Integer id;
	private FunctionInfo functionInfo;
	private String functionName;
	private String functionDescription;
	private String menuUrl;
	private String creator;
	private String createTime;
	private String modifier;
	private String modifyTime;
	private Set functionInfos = new HashSet(0);
	private Set roleRefFunctions = new HashSet(0);

	// Constructors

	/** default constructor */
	public FunctionInfo() {
	}

	/** full constructor */
	public FunctionInfo(FunctionInfo functionInfo, String functionName,
			String functionDescription, String menuUrl, String creator,
			String createTime, String modifier, String modifyTime,
			Set functionInfos, Set roleRefFunctions) {
		this.functionInfo = functionInfo;
		this.functionName = functionName;
		this.functionDescription = functionDescription;
		this.menuUrl = menuUrl;
		this.creator = creator;
		this.createTime = createTime;
		this.modifier = modifier;
		this.modifyTime = modifyTime;
		this.functionInfos = functionInfos;
		this.roleRefFunctions = roleRefFunctions;
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

	public String getFunctionName() {
		return this.functionName;
	}

	public void setFunctionName(String functionName) {
		this.functionName = functionName;
	}

	public String getFunctionDescription() {
		return this.functionDescription;
	}

	public void setFunctionDescription(String functionDescription) {
		this.functionDescription = functionDescription;
	}

	public String getMenuUrl() {
		return this.menuUrl;
	}

	public void setMenuUrl(String menuUrl) {
		this.menuUrl = menuUrl;
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

	public String getModifier() {
		return this.modifier;
	}

	public void setModifier(String modifier) {
		this.modifier = modifier;
	}

	public String getModifyTime() {
		return this.modifyTime;
	}

	public void setModifyTime(String modifyTime) {
		this.modifyTime = modifyTime;
	}

	public Set getFunctionInfos() {
		return this.functionInfos;
	}

	public void setFunctionInfos(Set functionInfos) {
		this.functionInfos = functionInfos;
	}

	public Set getRoleRefFunctions() {
		return this.roleRefFunctions;
	}

	public void setRoleRefFunctions(Set roleRefFunctions) {
		this.roleRefFunctions = roleRefFunctions;
	}

}