package org.shu.action;

import org.shu.model.ConcMixRatio;
import org.shu.service.imp.ConcMixRatioService;
import common.base.action.BaseAction;

@SuppressWarnings("serial")
public class ConcMixRatioAction extends BaseAction{
	protected ConcMixRatio concMixRatio;
	protected ConcMixRatioService concMixRatioService;
	
    public ConcMixRatio getConcMixRatio() {
        return concMixRatio;
    }
    
    public void setConcMixRatio(ConcMixRatio concMixRatio) {
        this.concMixRatio = concMixRatio;
    }
    
    public void setConcMixRatioService(ConcMixRatioService concMixRatioService) {
        this.concMixRatioService = concMixRatioService;
    }

    public String execute() throws Exception {
		ConcMixRatio concMixRatio1 = new ConcMixRatio();		
		concMixRatio1.setMixRatioId(concMixRatio.getMixRatioId());
//		concMixRatio1.setDate(concMixRatio.getDate());
		concMixRatio1.setUrl(concMixRatio.getUrl());
		concMixRatioService.saveConcMixRatio(concMixRatio1);	
		return SUCCESS;
	}		

}
