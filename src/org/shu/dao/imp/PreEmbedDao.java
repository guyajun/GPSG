package org.shu.dao.imp;

import java.util.List;
import common.db.GenericHibernateDao;
import org.shu.model.PreEmbed;
public class PreEmbedDao extends GenericHibernateDao<PreEmbed,Integer>{
	public void savePreEmbed(PreEmbed preEmbed){
		this.getHibernateTemplate().save(preEmbed);
	}

	public List getAll() {
		return this.getHibernateTemplate().find("from PreEmbed");
	}	
	public List findPreEmbed(String date)
	{
		List result=this.getHibernateTemplate().find("from PreEmbed where '"+date+"' between purchaseTime and useEndTime");
		return result;
	}
	
	public List embedQuality()
	{
		List result=this.getHibernateTemplate().find("from PreEmbed order by type,useEndTime desc");
		return result;
	}
	
	public List embedQuality(String reportId)
	{
		List result=this.getHibernateTemplate().find("from PreEmbed where reportId=? order by type,useEndTime",reportId);
		return result;
	}

}

