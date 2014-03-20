package org.shu.service.imp;

import java.util.List;
import org.shu.dao.imp.PreEmbedDao;
import org.shu.model.PreEmbed;

public class PreEmbedService{
	private PreEmbedDao preEmbedDao;	
	public void setPreEmbedDao(PreEmbedDao preEmbedDao) {
		this.preEmbedDao = preEmbedDao;
	}


	public void savePreEmbed(PreEmbed preEmbed) {
		preEmbedDao.savePreEmbed(preEmbed);
	}


	public List getAll() {
		return preEmbedDao.getAll();
		 
	}
	
}

