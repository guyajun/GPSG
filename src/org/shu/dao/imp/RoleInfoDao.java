package org.shu.dao.imp;

import java.util.ArrayList;
import java.util.List;

import org.shu.model.RoleInfo;

import common.db.GenericHibernateDao;
import common.db.QueryParam;
import common.db.QueryResult;

public class RoleInfoDao extends GenericHibernateDao<RoleInfo, Integer>{
	public void update(RoleInfo roleInfo){
		this.getHibernateTemplate().update(roleInfo);
	}
	public void save(RoleInfo roleInfo){
		this.getHibernateTemplate().save(roleInfo);
	}
	public void delete(RoleInfo roleInfo){
		this.getHibernateTemplate().delete(roleInfo);
	}

	public ArrayList<RoleInfo> getAll() {
		String sql="select * from ROLE_INFO;";
		ArrayList<RoleInfo> list=(ArrayList<RoleInfo>) sqlFind(sql);
		return list;
	}
	public List getAllRole() {
		return this.getHibernateTemplate().find("from RoleInfo");
	}
	public ArrayList<RoleInfo> findByName(String name)
	{
		String sql="select * from ROLE_INFO where ROLE_NAME='"+name+"';";
		ArrayList<RoleInfo> list=(ArrayList<RoleInfo>) sqlFind(sql);
		return list;
	}
	
	public QueryResult<RoleInfo> get(int page,int rows) throws Exception
	{
		QueryParam param = new QueryParam();
		param.setPageSize(20);
		param.setPage(page-1, rows);
		param.addOrder("id", QueryParam.ORDER_ASC);
		QueryResult<RoleInfo> result = list(param);
		return result;
	}
	public List<RoleInfo> filterRole(List<Integer> filterIds) throws Exception
	{
		QueryParam param = new QueryParam();
		if(filterIds.size()>0)
		{
			for(int i=0;i<filterIds.size();i++)
			{
				param.andFilter("id", QueryParam.FILTER_NOTEQUAL, filterIds.get(i));
			}
		}
		List<RoleInfo> list = list(param).getList();
		return list;
	}

	public QueryResult<RoleInfo> getAllRole(int page, int size)
			throws Exception {
		// TODO Auto-generated method stub
		return null;
	}

}
