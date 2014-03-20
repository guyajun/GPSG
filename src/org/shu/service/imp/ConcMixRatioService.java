package org.shu.service.imp;

import java.util.List;
import org.shu.dao.imp.ConcMixRatioDao;
import org.shu.model.ConcMixRatio;

public class ConcMixRatioService{
	private ConcMixRatioDao concMixRatioDao;	

	public void setConcMixRatioDao(ConcMixRatioDao concMixRatioDao) {
		this.concMixRatioDao = concMixRatioDao;
	}


	public void saveConcMixRatio(ConcMixRatio concMixRatio) {
		concMixRatioDao.saveConcMixRatio(concMixRatio);
	}


	public List getAll() {
		return concMixRatioDao.getAll();
		 
	}
	
}

