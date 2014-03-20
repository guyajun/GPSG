package org.shu.dao.imp;

import java.util.List;
import org.shu.model.RoleRefFunction;

import common.db.GenericHibernateDao;
import common.db.QueryParam;
import common.db.QueryResult;

public class RoleRefFunctionDao extends GenericHibernateDao<RoleRefFunction,Integer> {
	
	public List<RoleRefFunction> getRoleModules(Integer id)
	{
		
		String sql = "select * from ROLE_REF_FUNCTION where ROLE_ID = ?;";
		Object[] params = new Object[1];
		params[0] = id;
		List<RoleRefFunction> list = sqlFind(sql,params);
		if(list!=null&&list.size()>0)
			return list;
		else return null;
	}
	public RoleRefFunction getRoleModule(Integer roleId,Integer moduleId)
	{
		
		String hql = "from RoleRefFunction where roleInfo.id="+roleId+" and functionInfo.id="+moduleId;
		List<RoleRefFunction> list = find(hql);
		if(list!=null&&list.size()>0)
			return list.get(0);
		else return null;
	}
	
	public QueryResult<RoleRefFunction> getRoleModuleByRoleId(Integer id)throws Exception
	{
		QueryParam param=new QueryParam();
		param.setPageSize(60);
		param.andFilter("roleInfo.id", QueryParam.FILTER_EQUALS, id);
		QueryResult<RoleRefFunction> result = list(param);
		return result;
		
	}
}
