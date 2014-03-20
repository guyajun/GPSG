package org.shu.action;

import org.shu.model.PreEmbed;
import org.shu.service.imp.PreEmbedService;
import common.base.action.BaseAction;

@SuppressWarnings("serial")
public class PreEmbedAction extends BaseAction{
	private PreEmbed preEmbed;
	private PreEmbedService preEmbedService;
		
    public PreEmbed getPreEmbed() {
        return preEmbed;
    }
    
    public void setPreEmbed(PreEmbed preEmbed) {
        this.preEmbed = preEmbed;
    }
    
    public void setPreEmbedService(PreEmbedService preEmbedService) {
        this.preEmbedService = preEmbedService;
    }

    public String execute() throws Exception {
		PreEmbed preEmbed1 = new PreEmbed();
		preEmbed1.setPurchaseTime(preEmbed.getPurchaseTime());
//		preEmbed1.setUseStartTime(preEmbed.getUseStartTime());
//		preEmbed1.setUseEndTime(preEmbed.getUseEndTime());
		preEmbed1.setPurchaseAmount(preEmbed.getPurchaseAmount());
		preEmbed1.setReportId(preEmbed.getReportId());
		preEmbed1.setType(preEmbed.getType());
		preEmbed1.setUrl(preEmbed.getUrl());	
		preEmbedService.savePreEmbed(preEmbed1);	
		return SUCCESS;
	}	

}
