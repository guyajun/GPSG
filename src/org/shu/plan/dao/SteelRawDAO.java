package org.shu.plan.dao;
import java.util.List;

import org.shu.model.SteelRaw;

import common.db.GenericHibernateDao;
import common.db.QueryParam;
import common.db.QueryResult;

public class SteelRawDAO extends GenericHibernateDao<SteelRaw,Integer>{
	
	/** 查询所有钢筋原材料检测报告**/
//	public QueryResult<SteelRaw> getAllSteelRaws(int page,int row)  throws Exception
//	{
//		QueryParam param=new QueryParam();
//			param.setPage(page-1, row);
//			param.addOrder("reportId",QueryParam.ORDER_DESC);
//		QueryResult<SteelRaw> result = list(param);
//		return result;  
//	}
	
	public List steelSearch()
	{
		List result=this.getHibernateTemplate().find("from SteelRaw");
		return result;
	}
	
	public List steelSearch(String reportId)
	{
		List result=this.getHibernateTemplate().find("from SteelRaw where reportId=?",reportId);
		return result;
	}
	public List findSteelRaw(String date)
	{
		List result=this.getHibernateTemplate().find("from SteelRaw where '"+date+"' between useBeginTime and useEndTime");
		return result;
	}
	
}

