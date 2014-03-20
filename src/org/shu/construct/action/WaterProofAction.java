package org.shu.construct.action;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.InputStream;
import java.io.OutputStream;
import org.shu.construct.service.WaterProofService;
import org.shu.model.WaterProof;
import org.tool.CommonParam;
import common.base.action.BaseAction;

@SuppressWarnings("serial")
public class WaterProofAction extends BaseAction{
	protected WaterProof waterProof;
	protected WaterProofService waterProofService;	
	private String fileName;
	private  File upload;      			//上传的文件内容，由于是多个用List集合
	private String uploadFileName;  			//文件名
	
	public String getFileName() {
		return fileName;
	}
	public void setFileName(String fileName) {
		this.fileName = fileName;
	}
	public File getUpload() {
		return upload;
	}
	public void setUpload(File upload) {
		this.upload = upload;
	}
	public String getUploadFileName() {
		return uploadFileName;
	}
	public void setUploadFileName(String uploadFileName) {
		this.uploadFileName = uploadFileName;
	}
	public WaterProof getWaterProof() {
		return waterProof;
	}
	public void setWaterProof(WaterProof waterProof) {
		this.waterProof = waterProof;
	}
	public void setWaterProofService(WaterProofService waterProofService) {
		this.waterProofService = waterProofService;
	}

	public String SAVEURL1() throws Exception {	
		CommonParam cp=new CommonParam();
		String uploadpath=cp.getString("Construct_upload_path");
		String str=waterProof.getReportId();
		if(upload!=null){		
				InputStream is=new FileInputStream(upload);
				
				String str2=getUploadFileName();
				String[] names = str2.split("\\.");	
				str+="."+names[1];
				setFileName(str);
				OutputStream os=
						new FileOutputStream(uploadpath+str);
				byte buffer[]=new byte[1024];
				int count=0;
				while((count=is.read(buffer))>0){
					os.write(buffer,0,count);			
				}
				os.close();
				is.close();
	
		}
		WaterProof waterProof1 = new WaterProof();
		waterProof1.setReportId(waterProof.getReportId());
		waterProof1.setUrl1(str);
		waterProofService.saveWaterProof(waterProof1);	
		return SUCCESS;
	}
	public String SAVEURL2() throws Exception {	
		CommonParam cp=new CommonParam();
		String uploadpath=cp.getString("Construct_upload_path");
		String str=waterProof.getReportId();
		if(upload!=null){		
				InputStream is=new FileInputStream(upload);
				
				String str2=getUploadFileName();
				String[] names = str2.split("\\.");	
				str+="."+names[1];
				setFileName(str);
				OutputStream os=
						new FileOutputStream(uploadpath+str);
				byte buffer[]=new byte[1024];
				int count=0;
				while((count=is.read(buffer))>0){
					os.write(buffer,0,count);			
				}
				os.close();
				is.close();
	
		}
		WaterProof waterProof1 = new WaterProof();
		waterProof1.setReportId(waterProof.getReportId());
		waterProof1.setUrl2(str);
		waterProofService.saveWaterProof(waterProof1);	
		return SUCCESS;
	}
	public String SAVEURL3() throws Exception {	
		CommonParam cp=new CommonParam();
		String uploadpath=cp.getString("Construct_upload_path");
		String str=waterProof.getReportId();
		if(upload!=null){		
				InputStream is=new FileInputStream(upload);
				
				String str2=getUploadFileName();
				String[] names = str2.split("\\.");	
				str+="."+names[1];
				setFileName(str);
				OutputStream os=
						new FileOutputStream(uploadpath+str);
				byte buffer[]=new byte[1024];
				int count=0;
				while((count=is.read(buffer))>0){
					os.write(buffer,0,count);			
				}
				os.close();
				is.close();
	
		}
		WaterProof waterProof1 = new WaterProof();
		waterProof1.setReportId(waterProof.getReportId());
		waterProof1.setUrl3(str);
		waterProofService.saveWaterProof(waterProof1);	
		return SUCCESS;
	}

	

}
