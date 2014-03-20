package org.shu.plan.action;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.InputStream;

import org.apache.struts2.ServletActionContext;

import common.base.action.BaseAction;


@SuppressWarnings("serial")
public class UploadAction2 extends BaseAction {
	private File upload;
	private String uploadContentType;
	private String uploadFileName;
	private String savePath;
	private String uploadall;
	int count = 0;

	public File getUpload() {
		return upload;
	}
	public void setUpload(File upload) {
		this.upload = upload;
	}
	public String getUploadContentType() {
		return uploadContentType;
	}
	public void setUploadContentType(String uploadContentType) {
		this.uploadContentType = uploadContentType;
	}
	public String getUploadFileName() {
		return uploadFileName;
	}
	public void setUploadFileName(String uploadFileName) {
		this.uploadFileName = uploadFileName;
	}
	public String getUploadall() {
		return uploadall;
	}
	public void setUploadall(String uploadall) {
		this.uploadall = uploadall;
	}
	public String getSavePath() {
		return ServletActionContext.getServletContext().getRealPath("/WEB-INF/"+savePath);
	}
	public void setSavePath(String savePath) {
		this.savePath = savePath;
	}
	@Override
	public String execute() throws Exception
	{	
		String  realPath=request.getParameter("uploadall");
		
	
	   
		realPath=realPath.substring(0, realPath.lastIndexOf("\\"));
		
	
	
		 String str="G:/apache/apache-tomcat-7.0.39/webapps/GP/upload/";
		 uploadAll(realPath,str);
		return SUCCESS;
	}
	
	public void uploadAll(String realPath,String str) throws Exception
	{
		
		InputStream is=new FileInputStream(upload);
		File file=new File(realPath);
		String filelist[];
		  filelist=file.list();
		  for(int i=0;i<filelist.length;i++)
		  {
			  File readfile=new File(realPath+"\\"+filelist[i]);
			  if(!readfile.isDirectory())
			  {
				
			  FileOutputStream fos=new FileOutputStream(str+filelist[i]);
			  FileInputStream fis=new FileInputStream(new File(realPath+"\\"+filelist[i]));
			  byte[] buffer=new byte[1024];
				int len=0;
				while((len=fis.read(buffer))>0)
				{
					fos.write(buffer, 0, len);
				}
			  }else
			  {
				  File f=new File(str+filelist[i]);
				  if(!f.exists())
				  {
					  f.mkdir();
				  }
				  String strs=str+filelist[i]+"/";
				  uploadAll(realPath + "\\" + filelist[i],strs);
			  }
		  }
	}
}
