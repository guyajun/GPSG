package org.shu.dao.imp;

import java.util.Date;
import java.util.List;
import org.shu.model.UserInfo;
import common.db.GenericHibernateDao;
import common.db.QueryParam;
import common.db.QueryResult;

public class UserInfoDao extends GenericHibernateDao<UserInfo,Integer>{
	public List getAll() {
		return this.getHibernateTemplate().find("from UserInfo");
	}
	public QueryResult<UserInfo> userList(String filterName)throws Exception
	{
		QueryParam param=new QueryParam();
		param.setPageSize(100);
		param.andFilter("code", QueryParam.FILTER_EQUALS, filterName);
		param.addOrder("code", QueryParam.ORDER_ASC);
		QueryResult<UserInfo> result = list(param);
		return result;
	}
	public QueryResult<UserInfo> get(int page,int rows) throws Exception
	{
		QueryParam param = new QueryParam();
		//param.setPageSize(20);
		param.setPage(page-1, rows);
		param.addOrder("id", QueryParam.ORDER_DESC);
		QueryResult<UserInfo> result = list(param);
		return result;
	}
	public List<UserInfo> testQuery(Date date) throws Exception
	{
		QueryParam param = new QueryParam();
		param.andFilter("createDate", QueryParam.FILTER_GREATEEQUAL, date);
		param.andFilter("createDate", QueryParam.FILTER_LESSEQUAL, date);
		return list(param).getList();
	}
	public List<UserInfo> testQuery1(Date date)throws Exception
	{
		QueryParam param = new QueryParam();
		param.andFilter("createDate", QueryParam.FILTER_LESSEQUAL, date);
		return list(param).getList();
	}
	
	public List<UserInfo> testQuery2(Date date)throws Exception
	{
		QueryParam param = new QueryParam();
		param.andFilter("createDate", QueryParam.FILTER_NOTEQUAL, date);
		List<UserInfo> list = list(param).getList();
		return list;
	}
	public List<UserInfo> testQuery3(String and, String or)throws Exception
	{
		QueryParam param = new QueryParam();
		param.setPage(0, 2);
//		param.addFilter("code", QueryParam.FILTER_LIKE, and);
		param.orFilter("code", QueryParam.FILTER_LIKE, and);
		param.orFilter("code", QueryParam.FILTER_LIKE, or);
		param.orFilter("code", QueryParam.FILTER_LIKE, "1");
		List<UserInfo> list = list(param).getList();
		return list;
	}
	public void evict(UserInfo entity)
	{
		getHibernateTemplate().evict(entity);
	}
	
	public List<UserInfo> findByUserId(Integer id) throws Exception{
		String sql="select * from model.UserInfo where model.UserInfo.id=?;";
		Object[] params = new Object[1];
		params[0] = id;
		List<UserInfo> user = sqlFind(sql,params);
		if(user!=null&&user.size()>0)
		return super.sqlFind(sql, params);
		else return null;
	}
	
	
	
	public UserInfo loadUserByCode(String code) throws Exception
	{
		QueryParam param = new QueryParam();
		param.andFilter("code",QueryParam.FILTER_EQUALS,code);
		List<UserInfo> users = list(param).getList();
		if(users.size()==0)
		return null;
		else
			return users.get(0);
		
	}
	
}
