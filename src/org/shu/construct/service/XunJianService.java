package org.shu.construct.service;

import java.util.ArrayList;
import java.util.List;
import org.shu.construct.dao.XunJianDao;
import org.shu.model.Segmentrepair;
public class XunJianService {

	private XunJianDao xunJianDao;		
	
	public void setXunJianDao(XunJianDao xunJianDao) {
		this.xunJianDao = xunJianDao;
	}
	public ArrayList<Segmentrepair> getAll()
	{		
		return xunJianDao.getAll();
	}
	public ArrayList<Segmentrepair> getByTunnelLoop(int tunnelLoop)
	{		
		return xunJianDao.getByTunnelLoop(tunnelLoop);
	}
	
}
