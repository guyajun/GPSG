package org.shu.action;

import java.util.List;
import java.util.Map;
import org.shu.model.SteelRaw;
import org.shu.service.imp.SteelQualService;
import org.shu.service.imp.SteelRawService;
import org.shu.service.imp.UserInfoService;
import com.opensymphony.xwork2.ActionContext;
import common.base.action.BaseAction;

@SuppressWarnings("serial")
public class SteelRawAction extends BaseAction {
    
    protected SteelRaw steelRaw;
    protected SteelRawService steelRawService;
    protected UserInfoService userInfoService;
    protected SteelQualService steelQualService;
    
    public SteelRaw getSteelRaw() {
        return steelRaw;
    }
    
    public void setSteelRaw(SteelRaw steelRaw) {
        this.steelRaw = steelRaw;
    }
    
    public void setSteelRawService(SteelRawService steelRawService) {
        this.steelRawService = steelRawService;
    }
    
    public void setUserInfoService(UserInfoService userInfoService) {
        this.userInfoService = userInfoService;
    }
    
    public void setSteelQualService(SteelQualService steelQualService) {
        this.steelQualService = steelQualService;
    }
    
    public String execute() throws Exception {
        SteelRaw steelRaw1 = new SteelRaw();
        steelRaw1.setMapQualId(steelRaw.getMapQualId());
        steelRaw1.setSpecification(steelRaw.getSpecification());
        steelRaw1.setTensileIsQulified(steelRaw.getTensileIsQulified());
        steelRaw1.setTensileStan(steelRaw.getTensileStan());
        steelRaw1.setTensileValue(steelRaw.getTensileValue());
        steelRaw1.setBendIsQulified(steelRaw.getBendIsQulified());
        steelRaw1.setBendStan(steelRaw.getBendStan());
        steelRaw1.setBendValue(steelRaw.getBendValue());
        steelRaw1.setWOffsetIsQulified(steelRaw.getWOffsetIsQulified());
        steelRaw1.setWOffsetStan(steelRaw.getWOffsetStan());
        steelRaw1.setWOffsetValue(steelRaw.getWOffsetValue());
        steelRaw1.setReportId(steelRaw.getReportId());
        steelRaw1.setUrl(steelRaw.getUrl());
        steelRawService.saveSteelRaw(steelRaw1);
        return SUCCESS;
    }
    
    public void comboData() throws Exception {
        List listqual = steelQualService.getAll();
        Map request = (Map)ActionContext.getContext().get("request");
        request.put("listqual", listqual);
    }
}
