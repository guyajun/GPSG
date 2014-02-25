package org.shu.construct.dao;

import java.util.ArrayList;
import org.shu.model.DepartmentInfo;
import common.db.GenericHibernateDao;

public class DepartmentInfoDao extends GenericHibernateDao<DepartmentInfo, Integer> {
	public ArrayList<DepartmentInfo> getAll() {
		String sql = "select * from DEPARTMENT_INFO";
		ArrayList<DepartmentInfo> list = (ArrayList<DepartmentInfo>) this.sqlFind(sql);		
		return list;
	}
}
