package org.shu.plan.action;


import java.net.URLDecoder;
import java.util.ArrayList;
import java.util.Map;


import org.shu.model.DepartmentInfo;
import org.shu.model.ProInfo;
import org.shu.model.ProducePlan;

import org.shu.plan.service.PlanService1;
import org.tool.Pager;

import com.opensymphony.xwork2.ActionContext;
import common.base.action.BaseAction;



public class PlanAction1 extends BaseAction {
	private PlanService1 planService1;
	private Integer id;
	private Integer proId;
	private String endTime;
	private Integer startNum;
	private Integer endNum;
	private String coverDepth;
	private String startTime;
	public String getStartTime() {
		return startTime;
	}

	public void setStartTime(String startTime) {
		this.startTime = startTime;
	}

	protected ProducePlan produceplan;
	private Integer pageNow = 1;
	public Integer getPageNow() {
		return pageNow;
	}
	
    public PlanService1 getPlanservice1() {
		return planService1;
	}
	public void setPlanService1(PlanService1 planService1) {
		this.planService1 = planService1;
	}
	public ProducePlan getProduceplan() {
		return produceplan;
	}

	public ProducePlan getProducePlan() {
		return produceplan;
	}
	public void setProduceplan(ProducePlan produceplan) {
		this.produceplan = produceplan;
	}
	public void setPageNow(Integer pageNow) {
		this.pageNow = pageNow;
	}


public String getAll() {
	System.out.println("123");
	Pager pager = new Pager(pageNow, planService1.getProducePlan().size());
    System.out.println("dsfg dsfg ");
	ArrayList<ProducePlan> planList = planService1.getAll();
	System.out.println("zzxxcc ");
	Map request = (Map) ActionContext.getContext().get("request");
	request.put("pager", pager);
	request.put("planList", planList);
	return SUCCESS;
}

public String searchplan1() throws Exception {
	String proNameNew = URLDecoder.decode(
			new String(request.getParameter("startTime").getBytes("UTF-8"),
					"UTF-8"), "UTF-8");
	Pager pager = new Pager(pageNow, planService1.getByName(startTime)
			.size());
	ArrayList<ProducePlan> planList = planService1.getOnePageByCno(
			startTime, pageNow, pager.getPageSize());
	Map request = (Map) ActionContext.getContext().get("request");
	request.put("pager", pager);
	request.put("planList", planList);
	return SUCCESS;
}
public Integer getProId() {
	return proId;
}

public void setProId(Integer proId) {
	this.proId = proId;
}

public PlanService1 getPlanService1() {
	return planService1;
}
public String addplan1(){
	ArrayList<ProducePlan> list = planService1.findByProId(proId);
	if(list.size()==0){
		ProducePlan user = new ProducePlan();
		user.setId(id);
		user.setProId(proId);
		user.setEndTime(endTime);
		user.setStartNum(startNum);
		user.setEndNum(endNum);
		user.setStartTime(startTime);
		user.setCoverDepth(coverDepth);
		
		
		
		planService1.save(user);
	}
	else{
		Map request = (Map)ActionContext.getContext().get("request");
        request.put("msg", "此角色已经存在");
	}
	return SUCCESS;
}
public String editplan1(){
		ProducePlan user = new ProducePlan();
		user.setId(id);
		user.setProId(proId);
		user.setEndTime(endTime);
		user.setStartNum(startNum);
		user.setEndNum(endNum);
		user.setStartTime(startTime);
		user.setCoverDepth(coverDepth);
		
		
		
		planService1.update(user);
	return SUCCESS;
}

public Integer getId() {
	return id;
}

public void setId(Integer id) {
	this.id = id;
}

public String getEndTime() {
	return endTime;
}

public void setEndTime(String endTime) {
	this.endTime = endTime;
}

public Integer getStartNum() {
	return startNum;
}

public void setStartNum(Integer startNum) {
	this.startNum = startNum;
}

public Integer getEndNum() {
	return endNum;
}

public void setEndNum(Integer endNum) {
	this.endNum = endNum;
}

public String getCoverDepth() {
	return coverDepth;
}

public void setCoverDepth(String coverDepth) {
	this.coverDepth = coverDepth;
}
public String deleteplan1(){
	ArrayList<ProducePlan> list = planService1.findByProId(proId);
	planService1.delete(list.get(0));
	return SUCCESS;
}


}
