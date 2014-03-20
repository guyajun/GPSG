package org.shu.common.service;

import java.util.List;

import org.shu.admin.dao.DepartmentDAO;
import org.shu.admin.dao.UserDAO;
import org.shu.model.DepartmentInfo;
import org.shu.model.ProducePlan;
import org.shu.model.UserInfo;
import org.shu.plan.dao.PlanDAO;

import common.db.QueryResult;


public class PlanService {
	private PlanDAO planDAO;

	public void setPlanDAO(PlanDAO planDAO) {
		this.planDAO = planDAO;
	}
	/** 计划**/
	//添加
	public void addPlan(ProducePlan plan) {
		// TODO Auto-generated method stub
		planDAO.addPlan(plan);
		
	}
	//删除
	public void delPlan(Integer id)
	{
		planDAO.delete(id);
	}
	//查询
	public QueryResult<ProducePlan> getAllPlans(int page,int row) throws Exception  {
		return planDAO.getAllPlans(page,row);
	}
	//返回一个计划实体
			public ProducePlan findPlanEntity(Integer id)
			{
				return planDAO.findPlanEntity(id);
			}
			//返回一个计划List
			public List findPlanById(Integer id)
			{
				return planDAO.findPlanById(id);
			}

	//更新
	public void updatePlan(ProducePlan plan)
	{
		planDAO.updatePlan(plan);
	}
	
	public List planSearch(String datestart,String dateend)
	{
		return planDAO.planSearch(datestart,dateend);
	}
	
}
