package org.shu.admin.dao;
import java.util.List;

import org.shu.model.RoleInfo;
import org.shu.model.RoleRefUser;
import org.shu.model.UserInfo;

import common.db.GenericHibernateDao;
import common.db.QueryParam;
import common.db.QueryResult;

public class AuthorityDAO extends GenericHibernateDao<RoleRefUser,Integer>{
	public List<RoleRefUser> getRoleByUserId(Integer id)
	{
		String queryString = "from RoleRefUser where userInfo.id = "+id +"order by id DESC";
		return (List<RoleRefUser>)find(queryString);
	}
	
	public RoleRefUser getAuthorityByUserIdAndRoleId(Object[] values)
	{
		String queryString = "from RoleRefUser where userInfo.id=? and roleInfo.id = ?";
		List<RoleRefUser> authorityList = find(queryString, values);
		if(authorityList.size()>0)
		return authorityList.get(0);
		else return null;
	}
	public QueryResult<RoleRefUser> getAuthorityByRoleId(Integer roleId) throws Exception
	{
		QueryParam param = new QueryParam();
		param.andFilter("roleInfo.id", QueryParam.FILTER_EQUALS, roleId);
		QueryResult<RoleRefUser> result = list(param);
		return result;
	}
	
	public RoleInfo getOneRole(Integer id)
	{
		List result= this.getHibernateTemplate().find("from RoleInfo  where id=?",id);
		 if(result.size()>0)
		 return (RoleInfo)result.get(0);
		 else
		 return null;
	}
	
	public void addRoleRefUser(RoleRefUser rolerefuser)
	{
		this.getHibernateTemplate().save(rolerefuser);
	}
}

