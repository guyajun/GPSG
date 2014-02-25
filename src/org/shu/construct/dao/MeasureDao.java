
package org.shu.construct.dao;
import java.util.ArrayList;
import java.util.List;

import org.shu.model.GpAlongsheshi;
import org.shu.model.GpMeasurepoint;
import org.shu.model.GpSoilproperty;
import org.springframework.orm.hibernate3.HibernateTemplate;

import common.db.GenericHibernateDao;

public class MeasureDao extends GenericHibernateDao<GpMeasurepoint,Integer>{
	public ArrayList<GpMeasurepoint> getAll() {
		String sql = "select * from GP_MEASUREPOINT";
		ArrayList<GpMeasurepoint> list = (ArrayList<GpMeasurepoint>) this
				.sqlFind(sql);
		return list;
	}
	public List<GpMeasurepoint> measureSearch()
	{
		String sql = "select * from GP_MEASUREPOINT";
		ArrayList<GpMeasurepoint> list = (ArrayList<GpMeasurepoint>) this
				.sqlFind(sql);
		return list;
	}
	public ArrayList<GpMeasurepoint> getCountByCno(String cbCdno) {
		System.out.println("cbCdno=" + cbCdno);
		String sql = "select * from Gp_Measurepoint where Cb_Cdno ='" + cbCdno+"';";
		ArrayList<GpMeasurepoint> gpMeasurepoint = (ArrayList<GpMeasurepoint>) this
				.sqlFind(sql);
		return gpMeasurepoint;
	}

	public List measureSearch(String reportId)
	{
		List result=this.getHibernateTemplate().find("from GpMeasurepoint where reportId=?",reportId);
		return result;
	}

	public ArrayList<GpMeasurepoint> measureSearchByPage(int pageNow, int pageSize) {
		List<GpMeasurepoint> list = measureSearch();
		ArrayList<GpMeasurepoint> list1 = new ArrayList<GpMeasurepoint>();
		for (int i = ((pageNow - 1) * pageSize); i <= (pageNow * pageSize - 1); i++) {
			if (i < list.size()) {
				list1.add(list.get(i));
			} else {
				break;
			}
		}
		return list1;
	}

	public ArrayList<GpMeasurepoint> measureSearchByLoop(Integer cbIndx) {
		return (ArrayList<GpMeasurepoint>) this.getHibernateTemplate().find("from GpMeasurepoint where cbIndx=?",cbIndx);
	}
	public ArrayList<GpMeasurepoint> getByCno(String cbCdno, int pageNow,
			int pageSize) {
		ArrayList<GpMeasurepoint> measureList = getCountByCno(cbCdno);
		ArrayList<GpMeasurepoint> measureList1 = new ArrayList<GpMeasurepoint>();
		for (int i = ((pageNow - 1) * pageSize); i <= (pageNow * pageSize - 1); i++) {
			if (i < measureList.size()) {
				measureList1.add(measureList.get(i));
			} else {
				break;
			}
		}
		return measureList1;
	}
}

