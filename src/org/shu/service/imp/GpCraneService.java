package org.shu.service.imp;

import java.util.List;
import org.shu.dao.imp.GpCraneDao;
import org.shu.model.GpCrane;

public class GpCraneService{
	private GpCraneDao gpCraneDao;	
	
	public void setGpCraneDao(GpCraneDao gpCraneDao) {
		this.gpCraneDao = gpCraneDao;
	}

	public void saveGpCrane(GpCrane gpCrane) {
		gpCraneDao.saveGpCrane(gpCrane);
	}

	public List getAll() {
		return gpCraneDao.getAll();		 
	}	
}

