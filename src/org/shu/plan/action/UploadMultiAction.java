package org.shu.plan.action;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.InputStream;
import java.io.OutputStream;
import java.util.List;

import common.base.action.BaseAction;
@SuppressWarnings("serial")
public class UploadMultiAction extends BaseAction{
	private List<File> upload;              //上传的文件内容，由于是多个,用List集合	
	private  List<String> uploadFileName; 	//文件名
	private String url;
	
	public String getUrl() {
		return url;
	}


	public void setUrl(String url) {
		this.url = url;
	}


	public List<File> getUpload() {
		return upload;
	}


	public void setUpload(List<File> upload) {
		this.upload = upload;
	}


	public List<String> getUploadFileName() {
		return uploadFileName;
	}


	public void setUploadFileName(List<String> uploadFileName) {
		this.uploadFileName = uploadFileName;
	}


	public String execute() throws Exception {	
		if(upload!=null){	
			for(int i=0;i<upload.size();i++)
			{
				String str=request.getParameter("url");
				
				InputStream is=new FileInputStream(upload.get(i));
				OutputStream os=
						new FileOutputStream("G:/apache/apache-tomcat-7.0.39/webapps/GP/upload/"+getUploadFileName().get(i));
				byte buffer[]=new byte[1024];
				int count=0;
				while((count=is.read(buffer))>0){
					os.write(buffer,0,count);			
				}
				os.close();
				is.close();
		}
		}
		return SUCCESS;
	}
		
}
	