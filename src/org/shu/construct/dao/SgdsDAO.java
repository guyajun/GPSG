package org.shu.construct.dao;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import org.shu.model.BoltQuality;
import org.shu.model.GpSgds;
import org.shu.model.GpSoilproperty;
import org.shu.model.ProducePlan;
import org.shu.model.ShieldPose;
import org.shu.model.ShieldProcess;
import org.shu.model.SynchronousGrout;
import org.shu.model.WaterProof;

import common.db.GenericHibernateDao;
import common.db.QueryParam;
import common.db.QueryResult;

public class SgdsDAO extends GenericHibernateDao<GpSgds,Integer>{
	public ArrayList<GpSgds> getAll() {
		ArrayList<GpSgds> gpSgds = (ArrayList<GpSgds>) 
				this.getHibernateTemplate().find("from GpSgds");
		return gpSgds;
	}
	public List<GpSgds> sgdsSearch()
	{
		List<GpSgds> result=this.getHibernateTemplate().find("from GpSgds");
		return result;
	}
	public ArrayList<GpSgds> getCountByDate(Date date) {
		String sql = "from GpSgds where dsDate ='" + date
				+ "'";
		System.out.println("123");
		ArrayList<GpSgds> list = (ArrayList<GpSgds>) this
				.find(sql);
//		String sql = "select * from GP_SGDS where DS_DATE ='" + date
//				+ "';";
//		ArrayList<GpSgds> list = (ArrayList<GpSgds>) this
//				.sqlFind(sql);
		return list;
	}
	public List sgdsSearch(String reportId)
	{
		List result=this.getHibernateTemplate().find("from GpSgds where reportId=?",reportId);
		return result;
	}

	public ArrayList<GpSgds> sgdsSearchByPage(int pageNow, int pageSize) {
		List<GpSgds> list = sgdsSearch();
		ArrayList<GpSgds> list1 = new ArrayList<GpSgds>();
		for (int i = ((pageNow - 1) * pageSize); i <= (pageNow * pageSize - 1); i++) {
			if (i < list.size()) {
				list1.add(list.get(i));
			} else {
				break;
			}
		}
		return list1;
	}

	public ArrayList<GpSgds> poseSearchByNumber(Integer proId) {
		return (ArrayList<GpSgds>) this.getHibernateTemplate().find("from GpSgds where proId=?",proId);
	}
	 public ArrayList<GpSgds> getByDate(Date date, int pageNow,
				int pageSize) {
			ArrayList<GpSgds> list = getCountByDate(date);
			System.out.println(list.size());
			System.out.println(2);
			ArrayList<GpSgds> list1 = new ArrayList<GpSgds>();
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

