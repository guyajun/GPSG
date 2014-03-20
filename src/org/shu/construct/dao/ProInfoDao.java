package org.shu.construct.dao;

import java.util.ArrayList;
import java.util.Date;

import org.shu.model.ProInfo;
import org.shu.model.ShieldProcess;

import common.db.GenericHibernateDao;

public class ProInfoDao extends GenericHibernateDao<ProInfo, Integer> {
	public ArrayList<ProInfo> getAll() {
		String sql = "select * from SHIELD_PROCESS order by TUNNEL_LOOP";
		ArrayList<ProInfo> list = (ArrayList<ProInfo>) this.sqlFind(sql);
		return list;
	}

	@SuppressWarnings("unchecked")
	public ArrayList<ProInfo> getOnePage(int pageNow, int pageSize) {
		ArrayList<ProInfo> list = (ArrayList<ProInfo>) getAll();
		ArrayList<ProInfo> list1 = new ArrayList<ProInfo>();
		for (int i = ((pageNow - 1) * pageSize); i <= (pageNow * pageSize - 1); i++) {
			if (i < list.size()) {
				list1.add(list.get(i));
			} else {
				break;
			}
		}
		return list1;
	}

	public ArrayList<ProInfo> getCountByDate(Date date) {
		String sql = "select * from SHIELD_PROCESS where TODAY ='" + date
				+ "';";
		ArrayList<ProInfo> list = (ArrayList<ProInfo>) this
				.sqlFind(sql);
		return list;
	}

	public ArrayList<ProInfo> getCountByLoop(int loop) {
		System.out.println("loop=" + loop);
		String sql = "select * from SHIELD_PROCESS where TUNNEL_LOOP =" + loop;
		ArrayList<ProInfo> list = (ArrayList<ProInfo>) this
				.sqlFind(sql);
		return list;
	}

	public ArrayList<ProInfo> getCountByBetweenLoops(int loop1, int loop2) {
		String sql = "select * from SHIELD_PROCESS where TUNNEL_LOOP between "
				+ loop1 + " and " + loop2 + ";";
		ArrayList<ProInfo> list = (ArrayList<ProInfo>) this
				.sqlFind(sql);
		return list;
	}
	public ArrayList<ProInfo> getByBetweenLoops(int loop1, int loop2, int pageNow,
			int pageSize) {
		ArrayList<ProInfo> list = getCountByBetweenLoops(loop1,loop2);
		ArrayList<ProInfo> list1 = new ArrayList<ProInfo>();
		for (int i = ((pageNow - 1) * pageSize); i <= (pageNow * pageSize - 1); i++) {
			if (i < list.size()) {
				list1.add(list.get(i));
			} else {
				break;
			}
		}
		return list1;
	}
	public ArrayList<ProInfo> getByLoop(int loop, int pageNow,
			int pageSize) {
		ArrayList<ProInfo> list = getCountByLoop(loop);
		ArrayList<ProInfo> list1 = new ArrayList<ProInfo>();
		for (int i = ((pageNow - 1) * pageSize); i <= (pageNow * pageSize - 1); i++) {
			if (i < list.size()) {
				list1.add(list.get(i));
			} else {
				break;
			}
		}
		return list1;
	}

	public ArrayList<ProInfo> getByDate(Date date, int pageNow,
			int pageSize) {
		ArrayList<ProInfo> list = getCountByDate(date);
		System.out.println(list.size());
		ArrayList<ProInfo> list1 = new ArrayList<ProInfo>();
		for (int i = ((pageNow - 1) * pageSize); i <= (pageNow * pageSize - 1); i++) {
			if (i < list.size()) {
				list1.add(list.get(i));
			} else {
				break;
			}
		}
		return list1;
	}

}
