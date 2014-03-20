package org.shu.action;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.InputStream;
import java.io.OutputStream;

import org.tool.CommonParam;

import common.base.action.BaseAction;
@SuppressWarnings("serial")
public class UploadAction extends BaseAction{
	private static String fileName;
	private  File upload;      			//�ϴ����ļ����ݣ������Ƕ����List����
	private String uploadFileName;  			//�ļ���
	


	public static String getFileName() {
		return fileName;
	}

	public static void setFileName(String fileName) {
		UploadAction.fileName = fileName;
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
	
	public String execute() throws Exception {
		CommonParam cp=new CommonParam();
		String uploadpath=cp.getString("Server_upload_path");
		if(upload!=null){		
				InputStream is=new FileInputStream(upload);
				String str=request.getParameter("url");
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
		return SUCCESS;
	}
		
}
	