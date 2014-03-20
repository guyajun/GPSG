package org.shu.service.imp;

import java.util.List;
import org.shu.dao.imp.ConcResistLeakDao;
import org.shu.model.ConcResistLeak;

public class ConcResistLeakService{
	private ConcResistLeakDao concResistLeakDao;	
	
	public void setConcResistLeakDao(ConcResistLeakDao concResistLeakDao) {
		this.concResistLeakDao = concResistLeakDao;
	}

	public void saveConcResistLeak(ConcResistLeak concResistLeak) {
		concResistLeakDao.saveConcResistLeak(concResistLeak);
	}


	public List getAll() {
		return concResistLeakDao.getAll();
		 
	}
	
}

