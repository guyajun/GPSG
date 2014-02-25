package org.shu.admin.action;

import java.net.URLDecoder;
import java.util.ArrayList;
import java.util.Map;

import org.shu.common.service.AdminService;
import org.shu.construct.service.DepartmentInfoService;
import org.shu.construct.service.RoleRefUserService;
import org.shu.construct.service.RoleService;
import org.shu.model.DepartmentInfo;
import org.shu.model.RoleInfo;
import org.shu.model.RoleRefUser;
import org.shu.model.UserInfo;
import org.tool.Pager;

import com.opensymphony.xwork2.ActionContext;
import common.base.action.BaseAction;

@SuppressWarnings("serial")
public class UserAction extends BaseAction {

	private AdminService adminService;
	private DepartmentInfoService departmentInfoService;
	private RoleService roleService;
	private RoleRefUserService roleRefUserService;
	protected UserInfo userInfo;
	private Integer pageNow = 1;

	public Integer getPageNow() {
		return pageNow;
	}

	public UserInfo getUserInfo() {
		return userInfo;
	}

	public void setUserInfo(UserInfo userInfo) {
		this.userInfo = userInfo;
	}

	public void setPageNow(Integer pageNow) {
		this.pageNow = pageNow;
	}

	public void setRoleRefUserService(RoleRefUserService roleRefUserService) {
		this.roleRefUserService = roleRefUserService;
	}

	public void setDepartmentInfoService(
			DepartmentInfoService departmentInfoService) {
		this.departmentInfoService = departmentInfoService;
	}

	public void setRoleService(RoleService roleService) {
		this.roleService = roleService;
	}

	public String getAll() {
		Pager pager = new Pager(pageNow, adminService.getUserInfo().size());
		ArrayList<UserInfo> userList = adminService.getAll(pageNow,
				pager.getPageSize());
		ArrayList<DepartmentInfo> depList = departmentInfoService.getAll();
		ArrayList<RoleInfo> roleList = roleService.getAll();
		Map request = (Map) ActionContext.getContext().get("request");
		request.put("pager", pager);
		request.put("userList", userList);
		request.put("depList", depList);
		request.put("roleList", roleList);
		return SUCCESS;
	}

	public String getByName() throws Exception {
		String fullNameNew = URLDecoder.decode(
				new String(request.getParameter("fullName").getBytes("UTF-8"),
						"UTF-8"), "UTF-8");
		Pager pager = new Pager(pageNow, adminService.getCountByName(
				fullNameNew).size());
		ArrayList<UserInfo> userList = adminService.getOnePageByName(
				fullNameNew, pageNow, pager.getPageSize());
		ArrayList<DepartmentInfo> depList = departmentInfoService.getAll();
		ArrayList<RoleInfo> roleList = roleService.getAll();
		if(userList.size()==0){
			pager.setPageNow(0);
		}
		Map request = (Map) ActionContext.getContext().get("request");
		request.put("pager", pager);
		request.put("userList", userList);
		request.put("depList", depList);
		request.put("roleList", roleList);
		return SUCCESS;
	}

	public void setAdminService(AdminService adminService) {
		this.adminService = adminService;
	}

	public String deleteUser() {
		int userId = Integer.parseInt(request.getParameter("userId"));
		ArrayList<UserInfo> list = adminService.findUserById(userId);
		RoleRefUser roleRefUser = adminService.findRoleRefUser(userId);
		roleRefUserService.deleteOne(roleRefUser);
		adminService.delete(list.get(0));
		return SUCCESS;
	}
}
