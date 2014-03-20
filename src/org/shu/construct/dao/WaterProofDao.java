package org.shu.construct.dao;
import java.util.List;

import org.shu.model.ProducePlan;
import org.shu.model.WaterProof;

import common.db.GenericHibernateDao;
import common.db.QueryParam;
import common.db.QueryResult;

public class WaterProofDao extends GenericHibernateDao<WaterProof,Integer>{
	public List waterProofSearch()
	{
		List result=this.getHibernateTemplate().find("from WaterProof");
		return result;
	}
	
	public List waterProofSearch(String reportId)
	{
		List result=this.getHibernateTemplate().find("from WaterProof where reportId=?",reportId);
		return result;
	}
	public void saveWaterProof(WaterProof waterProof){
		this.getHibernateTemplate().save(waterProof);
	}

	public List getAll() {
		return this.getHibernateTemplate().find("from WaterProof");
	}
	
}

