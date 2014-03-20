package org.shu.dao.imp;

import java.util.List;

import common.db.GenericHibernateDao;
import org.shu.model.ConcQual;
public class ConcQualDao extends GenericHibernateDao<ConcQual,Integer>{
	public void saveConcQual(ConcQual concQual){
		this.getHibernateTemplate().save(concQual);
	}

	public List getAll() {
		return this.getHibernateTemplate().find("from ConcQual");
	}	

}

