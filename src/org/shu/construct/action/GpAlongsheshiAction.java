package org.shu.construct.action;

import java.net.URLDecoder;
import java.util.ArrayList;
import java.util.Map;
import org.shu.construct.service.GpAlongsheshiService;
import org.shu.construct.service.ShieldPoseService;
import org.shu.model.GpAlongsheshi;
import org.shu.model.GpSoilproperty;
import org.shu.model.ShieldPose;
import org.tool.Pager;

import com.opensymphony.xwork2.ActionContext;

import common.base.action.BaseAction;
import common.base.action.ExportExcel;

public class GpAlongsheshiAction extends BaseAction{

	private static final long serialVersionUID = 1L;
	private Integer pageNow = 1;
	private GpAlongsheshiService sheshiService;
	private Integer ssIndx;
	private String excelPath;
	private Integer ssLoop;
	public Integer getSsLoop() {
		return ssLoop;
	}
	public void setSsLoop(Integer ssLoop) {
		this.ssLoop = ssLoop;
	}
	public String getExcelPath() {
		return excelPath;
	}
	public void setExcelPath(String excelPath) {
		this.excelPath = excelPath;
	}
	public Integer getSsIndx() {
		return ssIndx;
	}
	public void setSsIndx(Integer ssIndx) {
		this.ssIndx = ssIndx;
	}
	public Integer getPageNow() {
		return pageNow;
	}
	public void setPageNow(Integer pageNow) {
		System.out.println("pageNow=" + pageNow);
		this.pageNow = pageNow;
	}
	public String exportExcel() throws Exception {
		String excelPathNew = URLDecoder
				.decode(new String(request.getParameter("excelPath").getBytes(
						"UTF-8"), "UTF-8"), "UTF-8");
		ArrayList<GpAlongsheshi> sheshiList = sheshiService.getAll();
		exportExcelCommon(sheshiList, excelPathNew);
		return SUCCESS;
	}
	
	public String getByssLoop() {
		Pager pager = new Pager(1,1);
		ArrayList<GpAlongsheshi> sheshiList = sheshiService.getCountByLoop(ssLoop); 
		Map request = (Map) ActionContext.getContext().get("request");
		request.put("pager", pager);
		request.put("sheshiList", sheshiList);
		return "success";
	}
	public String getByssIndx() {
		Pager pager = new Pager(1,1);
		ArrayList<GpAlongsheshi> sheshiList = sheshiService.getCountById(ssIndx); 
		Map request = (Map) ActionContext.getContext().get("request");
		request.put("pager", pager);
		request.put("sheshiList", sheshiList);
		return "success";
	}
	
	public String sheshi() throws Exception{
		Pager pager = new Pager(pageNow, sheshiService.getSheshi().size());
		ArrayList<GpAlongsheshi> sheshiList = sheshiService.getGpAlongsheshiByPage(pageNow,
				pager.getPageSize());
		Map request = (Map) ActionContext.getContext().get("request");
		request.put("pager", pager);
		request.put("sheshiList", sheshiList);
		return SUCCESS;
	}
	public GpAlongsheshiService getSheshiService() {
		return sheshiService;
	}
	public void setSheshiService(GpAlongsheshiService sheshiService) {
		this.sheshiService = sheshiService;
	}
	public void exportExcelCommon(ArrayList<GpAlongsheshi> sheshiList,
			String excelPath) {
		ArrayList<String> titles = new ArrayList<String>();
		titles.add("索引号");
		titles.add("项目编号");
		titles.add("环号");
		titles.add("里程");
		titles.add("建筑物名称");
		titles.add("建筑物保护等级");
		titles.add("建筑物名建造年份");
		titles.add("建筑物结构");
		titles.add("建筑物用途");
		titles.add("穿越形式");
		titles.add("基础形式");
		titles.add("基底标高");
		titles.add("桩基与隧道间距");
		titles.add("允许差异沉降");
		titles.add("允许隆起沉降");
		titles.add("相关测点列表");
		titles.add("允许倾斜");
		titles.add("东西线(0—东线 1—西线)");
		ExportExcel exportExcel = new ExportExcel();
		exportExcel.exportExcelCommon(sheshiList, titles, excelPath);

	}
}


