package org.shu.construct.action;

import java.io.File;
import java.io.FileInputStream;
import java.io.InputStream;
import java.net.URLDecoder;
import java.util.ArrayList;
import java.util.Map;

import org.shu.construct.service.SoilService;
import org.shu.model.GpSoilproperty;
import org.tool.Pager;

import com.opensymphony.xwork2.ActionContext;
import common.base.action.BaseAction;
import common.base.action.ExportExcel;

@SuppressWarnings("serial")
public class SoilAction extends BaseAction {
	private InputStream fileStream;
	private Integer pageNow = 1;
	private String tcCno;
	private String excelPath;
	private SoilService soilService;

	private Integer id;

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}
	
	public InputStream getFileStream() {
		return fileStream;
	}

	public void setFileStream(InputStream fileStream) {
		this.fileStream = fileStream;
	}

	public String getExcelPath() {
		return excelPath;
	}

	public void setExcelPath(String excelPath) {
		this.excelPath = excelPath;
	}

	public String getTcCno() {
		return tcCno;
	}

	public void setTcCno(String tcCno) {
		this.tcCno = tcCno;
	}

	public Integer getPageNow() {
		return pageNow;
	}

	public void setPageNow(Integer pageNow) {
		System.out.println("pageNow="+pageNow);
		this.pageNow = pageNow;
	}

	public void setSoilService(SoilService soilService) {
		this.soilService = soilService;
	}

	public String getAllRecord() {
//		String pageNow1 = request.getParameter("pageNow");
//		pageNow=Integer.parseInt(pageNow1);
//		System.out.println("pageNow="+pageNow);
		Pager pager = new Pager(pageNow, soilService.getAll().size());
		ArrayList<GpSoilproperty> soilList = soilService.getOnePage(pageNow,
				pager.getPageSize());
		Map request = (Map) ActionContext.getContext().get("request");

		if(soilList.size()==0){
			pager.setPageNow(0);
		}
		request.put("pager", pager);
		request.put("soilList", soilList);
		return "success";
	}

	public String getById() {
		Pager pager = new Pager(pageNow, soilService.getCountById(id).size());
		ArrayList<GpSoilproperty> soilList = soilService.getOnePageById(id,
				pageNow, pager.getPageSize());
		Map request = (Map) ActionContext.getContext().get("request");

		if(soilList.size()==0){
			pager.setPageNow(0);
		}
		request.put("pager", pager);
		request.put("soilList", soilList);
		return "success";
	}

	public String getByCno() throws Exception {
		String tcCnoNew = URLDecoder.decode(
				new String(request.getParameter("tcCno").getBytes("UTF-8"),
						"UTF-8"), "UTF-8");
		Pager pager = new Pager(pageNow, soilService.getCountByCno(tcCnoNew)
				.size());
		ArrayList<GpSoilproperty> soilList = soilService.getOnePageByCno(
				tcCnoNew, pageNow, pager.getPageSize());
		Map request = (Map) ActionContext.getContext().get("request");

		if(soilList.size()==0){
			pager.setPageNow(0);
		}
		request.put("pager", pager);
		request.put("soilList", soilList);
		return SUCCESS;
	}

	public String exportExcel() throws Exception {
		String excelName = URLDecoder
				.decode(new String(request.getParameter("excelPath").getBytes(
						"UTF-8"), "UTF-8"), "UTF-8");
		String excelPathNew="d:/"+excelName;
		System.out.println("excelPathNew="+excelPathNew);
		ArrayList<GpSoilproperty> soilList = soilService.getAll();
		exportExcelCommon(soilList, excelPathNew);
		File file=new File(excelPathNew);
		if(file.exists()){
			fileStream=new FileInputStream(file);
		}
		return SUCCESS;
	}
	
	public String exportExcelByLoop() {
		Pager pager = new Pager(pageNow, soilService.getCountById(id).size());
		ArrayList<GpSoilproperty> soilList = soilService.getOnePageById(id,
				pageNow, pager.getPageSize());
		Map request = (Map) ActionContext.getContext().get("request");
		request.put("pager", pager);
		request.put("soilList", soilList);
		exportExcelCommon(soilList, excelPath);
		return SUCCESS;
	}

	public void exportExcelCommon(ArrayList<GpSoilproperty> soilList,
			String excelPath) {		
			ArrayList<String> titles = new ArrayList<String>();
			titles.add("索引号");
			titles.add("项目编号");
			titles.add("层号");
			titles.add("土层名称");
			titles.add("环号");
			titles.add("里程");
			titles.add("含水量");
			titles.add("重度");
			titles.add("比重");
			titles.add("饱和度");
			titles.add("孔隙比");
			titles.add("内摩擦角");
			titles.add("水平渗透系数");
			titles.add("垂直渗透系数");
			titles.add("粘聚力");
			titles.add("压缩模量");
			titles.add("标准贯入");
			titles.add("压缩系数");
			titles.add("静止侧压系数");
			titles.add("塑限");
			titles.add("液限");
			titles.add("液性指数");
			titles.add("塑性指数");
			titles.add("单轴抗压");
			titles.add("石英含量");
			titles.add("东西线(0—东线 1—西线)");
			ExportExcel exportExcel=new ExportExcel();
			exportExcel.exportExcelCommon(soilList, titles, excelPath);
			
	}
}