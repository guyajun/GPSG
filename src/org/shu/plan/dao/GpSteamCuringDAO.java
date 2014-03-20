package org.shu.plan.dao;
import java.util.List;

import org.shu.model.ConcQual;
import org.shu.model.GpSteamCuring;
import org.shu.model.SteelQual;

import common.db.GenericHibernateDao;

public class GpSteamCuringDAO extends GenericHibernateDao<GpSteamCuring,Integer>{
	
	/** ��ѯ���л���������֤����**/
	public List steamSearch(Integer type)
	{
		List result=this.getHibernateTemplate().find("from GpSteamCuring");
		return result;
	}
	
	public List steamSearch(Integer type,String reportId)
	{
		List result=this.getHibernateTemplate().find("from GpSteamCuring where reportId=?",reportId);
		return result;
	}
	
}

