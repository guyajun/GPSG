package org.shu.dao;

import java.util.List;

public interface ITestDAO {
	@SuppressWarnings("rawtypes")
	public List getAllCatalogs();
	@SuppressWarnings("rawtypes")
	public List getBaseInfo(Integer id);
	
	public List getAllDepts();
	public List getAllRoles();
	public List getAllPros();

}
