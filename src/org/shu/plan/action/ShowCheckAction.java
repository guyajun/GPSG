package org.shu.plan.action;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.shu.common.service.CheckService;
import org.shu.common.service.ProductService;
import org.shu.model.FourTableSamePart;
import org.shu.model.GpAssemble;
import org.shu.model.GpCheckLeak;
import org.shu.model.ReportPdfMapping;
import org.shu.model.SteelSkelHalf;

import com.opensymphony.xwork2.ActionContext;
import common.base.action.BaseAction;

@SuppressWarnings("serial")
public class ShowCheckAction extends BaseAction {

	private CheckService checkService;
	private ProductService productService;

	public ProductService getProductService() {
		return productService;
	}

	public void setProductService(ProductService productService) {
		this.productService = productService;
	}

	public CheckService getCheckService() {
		return checkService;
	}

	public void setCheckService(CheckService checkService) {
		this.checkService = checkService;
	}

	private String reporttype;
	private String reportId;

	public String getReportId() {
		return reportId;
	}

	public void setReportId(String reportId) {
		this.reportId = reportId;
	}

	public String getReporttype() {
		return reporttype;
	}

	public void setReporttype(String reporttype) {
		this.reporttype = reporttype;
	}

	/** ========================原材料报告管理=================== **/

	// 检验检测管理
	@SuppressWarnings({ "unchecked", "rawtypes" })
	public String checkSearch() {
		String type = request.getParameter("reporttype");
	
		String Id = String.valueOf(request.getParameter("reportId"));
		List steelsearch = new ArrayList();
		// 混凝土抗压
		if (type.equals("1001")) {
			if (reportId.length() == 0) {
				steelsearch = checkService.concResistComp();
			} else {
				steelsearch = checkService.concResistComp(Id);
			}
			Map request = (Map) ActionContext.getContext().get("request");
			request.put("steelsearch", steelsearch);
			return "str1";
		}
		// 混凝土抗渗
		if (type.equals("1002")) {
			if (reportId.length() == 0) {
				steelsearch = checkService.concResistLeak();
			} else {
				steelsearch = checkService.concResistLeak(Id);
			}
			Map request = (Map) ActionContext.getContext().get("request");
			request.put("steelsearch", steelsearch);
			return "str2";
		}
		// 钢筋骨架半成品抽查
		List<SteelSkelHalf> ftsteelsearch = new ArrayList();
		if (type.equals("1003")) {
			List search_result = new ArrayList();
			int types = 7;
			if (reportId.length() == 0) {
				ftsteelsearch = checkService.steelSkelHalf();
				for (int i = 0; i < ftsteelsearch.size(); i++) {
					Map mp = new HashMap();
					ReportPdfMapping rpm = checkService.getOnePdf(ftsteelsearch
							.get(i).getReportId(), types);
					mp.put("id", ftsteelsearch.get(i).getId());
					mp.put("reportId", ftsteelsearch.get(i).getReportId());
					mp.put("startNum", ftsteelsearch.get(i).getStartNum());
					mp.put("endNum", ftsteelsearch.get(i).getEndNum());
					mp.put("checkDate", ftsteelsearch.get(i).getCheckDate());
					mp.put("recordWorker", ftsteelsearch.get(i)
							.getRecordWorker());
					if(rpm != null){
						mp.put("url", rpm.getPdfLocation());
						}else{
							mp.put("url","暂无");
						}
					search_result.add(mp);
				}

			} else {
				ftsteelsearch = checkService.steelSkelHalf(Id);
				for (int i = 0; i < ftsteelsearch.size(); i++) {
					Map mp = new HashMap();
					ReportPdfMapping rpm = checkService.getOnePdf(ftsteelsearch.get(i).getReportId(), types);
					mp.put("id", ftsteelsearch.get(i).getId());
					mp.put("reportId", ftsteelsearch.get(i).getReportId());
					mp.put("startNum", ftsteelsearch.get(i).getStartNum());
					mp.put("endNum", ftsteelsearch.get(i).getEndNum());
					mp.put("checkDate", ftsteelsearch.get(i).getCheckDate());
//					mp.put("checkResult", ftsteelsearch.get(i).getCheckResult());
					mp.put("recordWorker", ftsteelsearch.get(i)
							.getRecordWorker());
					if(rpm != null){
						mp.put("url", rpm.getPdfLocation());
						}else{
							mp.put("url","暂无");
						}
					search_result.add(mp);
				}
			}
			Map request = (Map) ActionContext.getContext().get("request");
			request.put("steelsearch", search_result);
			return "str3";
		}

		// 钢模质量检查
		List<FourTableSamePart> modecheck = new ArrayList();
		if (type.equals("1004")) {
			List search_result = new ArrayList();
			int types = 3;
			if (reportId.length() == 0) {
				modecheck = checkService.productSearch(types);
				for (int i = 0; i < modecheck.size(); i++) {
					Map mp = new HashMap();

					ReportPdfMapping rpm = checkService.getOnePdf(modecheck
							.get(i).getReportId(), types);
					mp.put("id", modecheck.get(i).getId());
					mp.put("reportId", modecheck.get(i).getReportId());
					mp.put("startNum", modecheck.get(i).getStartNum());
					mp.put("endNum", modecheck.get(i).getEndNum());
					mp.put("checkWorker", modecheck.get(i).getCheckWorker());
					mp.put("checkMonitor", modecheck.get(i).getCheckMonitor());
					mp.put("qualityWorker", modecheck.get(i).getQualityWorker());
					mp.put("checkTime", modecheck.get(i).getCheckTime());
					if(rpm != null){
					mp.put("url", rpm.getPdfLocation());
					}else{
						mp.put("url","暂无");
					}
					search_result.add(mp);
				}
			} else {
				modecheck = checkService.productSearch(types, Id);
				for (int i = 0; i < modecheck.size(); i++) {
					Map mp = new HashMap();
					ReportPdfMapping rpm = checkService.getOnePdf(modecheck
							.get(i).getReportId(), types);
					mp.put("id", modecheck.get(i).getId());
					mp.put("reportId", modecheck.get(i).getReportId());
					mp.put("startNum", modecheck.get(i).getStartNum());
					mp.put("endNum", modecheck.get(i).getEndNum());
					mp.put("checkWorker", modecheck.get(i).getCheckWorker());
					mp.put("checkMonitor", modecheck.get(i).getCheckMonitor());
					mp.put("qualityWorker", modecheck.get(i).getQualityWorker());
					mp.put("checkTime", modecheck.get(i).getCheckTime());
					if(rpm != null){
						mp.put("url", rpm.getPdfLocation());
						}else{
							mp.put("url","暂无");
						}
					search_result.add(mp);
				}
			}
			Map request = (Map) ActionContext.getContext().get("request");
			request.put("steelsearch", search_result);
			return "str4";
		}

		// 管片外观及尺寸检查
		List<FourTableSamePart> modecheck2 = new ArrayList();
		if (type.equals("1005")) {
			List search_result = new ArrayList();
			int types = 4;
			if (reportId.length() == 0) {
				modecheck2 = checkService.productSearch(types);
				for (int i = 0; i < modecheck2.size(); i++) {
				
					Map mp = new HashMap();
					ReportPdfMapping rpm = checkService.getOnePdf(modecheck2
							.get(i).getReportId(), types);
					mp.put("id", modecheck2.get(i).getId());
					mp.put("reportId", modecheck2.get(i).getReportId());
					mp.put("startNum", modecheck2.get(i).getStartNum());
					mp.put("endNum", modecheck2.get(i).getEndNum());
					mp.put("checkWorker", modecheck2.get(i).getCheckWorker());
					mp.put("checkMonitor", modecheck2.get(i).getCheckMonitor());
					mp.put("qualityWorker", modecheck2.get(i).getQualityWorker());
					mp.put("checkTime", modecheck2.get(i).getCheckTime());
					if(rpm != null){
						mp.put("url", rpm.getPdfLocation());
						}else{
							mp.put("url","暂无");
						}
					search_result.add(mp);
				}
			} else {
				modecheck = checkService.productSearch(types, Id);
				for (int i = 0; i < modecheck.size(); i++) {
					Map mp = new HashMap();
					ReportPdfMapping rpm = checkService.getOnePdf(modecheck
							.get(i).getReportId(), types);
					mp.put("id", modecheck.get(i).getId());
					mp.put("reportId", modecheck.get(i).getReportId());
					mp.put("startNum", modecheck.get(i).getStartNum());
					mp.put("endNum", modecheck.get(i).getEndNum());
					mp.put("checkWorker", modecheck.get(i).getCheckWorker());
					mp.put("checkMonitor", modecheck.get(i).getCheckMonitor());
					mp.put("qualityWorker", modecheck.get(i).getQualityWorker());
					mp.put("checkTime", modecheck.get(i).getCheckTime());
					if(rpm != null){
						mp.put("url", rpm.getPdfLocation());
						}else{
							mp.put("url","暂无");
						}
					search_result.add(mp);
				}
			}
			Map request = (Map) ActionContext.getContext().get("request");
			request.put("steelsearch", search_result);
			return "str5";
		}
		// 水平拼装
		List<GpAssemble> gp_assemble=new ArrayList();
		if (type.equals("1006")) {
			List search_result = new ArrayList();
			int types = 11;
			if (reportId.length() == 0) {
				gp_assemble = checkService.gpAssemble(types);
				for (int i = 0; i < gp_assemble.size(); i++) {
					Map mp = new HashMap();
					ReportPdfMapping rpm = checkService.getOnePdf(gp_assemble
							.get(i).getReportId(), types);
					mp.put("id", gp_assemble.get(i).getId());
					mp.put("reportId", gp_assemble.get(i).getReportId());
					mp.put("startNum", gp_assemble.get(i).getStartNum());
					mp.put("endNum", gp_assemble.get(i).getEndNum());
					mp.put("produceDate", gp_assemble.get(i).getProduceDate());
					mp.put("inspector", gp_assemble.get(i).getInspector());
					mp.put("supervisor", gp_assemble.get(i).getSupervisor());
					mp.put("checkTime", gp_assemble.get(i).getCheckTime());
					if(rpm != null){
						mp.put("url", rpm.getPdfLocation());
						}else{
							mp.put("url","暂无");
						}
					search_result.add(mp);
				}

			} else {
				ftsteelsearch = checkService.gpAssemble(types, Id);
				for (int i = 0; i < ftsteelsearch.size(); i++) {
					Map mp = new HashMap();
					ReportPdfMapping rpm = checkService.getOnePdf(gp_assemble
							.get(i).getReportId(), types);
					mp.put("id", gp_assemble.get(i).getId());
					mp.put("reportId", gp_assemble.get(i).getReportId());
					mp.put("startNum", gp_assemble.get(i).getStartNum());
					mp.put("endNum", gp_assemble.get(i).getEndNum());
					mp.put("produceDate", gp_assemble.get(i).getProduceDate());
					mp.put("inspector", gp_assemble.get(i).getInspector());
					mp.put("supervisor", gp_assemble.get(i).getSupervisor());
					mp.put("checkTime", gp_assemble.get(i).getCheckTime());
					if(rpm != null){
						mp.put("url", rpm.getPdfLocation());
						}else{
							mp.put("url","暂无");
						}
					search_result.add(mp);
				}
			}
			Map request = (Map) ActionContext.getContext().get("request");
			request.put("steelsearch", search_result);
			return "str6";
		}

		// 管片检漏
		List<GpCheckLeak> checkleak=new ArrayList();
		if (type.equals("1007")) {
			List search_result = new ArrayList();
			int types = 9;
			if (reportId.length() == 0) {
				checkleak = checkService.gpCheckLeak(types);
				for (int i = 0; i < checkleak.size(); i++) {
					Map mp = new HashMap();
					ReportPdfMapping rpm = checkService.getOnePdf(checkleak
							.get(i).getReportId(), types);
					mp.put("id", checkleak.get(i).getId());
					mp.put("reportId", checkleak.get(i).getReportId());
					mp.put("startNum", checkleak.get(i).getStartNum());
					mp.put("endNum", checkleak.get(i).getEndNum());
					mp.put("isQualified", checkleak.get(i).getIsQualified());
					mp.put("checkWorker", checkleak.get(i).getCheckWorker());
					mp.put("supervisorWorker", checkleak.get(i).getSupervisorWorker());
					if(rpm != null){
						mp.put("url", rpm.getPdfLocation());
						}else{
							mp.put("url","暂无");
						}
					search_result.add(mp);
				}
				
				
			} else {
				checkleak = checkService.gpCheckLeak(types, Id);
				for (int i = 0; i < checkleak.size(); i++) {
					Map mp = new HashMap();
					ReportPdfMapping rpm = checkService.getOnePdf(checkleak
							.get(i).getReportId(), types);
					mp.put("id", checkleak.get(i).getId());
					mp.put("reportId", checkleak.get(i).getReportId());
					mp.put("startNum", checkleak.get(i).getStartNum());
					mp.put("endNum", checkleak.get(i).getEndNum());
					mp.put("isQualified", checkleak.get(i).getIsQualified());
					mp.put("checkWorker", checkleak.get(i).getCheckWorker());
					mp.put("supervisorWorker", checkleak.get(i).getSupervisorWorker());
					if(rpm != null){
						mp.put("url", rpm.getPdfLocation());
						}else{
							mp.put("url","暂无");
						}
					search_result.add(mp);
				}
				
			}
			Map request = (Map) ActionContext.getContext().get("request");
			request.put("steelsearch", search_result);
			return "str7";
		}

		return ERROR;
	}
}
