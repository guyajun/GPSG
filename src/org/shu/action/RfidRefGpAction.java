package org.shu.action;

import java.util.List;
import java.util.Map;
import org.shu.model.RfidRefGp;
import org.shu.service.imp.RfidRefGpService;
import org.tool.Pager;
import com.opensymphony.xwork2.ActionContext;
import common.base.action.BaseAction;

@SuppressWarnings("serial")
public class RfidRefGpAction extends BaseAction{
	private RfidRefGp rfidRefGp;		
	private RfidRefGpService  rfidRefGpService;
	private int pageNow=1;
	private int pageSize=8;
	private int total;
	private List list;

	public void setRfidRefGp(RfidRefGp rfidRefGp) {
		this.rfidRefGp = rfidRefGp;
	}

	public RfidRefGp getRfidRefGp() {
		return rfidRefGp;
	}

	public RfidRefGpService getRfidRefGpService() {
		return rfidRefGpService;
	}

	public void setRfidRefGpService(RfidRefGpService rfidRefGpService) {
		this.rfidRefGpService = rfidRefGpService;
	}
	
	public int getTotal() {
		return total;
	}

	public void setTotal(int total) {
		this.total = total;
	}

	public int getPageNow() {
		return pageNow;
	}

	public void setPageNow(int pageNow) {
		this.pageNow = pageNow;
	}

	public int getPageSize() {
		return pageSize;
	}

	public void setPageSize(int pageSize) {
		this.pageSize = pageSize;
	}

	public List getList() {
		return list;
	}

	public void setList(List list) {
		this.list = list;
	}

	public String addRFID() throws Exception {
		RfidRefGp rfidRefGp1 = new RfidRefGp();
		rfidRefGp1.setCoverId(request.getParameter("scan_coverId"));
		rfidRefGp1.setRfidTid(request.getParameter("scan_rfidTid"));
		rfidRefGp1.setStatus("芯片已启用");
		rfidRefGpService.saveRfidRefGp(rfidRefGp1);			
		return SUCCESS;
	}
	public String replaceRFID() throws Exception {
		RfidRefGp rfidRefGp2 = new RfidRefGp();
		rfidRefGp2.setCoverId(rfidRefGp.getCoverId());
		rfidRefGp2.setRfidTid(request.getParameter("scan_rfidTid"));	
		rfidRefGp2.setStatus("芯片已启用");
		rfidRefGp2.setCreator(rfidRefGp.getCreator());
		rfidRefGp2.setCreateTime(rfidRefGp.getCreateTime());
		rfidRefGpService.saveRfidRefGp(rfidRefGp2);
		RfidRefGp rfidRefGp3=rfidRefGpService.findRFIDByCoverId(request.getParameter("oldCoverId").toString());		
		rfidRefGp3.setStatus("芯片已报废");
		rfidRefGpService.updateRfidRefGp(rfidRefGp3);
		return SUCCESS;
	}

	public String showRFID() throws Exception
	{	
		List<RfidRefGp> list123=rfidRefGpService.findAll(pageNow,pageSize);
		Map request=(Map)ActionContext.getContext().get("request");
		Pager page1=new Pager(getPageNow(),rfidRefGpService.findRfidRefGpSize());		
		request.put("list123", list123);
		request.put("page1", page1);
		return SUCCESS;
		
	}
	
	public String queryRFID() throws Exception
	{	
		String str=request.getParameter("str").toString();
		
		if(str.length()<10)
		{
			RfidRefGp rfidRefGp3=rfidRefGpService.findRFIDByCoverId(str);
			Map request = (Map) ActionContext.getContext().get("request");
			request.put("rfidRefGp3",rfidRefGp3);					
		}
		else
		{
			RfidRefGp rfidRefGp3=rfidRefGpService.findRFIDByGpId(str);	
			Map request = (Map) ActionContext.getContext().get("request");
			request.put("rfidRefGp3",rfidRefGp3);
		}		
		return SUCCESS;
		
	}
	
	public String rolesCount()
	{
		total = rfidRefGpService.getAll().size();
		
		return SUCCESS;
	}

}
