package org.shu.construct.service;

import java.util.ArrayList;
import org.shu.construct.dao.AuthorityDao;
import org.shu.model.RoleRefFunction;

public class AuthorityService {

	private AuthorityDao authorityDao;	
	
	public void setAuthorityDao(AuthorityDao authorityDao) {
		this.authorityDao = authorityDao;
	}

	public void save(ArrayList<RoleRefFunction> roleRefFunctions)
	{		
		authorityDao.save(roleRefFunctions);
	}	
	public ArrayList<RoleRefFunction> getByRoleId(int roleId){
		return authorityDao.getByRoleId(roleId);
	}
	 public void delete(int roleId){ 
		 authorityDao.delete(roleId);
	 }
}
