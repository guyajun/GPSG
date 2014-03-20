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

	/** ========================ԭ���ϱ������=================== **/

	// ���������
	@SuppressWarnings({ "unchecked", "rawtypes" })
	public String chuchangSearch() {
		String type = request.getParameter("reporttype");
		
		String Id = String.valueOf(request.getParameter("reportId"));
		List steelsearch = new ArrayList();
		// ��������֤����
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
		// ���ռ�¼
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
		// �ѳ���ѯ
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
