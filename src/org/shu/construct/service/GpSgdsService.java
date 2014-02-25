package org.shu.construct.service;

import java.util.ArrayList;
import java.util.Date;

import org.shu.construct.dao.PoseDao;
import org.shu.construct.dao.SgdsDAO;
import org.shu.model.GpSgds;
import org.shu.model.GpSoilproperty;
import org.shu.model.ShieldPose;
import org.shu.model.SynchronousGrout;

public class GpSgdsService {
	private SgdsDAO sgdsDao ;
	
	public ArrayList<GpSgds> getGpSgds() {
		return (ArrayList<GpSgds>) sgdsDao.sgdsSearch();
	}
	public ArrayList<GpSgds> getAll() {
		return sgdsDao.getAll();
	}
	public ArrayList<GpSgds> getGpSgdsByPage(int pageNow,
			int pageSize) {
		return sgdsDao.sgdsSearchByPage(pageNow, pageSize);
	}
	public ArrayList<GpSgds> getCountByDate(Date date) {
		return sgdsDao.getCountByDate(date);
	}
	public ArrayList<GpSgds> getOnePageByDate(Date date,int pageNow,int pageSize)
	{
		return sgdsDao.getByDate(date, pageNow, pageSize);
	}
	public void setSgdsDao(SgdsDAO sgdsDao) {
		this.sgdsDao = sgdsDao;
	}

	public ArrayList<GpSgds> getCountById(Integer proId) {
		return (ArrayList<GpSgds>) sgdsDao.poseSearchByNumber(proId);
	}
	
}
