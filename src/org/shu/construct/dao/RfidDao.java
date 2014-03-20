package org.shu.construct.dao;

import java.util.ArrayList;

import org.shu.model.RfidCombine;
import org.shu.model.SynchronousGrout;

import common.db.GenericHibernateDao;

public class RfidDao extends GenericHibernateDao<RfidCombine, Integer> {

	public ArrayList<RfidCombine> searchByLoop(int tunnelLoop) {

		String sql = "select * from RFID_COMBINE where TUNNEL_LOOP ='" + tunnelLoop+ "';";
		ArrayList<RfidCombine> list = (ArrayList<RfidCombine>) this
				.sqlFind(sql);
		return list;
	}
}
