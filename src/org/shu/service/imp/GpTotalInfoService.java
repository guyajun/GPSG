package org.shu.service.imp;

import java.util.List;
import org.shu.dao.imp.GpTotalInfoDao;
import org.shu.dao.imp.PreEmbedDao;
import org.shu.model.DepartmentInfo;
import org.shu.model.GpTotalInfo;
import org.shu.model.RoleRefUser;
import org.shu.plan.dao.ConcMixRatioDAO;
import org.shu.plan.dao.ConcQualDAO;
import org.shu.plan.dao.SteelQualDAO;
import org.shu.plan.dao.SteelRawDAO;
import org.shu.plan.dao.ConcResistCompDAO;

import common.db.QueryResult;

public class GpTotalInfoService {
    
    private GpTotalInfoDao gpTotalInfoDao;
    private SteelQualDAO steelQualDAO;
    private SteelRawDAO steelRawDAO;
    private ConcResistCompDAO concResistCompDAO;
    private ConcQualDAO concQualDAO;
    private ConcMixRatioDAO concMixRatioDAO;
    private PreEmbedDao preEmbedDao;
    
    public void setConcQualDAO(ConcQualDAO concQualDAO) {
        this.concQualDAO = concQualDAO;
    }
    
    public void setConcMixRatioDAO(ConcMixRatioDAO concMixRatioDAO) {
        this.concMixRatioDAO = concMixRatioDAO;
    }
    
    public void setPreEmbedDao(PreEmbedDao preEmbedDao) {
        this.preEmbedDao = preEmbedDao;
    }
    
    public void setConcResistCompDAO(ConcResistCompDAO concResistCompDAO) {
        this.concResistCompDAO = concResistCompDAO;
    }
    
    public void setSteelRawDAO(SteelRawDAO steelRawDAO) {
        this.steelRawDAO = steelRawDAO;
    }
    
    public void setSteelQualDAO(SteelQualDAO steelQualDAO) {
        this.steelQualDAO = steelQualDAO;
    }
    
    public void setGpTotalInfoDao(GpTotalInfoDao gpTotalInfoDao) {
        this.gpTotalInfoDao = gpTotalInfoDao;
    }
    
    public int getLastLoop() {
        return gpTotalInfoDao.getLastLoop();
    }
    
    public List getAll() {
        return gpTotalInfoDao.getAll();
    }
    
    public QueryResult<GpTotalInfo> getAllGPs(int page, int row) throws Exception {
        return gpTotalInfoDao.getAllGPs(page, row);
    }
    
    public QueryResult<GpTotalInfo> get(int page, int size) throws Exception {
        return gpTotalInfoDao.get(page, size);
    }
    
    public void saveGpTotalInfo(GpTotalInfo gpTotalInfo) {
        gpTotalInfoDao.saveGpTotalInfo(gpTotalInfo);
    }
    
    public GpTotalInfo findByCoverId(String coverId) {
        return gpTotalInfoDao.findByCoverId(coverId);
    }
    
    public GpTotalInfo findByGpId(String gpId) {
        return gpTotalInfoDao.findByGpId(gpId);
    }
    
    public void updateGpTotalInfo(GpTotalInfo gpTotalInfo) {
        gpTotalInfoDao.updateGpTotalInfo(gpTotalInfo);
    }
    
    public void addGP(GpTotalInfo gt) {
        // TODO Auto-generated method stub
        gpTotalInfoDao.addGP(gt);
    }
    
    public void delGP(String id)
    {
        gpTotalInfoDao.delete(id);
    }
    
    public List findSteelQual(String date)
    {
        return steelQualDAO.findSteelQual(date);
    }
    
    public List findSteelRaw(String date)
    {
        return steelRawDAO.findSteelRaw(date);
    }
    
    public List findConcResist(String date)
    {
        return concResistCompDAO.findConcResist(date);
    }
    
    public List findConcQual(String date)
    {
        return concQualDAO.findConcQual(date);
    }
    
    public List findConcMix(String date)
    {
        return concMixRatioDAO.findConcMix(date);
    }
    
    public List findPreEmbed(String date)
    {
        return preEmbedDao.findPreEmbed(date);
    }
}
