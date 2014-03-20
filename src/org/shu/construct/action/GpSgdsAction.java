package org.shu.construct.action;

import java.net.URLDecoder;
import java.util.ArrayList;
import java.util.Date;
import java.util.Map;
import org.shu.construct.service.GpSgdsService;
import org.shu.model.GpSgds;
import org.tool.Pager;
import com.opensymphony.xwork2.ActionContext;
import common.base.action.BaseAction;
import common.base.action.ExportExcel;

public class GpSgdsAction extends BaseAction{

	private static final long serialVersionUID = 1L;
	private Integer pageNow = 1;
	private GpSgdsService sgdsService;

	public void setSgdsService(GpSgdsService sgdsService) {
		this.sgdsService = sgdsService;
	}
	private String date;
	public String getDate() {
		return date;
	}
	public void setDate(String date) {
		this.date = date;
	}
	private String excelPath;
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
	public String getByDate() throws Exception {
		Date dateNew = java.sql.Date.valueOf(date);
		Pager pager = new Pager(pageNow, sgdsService.getCountByDate(dateNew).size());
		ArrayList<GpSgds> sgdsList = sgdsService.getOnePageByDate(
				dateNew, pageNow, pager.getPageSize());
		Map request = (Map) ActionContext.getContext().get("request");
		request.put("pager", pager);
		request.put("sgdsList", sgdsList);
		return SUCCESS;
	}
	public String exportExcel() throws Exception {
		String excelPathNew = URLDecoder
				.decode(new String(request.getParameter("excelPath").getBytes(
						"UTF-8"), "UTF-8"), "UTF-8");
		ArrayList<GpSgds> sgdsList = sgdsService.getAll();
		exportExcelCommon(sgdsList, excelPathNew);
		return SUCCESS;
	}

	public String sgds() throws Exception{
		Pager pager = new Pager(pageNow, sgdsService.getGpSgds().size());
		ArrayList<GpSgds> sgdsList = sgdsService.getGpSgdsByPage(pageNow,
				pager.getPageSize());
		Map request = (Map) ActionContext.getContext().get("request");
		request.put("pager", pager);
		request.put("sgdsList", sgdsList);
		return SUCCESS;
	}
	public void exportExcelCommon(ArrayList<GpSgds> sgdsList,
			String excelPath) {
		ArrayList<String> titles = new ArrayList<String>();
		titles.add("推进环号 ");
		titles.add("项目编号 ");
		titles.add("推进日期 ");
		titles.add("压力设定上限 " );
		titles.add("压力实际上限  ");
		titles.add("压力设定下限 ");
		titles.add("压力实际下限 ");
		titles.add("压力检测时间  ");
		titles.add("方量设定值 	");
		titles.add("方量实际值 	");
		titles.add("浆液指标 ");
		titles.add("坍落度 ");
		titles.add("意外情况");
		titles.add("东西线(0—东线 1—西线)");
		ExportExcel exportExcel = new ExportExcel();
		exportExcel.exportExcelCommon(sgdsList, titles, excelPath);

	}
}
