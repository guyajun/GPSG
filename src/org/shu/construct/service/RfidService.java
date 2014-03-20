package org.shu.construct.service;

import java.util.ArrayList;
import org.shu.construct.dao.RfidDao;
import org.shu.model.RfidCombine;

public class RfidService {
	private RfidDao rfidDao ;
		
	public void setRfidDao(RfidDao rfidDao) {
		this.rfidDao = rfidDao;
	}

	public ArrayList<RfidCombine> SearchByLoop(Integer tunnelLoop) {
		return (ArrayList<RfidCombine>) rfidDao.searchByLoop(tunnelLoop);
	}
}
