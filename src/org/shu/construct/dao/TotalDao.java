package org.shu.construct.dao;

import java.util.ArrayList;

import org.shu.model.DownWell;
import org.shu.model.GpTotalInfo;
import org.shu.model.ShieldProcess;

import common.db.GenericHibernateDao;

public class TotalDao extends GenericHibernateDao<GpTotalInfo, Integer> {
	public ArrayList<GpTotalInfo> getAll() {
		String sql = "select * from GP_TOTAL_INFO";
		ArrayList<GpTotalInfo> list = (ArrayList<GpTotalInfo>) this
				.sqlFind(sql);
		return list;
	}

	public ArrayList<GpTotalInfo> getOnePage(int pageNow, int pageSize) {
		ArrayList<GpTotalInfo> list = (ArrayList<GpTotalInfo>) getAll();
		ArrayList<GpTotalInfo> list1 = new ArrayList<GpTotalInfo>();
		for (int i = ((pageNow - 1) * pageSize); i <= (pageNow * pageSize - 1); i++) {
			if (i < list.size()) {
				list1.add(list.get(i));
			} else {
				break;
			}
		}
		return list1;
	}

	public void updateOneRow(GpTotalInfo gpTotalInfo) {
		this.update(gpTotalInfo);
	}

	public ArrayList<GpTotalInfo> getByLoop(int tunnelLoop) {
		String sql = "select * from GP_TOTAL_INFO where TUNNEL_LOOP ="
				+ tunnelLoop;
		ArrayList<GpTotalInfo> list = (ArrayList<GpTotalInfo>) this
				.sqlFind(sql);
		System.out.println("list.size()="+list.size());
		return list;
	}
}
