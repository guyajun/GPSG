package org.shu.dao.imp;

import java.util.List;
import common.db.GenericHibernateDao;
import org.shu.model.ConcResistLeak;

public class ConcResistLeakDao extends GenericHibernateDao<ConcResistLeak,Integer>{
	public void saveConcResistLeak(ConcResistLeak concResistLeak){
		this.getHibernateTemplate().save(concResistLeak);
	}

	public List getAll() {
		return this.getHibernateTemplate().find("from ConcResistLeak");
	}	

}

