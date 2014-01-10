package org.shu.plan.dao;
import java.util.List;

import org.shu.model.ConcResistComp;

import common.db.GenericHibernateDao;

public class ConcResistCompDAO extends GenericHibernateDao<ConcResistComp,Integer>{
	
	/** ��ѯ���л�������ѹǿ�ȼ�ⱨ��**/
	public List concResistCompSearch()
	{
		List result=this.getHibernateTemplate().find("from ConcResistComp");
		return result;
	}
	
	public List concResistCompSearch(String reportId)
	{
		List result=this.getHibernateTemplate().find("from ConcResistComp where reportId=?",reportId);
		return result;
	}
	public List findConcResist(String date)
	{
		List result=this.getHibernateTemplate().find("from ConcResistComp where DATE= '"+date+"' ");
		return result;
	}
}

