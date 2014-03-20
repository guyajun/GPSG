package org.shu.plan.dao;

import java.util.List;

import org.shu.model.FourTableSamePart;
import org.shu.model.ReportPdfMapping;

import common.db.GenericHibernateDao;

public class ReportPdfMappingDAO extends
		GenericHibernateDao<ReportPdfMapping, Integer> {

	
	public ReportPdfMapping getOnePdf(String reportid,Integer types)
	{
		String[] str={reportid,String.valueOf(types)};
		List result=this.getHibernateTemplate().find("from ReportPdfMapping where Report_ID=? and mark=?", str);
		if(result.size()>0)
		{
		return (ReportPdfMapping)result.get(0);
		}else
		{return null;}
	}
	
	public void savePdf(ReportPdfMapping entity)
	{
		this.getHibernateTemplate().save(entity);
	}
	public void updatePdf(ReportPdfMapping entity)
	{
		this.getHibernateTemplate().update(entity);
	}
	
	public List search(String id)
	{
		String[] str={id,"30"};
		return this.getHibernateTemplate().find("from ReportPdfMapping where Report_ID=? and mark=?",str);
	}
	public List search()
	{
		return this.getHibernateTemplate().find("from ReportPdfMapping where mark=? order by id desc","30");
	}
	public ReportPdfMapping findentity(String id)
	{
		String[] str={id,"30"};
		List list = this.getHibernateTemplate().find("from ReportPdfMapping where Report_ID=? and mark=?",str);
		if(list.size()>0)
		return (ReportPdfMapping)list.get(0);
		else
			return null;
	}

}
