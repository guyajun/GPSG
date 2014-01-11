package org.shu.construct.service;

import java.util.ArrayList;

import org.shu.construct.dao.PoseDao;
import org.shu.model.GpMeasurepoint;
import org.shu.model.GpSoilproperty;
import org.shu.model.ShieldPose;

public class ShieldPoseService {
	private PoseDao poseDao;

	public ArrayList<ShieldPose> getShieldPose() {
		return (ArrayList<ShieldPose>) poseDao.poseSearch();
	}

	public ArrayList<ShieldPose> getShieldPoseByPage(int pageNow, int pageSize) {
		return poseDao.poseSearchByPage(pageNow, pageSize);
	}

	public PoseDao getPoseDao() {
		return poseDao;
	}

	public void setPoseDao(PoseDao poseDao) {
		this.poseDao = poseDao;
	}

	public ArrayList<ShieldPose> getAll() {
		return poseDao.getAll();
	}

	public ArrayList<ShieldPose> getCountById(Integer tunnelLoop) {
		return (ArrayList<ShieldPose>) poseDao.poseSearchByLoop(tunnelLoop);
	}

	public ArrayList<ShieldPose> getCountByNumber(Integer number) {
		return (ArrayList<ShieldPose>) poseDao.poseSearchByNumber(number);
	}

}
