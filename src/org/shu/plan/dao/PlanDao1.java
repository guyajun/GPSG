package org.shu.plan.dao;

import java.util.ArrayList;
import java.util.List;



import org.shu.model.DepartmentInfo;
import org.shu.model.ProInfo;
import org.shu.model.ProducePlan;

import common.db.GenericHibernateDao;

public class PlanDao1 extends GenericHibernateDao<ProducePlan, Integer> {
	public ArrayList<ProducePlan> getAll() {
		String sql = "select * from PRODUCE_PLAN";
		ArrayList<ProducePlan> list = (ArrayList<ProducePlan>) this.sqlFind(sql);		
		return list;
	}
	public List<ProducePlan> depSearch()
    {
		String sql = "select * from PRODUCE_PLAN";
		ArrayList<ProducePlan> list = (ArrayList<ProducePlan>) this.sqlFind(sql);		
		return list;
    }
	public ArrayList<ProducePlan> findByName(String startTime)
	{
		String sql="select * from PRODUCE_PLAN where START_TIME ='" + startTime + "';";
		ArrayList<ProducePlan> list=(ArrayList<ProducePlan>) sqlFind(sql);
		return list;
	}
	public ArrayList<ProducePlan> getByCno(String startTime, int pageNow,
			int pageSize) {
		ArrayList<ProducePlan> measureList = findByName(startTime);
		ArrayList<ProducePlan> measureList1 = new ArrayList<ProducePlan>();
		for (int i = ((pageNow - 1) * pageSize); i <= (pageNow * pageSize - 1); i++) {
			if (i < measureList.size()) {
				measureList1.add(measureList.get(i));
			} else {
				break;
			}
		}
		return measureList1;
	}
	 public ArrayList<ProducePlan> findByProId(Integer proId)
		{
			String sql="select * from PRODUCE_PLAN where PRO_ID='"+proId+"';";
			ArrayList<ProducePlan> list=(ArrayList<ProducePlan>) sqlFind(sql);
			return list;
		}
	 public void save(ProducePlan ProducePlan){
			this.getHibernateTemplate().save(ProducePlan);
		}
	 public void delete(ProducePlan ProducePlan){
			this.getHibernateTemplate().delete(ProducePlan);
		}
	 public void update(ProducePlan ProducePlan) {
	        getHibernateTemplate().update(ProducePlan);
	    }
}