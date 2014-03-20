package org.shu.dao.imp;

import java.util.List;
import common.db.GenericHibernateDao;
import org.shu.model.ConcResistComp;

public class ConcResistCompDao extends
		GenericHibernateDao<ConcResistComp, Integer> {
	public void saveConcResistComp(ConcResistComp concResistComp) {
		this.getHibernateTemplate().save(concResistComp);
	}

	@SuppressWarnings("unchecked")
	public List<ConcResistComp> getAll() {
		return this.getHibernateTemplate().find("from ConcResistComp");
	}

	@SuppressWarnings("unchecked")
	public List<ConcResistComp> getComcResist(String start_date, String end_date) {

		String[] dates = { start_date, end_date };
		List<ConcResistComp> list = this.getHibernateTemplate().find(
				"from ConcResistComp where date between ? and ?",dates);
		return list;

	}

}
