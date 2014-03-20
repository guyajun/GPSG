package org.shu.dao.imp;

import java.util.List;
import org.shu.model.FunctionInfo;
import common.db.GenericHibernateDao;
import common.db.QueryParam;

public class FunctionInfoDao extends GenericHibernateDao<FunctionInfo,Integer>{
	
	public List<FunctionInfo> getSubModule1(Integer id)
	{
		String sql = "select * from FUNCTION_INFO where PARENT_ID = ?;";
		Object[] params = new Object[1];
		params[0] = id;
		List<FunctionInfo> list = sqlFind(sql,params);
		if(list.size()>0)
			return list;
		else return null;
	}
	public List<FunctionInfo> getSubModule(Integer id) throws Exception
	{
		QueryParam param = new QueryParam();
		param.andFilter("functionInfo.id", QueryParam.FILTER_EQUALS, id);
		List<FunctionInfo> list = list(param).getList();
		if(list.size()>0)
			return list;
		else return null;
	}
	
	public boolean isLeaf(Integer id) throws Exception
	{
		List<FunctionInfo> list = getSubModule(id);
		if(list!=null&&list.size()>0)
			return false;
		else return true;
	}
}
