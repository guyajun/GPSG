package org.shu.construct.service;

import java.util.ArrayList;
import org.shu.construct.dao.ProInfoDao;
import org.shu.model.ProInfo;

public class ProInfoService {

	private ProInfoDao proInfoDao;
	
	public ArrayList<ProInfo> getAll()
	{		
		return proInfoDao.getAll();
	}
}
