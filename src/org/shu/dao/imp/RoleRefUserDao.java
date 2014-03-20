package org.shu.dao.imp;


import java.util.List;
import org.shu.model.RoleRefUser;
import common.db.GenericHibernateDao;
import common.db.QueryParam;
import common.db.QueryResult;

public class RoleRefUserDao extends GenericHibernateDao<RoleRefUser, Integer> {
	
	public List<RoleRefUser> getRoleByUserId(Integer id)
	{
		String queryString = "from ROLE_REF_USER where USER_ID = "+id +"order by id DESC";
		return (List<RoleRefUser>)find(queryString);
	}
	
	public RoleRefUser getAuthorityByUserIdAndRoleId(Object[] values)
	{
		String queryString = "from ROLE_REF_USER where USER_ID=? and ROLE_ID = ?";
		List<RoleRefUser> authorityList = find(queryString, values);
		if(authorityList.size()>0)
		return authorityList.get(0);
		else return null;
	}
	public QueryResult<RoleRefUser> getAuthorityByRoleId(Integer id) throws Exception
	{
		QueryParam param = new QueryParam();
		param.andFilter("roleInfo.id", QueryParam.FILTER_EQUALS, id);
		QueryResult<RoleRefUser> result = list(param);
		return result;
	}
}
