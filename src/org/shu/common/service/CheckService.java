package org.shu.common.service;

import java.util.List;

import org.shu.model.ReportPdfMapping;
import org.shu.plan.dao.ConcResistCompDAO;
import org.shu.plan.dao.ConcResistLeakDAO;
import org.shu.plan.dao.FourSameDAO;
import org.shu.plan.dao.GpAssembleDAO;
import org.shu.plan.dao.GpCheckLeakDAO;
import org.shu.plan.dao.GpQualityDAO;
import org.shu.plan.dao.GpReceiveDAO;
import org.shu.plan.dao.GpStorageDAO;
import org.shu.plan.dao.ReportPdfMappingDAO;
import org.shu.plan.dao.SteelSkelHalfDAO;

public class CheckService {

	private ConcResistCompDAO concResistCompDAO;
	private ConcResistLeakDAO concResistLeakDAO;
	private SteelSkelHalfDAO steelSkelHalfDAO;
	private GpAssembleDAO gpAssembleDAO;
	private GpCheckLeakDAO gpCheckLeakDAO;
	private FourSameDAO fourSameDAO;
	private ReportPdfMappingDAO reportPdfMappingDAO;
	private GpQualityDAO gpQualityDAO;
	private GpReceiveDAO gpReceiveDAO;
	private GpStorageDAO gpStorageDAO;
	
	
	public GpStorageDAO getGpStorageDAO() {
		return gpStorageDAO;
	}

	public void setGpStorageDAO(GpStorageDAO gpStorageDAO) {
		this.gpStorageDAO = gpStorageDAO;
	}

	public GpQualityDAO getGpQualityDAO() {
		return gpQualityDAO;
	}

	public void setGpQualityDAO(GpQualityDAO gpQualityDAO) {
		this.gpQualityDAO = gpQualityDAO;
	}

	public GpReceiveDAO getGpReceiveDAO() {
		return gpReceiveDAO;
	}

	public void setGpReceiveDAO(GpReceiveDAO gpReceiveDAO) {
		this.gpReceiveDAO = gpReceiveDAO;
	}

	public ReportPdfMappingDAO getReportPdfMappingDAO() {
		return reportPdfMappingDAO;
	}

	public void setReportPdfMappingDAO(ReportPdfMappingDAO reportPdfMappingDAO) {
		this.reportPdfMappingDAO = reportPdfMappingDAO;
	}

	public ReportPdfMapping getOnePdf(String reportid,Integer types)
	{
		return reportPdfMappingDAO.getOnePdf(reportid,types);
	}

	public ConcResistCompDAO getConcResistCompDAO() {
		return concResistCompDAO;
	}

	public void setConcResistCompDAO(ConcResistCompDAO concResistCompDAO) {
		this.concResistCompDAO = concResistCompDAO;
	}

	public ConcResistLeakDAO getConcResistLeakDAO() {
		return concResistLeakDAO;
	}

	public void setConcResistLeakDAO(ConcResistLeakDAO concResistLeakDAO) {
		this.concResistLeakDAO = concResistLeakDAO;
	}

	public SteelSkelHalfDAO getSteelSkelHalfDAO() {
		return steelSkelHalfDAO;
	}

	public void setSteelSkelHalfDAO(SteelSkelHalfDAO steelSkelHalfDAO) {
		this.steelSkelHalfDAO = steelSkelHalfDAO;
	}

	public GpAssembleDAO getGpAssembleDAO() {
		return gpAssembleDAO;
	}

	public void setGpAssembleDAO(GpAssembleDAO gpAssembleDAO) {
		this.gpAssembleDAO = gpAssembleDAO;
	}

	public GpCheckLeakDAO getGpCheckLeakDAO() {
		return gpCheckLeakDAO;
	}

	public void setGpCheckLeakDAO(GpCheckLeakDAO gpCheckLeakDAO) {
		this.gpCheckLeakDAO = gpCheckLeakDAO;
	}

	public FourSameDAO getFourSameDAO() {
		return fourSameDAO;
	}

	public void setFourSameDAO(FourSameDAO fourSameDAO) {
		this.fourSameDAO = fourSameDAO;
	}

	// 混凝土抗压
	public List concResistComp() {
		return concResistCompDAO.concResistCompSearch();
	}

	public List concResistComp(String reportId) {
		return concResistCompDAO.concResistCompSearch(reportId);
	}

	// 混凝土抗渗
	public List concResistLeak() {
		return concResistLeakDAO.concResistLeakSearch();
	}

	@SuppressWarnings("rawtypes")
	public List concResistLeak(String reportId) {
		return concResistLeakDAO.concResistLeakSearch(reportId);
	}
	
	//出厂质量证明书
	
	public List gpQuality() {
		return gpQualityDAO.gpQualitySearch();
	}

	@SuppressWarnings("rawtypes")
	public List gpQuality(String reportId) {
		return gpQualityDAO.gpQualitySearch(reportId);
	}
	//接收记录
	public List gpReceive() {
		return gpReceiveDAO.gpReceiveSearch();
	}

	@SuppressWarnings("rawtypes")
	public List gpReceive(String reportId) {
		return gpReceiveDAO.gpReceiveSearch(reportId);
	}
	
	//仓储
		public List gpStorage() {
			return gpStorageDAO.gpStorageSearch();
		}

		@SuppressWarnings("rawtypes")
		public List gpStorage(String reportId) {
			return gpStorageDAO.gpStorageSearch(reportId);
		}

	// 钢筋骨架半成品抽查
	public List steelSkelHalf() {
		return steelSkelHalfDAO.steelSkelHalfSearch();
	}

	public List steelSkelHalf(String reportId) {
		return  steelSkelHalfDAO.steelSkelHalf(reportId);
	}

	// 钢模、管片外观
	public List productSearch(Integer type) {
		return fourSameDAO.productSearch(type);
	}

	public List productSearch(Integer type, String reportId) {
		return fourSameDAO.productSearch(type, reportId);
	}

	// 水平拼装
	public List  gpAssemble(Integer type) {
		return gpAssembleDAO.gpAssembleSearch(type);
		}

	public List  gpAssemble(Integer type, String reportId) {
		return  gpAssembleDAO.gpAssembleSearch(type, reportId);
	}

	// 管片检漏
	public List gpCheckLeak(Integer type) {
		return gpCheckLeakDAO.gpCheckLeakSearch(type);
		}

	public List gpCheckLeak(Integer type, String reportId) {
		return gpCheckLeakDAO.gpCheckLeakSearch(type, reportId);
	}
	
	public void savePdf(ReportPdfMapping entity)
	{
		reportPdfMappingDAO.savePdf(entity);
	}
	
	public List pdfsearch(String reportid)
	{
		return reportPdfMappingDAO.search(reportid);
	}
	public List pdfsearch()
	{
		return reportPdfMappingDAO.search();
	}
	public ReportPdfMapping find(String id)
	{
		return reportPdfMappingDAO.findentity(id);
	}
	public void updatePdf(ReportPdfMapping entity)
	{
		reportPdfMappingDAO.updatePdf(entity);
	}
	
}
