package org.shu.common.service;

import java.util.List;

import org.shu.admin.dao.AuthorityDAO;
import org.shu.admin.dao.DepartmentDAO;
import org.shu.admin.dao.UserDAO;
import org.shu.model.DepartmentInfo;
import org.shu.model.GpQuality;
import org.shu.model.GpReceive;
import org.shu.model.GpStorage;
import org.shu.model.RoleInfo;
import org.shu.model.RoleRefUser;
import org.shu.model.UserInfo;
import org.shu.plan.dao.GpQualityDAO;
import org.shu.plan.dao.GpReceiveDAO;
import org.shu.plan.dao.GpStorageDAO;

import common.db.QueryResult;


public class TransportService {
	GpStorageDAO gpStorageDAO;
	GpReceiveDAO gpReceiveDAO;
	GpQualityDAO gpQualityDAO;
	
	public GpQualityDAO getGpQualityDAO() {
		return gpQualityDAO;
	}
	public void setGpQualityDAO(GpQualityDAO gpQualityDAO) {
		this.gpQualityDAO = gpQualityDAO;
	}
	public GpReceiveDAO getGpReceiveDAO() {
		return gpReceiveDAO;
	}
	public void setGpReceiveDAO(GpReceiveDAO gpReceiveDAO) {
		this.gpReceiveDAO = gpReceiveDAO;
	}
	public GpStorageDAO getGpStorageDAO() {
		return gpStorageDAO;
	}
	public void setGpStorageDAO(GpStorageDAO gpStorageDAO) {
		this.gpStorageDAO = gpStorageDAO;
	}
	
	/**仓储管理**/
	public void addStorage(GpStorage gs)
	{
		gpStorageDAO.addStorage(gs);
	}
	
	/**接收管理**/
	public void addReceive(GpReceive gr)
	{
		gpReceiveDAO.addStorage(gr);
	}
	/**出厂管理**/
	public void addQuality(GpQuality gr)
	{
		gpQualityDAO.addQuality(gr);
	}

}
