package org.shu.common.service;

import java.util.ArrayList;
import java.util.List;

import org.shu.admin.dao.AuthorityDAO;
import org.shu.admin.dao.DepartmentDAO;
import org.shu.admin.dao.UserDAO;
import org.shu.construct.dao.RoleRefUserDao;
import org.shu.model.DepartmentInfo;
import org.shu.model.RoleInfo;
import org.shu.model.RoleRefUser;
import org.shu.model.UserInfo;

import common.db.QueryResult;

public class AdminService {
	private UserDAO userDAO;
	private DepartmentDAO deptDAO;
	private AuthorityDAO authorityDAO;
	public void save(UserInfo userInfo) {
		userDAO.save(userInfo);
	}

	public ArrayList<UserInfo> findByName(String fullName) {
		return userDAO.findByName(fullName);
	}

	public UserDAO getUserDAO() {
		return userDAO;
	}

	public DepartmentDAO getDeptDAO() {
		return deptDAO;
	}

	public void delete(UserInfo userInfo) {
		userDAO.delete(userInfo);
	}

	public void setAuthorityDAO(AuthorityDAO authorityDAO) {
		this.authorityDAO = authorityDAO;
	}

	public ArrayList<UserInfo> getAll(int pageNow, int pageSize) {
		return userDAO.getAll(pageNow, pageSize);
	}

	public ArrayList<UserInfo> findByNameAndPhone(String fullName,
			String cellPhone) {
		return userDAO.findByNameAndPhone(fullName, cellPhone);
	}

	public void update(UserInfo userInfo) {
		userDAO.update(userInfo);
	}

	public ArrayList<UserInfo> getCountByName(String fullName) {
		return userDAO.getCountByName(fullName);
	}

	public void setUserDAO(UserDAO userDAO) {
		this.userDAO = userDAO;
	}

	public ArrayList<UserInfo> getOnePageByName(String fullName, int pageNow,
			int pageSize) {
		return userDAO.getByName(fullName, pageNow, pageSize);
	}

	public void setDeptDAO(DepartmentDAO deptDAO) {
		this.deptDAO = deptDAO;
	}

	public ArrayList<UserInfo> getUserInfo() {
		return (ArrayList<UserInfo>) userDAO.userSearch();
	}
	public void addUser(UserInfo user) {
		userDAO.addUser(user);
	}

	public void delUser(Integer id) {
		List<RoleRefUser> Roles = authorityDAO.getRoleByUserId(id);
		authorityDAO.deleteAll(Roles);
		userDAO.delete(id);
	}

	public UserInfo getOneUser(Integer id) {
		return userDAO.finduser(id);
	}

	public UserInfo findUserByJobnumber(String fullname) {
		return userDAO.findUserByJobnumber(fullname);
	}

	public RoleRefUser findRoleRefUser(Integer userid) {
		return userDAO.findRoleRefUser(userid);
	}

	public ArrayList<UserInfo> findUserById(Integer id) {
		return userDAO.findUserById(id);
	}

	public void updateUser(UserInfo user) {
		userDAO.updateUser(user);
	}
	public void updateRoleRefUser(RoleRefUser rolerefuser) {

		userDAO.updateRoleRefUser(rolerefuser);
	}

	public DepartmentInfo getOneDept(Integer id) {
		return deptDAO.findDeptEntity(id);
	}

	public ArrayList<DepartmentInfo> findAll() {
		return (ArrayList<DepartmentInfo>) deptDAO.depSearch();
	}
	public RoleInfo getOneRole(Integer id) {
		return authorityDAO.getOneRole(id);
	}

	public void addRoleRefUser(RoleRefUser rolerefuser) {
		authorityDAO.addRoleRefUser(rolerefuser);
	}
	public void addDept(DepartmentInfo dept) {
		deptDAO.addDept(dept);

	}
	public void delDept(Integer deptnumber) {
		deptDAO.delete(deptnumber);
	}

	public QueryResult<DepartmentInfo> getAllDepts(int page, int row)
			throws Exception {
		return deptDAO.getAllDepts(page, row);
	}
	public DepartmentInfo findDeptEntity(Integer deptnumber) {
		return deptDAO.findDeptEntity(deptnumber);
	}
	public List findDeptById(Integer deptnumber) {
		return deptDAO.findDeptById(deptnumber);
	}

	public void updateDept(DepartmentInfo dept) {
		deptDAO.updateDept(dept);
	}
	public ArrayList<UserInfo> findByLoginNameAndPassword(String loginName,
			String password) {
		return userDAO.findByLoginNameandPassword(loginName, password);
	}
}
