package org.shu.construct.service;

import java.util.ArrayList;

import org.shu.construct.dao.SoilDao;
import org.shu.model.GpSoilproperty;

public class SoilService {

	private SoilDao soilDao;

	public void setSoilDao(SoilDao soilDao) {
		this.soilDao = soilDao;
	}
	public ArrayList<GpSoilproperty> getAll()
	{		
		return soilDao.getAll();
	}
	public ArrayList<GpSoilproperty> getCountById(int id)
	{		
		return soilDao.getCountById(id);
	}
	public ArrayList<GpSoilproperty> getCountByCno(String tcCno) {
		return soilDao.getCountByCno(tcCno);
	}
	public ArrayList<GpSoilproperty> getOnePage(int pageNow,int pageSize)
	{		
		return soilDao.getOnePage(pageNow, pageSize);
	}
	public ArrayList<GpSoilproperty> getOnePageById(int id,int pageNow,int pageSize)
	{
		return soilDao.getById(id,pageNow,pageSize);
	}
	public ArrayList<GpSoilproperty> getOnePageByCno(String tcCno,int pageNow,int pageSize)
	{
		return soilDao.getByCno(tcCno, pageNow, pageSize);
	}

}
