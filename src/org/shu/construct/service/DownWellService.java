package org.shu.construct.service;

import java.util.ArrayList;
import java.util.Date;

import org.shu.construct.dao.AdvanceDao;
import org.shu.construct.dao.DownWellDao;
import org.shu.model.DownWell;
import org.shu.model.ShieldProcess;

public class DownWellService {

	private DownWellDao downWellDao;	
		
	public void setDownWellDao(DownWellDao downWellDao) {
		this.downWellDao = downWellDao;
	}
	public ArrayList<DownWell> getAll()
	{		
		return downWellDao.getAll();
	}
	public ArrayList<DownWell> getByLoop(String produceLoop)
	{		
		return downWellDao.getByLoop(produceLoop);
	}	
}
