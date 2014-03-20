package org.shu.plan.dao;
import java.util.List;

import org.shu.model.ConcResistComp;
import org.shu.model.ConcResistLeak;
import org.shu.model.GpReceive;
import org.shu.model.GpStorage;
import org.shu.model.SteelSkelHalf;
import org.shu.model.UserInfo;

import common.db.GenericHibernateDao;

public class GpReceiveDAO extends GenericHibernateDao<GpReceive,Integer>{
	
	/** 接收管理 **/
	public void addStorage(GpReceive gr){
		this.getHibernateTemplate().save(gr);
	}
	
	public List gpReceiveSearch()
	{
		List result=this.getHibernateTemplate().find("from GpReceive");
		return result;
	}
	
	public List gpReceiveSearch(String reportId)
	{
		List result=this.getHibernateTemplate().find("from GpReceive where reportId=?",reportId);
		return result;
	}
}

