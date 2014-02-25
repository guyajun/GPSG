package org.shu.construct.service;

import java.util.ArrayList;
import org.shu.construct.dao.DepartmentInfoDao;
import org.shu.model.DepartmentInfo;

public class DepartmentInfoService {

	private DepartmentInfoDao departmentInfoDao;
	
	public void setDepartmentInfoDao(DepartmentInfoDao departmentInfoDao) {
		this.departmentInfoDao = departmentInfoDao;
	}

	public ArrayList<DepartmentInfo> getAll()
	{		
		return departmentInfoDao.getAll();
	}	
}
