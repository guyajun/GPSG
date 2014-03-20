package org.shu.service.imp;

import java.util.List;

import org.shu.dao.imp.SteelRawDao;
import org.shu.model.SteelRaw;

public class SteelRawService{
	private SteelRawDao steelRawDao;	

	public SteelRawDao getSteelRawDao() {
		return steelRawDao;
	}

	public void setSteelRawDao(SteelRawDao steelRawDao) {
		this.steelRawDao = steelRawDao;
	}


	public void saveSteelRaw(SteelRaw steelRaw) {
		System.out.println(steelRaw.getReportId());
		steelRawDao.saveSteelRaw(steelRaw);
	}


	public List getAll() {
		return steelRawDao.getAll();
		 
	}
	
}

