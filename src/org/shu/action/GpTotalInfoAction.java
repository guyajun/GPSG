package org.shu.action;

import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import org.shu.model.GpTotalInfo;
import org.shu.service.imp.GpTotalInfoService;
import org.shu.service.imp.RfidRefGpService;
import com.opensymphony.xwork2.ActionContext;
import common.base.action.BaseAction;
import common.db.QueryResult;

@SuppressWarnings("serial")
public class GpTotalInfoAction extends BaseAction {

	private int pageNow = 1;
	private int pageSize = 8;

	private GpTotalInfo gpTotalInfo;
	private RfidRefGpService rfidRefGpService;
	private int total;
	private GpTotalInfoService gpTotalInfoService;
	private List<Object> rows;
	private int page;
	private int row;

	public void setRfidRefGpService(RfidRefGpService rfidRefGpService) {
		this.rfidRefGpService = rfidRefGpService;
	}

	public GpTotalInfo getGpTotalInfo() {
		return gpTotalInfo;
	}

	public void setGpTotalInfo(GpTotalInfo gpTotalInfo) {
		this.gpTotalInfo = gpTotalInfo;
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

	public List<Object> getRows() {
		return rows;
	}

	public void setRows(List<Object> rows) {
		this.rows = rows;
	}

	public int getPage() {
		return page;
	}

	public void setPage(int page) {
		this.page = page;
	}

	public int getRow() {
		return row;
	}

	public void setRow(int row) {
		this.row = row;
	}

	public void setGpTotalInfoService(GpTotalInfoService gpTotalInfoService) {
		this.gpTotalInfoService = gpTotalInfoService;
	}

	public int getLastLoop() {
		return gpTotalInfoService.getLastLoop();
	}

	public String gpStatus() {
		return SUCCESS;
	}

//	public String gpDataGrid() throws Exception {
//		QueryResult<GpTotalInfo> results = gpTotalInfoService.getAllGPs(page,
//				row);
//		List<GpTotalInfo> deptList = results.getList();
//		if (deptList.size() > 0) {
//			total = deptList.size();
//		} else {
//			total = 0;
//		}
//		this.rows = new ArrayList<Object>();
//		if (deptList.size() > 0) {
//			for (int i = 0; i < deptList.size(); i++) {
//				Map<String, Object> map = new HashMap<String, Object>();
//				map.put("id", deptList.get(i).getId());
//				map.put("gp_id", deptList.get(i).getGpId());
//				map.put("loop_number", deptList.get(i).getProduceLoop());
//				map.put("order", deptList.get(i).getWorkShift());
//				map.put("steel_raw", deptList.get(i).getSteelRawReportId());
//				map.put("steel_qual", deptList.get(i).getSteelQualReportId());
//				map.put("conc_comp", deptList.get(i)
//						.getConcResistCompReportId());
//				map.put("conc_leak", deptList.get(i).getConcResistLeakId());
//				map.put("steel_process", deptList.get(i)
//						.getSteelProcessReportId());
//				map.put("steel_skel", deptList.get(i)
//						.getSteelSkelHalfReportId());
//				map.put("steelskel_qual", deptList.get(i)
//						.getSteelSkelQualReportId());
//				map.put("gp_app", deptList.get(i).getGpAppeSizeReportId());
//				map.put("mold_qual", deptList.get(i).getMoldQualReportId());
//				map.put("steam_curing", deptList.get(i).getGpSteamCuringId());
//				map.put("water_curing", deptList.get(i)
//						.getWaterCuringReportId());
//				map.put("assemble", deptList.get(i).getAssemReportId());
//				map.put("check_leak", deptList.get(i).getCheckLeakReportId());
//				this.rows.add(map);
//			}
//		}
//		return SUCCESS;
//	}

	@SuppressWarnings({ "unchecked", "rawtypes" })
//	public String showDataGrid() throws Exception {
//		List<GpTotalInfo> gplist = gpTotalInfoService.getAll();
//
//		for (int i = 0; i < gplist.size(); i++) {
//			String gp_id = gplist.get(i).getGpId();
//			String gp_date1 = gp_id.substring(0, 4);
//			String gp_date2 = gp_id.substring(4, 6);
//			String gp_date3 = gp_id.substring(6, 8);
//			String gp_date = gp_date1 + "-" + gp_date2 + "-" + gp_date3;
//			List steelraw = gpTotalInfoService.findSteelRaw(gp_date);
//			int steelraw_count = steelraw.size(); // �ֽ�ԭ����
//
//			List steelqual = gpTotalInfoService.findSteelQual(gp_date);
//			int steelqual_count = steelqual.size(); // �ֽ�����֤����
//
//			List concqual = gpTotalInfoService.findConcQual(gp_date);
//			int concqual_count = concqual.size(); // ����������
//
//			List concresist = gpTotalInfoService.findConcResist(gp_date);
//			int concresist_count = concresist.size(); // ��������ѹ
//
//			List concmix = gpTotalInfoService.findConcMix(gp_date);
//			int concmix_count = concmix.size(); // ���֪ͨ��
//
//			List preembed = gpTotalInfoService.findPreEmbed(gp_date);
//			int preembed_count = preembed.size();
//			gplist.get(i).setSteelRawReportId(String.valueOf(steelraw_count));
//			gplist.get(i).setSteelQualReportId(String.valueOf(steelqual_count));
//			gplist.get(i).setConcResistCompReportId(
//					String.valueOf(concresist_count));
//			gplist.get(i).setConcResistCompReportId(
//					String.valueOf(concresist_count));
//			gplist.get(i).setConcMixRatioId(String.valueOf(concmix_count));
////			gplist.get(i).setConcQual(String.valueOf(concqual_count));
////			gplist.get(i).setPreEmbed(String.valueOf(preembed_count));
//			gpTotalInfoService.updateGpTotalInfo(gplist.get(i));
//		}
//
//		Map request = (Map) ActionContext.getContext().get("request");
//		request.put("gplist", gplist);
//		return SUCCESS;
//
//	}
//
//	public String addGP() throws Exception {
//		GpTotalInfo gt = new GpTotalInfo();
//		String product_date = request.getParameter("producedate");
//		String loop_num = request.getParameter("loopnum");
//		String order = request.getParameter("order");
//		String gp_code = product_date + loop_num + "-" + order;
//		gt.setGpId(gp_code);
//		gpTotalInfoService.addGP(gt);
//		return SUCCESS;
//	}

//	public String delGP() throws Exception {
//
//		String gp_id = gpTotalInfo.getGpId();
//		if (gp_id != null) {
//			try {
//				gpTotalInfoService.delGP(gp_id);
//				response.setContentType("text/plain;charset=UTF-8");
//				response.getWriter().println("ɾ��ɹ�");
//			} catch (Exception e) {
//				response.setContentType("text/plain;charset=UTF-8");
//				try {
//					response.getWriter().println("ɾ��ʱ�����쳣");
//				} catch (IOException e1) {
//					e1.printStackTrace();
//				}
//				e.printStackTrace();
//			}
//		}
//		return SUCCESS;
//	}

	public String rolesCount() {
		total = gpTotalInfoService.getAll().size();
		return SUCCESS;
	}

	public String queryGp() throws Exception {
		String str = request.getParameter("str").toString();

		if (str.length() < 10) {
			GpTotalInfo gpTotalInfo3 = gpTotalInfoService.findByCoverId(str);
			Map request = (Map) ActionContext.getContext().get("request");
			request.put("gpTotalInfo3", gpTotalInfo3);
		} else {
			GpTotalInfo gpTotalInfo3 = gpTotalInfoService.findByGpId(str);
			Map request = (Map) ActionContext.getContext().get("request");
			request.put("gpTotalInfo3", gpTotalInfo3);
		}
		return SUCCESS;

	}

//	public String scrap() throws Exception {
//		String str = request.getParameter("str");
//		GpTotalInfo gpTotalInfo1 = gpTotalInfoService.findByGpId(str);
//		gpTotalInfo1.setScrapDate(gpTotalInfo.getScrapDate());
//		gpTotalInfo1.setScrapReason(gpTotalInfo.getScrapReason());
//		gpTotalInfo1.setGpStatus("�Ѿ�����");
//		gpTotalInfoService.updateGpTotalInfo(gpTotalInfo1);
//
//		return SUCCESS;
//	}
//
//	public String findSteelQual() {
//		String gp_id = gpTotalInfo.getGpId();
//		String gp_date1 = gp_id.substring(0, 4);
//		String gp_date2 = gp_id.substring(4, 6);
//		String gp_date3 = gp_id.substring(6, 8);
//		String gp_date = gp_date1 + "-" + gp_date2 + "-" + gp_date3;
//		List steelqual = gpTotalInfoService.findSteelQual(gp_date);
//		Map request = (Map) ActionContext.getContext().get("request");
//		request.put("steelqual", steelqual);
//		return SUCCESS;
//	}
//
//	public String findSteelRaw() {
//		String gp_id = gpTotalInfo.getGpId();
//		String gp_date1 = gp_id.substring(0, 4);
//		String gp_date2 = gp_id.substring(4, 6);
//		String gp_date3 = gp_id.substring(6, 8);
//		String gp_date = gp_date1 + "-" + gp_date2 + "-" + gp_date3;
//		List steelraw = gpTotalInfoService.findSteelRaw(gp_date);
//		Map request = (Map) ActionContext.getContext().get("request");
//		request.put("steelraw", steelraw);
//		return SUCCESS;
//	}
//
//	public String findConcResist() {
//		String gp_id = gpTotalInfo.getGpId();
//		String gp_date1 = gp_id.substring(0, 4);
//		String gp_date2 = gp_id.substring(4, 6);
//		String gp_date3 = gp_id.substring(6, 8);
//		String gp_date = gp_date1 + "-" + gp_date2 + "-" + gp_date3;
//		List concresist = gpTotalInfoService.findConcResist(gp_date);
//		Map request = (Map) ActionContext.getContext().get("request");
//		request.put("concresist", concresist);
//		return SUCCESS;
//	}
//
//	public String findConcQual() {
//		String gp_id = gpTotalInfo.getGpId();
//		String gp_date1 = gp_id.substring(0, 4);
//		String gp_date2 = gp_id.substring(4, 6);
//		String gp_date3 = gp_id.substring(6, 8);
//		String gp_date = gp_date1 + "-" + gp_date2 + "-" + gp_date3;
//		List concresist = gpTotalInfoService.findConcQual(gp_date);
//		Map request = (Map) ActionContext.getContext().get("request");
//		request.put("concresist", concresist);
//		return SUCCESS;
//	}
//
//	public String findConcMix() {
//		String gp_id = gpTotalInfo.getGpId();
//		String gp_date1 = gp_id.substring(0, 4);
//		String gp_date2 = gp_id.substring(4, 6);
//		String gp_date3 = gp_id.substring(6, 8);
//		String gp_date = gp_date1 + "-" + gp_date2 + "-" + gp_date3;
//		List concresist = gpTotalInfoService.findConcMix(gp_date);
//		Map request = (Map) ActionContext.getContext().get("request");
//		request.put("concresist", concresist);
//		return SUCCESS;
//	}
//
//	public String findPreEmbed() {
//		String gp_id = gpTotalInfo.getGpId();
//		String gp_date1 = gp_id.substring(0, 4);
//		String gp_date2 = gp_id.substring(4, 6);
//		String gp_date3 = gp_id.substring(6, 8);
//		String gp_date = gp_date1 + "-" + gp_date2 + "-" + gp_date3;
//		List concresist = gpTotalInfoService.findPreEmbed(gp_date);
//		Map request = (Map) ActionContext.getContext().get("request");
//		request.put("concresist", concresist);
//		return SUCCESS;
//	}
//
//	public String zproject() throws Exception {
//
//		return SUCCESS;
//	}

}
