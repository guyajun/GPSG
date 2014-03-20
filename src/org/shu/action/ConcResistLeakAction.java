package org.shu.action;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.InputStream;
import java.io.OutputStream;

import org.shu.model.ConcResistLeak;
import org.shu.service.imp.ConcResistLeakService;
import org.tool.CommonParam;

import common.base.action.BaseAction;

@SuppressWarnings("serial")
public class ConcResistLeakAction extends BaseAction {
	protected ConcResistLeak concResistLeak;
	protected ConcResistLeakService concResistLeakService;
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

	public ConcResistLeak getConcResistLeak() {
		return concResistLeak;
	}

	public void setConcResistLeak(ConcResistLeak concResistLeak) {
		this.concResistLeak = concResistLeak;
	}

	public void setConcResistLeakService(
			ConcResistLeakService concResistLeakService) {
		this.concResistLeakService = concResistLeakService;
	}

	public String execute() throws Exception {
		CommonParam cp=new CommonParam();
		String uploadpath=cp.getString("Server_upload_path");
		String str=concResistLeak.getReportId();
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
		ConcResistLeak concResistLeak1 = new ConcResistLeak();				
		concResistLeak1.setReportId(concResistLeak.getReportId());
		concResistLeak1.setResistLeakIsQual(concResistLeak.getResistLeakIsQual());
		concResistLeak1.setResistLeakStan(concResistLeak.getResistLeakStan());		
		concResistLeak1.setDate(concResistLeak.getDate());
		concResistLeak1.setUrl(str);
		concResistLeakService.saveConcResistLeak(concResistLeak1);
		return SUCCESS;
	}

}
