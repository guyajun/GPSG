package org.shu.action;

import java.util.List;
import java.util.Map;
import org.shu.model.ConcQual;
import org.shu.service.imp.ConcMixRatioService;
import org.shu.service.imp.ConcQualService;
import org.shu.service.imp.UserInfoService;
import com.opensymphony.xwork2.ActionContext;
import common.base.action.BaseAction;

@SuppressWarnings("serial")
public class ConcQualAction extends BaseAction {
    
    protected ConcQual concQual;
    protected ConcQualService concQualService;
    protected UserInfoService userInfoService;
    protected ConcMixRatioService concMixRatioService;  
    
    public ConcQual getConcQual() {
        return concQual;
    }
    
    public void setConcQual(ConcQual concQual) {
        this.concQual = concQual;
    }
    
    public void setConcQualService(ConcQualService concQualService) {
        this.concQualService = concQualService;
    }
    
    public void setUserInfoService(UserInfoService userInfoService) {
        this.userInfoService = userInfoService;
    }
    
    public void setConcMixRatioService(ConcMixRatioService concMixRatioService) {
        this.concMixRatioService = concMixRatioService;
    }

    public String execute() throws Exception {
        ConcQual concQual1 = new ConcQual();
        concQual1.setPurchaseAmount(concQual.getPurchaseAmount());
        concQual1.setPurchaseTime(concQual.getPurchaseTime());
        concQual1.setReportId(concQual.getReportId());
        concQual1.setUseBeginTime(concQual.getUseBeginTime());
        concQual1.setUseEndTime(concQual.getUseEndTime());
        concQual1.setUrl(concQual.getUrl());
        concQual1.setMixRatioId(concQual.getMixRatioId());
        concQualService.saveConcQual(concQual1);
        return SUCCESS;
    }
    
    public void comboData() throws Exception {        
        List listConcMix = concQualService.getAll();        
        List listuser = userInfoService.getAll();
        Map request = (Map)ActionContext.getContext().get("request");
        request.put("listConcMix", listConcMix);
        request.put("listuser", listuser);
    }
    
}
