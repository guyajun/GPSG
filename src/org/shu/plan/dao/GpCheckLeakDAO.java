package org.shu.plan.dao;
import java.util.List;

import org.shu.model.GpAssemble;
import org.shu.model.GpCheckLeak;

import common.db.GenericHibernateDao;

public class GpCheckLeakDAO extends GenericHibernateDao<GpCheckLeak,Integer>{
	
	/** ��ѯ���иֽ�Ǽܰ��Ʒ����ⱨ��**/
	public List gpCheckLeakSearch(Integer type)
	{
		List result=this.getHibernateTemplate().find("from GpCheckLeak");
		return result;
	}
	
	public List gpCheckLeakSearch(Integer type,String reportId)
	{
		List result=this.getHibernateTemplate().find("from GpCheckLeak where reportId=?",reportId);
		return result;
	}
	
}

