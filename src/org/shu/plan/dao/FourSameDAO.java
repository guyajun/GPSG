package org.shu.plan.dao;

import java.util.List;

import org.shu.model.FourTableSamePart;

import common.db.GenericHibernateDao;

public class FourSameDAO extends
		GenericHibernateDao<FourTableSamePart, Integer> {
	public List productSearch(Integer type) {
		List result = this.getHibernateTemplate().find(
				"from FourTableSamePart where reportType=?", type);
		return result;
	}
	
	public FourTableSamePart getOneFTSP(Integer types)
	{
		List result=this.getHibernateTemplate().find("from FourTableSamePart where reportType=?", types);
		return (FourTableSamePart)result.get(0);
	}

	public List productSearch(Integer type, String reportId) {
		Object[] str={reportId,type};
//		List result=this.getHibernateTemplate().find("from FourTableSamePart where reportId=?",reportId);
//		List result2=this.getHibernateTemplate().find("from FourTableSamePart where reportType=?",type);
		List result=this.getHibernateTemplate().find("from FourTableSamePart where reportId=? and reportType=?",str);
//		result.retainAll(result2);
		return result;
	}

}
