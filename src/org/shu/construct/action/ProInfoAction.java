package org.shu.construct.action;

import java.util.ArrayList;
import java.util.Date;
import java.util.Map;
import org.shu.construct.service.AdvanceService;
import org.shu.model.ShieldProcess;
import org.tool.Pager;
import com.opensymphony.xwork2.ActionContext;
import common.base.action.BaseAction;
@SuppressWarnings("serial")
public class ProInfoAction extends BaseAction {
	private Integer pageNow = 1;
	private Integer loop;
	private String date;
	private String excelPath;
	private AdvanceService advanceService;

	public Integer getLoop() {
		return loop;
	}

	public void setLoop(Integer loop) {
		this.loop = loop;
	}

	public String getDate() {
		return date;
	}

	public void setDate(String date) {
		this.date = date;
	}

	public void setAdvanceService(AdvanceService advanceService) {
		this.advanceService = advanceService;
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
		Pager pager = new Pager(pageNow, advanceService.getAll().size());
		ArrayList<ShieldProcess> list = advanceService.getOnePage(pageNow,
				pager.getPageSize());
		Map request = (Map) ActionContext.getContext().get("request");
		request.put("pager", pager);
		request.put("list", list);
		return "success";
	}

	public String getByLoop() {
		Pager pager = new Pager(pageNow, advanceService.getCountByLoop(loop)
				.size());
		ArrayList<ShieldProcess> list = advanceService.getOnePageByLoop(loop,
				pageNow, pager.getPageSize());
		Map request = (Map) ActionContext.getContext().get("request");
		request.put("pager", pager);
		request.put("list", list);
		return "success";
	}

	public String getByDate() throws Exception {
		Date dateNew = java.sql.Date.valueOf(date);
		Pager pager = new Pager(pageNow, advanceService.getCountByDate(dateNew).size());
		ArrayList<ShieldProcess> list = advanceService.getOnePageByDate(
				dateNew, pageNow, pager.getPageSize());
		Map request = (Map) ActionContext.getContext().get("request");
		request.put("pager", pager);
		request.put("list", list);
		return SUCCESS;
	}
}