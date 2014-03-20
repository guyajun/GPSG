package org.shu.service.imp;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.shu.dao.imp.FunctionInfoDao;
import org.shu.dao.imp.RoleInfoDao;
import org.shu.dao.imp.RoleRefFunctionDao;
import org.shu.dao.imp.RoleRefUserDao;
import org.shu.dao.imp.UserInfoDao;
import org.shu.model.FunctionInfo;
import org.shu.model.RoleInfo;
import org.shu.model.RoleRefFunction;
import org.shu.model.RoleRefUser;
import org.shu.model.UserInfo;

import common.datastructure.Attributes;
import common.datastructure.Tree;
import common.db.QueryResult;


public class SystemService {
	private UserInfoDao userInfoDao;
	
	private RoleInfoDao roleInfoDao;
	
	private FunctionInfoDao functionInfoDao;
	
	private RoleRefFunctionDao roleRefFunctionDao; 
	
	private RoleRefUserDao roleRefUserDao;

	private static final Log log = LogFactory.getLog(SystemService.class);
	
	public void setUserInfoDao(UserInfoDao userInfoDao) {
		this.userInfoDao = userInfoDao;
	}

	public void setRoleInfoDao(RoleInfoDao roleInfoDao) {
		this.roleInfoDao = roleInfoDao;
	}
	
	public void setFunctionInfoDao(FunctionInfoDao functionInfoDao) {
		this.functionInfoDao = functionInfoDao;
	}
	
	public void setRoleRefFunctionDao(RoleRefFunctionDao roleRefFunctionDao) {
		this.roleRefFunctionDao = roleRefFunctionDao;
	}
	
	public void setRoleRefUserDao(RoleRefUserDao roleRefUserDao) {
		this.roleRefUserDao = roleRefUserDao;
	}
	public UserInfo loadUser(Integer id)
	{
		return userInfoDao.get(id);
	}
	public UserInfo loadUserById(Integer id){
		return userInfoDao.get(id);
	}
	
	public FunctionInfo loadModule(Integer id)
	{
		return functionInfoDao.get(id);
	}
	
	
	
	public List<UserInfo> getAllUser()
	{
		return userInfoDao.loadAll();
	}

	
	
	
	public List<RoleRefFunction> getRoleModules(Integer roleId) throws Exception
	{
		return roleRefFunctionDao.getRoleModules(roleId);
	}
	
	public List<FunctionInfo> getSubModules(Integer id)throws Exception
	{
		return functionInfoDao.getSubModule(id);
	}
	
	public List<FunctionInfo> subModules(Integer id) throws Exception
	{
		List<FunctionInfo> subModules = new ArrayList<FunctionInfo>();
	
		List<FunctionInfo> temp = new ArrayList<FunctionInfo>();
		temp.add(this.getModuleById(id));
		while(temp.size()>0)
		{
			List<FunctionInfo> list = getSubModules(temp.get(0).getId());
			if(list!=null&&list.size()>0)
			{
				for(int i=0;i<list.size();i++)
				{
					temp.add(list.get(i));
				}
			}
			subModules.add(temp.get(0));
			temp.remove(0);
		}
		return subModules;
	}
	
	public List<RoleInfo> getRolesByUserId(Integer id)
	{
		List<RoleInfo> roleList = new ArrayList<RoleInfo>();
		List<RoleRefUser> authorityList = roleRefUserDao.getRoleByUserId(id);
		if(authorityList.size()>0){
			for(int i=0;i<authorityList.size();i++)
			{
				roleList.add(roleInfoDao.get(authorityList.get(i).getRoleInfo().getId()));
			}
		}
		return roleList;
	}
	
	public List<RoleInfo> getAllRoles()
	{
		return roleInfoDao.loadAll();
	}

	public RoleRefUser getAuthorityByUserIdAndRoleId(Object[] values)
	{
		return roleRefUserDao.getAuthorityByUserIdAndRoleId(values);
	}
	
	public RoleInfo getRoleById(Integer id)
	{
		return roleInfoDao.get(id);
	}
	public void saveRole(RoleInfo role)throws Exception
	{
		roleInfoDao.save(role);
	}
	public void saveAuthority(RoleRefUser authority)
	{
		roleRefUserDao.save(authority);
	}
	public void updateAuthority(RoleRefUser authority)
	{
		roleRefUserDao.update(authority);
	}
	public UserInfo getUserById(Integer id)
	{
		return userInfoDao.get(id);
	}
	public ArrayList<RoleInfo> findByRoleName(String name)
	{
		return roleInfoDao.findByName(name);
	}
	
