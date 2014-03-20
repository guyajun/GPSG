package org.shu.construct.service;

import java.util.ArrayList;
import java.util.List;

import org.shu.admin.dao.DepartmentDAO;
import org.shu.construct.dao.DepartmentInfoDao;
import org.shu.model.DepartmentInfo;
import org.shu.model.GpMeasurepoint;

public class DepartmentInfoService {
	
	private DepartmentInfoDao departmentInfoDao;
	
	public DepartmentInfoDao getDepartmentInfoDao() {
		return departmentInfoDao;
	}
	public ArrayList<DepartmentInfo> getByName(String departmentname) {
		return departmentInfoDao.findmohuName(departmentname);
	}
	public void setDepartmentInfoDao(DepartmentInfoDao departmentInfoDao) {
		this.departmentInfoDao = departmentInfoDao;
	}
	public ArrayList<DepartmentInfo> getDepInfo() {
		return (ArrayList<DepartmentInfo>) departmentInfoDao.depSearch();
	}
	public ArrayList<DepartmentInfo> getAll()
	{		
		return  (ArrayList<DepartmentInfo>) departmentInfoDao.getAll();
	}
	public ArrayList<DepartmentInfo> getOnePageByCno(String departmentname, int pageNow,
			int pageSize) {
		return departmentInfoDao.getByCno(departmentname, pageNow, pageSize);
	}
	
	/**
	 * @param departmentName
	 * @return
	 */
	public ArrayList<DepartmentInfo> findByName(String departmentName){
		return departmentInfoDao.findByName(departmentName);
	}
	public void save(DepartmentInfo departmentInfo) {
		departmentInfoDao.save(departmentInfo);
	}
	public void delete(DepartmentInfo departmentInfo){
		departmentInfoDao.delete(departmentInfo);
	}
	public List<DepartmentInfo> findById(Integer id) {
		return departmentInfoDao.findById(id);
	}
	public void update(DepartmentInfo departmentInfo) {
		departmentInfoDao.update(departmentInfo);
	}
	
}
