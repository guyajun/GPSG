package org.shu.action;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.InputStream;
import java.io.OutputStream;
import java.util.List;
import java.util.Map;
import org.shu.model.SteelQual;
import org.shu.service.imp.SteelQualService;
import org.tool.CommonParam;

import com.opensymphony.xwork2.ActionContext;

import common.base.action.BaseAction;

@SuppressWarnings("serial")
public class SteelQualAction extends BaseAction{
	protected SteelQual steelQual;
	protected SteelQualService steelQualService;
//	protected ManufacturerService manufacturerService;
//	
//    public SteelQual getSteelQual() {
//        return steelQual;
//    }
//    
//    public void setSteelQual(SteelQual steelQual) {
//        this.steelQual = steelQual;
//    }
//    
//    public void setSteelQualService(SteelQualService steelQualService) {
//        this.steelQualService = steelQualService;
//    }
//    
//    public void setManufacturerService(ManufacturerService manufacturerService) {
//        this.manufacturerService = manufacturerService;
//    }
//
//    public String execute() throws Exception {
//		SteelQual steelQual1 = new SteelQual();
//		steelQual1.setManufacturer(steelQual.getManufacturer());
//		steelQual1.setPurchaseAmount(steelQual.getPurchaseAmount());
//		steelQual1.setPurchaseTime(steelQual.getPurchaseTime());
//		steelQual1.setReportId(steelQual.getReportId());
//		steelQual1.setUseBeginTime(steelQual.getUseBeginTime());	
//		steelQual1.setUrl(steelQual.getUrl());
//		steelQualService.saveSteelQual(steelQual1);	
//		return SUCCESS;
//	}
//	
//	public void steelQualData() throws Exception {
//		List listqual=manufacturerService.getAll();
//		Map request = (Map) ActionContext.getContext().get("request");	
//		request.put("qualdata", listqual);	
//	}
//
//
//	

}
