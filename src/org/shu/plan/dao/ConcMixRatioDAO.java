package org.shu.plan.dao;
import java.util.List;

import org.shu.model.ConcMixRatio;

import common.db.GenericHibernateDao;

public class ConcMixRatioDAO extends GenericHibernateDao<ConcMixRatio,Integer>{
	
	/** 查询所有混凝土质量证明书**/
	public List concMixRatio()
	{
		List result=this.getHibernateTemplate().find("from ConcMixRatio");
		return result;
	}
	
	public List concMixRatio(String reportId)
	{
		List result=this.getHibernateTemplate().find("from ConcMixRatio where reportId=?",reportId);
		return result;
	}
	public List findConcMix(String date)
	{
		List result=this.getHibernateTemplate().find("from ConcMixRatio where date = '"+date+"'");
		return result;
	}
	
}

