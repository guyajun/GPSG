package org.shu.construct.service;

import java.util.ArrayList;
import org.shu.construct.dao.RoleRefUserDao;
import org.shu.model.RoleRefUser;

public class RoleRefUserService {

	private RoleRefUserDao roleRefUserDao;
	private RoleRefUserDao roleRefUserDao1;
	
	public void setRoleRefUserDao1(RoleRefUserDao roleRefUserDao1) {
		this.roleRefUserDao1 = roleRefUserDao1;
	}
	public void setRoleRefUserDao(RoleRefUserDao roleRefUserDao) {
		this.roleRefUserDao = roleRefUserDao;
	}
	public void saveOne(RoleRefUser roleRefUser){
		roleRefUserDao.saveOne(roleRefUser);
	}
	public ArrayList<RoleRefUser> getByUserId(int userId) {
		return roleRefUserDao.getByUserId(userId);
	}
	public void updateOne(RoleRefUser roleRefUser){
		roleRefUserDao.updateOne(roleRefUser);
	}
	public void deleteOne(RoleRefUser roleRefUser){
		roleRefUserDao.deleteOne(roleRefUser);
	}
}
