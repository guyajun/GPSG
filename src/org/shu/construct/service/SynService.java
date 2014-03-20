package org.shu.construct.service;

import java.util.ArrayList;
import java.util.Date;

import org.shu.construct.dao.PoseDao;
import org.shu.construct.dao.SynDao;
import org.shu.model.GpSoilproperty;
import org.shu.model.ShieldPose;
import org.shu.model.ShieldProcess;
import org.shu.model.SynchronousGrout;

public class SynService {
	private SynDao synDao ;
	
	public ArrayList<SynchronousGrout> getSynGrout() {
		return (ArrayList<SynchronousGrout>) synDao.synSearch();
	}
	
	public ArrayList<SynchronousGrout> getSynchronousGroutByPage(int pageNow,
			int pageSize) {
		return synDao.groutSearchByPage(pageNow, pageSize);
	}
	public ArrayList<SynchronousGrout> getAll() {
		return synDao.getAll();
	}
	public SynDao getgroutDao() {
		return synDao;
	}

	public void setGroutDao(SynDao synDao) {
		this.synDao = synDao;
	}
	public ArrayList<SynchronousGrout> getCountByDate(Date date) {
		return synDao.getCountByDate(date);
	}
	public ArrayList<SynchronousGrout> getOnePageByDate(Date date,int pageNow,int pageSize)
	{
		return synDao.getByDate(date, pageNow, pageSize);
	}
	public ArrayList<SynchronousGrout> groutSearchByLoop(Integer tunnelLoop) {
		return (ArrayList<SynchronousGrout>) synDao.groutSearchByLoop(tunnelLoop);
	}
	
    public void setSynDao(SynDao synDao) {
        this.synDao = synDao;
    }
    
    public int getLastLoop() {
        return synDao.getLastLoop();
    }
}
