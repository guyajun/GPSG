package org.shu.construct.dao;

import java.util.ArrayList;
import org.shu.model.RoleInfo;
import common.db.GenericHibernateDao;

public class RoleDao extends GenericHibernateDao<RoleInfo, Integer> {
	public ArrayList<RoleInfo> getAll() {
		String sql = "select * from ROLE_INFO";
		ArrayList<RoleInfo> list = (ArrayList<RoleInfo>) this.sqlFind(sql);		
		return list;
	}
}
