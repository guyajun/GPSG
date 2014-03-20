package org.shu.plan.dao;
import java.util.List;

import org.shu.model.ConcResistComp;
import org.shu.model.ConcResistLeak;
import org.shu.model.GpStorage;
import org.shu.model.SteelSkelHalf;
import org.shu.model.UserInfo;

import common.db.GenericHibernateDao;

public class GpStorageDAO extends GenericHibernateDao<GpStorage,Integer>{
	
	/** ≤÷¥¢π‹¿Ì **/
	public void addStorage(GpStorage gs){
		this.getHibernateTemplate().save(gs);
	}
	
	public List gpStorageSearch()
	{
		List result=this.getHibernateTemplate().find("from GpStorage");
		return result;
	}
	
	public List gpStorageSearch(String reportId)
	{
		List result=this.getHibernateTemplate().find("from GpStorage where coverId=?",reportId);
		return result;
	}
}

