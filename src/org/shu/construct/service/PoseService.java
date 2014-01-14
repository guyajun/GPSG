package org.shu.construct.service;

import java.util.ArrayList;

import org.shu.construct.dao.PoseDao;
import org.shu.model.ShieldPose;
public class PoseService {
	
	private PoseDao poseDao;	
	
	public void setPoseDao(PoseDao poseDao) {
		this.poseDao = poseDao;
	}
	public ArrayList<ShieldPose> getShieldPose() {
		return (ArrayList<ShieldPose>) poseDao.poseSearch();
	}

	public ArrayList<ShieldPose> getShieldPoseByPage(int pageNow, int pageSize) {
		return poseDao.poseSearchByPage(pageNow, pageSize);
	}
	public ArrayList<ShieldPose> getCountById(Integer tunnelLoop) {
		return (ArrayList<ShieldPose>) poseDao.poseSearchByLoop(tunnelLoop);
	}
	public ArrayList<ShieldPose> getCountByNumber(Integer number) {
		return (ArrayList<ShieldPose>) poseDao.poseSearchByNumber(number);
	}
	public ArrayList<ShieldPose> getByBetweenLoops(int startLoop,int endLoop){
		return poseDao.getByBetweenLoops(startLoop, endLoop);
	}
	public ArrayList<ShieldPose> getAll()
	{		
		return poseDao.getAll();
	}
	public ArrayList<ShieldPose> getByTunnelLoop(int tunnelLoop)
	{		
		return poseDao.getByTunnelLoop(tunnelLoop);
	}
	
}
