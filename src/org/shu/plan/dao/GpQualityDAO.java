package org.shu.plan.dao;
import java.util.List;

import org.shu.model.GpQuality;

import common.db.GenericHibernateDao;

public class GpQualityDAO extends GenericHibernateDao<GpQuality,Integer>{
	
	/** 出厂管理 **/
	public void addQuality(GpQuality gs){
		this.getHibernateTemplate().save(gs);
	}
	
	public List gpQualitySearch()
	{
		List result=this.getHibernateTemplate().find("from GpQuality");
		return result;
	}
	
	public List gpQualitySearch(String reportId)
	{
		List result=this.getHibernateTemplate().find("from GpQuality where reportId=?",reportId);
		return result;
	}
}

