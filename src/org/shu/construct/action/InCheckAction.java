package org.shu.construct.action;

import java.util.ArrayList;
import java.util.Map;
import org.shu.construct.service.InCheckService;
import org.shu.construct.service.RfidService;
import org.shu.model.InCheck;
import org.shu.model.RfidCombine;
import com.opensymphony.xwork2.ActionContext;
import common.base.action.BaseAction;

@SuppressWarnings("serial")
public class InCheckAction extends BaseAction {
	private InCheckService inCheckService;
	private RfidService rfidService;
	public void setInCheckService(InCheckService inCheckService) {
		this.inCheckService = inCheckService;
	}
	public void setRfidService(RfidService rfidService) {
		this.rfidService = rfidService;
	}
	public String getList() {
		int tunnelLoop = Integer.parseInt(request.getParameter("tunnelLoop"));
		ArrayList<RfidCombine> rfidList = rfidService.SearchByLoop(tunnelLoop);
		if (rfidList.size() > 0) {
			String circleList = rfidList.get(0).getCirclelist();
			String[] unit = circleList.split("@");// 环号+块号
			String produceLoop = unit[0].substring(0, unit[0].length() - 2);
			// 入场检查
			ArrayList<InCheck> list = inCheckService.searchByLoop(produceLoop);
			if (list.size() > 0) {
				Map request = (Map) ActionContext.getContext().get("request");
				request.put("list", list);
			}
		}
		return "success";
	}
}