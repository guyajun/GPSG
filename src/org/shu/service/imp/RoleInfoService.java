package org.shu.service.imp;

import java.util.ArrayList;
import java.util.List;
import org.shu.dao.imp.RoleInfoDao;
import org.shu.model.RoleInfo;
import common.db.QueryResult;

public class RoleInfoService{
	private RoleInfoDao roleInfoDao;

	public RoleInfoDao getRoleInfoDao() {
		return roleInfoDao;
	}


	public void setRoleInfoDao(RoleInfoDao roleInfoDao) {
		this.roleInfoDao = roleInfoDao;
	}
	public void delete(RoleInfo roleInfo){
		roleInfoDao.delete(roleInfo);
	}

	public ArrayList<RoleInfo> getAll() {
		return roleInfoDao.getAll();
		 
	}


	public List getAllUser() {		
		return roleInfoDao.getAllRole();
	}


	public ArrayList<RoleInfo> findByName(String name){
		return roleInfoDao.findByName(name);
	}

	public void save(RoleInfo roleInfo) {
		roleInfoDao.save(roleInfo);
	}
	public void update(RoleInfo roleInfo) {
		roleInfoDao.update(roleInfo);
	}

}

