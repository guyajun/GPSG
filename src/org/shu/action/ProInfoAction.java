package org.shu.action;

import java.net.URLDecoder;
import java.sql.Timestamp;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import org.shu.model.ProInfo;
import org.shu.model.RoleInfo;
import org.shu.model.UserInfo;
import org.shu.service.imp.ProInfoService;
import org.tool.Pager;
import com.opensymphony.xwork2.ActionContext;
import com.opensymphony.xwork2.ActionSupport;
import common.base.action.BaseAction;

@SuppressWarnings("serial")
public class ProInfoAction extends BaseAction{
	private int pageNow=1;
	private int pageSize=8;
	private int total;
	private List list;
	private ProInfo proInfo;
	private ProInfoService proInfoService;
	private UploadAction uploadAction;
	private Integer id;
	private String proCode;
	private String proName;
	private String proType;
	private Integer gpCount;
	private String startGpId;
	private String endGpId;
	private Double gkTltp;
	private Double gkTllg;
	private Double gkIndm;
	private Double gkOtdm;
	private String gkSdtp;
	private Double gkSddm;
	private Double gkSdlg;
	private Integer gkStrg;
	private String gkStdt;
	private String gkLayer;
	private String gkAxspic1;
	private String gkAxspic2;
	private String gkPzxs;
	private String gkXt;
	private String gkCst;
	private String gkSpt;
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public String getProCode() {
		return proCode;
	}
	public void setProCode(String proCode) {
		this.proCode = proCode;
	}
	public String getProName() {
		return proName;
	}
	public void setProName(String proName) {
		this.proName = proName;
	}
	public String getProType() {
		return proType;
	}
	public void setProType(String proType) {
		this.proType = proType;
	}
	public Integer getGpCount() {
		return gpCount;
	}
	public void setGpCount(Integer gpCount) {
		this.gpCount = gpCount;
	}
	public String getStartGpId() {
		return startGpId;
	}
	public void setStartGpId(String startGpId) {
		this.startGpId = startGpId;
	}
	public String getEndGpId() {
		return endGpId;
	}
	public void setEndGpId(String endGpId) {
		this.endGpId = endGpId;
	}
	public Double getGkTltp() {
		return gkTltp;
	}
	public void setGkTltp(Double gkTltp) {
		this.gkTltp = gkTltp;
	}
	public Double getGkTllg() {
		return gkTllg;
	}
	public void setGkTllg(Double gkTllg) {
		this.gkTllg = gkTllg;
	}
	public Double getGkIndm() {
		return gkIndm;
	}
	public void setGkIndm(Double gkIndm) {
		this.gkIndm = gkIndm;
	}
	public Double getGkOtdm() {
		return gkOtdm;
	}
	public void setGkOtdm(Double gkOtdm) {
		this.gkOtdm = gkOtdm;
	}
	public String getGkSdtp() {
		return gkSdtp;
	}
	public void setGkSdtp(String gkSdtp) {
		this.gkSdtp = gkSdtp;
	}
	public Double getGkSddm() {
		return gkSddm;
	}
	public void setGkSddm(Double gkSddm) {
		this.gkSddm = gkSddm;
	}
	public Double getGkSdlg() {
		return gkSdlg;
	}
	public void setGkSdlg(Double gkSdlg) {
		this.gkSdlg = gkSdlg;
	}
	public Integer getGkStrg() {
		return gkStrg;
	}
	public void setGkStrg(Integer gkStrg) {
		this.gkStrg = gkStrg;
	}
	public String getGkStdt() {
		return gkStdt;
	}
	public void setGkStdt(String gkStdt) {
		this.gkStdt = gkStdt;
	}
	public String getGkLayer() {
		return gkLayer;
	}
	public void setGkLayer(String gkLayer) {
		this.gkLayer = gkLayer;
	}
	public String getGkAxspic1() {
		return gkAxspic1;
	}
	public void setGkAxspic1(String gkAxspic1) {
		this.gkAxspic1 = gkAxspic1;
	}
	public String getGkAxspic2() {
		return gkAxspic2;
	}
	public void setGkAxspic2(String gkAxspic2) {
		this.gkAxspic2 = gkAxspic2;
	}
	public String getGkPzxs() {
		return gkPzxs;
	}
	public void setGkPzxs(String gkPzxs) {
		this.gkPzxs = gkPzxs;
	}
	public String getGkXt() {
		return gkXt;
	}
	public void setGkXt(String gkXt) {
		this.gkXt = gkXt;
	}
	public String getGkCst() {
		return gkCst;
	}
	public void setGkCst(String gkCst) {
		this.gkCst = gkCst;
	}
	public String getGkSpt() {
		return gkSpt;
	}
	public void setGkSpt(String gkSpt) {
		this.gkSpt = gkSpt;
	}
	public String getGkBld() {
		return gkBld;
	}
	public void setGkBld(String gkBld) {
		this.gkBld = gkBld;
	}
	public String getGkCstmg() {
		return gkCstmg;
	}
	public void setGkCstmg(String gkCstmg) {
		this.gkCstmg = gkCstmg;
	}
	public String getGkSptmg() {
		return gkSptmg;
	}
	public void setGkSptmg(String gkSptmg) {
		this.gkSptmg = gkSptmg;
	}
	public String getGkBldmg() {
		return gkBldmg;
	}
	public void setGkBldmg(String gkBldmg) {
		this.gkBldmg = gkBldmg;
	}
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	public String getRingWidth() {
		return ringWidth;
	}
	public void setRingWidth(String ringWidth) {
		this.ringWidth = ringWidth;
	}
	public String getProStatus() {
		return proStatus;
	}
	public void setProStatus(String proStatus) {
		this.proStatus = proStatus;
	}
	public String getProduceUnit() {
		return produceUnit;
	}
	public void setProduceUnit(String produceUnit) {
		this.produceUnit = produceUnit;
	}
	public Timestamp getCompleteTime() {
		return completeTime;
	}
	public void setCompleteTime(Timestamp completeTime) {
		this.completeTime = completeTime;
	}
	public String getMemo() {
		return memo;
	}
	public void setMemo(String memo) {
		this.memo = memo;
	}
	public Integer getIsEast() {
		return isEast;
	}
	public void setIsEast(Integer isEast) {
		this.isEast = isEast;
	}

