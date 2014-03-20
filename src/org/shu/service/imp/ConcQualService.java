package org.shu.service.imp;

import java.util.List;
import org.shu.dao.imp.ConcQualDao;
import org.shu.model.ConcQual;

public class ConcQualService{
	private ConcQualDao concQualDao;	
	
	public ConcQualDao getConcQualDao() {
		return concQualDao;
	}

	public void setConcQualDao(ConcQualDao concQualDao) {
		this.concQualDao = concQualDao;
	}


	public void saveConcQual(ConcQual concQual) {
		concQualDao.saveConcQual(concQual);
	}


	public List getAll() {
		return concQualDao.getAll();
		 
	}
	
}

