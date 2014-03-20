package org.shu.dao.imp;

import java.util.List;
import common.db.GenericHibernateDao;
import org.shu.model.ConcMixRatio;
public class ConcMixRatioDao extends GenericHibernateDao<ConcMixRatio,Integer>{
	public void saveConcMixRatio(ConcMixRatio concMixRatio){
		this.getHibernateTemplate().save(concMixRatio);
	}

	public List getAll() {
		return this.getHibernateTemplate().find("from ConcMixRatio");
	}	

}

