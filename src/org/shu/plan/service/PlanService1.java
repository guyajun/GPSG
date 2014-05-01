package org.shu.plan.service;

import java.util.ArrayList;


import org.shu.model.DepartmentInfo;
import org.shu.model.ProInfo;
import org.shu.model.ProducePlan;
import org.shu.plan.dao.PlanDao1;



public class PlanService1 {
	private PlanDao1 planDao1;

	public PlanDao1 getPlanDao1() {
		return planDao1;
	}

	public void setPlanDao1(PlanDao1 planDao1) {
		this.planDao1 = planDao1;
	}
	public ArrayList<ProducePlan> getAll()
	{		
		return  (ArrayList<ProducePlan>) planDao1.getAll();
	}
	public ArrayList<ProducePlan> getProducePlan() {
		return (ArrayList<ProducePlan>) planDao1.depSearch();
	}
	public ArrayList<ProducePlan> getByName(String startTime) {
		return planDao1.findByName(startTime);
	}
	public ArrayList<ProducePlan> getOnePageByCno(String startTime, int pageNow,
			int pageSize) {
		return planDao1.getByCno(startTime, pageNow, pageSize);
	}
	public ArrayList<ProducePlan> findByProId(Integer proId){
		return planDao1.findByProId(proId);
	}
	 public void save(ProducePlan ProducePlan) {
		 planDao1.save(ProducePlan);
		}
	 public void delete(ProducePlan ProducePlan){
		 planDao1.delete(ProducePlan);
		}
	 public void update(ProducePlan ProducePlan) {
		 planDao1.update(ProducePlan);
	    }

}
