package org.shu.common.service;

import java.util.ArrayList;
import java.util.List;

import org.shu.admin.dao.DepartmentDAO;
import org.shu.model.DepartmentInfo;
import org.shu.model.ProInfo;
import org.shu.model.UserInfo;

public class DepartmentService {
	private DepartmentDAO deptDAO;
	
	public void setDeptDAO(DepartmentDAO deptDAO) {
		this.deptDAO = deptDAO;
	}
	public void update(DepartmentInfo departmentInfo) {
		deptDAO.update(departmentInfo);
	}
	public void save(DepartmentInfo departmentInfo) {
		deptDAO.save(departmentInfo);
	}
	public ArrayList<DepartmentInfo> getAll() {
		return deptDAO.getAll();
		 
	}
	 public ArrayList<DepartmentInfo> findBydepName(String departmentName){
			return deptDAO.findByName(departmentName);
		}
	public List<DepartmentInfo> findss(Integer deptnumber)
	{
		return deptDAO.findById(deptnumber);
	}
	public ArrayList<DepartmentInfo> getDepInfo() {
		return (ArrayList<DepartmentInfo>) deptDAO.depSearch();
	}
	public ArrayList<DepartmentInfo> findByName(String departmentName){
		return deptDAO.findByName(departmentName);
	}
	public void delete(DepartmentInfo departmentInfo){
		deptDAO.delete(departmentInfo);
	}
	public List<DepartmentInfo> findById(Integer id) {
		return deptDAO.findById(id);
	}
}
