package org.shu.action;

import java.util.ArrayList;
import java.util.Map;

import org.shu.model.RoleInfo;
import org.shu.service.imp.RoleInfoService;

import com.opensymphony.xwork2.ActionContext;

import common.base.action.BaseAction;

@SuppressWarnings("serial")
public class RoleInfoAction extends BaseAction{
	private Integer id;
	private String name;
	private String description;	
	private RoleInfoService roleInfoService;
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	public void setRoleInfoService(RoleInfoService roleInfoService) {
		this.roleInfoService = roleInfoService;
	}
	public String deleteRole(){
		ArrayList<RoleInfo> list = roleInfoService.findByName(name);
		roleInfoService.delete(list.get(0));
		return SUCCESS;
	}
	public String getAll(){
		ArrayList<RoleInfo> list=roleInfoService.getAll();
		Map request = (Map)ActionContext.getContext().get("request");
        request.put("list", list);
		return SUCCESS;
	}
	public String queryRole(){
		ArrayList<RoleInfo> list=roleInfoService.findByName(name);
		Map request = (Map)ActionContext.getContext().get("request");
        request.put("list", list);
		return SUCCESS;
	}
	public String editRole(){
		RoleInfo role = new RoleInfo();
		role.setId(id);
		role.setRoleName(name);
		role.setRoleDescription(description);
		roleInfoService.update(role);	
		return SUCCESS;
	}
	public String addRole(){
		ArrayList<RoleInfo> list = roleInfoService.findByName(name);
		if(list.size()==0){
			RoleInfo role = new RoleInfo();
			role.setRoleName(name);
			role.setRoleDescription(description);
			roleInfoService.save(role);
		}
		else{
			Map request = (Map)ActionContext.getContext().get("request");
	        request.put("msg", "此角色已经存在");
		}
		return SUCCESS;
	}
}
