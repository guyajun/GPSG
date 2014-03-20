package org.shu.plan.action;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.shu.common.service.ProductService;
import org.shu.model.ConcPour;
import org.shu.model.FourTableSamePart;
import org.shu.model.GpSteamCuring;
import org.shu.model.GpWaterCuring;
import org.shu.model.ReportPdfMapping;

import com.opensymphony.xwork2.ActionContext;
import common.base.action.BaseAction;

@SuppressWarnings("serial")
public class ShowProductAction extends BaseAction {
	private ProductService productService;

	public ProductService getProductService() {
		return productService;
	}

	public void setProductService(ProductService productService) {
		this.productService = productService;
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

	// 制作过程管理
	@SuppressWarnings({ "unchecked", "rawtypes" })
	public String productSearch() {
		String type = request.getParameter("reporttype");
		String Id = String.valueOf(request.getParameter("reportId"));
		
		// 钢筋加工
		List<FourTableSamePart> steelsearch = new ArrayList();		
		if (type.equals("1001")) {
			List search_result=new ArrayList();
			int types = 1;
			if (reportId.length() == 0) {
				steelsearch = productService.productSearcha(types);
				for(int i=0;i<steelsearch.size();i++)
				{
					Map mp=new HashMap();
					ReportPdfMapping rpm=productService.getOnePdf(steelsearch.get(i).getReportId(),types);
					mp.put("id", steelsearch.get(i).getId());
					mp.put("reportId",steelsearch.get(i).getReportId());
					mp.put("startNum", steelsearch.get(i).getStartNum());
					mp.put("endNum", steelsearch.get(i).getEndNum());
					mp.put("checkDate",steelsearch.get(i).getCheckWorker());
					mp.put("checkMonitor",steelsearch.get(i).getCheckMonitor());
					mp.put("qualityWorker",steelsearch.get(i).getQualityWorker());
					mp.put("checkTime",steelsearch.get(i).getCheckTime());
					mp.put("url", rpm.getPdfLocation());
					search_result.add(mp);
				}
			} else {
				steelsearch = productService.productSearcha(types, Id);
			
				for(int i=0;i<steelsearch.size();i++)
				{
					Map mp=new HashMap();
					ReportPdfMapping rpm=productService.getOnePdf(steelsearch.get(i).getReportId(),types);
					mp.put("id", steelsearch.get(i).getId());
					mp.put("reportId",steelsearch.get(i).getReportId());
					mp.put("startNum", steelsearch.get(i).getStartNum());
					mp.put("endNum", steelsearch.get(i).getEndNum());
					mp.put("checkWorker",steelsearch.get(i).getCheckWorker());
					mp.put("checkMonitor",steelsearch.get(i).getCheckMonitor());
					mp.put("qualityWorker",steelsearch.get(i).getQualityWorker());
					mp.put("checkTime",steelsearch.get(i).getCheckTime());
					mp.put("url", rpm.getPdfLocation());
					search_result.add(mp);
				}
			}
			Map request = (Map) ActionContext.getContext().get("request");
			request.put("steelsearch", search_result);
			return "str1";
		}
		// 钢筋骨架制作
		if (type.equals("1002")) {
			List search_result=new ArrayList();
			int types = 2;
			if (reportId.length() == 0) {
				steelsearch = productService.productSearcha(types);
				for(int i=0;i<steelsearch.size();i++)
				{
					Map mp=new HashMap();
					ReportPdfMapping rpm=productService.getOnePdf(steelsearch.get(i).getReportId(),types);
					mp.put("id", steelsearch.get(i).getId());
					mp.put("reportId",steelsearch.get(i).getReportId());
					mp.put("startNum", steelsearch.get(i).getStartNum());
					mp.put("endNum", steelsearch.get(i).getEndNum());
					mp.put("checkWorker",steelsearch.get(i).getCheckWorker());
					mp.put("checkMonitor",steelsearch.get(i).getCheckMonitor());
					mp.put("qualityWorker",steelsearch.get(i).getQualityWorker());
					mp.put("checkTime",steelsearch.get(i).getCheckTime());
					mp.put("url", rpm.getPdfLocation());
					search_result.add(mp);
				}
			} else {
				steelsearch = productService.productSearcha(types, Id);
				for(int i=0;i<steelsearch.size();i++)
				{
					Map mp=new HashMap();
					ReportPdfMapping rpm=productService.getOnePdf(steelsearch.get(i).getReportId(),types);
					mp.put("id", steelsearch.get(i).getId());
					mp.put("reportId",steelsearch.get(i).getReportId());
					mp.put("startNum", steelsearch.get(i).getStartNum());
					mp.put("endNum", steelsearch.get(i).getEndNum());
					mp.put("checkWorker",steelsearch.get(i).getCheckWorker());
					mp.put("checkMonitor",steelsearch.get(i).getCheckMonitor());
					mp.put("qualityWorker",steelsearch.get(i).getQualityWorker());
					mp.put("checkTime",steelsearch.get(i).getCheckTime());
					mp.put("url", rpm.getPdfLocation());
					search_result.add(mp);
				}
			}
			Map request = (Map) ActionContext.getContext().get("request");
			request.put("steelsearch", search_result);
			return "str2";
		}
		
		// 混凝土浇筑
		List<ConcPour> concpour=new ArrayList();
		if (type.equals("1004")) {
			List search_result=new ArrayList();
			int types = 10;
			if (reportId.length() == 0) {
				concpour = productService.concSearch();
				for(int i=0;i<concpour.size();i++)
				{
					Map mp=new HashMap();
					ReportPdfMapping rpm=productService.getOnePdf(concpour.get(i).getReportId(),types);
					if(rpm!=null)
					{
					mp.put("id", concpour.get(i).getId());
					mp.put("reportId",concpour.get(i).getReportId());
					mp.put("startNum", concpour.get(i).getStartNum());
					mp.put("endNum", concpour.get(i).getEndNum());
					mp.put("produceDate",concpour.get(i).getProduceDate());
					mp.put("responseWorker",concpour.get(i).getResponseWorker());
					mp.put("recordWorker",concpour.get(i).getRecordWorker());
					mp.put("url", rpm.getPdfLocation());
					search_result.add(mp);
					}
				}
				
			} else {
				concpour = productService.concSearch(Id);
				for(int i=0;i<concpour.size();i++)
				{
					Map mp=new HashMap();
					ReportPdfMapping rpm=productService.getOnePdf(concpour.get(i).getReportId(),types);
					if(rpm!=null)
					{
					mp.put("id", concpour.get(i).getId());
					mp.put("reportId",concpour.get(i).getReportId());
					mp.put("startNum", concpour.get(i).getStartNum());
					mp.put("endNum", concpour.get(i).getEndNum());
					mp.put("produceDate",concpour.get(i).getProduceDate());
					mp.put("responseWorker",concpour.get(i).getResponseWorker());
					mp.put("recordWorker",concpour.get(i).getRecordWorker());
					mp.put("url", rpm.getPdfLocation());
					search_result.add(mp);
					}
				}
			}
			Map request = (Map) ActionContext.getContext().get("request");
			request.put("steelsearch", search_result);
			return "str3";
		}
		
		// 管片蒸养
		List<GpSteamCuring> steam_curing=new ArrayList();
		if (type.equals("1005")) {
			List search_result=new ArrayList();
			int types = 5;
			if (reportId.length() == 0) {
				steam_curing = productService.steamSearch(types);
				for(int i=0;i<steam_curing.size();i++)
				{
					Map mp=new HashMap();
					
					ReportPdfMapping rpm=productService.getOnePdf(steam_curing.get(i).getReportId(),types);
					if(rpm!=null)
					{
					mp.put("id", steam_curing.get(i).getId());
					mp.put("reportId",steam_curing.get(i).getReportId());
					mp.put("startNum", steam_curing.get(i).getStartNum());
					mp.put("endNum", steam_curing.get(i).getEndNum());
					mp.put("produceDate",steam_curing.get(i).getProduceDate());
					mp.put("moldNum",steam_curing.get(i).getMoldNum());
					mp.put("time",steam_curing.get(i).getTime());
					mp.put("temperature",steam_curing.get(i).getTemperature());
					mp.put("recordWorker",steam_curing.get(i).getRecordWorker());
					mp.put("url", rpm.getPdfLocation());
					search_result.add(mp);
					}
				}	
			} else {
				steam_curing = productService.steamSearch(types, Id);
				for(int i=0;i<steam_curing.size();i++)
				{
					Map mp=new HashMap();
					ReportPdfMapping rpm=productService.getOnePdf(steam_curing.get(i).getReportId(),types);
					if(rpm!=null)
					{
					mp.put("id", steam_curing.get(i).getId());
					mp.put("reportId",steam_curing.get(i).getReportId());
					mp.put("startNum", steam_curing.get(i).getStartNum());
					mp.put("endNum", steam_curing.get(i).getEndNum());
					mp.put("produceDate",steam_curing.get(i).getProduceDate());
					mp.put("moldNum",steam_curing.get(i).getMoldNum());
					mp.put("time",steam_curing.get(i).getTime());
					mp.put("temperature",steam_curing.get(i).getTemperature());
					mp.put("recordWorker",steam_curing.get(i).getRecordWorker());
					mp.put("recordWorker",steam_curing.get(i).getRecordWorker());
					mp.put("url", rpm.getPdfLocation());
					search_result.add(mp);
					}
				}	
			}
			Map request = (Map) ActionContext.getContext().get("request");
			request.put("steelsearch", search_result);
			return "str4";
		}
		
		// 放松起吊
				if (type.equals("1006")) {
					if (reportId.length() == 0) {
						steelsearch = productService.craneSearch();
					} else {
						steelsearch = productService.craneSearch(Id);
					}
					Map request = (Map) ActionContext.getContext().get("request");
					request.put("steelsearch", steelsearch);
					return "str5";
				}
				// 水养
				List<GpWaterCuring> water_curing=new ArrayList();
				if (type.equals("1007")) {
					List search_result=new ArrayList();
					int types = 6;
					if (reportId.length() == 0) {
						water_curing = productService.gpwaterSearch();
						for(int i=0;i<water_curing.size();i++)
						{
						
							Map mp=new HashMap();
							ReportPdfMapping rpm=productService.getOnePdf(water_curing.get(i).getReportId(),types);
							if(rpm!=null)
							{
							mp.put("id", water_curing.get(i).getId());
							mp.put("reportId",water_curing.get(i).getReportId());
							mp.put("startNum", water_curing.get(i).getStartNum());
							mp.put("endNum", water_curing.get(i).getEndNum());
							mp.put("produceDate",water_curing.get(i).getProduceDate());
							mp.put("inpoolTime",water_curing.get(i).getInpoolTime());
							mp.put("segmentTem",water_curing.get(i).getSegmentTem());
							mp.put("waterTem",water_curing.get(i).getWaterTem());
							mp.put("waterPh",water_curing.get(i).getWaterPh());
							mp.put("outpoolTime",water_curing.get(i).getOutpoolTime());
							mp.put("recordWorker",water_curing.get(i).getRecordWorker());
							mp.put("url", rpm.getPdfLocation());
							search_result.add(mp);
							}
						}	
					} else {
						water_curing = productService.gpwaterSearch(Id);
						for(int i=0;i<water_curing.size();i++)
						{
							Map mp=new HashMap();
							ReportPdfMapping rpm=productService.getOnePdf(water_curing.get(i).getReportId(),types);
							if(rpm!=null)
							{
							mp.put("id", water_curing.get(i).getId());
							mp.put("reportId",water_curing.get(i).getReportId());
							mp.put("startNum", water_curing.get(i).getStartNum());
							mp.put("endNum", water_curing.get(i).getEndNum());
							mp.put("produceDate",water_curing.get(i).getProduceDate());
							mp.put("inpoolTime",water_curing.get(i).getInpoolTime());
							mp.put("segmentTem",water_curing.get(i).getSegmentTem());
							mp.put("waterTem",water_curing.get(i).getWaterTem());
							mp.put("waterPh",water_curing.get(i).getWaterPh());
							mp.put("outpoolTime",water_curing.get(i).getOutpoolTime());
							mp.put("recordWorker",water_curing.get(i).getRecordWorker());
							mp.put("url", rpm.getPdfLocation());
							search_result.add(mp);
							}
						}	
					}
					Map request = (Map) ActionContext.getContext().get("request");
					request.put("steelsearch", search_result);
					return "str6";
				}
		return ERROR;
	}
}
