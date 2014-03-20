package org.shu.construct.dao;

import java.util.ArrayList;
import java.util.List;
import org.shu.model.Segmentrepair;
import common.db.GenericHibernateDao;

public class XunJianDao extends GenericHibernateDao<Segmentrepair, Integer> {
	public ArrayList<Segmentrepair> getAll() {
		String sql = "select * from SEGMENTREPAIR";
		ArrayList<Segmentrepair> list = (ArrayList<Segmentrepair>) this.sqlFind(sql);
		return list;
	}
	
	public ArrayList<Segmentrepair> getByTunnelLoop(int tunnelLoop)
	{
		String sql = "select * from SEGMENTREPAIR where isPhoto='1' and TUNNEL_LOOP="+tunnelLoop;
		ArrayList<Segmentrepair> result=(ArrayList<Segmentrepair>) this.sqlFind(sql);
		return result;
	}
}
