package org.shu.dao.imp;

import java.util.List;
import common.db.GenericHibernateDao;
import org.shu.model.GpCrane;

public class GpCraneDao extends GenericHibernateDao<GpCrane,Integer>{
	public void saveGpCrane(GpCrane gpCrane){
		this.getHibernateTemplate().save(gpCrane);
	}

	public List getAll() {
		return this.getHibernateTemplate().find("from GpCrane");
	}	

}

