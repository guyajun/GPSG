package org.shu.service.imp;

import java.util.ArrayList;
import java.util.List;
import org.shu.dao.imp.ProInfoDao;
import org.shu.model.ProInfo;
import org.shu.model.RoleInfo;
import org.shu.model.UserInfo;

public class ProInfoService {
    
    private ProInfoDao proInfoDao;
    
    public void setProInfoDao(ProInfoDao proInfoDao) {
        this.proInfoDao = proInfoDao;
    }
    public ArrayList<ProInfo> getAll() {
		return proInfoDao.getAll();
		 
	}
    public void delete(ProInfo proInfo){
    	proInfoDao.delete(proInfo);
	}
    public void save(ProInfo proInfo) {
    	proInfoDao.save(proInfo);
	}
    public ArrayList<ProInfo> getOnePageByproName(String proName, int pageNow,
			int pageSize) {
		return proInfoDao.getByproName(proName, pageNow, pageSize);
	}
    public ArrayList<ProInfo> getCountByproName(String proName) {
		return proInfoDao.getCountByproName(proName);
	}
    public ArrayList<ProInfo> getProInfo() {
		return (ArrayList<ProInfo>) proInfoDao.proSearch();
	}
    
    public int getLastLoop() {
        return proInfoDao.getLastLoop();
    }
    
    public void saveProInfo(ProInfo proInfo) {
        proInfoDao.saveProInfo(proInfo);
    }
    

    
    public int findProInfoSize() {
        return proInfoDao.findProInfoSize();
    }
    
    public List getAllUser() {
        return proInfoDao.getAllUser();
    }
    
    public List findAll(int pageNow, int pageSize) {
        return proInfoDao.findAll(pageNow, pageSize);
    }
    
    public ProInfo find(int id) {
        return proInfoDao.find(id);
    }
    
    public void update(ProInfo proInfo) {
        proInfoDao.update(proInfo);
    }
    
    public ArrayList<ProInfo> findByproName(String proName){
		return proInfoDao.findByName(proName);
	}
    
    public void deleteProInfo(int id) {
        proInfoDao.deleteProInfo(id);
        
    }
    
}
