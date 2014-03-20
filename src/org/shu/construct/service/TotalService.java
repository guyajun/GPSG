package org.shu.construct.service;

import java.util.ArrayList;
import org.shu.construct.dao.TotalDao;
import org.shu.model.GpTotalInfo;

public class TotalService {

	private TotalDao totalDao;	
	
	public void setTotalDao(TotalDao totalDao) {
		this.totalDao = totalDao;
	}
	public ArrayList<GpTotalInfo> getOnePage(int pageNow, int pageSize) {
		return totalDao.getOnePage(pageNow, pageSize);
	}
	public void update(GpTotalInfo gpTotalInfo) {
		totalDao.updateOneRow(gpTotalInfo);
	}
	public ArrayList<GpTotalInfo> getAll()
	{		
		return totalDao.getAll();
	}
	public ArrayList<GpTotalInfo> getByLoop(int tunnelLoop)
	{		
		return totalDao.getByLoop(tunnelLoop);
	}	
}
