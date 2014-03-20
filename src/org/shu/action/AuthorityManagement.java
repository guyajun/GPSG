package org.shu.action;

import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import common.base.action.BaseAction;
import common.datastructure.Tree;
import org.shu.model.FunctionInfo;
import org.shu.model.RoleInfo;
import org.shu.model.RoleRefFunction;
import org.shu.service.imp.SystemService;

import common.db.QueryResult;

public class AuthorityManagement extends BaseAction{

	private static final long serialVersionUID = -7628648012154746062L;
	private RoleInfo roleInfo;  
	private SystemService systemService;
	
	private int total;
	
	private List<Object> rows;
	
	private List<Tree> modulesTree;
	
	private List<Integer> roleModuleIds;
	
	private int page;
	
	private int row;
	
	
	public RoleInfo getRoleInfo() {
		return roleInfo;
	}

	public void setRoleInfo(RoleInfo roleInfo) {
		this.roleInfo = roleInfo;
	}

	public void setPage(int page) {
		this.page = page;
	}

	public List<Integer> getRoleModuleIds() {
		return roleModuleIds;
	}

	public void setRoleModuleIds(List<Integer> roleModuleIds) {
		this.roleModuleIds = roleModuleIds;
	}

	public List<Tree> getModulesTree() {
		return modulesTree;
	}

	public void setModulesTree(List<Tree> modulesTree) {
		this.modulesTree = modulesTree;
	}

	public int getTotal() {
		return total;
	}

	public void setTotal(int total) {
		this.total = total;
	}

	public List<Object> getRows() {
		return rows;
	}

	public void setRows(List<Object> rows) {
		this.rows = rows;
	}

	public void setSystemService(SystemService systemService) {
		this.systemService = systemService;
	}
	
	public String rolesDataGrid() throws Exception
	{
		row = Integer.valueOf(request.getParameter("rows"));
		QueryResult<RoleInfo> results = systemService.getRoleByPageAndRows(page, row);
		List<RoleInfo> roleList = results.getList();
			total = results.getTotal();		
		rows = new ArrayList<Object>();
		if(roleList.size()>0)
		{
			for(int i=0;i<roleList.size();i++)
				
			{
				Map<String,Object> map = new HashMap<String,Object>();
				map.put("id",roleList.get(i).getId());
				map.put("roleDescription", roleList.get(i).getRoleDescription());
				map.put("roleName", roleList.get(i).getRoleName());
				rows.add(map);
			}
		
		}
		return SUCCESS;
	}
	
	public String rolesCount()
	{
		total = systemService.getAllRoles().size();
		
		return SUCCESS;
	}
	
