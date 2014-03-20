package org.shu.plan.dao;
import java.util.List;

import org.shu.model.ConcQual;
import org.shu.model.GpCrane;
import org.shu.model.GpSteamCuring;
import org.shu.model.SteelQual;

import common.db.GenericHibernateDao;

public class GpCraneDAO extends GenericHibernateDao<GpCrane,Integer>{
	
	/** 查询所有放松起吊通知单**/
	public List craneSearch()
	{
		List result=this.getHibernateTemplate().find("from GpCrane");
		return result;
	}
	
	public List craneSearch(String reportId)
	{
		List result=this.getHibernateTemplate().find("from GpCrane where reportId=?",reportId);
		return result;
	}
	
}

