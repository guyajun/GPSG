package org.shu.construct.service;

import java.util.ArrayList;
import org.shu.construct.dao.InCheckDao;
import org.shu.model.InCheck;

public class InCheckService {
	private InCheckDao inCheckDao ;
		
	public void setInCheckDao(InCheckDao inCheckDao) {
		this.inCheckDao = inCheckDao;
	}

	public ArrayList<InCheck> searchByLoop(String produceLoop) {
		return (ArrayList<InCheck>) inCheckDao.searchByLoop(produceLoop);
	}
}
