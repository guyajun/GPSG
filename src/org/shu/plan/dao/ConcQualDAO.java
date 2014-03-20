package org.shu.plan.dao;
import java.util.List;

import org.shu.model.ConcQual;
import org.shu.model.SteelQual;

import common.db.GenericHibernateDao;

public class ConcQualDAO extends GenericHibernateDao<ConcQual,Integer>{
	
	/** 查询所有混凝土质量证明书**/
	public List concQual()
	{
		List result=this.getHibernateTemplate().find("from ConcQual");
		return result;
	}
	
	public List concQual(String reportId)
	{
		List result=this.getHibernateTemplate().find("from ConcQual where reportId=?",reportId);
		return result;
	}
	public List findConcQual(String date)
	{
		List result=this.getHibernateTemplate().find("from ConcQual where purchaseTime = '"+date+"'");
		return result;
	}
	
}

