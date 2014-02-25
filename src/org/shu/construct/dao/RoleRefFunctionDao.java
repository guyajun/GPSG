package org.shu.construct.dao;

import java.util.ArrayList;
import org.shu.model.RoleRefFunction;
import common.db.GenericHibernateDao;

public class RoleRefFunctionDao extends GenericHibernateDao<RoleRefFunction, Integer> {
	public ArrayList<RoleRefFunction> getByRoleId(int roleId) {
		String sql = "select * from ROLE_REF_FUNCTION where ROLE_ID="+roleId;
		ArrayList<RoleRefFunction> list = (ArrayList<RoleRefFunction>) this.sqlFind(sql);		
		return list;
	}
}
