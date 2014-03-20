package org.shu.construct.dao;

import java.util.ArrayList;
import org.shu.model.GpSoilproperty;
import common.db.GenericHibernateDao;

public class SoilDao extends GenericHibernateDao<GpSoilproperty, Integer> {
	public ArrayList<GpSoilproperty> getAll() {
		String sql="select * from GP_SOILPROPERTY";
		ArrayList<GpSoilproperty> gpSoilpropertys =(ArrayList<GpSoilproperty>) sqlFind(sql);
		return gpSoilpropertys;
	}

	@SuppressWarnings("unchecked")
	public ArrayList<GpSoilproperty> getOnePage(int pageNow, int pageSize) {
		ArrayList<GpSoilproperty> soilList = (ArrayList<GpSoilproperty>) getAll();
		ArrayList<GpSoilproperty> soilList1 = new ArrayList<GpSoilproperty>();
		for (int i = ((pageNow - 1) * pageSize); i <= (pageNow * pageSize - 1); i++) {
			if (i < soilList.size()) {
				soilList1.add(soilList.get(i));
			} else {
				break;
			}
		}
		return soilList1;
	}

	public ArrayList<GpSoilproperty> getCountById(int id) {
		String sql = "select * from GP_SOILPROPERTY where TC_LOOP =" + id;
		ArrayList<GpSoilproperty> gpSoilpropertys = (ArrayList<GpSoilproperty>) this
				.sqlFind(sql);
		return gpSoilpropertys;
	}

	public ArrayList<GpSoilproperty> getCountByCno(String tcCno) {
		System.out.println("tcCno=" + tcCno);
		String sql = "select * from GP_SOILPROPERTY where TC_CNO ='" + tcCno+"';";
		ArrayList<GpSoilproperty> gpSoilpropertys = (ArrayList<GpSoilproperty>) this
				.sqlFind(sql);
		return gpSoilpropertys;
	}

	public ArrayList<GpSoilproperty> getById(int id, int pageNow, int pageSize) {
		ArrayList<GpSoilproperty> soilList = getCountById(id);
		ArrayList<GpSoilproperty> soilList1 = new ArrayList<GpSoilproperty>();
		for (int i = ((pageNow - 1) * pageSize); i <= (pageNow * pageSize - 1); i++) {
			if (i < soilList.size()) {
				soilList1.add(soilList.get(i));
			} else {
				break;
			}
		}
		return soilList1;
	}

	public ArrayList<GpSoilproperty> getByCno(String tcCno, int pageNow,
			int pageSize) {
		ArrayList<GpSoilproperty> soilList = getCountByCno(tcCno);
		ArrayList<GpSoilproperty> soilList1 = new ArrayList<GpSoilproperty>();
		for (int i = ((pageNow - 1) * pageSize); i <= (pageNow * pageSize - 1); i++) {
			if (i < soilList.size()) {
				soilList1.add(soilList.get(i));
			} else {
				break;
			}
		}
		return soilList1;
	}

}
