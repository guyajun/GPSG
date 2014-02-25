package org.shu.construct.action;

import java.util.ArrayList;
import java.util.Date;
import java.util.Map;

import org.shu.construct.service.AdvanceService;
import org.shu.model.ShieldProcess;
import org.tool.Pager;

import com.opensymphony.xwork2.ActionContext;
import common.base.action.BaseAction;
import common.base.action.ExportExcel;

@SuppressWarnings("serial")
public class AdvanceAction extends BaseAction {
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

		if(list.size()==0){
			pager.setPageNow(0);
		}
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
		if(list.size()==0){
			pager.setPageNow(0);
		}
		request.put("pager", pager);
		request.put("list", list);
		return SUCCESS;
	}

	public String exportExcel() throws Exception {
		ArrayList<ShieldProcess> list = advanceService.getAll();
		exportExcelCommon(list, excelPath);
		return SUCCESS;
	}

	public String excelBetween() {
		String loo1=request.getParameter("loop1");
		String loo2=request.getParameter("loop2");
		int loop1=Integer.parseInt(loo1);
		int loop2=Integer.parseInt(loo2);
		Pager pager = new Pager(pageNow, advanceService.getCountByBetweenLoops(loop1, loop2).size());
		ArrayList<ShieldProcess> list = advanceService.getByBetweenLoops(loop1, loop2, pageNow, pager.getPageSize());
		Map request = (Map) ActionContext.getContext().get("request");
		request.put("pager", pager);
		request.put("list", list);
		exportExcelCommon(list, excelPath);
		return SUCCESS;
	}

	public void exportExcelCommon(ArrayList<ShieldProcess> list,
			String excelPath) {
		ArrayList<String> titles = new ArrayList<String>();
		titles.add("序号");
		titles.add("推进环号");
		titles.add("项目编号");
		titles.add("推进日期");
		titles.add("推进开始时间");
		titles.add("推进结束时间");
		titles.add("掘进速度");
		titles.add("盾构总推力");
		titles.add("刀盘扭矩");
		titles.add("大刀盘转速");
		titles.add("贯入度速度");
		titles.add("搅拌机扭矩左/右");
		titles.add("千斤顶行程_推进开始A/B/C/D/E/F");
		titles.add("千斤顶行程_推进结束A/B/C/D/E/F");
		titles.add("千斤顶油压_推进开始A/B/C/D/E/F");
		titles.add("千斤顶油压_推进结束A/B/C/D/E/F");
		titles.add("气泡仓设定值");
		titles.add("气泡仓压力推进开始/中途/结束");
		titles.add("气泡仓液位推进开始/中途/结束");
		titles.add("进泥流量推进开始/中途/结束");
		titles.add("排泥流量推进开始/中途/结束");
		titles.add("进泥密度推进开始/中途/结束");
		titles.add("排泥密度推进开始/中途/结束");
		titles.add("盾尾油脂注入量前部/中部/后部");
		titles.add("盾尾油脂剩余量前部/中部/后部");
		titles.add("盾尾油脂用量前部/中部/后部");
		titles.add("用量总量");
		titles.add("记录人");
		titles.add("记录日期");
		titles.add("备注");
		titles.add("报表状态");
		titles.add("班次");
		titles.add("东西线（0-东 1-西）");
		ExportExcel exportExcel = new ExportExcel();
		exportExcel.exportExcelCommon(list, titles, excelPath);
	}
}