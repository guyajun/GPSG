package org.shu.dao.imp;

import java.util.List;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.Transaction;
import org.shu.model.DepartmentInfo;
import org.shu.model.FunctionInfo;
import org.shu.model.GpTotalInfo;
import org.shu.model.UserInfo;

import common.db.GenericHibernateDao;
import common.db.QueryParam;
import common.db.QueryResult;

public class GpTotalInfoDao extends GenericHibernateDao<GpTotalInfo, Integer> {
    
    public void saveGpTotalInfo(GpTotalInfo gpTotalInfo) {
        this.getHibernateTemplate().save(gpTotalInfo);
    }
    
    public int getLastLoop() {
        String sql = "select top 1 * from GP_TOTAL_INFO order by id desc;";
        List<GpTotalInfo> gpTotalInfos = sqlFind(sql);
        if (gpTotalInfos.size() > 0)
            return gpTotalInfos.get(0).getTunnelLoop();
        else
            return 0;
    }
    
    public GpTotalInfo findByGpId(String gpId) {
        
        List<GpTotalInfo> list = getHibernateTemplate().find("from GpTotalInfo where gpId=?", gpId);
        if (list.size() > 0)
            return (GpTotalInfo)list.get(0);
        else
            return null;
    }
    
    public GpTotalInfo findByCoverId(String coverId) {
        @SuppressWarnings("unchecked")
        List<GpTotalInfo> list = getHibernateTemplate().find("from GpTotalInfo where coverid=?", coverId);
        if (list.size() > 0)
            return (GpTotalInfo)list.get(0);
        else
            return null;
    }
    
    public void updateGpTotalInfo(GpTotalInfo gpTotalInfo) {
        this.getHibernateTemplate().update(gpTotalInfo);
    }
    
    public List<GpTotalInfo> getAll() {
        List<GpTotalInfo> list = getHibernateTemplate().find("from GpTotalInfo order by id desc ");
        return list;
    }
    
    public QueryResult<GpTotalInfo> get(int page, int rows) throws Exception
    {
        QueryParam param = new QueryParam();
        param.setPage(page, rows);
        QueryResult<GpTotalInfo> result = list(param);
        return result;
    }
    
    public void addGP(GpTotalInfo gt) {
        this.getHibernateTemplate().save(gt);
    }
    
    public void delete(String id)
    {
        this.getHibernateTemplate().delete(findGp(id));
    }
    
    public GpTotalInfo findGp(String id)
    {
        List result = this.getHibernateTemplate().find("from GpTotalInfo  where gpId=?", id);
        if (result.size() > 0)
            return (GpTotalInfo)result.get(0);
        else
            return null;
    }
    
    public QueryResult<GpTotalInfo> getAllGPs(int page, int row) throws Exception
    {
        QueryParam param = new QueryParam();
        param.setPage(page - 1, row);
        param.addOrder("id", QueryParam.ORDER_DESC);
        QueryResult<GpTotalInfo> result = list(param);
        return result;
    }
    
}
