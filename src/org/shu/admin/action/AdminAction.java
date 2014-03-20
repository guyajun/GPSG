package org.shu.admin.action;

import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.apache.struts2.json.annotations.JSON;
import org.shu.model.UserInfo;

import common.base.action.BaseAction;
import common.db.QueryResult;

@SuppressWarnings("serial")
public class AdminAction extends BaseAction {
	protected UserInfo userinfo;
//	protected FunctionInfo menuinfo;
//	protected RoleInfo roleinfo;
//	protected ProInfo proinfo;
//	protected DepartmentInfo deptinfo;
//	protected IAdminService adminService;
	private int total;
	private List<Object> rows;
//	private List<ComboBox> combox;
//	private List<ComboBox> combox1;
	private int page;
	private int row;
	 
//	public List<ComboBox> getCombox1() {
//		return combox1;
//	}
	
	public void setPage(int page) {
		this.page = page;
	}
	
	public void setRows(List<Object> rows) {
		this.rows = rows;
	}
//	 
//	public List<ComboBox> getCombox() {
//		return combox;
//	}
//	
//	public void setCombox(List<ComboBox> combox) {
//		this.combox = combox;
//	}
	
//	public void setAdminService(IAdminService adminService) {
//		this.adminService = adminService;
//	}
	 
	public int getTotal() {
		return total;
	}

	public void setTotal(int total) {
		this.total = total;
	}
	
	public List<Object> getRows() {
		return rows;
	}
	///////////////////////////////
//	public void setCombox1(List<ComboBox> combox1) {
//		this.combox1 = combox1;
//	}
//
//	@JSON(serialize=false) 
//	public int getPage() {
//		return page;
//	}
//
//	
//	@JSON(serialize=false) 
//	public int getRow() {
//		return row;
//	}
//
//	public void setRow(int row) {
//		this.row = row;
//	}
//	
//
//
//	
	@JSON(serialize=false) 
	public UserInfo getUserinfo() {
		return userinfo;
	}

	public void setUserinfo(UserInfo userinfo) {
		this.userinfo = userinfo;
	}

	
//	@JSON(serialize=false) 
//	public FunctionInfo getMenuinfo() {
//		return menuinfo;
//	}
//
//	public void setMenuinfo(FunctionInfo menuinfo) {
//		this.menuinfo = menuinfo;
//	}
//	@JSON(serialize=false) 
//	public RoleInfo getRoleinfo() {
//		return roleinfo;
//	}
//
//	public void setRoleinfo(RoleInfo roleinfo) {
//		this.roleinfo = roleinfo;
//	}
//	@JSON(serialize=false) 
//	public ProInfo getProinfo() {
//		return proinfo;
//	}
//
//	public void setProinfo(ProInfo proinfo) {
//		this.proinfo = proinfo;
//	}
//	@JSON(serialize=false) 
//	public DepartmentInfo getDeptinfo() {
//		return deptinfo;
//	}
//
//	public void setDeptinfo(DepartmentInfo deptinfo) {
//		this.deptinfo = deptinfo;
//	}
//	@JSON(serialize=false) 
//	public JSONArray getJsonarray() {
//		return jsonarray;
//	}
//
//	public void setJsonarray(JSONArray jsonarray) {
//		this.jsonarray = jsonarray;
//	}
	