	public void deleteRole()
	{
	
		Integer roleId = Integer.valueOf(request.getParameter("id"));
		if(roleId!=null)
		{
			try
			{
				systemService.deleteRole(roleId);
				response.setContentType("text/plain;charset=UTF-8");
				response.getWriter().println("ɾ��ɹ�");
			}
			catch(Exception e)
			{
				response.setContentType("text/plain;charset=UTF-8");
				try 
				{
					response.getWriter().println("ɾ�����쳣");
				} 
				catch (IOException e1) 
				{
					e1.printStackTrace();
				}
				e.printStackTrace();
			}
		}
		else
		{
			response.setContentType("text/plain;charset=UTF-8");
			try {
				response.getWriter().println("Ҫɾ��ļ�¼������");
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
	}
	
	public String modulesTree() throws Exception
	{
		List<FunctionInfo> moduleList = systemService.getSubModules(0);		
		List<Tree> treeList = new ArrayList<Tree>();
		FunctionInfo root = systemService.getModuleById(0);
		Tree rootNode = new Tree();
		rootNode.setId(root.getId());
		rootNode.setText(root.getFunctionName());
		rootNode.setState("open");
		treeList.add(rootNode);
		modulesTree = treeList;
		systemService.treeGenerator(moduleList,rootNode);
		return SUCCESS;
	}
	
	public String userAuthority() throws Exception
	{
		int roleId = Integer.valueOf(request.getParameter("roleId"));
		List<RoleRefFunction> list = systemService.getRoleModules(roleId);
		roleModuleIds = new ArrayList<Integer>();
		if(list!=null&&list.size()>0)
		{
			for(int i=0;i<list.size();i++)
			{
				boolean isLeafModule= systemService.isLeafModule(list.get(i).getFunctionInfo().getId());
				if(isLeafModule)
				{
					roleModuleIds.add(list.get(i).getFunctionInfo().getId());
				}
			}
		}
		return SUCCESS;
	}
	
	public void editAurhotiry() throws Exception
	{
		System.out.println("erin");
		Integer roleId = Integer.valueOf(request.getParameter("roleId"));
		Boolean checked = Boolean.valueOf(request.getParameter("checked"));
		Integer moduleId = Integer.valueOf(request.getParameter("nodeId"));
		System.out.println("roleId="+roleId);
		System.out.println("checked="+checked);
		System.out.println("moduleId="+moduleId);
		if(moduleId!=null&&roleId!=null)
		{
			RoleInfo role = systemService.getRoleById(roleId);
			if(checked == true)
			{
				List<FunctionInfo> moduleList = systemService.getDescendantsByModuleId(moduleId);
				Map<String,FunctionInfo> modulesMap = new HashMap<String,FunctionInfo>();
				Map<String,RoleInfo> rolesMap = new HashMap<String,RoleInfo>();
				List<FunctionInfo> allModules = systemService.getAllModules();
				List<RoleInfo> allRoles = systemService.getAllRoles();
				if(allModules!=null&&allModules.size()>0)
				{
					for(int i=0;i<allModules.size();i++)
					{
						modulesMap.put(allModules.get(i).getId().toString(), allModules.get(i));
					}
				}
				if(allRoles!=null&&allRoles.size()>0)
				{
					for(int i=0;i<allRoles.size();i++)
					{
						rolesMap.put(allRoles.get(i).getId().toString(), allRoles.get(i));
					}
				}
				if(moduleList!=null&moduleList.size()>0)
				{
					for(int i=0;i<moduleList.size();i++)
					{
						FunctionInfo module = moduleList.get(i);
						RoleRefFunction roleModule = systemService.getRoleModule(roleId, module.getId());
						if(roleModule==null)//�������ڣ������
						{
							addCurrentRoleModule(rolesMap,modulesMap,roleId, module.getId());
							addParentAuthority(role, module);
						}
					}
				}
			}
			if(checked == false)
			{
				List<FunctionInfo> moduleList = systemService.getDescendantsByModuleId(moduleId);
				if(moduleList!=null&moduleList.size()>0)
				{
					for(int i=0;i<moduleList.size();i++)
					{
						FunctionInfo module = moduleList.get(i);
						RoleRefFunction roleModule = systemService.getRoleModule(roleId, module.getId());
						if(roleModule==null)//�������ڣ����쳣
						{
							//������쳣
						}
						else
							systemService.deleteRoleModule(roleModule);
					}
				}
			}
		}
	}
	
	public void addCurrentRoleModule(Map<String,RoleInfo> rolesMap,Map<String,FunctionInfo> modulesMap,Integer roleId, Integer moduleId)
	{
		RoleInfo role = rolesMap.get(roleId.toString());
		FunctionInfo module = modulesMap.get(moduleId.toString());
		RoleRefFunction roleModule = new RoleRefFunction();
		roleModule.setFunctionInfo(module);
		roleModule.setRoleInfo(role);
		systemService.saveRoleModule(roleModule);
	}
	
	public void addParentAuthority(RoleInfo role, FunctionInfo module)
	{
		FunctionInfo parent = module.getFunctionInfo();
		if(parent!=null)
		{
			RoleRefFunction roleModule1 = systemService.getRoleModule(role.getId(), parent.getId());
			if(roleModule1==null)
			{
				if(parent!=null&&!(parent.getId()==1))
				{						
					RoleRefFunction roleModule = new RoleRefFunction();
					roleModule.setFunctionInfo(parent);
					roleModule.setRoleInfo(role);
					systemService.saveRoleModule(roleModule);
					addParentAuthority(role,parent);					
				}
			}
		}
	}
}
