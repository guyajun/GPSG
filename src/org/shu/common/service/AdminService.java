package org.shu.common.service;

import java.io.IOException;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import org.shu.admin.dao.AuthorityDAO;
import org.shu.admin.dao.DepartmentDAO;
import org.shu.admin.dao.UserDAO;
import org.shu.model.DepartmentInfo;
import org.shu.model.RoleInfo;
import org.shu.model.RoleRefUser;
import org.shu.model.UserInfo;

import common.db.QueryResult;


public class AdminService {
	private UserDAO userDAO;
	private DepartmentDAO deptDAO;
	private AuthorityDAO authorityDAO;


	public void setAuthorityDAO(AuthorityDAO authorityDAO) {
		this.authorityDAO = authorityDAO;
	}


	public void setUserDAO(UserDAO userDAO) {
		this.userDAO = userDAO;
	}
	
	
	public void setDeptDAO(DepartmentDAO deptDAO) {
		this.deptDAO = deptDAO;
	}
	
	  public static boolean hasLogon(HttpServletRequest request) throws IOException,ServletException
	    {
	    	HttpSession session = request.getSession(true);
			if(session.getAttribute("loginName")!=null&&session.getAttribute("name").toString().length()>0){
				return true;
			}
			return false;
	    }


	/** �û� **/
	//���
	public void addUser(UserInfo user) {
		// TODO Auto-generated method stub
		userDAO.addUser(user);
//		RoleRefUser authority=new RoleRefUser();
//		authority.setUserInfo(user);
		
	}
	//ɾ��
	public void delUser(Integer id)
	{
		List<RoleRefUser> Roles=authorityDAO.getRoleByUserId(id);
		authorityDAO.deleteAll(Roles);
		userDAO.delete(id);
	}
	
	//���ݹ��Ų����û�ID

	//��ѯ
	public QueryResult<UserInfo> getAllUsers(int page,int row) throws Exception  {
		return userDAO.getAllUsers(page,row);
	}
	//����һ���û�ʵ��
	public UserInfo getOneUser(Integer id)
	{
		return userDAO.finduser(id);
	}
	public UserInfo findUserByJobnumber(String fullname)
	{
		return userDAO.findUserByJobnumber(fullname);
	}
	//����һ��RoleRefUserʵ��
	public RoleRefUser findRoleRefUser(Integer userid)
	{
		return userDAO.findRoleRefUser(userid);
	}
	
	//����һ���û�List
	public List findUserById(Integer id)
	{
		return userDAO.findUserById(id);
	}
	//����
	public void updateUser(UserInfo user)
	{
		userDAO.updateUser(user);
	}
	
	//����rolerefuser
		public void updateRoleRefUser(RoleRefUser rolerefuser)
		{

			userDAO.updateRoleRefUser(rolerefuser);
		}
	
	public DepartmentInfo getOneDept(Integer id)
	{
		//return DepartmentDAO.findDeptEntity(id);
		return deptDAO.findDeptEntity(id);
	}
	public List findAll()
	{
		return deptDAO.findAll();
	}

//	/** �˵� **/
//	public void addMenu(FunctionInfo menu) {
//		// TODO Auto-generated method stub
//		adminDAO.addMenu(menu);
//	}
//	@SuppressWarnings("rawtypes")
//	public List getAllMenus() {
//		// TODO Auto-generated method stub
//		return adminDAO.getAllMenus();
//	}
//
	/** ��ɫ **/
	public RoleInfo getOneRole(Integer id)
	{
		return authorityDAO.getOneRole(id);
	}
	public void addRoleRefUser(RoleRefUser rolerefuser)
	{
		authorityDAO.addRoleRefUser(rolerefuser);
	}
//	public void addRole(RoleInfo role) {
//		// TODO Auto-generated method stub
//		adminDAO.addRole(role);
//	}
//	@SuppressWarnings("rawtypes")
//	public List getAllRoles() {
//		// TODO Auto-generated method stub
//		return adminDAO.getAllRoles();
//	}
//
//	/** ��Ŀ **/
//	public void addProject(ProInfo pro) {
//		// TODO Auto-generated method stub
//		adminDAO.addProject(pro);
//	}
//	@SuppressWarnings("rawtypes")
//	public List getAllPros() {
//		// TODO Auto-generated method stub
//		return adminDAO.getAllPros();
//	}
//
	/** ���� **/
	//���
		public void addDept(DepartmentInfo dept) {
			// TODO Auto-generated method stub
			deptDAO.addDept(dept);
			
		}
		//ɾ��
		public void delDept(Integer deptnumber)
		{
			deptDAO.delete(deptnumber);
		}
		//��ѯ
		public QueryResult<DepartmentInfo> getAllDepts(int page,int row) throws Exception  {
			return deptDAO.getAllDepts(page,row);
		}
		//����һ������ʵ��
		public DepartmentInfo findDeptEntity(Integer deptnumber)
		{
			return deptDAO.findDeptEntity(deptnumber);
		}
		//����һ������List
		public List findDeptById(Integer deptnumber)
		{
			return deptDAO.findDeptById(deptnumber);
		}
		//����
		public void updateDept(DepartmentInfo dept)
		{
			deptDAO.updateDept(dept);
		}
		
		public UserInfo findByLoginNameAndPassword(String loginName,String password)
		{
			return userDAO.findByLoginNameandPassword(loginName, password);
		}
}
