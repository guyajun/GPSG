package org.shu.plan.dao;
import java.util.List;

import org.shu.model.ConcResistComp;
import org.shu.model.ConcResistLeak;
import org.shu.model.SteelSkelHalf;

import common.db.GenericHibernateDao;

public class SteelSkelHalfDAO extends GenericHibernateDao<SteelSkelHalf,Integer>{
	
	/** 查询所有钢筋骨架半成品抽查检测报告**/
	public List steelSkelHalfSearch()
	{
		List result=this.getHibernateTemplate().find("from SteelSkelHalf");
		return result;
	}
	
	public List steelSkelHalf(String reportId)
	{
		List result=this.getHibernateTemplate().find("from SteelSkelHalf where reportId=?",reportId);
		return result;
	}
	
}

