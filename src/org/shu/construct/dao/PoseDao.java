package org.shu.construct.dao;
import java.util.ArrayList;
import java.util.List;

import org.shu.model.BoltQuality;
import org.shu.model.GpMeasurepoint;
import org.shu.model.GpSoilproperty;
import org.shu.model.ProducePlan;
import org.shu.model.ShieldPose;
import org.shu.model.ShieldProcess;
import org.shu.model.SynchronousGrout;
import org.shu.model.WaterProof;

import common.db.GenericHibernateDao;
import common.db.QueryParam;
import common.db.QueryResult;

public class PoseDao extends GenericHibernateDao<ShieldPose,Integer>{
	public ArrayList<ShieldPose> getAll()
	{
		ArrayList<ShieldPose> result=(ArrayList<ShieldPose>) this.getHibernateTemplate().find("from ShieldPose");
		return result;
	}
	
	public ArrayList<ShieldPose> getByTunnelLoop(int tunnelLoop)
	{
		String sql = "select * from SHIELD_POSE where TUNNEL_LOOP="+tunnelLoop;
		ArrayList<ShieldPose> list = (ArrayList<ShieldPose>) this.sqlFind(sql);
		return list;
	}
	public List<ShieldPose> poseSearch()
	{
		List<ShieldPose> result=this.getHibernateTemplate().find("from ShieldPose");
		return result;
	}
	
	public List poseSearch(String reportId)
	{
		List result=this.getHibernateTemplate().find("from ShieldPose where reportId=?",reportId);
		return result;
	}

	public ArrayList<ShieldPose> poseSearchByPage(int pageNow, int pageSize) {
		List<ShieldPose> list = poseSearch();
		ArrayList<ShieldPose> list1 = new ArrayList<ShieldPose>();
		for (int i = ((pageNow - 1) * pageSize); i <= (pageNow * pageSize - 1); i++) {
			if (i < list.size()) {
				list1.add(list.get(i));
			} else {
				break;
			}
		}
		return list1;
	}

	public ArrayList<ShieldPose> poseSearchByLoop(Integer tunnelLoop) {
		return (ArrayList<ShieldPose>) this.getHibernateTemplate().find("from ShieldPose where tunnelLoop=?",tunnelLoop);
	}
	public ArrayList<ShieldPose> poseSearchByNumber(Integer number) {
		return (ArrayList<ShieldPose>) this.getHibernateTemplate().find("from ShieldPose where proId=?",number);
	}
}

