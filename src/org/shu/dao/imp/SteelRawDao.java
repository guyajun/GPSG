package org.shu.dao.imp;

import java.util.List;

import common.db.GenericHibernateDao;
import org.shu.model.SteelRaw;
public class SteelRawDao extends GenericHibernateDao<SteelRaw,Integer>{
	public void saveSteelRaw(SteelRaw steelRaw){
		this.getHibernateTemplate().save(steelRaw);
	}

	public List getAll() {
		return this.getHibernateTemplate().find("from SteelRaw");
	}	

}

