package org.shu.construct.action;

import java.util.ArrayList;
import java.util.Map;
import org.shu.construct.service.MonitorService;
import org.shu.model.GpGroundsettling;
import org.tool.Pager;
import com.opensymphony.xwork2.ActionContext;
import common.base.action.BaseAction;

@SuppressWarnings("serial")
public class MonitorAction extends BaseAction {
	private Integer pageNow = 1;
	private String date;
	private String number; 
	private String excelPath;
	private MonitorService monitorService;	
	public String getNumber() {
		return number;
	}
	public void setNumber(String number) {
		this.number = number;
	}
	public String getDate() {
		return date;
	}
	public void setDate(String date) {
		this.date = date;
	}	
	public void setMonitorService(MonitorService monitorService) {
		this.monitorService = monitorService;
	}
	public String getExcelPath() {
		return excelPath;
	}
	public void setExcelPath(String excelPath) {
		this.excelPath = excelPath;
	}
	public Integer getPageNow() {
		return pageNow;
	}
	public void setPageNow(Integer pageNow) {
		this.pageNow = pageNow;
	}

	public String getAllRecord() {
		Pager pager = new Pager(pageNow, monitorService.getAll().size());
		ArrayList<GpGroundsettling> list = monitorService.getOnePage(pageNow,
				pager.getPageSize());
		Map request = (Map) ActionContext.getContext().get("request");

		if(list.size()==0){
			pager.setPageNow(0);
		}
		request.put("pager", pager);
		request.put("list", list);
		return "success";
	}

	public String getByNumber() {
		Pager pager = new Pager(pageNow, monitorService.getCountByNumber(number)
				.size());
		ArrayList<GpGroundsettling> list = monitorService.getOnePageByNumber(number,
				pageNow, pager.getPageSize());
		Map request = (Map) ActionContext.getContext().get("request");
		if(list.size()==0){
			pager.setPageNow(0);
		}
		request.put("pager", pager);
		request.put("list", list);
		return "success";
	}

}