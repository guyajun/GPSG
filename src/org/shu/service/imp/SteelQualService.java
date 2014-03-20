package org.shu.service.imp;

import java.util.Date;
import java.util.List;

import org.shu.dao.imp.SteelQualDao;
import org.shu.model.SteelQual;
public class SteelQualService{
	private SteelQualDao steelQualDao;
	
	
	public SteelQualDao getSteelQualDao() {
		return steelQualDao;
	}


	public void setSteelQualDao(SteelQualDao steelQualDao) {
		this.steelQualDao = steelQualDao;
	}


	public void saveSteelQual(SteelQual steelQual) {
		steelQualDao.saveSteelQual(steelQual);
	}


	public List<SteelQual> getAll() {
		return steelQualDao.getAll();
		 
	}

	public List<SteelQual> getBetween(String useBeginTime,String today) {
		return steelQualDao.getBetween(useBeginTime, today);
		 
	}
}

