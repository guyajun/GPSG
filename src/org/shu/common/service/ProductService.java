package org.shu.common.service;

import java.util.Collection;
import java.util.List;

import org.hibernate.Criteria;
import org.hibernate.SessionFactory;
import org.hibernate.criterion.DetachedCriteria;
import org.shu.model.FourTableSamePart;
import org.shu.model.ReportPdfMapping;
import org.shu.plan.dao.ConcPourDAO;
import org.shu.plan.dao.FourSameDAO;
import org.shu.plan.dao.GpCraneDAO;
import org.shu.plan.dao.GpSteamCuringDAO;
import org.shu.plan.dao.GpWaterCuringDAO;
import org.shu.plan.dao.ReportPdfMappingDAO;
import org.springframework.beans.factory.BeanInitializationException;
import org.springframework.orm.hibernate3.HibernateTemplate;

import common.db.QueryParam;
import common.db.QueryResult;


public class ProductService {
	
	private FourSameDAO fourSameDAO;
	private ConcPourDAO concPourDAO;
	private GpSteamCuringDAO gpSteamDAO;
	private GpCraneDAO gpCraneDAO;
	private GpWaterCuringDAO gpWaterCuringDAO;
	private ReportPdfMappingDAO reportPdfMappingDAO;

	public ReportPdfMappingDAO getReportPdfMappingDAO() {
		return reportPdfMappingDAO;
	}
	public void setReportPdfMappingDAO(ReportPdfMappingDAO reportPdfMappingDAO) {
		this.reportPdfMappingDAO = reportPdfMappingDAO;
	}
	public final void afterPropertiesSet() throws IllegalArgumentException,
			BeanInitializationException {
		reportPdfMappingDAO.afterPropertiesSet();
	}
	public ReportPdfMapping get(Integer id) {
		return reportPdfMappingDAO.get(id);
	}
	public void evict(ReportPdfMapping entity) {
		reportPdfMappingDAO.evict(entity);
	}
	public void delete(ReportPdfMapping entity) {
		reportPdfMappingDAO.delete(entity);
	}
	public void deleteByKey(Integer id) {
		reportPdfMappingDAO.deleteByKey(id);
	}
	public void deleteAll(Collection<ReportPdfMapping> entities) {
		reportPdfMappingDAO.deleteAll(entities);
	}
	public boolean equals(Object obj) {
		return reportPdfMappingDAO.equals(obj);
	}
	public List<ReportPdfMapping> find(String queryString) {
		return reportPdfMappingDAO.find(queryString);
	}
	public List<ReportPdfMapping> find(String queryString, Object[] values) {
		return reportPdfMappingDAO.find(queryString, values);
	}
	public DetachedCriteria createDetachedCriteria() {
		return reportPdfMappingDAO.createDetachedCriteria();
	}
	public Criteria createCriteria() {
		return reportPdfMappingDAO.createCriteria();
	}
	public List<ReportPdfMapping> findEqualByEntity(ReportPdfMapping entity,
			String[] propertyNames) {
		return reportPdfMappingDAO.findEqualByEntity(entity, propertyNames);
	}
	public void flush() {
		reportPdfMappingDAO.flush();
	}
	public final HibernateTemplate getHibernateTemplate() {
		return reportPdfMappingDAO.getHibernateTemplate();
	}
	public final SessionFactory getSessionFactory() {
		return reportPdfMappingDAO.getSessionFactory();
	}
	public int hashCode() {
		return reportPdfMappingDAO.hashCode();
	}
	public ReportPdfMapping load(Integer id) {
		return reportPdfMappingDAO.load(id);
	}
	public List<ReportPdfMapping> loadAll() {
		return reportPdfMappingDAO.loadAll();
	}
	public void save(ReportPdfMapping entity) {
		reportPdfMappingDAO.save(entity);
	}
	public void saveOrUpdate(ReportPdfMapping entity) {
		reportPdfMappingDAO.saveOrUpdate(entity);
	}
	public void saveOrUpdateAll(Collection<ReportPdfMapping> entities) {
		reportPdfMappingDAO.saveOrUpdateAll(entities);
	}
	public QueryResult<ReportPdfMapping> list(QueryParam param)
			throws Exception {
		return reportPdfMappingDAO.list(param);
	}
	public QueryResult<ReportPdfMapping> list(QueryParam param,
			String queryString, String prefix) throws Exception {
		return reportPdfMappingDAO.list(param, queryString, prefix);
	}
	public final void setHibernateTemplate(HibernateTemplate hibernateTemplate) {
		reportPdfMappingDAO.setHibernateTemplate(hibernateTemplate);
	}
	public final void setSessionFactory(SessionFactory sessionFactory) {
		reportPdfMappingDAO.setSessionFactory(sessionFactory);
	}
	public void update(ReportPdfMapping entity) {
		reportPdfMappingDAO.update(entity);
	}
	public List<ReportPdfMapping> sqlFind(String sql) {
		return reportPdfMappingDAO.sqlFind(sql);
	}
	public List<ReportPdfMapping> sqlFind(String sql, Object[] params) {
		return reportPdfMappingDAO.sqlFind(sql, params);
	}
	public String toString() {
		return reportPdfMappingDAO.toString();
	}
	public GpWaterCuringDAO getGpWaterCuringDAO() {
		return gpWaterCuringDAO;
	}
	public void setGpWaterCuringDAO(GpWaterCuringDAO gpWaterCuringDAO) {
		this.gpWaterCuringDAO = gpWaterCuringDAO;
	}
	public GpCraneDAO getGpCraneDAO() {
		return gpCraneDAO;
	}
	public void setGpCraneDAO(GpCraneDAO gpCraneDAO) {
		this.gpCraneDAO = gpCraneDAO;
	}
	public GpSteamCuringDAO getGpSteamDAO() {
		return gpSteamDAO;
	}
	public void setGpSteamDAO(GpSteamCuringDAO gpSteamDAO) {
		this.gpSteamDAO = gpSteamDAO;
	}
	public ConcPourDAO getConcPourDAO() {
		return concPourDAO;
	}
	public void setConcPourDAO(ConcPourDAO concPourDAO) {
		this.concPourDAO = concPourDAO;
	}
	public FourSameDAO getFourSameDAO() {
		return fourSameDAO;
	}
	public void setFourSameDAO(FourSameDAO fourSameDAO) {
		this.fourSameDAO = fourSameDAO;
	}
//钢筋加工、钢筋骨架制作
	public List productSearcha(Integer type) {
		return fourSameDAO.productSearch(type);
	}
	
