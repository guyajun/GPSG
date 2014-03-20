package org.shu.construct.service;

import java.util.ArrayList;

import org.shu.construct.dao.RoleRefFunctionDao;
import org.shu.model.RoleRefFunction;

public class RoleRefFunctionService {

	private RoleRefFunctionDao roleRefFunctionDao;

	public void setRoleRefFunctionDao(RoleRefFunctionDao roleRefFunctionDao) {
		this.roleRefFunctionDao = roleRefFunctionDao;
	}

	public ArrayList<RoleRefFunction> getByRoleId(int roleId) {
		return roleRefFunctionDao.getByRoleId(roleId);
	}
}
