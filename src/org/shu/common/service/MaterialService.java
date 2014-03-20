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

	// �ֽ�ԭ���ϼ�ⱨ��

	public List steelSearch() {
		return steelRawDAO.steelSearch();
	}

	public List steelSearch(String reportId) {
		return steelRawDAO.steelSearch(reportId);
	}

	// �ֽ�����֤����
	public List steelQuality() {
		return steelQualDAO.steelQual();
	}

	public List steelQuality(String reportId) {
		return steelQualDAO.steelQual(reportId);
	}

	// ����������֤����
	public List concQuality() {
		return concQualDAO.concQual();
	}

	public List concQuality(String reportId) {
		return concQualDAO.concQual(reportId);
	}

	// ���������֪ͨ��
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