	public void deleteRole(Integer roleId)throws Exception
	{
		QueryResult<RoleRefFunction> list = roleRefFunctionDao.getRoleModuleByRoleId(roleId);
		List<RoleRefFunction> list1 = list.getList();
		QueryResult<RoleRefUser> authrities = roleRefUserDao.getAuthorityByRoleId(roleId);
		List<RoleRefUser> list2 = authrities.getList();
		roleRefUserDao.deleteAll(list2);
		roleRefFunctionDao.deleteAll(list1);
		roleInfoDao.deleteByKey(roleId);
	}
	public FunctionInfo getModuleById(Integer id)
	{
		return functionInfoDao.get(id);
	}
	public boolean isLeafModule(Integer id) throws Exception
	{
		return functionInfoDao.isLeaf(id);
	}
	public List<FunctionInfo> getDescendantsByModuleId(Integer id) throws Exception
	{
		List<FunctionInfo> tempList = new ArrayList<FunctionInfo>();
		List<FunctionInfo> list = new ArrayList<FunctionInfo>();
		FunctionInfo module = functionInfoDao.get(id);
		tempList.add(module);
		while(tempList.size()>0)
		{
			FunctionInfo module1 = tempList.get(0);
			list.add(module1);
			tempList.remove(0);
			List<FunctionInfo> subModules = functionInfoDao.getSubModule(module1.getId());
			if(subModules!=null&&subModules.size()>0)
			{
				for(int i=0;i<subModules.size();i++)
				{
					FunctionInfo module2 = subModules.get(i);
					tempList.add(module2);
				}
			}
		}
		return list;
	}
	public RoleRefFunction getRoleModule(Integer roleId,Integer moduleId)
	{
		return roleRefFunctionDao.getRoleModule(roleId, moduleId);
	}
	public void saveRoleModule(RoleRefFunction roleModule)
	{
		roleRefFunctionDao.save(roleModule);
	}
	public void deleteRoleModule(RoleRefFunction roleModule)
	{
		roleRefFunctionDao.delete(roleModule);
	}
	
	public void treeGenerator(List<FunctionInfo> children,Tree parent) throws Exception
	{
		List<Tree> treeList = new ArrayList<Tree>();
		parent.setChildren(treeList);		
		if(children!=null&&children.size()>0)
		{
			for(int i=0;i<children.size();i++)
			{
				FunctionInfo module = children.get(i);
				Tree child = new Tree();
				child.setId(module.getId());
				child.setText(module.getFunctionName());
				Attributes attributes = new Attributes();
				attributes.setUrl(module.getMenuUrl());
				child.setAttributes(attributes);
				treeList.add(child);
				List<FunctionInfo> nextChildren = new ArrayList<FunctionInfo>();
				
				nextChildren = functionInfoDao.getSubModule(child.getId());
				treeGenerator(nextChildren,child);
			}
		}
	}
	
	public boolean isAncestorModule(FunctionInfo module)
	{
		if(module.getFunctionInfo().getId()==1)
		return true;
		else return false;
	}
	
	public List<FunctionInfo> getAllModules()
	{
		return functionInfoDao.loadAll();
	}

	public void updateUser(UserInfo user) {
		userInfoDao.update(user);
	}
	
	public QueryResult<UserInfo> test(String filterName)throws Exception
	{
		return userInfoDao.userList(filterName);
	}
	public QueryResult<RoleRefFunction> getRoleModuleByRoleId(Integer role_id)throws Exception
	{
		return roleRefFunctionDao.getRoleModuleByRoleId(role_id);
	}
	public void deleteUserById(Integer userId)throws Exception
	{
		List<RoleRefUser> authorities = roleRefUserDao.getRoleByUserId(userId);
		roleRefUserDao.deleteAll(authorities);
		userInfoDao.deleteByKey(userId);
	}
	
	public void deleteAuthority(RoleRefUser authority)
	{
		roleRefUserDao.delete(authority);
	}
	
	public QueryResult<RoleInfo> getRoleByPageAndRows(int page,int rows)throws Exception
	{
		return roleInfoDao.get(page, rows);
	}
	
