package org.shu.construct.service;

import java.util.ArrayList;

import org.shu.construct.dao.RoleDao;
import org.shu.model.RoleInfo;

public class RoleService {

	private RoleDao roleDao;
	
	public void setRoleDao(RoleDao roleDao) {
		this.roleDao = roleDao;
	}

	public ArrayList<RoleInfo> getAll()
	{		
		return roleDao.getAll();
	}	
}
