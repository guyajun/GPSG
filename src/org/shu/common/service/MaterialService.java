package org.shu.common.service;

import java.util.List;

import org.shu.dao.imp.PreEmbedDao;
import org.shu.plan.dao.ConcMixRatioDAO;
import org.shu.plan.dao.ConcQualDAO;
import org.shu.plan.dao.SteelQualDAO;
import org.shu.plan.dao.SteelRawDAO;

public class MaterialService {
	private SteelRawDAO steelRawDAO;
	private SteelQualDAO steelQualDAO;
	private ConcQualDAO concQualDAO;
	private ConcMixRatioDAO concMixRatioDAO;
	private PreEmbedDao preEmbedDao;

	public PreEmbedDao getPreEmbedDao() {
		return preEmbedDao;
	}

	public void setPreEmbedDao(PreEmbedDao preEmbedDao) {
		this.preEmbedDao = preEmbedDao;
	}

	public ConcMixRatioDAO getConcMixRatioDAO() {
		return concMixRatioDAO;
	}

	public void setConcMixRatioDAO(ConcMixRatioDAO concMixRatioDAO) {
		this.concMixRatioDAO = concMixRatioDAO;
	}

	public ConcQualDAO getConcQualDAO() {
		return concQualDAO;
	}

	public void setConcQualDAO(ConcQualDAO concQualDAO) {
		this.concQualDAO = concQualDAO;
	}

	public SteelQualDAO getSteelQualDAO() {
		return steelQualDAO;
	}

	public void setSteelQualDAO(SteelQualDAO steelQualDAO) {
		this.steelQualDAO = steelQualDAO;
	}

	public SteelRawDAO getSteelRawDAO() {
		return steelRawDAO;
	}

	public void setSteelRawDAO(SteelRawDAO steelRawDAO) {
		this.steelRawDAO = steelRawDAO;
	}

	// 钢筋原材料检测报告

	public List steelSearch() {
		return steelRawDAO.steelSearch();
	}

	public List steelSearch(String reportId) {
		return steelRawDAO.steelSearch(reportId);
	}

	// 钢筋质量证明书
	public List steelQuality() {
		return steelQualDAO.steelQual();
	}

	public List steelQuality(String reportId) {
		return steelQualDAO.steelQual(reportId);
	}

	// 混凝土质量证明书
	public List concQuality() {
		return concQualDAO.concQual();
	}

	public List concQuality(String reportId) {
		return concQualDAO.concQual(reportId);
	}

	// 混凝土配比通知单
	public List concMixRatio() {
		return concMixRatioDAO.concMixRatio();
	}

	public List concMixRatio(String reportId) {
		return concMixRatioDAO.concMixRatio(reportId);
	}
	
	
	public List embedQuality() {
		return preEmbedDao.embedQuality();
	}

	public List embedQuality(String reportId) {
		return preEmbedDao.embedQuality(reportId);
	}

}