	public QueryResult<UserInfo> getUserByPageAndRows(int page,int rows)throws Exception
	{
		return userInfoDao.get(page, rows);
	}
	public void evictUser(UserInfo user)
	{
		userInfoDao.evict(user);
	}
	public List<RoleRefUser> getAuthorityByUserId(Integer userId)
	{
		return roleRefUserDao.getRoleByUserId(userId);
	}
	public List<RoleInfo> filterRole(List<Integer> filterIds) throws Exception
	{
		return roleInfoDao.filterRole(filterIds);
	}
	public void showModule(Integer userId,List<FunctionInfo> list) throws Exception{
		Map<String,Object> modulesMap = new HashMap<String,Object>();
		List<FunctionInfo> moduleList = new ArrayList<FunctionInfo>();
		List<RoleInfo> userRoles = new ArrayList<RoleInfo>();
		if(userId!=null)
		{
			 userRoles = getRolesByUserId(userId);
			 
		}
		if(userRoles!=null&&userRoles.size()>0)
		{
			for(int i=0;i<userRoles.size();i++)
			{
				List<RoleRefFunction> roleModulesList = getRoleModules(userRoles.get(i).getId());
				log.info("userRoles.get("+i+").getId() = "+ userRoles.get(i).getId());
				if(roleModulesList!=null&&roleModulesList.size()>0)
				{
					for(int j=0;j<roleModulesList.size();j++)
					{
						moduleList.add(roleModulesList.get(j).getFunctionInfo());
					}
				}
			}
		}
		if(moduleList!=null&&moduleList.size()>0)
		{
			for(int i=0;i<moduleList.size();i++)
			{
				FunctionInfo module = moduleList.get(i);
				String id = String.valueOf(module.getId());
				FunctionInfo module1 = new FunctionInfo();
				module1.setId(module.getId());
				module1.setFunctionName(module.getFunctionName());
				modulesMap.put(id, module1);
			}
		}
		List<FunctionInfo> topMenus = getSubModules(0);//�������һ���˵�
		if(topMenus!=null&&topMenus.size()>0)
		{
			for(int i=0;i<topMenus.size();i++)
			{
				FunctionInfo module2 = (FunctionInfo)modulesMap.get(String.valueOf(topMenus.get(i).getId()));
				if(module2!=null&&module2.getId()>0)
				{
					list.add(module2);
				}
			}
		}
	}
	
	public List<Tree> showSubModule(Integer pid, Integer userId) throws Exception{
		List<Tree> submenus = new ArrayList<Tree>();
		List<RoleInfo> roles = null;
		if(userId!=null)
		{
			roles = getRolesByUserId(userId);
		}
		
		Map<String,Object> subModules = new HashMap<String,Object>();//�û�idΪuserId����ģ��idΪid�����пɷ�����ģ��
		Map<String,Object> modules = new HashMap<String,Object>();//����û�idΪuserId�����з���ģ��
		
		if(roles!=null&&roles.size()>0)
		{
			for(int i=0;i<roles.size();i++)
			{
				QueryResult<RoleRefFunction> roleModules = getRoleModuleByRoleId(roles.get(i).getId());
				List<RoleRefFunction> roleModuleList = roleModules.getList();
				if(roleModuleList!=null&&roleModuleList.size()>0)
				{
					for(int j=0;j<roleModuleList.size();j++)
					{
						FunctionInfo module = roleModuleList.get(j).getFunctionInfo();
						if(module!=null)
							modules.put(module.getId().toString(), module);
					}
				}
			}
			
		}
		List<FunctionInfo> subModuleList = subModules(pid);
		if(subModuleList!=null&&subModuleList.size()>0)
		{
			for(int i=0;i<subModuleList.size();i++)
			{
				FunctionInfo module = subModuleList.get(i);
				if(module!=null&&modules.containsKey(module.getId().toString()))
					subModules.put(module.getId().toString(), module);
			}
		}
		
		List<Tree> treeList = new ArrayList<Tree>();
		FunctionInfo parent = getModuleById(pid);
		Tree rootNode = new Tree();
		rootNode.setId(parent.getId());
		rootNode.setText(parent.getFunctionName());
		rootNode.setState("open");
		treeList.add(rootNode);
		submenus = treeList;
		List<FunctionInfo> children = children(subModules,rootNode);
		generatorSubModules(subModules,children,rootNode);
		
		return submenus;
	}
	public void generatorSubModules(Map<String,Object> subModules,List<FunctionInfo> children,Tree parent) throws Exception{
		List<Tree> treeList = new ArrayList<Tree>();
		parent.setChildren(treeList);
		
		if(children!=null&&children.size()>0)
		{
			for(int i=0;i<children.size();i++)
			{
				FunctionInfo module = children.get(i);
				Tree child = new Tree();
				child.setId(module.getId());
				child.setText(module.getFunctionName());
				child.setIconCls("icon-gears");
				Attributes attributes = new Attributes();
				attributes.setUrl(module.getMenuUrl());
				child.setAttributes(attributes);
				treeList.add(child);
				List<FunctionInfo> nextChildren = new ArrayList<FunctionInfo>();
				
				nextChildren = children(subModules,child);
				generatorSubModules(subModules,nextChildren,child);
			}
		}
		
	}
	
	public List<FunctionInfo> children(Map<String,Object> subModules,Tree module) throws Exception{
		List<FunctionInfo> children = new ArrayList<FunctionInfo>();
		List<FunctionInfo> subModule = getSubModules(module.getId());  
		if(subModule!=null&&subModule.size()>0)
		{
			for(int i=0;i<subModule.size();i++)
			{
				FunctionInfo module1 = subModule.get(i);
				if(module1!=null)
				{
					if(subModules.containsKey(module1.getId().toString()))
					children.add(module1);
				}
			}
		}
		return children;
	}
	
	public UserInfo loadUserByCode(String code) throws Exception
	{
		return userInfoDao.loadUserByCode(code);
	}
	public void saveUser(UserInfo user)
	{
		userInfoDao.save(user);
	}

}
