package org.shu.construct.dao;

import java.util.ArrayList;
import org.shu.model.RoleRefFunction;
import common.db.GenericHibernateDao;

public class AuthorityDao extends GenericHibernateDao<RoleRefFunction, Integer> { 
    
    public void save(ArrayList<RoleRefFunction> roleRefFunctions) {
    	System.out.println("roleRefFunctions.size()="+roleRefFunctions.size());
    	for(int i=0;i<roleRefFunctions.size();i++){
        	save(roleRefFunctions.get(i));    	
    	}
    }
    public ArrayList<RoleRefFunction> getByRoleId(int roleId){
    	String sql="select * from ROLE_REF_FUNCTION where ROLE_ID="+roleId;
    	ArrayList<RoleRefFunction> roleRefFunctions=(ArrayList<RoleRefFunction>) sqlFind(sql);
    	return roleRefFunctions;
    }
    public void delete(int roleId){    	
    	ArrayList<RoleRefFunction> roleRefFunctions=getByRoleId(roleId);
    	for(int i=0;i<roleRefFunctions.size();i++){
    		delete(roleRefFunctions.get(i));
    	}
    }
}
