package org.shu.construct.action;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.Map;

import org.shu.common.service.AdminService;
import org.shu.construct.service.DepartmentInfoService;
import org.shu.construct.service.MenuService;
import org.shu.construct.service.RoleRefFunctionService;
import org.shu.construct.service.RoleRefUserService;
import org.shu.construct.service.RoleService;
import org.shu.model.DepartmentInfo;
import org.shu.model.FunctionInfo;
import org.shu.model.RoleInfo;
import org.shu.model.RoleRefFunction;
import org.shu.model.RoleRefUser;
import org.shu.model.UserInfo;

import com.opensymphony.xwork2.ActionContext;
import common.base.action.BaseAction;

public class MenuAction extends BaseAction {
	private static final long serialVersionUID = 1L;
	private AdminService adminService;
	private MenuService menuService;
	private RoleService roleService;
	private RoleRefUserService roleRefUserService;
	private RoleRefFunctionService roleRefFunctionService;
	private DepartmentInfoService departmentInfoService;
	private UserInfo userInfo;

	public void setAdminService(AdminService adminService) {
		this.adminService = adminService;
	}

	public void setDepartmentInfoService(
			DepartmentInfoService departmentInfoService) {
		this.departmentInfoService = departmentInfoService;
	}

	public UserInfo getUserInfo() {
		return userInfo;
	}

	public void setUserInfo(UserInfo userInfo) {
		this.userInfo = userInfo;
	}

	public void setRoleRefFunctionService(
			RoleRefFunctionService roleRefFunctionService) {
		this.roleRefFunctionService = roleRefFunctionService;
	}

	public void setRoleRefUserService(RoleRefUserService roleRefUserService) {
		this.roleRefUserService = roleRefUserService;
	}

	public void setRoleService(RoleService roleService) {
		this.roleService = roleService;
	}

	public void setMenuService(MenuService menuService) {
		this.menuService = menuService;
	}

	public String addUser() {
		String fullName = userInfo.getFullName();
		String cellPhone = userInfo.getCellPhone();
		adminService.save(userInfo);
		RoleRefUser roleRefUser = new RoleRefUser();
		UserInfo userInfo1 = adminService.findByNameAndPhone(fullName,
				cellPhone).get(0);
		roleRefUser.setRoleInfo(userInfo.getRoleInfo());
		roleRefUser.setUserInfo(userInfo1);
		roleRefUserService.saveOne(roleRefUser);
		return SUCCESS;
	}

	public String updateUser() {
		adminService.update(userInfo);
		return SUCCESS;
	}

	public String getRoleAndDepart() {
		ArrayList<DepartmentInfo> depList = departmentInfoService.getAll();
		ArrayList<RoleInfo> list = roleService.getAll();
		Map request = (Map) ActionContext.getContext().get("request");
		request.put("list", list);
		request.put("depList", depList);
		return SUCCESS;
	}

	public String getAllRole() {
		int userId = Integer.parseInt(request.getParameter("userId"));
		userInfo = adminService.getOneUser(userId);
		ArrayList<DepartmentInfo> depList = departmentInfoService.getAll();
		ArrayList<RoleInfo> list = roleService.getAll();
		Map request = (Map) ActionContext.getContext().get("request");
		request.put("list", list);
		request.put("depList", depList);
		return SUCCESS;
	}

	public String execute() {
		int userId = (Integer) ActionContext.getContext().getSession()
				.get("userId");
		ArrayList<RoleRefUser> roleRefUserList = roleRefUserService
				.getByUserId(userId);
		ArrayList<FunctionInfo> list = new ArrayList<FunctionInfo>();
		Map request = (Map) ActionContext.getContext().get("request");
		if (roleRefUserList.size() > 0) {
			int roleId = roleRefUserList.get(0).getRoleInfo().getId();
			ArrayList<RoleRefFunction> roleRefFunctionList = roleRefFunctionService
					.getByRoleId(roleId);
			for (int i = 0; i < roleRefFunctionList.size(); i++) {
				int functionId = roleRefFunctionList.get(i).getFunctionInfo()
						.getId();
				list.add(menuService.getById(functionId).get(0));
			}
			request.put("list", list);
		} 
		return SUCCESS;
	}
}
