package org.shu.plan.dao;

import java.util.List;

import org.shu.model.ConcPour;
import org.shu.model.FourTableSamePart;

import common.db.GenericHibernateDao;

public class ConcPourDAO extends
		GenericHibernateDao<ConcPour, Integer> {
	public List concSearch() {
		List result = this.getHibernateTemplate().find(
				"from ConcPour");
		return result;
	}

	public List concSearch(String reportId) {
		List result = this.getHibernateTemplate().find(
				"from ConcPour where reportId = ?",reportId);
//		List result2=this.getHibernateTemplate().find("from ConcPour where reportType = ?",type);
//		result.retainAll(result2);
		return result;
	}

}
