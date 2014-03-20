package org.shu.dao.imp;

import java.util.Date;
import java.util.List;

import org.shu.model.SteelQual;

import common.db.GenericHibernateDao;
public class SteelQualDao extends GenericHibernateDao<SteelQual,Integer>{
	public void saveSteelQual(SteelQual steelQual){
		this.getHibernateTemplate().save(steelQual);
	}

	public List<SteelQual> getAll() {
		return this.getHibernateTemplate().find("from SteelQual");
	}
	public List<SteelQual> getBetween(String useBeginTime,String today) {
		Object[] str={useBeginTime,today};
		return this.getHibernateTemplate().find("from SteelQual where USE_BEGIN_TIME >? and USE_BEGIN_TIME<?",str);
	}
}

