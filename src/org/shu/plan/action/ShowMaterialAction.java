package org.shu.plan.action;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import org.apache.struts2.json.annotations.JSON;
import org.shu.common.service.MaterialService;
import org.shu.model.ConcQual;
import org.shu.model.SteelQual;
import org.shu.model.SteelRaw;

import com.opensymphony.xwork2.ActionContext;
import common.base.action.BaseAction;

@SuppressWarnings("serial")
public class ShowMaterialAction extends BaseAction {
	private MaterialService materialService;
	private SteelRaw steelRaw;
	private SteelQual steelQual;
	private ConcQual concQual;

	public void setConcQual(ConcQual concQual) {
		this.concQual = concQual;
	}

	public MaterialService getMaterialService() {
		return materialService;
	}

	public void setMaterialService(MaterialService materialService) {
		this.materialService = materialService;
	}

	@JSON(serialize = false)
	public SteelRaw getSteelRaw() {
		return steelRaw;
	}

	public void setSteelRaw(SteelRaw steelRaw) {
		this.steelRaw = steelRaw;
	}

	@JSON(serialize = false)
	public SteelQual getSteelQual() {
		return steelQual;
	}

	public void setSteelQual(SteelQual steelQual) {
		this.steelQual = steelQual;
	}

	/** ========================原材料报告管理=================== **/

	// 文件管理---钢筋原材料检测报告
	public String steelSearch() {
		List steelsearch = new ArrayList();
		String reportId = steelRaw.getReportId();
		if (reportId.length() == 0) {
			steelsearch = materialService.steelSearch();
		} else {
			steelsearch = materialService.steelSearch(reportId);
		}
		Map request = (Map) ActionContext.getContext().get("request");
		request.put("steelsearch", steelsearch);
		return SUCCESS;
	}

	// 文件管理---钢筋质量证明书
	public String steelQuality() {
		List steelquality = new ArrayList();
		String reportId = steelRaw.getReportId();
		if (reportId.length() == 0) {
			steelquality = materialService.steelQuality();
		} else {
			steelquality = materialService.steelQuality(reportId);
		}
		Map request = (Map) ActionContext.getContext().get("request");
		request.put("steelquality", steelquality);
		return SUCCESS;
	}

	// 文件管理---混凝土质量证明书
	public String concQuality() {
		List steelquality = new ArrayList();
		String reportId = steelRaw.getReportId();
		if (reportId.length() == 0) {
			steelquality = materialService.concQuality();
		} else {
			steelquality = materialService.concQuality(reportId);
		}
		Map request = (Map) ActionContext.getContext().get("request");
		request.put("steelquality", steelquality);
		return SUCCESS;
	}
	
	// 文件管理---混凝土质量证明书
		public String concMixRatio() {
			List steelquality = new ArrayList();
			String reportId = steelRaw.getReportId();
			if (reportId.length() == 0) {
				steelquality = materialService.concMixRatio();
			} else {
				steelquality = materialService.concMixRatio(reportId);
			}
			Map request = (Map) ActionContext.getContext().get("request");
			request.put("steelquality", steelquality);
			return SUCCESS;
		}
		
		public String embedQuality() {
			List embedquality = new ArrayList();
			String reportId = steelRaw.getReportId();
			if (reportId.length() == 0) {
				embedquality = materialService.embedQuality();
			} else {
				embedquality = materialService.embedQuality(reportId);
			}
			Map request = (Map) ActionContext.getContext().get("request");
			request.put("embedquality", embedquality);
			return SUCCESS;
		}

}
