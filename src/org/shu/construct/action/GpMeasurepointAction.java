package org.shu.construct.action;

import java.net.URLDecoder;
import java.util.ArrayList;
import java.util.Map;
import org.shu.construct.service.GpAlongsheshiService;
import org.shu.construct.service.GpMeasurepointService;
import org.shu.construct.service.ShieldPoseService;
import org.shu.model.GpAlongsheshi;
import org.shu.model.GpMeasurepoint;
import org.shu.model.GpSoilproperty;
import org.shu.model.ShieldPose;
import org.tool.Pager;

import com.opensymphony.xwork2.ActionContext;

import common.base.action.BaseAction;
import common.base.action.ExportExcel;

public class GpMeasurepointAction extends BaseAction{

	private static final long serialVersionUID = 1L;
	private Integer pageNow = 1;
	private GpMeasurepointService measureService;
	private Integer cbIndx;
	private String cbCdno;
	private String excelPath;
	public String getExcelPath() {
		return excelPath;
	}
	public void setExcelPath(String excelPath) {
		this.excelPath = excelPath;
	}
	public Integer getCbIndx() {
		return cbIndx;
	}
	public void setCbIndx(Integer cbIndx) {
		this.cbIndx = cbIndx;
	}
	public String getCbCdno() {
		return cbCdno;
	}
	public void setCbCdno(String cbCdno) {
		this.cbCdno = cbCdno;
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
		ArrayList<GpMeasurepoint> measureList = measureService.getAll();
		exportExcelCommon(measureList, excelPathNew);
		return SUCCESS;
	}
	public String getByCbIndx() {
		Pager pager = new Pager(1,1);
		ArrayList<GpMeasurepoint> measureList = measureService.getCountById(cbIndx); 
		Map request = (Map) ActionContext.getContext().get("request");
		if(measureList.size()==0){
			pager.setPageNow(0);
		}
		request.put("pager", pager);
		request.put("measureList", measureList);
		return "success";
	}
	
	public String measure() throws Exception{
		Pager pager = new Pager(pageNow, measureService.getMeasure().size());
		ArrayList<GpMeasurepoint> measureList = measureService.getGpMeasurepointByPage(pageNow,
				pager.getPageSize());
		Map request = (Map) ActionContext.getContext().get("request");
		if(measureList.size()==0){
			pager.setPageNow(0);
		}
		request.put("pager", pager);
		request.put("measureList", measureList);
		return SUCCESS;
	}
	public String getByCdno() throws Exception {
		String cbCdnoNew = URLDecoder.decode(
				new String(request.getParameter("cbCdno").getBytes("UTF-8"),
						"UTF-8"), "UTF-8");
		Pager pager = new Pager(pageNow, measureService.getCountByCno(cbCdnoNew)
				.size());
		ArrayList<GpMeasurepoint> measureList = measureService.getOnePageByCno(
				cbCdnoNew, pageNow, pager.getPageSize());
		Map request = (Map) ActionContext.getContext().get("request");
		if(measureList.size()==0){
			pager.setPageNow(0);
		}
		request.put("pager", pager);
		request.put("measureList", measureList);
		return SUCCESS;
	}
	public GpMeasurepointService getMeasureService() {
		return measureService;
	}
	public void setMeasureService(GpMeasurepointService measureService) {
		this.measureService = measureService;
	}
	public void exportExcelCommon(ArrayList<GpMeasurepoint> measureList,
			String excelPath) {
		ArrayList<String> titles = new ArrayList<String>();
		titles.add("索引号");
		titles.add("项目编号");
		titles.add("测点名称");
		titles.add("测点类型");
		titles.add("里程");
		titles.add("隧道坐标(X)");
		titles.add("隧道坐标(Y)");
		titles.add("组坐标(X)");
		titles.add("组坐标(Y)");
		titles.add("基准");
		titles.add("相关建筑物");
		titles.add("东西线(0—东线 1—西线)");
		ExportExcel exportExcel = new ExportExcel();
		exportExcel.exportExcelCommon(measureList, titles, excelPath);

	}

}
