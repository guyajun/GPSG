package org.shu.service.imp;
import java.util.List;

import org.shu.dao.imp.UserInfoDao;
public class UserInfoService{
	private UserInfoDao userInfoDao;
	
	public void setUserInfoDao(UserInfoDao userInfoDao) {
		this.userInfoDao = userInfoDao;
	}

	public List getAll() {
		return userInfoDao.getAll();
		 
	}


}

