package org.shu.action;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.InputStream;
import java.io.OutputStream;
import org.shu.model.SteelQual;
import org.shu.service.imp.SteelQualService;
import org.tool.CommonParam;

import common.base.action.BaseAction;

@SuppressWarnings("serial")
public class ManufacturerAction extends BaseAction{
//	protected Manufacturer manufacturer;
//	protected ManufacturerService manufacturerService;	
//	private String fileName;
//	private  File upload;      			//�ϴ����ļ����ݣ������Ƕ����List����
//	private String uploadFileName;  			//�ļ���
//	
//	public String getFileName() {
//		return fileName;
//	}
//
//	public void setFileName(String fileName) {
//		this.fileName = fileName;
//	}
//
//	public File getUpload() {
//		return upload;
//	}
//
//	public void setUpload(File upload) {
//		this.upload = upload;
//	}
//
//	public String getUploadFileName() {
//		return uploadFileName;
//	}
//
//	public void setUploadFileName(String uploadFileName) {
//		this.uploadFileName = uploadFileName;
//	}
//
//
//	public Manufacturer getManufacturer() {
//		return manufacturer;
//	}
//
//	public void setManufacturer(Manufacturer manufacturer) {
//		this.manufacturer = manufacturer;
//	}
//
//	public ManufacturerService getManufacturerService() {
//		return manufacturerService;
//	}
//
//	public void setManufacturerService(ManufacturerService manufacturerService) {
//		this.manufacturerService = manufacturerService;
//	}
//
//	public String execute() throws Exception {	
//		CommonParam cp=new CommonParam();
//		String uploadpath=cp.getString("Server_upload_path");
//		String str="";
//		if(upload!=null){		
//				InputStream is=new FileInputStream(upload);
//				
//				String str2=getUploadFileName();
////				String[] names = str2.split("\\.");	
////				str+="."+names[1];
////				setFileName(str);
//				str=uploadpath+"\\manufacturer\\"+str2;
//				OutputStream os=
//						new FileOutputStream(str);
//				byte buffer[]=new byte[1024];
//				int count=0;
//				while((count=is.read(buffer))>0){
//					os.write(buffer,0,count);			
//				}
//				os.close();
//				is.close();
//	
//		}
//		Manufacturer manu  = new Manufacturer();
//		manu.setName(manufacturer.getName());
//		manu.setDate(manufacturer.getDate());
//		manu.setUrl("\\manufacturer\\"+getUploadFileName());
//		manufacturerService.saveManufacturer(manu);	
//		return SUCCESS;
//	}
//
//public String manufacturerDel()
//{
//	int id=manufacturer.getId();
//	if(id>0)
//	{
//		manufacturerService.del(id);
//		return SUCCESS;
//	}
//	else
//		return ERROR;
//	
//}
	

}
