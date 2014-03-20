package org.shu.action;

import java.util.List;
import java.util.Map;
import org.shu.model.ProInfo;
import org.shu.service.TestIService;
import org.shu.service.imp.ProInfoService;
import com.opensymphony.xwork2.ActionContext;
import com.opensymphony.xwork2.ActionSupport;
import common.base.action.BaseAction;

@SuppressWarnings("serial")
public class ProEnterAction extends BaseAction {
	private ProInfo proInfo;
	private TestIService testService;
	String prochoose;
	static String pro_id;

	public String getProchoose() {
		return prochoose;
	}

	public void setProchoose(String prochoose) {
		this.prochoose = prochoose;
	}

	public void setTestService(TestIService testService) {
		this.testService = testService;
	}
	
	public ProInfo getProInfo() {
		return proInfo;
	}

	public void setProInfo(ProInfo proInfo) {
		this.proInfo = proInfo;
	}
	public TestIService getTestService() {
		return testService;
	}


	public String proEnter() throws Exception {
	    pro_id=request.getParameter(prochoose);
		System.out.println(pro_id);
//		List listpro=proInfoService.getAll();
//		Map request = (Map) ActionContext.getContext().get("request");
//		request.put("listpro", listpro);		
		return SUCCESS;
	}
}
