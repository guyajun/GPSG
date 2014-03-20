//package org.shu.service.imp;
//
//import org.shu.dao.imp.SteelRemainDao;
//
//public class SteelRemainService{
//	private SteelRemainDao steelRemainDao;	
//	private SteelQualService steelQualService;
//	
//	public void setSteelQualService(SteelQualService steelQualService) {
//		this.steelQualService = steelQualService;
//	}
//
//	public void setSteelRemainDao(SteelRemainDao steelRemainDao) {
//		this.steelRemainDao = steelRemainDao;
//	}
////
//	public GpSteel find() {		
//			return steelRemainDao.find();
//	}
//
//	public GpSteel findByGpType(String gpType) {		
//		return steelRemainDao.findByGpType(gpType);
//	}
//	public void recalculate(String gpType,int count) {
//		GpSteel gpSteel2=findByGpType(gpType);
//		GpSteel gpSteel=find();
//		String beginTime=gpSteel.getDate();
//		if(gpSteel==null){
//			return;
//		}		
//		String today=new Date().toLocaleString().substring(0,new Date().toLocaleString().lastIndexOf(" "));
//		List<SteelQual> steelQuals= steelQualService.getBetween(beginTime,today);
//		Map<String,Double> map=new HashMap<String,Double>();
//		map.put("s6", gpSteel.getS6());
//		map.put("s10", gpSteel.getS10());
//		map.put("s12", gpSteel.getS12());
//		map.put("s16", gpSteel.getS16());
//		map.put("s18", gpSteel.getS18());
//		map.put("s18HRB400", gpSteel.getS18hrb400());
//		map.put("s20", gpSteel.getS20());
//		map.put("s20HRB400", gpSteel.getS20hrb400());
//		map.put("s22HRB400", gpSteel.getS22hrb400());
//		map.put("s25HRB400", gpSteel.getS25hrb400());
//		map.put("s28HRB400", gpSteel.getS28hrb400());		
//		
//		for(String key:map.keySet()){		
//			for(int i=0;i<steelQuals.size();i++){
//				SteelQual steelQual=steelQuals.get(i);	
////				Double amount=steelQual.getPurchaseAmount();
////				if(steelQual.getSpecification().equals(key)){
////					if(amount.equals(null)){
////						amount=0.0;						
////					}
////					if(map.get(key).equals(null)){
////						map.put(key, 0.0);						
////					}
////					map.put(key, map.get(key)+amount);		
////				}
//			}
//		}
//		GpSteel gpSteel1=new GpSteel();
//		 Map<String,String> request=(Map<String, String>) ActionContext.getContext().get("request");
//		gpSteel1.setGpType("remain");
//		BigDecimal   b1   =   new   BigDecimal(map.get("s6")-count*gpSteel2.getS6());  
//		double   f1   =   b1.setScale(2,   BigDecimal.ROUND_HALF_UP).doubleValue();
//		if(f1>=0){
//			gpSteel1.setS6(f1);
//		}
//		else{
//			 request.put("mess", "������Ĺ�Ƭ�������");
//			 return;
//		}
//		
//		BigDecimal   b2   =   new   BigDecimal(map.get("s10")-count*gpSteel2.getS10());  
//		double   f2   =   b2.setScale(2,   BigDecimal.ROUND_HALF_UP).doubleValue();
//		if(f2>=0){
//			gpSteel1.setS10(f2);
//		}
//		else{
//			request.put("mess", "������Ĺ�Ƭ�������");
//			return;
//		}
//		
//		
//		BigDecimal   b3   =   new   BigDecimal(map.get("s12")-count*gpSteel2.getS12());  
//		double   f3   =   b3.setScale(2,   BigDecimal.ROUND_HALF_UP).doubleValue();	
//		if(f3>=0){
//			gpSteel1.setS12(f3);
//		}
//		else{
//			request.put("mess", "������Ĺ�Ƭ�������");
//			return;
//		}
//		
//		BigDecimal   b4   =   new   BigDecimal(map.get("s16")-count*gpSteel2.getS16());  
//		double   f4  =   b4.setScale(2,   BigDecimal.ROUND_HALF_UP).doubleValue();	
//		if(f4>=0){
//			gpSteel1.setS16(f4);
//		}
//		else{
//			request.put("mess", "������Ĺ�Ƭ�������");
//			return;
//		}
//		
//	
//		
//		BigDecimal   b5   =   new   BigDecimal(map.get("s18")-count*gpSteel2.getS18());  
//		double   f5  =   b5.setScale(2,   BigDecimal.ROUND_HALF_UP).doubleValue();	
//		
//		if(f5>=0){
//			gpSteel1.setS18(f5);
//		}
//		else{
//			request.put("mess", "������Ĺ�Ƭ�������");
//			return;
//		}
//		
//		BigDecimal   b6   =   new   BigDecimal(map.get("s18HRB400")-count*gpSteel2.getS18hrb400());  
//		double   f6  =   b6.setScale(2,   BigDecimal.ROUND_HALF_UP).doubleValue();	
//		
//		if(f6>=0){
//			gpSteel1.setS18hrb400(f6);
//		}
//		else{
//			request.put("mess", "������Ĺ�Ƭ�������");
//			return;
//		}
//		
//		BigDecimal   b7   =   new   BigDecimal(map.get("s20")-count*gpSteel2.getS20());  
//		double   f7  =   b7.setScale(2,   BigDecimal.ROUND_HALF_UP).doubleValue();	
//		
//		if(f7>=0){
//			gpSteel1.setS20(f7);
//		}
//		else{
//			request.put("mess", "������Ĺ�Ƭ�������");
//			return;
//		}
//		
//		BigDecimal   b8   =   new   BigDecimal(map.get("s20HRB400")-count*gpSteel2.getS20hrb400());  
//		double   f8  =   b8.setScale(2,   BigDecimal.ROUND_HALF_UP).doubleValue();	
//		
//		if(f8>=0){
//			gpSteel1.setS20hrb400(f8);
//		}
//		else{
//			request.put("mess", "������Ĺ�Ƭ�������");
//			return;
//		}
//		
//		BigDecimal   b9   =   new   BigDecimal(map.get("s22HRB400")-count*gpSteel2.getS22hrb400());  
//		double   f9  =   b9.setScale(2,   BigDecimal.ROUND_HALF_UP).doubleValue();	
//		
//		if(f9>=0){
//			gpSteel1.setS22hrb400(f9);
//		}
//		else{
//			request.put("mess", "������Ĺ�Ƭ�������");
//			return;
//		}
//		
//		BigDecimal   b10   =   new   BigDecimal(map.get("s25HRB400")-count*gpSteel2.getS25hrb400());  
//		double   f10  =   b10.setScale(2,   BigDecimal.ROUND_HALF_UP).doubleValue();	
//		
//		if(f10>=0){
//			gpSteel1.setS25hrb400(f10);
//		}
//		else{
//			request.put("mess", "������Ĺ�Ƭ�������");
//			return;
//		}
//		
//		BigDecimal   b11   =   new   BigDecimal(map.get("s28HRB400")-count*gpSteel2.getS28hrb400());  
//		double   f11  =   b11.setScale(2,   BigDecimal.ROUND_HALF_UP).doubleValue();	
//		
//		if(f11>=0){
//			gpSteel1.setS28hrb400(f11);	
//		}
//		else{
//			request.put("mess", "������Ĺ�Ƭ�������");
//			return;
//		}
//		gpSteel1.setDate(today);
//		
//		
//		steelRemainDao.saveGpSteel(gpSteel1);
//	}
	
//}

