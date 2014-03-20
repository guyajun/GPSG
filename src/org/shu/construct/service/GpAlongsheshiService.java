package org.shu.construct.service;

import java.util.ArrayList;

import org.shu.construct.dao.PoseDao;
import org.shu.construct.dao.SheshiDAO;
import org.shu.model.GpAlongsheshi;
import org.shu.model.GpSoilproperty;
import org.shu.model.ShieldPose;

public class GpAlongsheshiService {
	private SheshiDAO sheshiDao ;
	
	public ArrayList<GpAlongsheshi> getSheshi() {
		return (ArrayList<GpAlongsheshi>) sheshiDao.sheshiSearch();
	}
	
	public ArrayList<GpAlongsheshi> getGpAlongsheshiByPage(int pageNow,
			int pageSize) {
		return sheshiDao.sheshiSearchByPage(pageNow, pageSize);
	}
	
	public SheshiDAO getSheshiDao() {
		return sheshiDao;
	}

	public void setSheshiDao(SheshiDAO sheshiDao) {
		this.sheshiDao = sheshiDao;
	}
	public ArrayList<GpAlongsheshi> getAll() {
		return sheshiDao.getAll();
	}
	
	public ArrayList<GpAlongsheshi> getCountById(Integer ssIndx) {
		return (ArrayList<GpAlongsheshi>) sheshiDao.sheshiSearchByLoop(ssIndx);
	}
	public ArrayList<GpAlongsheshi> getCountByLoop(Integer ssLoop) {
		return (ArrayList<GpAlongsheshi>) sheshiDao.sheshiSearchBySSLoop(ssLoop);
	}
	
}
