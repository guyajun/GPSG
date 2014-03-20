package org.shu.dao.imp;

import java.util.List;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.Transaction;
import org.shu.model.RfidRefGp;
import common.db.GenericHibernateDao;
import common.db.QueryParam;
import common.db.QueryResult;

public class RfidRefGpDao extends GenericHibernateDao<RfidRefGp, Integer>{
	public List findAll(int pageNow, int pageSize) {
		try{
			Session session=getHibernateTemplate().getSessionFactory().openSession();
			Transaction ts=session.beginTransaction();
			Query query=session.createQuery("from RfidRefGp");
			int firstResult=(pageNow-1)*pageSize;
			query.setFirstResult(firstResult);
			query.setMaxResults(pageSize);
			List list=query.list();
			ts.commit();
			session.close();
			session=null;
			return list;
		}catch(Exception e){
			e.printStackTrace();
			return null;
		}
	}
	public int findRfidRefGpSize() {
		return getHibernateTemplate().find("from RfidRefGp").size();
	}
	public void saveRfidRefGp(RfidRefGp rfidRefGp){
		this.getHibernateTemplate().save(rfidRefGp);
	}	
	public RfidRefGp findRFIDByCoverId(String coverId) {
		List<RfidRefGp> list=getHibernateTemplate().find("from RfidRefGp where coverId=?",coverId);
		if(list.size()>0)
			return (RfidRefGp)list.get(0);
		else
			return null;
	}
	public RfidRefGp findRFIDByGpId(String gpId) {
	
		List<RfidRefGp> list=getHibernateTemplate().find("from RfidRefGp where gpId=?",gpId);

		if(list.size()>0)
			return (RfidRefGp)list.get(0);
		else
			return null;
	}
	public void updateRfidRefGp(RfidRefGp rfidRefGp) {
		this.getHibernateTemplate().update(rfidRefGp);
	}
	public List getAll() {
		return this.getHibernateTemplate().find("from RfidRefGp");
	}

	public QueryResult<RfidRefGp> getRFID(int page,int rows) throws Exception
	{
		QueryParam param = new QueryParam();
		param.setPage(page, rows);
		param.addOrder("id", QueryParam.ORDER_DESC);
		QueryResult<RfidRefGp> result = list(param);
		return result;
	}
	
}
