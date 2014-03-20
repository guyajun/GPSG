package org.shu.construct.dao;

import java.util.ArrayList;
import java.util.List;

import org.shu.model.GpAlongsheshi;
import org.shu.model.GpSoilproperty;
import org.springframework.orm.hibernate3.HibernateTemplate;

import common.db.GenericHibernateDao;

public class SheshiDAO extends GenericHibernateDao<GpAlongsheshi, Integer> {
	public ArrayList<GpAlongsheshi> getAll() {
		String sql = "select * from GP_ALONGSHESHI";
		ArrayList<GpAlongsheshi> list = (ArrayList<GpAlongsheshi>) this
				.sqlFind(sql);
		return list;
	}

	public List<GpAlongsheshi> sheshiSearch() {
		String sql = "select * from GP_ALONGSHESHI";
		ArrayList<GpAlongsheshi> list = (ArrayList<GpAlongsheshi>) this
				.sqlFind(sql);
		return list;
	}

	public List sheshiSearch(String reportId) {
		List result = this.getHibernateTemplate().find(
				"from GpAlongsheshi where reportId=?", reportId);
		return result;
	}

	public ArrayList<GpAlongsheshi> sheshiSearchByPage(int pageNow, int pageSize) {
		List<GpAlongsheshi> list = sheshiSearch();
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

	public ArrayList<GpAlongsheshi> sheshiSearchByLoop(Integer ssIndx) {
		return (ArrayList<GpAlongsheshi>) this.getHibernateTemplate().find(
				"from GpAlongsheshi where ssIndx=?", ssIndx);
	}

	public ArrayList<GpAlongsheshi> sheshiSearchBySSLoop(Integer ssLoop) {
		String sql = "select * from GP_ALONGSHESHI where SS_LOOP="+ssLoop;
		ArrayList<GpAlongsheshi> list = (ArrayList<GpAlongsheshi>) this
				.sqlFind(sql);
		return list;
	}
}
