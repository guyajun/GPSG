package org.shu.dao.imp;

import java.util.List;

import org.shu.dao.ITestDAO;
import org.springframework.orm.hibernate3.support.HibernateDaoSupport;

public class TestDAO extends HibernateDaoSupport implements ITestDAO {
	@SuppressWarnings({ "rawtypes" })
	public List getAllCatalogs() {
		List menus = this.getHibernateTemplate().find(
		" from FunctionInfo ");
		return menus;
	}
	
	public List getAllDepts()
	{
		List depts=this.getHibernateTemplate().find("from DepartmentInfo");
		return depts;
	}
	public List getAllRoles()
	{
		List roles=this.getHibernateTemplate().find("from RoleInfo");
		return roles;
	}
	
	public List getAllPros()
	{
		List pros=this.getHibernateTemplate().find("from ProInfo");
		return pros;
	}
	
	@SuppressWarnings({ "rawtypes" })
	public List getBaseInfo(Integer id)
	{
		List infos = this.getHibernateTemplate().find(
		" from ProInfo where id = ?",id);
	return infos;
	}
}
