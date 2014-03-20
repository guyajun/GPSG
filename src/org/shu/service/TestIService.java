package org.shu.service;

import java.util.List;

public interface TestIService {
	@SuppressWarnings("rawtypes")
	public List getAllCatalogs();
	@SuppressWarnings("rawtypes")
	public List getBaseInfo(Integer id);
	
	public List getAllDepts();
	public List getAllRoles();
	public List getAllPros();
}
