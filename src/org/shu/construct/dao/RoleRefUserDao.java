package org.shu.construct.dao;

import java.util.ArrayList;
import org.shu.model.RoleRefUser;
import common.db.GenericHibernateDao;

public class RoleRefUserDao extends GenericHibernateDao<RoleRefUser, Integer> {
	public ArrayList<RoleRefUser> getByUserId(int userId) {
		String sql = "select * from ROLE_REF_USER where USER_ID="+userId;
		ArrayList<RoleRefUser> list = (ArrayList<RoleRefUser>) this.sqlFind(sql);		
		return list;
	}
	public void saveOne(RoleRefUser roleRefUser){
		this.save(roleRefUser);
	}
	public void deleteOne(RoleRefUser roleRefUser){
		this.delete(roleRefUser);
	}
	public void updateOne(RoleRefUser roleRefUser){
		this.update(roleRefUser);
	}
}
