package org.shu.construct.action;

import java.util.ArrayList;
import org.shu.common.service.AdminService;
import org.shu.model.UserInfo;
import common.base.action.BaseAction;

@SuppressWarnings("serial")
public class SystemAction extends BaseAction {
	private String message; 
	private AdminService adminService;
	
	public String getMessage() {
		return message;
	}

	public void setMessage(String message) {
		this.message = message;
	}

	public void setAdminService(AdminService adminService) {
		this.adminService = adminService;
	}
	
	public String login() throws Exception {
		String loginName =request.getParameter("loginName").trim();
		String password = request.getParameter("password").trim();
		ArrayList<UserInfo> list = adminService.findByLoginNameAndPassword(
				loginName, password);
		if (list.size() > 0) {
			int userid = list.get(0).getId();
			if (userid > 0) {
				session.put("userId", list.get(0).getId());
				session.put("name", list.get(0).getFullName());
				message="ok";
				return "success";
			}
		}
		message="登录名或密码有误！";
		return "error";
	}

	public String logOut(){
		session.remove("name");
		session.remove("userId");
		return SUCCESS;
	}
}
