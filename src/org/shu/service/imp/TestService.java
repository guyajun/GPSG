package org.shu.service.imp;

import java.util.List;

import org.shu.dao.ITestDAO;
import org.shu.service.TestIService;
public class TestService implements TestIService {

	private ITestDAO testDAO;
	@SuppressWarnings("rawtypes")
	public List getAllCatalogs(){
		return testDAO.getAllCatalogs();
	}
	
	public List getAllDepts()
	{
		return testDAO.getAllDepts();
	}
	public List getAllRoles()
	{
		return testDAO.getAllRoles();
	}
	public List getAllPros()
	{
		return testDAO.getAllPros();
	}
	@SuppressWarnings("rawtypes")
	public List getBaseInfo(Integer id)
	{
		return testDAO.getBaseInfo(id);
	}
	public void setTestDAO(ITestDAO testDAO) {
		this.testDAO = testDAO;
	}

}