	/** ========================用户管理=================== **/
	/** 添加用户 **/
//	public String addUser() throws Exception {
//		UserInfo user1 = new UserInfo();
//		user1.setFullName(userinfo.getFullName());
//		user1.setLoginName(userinfo.getLoginName());
//		user1.setPassword(userinfo.getPassword());
//		user1.setJobNumber(userinfo.getJobNumber());
//		user1.setCellPhone(userinfo.getCellPhone());
//		user1.setCreator(userinfo.getCreator());
//		user1.setCreateTime(userinfo.getCreateTime());
//		user1.setModifier(userinfo.getModifier());
//		user1.setModifyTime(userinfo.getModifyTime());
//		user1.setDepartmentInfo.(departmentInfo)(userinfo.getDepartmentInfo().getId());
//		user1.setEmail(userinfo.getEmail());
//		adminService.addUser(user1);
//		return SUCCESS;
//	}
//	public void delUser() throws Exception
//	{

//		Integer userId=Integer.valueOf(request.getParameter("id"));
//		
//		if(userId != null)
//		{
//			try{
	//	adminService.delUser(userId);
//		response.setContentType("text/plain;charset=gb2312");
//		response.getWriter().println("删除成功");
//		}
//		catch(Exception e)
//		{
//			response.setContentType("text/plain;charset=gb2312");
//			try{
//				response.getWriter().println("删除时出现异常");
//			}catch(IOException e1)
//			{e1.printStackTrace();}
//			e.printStackTrace();
//		}
//		}else
//		{
//			response.setContentType("text/plain;charset=gb2312");
//			try
//			{
//				response.getWriter().println("请选择一个用户");
//			}catch(IOException e)
//			{
//				e.printStackTrace();
//			}
//		}
//	}

//	public String userDataGrid() throws Exception
//	{
//		QueryResult<UserInfo> results=adminService.getAllUsers(page, row);
//		List<UserInfo> userList=results.getList();
//		if(userList.size()>0)
//		{
//			total=results.getTotal();
//		}else
//		{total=0;}
//		this.rows=new ArrayList<Object>();
//		if(userList.size()>0)
//		{
//			for(int i=0;i<userList.size();i++)
//			{
//				Map<String, Object> map = new HashMap<String, Object>();
//				map.put("id", userList.get(i).getId());
//				map.put("jobnumber", userList.get(i).getJobNumber());
//				map.put("name", userList.get(i).getFullName());
//				map.put("loginname", userList.get(i).getLoginName());
//				map.put("dept", userList.get(i).getDepartNo());
//				map.put("phone", userList.get(i).getCellPhone());
//				map.put("mail", userList.get(i).getEmail());
//				map.put("creater", userList.get(i).getCreator());
//				map.put("createtime", userList.get(i).getCreateTime());
//				map.put("modifier", userList.get(i).getModifier());
//				map.put("modifytime", userList.get(i).getModifyTime());
//				this.rows.add(map);
//			}
//		}
//		return SUCCESS;
//	}
//	
//	@SuppressWarnings({ "rawtypes", "unchecked" })
//	@JSON(serialize=false) 
//	public <userInfo> String getAllUsers() throws Exception {
//		List<UserInfo> userList = adminService.getAllUsers();
//		if (userList.size() > 0) {
//			total = userList.size();
//		} else {
//			total = 0;
//		}
//		this.rows = new ArrayList<Object>();
//		if (userList.size() > 0) {
//			for (int i = 0; i < userList.size(); i++) {
//				Map<String, Object> map = new LinkedHashMap<String, Object>();
//				map.put("id", userList.get(i).getId());
//				map.put("jobnumber", userList.get(i).getJobNumber());
//				map.put("name", userList.get(i).getFullName());
//				map.put("loginname", userList.get(i).getLoginName());
//				map.put("dept", userList.get(i).getDepartNo());
//				map.put("phone", userList.get(i).getCellPhone());
//				map.put("mail", userList.get(i).getEmail());
//				map.put("creater", userList.get(i).getCreator());
//				map.put("createtime", userList.get(i).getCreateTime());
//				map.put("modifier", userList.get(i).getModifier());
//				map.put("modifytime", userList.get(i).getModifyTime());
//				this.rows.add(map);
//			}
//		}

//		jsonarray=JSONArray.fromObject(rows);
//		Iterator tt=rows.iterator();
//		while(tt.hasNext())
//		{

//		}

//		return SUCCESS;
//	}

	/** ========================菜单管理=================== **/
//	public String addMenu() throws Exception {
//		FunctionInfo menu1 = new FunctionInfo();
//		adminService.addMenu(menu1);
//		return SUCCESS;
//	}
//	@JSON(serialize=false) 
//	@SuppressWarnings({ "rawtypes", "unchecked" })
//	public String getAllMenus() throws Exception {
//		List menus = adminService.getAllMenus();
//		Map request = (Map) ActionContext.getContext().get("request");
//		request.put("users", menus);
//		return SUCCESS;
//	}

	/** ========================角色管理=================== **/
//	public String addRole() throws Exception {
//		RoleInfo role1 = new RoleInfo();
//		role1.setRoleName(roleinfo.getRoleName());
//		role1.setRoleDescription(roleinfo.getRoleDescription());
//		adminService.addRole(role1);
//		return SUCCESS;
//	}
//	@JSON(serialize=false) 
//	@SuppressWarnings({ "rawtypes", "unchecked" })
//	public String getAllRoles() throws Exception {
//		List roles = adminService.getAllRoles();
//		Map request = (Map) ActionContext.getContext().get("request");
//		request.put("roles", roles);
//		return SUCCESS;
//	}

	/** ========================项目管理=================== **/
//	public String addProject() throws Exception {
//		ProInfo pro1 = new ProInfo();
//		// pro1.set...(proinfo.get());
//		adminService.addProject(pro1);
//		return SUCCESS;
//	}
//	@JSON(serialize=false) 
//	@SuppressWarnings({ "rawtypes", "unchecked" })
//	public String getAllPros() throws Exception {
//		List pros = adminService.getAllPros();
//		Map request = (Map) ActionContext.getContext().get("request");
//		request.put("users", pros);
//		return SUCCESS;
//	}

	/** ========================部门管理=================== **/
//	public String addDept() throws Exception {

//		DepartmentInfo dept1 = new DepartmentInfo();
//		dept1.setDepartmentName(deptinfo.getDepartmentName());
//		dept1.setDepartmentDescription(deptinfo.getDepartmentDescription());
//		dept1.setParentId(deptinfo.getParentId());
//		adminService.addDept(dept1);

//		return SUCCESS;
//	}
}
