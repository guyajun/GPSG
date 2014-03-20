package org.shu.construct.service;

import java.util.ArrayList;
import java.util.Date;

import org.shu.construct.dao.AdvanceDao;
import org.shu.model.ShieldProcess;

public class AdvanceService {

	private AdvanceDao advanceDao;
	
	public void setAdvanceDao(AdvanceDao advanceDao) {
		this.advanceDao = advanceDao;
	}
	public ArrayList<ShieldProcess> getCountByBetweenLoops(int loop1, int loop2) {
		return advanceDao.getCountByBetweenLoops(loop1, loop2);
	}
	public ArrayList<ShieldProcess> getByBetweenLoops(int loop1, int loop2, int pageNow,
			int pageSize) {
		return advanceDao.getByBetweenLoops(loop1, loop2, pageNow, pageSize);
	}
	public ArrayList<ShieldProcess> getAll()
	{		
		return advanceDao.getAll();
	}
	public ArrayList<ShieldProcess> getCountByLoop(int id)
	{		
		return advanceDao.getCountByLoop(id);
	}
	public ArrayList<ShieldProcess> getCountByDate(Date date) {
		return advanceDao.getCountByDate(date);
	}
	public ArrayList<ShieldProcess> getOnePage(int pageNow,int pageSize)
	{		
		return advanceDao.getOnePage(pageNow, pageSize);
	}
	public ArrayList<ShieldProcess> getOnePageByLoop(int id,int pageNow,int pageSize)
	{
		return advanceDao.getByLoop(id,pageNow,pageSize);
	}
	public ArrayList<ShieldProcess> getOnePageByDate(Date date,int pageNow,int pageSize)
	{
		return advanceDao.getByDate(date, pageNow, pageSize);
	}

}
