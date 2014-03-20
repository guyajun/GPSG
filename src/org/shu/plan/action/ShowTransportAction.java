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
public class ShowTransportAction extends BaseAction {

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
	public String chuchangSearch() {
		String type = request.getParameter("reporttype");
		
		String Id = String.valueOf(request.getParameter("reportId"));
		List steelsearch = new ArrayList();
		// 出厂质量证明书
		if (type.equals("1001")) {
			if (reportId.length() == 0) {
				steelsearch = checkService.gpQuality();
			} else {
				steelsearch = checkService.gpQuality(Id);
			}
			Map request = (Map) ActionContext.getContext().get("request");
			request.put("steelsearch", steelsearch);
			return "str1";
		}
		// 接收记录
		if (type.equals("1002")) {
			if (reportId.length() == 0) {
				steelsearch = checkService.gpReceive();
			} else {
				steelsearch = checkService.gpReceive(Id);
			}
			Map request = (Map) ActionContext.getContext().get("request");
			request.put("steelsearch", steelsearch);
			return "str2";
		}
		// 堆场查询
		if (type.equals("1003")) {
			if (reportId.length() == 0) {
				steelsearch = checkService.gpStorage();
			} else {
				steelsearch = checkService.gpStorage(Id);
			}
			Map request = (Map) ActionContext.getContext().get("request");
			request.put("steelsearch", steelsearch);
			return "str3";
		}
		return ERROR;
	}
}
