package org.shu.admin.dao;

import java.util.ArrayList;
import java.util.List;

import org.shu.model.GpMeasurepoint;
import org.shu.model.RoleInfo;
import org.shu.model.RoleRefUser;
import org.shu.model.SynchronousGrout;
import org.shu.model.UserInfo;

import common.db.GenericHibernateDao;
import common.db.QueryParam;
import common.db.QueryResult;

public class UserDAO extends GenericHibernateDao<UserInfo, Integer> {
	public void addUser(UserInfo user) {
		this.getHibernateTemplate().save(user);
	}
	public void update(UserInfo userInfo){
		this.getHibernateTemplate().update(userInfo);
	}
	public void save(UserInfo userInfo){
		this.getHibernateTemplate().save(userInfo);
	}
	public void delete(UserInfo userInfo){
		this.getHibernateTemplate().delete(userInfo);
	}
	public ArrayList<UserInfo> findByName(String name)
	{
		String sql="select * from USER_INFO where FULL_NAME='"+name+"';";
		ArrayList<UserInfo> list=(ArrayList<UserInfo>) sqlFind(sql);
		return list;
	}
	public ArrayList<UserInfo> findByNameAndPhone(String fullName,String cellPhone)
	{
		String sql="select * from USER_INFO where FULL_NAME='"+fullName+"' and CELL_PHONE='"+cellPhone+"';";
		ArrayList<UserInfo> list=(ArrayList<UserInfo>) sqlFind(sql);
		return list;
	}
	public QueryResult<UserInfo> getAllUsers(int page, int row)
			throws Exception {
		QueryParam param = new QueryParam();
		param.setPage(page - 1, row);
		param.addOrder("id", QueryParam.ORDER_DESC);
		QueryResult<UserInfo> result = list(param);
		return result;
	}
	 public List<UserInfo> userSearch()
	    {
	        List<UserInfo> result = this.getHibernateTemplate().find("from UserInfo");
	        return result;
	    }
	public ArrayList<UserInfo> getAll(int pageNow,
			int pageSize) {
		String sql="select * from USER_INFO;";
		ArrayList<UserInfo> userList=(ArrayList<UserInfo>) sqlFind(sql);
		ArrayList<UserInfo> userList1 = new ArrayList<UserInfo>();
		for (int i = ((pageNow - 1) * pageSize); i <= (pageNow * pageSize - 1); i++) {
			if (i < userList.size()) {
				userList1.add(userList.get(i));
			} else {
				break;
			}
		}
		return userList1;
	}
	public ArrayList<UserInfo> getCountByName(String fullName) {
		String sql = "select * from USER_INFO where FULL_NAME like '%" + fullName + "%';";
		ArrayList<UserInfo> UserInfo = (ArrayList<UserInfo>) this
				.sqlFind(sql);
		return UserInfo;
	}
	public void delete(Integer id) {
		this.getHibernateTemplate().delete(finduser(id));
	}

	public UserInfo finduser(Integer id) {
		List result = this.getHibernateTemplate().find(
				"from UserInfo  where id=?", id);
		if (result.size() > 0)
			return (UserInfo) result.get(0);
		else
			return null;
	}

	public UserInfo findUserByJobnumber(String fullname) {
		List result = this.getHibernateTemplate().find(
				"from UserInfo  where fullName=?", fullname);
		if (result.size() > 0)
			return (UserInfo) result.get(0);
		else
			return null;
	}
	public RoleRefUser findRoleRefUser(Integer userid) {
		List result = this.getHibernateTemplate().find(
				"from RoleRefUser where USER_ID=?", userid);
		if (result.size() > 0)
			return (RoleRefUser) result.get(0);
		else
			return null;
	}

	public ArrayList<UserInfo> findUserById(Integer id) {
		ArrayList<UserInfo> result = (ArrayList<UserInfo>) this.getHibernateTemplate().find(
				"from UserInfo where id=?", id);
		return result;
	}

	public void updateUser(UserInfo user) {
		this.getHibernateTemplate().update(user);
	}

	public void updateRoleRefUser(RoleRefUser rolerefuser) {
		this.getHibernateTemplate().update(rolerefuser);
	}
	public ArrayList<UserInfo> findByLoginNameandPassword(String loginName, String password) {
		String sql="select * from USER_INFO where LOGIN_NAME='"+loginName+"' and PASSWORD='"+password+"';";
		ArrayList<UserInfo> list=(ArrayList<UserInfo>) sqlFind(sql);
		return list;
	}
	public ArrayList<UserInfo> getByName(String fullName, int pageNow,
			int pageSize) {
		ArrayList<UserInfo> userList = getCountByName(fullName);
		ArrayList<UserInfo> userList1 = new ArrayList<UserInfo>();
		for (int i = ((pageNow - 1) * pageSize); i <= (pageNow * pageSize - 1); i++) {
			if (i < userList.size()) {
				userList1.add(userList.get(i));
			} else {
				break;
			}
		}
		return userList1;
	}
}
