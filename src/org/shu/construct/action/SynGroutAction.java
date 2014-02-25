package org.shu.construct.action;

import java.net.URLDecoder;
import java.sql.Timestamp;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.Map;

import org.shu.construct.service.SynService;
import org.shu.model.SynchronousGrout;
import org.tool.Pager;

import com.opensymphony.xwork2.ActionContext;
import common.base.action.BaseAction;
import common.base.action.ExportExcel;

public class SynGroutAction extends BaseAction {

	private static final long serialVersionUID = 1L;
	private Integer pageNow = 1;
	private SynService synService;
	private Integer tunnelLoop;
	private String date;
	private String excelPath;

	public String getDate() {
		return date;
	}

	public void setDate(String date) {

		System.out.println("date=" + date);
		this.date = date;
	}

	public String getExcelPath() {
		return excelPath;
	}

	public void setExcelPath(String excelPath) {
		this.excelPath = excelPath;
	}

	public Integer getTunnelLoop() {
		return tunnelLoop;
	}

	public void setTunnelLoop(Integer tunnelLoop) {
		this.tunnelLoop = tunnelLoop;
	}

	public Integer getPageNow() {
		return pageNow;
	}

	public void setPageNow(Integer pageNow) {
		this.pageNow = pageNow;
	}

	public String exportExcel() throws Exception {
		String excelPathNew = URLDecoder
				.decode(new String(request.getParameter("excelPath").getBytes(
						"UTF-8"), "UTF-8"), "UTF-8");
		ArrayList<SynchronousGrout> groutList = synService.getAll();
		exportExcelCommon(groutList, excelPathNew);
		return SUCCESS;
	}

	public String getBytunnelLoop() {
		ArrayList<SynchronousGrout> groutList = synService
				.groutSearchByLoop(tunnelLoop);
		Map request = (Map) ActionContext.getContext().get("request");
		Pager pager=new Pager(1,groutList.size());
		if(groutList.size()==0){
			pager.setPageNow(0);
		}
		request.put("pager", pager);
		request.put("groutList", groutList);
		return "success";
	}

	public String syn() throws Exception {
		Pager pager = new Pager(pageNow, synService.getSynGrout().size());
		ArrayList<SynchronousGrout> groutList = synService
				.getSynchronousGroutByPage(pageNow, pager.getPageSize());
		// ArrayList<String> list=new ArrayList<String>();
		// for(int i=0;i<groutList.size();i++){
		// String dateNew =groutList.get(i).getToday().toString().split(" ")[0];
		// list.add(dateNew);
		// }
		// System.out.println("today="+dateNew);
		Map request = (Map) ActionContext.getContext().get("request");
		if (groutList.size() == 0) {
			pager.setPageNow(0);
		}
		request.put("pager", pager);
		request.put("groutList", groutList);
		// request.put("list", list);
		return SUCCESS;
	}

	public String getByDate() throws Exception {
		System.out.println("date=" + date);
		Date dateNew = new Date(date);
		Pager pager = new Pager(pageNow, synService.getCountByDate(dateNew)
				.size());
		ArrayList<SynchronousGrout> groutList = synService.getOnePageByDate(
				dateNew, pageNow, pager.getPageSize());
		Map request = (Map) ActionContext.getContext().get("request");
		if (groutList.size() == 0) {
			pager.setPageNow(0);
		}
		request.put("pager", pager);
		request.put("groutList", groutList);
		return SUCCESS;
	}

	public SynService getSynService() {
		return synService;
	}

	public void setSynService(SynService synService) {
		this.synService = synService;
	}

	public void exportExcelCommon(ArrayList<SynchronousGrout> synList,
			String excelPath) {
		ArrayList<String> titles = new ArrayList<String>();
		titles.add("推进环号 ");
		titles.add("项目编号 ");
		titles.add("推进日期 ");
		titles.add("压力设定上限 ");
		titles.add("压力实际上限  ");
		titles.add("压力设定下限 ");
		titles.add("压力实际下限 ");
		titles.add("压力检测时间  ");
		titles.add("方量设定值 	");
		titles.add("方量实际值 	");
		titles.add("浆液指标 ");
		titles.add("坍落度 ");
		titles.add("意外情况");
		titles.add("备注");
		titles.add("记录人");
		titles.add("记录时间");
		titles.add("状态");
		titles.add("东西线(0—东线 1—西线)");
		ExportExcel exportExcel = new ExportExcel();
		exportExcel.exportExcelCommon(synList, titles, excelPath);

	}
}
