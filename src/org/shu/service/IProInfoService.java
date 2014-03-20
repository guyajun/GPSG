package org.shu.service;
import java.util.List;

import org.shu.model.DepartmentInfo;
import org.shu.model.ProInfo;
import org.shu.model.UserInfo;

import common.db.QueryResult;
public interface IProInfoService {
		public List getAll();
		public List getAllUser();
		public void saveProInfo(ProInfo proInfo);
		public QueryResult<ProInfo> getAllPro(int page, int size) throws Exception;
		public ProInfo findOnePro(Integer id);
	
		
}

