package org.shu.construct.action;

import java.util.ArrayList;
import java.util.Map;

import org.shu.construct.service.AuthorityService;
import org.shu.construct.service.MenuService;
import org.shu.construct.service.RoleService;
import org.shu.model.FunctionInfo;
import org.shu.model.RoleInfo;
import org.shu.model.RoleRefFunction;

import com.opensymphony.xwork2.ActionContext;
import common.base.action.BaseAction;

public class AuthorityAction extends BaseAction {
	private static final long serialVersionUID = 1L;
	private String roleId;
	private String menuIds;
	private MenuService menuService;
	private RoleService roleService;
	private AuthorityService authorityService;
	public String getRoleId() {
		return roleId;
	}

	public void setRoleId(String roleId) {
		this.roleId = roleId;
	}

	public String getMenuIds() {
		return menuIds;
	}

	public void setMenuIds(String menuIds) {
		this.menuIds = menuIds;
	}

	public void setRoleService(RoleService roleService) {
		this.roleService = roleService;
	}

	public void setMenuService(MenuService menuService) {
		this.menuService = menuService;
	}

	public void setAuthorityService(AuthorityService authorityService) {
		this.authorityService = authorityService;
	}
	public String getByRoleId(){
		int roleId1=Integer.parseInt(request.getParameter("roleId"));
		ArrayList<RoleRefFunction> rrfList=authorityService.getByRoleId(roleId1);
		ArrayList<FunctionInfo> list = menuService.getAll();
		ArrayList<RoleInfo> roleList=roleService.getAll();
		String roleName="";
		for(int i=0;i<roleList.size();i++){
			if(roleId1==roleList.get(i).getId()){
				roleName=roleList.get(i).getRoleName();
				break;
			}
		}
		Map request = (Map) ActionContext.getContext().get("request");
		request.put("list", list);
		request.put("roleName", roleName);
		request.put("roleId1", roleId1);
		return SUCCESS;
	}
	public String execute() {
		ArrayList<RoleInfo> list = roleService.getAll();
		Map request = (Map) ActionContext.getContext().get("request");
		request.put("list", list);
		return SUCCESS;
	}
	public String saveRight() {
		int roleId1 = Integer.parseInt(roleId);
		authorityService.delete(roleId1);
		System.out.println("roleId1=" + roleId1);
		System.out.println("menuIds=" + menuIds);
		if(!menuIds.equals("")){
		String[] menus = menuIds.split(",");
		ArrayList<Integer> copyMenus = new ArrayList<Integer>();
		for (int j = 0; j < menus.length; j++) {
			copyMenus.add(Integer.parseInt(menus[j]));
		}
		ArrayList<RoleRefFunction> roleRefFunctions=new ArrayList<RoleRefFunction>();
		for (int j = 0; j < copyMenus.size(); j++) {
			RoleInfo roleInfo=new RoleInfo();
			roleInfo.setId(roleId1);
			FunctionInfo functionInfo=new FunctionInfo();
			functionInfo.setId(copyMenus.get(j));
			RoleRefFunction roleRefFucntion=new RoleRefFunction();
			roleRefFucntion.setRoleInfo(roleInfo);
			roleRefFucntion.setFunctionInfo(functionInfo);
			roleRefFunctions.add(roleRefFucntion);
		}
		authorityService.save(roleRefFunctions);
		}
		return SUCCESS;
	}
	public String saveRight1() {
		int roleId1 = Integer.parseInt(roleId);
		authorityService.delete(roleId1);
		if(!menuIds.equals("")){
		String[] menus = menuIds.split(",");
		ArrayList<FunctionInfo> list = menuService.getAll();
		ArrayList<Integer> mainMenus = new ArrayList<Integer>();
		ArrayList<Integer> copyMenus = new ArrayList<Integer>();
		for (int j = 0; j < menus.length; j++) {
			copyMenus.add(Integer.parseInt(menus[j]));
		}
		for (int i = 0; i < list.size(); i++) {
			if (list.get(i).getFunctionInfo()!=null && list.get(i).getFunctionInfo().getId() == 0) {
				mainMenus.add(list.get(i).getId());
			}
		}
		for (int j = 0; j < menus.length; j++) {
			int menuId = Integer.parseInt(menus[j]);
			for (int i = 0; i < list.size(); i++) {
				if (list.get(i).getId() == menuId && !copyMenus.contains(list.get(i).getFunctionInfo().getId())) {
					copyMenus.add(list.get(i).getFunctionInfo().getId());
				}
			}
		}
		ArrayList<RoleRefFunction> roleRefFunctions=new ArrayList<RoleRefFunction>();
		for (int j = 0; j < copyMenus.size(); j++) {
			RoleInfo roleInfo=new RoleInfo();
			roleInfo.setId(roleId1);
			FunctionInfo functionInfo=new FunctionInfo();
			functionInfo.setId(copyMenus.get(j));
			RoleRefFunction roleRefFucntion=new RoleRefFunction();
			roleRefFucntion.setRoleInfo(roleInfo);
			roleRefFucntion.setFunctionInfo(functionInfo);
			roleRefFunctions.add(roleRefFucntion);
		}
		authorityService.save(roleRefFunctions);
		}
		return SUCCESS;
	}
}
