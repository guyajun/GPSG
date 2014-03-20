package org.shu.action;

import java.util.ArrayList;
import java.util.Map;
import com.opensymphony.xwork2.ActionContext;
import common.base.action.BaseAction;

public class SteelRemainAction extends BaseAction{
//	private GpSteel gpSteel;	
//	private SteelRemainService steelRemainService;
//    	
//	public GpSteel getGpSteel() {
//		return gpSteel;
//	}
//
//	public void setGpSteel(GpSteel gpSteel) {
//		this.gpSteel = gpSteel;
//	}
//
//	public void setSteelRemainService(SteelRemainService steelRemainService) {
//		this.steelRemainService = steelRemainService;
//	}
//
//	public String readRemainSteel(){		
//		GpSteel gpSteel=steelRemainService.find();
//		 Map<String,GpSteel> request=(Map<String, GpSteel>) ActionContext.getContext().get("request");
//		 request.put("gpSteel", gpSteel);
//		 return SUCCESS;
//	 }
//	public String recalculateRemainSteel(){	
//		String gpType=request.getParameter("gpType");
//		String count1=request.getParameter("count");
//		int count=Integer.parseInt(count1);
//		 steelRemainService.recalculate(gpType,count);
//		 GpSteel gpSteel=steelRemainService.find();
//		 Map<String,GpSteel> request=(Map<String, GpSteel>) ActionContext.getContext().get("request");
//		 request.put("gpSteel", gpSteel);
//		 return SUCCESS;
//	 }
//	
//	
//	public String calculateGpCount(){	
//		GpSteel gpSteel=steelRemainService.find();
//		String gpType=request.getParameter("gpType");
//		GpSteel gpSteel22=steelRemainService.findByGpType(gpType);
//		ArrayList<String> list=new ArrayList<String>();
//		if(gpSteel22.getS6()!=0){
//			list.add((int) (gpSteel.getS6()/gpSteel22.getS6())+"");
//		}
//		if(gpSteel22.getS10()!=0){
//			list.add((int) (gpSteel.getS10()/gpSteel22.getS10())+"");
//		}
//		if(gpSteel22.getS12()!=0){
//			list.add((int) (gpSteel.getS12()/gpSteel22.getS12())+"");
//		}
//		if(gpSteel22.getS16()!=0){
//			list.add((int) (gpSteel.getS16()/gpSteel22.getS16())+"");
//		}
//		if(gpSteel22.getS18()!=0){
//			list.add((int) (gpSteel.getS18()/gpSteel22.getS18())+"");
//		}
//		if(gpSteel22.getS18hrb400()!=0){
//			list.add((int) (gpSteel.getS18hrb400()/gpSteel22.getS18hrb400())+"");
//		}
//		if(gpSteel22.getS20()!=0){
//			list.add((int) (gpSteel.getS20()/gpSteel22.getS20())+"");
//		}
//		if(gpSteel22.getS20hrb400()!=0){
//			list.add((int) (gpSteel.getS20hrb400()/gpSteel22.getS20hrb400())+"");
//		}
//		if(gpSteel22.getS22hrb400()!=0){
//			list.add((int) (gpSteel.getS22hrb400()/gpSteel22.getS22hrb400())+"");
//		}
//		if(gpSteel22.getS25hrb400()!=0){
//			list.add((int) (gpSteel.getS25hrb400()/gpSteel22.getS25hrb400())+"");
//		}
//		if(gpSteel22.getS28hrb400()!=0){
//			list.add((int) (gpSteel.getS28hrb400()/gpSteel22.getS28hrb400())+"");
//		}
//		
//		int min=100000;
//		for(String value:list){
//			int value1=Integer.parseInt(value);
//			if(value1<min){
//				min=value1;
//			}			
//		}
////		 Map<String,String> map=(Map<String, String>) ActionContext.getContext().get("request");		 
////		 map.put("min", min+"");
////		System.out.println(min+"");
//		Map request=(Map) ActionContext.getContext().get("request");
//		request.put("gpSteel", gpSteel);
//		request.put("min", min);
//		request.put("gpType", gpType);
//		
//		 return SUCCESS;
//	 }

}
