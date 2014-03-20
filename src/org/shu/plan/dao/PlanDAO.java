package org.shu.plan.dao;
import java.util.List;

import org.shu.model.ProducePlan;

import common.db.GenericHibernateDao;
import common.db.QueryParam;
import common.db.QueryResult;

public class PlanDAO extends GenericHibernateDao<ProducePlan,Integer>{
	/** 添加计划 **/
	public void addPlan(ProducePlan plan){
		this.getHibernateTemplate().save(plan);
	}
	/** 查询所有计划**/
	public QueryResult<ProducePlan> getAllPlans(int page,int row)  throws Exception
	{
		QueryParam param=new QueryParam();
			param.setPage(page-1, row);
			param.addOrder("id",QueryParam.ORDER_DESC);
		QueryResult<ProducePlan> result = list(param);
		return result;  
	}
	/**删除计划**/
	public void delete(Integer id)
	{
		this.getHibernateTemplate().delete(findss(id));
	}
	public ProducePlan findss(Integer id)
	{
		List list=this.getHibernateTemplate().find("from ProducePlan where id=?",id);
		if(list.size()>0)
			return (ProducePlan)list.get(0);
		else
			return null;
	}
	
	public ProducePlan findPlanEntity(Integer id)
	{
	 List result= this.getHibernateTemplate().find("from ProducePlan  where id=?",id);
	 if(result.size()>0)
	 {
	 return (ProducePlan)result.get(0);
	 }
	 else
	 return null;
	}
	
	public List findPlanById(Integer id)
	{
	 List result= this.getHibernateTemplate().find("from ProducePlan where id=?",id);
	 return result;
	}
	public void updatePlan(ProducePlan plan)
	{
		this.getHibernateTemplate().update(plan);
	}
	
	public List planSearch(String datestart,String dateend)
	{
		String[] str={datestart,dateend};
		List result;
		if(datestart.length()==0 && dateend.length()==0)
		{
			result=this.getHibernateTemplate().find("from ProducePlan");
		}else
		if(dateend.length()==0)
		{
			result=this.getHibernateTemplate().find("from ProducePlan where startTime > ?",datestart);
		}else{
		 result=this.getHibernateTemplate().find("from ProducePlan where startTime > ? and startTime < ?",str);
		}
		 List result1=this.getHibernateTemplate().find("from ProducePlan where startTime = ?",datestart);
		List result2=this.getHibernateTemplate().find("from ProducePlan where startTime = ?",dateend);
		result1.addAll(result);
		result2.addAll(result1);
		return result2;
	}
}

