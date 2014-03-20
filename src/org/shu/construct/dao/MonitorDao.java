package org.shu.construct.dao;

import java.util.ArrayList;
import java.util.Date;

import org.shu.model.GpGroundsettling;
import org.shu.model.ShieldProcess;

import common.db.GenericHibernateDao;

public class MonitorDao extends GenericHibernateDao<GpGroundsettling, Integer> {
	public ArrayList<GpGroundsettling> getAll() {
		String sql = "select * from GP_GROUNDSETTLING";
		ArrayList<GpGroundsettling> list = (ArrayList<GpGroundsettling>) this.sqlFind(sql);
		return list;
	}

	@SuppressWarnings("unchecked")
	public ArrayList<GpGroundsettling> getOnePage(int pageNow, int pageSize) {
		ArrayList<GpGroundsettling> list = (ArrayList<GpGroundsettling>) getAll();
		ArrayList<GpGroundsettling> list1 = new ArrayList<GpGroundsettling>();
		for (int i = ((pageNow - 1) * pageSize); i <= (pageNow * pageSize - 1); i++) {
			if (i < list.size()) {
				list1.add(list.get(i));
			} else {
				break;
			}
		}
		return list1;
	}

	public ArrayList<GpGroundsettling> getCountByDate(Date date) {
		String sql = "select * from GP_GROUNDSETTLING where TODAY ='" + date
				+ "';";
		ArrayList<GpGroundsettling> list = (ArrayList<GpGroundsettling>) this
				.sqlFind(sql);
		return list;
	}

	public ArrayList<GpGroundsettling> getCountByNumber(String number) {
		System.out.println("number=" + number);
		String sql = "select * from GP_GROUNDSETTLING where DC_CDNO ='" + number+"';";
		ArrayList<GpGroundsettling> list = (ArrayList<GpGroundsettling>) this
				.sqlFind(sql);
		return list;
	}

	public ArrayList<GpGroundsettling> getCountByBetweenDates(String date1, String date2, String number) {
		String sql = "select * from GP_GROUNDSETTLING where DC_CDNO='"+number+"' and DC_TIME between '"+date1+"' and '"+date2+"';";
		ArrayList<GpGroundsettling> list = (ArrayList<GpGroundsettling>) this
				.sqlFind(sql);
		return list;
	}

	public ArrayList<GpGroundsettling> getByNumber(String number, int pageNow,
			int pageSize) {
		ArrayList<GpGroundsettling> list = getCountByNumber(number);
		ArrayList<GpGroundsettling> list1 = new ArrayList<GpGroundsettling>();
		for (int i = ((pageNow - 1) * pageSize); i <= (pageNow * pageSize - 1); i++) {
			if (i < list.size()) {
				list1.add(list.get(i));
			} else {
				break;
			}
		}
		return list1;
	}

	public ArrayList<GpGroundsettling> getByDate(Date date, int pageNow,
			int pageSize) {
		ArrayList<GpGroundsettling> list = getCountByDate(date);
		System.out.println(list.size());
		ArrayList<GpGroundsettling> list1 = new ArrayList<GpGroundsettling>();
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
