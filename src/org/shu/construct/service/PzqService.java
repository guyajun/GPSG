package org.shu.construct.service;

import java.util.ArrayList;

import org.shu.construct.dao.DownWellDao;
import org.shu.construct.dao.PzqDao;
import org.shu.model.DownWell;
import org.shu.model.Pzqcheck;

public class PzqService {

	private PzqDao pzqDao;				
	public void setPzqDao(PzqDao pzqDao) {
		this.pzqDao = pzqDao;
	}
	public ArrayList<Pzqcheck> getAll()
	{		
		return pzqDao.getAll();
	}
	public ArrayList<Pzqcheck> getByLoop(String produceLoop)
	{		
		return pzqDao.getByLoop(produceLoop);
	}	
}
