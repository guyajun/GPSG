package org.shu.plan.dao;
import java.util.List;

import org.shu.model.GpAssemble;

import common.db.GenericHibernateDao;

public class GpAssembleDAO extends GenericHibernateDao<GpAssemble,Integer>{
	
	/** ��ѯ���иֽ�Ǽܰ��Ʒ����ⱨ��**/
	public List gpAssembleSearch(Integer type)
	{
		List result=this.getHibernateTemplate().find("from GpAssemble");
		return result;
	}
	
	public List gpAssembleSearch(Integer type,String reportId)
	{
		List result=this.getHibernateTemplate().find("from GpAssemble where reportId=?",reportId);
		return result;
	}
	
}

