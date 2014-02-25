package org.shu.admin.action;

import java.sql.Timestamp;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.apache.struts2.json.annotations.JSON;
import org.shu.common.service.AdminService;
import org.shu.common.service.DepartmentService;
import org.shu.model.DepartmentInfo;
import org.shu.model.ProInfo;
import org.tool.Pager;

import com.opensymphony.xwork2.ActionContext;
import common.base.action.BaseAction;
import common.db.QueryResult;

@SuppressWarnings("serial")
public class DepartmentAction extends BaseAction {

	private Integer pageNow = 1;
	private DepartmentService departmentService;
	protected DepartmentInfo deptinfo;
	private Integer id;
	private Integer parentId;
	private String departmentName;
	private String departmentDescription;

	public String getAll() {
		Pager pager = new Pager(pageNow, departmentService.getDepInfo().size());
		ArrayList<DepartmentInfo> deplist = departmentService.getAll();
		Map request = (Map) ActionContext.getContext().get("request");
		request.put("pager", pager);
		request.put("deplist", deplist);
		return SUCCESS;
	}

	public String deletedepo() {
		System.out.println(id);
		List<DepartmentInfo> list = departmentService.findById(id);
		departmentService.delete(list.get(0));
		return SUCCESS;
	}
	public String deletedep(){
		ArrayList<DepartmentInfo> list = departmentService.findBydepName(departmentName);
		departmentService.delete(list.get(0));
		return SUCCESS;
	}



	public Integer getPageNow() {
		return pageNow;
	}

	public void setPageNow(Integer pageNow) {
		this.pageNow = pageNow;
	}



	public void setDepartmentService(DepartmentService departmentService) {
		this.departmentService = departmentService;
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public Integer getParentId() {
		return parentId;
	}

	public void setParentId(Integer parentId) {
		this.parentId = parentId;
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

	public int getRow() {
		return row;
	}

	public void setRow(int row) {
		this.row = row;
	}

	

	public int getPage() {
		return page;
	}

	private int total;
	private List<Object> rows;

	private int page;
	private int row;

	public void setPage(int page) {
		this.page = page;
	}

	public void setRows(List<Object> rows) {
		this.rows = rows;
	}



	public int getTotal() {
		return total;
	}

	public void setTotal(int total) {
		this.total = total;
	}

	public List<Object> getRows() {
		return rows;
	}

	@JSON(serialize = false)
	public DepartmentInfo getDeptinfo() {
		return deptinfo;
	}

	public void setDeptinfo(DepartmentInfo deptinfo) {
		this.deptinfo = deptinfo;
	}



	

	
	public String editDep() {
		System.out.println("ttt");
		List<DepartmentInfo> list = departmentService.findById(id);
		if (list.size() > 0) {
			DepartmentInfo dept=list.get(0);
			dept.setDepartmentName(departmentName);
			dept.setDepartmentDescription(departmentDescription);
			departmentService.update(dept);
		}
		return SUCCESS;
	}

	public String addDep() {
		ArrayList<DepartmentInfo> list = departmentService
				.findByName(departmentName);
		if (list.size() == 0) {
			DepartmentInfo user = new DepartmentInfo();
			user.setDepartmentName(departmentName);
			user.setDepartmentDescription(departmentDescription);
			user.setCreateTime(new Timestamp(new Date().getTime()));
			departmentService.save(user);
		} else {
			Map request = (Map) ActionContext.getContext().get("request");
			request.put("msg", "此角色已经存在");
		}
		return SUCCESS;
	}

}
