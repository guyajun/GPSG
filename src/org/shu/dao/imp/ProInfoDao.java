package org.shu.dao.imp;

import java.util.ArrayList;
import java.util.List;
import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.Transaction;
import org.shu.model.ProInfo;
import org.shu.model.RoleInfo;
import org.shu.model.UserInfo;

import common.db.GenericHibernateDao;

public class ProInfoDao extends GenericHibernateDao<ProInfo, Integer> {
    
    public int getLastLoop() {
        String sql = "select top 1 * from Pro_INFO order by id desc;";
        List<ProInfo> proInfos = sqlFind(sql);
        if (proInfos.size() > 0)
            return proInfos.get(0).getGpCount();
        else
            return 0;
    }
    public void save(ProInfo proInfo){
		this.getHibernateTemplate().save(proInfo);
	}
    public void delete(ProInfo proInfo){
		this.getHibernateTemplate().delete(proInfo);
	}
    public ArrayList<ProInfo> getCountByproName(String proName) {
		System.out.println("fullName=" + proName);
		String sql = "select * from PRO_INFO where PRO_NAME ='" + proName+"';";
		ArrayList<ProInfo> ProInfo = (ArrayList<ProInfo>) this
				.sqlFind(sql);
		return ProInfo;
	}
    public List<ProInfo> proSearch()
    {
        List<ProInfo> result = this.getHibernateTemplate().find("from ProInfo");
        return result;
    }
    public List findAll(int pageNow, int pageSize) {
        try {
            Session session = getHibernateTemplate().getSessionFactory().openSession();
            Transaction ts = session.beginTransaction();
            Query query = session.createQuery("from ProInfo");
            int firstResult = (pageNow - 1) * pageSize;
            query.setFirstResult(firstResult);
            query.setMaxResults(pageSize);
            List list = query.list();
            ts.commit();
            session.close();
            session = null;
            return list;
        }
        catch (Exception e) {
            e.printStackTrace();
            return null;
        }
    }
    
    public int findProInfoSize() {
        return getHibernateTemplate().find("from ProInfo").size();
    }
    
    public void saveProInfo(ProInfo proInfo) {
        this.getHibernateTemplate().save(proInfo);
    }
    
    public ArrayList<ProInfo> getAll() {
		String sql="select * from PRO_INFO;";
		ArrayList<ProInfo> list=(ArrayList<ProInfo>) sqlFind(sql);
		return list;
	}
    
    public List getAllUser() {
        return this.getHibernateTemplate().find("from UserInfo");
    }
    
    public ProInfo find(int id) {
        List list = getHibernateTemplate().find("from ProInfo where id=?", id);
        if (list.size() > 0)
            return (ProInfo)list.get(0);
        else
            return null;
    }
    
    public List<ProInfo> findSubProInfo(int id) {
        List<ProInfo> list = getHibernateTemplate().find("from ProInfo where proInfo.id=?", id);
        if (list.size() > 0)
            return list;
        else
            return null;
    }
    
    public void update(ProInfo proInfo) {
        getHibernateTemplate().update(proInfo);
    }
    
    public void deleteProInfo(int id) {
        List<ProInfo> list = findSubProInfo(id);
        if (list == null) {
            getHibernateTemplate().delete(find(id));
            return;
        }
        for (int i = 0; i < list.size(); i++) {
            deleteProInfo(list.get(i).getId());
            List list1 = findSubProInfo(list.get(i).getId());
            if (list1 == null && find(list.get(i).getId()) != null) {
                getHibernateTemplate().delete(find(list.get(i).getId()));
            }
        }
        List list2 = findSubProInfo(id);
        if (list2 == null && find(id) != null) {
            getHibernateTemplate().delete(find(id));
        }
    }
    
    public ArrayList<ProInfo> findByName(String proName)
	{
		String sql="select * from PRO_INFO where PRO_NAME='"+proName+"';";
		ArrayList<ProInfo> list=(ArrayList<ProInfo>) sqlFind(sql);
		return list;
	}
    public ArrayList<ProInfo> getByproName(String proName, int pageNow,
			int pageSize) {
		ArrayList<ProInfo> proList = getCountByproName(proName);
		ArrayList<ProInfo> proList1 = new ArrayList<ProInfo>();
		for (int i = ((pageNow - 1) * pageSize); i <= (pageNow * pageSize - 1); i++) {
			if (i < proList.size()) {
				proList1.add(proList.get(i));
			} else {
				break;
			}
		}
		return proList1;
	}
}
