package org.shu.construct.service;

import java.util.List;

import org.shu.construct.dao.WaterProofDao;
import org.shu.model.WaterProof;
public class WaterProofService{
	private WaterProofDao waterProofDao;
	
	public void setWaterProofDao(WaterProofDao waterProofDao) {
		this.waterProofDao = waterProofDao;
	}


	public void saveWaterProof(WaterProof waterProof) {
		waterProofDao.saveWaterProof(waterProof);
	}


	public List getAll() {
		return waterProofDao.getAll();
		 
	}

}