	private String gkBld;
	private String gkCstmg;
	private String gkSptmg;
	private String gkBldmg;
	private String description;
	private String ringWidth;
	private String proStatus;
	private String produceUnit;
	private Timestamp completeTime;
	private String memo;
	private Integer isEast;
	
	public int getPageNow() {
		return pageNow;
	}
	public String getAll(){
		Pager pager = new Pager(pageNow, proInfoService.getProInfo().size());
		ArrayList<ProInfo> prolist=proInfoService.getAll();
		Map request = (Map)ActionContext.getContext().get("request");
		request.put("pager", pager);
        request.put("prolist", prolist);
		return SUCCESS;
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


	public int getTotal() {
		return total;
	}


	public void setTotal(int total) {
		this.total = total;
	}


	public List getList() {
		return list;
	}


	public void setList(List list) {
		this.list = list;
	}


	public UploadAction getUploadAction() {
		return uploadAction;
	}


	public void setUploadAction(UploadAction uploadAction) {
		this.uploadAction = uploadAction;
	}


	public ProInfo getProInfo() {
		return proInfo;
	}


	public void setProInfo(ProInfo proInfo) {
		this.proInfo = proInfo;
	}


	public ProInfoService getProInfoService() {
		return proInfoService;
	}


	public void setProInfoService(ProInfoService proInfoService) {
		this.proInfoService = proInfoService;
	}
	public String deleteProInfo() throws Exception{
		int id=proInfo.getId();
		proInfoService.deleteProInfo(id);
		return SUCCESS;
	}
	public String deletepro(){
		ArrayList<ProInfo> list = proInfoService.findByproName(proName);
		proInfoService.delete(list.get(0));
		return SUCCESS;
	}
	public String getByproName() throws Exception {
		String proNameNew = URLDecoder.decode(
				new String(request.getParameter("proName").getBytes("UTF-8"),
						"UTF-8"), "UTF-8");
		Pager pager = new Pager(pageNow, proInfoService.getCountByproName(proNameNew)
				.size());
		ArrayList<ProInfo> prolist = proInfoService.getOnePageByproName(
				proNameNew, pageNow, pager.getPageSize());
		Map request = (Map) ActionContext.getContext().get("request");
		request.put("pager", pager);
		request.put("prolist", prolist);
		return SUCCESS;
	}
//	 public String updateProInfo()throws Exception{
//		 ProInfo proInfo1 =proInfoService.find(proInfo.getId());
//		 	proInfo1.setProName(proInfo.getProName());
//		 	proInfo1.setProType(proInfo.getProType());	
//			proInfo1.setProBlock(proInfo.getProBlock());
//			proInfo1.setProClass(proInfo.getProClass());
//			proInfo1.setProStatus(proInfo.getProStatus());
//			proInfo1.setBuildUnit(proInfo.getBuildUnit());
//			proInfo1.setConstructUnit(proInfo.getConstructUnit());
//			proInfo1.setDescription(proInfo.getDescription());
//			proInfo1.setDesignUnit(proInfo.getDesignUnit());
//			proInfo1.setEndGpId(proInfo.getEndGpId());
//			proInfo1.setGpCount(proInfo.getGpCount());
//			proInfo1.setImportantPro(proInfo.getImportantPro());
//			proInfo1.setKeyFocus(proInfo.getKeyFocus());
//			proInfo1.setLevelOneId(proInfo.getLevelOneId());
//			proInfo1.setLevelTwoId(proInfo.getLevelTwoId());
//			proInfo1.setManageUnit(proInfo.getManageUnit());
//			proInfo1.setStartGpId(proInfo.getStartGpId());
//			proInfo1.setDirectorId(proInfo.getDirectorId());
//			proInfo1.setDirectorPhone(proInfo.getDirectorPhone());
//			proInfoService.update(proInfo1);		
//		 return SUCCESS;
//	 }
//	 public String findProInfo(){
//		int id=proInfo.getId();
//		ProInfo pro3=proInfoService.find(id);
//		 Map request=(Map)ActionContext.getContext().get("request");
//		 request.put("pro3", pro3);
//		 return SUCCESS;
//	 }
//	 public String findByName(){
//			String str=request.getParameter("str");
//			List listproInfo=proInfoService.findByName(str);
//			 Map request=(Map)ActionContext.getContext().get("request");
//			 request.put("listproInfo", listproInfo);
//			 return SUCCESS;
//		 }
//	public String execute() throws Exception {
//		ProInfo proInfo1 = new ProInfo();
//		proInfo1.setProName(proInfo.getProName());	
//		proInfo1.setProBlock(proInfo.getProBlock());
//		proInfo1.setProClass(proInfo.getProClass());
//		proInfo1.setProStatus(proInfo.getProStatus());
//		proInfo1.setBuildUnit(proInfo.getBuildUnit());
//		proInfo1.setConstructUnit(proInfo.getConstructUnit());
//		proInfo1.setDescription(proInfo.getDescription());
//		proInfo1.setDesignUnit(proInfo.getDesignUnit());
//		proInfo1.setEndGpId(proInfo.getEndGpId());
//		proInfo1.setGpCount(proInfo.getGpCount());
//		proInfo1.setImportantPro(proInfo.getImportantPro());
//		proInfo1.setKeyFocus(proInfo.getKeyFocus());
//		proInfo1.setLevelOneId(proInfo.getLevelOneId());
//		proInfo1.setLevelTwoId(proInfo.getLevelTwoId());
//		proInfo1.setManageUnit(proInfo.getManageUnit());
//		proInfo1.setStartGpId(proInfo.getStartGpId());
//		proInfo1.setUrl("upload\\"+uploadAction.getFileName());
//		proInfo1.setDirectorId(proInfo.getDirectorId());	
//		proInfoService.saveProInfo(proInfo1);		
//	
//		return SUCCESS;
//	}
//	public String showProject() throws Exception {
//		List list=proInfoService.findAll(pageNow,pageSize);
//
//		Map request=(Map)ActionContext.getContext().get("request");
//		Pager page=new Pager(getPageNow(),proInfoService.findProInfoSize());
//		request.put("list", list);
//		request.put("page", page);
//		return SUCCESS;
//	}

	public String Addpro(){
		ArrayList<ProInfo> list = proInfoService.findByproName(proName);
		if(list.size()==0){
			ProInfo user = new ProInfo();
			user.setId(id);
			user.setProCode(proCode);
			user.setProName(proName);
			user.setProType(proType);
			user.setGpCount(gpCount);
			user.setStartGpId(startGpId);
			user.setEndGpId(endGpId);
			user.setGkTltp(gkTltp);
			user.setGkTllg(gkTllg);
			user.setGkIndm(gkIndm);
			user.setGkOtdm(gkOtdm);
			user.setGkSdtp(gkSdtp);
			user.setGkSddm(gkSddm);
			user.setGkSdlg(gkSdlg);
			user.setGkStrg(gkStrg);
			user.setGkStdt(gkStdt);
			user.setGkLayer(gkLayer);
			user.setGkAxspic1(gkAxspic1);
			user.setGkAxspic2(gkAxspic2);
			user.setGkPzxs(gkPzxs);
			user.setGkXt(gkXt);
			user.setGkCst(gkCst);
			user.setGkSpt(gkSpt);
			user.setGkBld(gkBld);
			user.setGkCstmg(gkCstmg);
			user.setGkSptmg(gkSptmg);
			user.setGkBldmg(gkBldmg);
			user.setDescription(description);
			user.setRingWidth(ringWidth);
			user.setProStatus(proStatus);
			user.setProduceUnit(produceUnit);
			user.setCompleteTime(completeTime);
			user.setMemo(memo);
			user.setIsEast(isEast);
			
			
			proInfoService.save(user);
		}
		else{
			Map request = (Map)ActionContext.getContext().get("request");
	        request.put("msg", "此角色已经存在");
		}
		return SUCCESS;
	}
	public String editpro123(){
		ProInfo user = new ProInfo();
		user.setId(id);
		user.setProCode(proCode);
		user.setProName(proName);
		user.setProType(proType);
		user.setGpCount(gpCount);
		user.setStartGpId(startGpId);
		user.setEndGpId(endGpId);
		user.setGkTltp(gkTltp);
		user.setGkTllg(gkTllg);
		user.setGkIndm(gkIndm);
		user.setGkOtdm(gkOtdm);
		user.setGkSdtp(gkSdtp);
		user.setGkSddm(gkSddm);
		user.setGkSdlg(gkSdlg);
		user.setGkStrg(gkStrg);
		user.setGkStdt(gkStdt);
		user.setGkLayer(gkLayer);
		user.setGkAxspic1(gkAxspic1);
		user.setGkAxspic2(gkAxspic2);
		user.setGkPzxs(gkPzxs);
		user.setGkXt(gkXt);
		user.setGkCst(gkCst);
		user.setGkSpt(gkSpt);
		user.setGkBld(gkBld);
		user.setGkCstmg(gkCstmg);
		user.setGkSptmg(gkSptmg);
		user.setGkBldmg(gkBldmg);
		user.setDescription(description);
		user.setRingWidth(ringWidth);
		user.setProStatus(proStatus);
		user.setProduceUnit(produceUnit);
		user.setCompleteTime(completeTime);
		user.setMemo(memo);
		user.setIsEast(isEast);
		proInfoService.update(user);
		return SUCCESS;
	}

}
