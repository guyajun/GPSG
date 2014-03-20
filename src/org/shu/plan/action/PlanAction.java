package org.shu.plan.action;

import java.sql.Timestamp;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.apache.struts2.json.annotations.JSON;
import org.shu.common.service.AdminService;
import org.shu.common.service.PlanService;
import org.shu.model.DepartmentInfo;
import org.shu.model.ProducePlan;
import org.shu.model.UserInfo;

import com.opensymphony.xwork2.ActionContext;
import common.base.action.BaseAction;
import common.db.QueryResult;

@SuppressWarnings("serial")
public class PlanAction extends BaseAction {
	private PlanService planService;
	protected ProducePlan plan;

	private int total;
	private List<Object> rows;

	private int page;
	private int row;
	private String datestart;
	private String dateend;
	 
	public void setDatestart(String datestart) {
		this.datestart = datestart;
	}

	public void setDateend(String dateend) {
		this.dateend = dateend;
	}

	public void setPage(int page) {
		this.page = page;
	}
	
	public void setRows(List<Object> rows) {
		this.rows = rows;
	}
	 
	public void setPlanService(PlanService planService) {
		this.planService = planService;
	}

	public int getTotal() {
		return total;
	}

	public void setTotal(int total) {
		this.total = total;
	}
	
	public List<Object> getRows() {
		return rows;
	}
	
	@JSON(serialize=false) 
	public ProducePlan getPlan() {
		return plan;
	}

	public void setPlan(ProducePlan plan) {
		this.plan = plan;
	}

	/** ========================计划管理=================== **/
	SimpleDateFormat matter=new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
	/** 添加计划 **/
	public String addPlan() throws Exception {
		Date date=new Date();
		String currentdate=matter.format(date);
		Timestamp timestamp=Timestamp.valueOf(currentdate);
		ProducePlan plan1 = new ProducePlan();
		plan1.setStartTime(plan.getStartTime());
		plan1.setEndTime(plan.getEndTime());
		plan1.setStartNum(plan.getStartNum());
		plan1.setEndNum(plan.getEndNum());
		//plan1.setLoopsCount(plan.getEndNum()-plan.getStartNum());
		plan1.setCreator(plan.getCreator());
		plan1.setCreateTime(timestamp);
		planService.addPlan(plan1);
		return SUCCESS;
	}
	public void delPlan() throws Exception
	{
		Integer id=Integer.valueOf(request.getParameter("id"));
		planService.delPlan(id);
	}
	public String planDataGrid() throws Exception
	{
		QueryResult<ProducePlan> results=planService.getAllPlans(page, row);
		List<ProducePlan> userList=results.getList();
		if(userList.size()>0)
		{
			total=userList.size();
		}else
		{total=0;}
		this.rows=new ArrayList<Object>();
		if(userList.size()>0)
		{
			for(int i=0;i<userList.size();i++)
			{
				Map<String, Object> map = new HashMap<String, Object>();
				map.put("id", userList.get(i).getId());
				map.put("starttime", userList.get(i).getStartTime());
				map.put("endtime", userList.get(i).getEndTime());
				map.put("startnum", userList.get(i).getStartNum());
				map.put("endnum", userList.get(i).getEndNum());
				//map.put("total", (userList.get(i).getEndNum()-userList.get(i).getStartNum()));
				map.put("creater", userList.get(i).getCreator());
				map.put("createtime", userList.get(i).getCreateTime());
				map.put("modifier", userList.get(i).getModifier());
				map.put("modifytime", userList.get(i).getModifyTime());
				this.rows.add(map);
			}
		}
		return SUCCESS;
	}
	
	public String editPlan() throws Exception
	{
		Integer id=plan.getId();
		List planinfo = planService.findPlanById(id);
		Map request = (Map) ActionContext.getContext().get("request");
		request.put("planinfo",planinfo);
		return SUCCESS;
	}
	
	public String updatePlan() throws Exception {
		Date date=new Date();
		String currentdate=matter.format(date);
		Timestamp timestamp=Timestamp.valueOf(currentdate);
		Integer id=plan.getId();
		ProducePlan plan1=planService.findPlanEntity(id);
		plan1.setStartTime(plan.getStartTime());
		plan1.setEndTime(plan.getEndTime());
		plan1.setStartNum(plan.getStartNum());
		plan1.setEndNum(plan.getEndNum());
		plan1.setModifier(plan.getModifier());
		plan1.setModifyTime(timestamp);
		Map request=(Map)ActionContext.getContext().get("request");
		planService.updatePlan(plan1);
		return SUCCESS;
	}
	
	public String planSearch()
	{
		List plansearch=planService.planSearch(datestart,dateend);
		Map request = (Map) ActionContext.getContext().get("request");
		request.put("plansearch",plansearch);
		return SUCCESS;
	}
	
	
}
