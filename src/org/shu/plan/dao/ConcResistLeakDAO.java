package org.shu.plan.dao;
import java.util.List;

import org.shu.model.ConcResistComp;
import org.shu.model.ConcResistLeak;

import common.db.GenericHibernateDao;

public class ConcResistLeakDAO extends GenericHibernateDao<ConcResistLeak,Integer>{
	
	/** ��ѯ���л���������ǿ�ȼ�ⱨ��**/
	public List concResistLeakSearch()
	{
		List result=this.getHibernateTemplate().find("from ConcResistLeak");
		return result;
	}
	
	public List concResistLeakSearch(String reportId)
	{
		List result=this.getHibernateTemplate().find("from ConcResistLeak where reportId=?",reportId);
		return result;
	}
	
}

