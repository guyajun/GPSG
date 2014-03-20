package org.shu.service.imp;

import java.util.List;
import org.shu.dao.imp.RfidRefGpDao;
import org.shu.model.RfidRefGp;
import common.db.QueryResult;

public class RfidRefGpService{
	private RfidRefGpDao rfidRefGpDao;
	public void setRfidRefGpDao(RfidRefGpDao rfidRefGpDao) {
		this.rfidRefGpDao = rfidRefGpDao;
	}
	
	public List getAll() {
		return rfidRefGpDao.getAll();		 
	}
	public List findAll(int pageNow, int pageSize) {
		return rfidRefGpDao.findAll(pageNow, pageSize);
	}
	public int findRfidRefGpSize() {
		return rfidRefGpDao.findRfidRefGpSize();
	}
	public QueryResult<RfidRefGp> getRFID(int page, int size) throws Exception {
		return rfidRefGpDao.getRFID(page,size);
	}
	public void saveRfidRefGp(RfidRefGp rfidRefGp) {
		rfidRefGpDao.saveRfidRefGp(rfidRefGp);
	}
	public RfidRefGp findRFIDByCoverId(String coverId){
		return rfidRefGpDao.findRFIDByCoverId(coverId);
	}
	public RfidRefGp findRFIDByGpId(String gpId){
		return rfidRefGpDao.findRFIDByGpId(gpId);
	}
	public void updateRfidRefGp(RfidRefGp rfidRefGp) {
		rfidRefGpDao.updateRfidRefGp(rfidRefGp);
	}
}