	public FourTableSamePart getOneFTSP(Integer types)
	{
		return fourSameDAO.getOneFTSP(types);
	}
	public ReportPdfMapping getOnePdf(String reportid,Integer types)
	{
		return reportPdfMappingDAO.getOnePdf(reportid,types);
	}

	public List productSearcha(Integer type,String reportId) {
		return fourSameDAO.productSearch(type,reportId);
	}
	//混凝土浇注
	public List concSearch() {
		return concPourDAO.concSearch();
	}

	public List concSearch(String reportId) {
		return concPourDAO.concSearch(reportId);
	}
	//管片蒸养
	public List steamSearch(Integer type) {
		return gpSteamDAO.steamSearch(type);
	}

	public List steamSearch(Integer type,String reportId) {
		return gpSteamDAO.steamSearch(type,reportId);
	}
	
	//放松起吊
		public List craneSearch() {
			return gpCraneDAO.craneSearch();
		}

		public List craneSearch(String reportId) {
			return gpCraneDAO.craneSearch(reportId);
		}
		//水养
				public List gpwaterSearch() {
					return gpWaterCuringDAO.gpwaterSearch();
				}

				public List gpwaterSearch(String reportId) {
					return gpWaterCuringDAO.gpwaterSearch(reportId);
				}
}
