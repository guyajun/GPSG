package org.shu.plan.dao;
import java.util.List;

import org.shu.model.ConcQual;
import org.shu.model.GpCrane;
import org.shu.model.GpSteamCuring;
import org.shu.model.GpWaterCuring;
import org.shu.model.SteelQual;

import common.db.GenericHibernateDao;

public class GpWaterCuringDAO extends GenericHibernateDao<GpWaterCuring,Integer>{
	
	/** 查询所有水养报告**/
	public List gpwaterSearch()
	{
		List result=this.getHibernateTemplate().find("from GpWaterCuring");
		return result;
	}
	
	public List gpwaterSearch(String reportId)
	{
		List result=this.getHibernateTemplate().find("from GpWaterCuring where reportId=?",reportId);
		return result;
	}
	
}

