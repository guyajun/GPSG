package org.shu.plan.dao;
import java.util.List;

import org.shu.model.SteelQual;

import common.db.GenericHibernateDao;

public class SteelQualDAO extends GenericHibernateDao<SteelQual,Integer>{
	
	/** 查询所有钢筋质量证明书**/
	public List steelQual()
	{
		List result=this.getHibernateTemplate().find("from SteelQual order by reportId desc");
		return result;
	}
	
	public List steelQual(String reportId)
	{
		List result=this.getHibernateTemplate().find("from SteelQual where reportId=?",reportId);
		return result;
	}
	
	public List findSteelQual(String date)
	{
		List result=this.getHibernateTemplate().find("from SteelQual where '"+date+"' between useBeginTime and useEndTime");
		return result;
	}
	
}

