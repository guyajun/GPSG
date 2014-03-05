package org.shu.construct.dao;

import java.util.ArrayList;
import java.util.List;

import org.shu.model.DepartmentInfo;
import org.shu.model.GpMeasurepoint;

import common.db.GenericHibernateDao;

public class DepartmentInfoDao extends GenericHibernateDao<DepartmentInfo, Integer> {
	public ArrayList<DepartmentInfo> getAll() {
		String sql = "select * from DEPARTMENT_INFO";
		ArrayList<DepartmentInfo> list = (ArrayList<DepartmentInfo>) this.sqlFind(sql);		
		return list;
	}
	public List<DepartmentInfo> depSearch()
    {
        List<DepartmentInfo> result = this.getHibernateTemplate().find("from DepartmentInfo");
        return result;
    }
	public ArrayList<DepartmentInfo> findByName(String departmentname)
	{
		String sql="select * from DEPARTMENT_INFO where DEPARTMENT_NAME='"+departmentname+"';";
		ArrayList<DepartmentInfo> list=(ArrayList<DepartmentInfo>)this.sqlFind(sql);
		return list;
	}
	public ArrayList<DepartmentInfo> findmohuName(String departmentname)
	{
		String sql="select * from DEPARTMENT_INFO where DEPARTMENT_NAME like '%"+departmentname+"%';";
		ArrayList<DepartmentInfo> list=(ArrayList<DepartmentInfo>) sqlFind(sql);
		return list;
	}
//	public ArrayList<DepartmentInfo> getByName(String cbCdno) {
//		System.out.println("cbCdno=" + cbCdno);
//		String sql = "select * from Gp_Measurepoint where Cb_Cdno ='" + cbCdno+"';";
//		ArrayList<DepartmentInfo> gpMeasurepoint = (ArrayList<DepartmentInfo>) this
//				.sqlFind(sql);
//		return gpMeasurepoint;
//	}
	public void addDept(DepartmentInfo departmentInfo){
		this.getHibernateTemplate().save(departmentInfo);
	}
	public void save(DepartmentInfo departmentInfo){
		this.getHibernateTemplate().save(departmentInfo);
	}
	public void delete(DepartmentInfo departmentInfo){
		this.getHibernateTemplate().delete(departmentInfo);
	}
	public List<DepartmentInfo> findById(Integer id) {
		 List<DepartmentInfo> result = this.getHibernateTemplate().find("from DepartmentInfo where id=?",id);
		return result;
	}
	public void update(DepartmentInfo departmentInfo){
		this.getHibernateTemplate().update(departmentInfo);
	}
	public ArrayList<DepartmentInfo> getByCno(String departmentname, int pageNow,
			int pageSize) {
		ArrayList<DepartmentInfo> measureList = findByName(departmentname);
		ArrayList<DepartmentInfo> measureList1 = new ArrayList<DepartmentInfo>();
		for (int i = ((pageNow - 1) * pageSize); i <= (pageNow * pageSize - 1); i++) {
			if (i < measureList.size()) {
				measureList1.add(measureList.get(i));
			} else {
				break;
			}
		}
		return measureList1;
	}
}
