package org.shu.construct.dao;

import java.util.ArrayList;
import java.util.Date;

import org.shu.model.ShieldProcess;

import common.db.GenericHibernateDao;

public class AdvanceDao extends GenericHibernateDao<ShieldProcess, Integer> {
	public ArrayList<ShieldProcess> getAll() {
		String sql = "select * from SHIELD_PROCESS order by TUNNEL_LOOP";
		ArrayList<ShieldProcess> list = (ArrayList<ShieldProcess>) this.sqlFind(sql);
		return list;
	}

	@SuppressWarnings("unchecked")
	public ArrayList<ShieldProcess> getOnePage(int pageNow, int pageSize) {
		ArrayList<ShieldProcess> list = (ArrayList<ShieldProcess>) getAll();
		ArrayList<ShieldProcess> list1 = new ArrayList<ShieldProcess>();
		for (int i = ((pageNow - 1) * pageSize); i <= (pageNow * pageSize - 1); i++) {
			if (i < list.size()) {
				list1.add(list.get(i));
			} else {
				break;
			}
		}
		return list1;
	}

	public ArrayList<ShieldProcess> getCountByDate(Date date) {
		String sql = "select * from SHIELD_PROCESS where TODAY like '" + date
				+ "';";
		ArrayList<ShieldProcess> list = (ArrayList<ShieldProcess>) this
				.sqlFind(sql);
		return list;
	}

	public ArrayList<ShieldProcess> getCountByLoop(int loop) {
		System.out.println("loop=" + loop);
		String sql = "select * from SHIELD_PROCESS where TUNNEL_LOOP =" + loop;
		ArrayList<ShieldProcess> list = (ArrayList<ShieldProcess>) this
				.sqlFind(sql);
		return list;
	}

	public ArrayList<ShieldProcess> getCountByBetweenLoops(int loop1, int loop2) {
		String sql = "select * from SHIELD_PROCESS where TUNNEL_LOOP between "
				+ loop1 + " and " + loop2 + ";";
		ArrayList<ShieldProcess> list = (ArrayList<ShieldProcess>) this
				.sqlFind(sql);
		return list;
	}
	public ArrayList<ShieldProcess> getByBetweenLoops(int loop1, int loop2, int pageNow,
			int pageSize) {
		ArrayList<ShieldProcess> list = getCountByBetweenLoops(loop1,loop2);
		ArrayList<ShieldProcess> list1 = new ArrayList<ShieldProcess>();
		for (int i = ((pageNow - 1) * pageSize); i <= (pageNow * pageSize - 1); i++) {
			if (i < list.size()) {
				list1.add(list.get(i));
			} else {
				break;
			}
		}
		return list1;
	}
	public ArrayList<ShieldProcess> getByLoop(int loop, int pageNow,
			int pageSize) {
		ArrayList<ShieldProcess> list = getCountByLoop(loop);
		ArrayList<ShieldProcess> list1 = new ArrayList<ShieldProcess>();
		for (int i = ((pageNow - 1) * pageSize); i <= (pageNow * pageSize - 1); i++) {
			if (i < list.size()) {
				list1.add(list.get(i));
			} else {
				break;
			}
		}
		return list1;
	}

	public ArrayList<ShieldProcess> getByDate(Date date, int pageNow,
			int pageSize) {
		ArrayList<ShieldProcess> list = getCountByDate(date);
		System.out.println(list.size());
		ArrayList<ShieldProcess> list1 = new ArrayList<ShieldProcess>();
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
