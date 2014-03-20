package org.shu.admin.dao;
import java.util.ArrayList;
import java.util.List;

import org.shu.model.DepartmentInfo;
import org.shu.model.UserInfo;

import common.db.GenericHibernateDao;
import common.db.QueryParam;
import common.db.QueryResult;

public class DepartmentDAO extends GenericHibernateDao<DepartmentInfo,Integer>{
	/** ��Ӳ��� **/
	public void addDept(DepartmentInfo dept){
		this.getHibernateTemplate().save(dept);
	}
	/** ��ѯ���в���**/
	public void save(DepartmentInfo departmentInfo){
		this.getHibernateTemplate().save(departmentInfo);
	}
	public void update(DepartmentInfo departmentInfo){
		this.getHibernateTemplate().update(departmentInfo);
	}
	public void delete(DepartmentInfo departmentInfo){
		this.getHibernateTemplate().delete(departmentInfo);
	}
	public ArrayList<DepartmentInfo> findByName(String departmentname)
	{
		String sql="select * from DEPARTMENT_INFO where DEPARTMENT_NAME='"+departmentname+"';";
		ArrayList<DepartmentInfo> list=(ArrayList<DepartmentInfo>) sqlFind(sql);
		return list;
	}
	 public List<DepartmentInfo> depSearch()
	    {
	        List<DepartmentInfo> result = this.getHibernateTemplate().find("from DepartmentInfo");
	        return result;
	    }
	public ArrayList<DepartmentInfo> findAll()
	{
		return (ArrayList<DepartmentInfo>) this.getHibernateTemplate().find("from DepartmentInfo");
	}
	public QueryResult<DepartmentInfo> getAllDepts(int page,int row)  throws Exception
	{
		QueryParam param=new QueryParam();
			param.setPage(page-1, row);
			param.addOrder("id",QueryParam.ORDER_DESC);
		QueryResult<DepartmentInfo> result = list(param);
		return result;  
	}
	public ArrayList<DepartmentInfo> getAll() {
		String sql="select * from DEPARTMENT_INFO;";
		ArrayList<DepartmentInfo> deplist=(ArrayList<DepartmentInfo>) sqlFind(sql);
		return deplist;
	}
	/**ɾ����**/
	public void delete(Integer deptnumber)
	{
		this.getHibernateTemplate().delete(findss(deptnumber));
	}
	public DepartmentInfo findss(Integer deptnumber)
	{
		List list=this.getHibernateTemplate().find("from DepartmentInfo where id=?",deptnumber);
		if(list.size()>0)
			return (DepartmentInfo)list.get(0);
		else
			return null;
	}
	
	public DepartmentInfo findDeptEntity(Integer deptnumber)
	{
	 List result= this.getHibernateTemplate().find("from DepartmentInfo  where id=?",deptnumber);
	 if(result.size()>0)
	 return (DepartmentInfo)result.get(0);
	 else
	 return null;
	}
	
	public List findDeptById(Integer deptnumber)
	{
	 List result= this.getHibernateTemplate().find("from DepartmentInfo where id=?",deptnumber);
	 return result;
	}
	public void updateDept(DepartmentInfo dept)
	{
		this.getHibernateTemplate().update(dept);
	}
	public List<DepartmentInfo> findById(Integer id) {
		 List<DepartmentInfo> result = this.getHibernateTemplate().find("from DepartmentInfo where id=?",id);
		return result;
	}

}

