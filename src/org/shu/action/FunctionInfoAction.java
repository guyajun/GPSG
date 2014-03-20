package org.shu.action;

import org.shu.model.RoleInfo;
import org.shu.service.imp.RoleInfoService;

import com.opensymphony.xwork2.ActionSupport;

@SuppressWarnings("serial")
public class FunctionInfoAction extends ActionSupport{
	protected RoleInfo roleInfo;
	protected RoleInfoService roleInfoService;
	
	public RoleInfo getRoleInfo() {
		return roleInfo;
	}

	public void setRoleInfo(RoleInfo roleInfo) {
		this.roleInfo = roleInfo;
	}

	public RoleInfoService getRoleInfoService() {
		return roleInfoService;
	}

	public void setRoleInfoService(RoleInfoService roleInfoService) {
		this.roleInfoService = roleInfoService;
	}

	public String addRole() throws Exception {
		RoleInfo roleInfo1 = new RoleInfo();
		roleInfo1.setRoleName(roleInfo.getRoleName());
		roleInfo1.setRoleDescription(roleInfo.getRoleDescription());
		roleInfoService.update(roleInfo1);		
	
		return SUCCESS;
	}


	

}
