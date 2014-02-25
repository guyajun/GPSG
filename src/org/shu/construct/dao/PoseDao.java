package org.shu.construct.dao;

import java.util.ArrayList;
import java.util.List;
import org.shu.model.ShieldPose;
import common.db.GenericHibernateDao;

public class PoseDao extends GenericHibernateDao<ShieldPose, Integer> {
	public ArrayList<ShieldPose> getAll() {
		String sql = "select * from SHIELD_POSE";
		ArrayList<ShieldPose> list = (ArrayList<ShieldPose>) this.sqlFind(sql);
		return list;
	}

	public ArrayList<ShieldPose> getByBetweenLoops(int startLoop, int endLoop) {
		String sql = "select * from SHIELD_POSE where TUNNEL_LOOP between "
				+ startLoop + " and " + endLoop;
		ArrayList<ShieldPose> list = (ArrayList<ShieldPose>) this.sqlFind(sql);
		return list;
	}

	public ArrayList<ShieldPose> getByTunnelLoop(int tunnelLoop) {
		String sql = "select * from SHIELD_POSE where TUNNEL_LOOP="
				+ tunnelLoop;
		ArrayList<ShieldPose> list = (ArrayList<ShieldPose>) this.sqlFind(sql);
		return list;
	}

	public List<ShieldPose> poseSearch() {
		String sql = "select * from SHIELD_POSE";
		ArrayList<ShieldPose> list = (ArrayList<ShieldPose>) this.sqlFind(sql);
		return list;
	}

	public List poseSearch(String reportId) {
		List result = this.getHibernateTemplate().find(
				"from ShieldPose where reportId=?", reportId);
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
		String sql = "select * from SHIELD_POSE where TUNNEL_LOOP="+tunnelLoop;
		ArrayList<ShieldPose> list = (ArrayList<ShieldPose>) this.sqlFind(sql);
		return list;
	}

	public ArrayList<ShieldPose> poseSearchByNumber(Integer number) {
		return (ArrayList<ShieldPose>) this.getHibernateTemplate().find(
				"from ShieldPose where proId=?", number);
	}
}
