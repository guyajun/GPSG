package org.shu.construct.action;

import java.net.URLDecoder;
import java.util.ArrayList;
import java.util.Map;
import org.shu.construct.service.PoseService;
import org.shu.model.ShieldPose;
import org.tool.Pager;
import com.opensymphony.xwork2.ActionContext;
import common.base.action.BaseAction;
import common.base.action.ExportExcel;

public class PoseAction extends BaseAction {

	private static final long serialVersionUID = 1L;
	private Integer pageNow = 1;
	private PoseService poseService;
	private Integer tunnelLoop;
	private int isEast;
	private Integer number;
	private String excelPath;
	
	public int getIsEast() {
		return isEast;
	}

	public void setIsEast(int isEast) {
		this.isEast = isEast;
	}

	public void setPoseService(PoseService poseService) {
		this.poseService = poseService;
	}

	public Integer getNumber() {
		return number;
	}

	public void setNumber(Integer number) {
		this.number = number;
	}

	public String getExcelPath() {
		return excelPath;
	}

	public void setExcelPath(String excelPath) {
		this.excelPath = excelPath;
	}

	public Integer getTunnelLoop() {
		return tunnelLoop;
	}

	public void setTunnelLoop(Integer tunnelLoop) {
		this.tunnelLoop = tunnelLoop;
	}

	public Integer getPosenumber() {
		return number;
	}

	public void setPosenumber(Integer number) {
		this.number = number;
	}

	public Integer getPageNow() {
		return pageNow;
	}

	public void setPageNow(Integer pageNow) {
		this.pageNow = pageNow;
	}

	public String exportExcel() throws Exception {
		String excelPathNew = URLDecoder
				.decode(new String(request.getParameter("excelPath").getBytes(
						"UTF-8"), "UTF-8"), "UTF-8");
		ArrayList<ShieldPose> poseList = poseService.getByIsEast(isEast);
		exportExcelCommon(poseList, excelPathNew);
		return SUCCESS;
	}

	public String getByposenumber() {
		Pager pager = new Pager(1, 1);
		ArrayList<ShieldPose> poseList = poseService.getCountByNumber(number);
		Map request = (Map) ActionContext.getContext().get("request");
		if(poseList.size()==0){
			pager.setPageNow(0);
		}
		request.put("pager", pager);
		request.put("poseList", poseList);
		return "success";
	}

	public String getBytunnelLoop() {
		ArrayList<ShieldPose> poseList = poseService.getCountById(tunnelLoop,isEast);
		Map request = (Map) ActionContext.getContext().get("request");
		request.put("poseList", poseList);
		return "success";
	}

	public String pose() throws Exception {
		Pager pager = new Pager(pageNow, poseService.getShieldPose().size());
		ArrayList<ShieldPose> poseList = poseService.getShieldPoseByPage(
				pageNow, pager.getPageSize());
		Map request = (Map) ActionContext.getContext().get("request");
		if(poseList.size()==0){
			pager.setPageNow(0);
		}
		request.put("pager", pager);
		request.put("poseList", poseList);
		return SUCCESS;
	}
	public void exportExcelCommon(ArrayList<ShieldPose> poseList,
			String excelPath) {
		ArrayList<String> titles = new ArrayList<String>();
		titles.add("序号");
		titles.add("推进环号");
		titles.add("项目编号 ");
		titles.add("设计线性");
		titles.add("设计坡度 ");
		titles.add("盾构坡度 ");
		titles.add("盾构转角 ");
		titles.add("切口里程 ");
		titles.add("盾构姿态高程切口/盾尾 ");
		titles.add("盾构姿态平面切口/盾尾");
		titles.add("管片姿态高程");
		titles.add("管片姿态平面");
		titles.add("盾尾间隙");
		titles.add("管片里程");
		titles.add("管片横径");
		titles.add("管片竖径");
		titles.add("封顶块位置");
		titles.add("观测者");
		titles.add("检查者");
		titles.add("观测时间");
		titles.add("备注");
		titles.add("提交状态");
		titles.add("上环间隙");
		titles.add("上环横竖径");
		titles.add("东西线(0—东线 1—西线)");
		ExportExcel exportExcel = new ExportExcel();
		exportExcel.exportExcelCommon(poseList, titles, excelPath);

	}

}
