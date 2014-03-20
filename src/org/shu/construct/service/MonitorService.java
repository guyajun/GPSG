package org.shu.construct.service;

import java.util.ArrayList;
import java.util.Date;
import org.shu.construct.dao.MonitorDao;
import org.shu.model.GpGroundsettling;
import org.shu.model.ShieldProcess;

public class MonitorService {

	private MonitorDao monitorDao;
	
	public void setMonitorDao(MonitorDao monitorDao) {
		this.monitorDao = monitorDao;
	}
	public ArrayList<GpGroundsettling> getCountByBetweenDates(String date1, String date2, String number) {
		return monitorDao.getCountByBetweenDates(date1, date2,number);
	}
	
	public ArrayList<GpGroundsettling> getAll()
	{		
		return monitorDao.getAll();
	}
	public ArrayList<GpGroundsettling> getCountByNumber(String number)
	{		
		return monitorDao.getCountByNumber(number);
	}
	public ArrayList<GpGroundsettling> getCountByDate(Date date) {
		return monitorDao.getCountByDate(date);
	}
	public ArrayList<GpGroundsettling> getOnePage(int pageNow,int pageSize)
	{		
		return monitorDao.getOnePage(pageNow, pageSize);
	}
	public ArrayList<GpGroundsettling> getOnePageByNumber(String number,int pageNow,int pageSize)
	{
		return monitorDao.getByNumber(number,pageNow,pageSize);
	}
	public ArrayList<GpGroundsettling> getOnePageByDate(Date date,int pageNow,int pageSize)
	{
		return monitorDao.getByDate(date, pageNow, pageSize);
	}

}
