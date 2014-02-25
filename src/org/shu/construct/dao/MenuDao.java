package org.shu.construct.dao;

import java.util.ArrayList;
import org.shu.model.FunctionInfo;
import common.db.GenericHibernateDao;

public class MenuDao extends GenericHibernateDao<FunctionInfo, Integer> {
	public ArrayList<FunctionInfo> getById(int functionId) {
		String sql = "select * from FUNCTION_INFO where id="
				+ functionId;
		ArrayList<FunctionInfo> list = (ArrayList<FunctionInfo>) this
				.sqlFind(sql);
		return list;
	}
	public ArrayList<FunctionInfo> getAll() {
		String sql = "select * from FUNCTION_INFO";
		ArrayList<FunctionInfo> list = (ArrayList<FunctionInfo>) this
				.sqlFind(sql);
		return list;
	}
}
