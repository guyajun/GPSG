package org.shu.construct.service;

import java.util.ArrayList;

import org.shu.construct.dao.MeasureDao;
import org.shu.model.GpMeasurepoint;

public class GpMeasurepointService {
	private MeasureDao measureDao ;
	
	public ArrayList<GpMeasurepoint> getMeasure() {
		return (ArrayList<GpMeasurepoint>) measureDao.measureSearch();
	}
	
	public ArrayList<GpMeasurepoint> getGpMeasurepointByPage(int pageNow,
			int pageSize) {
		return measureDao.measureSearchByPage(pageNow, pageSize);
	}
	
	public MeasureDao getMeasureDao() {
		return measureDao;
	}
	public ArrayList<GpMeasurepoint> getCountByCno(String cbCdno) {
		return measureDao.getCountByCno(cbCdno);
	}
	public void setMeasureDao(MeasureDao measureDao) {
		this.measureDao = measureDao;
	}
	public ArrayList<GpMeasurepoint> getAll() {
		return measureDao.getAll();
	}
	public ArrayList<GpMeasurepoint> getCountById(Integer cbIndx) {
		return (ArrayList<GpMeasurepoint>) measureDao.measureSearchByLoop(cbIndx);
	}
	public ArrayList<GpMeasurepoint> getOnePageByCno(String cbCdno, int pageNow,
			int pageSize) {
		return measureDao.getByCno(cbCdno, pageNow, pageSize);
	}
	
}
