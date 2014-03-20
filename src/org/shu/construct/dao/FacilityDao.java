package org.shu.construct.dao;

import java.util.ArrayList;
import java.util.Date;

import org.shu.model.GpAlongsheshi;

import common.db.GenericHibernateDao;

public class FacilityDao extends GenericHibernateDao<GpAlongsheshi, Integer> {
	public ArrayList<GpAlongsheshi> getAll() {
		String sql = "select * from GP_ALONGSHESHI order by TUNNEL_LOOP";
		ArrayList<GpAlongsheshi> list = (ArrayList<GpAlongsheshi>) this.sqlFind(sql);
		return list;
	}

	@SuppressWarnings("unchecked")
	public ArrayList<GpAlongsheshi> getOnePage(int pageNow, int pageSize) {
		ArrayList<GpAlongsheshi> list = (ArrayList<GpAlongsheshi>) getAll();
		ArrayList<GpAlongsheshi> list1 = new ArrayList<GpAlongsheshi>();
		for (int i = ((pageNow - 1) * pageSize); i <= (pageNow * pageSize - 1); i++) {
			if (i < list.size()) {
				list1.add(list.get(i));
			} else {
				break;
			}
		}
		return list1;
	}

	public ArrayList<GpAlongsheshi> getCountByDate(Date date) {
		String sql = "select * from GP_ALONGSHESHI where TODAY ='" + date
				+ "';";
		ArrayList<GpAlongsheshi> list = (ArrayList<GpAlongsheshi>) this
				.sqlFind(sql);
		return list;
	}

	public ArrayList<GpAlongsheshi> getCountByLoop(int loop) {
		System.out.println("loop=" + loop);
		String sql = "select * from GP_ALONGSHESHI where TUNNEL_LOOP =" + loop;
		ArrayList<GpAlongsheshi> list = (ArrayList<GpAlongsheshi>) this
				.sqlFind(sql);
		return list;
	}

	public ArrayList<GpAlongsheshi> getCountByBetweenLoops(int loop1, int loop2) {
		String sql = "select * from SHIELD_PROCESS where TUNNEL_LOOP between "
				+ loop1 + " and " + loop2 + ";";
		ArrayList<GpAlongsheshi> list = (ArrayList<GpAlongsheshi>) this
				.sqlFind(sql);
		return list;
	}
	public ArrayList<GpAlongsheshi> getByBetweenLoops(int loop1, int loop2, int pageNow,
			int pageSize) {
		ArrayList<GpAlongsheshi> list = getCountByBetweenLoops(loop1,loop2);
		ArrayList<GpAlongsheshi> list1 = new ArrayList<GpAlongsheshi>();
		for (int i = ((pageNow - 1) * pageSize); i <= (pageNow * pageSize - 1); i++) {
			if (i < list.size()) {
				list1.add(list.get(i));
			} else {
				break;
			}
		}
		return list1;
	}
	public ArrayList<GpAlongsheshi> getByLoop(int loop, int pageNow,
			int pageSize) {
		ArrayList<GpAlongsheshi> list = getCountByLoop(loop);
		ArrayList<GpAlongsheshi> list1 = new ArrayList<GpAlongsheshi>();
		for (int i = ((pageNow - 1) * pageSize); i <= (pageNow * pageSize - 1); i++) {
			if (i < list.size()) {
				list1.add(list.get(i));
			} else {
				break;
			}
		}
		return list1;
	}

	public ArrayList<GpAlongsheshi> getByDate(Date date, int pageNow,
			int pageSize) {
		ArrayList<GpAlongsheshi> list = getCountByDate(date);
		System.out.println(list.size());
		ArrayList<GpAlongsheshi> list1 = new ArrayList<GpAlongsheshi>();
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
