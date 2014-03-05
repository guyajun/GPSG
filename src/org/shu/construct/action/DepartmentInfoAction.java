package org.shu.construct.action;

import java.net.URLDecoder;
import java.sql.Timestamp;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Map;

import org.shu.construct.service.DepartmentInfoService;
import org.shu.model.DepartmentInfo;
import org.shu.model.ProInfo;
import org.tool.Pager;

import com.opensymphony.xwork2.ActionContext;

import common.base.action.BaseAction;

public class DepartmentInfoAction extends BaseAction {
	private String departmentName;
	private String departmentDescription;
	private Integer pageNow = 1;
	private Integer id;
	private DepartmentInfoService departmentInfoService;
	
	public String getAll() {
		System.out.println("asd");
		Pager pager = new Pager(pageNow, departmentInfoService.getDepInfo().size());
		System.out.println("asd2");
		ArrayList<DepartmentInfo> deplist = departmentInfoService.getAll();
		System.out.println("asd3");
		Map request = (Map) ActionContext.getContext().get("request");
		request.put("pager", pager);
		request.put("deplist", deplist);
		return SUCCESS;
	}
	
	public String deletedep() {
		List<DepartmentInfo> list = departmentInfoService.findByName(departmentName);
		departmentInfoService.delete(list.get(0));
		return SUCCESS;
	}
	public String editDep() throws Exception {
		String proNameNew = URLDecoder.decode(
				new String(request.getParameter("departmentName").getBytes("UTF-8"),
						"UTF-8"), "UTF-8");
		Pager pager = new Pager(pageNow, departmentInfoService.getByName(departmentName)
				.size());
		ArrayList<DepartmentInfo> deplist = departmentInfoService.getOnePageByCno(
				departmentName, pageNow, pager.getPageSize());
		Map request = (Map) ActionContext.getContext().get("request");
		request.put("pager", pager);
		request.put("deplist", deplist);
		return SUCCESS;
	}
	public String bianji() {
		System.out.println("ttt");
		List<DepartmentInfo> list = departmentInfoService.findById(id);
		if (list.size() > 0) {
			DepartmentInfo dept=list.get(0);
			dept.setDepartmentName(departmentName);
			dept.setDepartmentDescription(departmentDescription);
			departmentInfoService.update(dept);
		}
		return SUCCESS;
	}

	public String getDepartmentName() {
		return departmentName;
	}

	public void setDepartmentName(String departmentName) {
		this.departmentName = departmentName;
	}

	public String getDepartmentDescription() {
		return departmentDescription;
	}

	public void setDepartmentDescription(String departmentDescription) {
		this.departmentDescription = departmentDescription;
	}

	public Integer getPageNow() {
		return pageNow;
	}

	public void setPageNow(Integer pageNow) {
		this.pageNow = pageNow;
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public DepartmentInfoService getDepartmentService() {
		return departmentInfoService;
	}

	public void setDepartmentService(DepartmentInfoService departmentService) {
		this.departmentInfoService = departmentService;
	}

	public String addDep() {
		ArrayList<DepartmentInfo> list = departmentInfoService
				.findByName(departmentName);
		if (list.size() == 0) {
			DepartmentInfo user = new DepartmentInfo();
			user.setDepartmentName(departmentName);
			user.setDepartmentDescription(departmentDescription);
			user.setCreateTime(new Timestamp(new Date().getTime()));
			departmentInfoService.save(user);
		} else {
			Map request = (Map) ActionContext.getContext().get("request");
			request.put("msg", "此角色已经存在");
		}
		return SUCCESS;
	}

	public DepartmentInfoService getDepartmentInfoService() {
		return departmentInfoService;
	}

	public void setDepartmentInfoService(DepartmentInfoService departmentInfoService) {
		this.departmentInfoService = departmentInfoService;
	}
	

}
