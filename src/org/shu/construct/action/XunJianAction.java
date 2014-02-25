package org.shu.construct.action;

import java.io.File;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.Map;

import org.shu.construct.service.InCheckService;
import org.shu.construct.service.RfidService;
import org.shu.construct.service.XunJianService;
import org.shu.model.InCheck;
import org.shu.model.RfidCombine;
import org.shu.model.Segmentrepair;
import org.tool.CommonParam;

import com.opensymphony.xwork2.ActionContext;
import common.base.action.BaseAction;

@SuppressWarnings("serial")
public class XunJianAction extends BaseAction {
	private XunJianService xunJianService;
	private RfidService rfidService;

	public void setXunJianService(XunJianService xunJianService) {
		this.xunJianService = xunJianService;
	}

	public void setRfidService(RfidService rfidService) {
		this.rfidService = rfidService;
	}

	public String getList() {
		CommonParam cp = new CommonParam();
		String path = cp.getString("local-imgs-path");
		int tunnelLoop = Integer.parseInt(request.getParameter("tunnelLoop"));
		ArrayList<Segmentrepair> listXun = xunJianService
				.getByTunnelLoop(tunnelLoop);
		ArrayList<String> list = new ArrayList<String>();
		if (listXun.size() > 0) {
			Segmentrepair xunJian = listXun.get(0);
			File fileXun = new File(path + "/SegmentRepair");
			File[] files = fileXun.listFiles();
			int count = 0;
			for (int j = 0; j < files.length; j++) {
				String fileName = files[j].getName();
				if (fileName.split("-").length > 2) {
					SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
					Date date = xunJian.getCheckDate();
					String checkDate = sdf.format(date);
					String fileDate = fileName.substring(0, 10);
					String[] str = fileName.split("\\.");
					String baseName = str[0];
					System.out.println(baseName.split("-")[3]);
					System.out.println("tuunnelLoop=" + tunnelLoop);
					if (checkDate.equals(fileDate)
							&& baseName.split("-")[3].equals(tunnelLoop + "")) {
						list.add(fileName);
					}
				}
			}
		}
		Map request = (Map) ActionContext.getContext().get("request");
		request.put("list", list);
		return "success";
	}
}